package net.lahazar.wynnproffa;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WynnProffaMod implements ModInitializer {
    public static final String MOD_ID = "wynnproffa";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("WynnProffa loaded - ready for proffing!");
    }
}
