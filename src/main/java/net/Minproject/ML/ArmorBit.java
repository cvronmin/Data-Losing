package net.Minproject.ML;

import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.common.util.*;

public class ArmorBit {
	public ArmorBit(){}

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	public Object instance;
	public void load(){
	helmet.setCreativeTab(CreativeTabs.tabCombat);
	body.setCreativeTab(CreativeTabs.tabCombat);
	legs.setCreativeTab(CreativeTabs.tabCombat);
	boots.setCreativeTab(CreativeTabs.tabCombat);
	}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){}
	public void registerRenderers(){}


	static{
	ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("Bit", 1000, new int[] {20, 70, 50, 30}, 20);

	helmet = (new ItemArmor(enuma, RenderingRegistry.addNewArmourRendererPrefix("bit_1.png"), 0){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
	}
	}).setUnlocalizedName("bit_head").setTextureName("bit_helmet");helmet.setMaxStackSize(1);
	body = (new ItemArmor(enuma, RenderingRegistry.addNewArmourRendererPrefix("bit_1.png"), 1){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
	}
	}).setUnlocalizedName("bit_body").setTextureName("a_chestplate");body.setMaxStackSize(1);
	legs = (new ItemArmor(enuma, RenderingRegistry.addNewArmourRendererPrefix("bit_1.png"), 2){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
	}
	}).setUnlocalizedName("bit_leggins").setTextureName("bit_leggings");legs.setMaxStackSize(1);
	boots = (new ItemArmor(enuma, RenderingRegistry.addNewArmourRendererPrefix("bit_1.png"), 3){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
	}
	}).setUnlocalizedName("bit_boots").setTextureName("bit_boots");boots.setMaxStackSize(1);

	Item.itemRegistry.addObject(1427, "bit_head", helmet);
	Item.itemRegistry.addObject(1428, "bit_body", body);
	Item.itemRegistry.addObject(1429, "bit_leggins", legs);
	Item.itemRegistry.addObject(1430, "abit_boots", boots);


	}

}
