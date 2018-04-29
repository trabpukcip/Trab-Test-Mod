package org.icannt.trabtestmod;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

//@GameRegistry.ObjectHolder(TrabTestMod.MOD_ID)
public class RecipeRegistry {
	
    //@Mod.EventBusSubscriber
    public static class RegistrationHandler
    {

    	//@SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<IRecipe> event)
        {
    		//final IForgeRegistry<IRecipe> registry = event.getRegistry();
        	//MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
        	//RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
        }
    }
    
}
