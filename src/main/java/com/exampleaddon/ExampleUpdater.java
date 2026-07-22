package com.exampleaddon;

import fr.alexdoru.mwe.api.ModUpdater;
import fr.alexdoru.mwe.chat.ChatUtil;
import net.minecraft.util.ChatComponentText;

import java.io.File;

import static net.minecraft.util.EnumChatFormatting.GREEN;
import static net.minecraft.util.EnumChatFormatting.RED;

public class ExampleUpdater extends ModUpdater {

    public ExampleUpdater(File modJarFile) {
        super(
                modJarFile,
                BuildConfig.ADDON_NAME,
                BuildConfig.VERSION,
                true // TODO set true to auto install
        );
    }

    @Override
    protected String getApiEndpoint() {
        // TODO change url to your repo
        return "https://api.github.com/repos/YourGithubName/ExampleAddon/releases/latest";
    }

    @Override
    protected void printChatNotification() {
        // TODO edit chat notification
        if (this.updateInfo != null) {
            ChatUtil.debug("update of XXXXXXXXX is available");
            if (this.automaticUpdate) {
                ChatUtil.addChatMessage("");
                if (this.isFeatherClient) {
                    ChatUtil.addChatMessage(new ChatComponentText(RED + "✘ The automatic updater is disabled on Feather."));
                } else if (this.downloadSuccess) {
                    ChatUtil.addChatMessage(new ChatComponentText(GREEN + "✔ Update has been downloaded and will be installed automatically when closing the game."));
                }
            }
        }
    }

}
