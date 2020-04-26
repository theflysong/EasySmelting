package com.timecraft.easysmelting;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EasySmelting.MODID,name = EasySmelting.NAME,
        version = EasySmelting.VERSION,acceptedMinecraftVersions = "[1.12,1.12.2]")
public class EasySmelting {
    public static final String MODID="easysmelting";
    public static final String NAME="EasySmelting";
    public static final String VERSION = "1.0.0";
    public static Logger logger;

    @Mod.Instance(EasySmelting.MODID)
    public static EasySmelting instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
