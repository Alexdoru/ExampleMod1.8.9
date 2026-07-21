package com.example.examplemod.mixins.mc.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraftTest {

    @Inject(method = "startGame", at = @At("RETURN"))
    private void hello(CallbackInfo ci) {
        System.out.println("Hello Minecraft!!!");
    }

}
