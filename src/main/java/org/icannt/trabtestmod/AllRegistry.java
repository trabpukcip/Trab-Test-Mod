package org.icannt.trabtestmod;

import com.google.common.base.Preconditions;

import mekanism.api.MekanismAPI;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.LoaderState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

@GameRegistry.ObjectHolder(TrabTestMod.MOD_ID)
public class AllRegistry {
	
	static int counter = 0;
	
    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {

    	public static void logIt(String regEvent, LoaderState loaderState) {
    		TrabTestMod.LOG.info("Registry Event " + counter++ + ", " + regEvent + "; FML Event " + loaderState);
    	}

    	@SubscribeEvent
        public static void registerIRecipe(final RegistryEvent.Register<IRecipe> event)
        {
    		RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
    		logIt("IRecipe", Loader.instance().getLoaderState());
        	try {
        		Preconditions.checkState(Loader.instance().getLoaderState().ordinal() < LoaderState.INITIALIZATION.ordinal(), "Recipes should be registered before Init. Try net.minecraftforge.event.RegistryEvent.Register<IRecipe>");
        	} catch (Exception e1) {
        		TrabTestMod.LOG.error("Exception thrown at registry event IRecipe, FML Event " + Loader.instance().getLoaderState());
        	}
        }
    	
    	@SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event)
        {
    		logIt("Block", Loader.instance().getLoaderState());
        }
    	
    	@SubscribeEvent
        public static void registerItem(final RegistryEvent.Register<Item> event)
        {
    		logIt("Item", Loader.instance().getLoaderState());
        }
    	
    	@SubscribeEvent
        public static void registerEntityEntry(final RegistryEvent.Register<EntityEntry> event)
        {
    		logIt("EntityEntry", Loader.instance().getLoaderState());
        }
    	
    	@SubscribeEvent
        public static void registerBiome(final RegistryEvent.Register<Biome> event)
        {
    		logIt("Biome", Loader.instance().getLoaderState());
        }
    	
    	@SubscribeEvent
        public static void registerEnchantment(final RegistryEvent.Register<Enchantment> event)
        {
    		logIt("Enchantment", Loader.instance().getLoaderState());
        }

    	@SubscribeEvent
        public static void registerPotion(final RegistryEvent.Register<Potion> event)
        {
    		logIt("Potion", Loader.instance().getLoaderState());
        }

    	@SubscribeEvent
        public static void registerVillagerProfession(final RegistryEvent.Register<VillagerProfession> event)
        {
    		logIt("VillagerProfession", Loader.instance().getLoaderState());
    		MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(new ItemStack(Blocks.END_STONE, 1), new ItemStack(Items.BEEF, 4));
        }

    	@SubscribeEvent
        public static void registerSoundEvent(final RegistryEvent.Register<SoundEvent> event)
        {
    		logIt("SoundEvent", Loader.instance().getLoaderState());
        }
    	
    	
    }
    
}
