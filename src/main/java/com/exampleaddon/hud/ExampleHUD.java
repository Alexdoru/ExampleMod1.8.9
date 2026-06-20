package com.exampleaddon.hud;

import com.exampleaddon.config.ExampleConfig;
import fr.alexdoru.configlib.api.IRenderer;
import fr.alexdoru.configlib.api.RendererPosition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

public class ExampleHUD implements IRenderer {

    @Override
    public void render(ScaledResolution resolution) {
        final Minecraft mc = Minecraft.getMinecraft();
        final String text = "ExampleText";
        this.getPosition().updateAdjustedAbsolutePosition(resolution, mc.fontRendererObj.getStringWidth(text), mc.fontRendererObj.FONT_HEIGHT);
        mc.fontRendererObj.drawStringWithShadow(text, this.getPosition().getAbsoluteRenderX(), this.getPosition().getAbsoluteRenderY(), 0xFFFFFF);
    }

    @Override
    public void renderDummy() {
        final Minecraft mc = Minecraft.getMinecraft();
        final FontRenderer fr = Minecraft.getMinecraft().fontRendererObj;
        fr.drawStringWithShadow("ExampleText", this.getPosition().getAbsoluteRenderX(), this.getPosition().getAbsoluteRenderY(), 0xFFFFFF);
    }

    @Override
    public boolean isEnabled(long l) {
        return true;
    }

    @Override
    public RendererPosition getPosition() {
        return ExampleConfig.exampleGuiPos;
    }
}
