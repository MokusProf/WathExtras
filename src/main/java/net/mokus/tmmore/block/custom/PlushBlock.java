package net.mokus.tmmore.block.custom;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PlushBlock extends HorizontalFacingBlock implements Equipment {
    protected static final MapCodec<SoundEvent> SOUND_EVENT_CODEC = Registries.SOUND_EVENT
            .getCodec()
            .comapFlatMap(
                    soundType -> soundType instanceof SoundEvent SoundType
                            ? DataResult.success(SoundType)
                            : DataResult.error(() -> "Not a SoundEvent: " + soundType),
                    soundType -> soundType
            )
            .fieldOf("sound_options");
    public static final MapCodec<PlushBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(SOUND_EVENT_CODEC.forGetter(block -> block.sound), createSettingsCodec()).apply(instance, PlushBlock::new)
    );

    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0,0.0,3.0,13.0,16.0,13.0);
    protected final SoundEvent sound;

    public PlushBlock(SoundEvent sound,Settings settings) {
        super(settings);
        this.sound = sound;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(FACING);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            world.playSound(
                    player,
                    pos.getX(),
                    pos.getY(),
                    pos.getZ(),
                    this.sound, SoundCategory.BLOCKS,
                    1.0f,1.0f
            );
        return ActionResult.success(world.isClient);
    }
}
