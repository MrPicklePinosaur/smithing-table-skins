package pinosaur.smithing.table.skins;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class EmeraldEncrustedGoldenPickaxeItem extends PickaxeItem {

	public EmeraldEncrustedGoldenPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}

  // @Override
  // public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
  //   tooltip.add(Text.translatable("item.smithingtableskins.emerald_encrusted_golden_pickaxe"));
  // }
}
