package com.bedrockui;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client entrypoint for Bedrock UI.
 *
 * This initial commit deliberately keeps the entrypoint small.
 * UI features will be added in separate classes and tested one at a time.
 */
public final class BedrockUIClient implements ClientModInitializer {
    public static final String MOD_ID = "bedrock-ui";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Bedrock UI client project initialized.");
        // Planned modules:
        // - Creative inventory layout (catalog left, player inventory right)
        // - Bedrock-style two-click slot swapping
        // - Cursor-held item information tooltip
        // - Chat navigation controls
        // - On-screen controls reference
        // - In-game settings and localization
    }
}
