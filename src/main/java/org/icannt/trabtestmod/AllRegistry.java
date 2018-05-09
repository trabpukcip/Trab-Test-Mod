package org.icannt.trabtestmod;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(TrabTestMod.MOD_ID)
public class AllRegistry {
	
	static int counter = 0;
	
    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {

    	public static void testOreDict(String event) {
    		TrabTestMod.LOG.info("Event " + counter++ + ", " + event + ": " + OreDictionary.getOres("oreArdite"));
    	}

    	@SubscribeEvent
        public static void registerIRecipe(final RegistryEvent.Register<IRecipe> event)
        {
    		testOreDict("IRecipe");
        }
    	
    	@SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event)
        {
    		testOreDict("Block");
        }
    	
    	@SubscribeEvent
        public static void registerItem(final RegistryEvent.Register<Item> event)
        {
    		testOreDict("Item");
        }
    	
    	@SubscribeEvent
        public static void registerEntityEntry(final RegistryEvent.Register<EntityEntry> event)
        {
    		testOreDict("EntityEntry");
        }
    	
    	@SubscribeEvent
        public static void registerBiome(final RegistryEvent.Register<Biome> event)
        {
    		testOreDict("Biome");
        }
    	
    	@SubscribeEvent
        public static void registerEnchantment(final RegistryEvent.Register<Enchantment> event)
        {
    		testOreDict("Enchantment");
        }

    	@SubscribeEvent
        public static void registerPotion(final RegistryEvent.Register<Potion> event)
        {
    		testOreDict("Potion");
        }

    	@SubscribeEvent
        public static void registerVillagerProfession(final RegistryEvent.Register<VillagerProfession> event)
        {
    		testOreDict("VillagerProfession");
        }

    	@SubscribeEvent
        public static void registerSoundEvent(final RegistryEvent.Register<SoundEvent> event)
        {
    		testOreDict("SoundEvent");
        }
    	
    	
    }
    
}
