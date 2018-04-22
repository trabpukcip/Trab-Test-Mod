package org.icannt.trabtestmod;

import mekanism.api.MekanismAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(TrabTestMod.MOD_ID)
public class RecipeRegistry {
	
    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {

    	@SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<IRecipe> event)
        {
    		final IForgeRegistry<IRecipe> registry = event.getRegistry();
        	TrabTestMod.LOG.info("Loading Recipes");
        	MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
        	//RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
        }
    }
    
}
