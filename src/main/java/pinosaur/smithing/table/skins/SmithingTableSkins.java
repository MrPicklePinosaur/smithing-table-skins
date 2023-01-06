package pinosaur.smithing.table.skins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmithingTableSkins implements ModInitializer {

	public static final Item EMERALD_ENCRUSTED_GOLD_PICKAXE =
		Registry.register(Registries.ITEM, new Identifier("smithingtableskins", "emerald_encrusted_gold_pickaxe"),
		new Item(new FabricItemSettings())
	);

	public static final Logger LOGGER = LoggerFactory.getLogger("smithingtableskins");

	@Override
	public void onInitialize() {

		LOGGER.info("Mod Initialized");

	}
}
