package net.lahazar.wynnproffa;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.lahazar.wynnproffa.client.hud.ProfHud;
import net.minecraft.client.MinecraftClient;

public class WynnProffaClient implements ClientModInitializer {
    public static long profStartTime = 0;
    public static int itemsCount = 0, wins = 0, losses = 0;

    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new ProfHud());
        profStartTime = MinecraftClient.getInstance().world != null ? System.currentTimeMillis() : 0;
    }
}
