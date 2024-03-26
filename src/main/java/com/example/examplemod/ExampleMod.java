package com.example.examplemod;

import com.example.examplemod.commands.ExampleCommand;
import com.example.examplemod.config.ConfigHandler;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = ExampleMod.MODID,
        name = ExampleMod.MODNAME,
        version = ExampleMod.VERSION)
public class ExampleMod { // select ExampleMod and hit shift+F6 to rename it

    public static final String MODID = "examplemod";      // the id of your mod, it should never change, it is used by forge and servers to identify your mods
    public static final String MODNAME = "examplemodname";// the name of your mod
    public static final String VERSION = "1.0";           // the current version of your mod

    // this method is one entry point of you mod
    // it is called by forge when minecraft is starting
    // it is called before the other methods below
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // loads the config file from the disk
        ConfigHandler.loadConfig(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new ExampleCommand()); // register your commands here
    }
}
