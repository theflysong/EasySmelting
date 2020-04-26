package com.timecraft.easysmelting;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RecipeLoader {
    @SubscribeEvent
    public static void RecipeRegistry(RegistryEvent.Register<IRecipe> event){
        event.getRegistry().registerAll(new RecipeEasySmelting());
    }
}
