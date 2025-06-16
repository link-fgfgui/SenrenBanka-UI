package com.img;

import com.img.init.InitSounds;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(YuZuUI.MODID)
public class YuZuUI
{
    public static final String MODID = "yuzu";
    public static final Logger LOGGER = LogUtils.getLogger();

    public YuZuUI(IEventBus modBus) {
        InitSounds.SOUND_EVENTS.register(modBus);
    }
}
