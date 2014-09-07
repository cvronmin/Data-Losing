package net.Minproject.ML;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

import java.util.*;

import net.minecraft.client.renderer.texture.*;
public class BlockFormat {

public BlockFormat(){}

public static Format block;

public Object instance;
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){

GameRegistry.registerBlock(block, "format");
}
public void registerRenderers(){}
public void load(){
}


static{

block = (Format)(new Format().setHardness(100.0F)
.setResistance(1000.0F)
.setLightLevel(0.0F)
.setBlockName("format")
.setBlockTextureName("format")
.setLightOpacity(0)
.setStepSound(Block.soundTypeGlass)
.setCreativeTab(CreativeTabs.tabBlock)
);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
Block.blockRegistry.addObject(1101, "format", block);
}

public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
static class Format extends Block
{

int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

boolean red = false;

private Entity EntityPlayer;

private EntityPlayer par1EntityPlayer;




protected Format()
{
        super(Material.glass);

}
public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
return red?1:0;
}
public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity){
      if(entity == EntityPlayer){
          ItemStack itemstack3 = par1EntityPlayer.inventory.armorInventory[3];
          ItemStack itemstack2 = par1EntityPlayer.inventory.armorInventory[2];
          ItemStack itemstack1 = par1EntityPlayer.inventory.armorInventory[1];
          ItemStack itemstack = par1EntityPlayer.inventory.armorInventory[0];
        if (itemstack3 != null && (itemstack3.getItem() == ArmorBit.helmet || itemstack3.getItem() == ArmorBit.body || itemstack3.getItem() == ArmorBit.legs || itemstack3.getItem() == ArmorBit.boots )&&
        		itemstack2 != null && (itemstack2.getItem() == ArmorBit.body || itemstack2.getItem() == ArmorBit.legs || itemstack2.getItem() == ArmorBit.boots || itemstack2.getItem() == ArmorBit.helmet)&&
        		itemstack1 != null && (itemstack1.getItem() == ArmorBit.legs || itemstack1.getItem() == ArmorBit.boots || itemstack1.getItem() == ArmorBit.helmet || itemstack1.getItem() == ArmorBit.body )&&
        		itemstack != null && (itemstack.getItem() == ArmorBit.boots || itemstack.getItem() == ArmorBit.helmet || itemstack.getItem() == ArmorBit.body || itemstack.getItem() == ArmorBit.legs)
        		)
        {
            return;
        }
        else{
    	    entity.attackEntityFrom(DamageSource.generic, 10000);
        }
        }
        else
	    entity.attackEntityFrom(DamageSource.generic, 10000);
    }
@SideOnly(Side.CLIENT)
@Override
public IIcon getIcon(int i, int par2){

if (i == 0)
return gor;

else if (i == 1)
return dol;

else if (i == 2)
return st1;

else if (i == 3)
return st2;

else if (i == 4)
return st4;

else if (i == 5)
return st3;

else
return gor;

}

@SideOnly(Side.CLIENT)
@Override
public void registerBlockIcons(IIconRegister reg){
this.gor = reg.registerIcon("format");
this.dol = reg.registerIcon("format");
this.st1 = reg.registerIcon("format");
this.st2 = reg.registerIcon("format");
this.st3 = reg.registerIcon("format");
this.st4 = reg.registerIcon("format");
}
public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
{
return null;
}

public int getRenderType(){
return 0;
}
public int tickRate()
{
    return 10;
}

public int quantityDropped(Random par1Random){
return 0;
}

}
}
