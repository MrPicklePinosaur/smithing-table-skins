package pinosaur.smithing.table.skins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmithingTableSkins implements ModInitializer {

	public static final Item EMERALD_ENCRUSTED_GOLDEN_PICKAXE =
		Registry.register(Registries.ITEM, new Identifier("smithingtableskins", "emerald_encrusted_golden_pickaxe"),
		new EmeraldEncrustedGoldenPickaxeItem(EmeraldEncrustedGoldenPickaxeMaterial.INSTANCE, 0, 1.2F, new Settings())
	);

	public static final Logger LOGGER = LoggerFactory.getLogger("smithingtableskins");

	@Override
	public void onInitialize() {

		LOGGER.info("Mod Initialized");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.add(EMERALD_ENCRUSTED_GOLDEN_PICKAXE);
		});

	}
}