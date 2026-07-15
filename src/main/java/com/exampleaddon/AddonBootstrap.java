package com.exampleaddon;

import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.8.9")
public class AddonBootstrap implements IFMLLoadingPlugin {

    public AddonBootstrap() {
        // TODO register your addon main class here
        this.registerAddon("com.exampleaddon.ExampleAddon");

        // TODO register your asm transformers here if you have any
        //this.registerTransformer(
        //        "com.exampleaddon.asm.ExampleTransformer1",
        //        "com.exampleaddon.asm.ExampleTransformer2"
        //);
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

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void registerAddon(String classname) {
        Object o = Launch.blackboard.computeIfAbsent("mwe.addons", (k) -> new ArrayList<>());
        if (o instanceof ArrayList) {
            ((ArrayList) o).add(classname);
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void registerTransformer(String... classnames) {
        Object o = Launch.blackboard.computeIfAbsent("mwe.transformers", (k) -> new ArrayList<>());
        if (o instanceof ArrayList) {
            ((ArrayList) o).addAll(Arrays.asList(classnames));
        }
    }
}
