package net.Minproject.ML;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BitRecipe {
	public Object instance;
	public void load(){
		ItemStack helmet = new ItemStack(ArmorBit.helmet, 1, 0);
		ItemStack body = new ItemStack(ArmorBit.body, 1, 0);
		ItemStack legs = new ItemStack(ArmorBit.legs, 1, 0);
		ItemStack boots = new ItemStack(ArmorBit.boots, 1, 0);
		ItemStack sword = new ItemStack(ItemBSword.bit_sword, 1, 0);
		ItemStack dati = new ItemStack(BlockDati.block, 1, 0);
		ItemStack indati = new ItemStack(BlockDati_Invert.block, 1, 0);

	GameRegistry.addRecipe(helmet, new Object[]{
			"III", "I I", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), });
	GameRegistry.addRecipe(body, new Object[]{
			"I I", "III", "III", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), });
	GameRegistry.addRecipe(legs, new Object[]{
			"III", "I I", "I I", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), });
	GameRegistry.addRecipe(boots, new Object[]{
			"I I", "I I", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), });
	GameRegistry.addRecipe(sword, new Object[]{
			"I", "I", "A", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), Character.valueOf('A'), new ItemStack(Items.stick, 1)});
	GameRegistry.addRecipe(dati, new Object[]{
			"III", "III", "III", Character.valueOf('I'), new ItemStack(ItemBit.bit, 1), });
	GameRegistry.addRecipe(indati, new Object[]{
			"III", "III", "III", Character.valueOf('I'), new ItemStack(ItemBit.bit_inverted, 1), });
		}
	public void serverLoad(FMLServerStartingEvent event) {
		// TODO Auto-generated method stub
		
	}
	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}
	public void registerRenders() {
		// TODO Auto-generated method stub
		
	}
}
