package com.rustmod;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = RustMod.MOD_ID,
        name = RustMod.NAME,
        version = RustMod.VERSION,
        acceptedMinecraftVersions = "[1.12.2]"
)
public class RustMod {

    public static final String MOD_ID = "rustinventory";
    public static final String NAME = "Rust Inventory";
    public static final String VERSION = "0.1.0";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("[Rust Inventory] preInit: мод загружается");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("[Rust Inventory] init: мод успешно загружен");
    }
}
