package com.example.examplemod.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    private static Configuration config;

    public static boolean exampleBooleanSetting;
    public static String exampleStringSetting;
    public static double exampleDoubleSetting;

    // reads the config file and loads the values from
    // the config into the fields exampleBooleanSetting exampleStringSetting exampleDoubleSetting
    public static void loadConfig(File file) {
        config = new Configuration(file);
        config.load();
        exampleBooleanSetting = config.get("ExampleCategoryName", "exampleBooleanSetting", true, "This is an example boolean setting").getBoolean();
        exampleStringSetting = config.get("ExampleCategoryName", "exampleStringSetting", "Hello!", "This is an example String setting").getString();
        exampleDoubleSetting = config.get("ExampleCategoryName", "exampleDoubleSetting", 10d, "This is an example double setting").getDouble();
    }

    // you want to call the saveConfig() when you change the values of the fields via code
    // and want to have the changes saved to the config file
    public static void saveConfig() {
        config.get("ExampleCategoryName", "exampleBooleanSetting", true, "This is an example boolean setting").setValue(exampleBooleanSetting);
        config.get("ExampleCategoryName", "exampleStringSetting", "Hello!", "This is an example String setting").setValue(exampleStringSetting);
        config.get("ExampleCategoryName", "exampleDoubleSetting", 10d, "This is an example double setting").setValue(exampleDoubleSetting);
        if (config.hasChanged()) {
            config.save();
        }
    }

}
