package pinosaur.smithing.table.skins;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldEncrustedGoldenPickaxeMaterial implements ToolMaterial {

  public static final EmeraldEncrustedGoldenPickaxeMaterial INSTANCE = new EmeraldEncrustedGoldenPickaxeMaterial();


  @Override
  public int getDurability() {
    return 32;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return 12.0F; 
  }

  @Override
  public float getAttackDamage() {
    return 2.0F;
  }

  @Override
  public int getMiningLevel() {
    return 0;
  }

  @Override
  public int getEnchantability() {
    return 22;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.GOLD_INGOT);
  }

}