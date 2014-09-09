package net.Minproject.ML;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.*;

import java.util.*;

public class ItemBit extends Item{

public ItemBit(){}

public static Item bit;
public static Item bit_inverted;
public Object instance;
public void load(){
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){

}
public void registerRenderers(){
}


static{
	
bit = (new Itemsoul(1110));
bit_inverted = (new Itemsoul_inverted(1111));
Item.itemRegistry.addObject(1110, "bit", bit);
Item.itemRegistry.addObject(1111, "inbit", bit_inverted);

}

static class Itemsoul extends Item{

public Itemsoul(int par1){
setMaxDamage(0);
maxStackSize = 64;
setUnlocalizedName("bit");
setTextureName("dati");
setCreativeTab(CreativeTabs.tabMaterials);
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
    par3List.add(EnumChatFormatting.GRAY + StatCollector.translateToLocalFormatted("bit.line1", new Object[] {}));
}
public boolean onItemUse(ItemStack itemstack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
	super.onItemUse(itemstack, entity, world, i, j, k, l, a, b, c);float var4 = 1.0F;


	if(true){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(bit);
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(bit_inverted, 1));
	}
	return false;
}
}
static class Itemsoul_inverted extends Item{

public Itemsoul_inverted(int par1){
setMaxDamage(0);
maxStackSize = 64;
setUnlocalizedName("inbit");
setTextureName("indati");
setCreativeTab(CreativeTabs.tabMaterials);
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
    par3List.add(EnumChatFormatting.GRAY + StatCollector.translateToLocalFormatted("inbit.line1", new Object[] {}));
}
public boolean onItemUse(ItemStack itemstack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
	super.onItemUse(itemstack, entity, world, i, j, k, l, a, b, c);float var4 = 1.0F;


	if(true){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(bit_inverted);
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(bit, 1));
	}
	return false;
}
}
}
