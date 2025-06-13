package com.img.init;

import com.img.YuZuUI;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

/**
 * @author : IMG
 * @create : 2024/10/25
 */
public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, YuZuUI.MODID);
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_MUSIC = register("yuzu_title_music");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_ON = register("yuzu_title_button_on");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_CLICK = register("yuzu_title_button_click");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_SELECT_WORLD = register("yuzu_title_button_select_world");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_OPTIONS = register("yuzu_title_button_options");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_QUIT_GAME = register("yuzu_title_button_quit_game");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_SENREN = register("yuzu_title_senren");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_REALMS = register("yuzu_title_button_realms");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_MOD_LIST = register("yuzu_title_button_mod_list");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_SINGLEPLAYER = register("yuzu_title_button_singleplayer");
    public static DeferredHolder<SoundEvent, SoundEvent> YUZU_TITLE_BUTTON_MUTIPLAYER = register("yuzu_title_button_mutiplayer");

    public static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(YuZuUI.MODID, name)));
    }
}
