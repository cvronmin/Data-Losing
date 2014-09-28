package net.Minproject.ML.RItem;

import net.Minproject.ML.DL;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MLItems {
	public final static Item rGunpowder = new RItemGunPowder();
	public final static Item rFlesh = new RItemFlesh();
	public final static Item rString = new RItemString();
	public final static Item rSpider_eye = new RItemSpiderEye();
	public final static Item rSlime_ball = new RItemSlimeBall();
	public static void initItems()
	{
		registerItems();
	}
	public static void registerItems()
	{
		registerItem(rGunpowder);
		registerItem(rFlesh);
		registerItem(rString);
		registerItem(rSpider_eye);
		registerItem(rSlime_ball);
	}
	private static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), DL.MODID);
	}
}
