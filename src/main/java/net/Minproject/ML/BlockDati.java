package net.Minproject.ML;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import java.util.*;

import net.minecraft.client.renderer.texture.*;
public class BlockDati {

public BlockDati(){}

public static BlockD block;

public Object instance;
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){

GameRegistry.registerBlock(block, "Dati");
}
public void registerRenderers(){}
public void load(){

}


static{

block = (BlockD)(new BlockD().setHardness(2.0F)
.setResistance(10.0F)
.setLightLevel(0.0F)
.setBlockName("Dati")
.setBlockTextureName("dati")
.setLightOpacity(0)
.setStepSound(Block.soundTypeGlass)
.setCreativeTab(CreativeTabs.tabBlock)
);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
Block.blockRegistry.addObject(1010, "Dati", block);
block.setHarvestLevel("shovel", 0);
}

public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
static class BlockD extends Block
{

int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

boolean red = false;





protected BlockD()
{
        super(Material.glass);

}
public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
return red?1:0;
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
this.gor = reg.registerIcon("dati");
this.dol = reg.registerIcon("dati");
this.st1 = reg.registerIcon("dati");
this.st2 = reg.registerIcon("dati");
this.st3 = reg.registerIcon("dati");
this.st4 = reg.registerIcon("dati");
}
public int getRenderType(){
return 0;
}
public int tickRate()
{
    return 10;
}

public int quantityDropped(Random par1Random){
return 1;
}

}
}
