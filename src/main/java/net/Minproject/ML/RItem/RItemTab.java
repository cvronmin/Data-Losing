package net.Minproject.ML.RItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RItemTab {
	public Object instance;

	public static CreativeTabs tab = new CreativeTabs("RItem") {
	                @SideOnly(Side.CLIENT)
	                public Item getTabIconItem(){
	                        return MLItems.rGunpowder;
	                }
	        };
}
