package com.exampleaddon;

import com.exampleaddon.commands.ExampleCommand;
import com.exampleaddon.config.ExampleConfig;
import com.exampleaddon.hud.ExampleHUD;
import fr.alexdoru.configlib.api.IConfigHandler;
import fr.alexdoru.mwe.api.IMWEAddon;
import fr.alexdoru.mwe.api.MWEApi;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
import java.net.URI;
import java.net.URL;

public class ExampleAddon implements IMWEAddon {

    private IConfigHandler configHandler;

    @Override
    public String name() {
        return "exampleaddon";
    }

    @Override
    public String targetVersion() {
        return "4.4";// TODO replace with the minimal version of MWE required for your plugin to work
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        // registering your config like this will add to the existing MWE config menu
        MWEApi.Config.registerConfig(ExampleConfig.class);

        // OR
        // registering your config like this will give you a dedicated menu for your addon

        // TODO change the name of the file, if all addons use the same it won't work well...
        //final File configFile = new File(event.getModConfigurationDirectory(), "addon.cfg");
        //this.configHandler = ConfigLib.newConfigHandler(configFile, "addonname");
        //this.configHandler.registerConfig(ExampleConfig.class);
        //// this will automatically create the command /addon that will open the config menu
        //this.configHandler.registerConfigCommand("addon");

        // use the auto-updater if you want your addon to be auto updated from GitHub
        // this.startAutoUpdater();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new ExampleCommand());

        // if you use MWE config
        MWEApi.Hud.registerHUD(new ExampleHUD());

        // if you use your own config
        //this.configHandler.getRendererManager().registerHUDRenderer(new ExampleHUD());
    }

    @Override
    public void postInit(FMLPostInitializationEvent fmlPostInitializationEvent) {

    }

    private void startAutoUpdater() {
        try {
            final URL location = ExampleAddon.class.getProtectionDomain().getCodeSource().getLocation();
            final String raw = location.toString();
            final String path = raw.substring(4, raw.indexOf("!"));
            final File jarFile = new File(new URI(path));
            new ExampleUpdater(jarFile).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
