package com.timecraft.easysmelting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;
import static com.timecraft.easysmelting.EasySmelting.logger;

import static com.timecraft.easysmelting.ItemLoader.littleCoal;

public class RecipeEasySmelting extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe{

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        boolean hasCoal = false;
        boolean notOther = true;
        boolean hasRecipe = false;
        for(int i=0;i<inv.getSizeInventory();i++){
            if(inv.getStackInSlot(i)==null||inv.getStackInSlot(i).isEmpty()){
                logger.info(i+"isNull");
                continue;
            }
            if(FurnaceRecipes.instance().getSmeltingResult(inv.getStackInSlot(i)).isEmpty()){
                if(!inv.getStackInSlot(i).getItem().equals(littleCoal)){
                    notOther=false;
                    logger.info(i+"isOther");
                }
                else if(hasCoal){
                    notOther=false;
                    logger.info(i+"moreCoal");
                }
                else{
                    hasCoal=true;
                    logger.info(i+"hasCoal");
                }
            }
            else{
                if(hasRecipe){
                    notOther=false;
                    logger.info(i+"moreRecipe");
                }
                else{
                    hasRecipe=true;
                    logger.info(i+"hasRecipe");
                }
            }
        }
        return hasCoal&&notOther&&hasRecipe;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        for(int i=0;i<inv.getSizeInventory();i++){
            if(inv.getStackInSlot(i)==null||inv.getStackInSlot(i).isEmpty()){
                continue;
            }
            if(!inv.getStackInSlot(i).getItem().equals(littleCoal)){
                ItemStack stack = FurnaceRecipes.instance().getSmeltingResult(inv.getStackInSlot(i));
                return new ItemStack(stack.getItem(),1,stack.getMetadata());
            }
        }
        return null;
    }

    @Override
    public boolean canFit(int width, int height) {
        return width*height>=2;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return ItemStack.EMPTY;
    }
}
