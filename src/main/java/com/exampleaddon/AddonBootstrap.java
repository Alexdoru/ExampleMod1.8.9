package com.exampleaddon;

import fr.alexdoru.mwe.api.MWEApi;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.8.9")
public class AddonBootstrap implements IFMLLoadingPlugin {

    public AddonBootstrap() {
        // TODO register your addon main class here
        MWEApi.registerAddon("com.exampleaddon.ExampleAddon");

        // TODO register your asm transformers here if you have any
        //MWEApi.Asm.registerTransformer("com.exampleaddon.asm.ExampleTransformer");
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
