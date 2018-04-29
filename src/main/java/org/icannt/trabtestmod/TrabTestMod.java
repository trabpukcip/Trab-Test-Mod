package org.icannt.trabtestmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.LoaderState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 08/04/18.
 */

@Mod(modid = TrabTestMod.MOD_ID,
	name = TrabTestMod.MOD_NAME,
	version = TrabTestMod.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies = "required-after:forge@[14.23.2.2611,);before:mekanism")
public class TrabTestMod {

    public static final String MOD_ID = "trabtestmod";
    public static final String MOD_NAME = "Trab Test Mod";
    public static final String VERSION = "1.12.2-1.0";
    
    @Mod.Instance(MOD_ID)
    public static TrabTestMod instance;
    
    public static final Logger LOG = LogManager.getLogger(MOD_NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	LOG.info("FML Event " + Loader.instance().getLoaderState());
    	try {
    		Preconditions.checkState(Loader.instance().getLoaderState().ordinal() < LoaderState.INITIALIZATION.ordinal(), "Recipes should be registered before Init. Try net.minecraftforge.event.RegistryEvent.Register<IRecipe>");
    	} catch (Exception e1) {
    		LOG.error("Exception thrown at FML Event " + Loader.instance().getLoaderState());
    	}
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	LOG.info("FML Event " + Loader.instance().getLoaderState());
    	try {
    		Preconditions.checkState(Loader.instance().getLoaderState().ordinal() < LoaderState.INITIALIZATION.ordinal(), "Recipes should be registered before Init. Try net.minecraftforge.event.RegistryEvent.Register<IRecipe>");
    	} catch (Exception e1) {
    		LOG.error("Exception thrown at FML Event " + Loader.instance().getLoaderState());
    	}
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	LOG.info("FML Event " + Loader.instance().getLoaderState());
    	try {
    		Preconditions.checkState(Loader.instance().getLoaderState().ordinal() < LoaderState.INITIALIZATION.ordinal(), "Recipes should be registered before Init. Try net.minecraftforge.event.RegistryEvent.Register<IRecipe>");
    	} catch (Exception e1) {
    		LOG.error("Exception thrown at FML Event " + Loader.instance().getLoaderState());
    	}
    }
}