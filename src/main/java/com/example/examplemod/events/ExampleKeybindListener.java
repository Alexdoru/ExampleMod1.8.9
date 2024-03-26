package com.example.examplemod.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class ExampleKeybindListener {

    private final KeyBinding exampleKeybind = new KeyBinding("exampleKey", Keyboard.KEY_J, "ExampleMod");

    public ExampleKeybindListener() {
        // you need to register your keybind for it to show up in the settings menu
        ClientRegistry.registerKeyBinding(exampleKeybind);
    }

    @SubscribeEvent
    public void onKeyPress(InputEvent.KeyInputEvent event) {
        // this method runs everytime a key on the keyboard is pressed / unpressed

        if (exampleKeybind.isPressed()) { // using isPressed() will return true once when the key is pressed

            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The example keybind has been pressed"));

        } else if (exampleKeybind.isKeyDown()) { // using isKeyDown() will return true the whole time the key is held down

            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The example keybind is held down"));

        }
    }

}
