package net.mokus.tmmore.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class WallPanelBlock extends Block {
    public static final EnumProperty<PartType> PART = EnumProperty.of("part", PartType.class);


    public WallPanelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(PART, PartType.SINGLE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PART);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(PART, getPartType(ctx.getWorld(), ctx.getBlockPos()));
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP || direction == Direction.DOWN) {
            return state.with(PART, getPartType(world, pos));
        }

        return state;
    }

    private PartType getPartType(WorldAccess world, BlockPos pos) {
        BlockPos abovePos = pos.up();
        BlockPos belowPos = pos.down();

        BlockState aboveState = world.getBlockState(abovePos);
        BlockState belowState = world.getBlockState(belowPos);

        boolean hasAbove = aboveState.isOf(this);
        boolean hasBelow = belowState.isOf(this);

        return switch ((hasAbove ? 2 : 0) + (hasBelow ? 1 : 0)) {
            case 3 -> PartType.MIDDLE;
            case 1 -> PartType.TOP;
            case 2 -> PartType.BOTTOM;
            default -> PartType.SINGLE;
        };
    }

    public enum PartType implements StringIdentifiable {
        SINGLE("single"),
        TOP("top"),
        MIDDLE("middle"),
        BOTTOM("bottom"),
        BOX("box");

        private final String name;

        PartType(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }
    }
}
