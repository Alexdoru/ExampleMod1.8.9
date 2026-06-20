package com.exampleaddon.config;

import fr.alexdoru.configlib.api.ConfigProperty;
import fr.alexdoru.configlib.api.RendererPosition;

public class ExampleConfig {

    @ConfigProperty(
            category = "Addon",
            name = "Position Example HUD")
    public static final RendererPosition exampleGuiPos = new RendererPosition(true, 0.5, 0.5);

    @ConfigProperty(
            category = "Addon",
            name = "Example switch",
            comment = "Hello world!")
    public static boolean exampleConfigBoolean;

}
