package org.icannt.trabtestmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.icannt.trabtestmod.AllRegistry.RegistrationHandler;

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
	dependencies = "required-after:forge@[14.23.2.2611,);after:tconstruct")

public class TrabTestMod {

    public static final String MOD_ID = "trabtestmod";
    public static final String MOD_NAME = "Trab Test Mod";
    public static final String VERSION = "1.12.2-1.0";
    
    @Mod.Instance(MOD_ID)
    public static TrabTestMod instance;
    
    public static final Logger LOG = LogManager.getLogger(MOD_NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	RegistrationHandler.testOreDict("PreInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	RegistrationHandler.testOreDict("Init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	RegistrationHandler.testOreDict("PostInit");
    }
}