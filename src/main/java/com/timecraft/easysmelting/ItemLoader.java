package com.timecraft.easysmelting;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ItemLoader {
    public static final Item littleCoal = new Item().setRegistryName("littlecoal").setUnlocalizedName("easySmelting_littleCoal").setCreativeTab(CreativeTabs.MISC);


    @SubscribeEvent
    public static void RegistryItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(littleCoal);
    }

    @SideOnly(value= Side.CLIENT)
    @SubscribeEvent
    public static void RegistryItemModel(ModelRegistryEvent event) {
        ModelResourceLocation model = new ModelResourceLocation(littleCoal.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(littleCoal, 0, model);
    }
}
