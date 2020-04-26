package com.timecraft.easysmelting;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        new ItemLoader();
    }

    public void init(FMLInitializationEvent event)
    {
        new RecipeLoader();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
