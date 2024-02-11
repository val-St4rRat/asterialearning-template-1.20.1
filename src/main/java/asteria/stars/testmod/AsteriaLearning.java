package asteria.stars.testmod;

import asteria.stars.testmod.block.ModBlocks;
import asteria.stars.testmod.item.ModItemGroups;
import asteria.stars.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsteriaLearning implements ModInitializer {
	public static String MOD_ID = "asterialearning";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Crimes against modding and taxes!");
	}
}