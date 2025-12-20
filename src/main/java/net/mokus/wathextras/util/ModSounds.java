package net.mokus.wathextras.util;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.mokus.wathextras.WathExtras;

public class ModSounds {


    public static final SoundEvent WILLO_PLUSH = registerSound("willo_plush");
    public static final SoundEvent PICKLE_PLUSH = registerSound("pickle_plush");
    public static final SoundEvent VERID__PLUSH = registerSound("verid__plush");
    public static final SoundEvent DOOGEY_PLUSH = registerSound("doogey_plush");
    public static final SoundEvent DAVIDANDROCKET_PLUSH = registerSound("davidandrocket_plush");
    public static final SoundEvent DUCKAMOLY_PLUSH = registerSound("duckamoly_plush");
    public static final SoundEvent INDIGO_PLUSH = registerSound("indigo_plush");
    public static final SoundEvent SQUID_PLUSH = registerSound("squid_plush");
    public static final SoundEvent NORA_PLUSH = registerSound("nora_plush");
    public static final SoundEvent PENCIL_PLUSH = registerSound("pencil_plush");
    public static final SoundEvent SERVICE_BELL = registerSound("service_bell");

    public static final SoundEvent DEFAULT_PLUSH = registerSound("plush_squish");

    private static SoundEvent registerSound(String name){
        Identifier id = Identifier.of(WathExtras.MOD_ID,name);
        return Registry.register(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }

    public static void init(){

    }
}
