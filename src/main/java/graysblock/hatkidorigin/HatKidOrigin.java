package graysblock.hatkidorigin;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HatKidOrigin implements ModInitializer {
	public static final String MOD_ID = "hatkidorigin";
    public static final Logger LOGGER = LoggerFactory.getLogger("Hat Kid Origin");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}