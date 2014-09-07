package net.Minproject.ML;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWakeDati {
	public BlockWakeDati(){}

	public static WakeDati block;

	public Object instance;
	public int addFuel(ItemStack fuel){return 0;}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){

	GameRegistry.registerBlock(block, "WakeDati");
	}
	public void registerRenderers(){}
	public void load(){
	}


	static{

	block = (WakeDati)(new WakeDati().setHardness(2.0F)
	.setResistance(1000.0F)
	.setLightLevel(0.0F)
	.setBlockName("WakeDati")
	.setBlockTextureName("dati")
	.setLightOpacity(0)
	.setStepSound(Block.soundTypeStone)
	.setCreativeTab(CreativeTabs.tabBlock)
	);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
	Block.blockRegistry.addObject(1011, "WakeDati", block);
	block.setHarvestLevel("shovel", 50);
	}


	public void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 16; i++){
	int randPosX = chunkX + random.nextInt(16);
	int randPosY = random.nextInt(128);
	int randPosZ = chunkZ + random.nextInt(16);
	Block check = world.getBlock(randPosX, randPosY, randPosZ);

	if (check == Blocks.dirt || check == Blocks.grass)
	{
	    world.setBlock(randPosX, randPosY, randPosZ, BlockWakeDati.block);
	}

	}

	}
	static class WakeDati extends Block
	{

	int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

	IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

	boolean red = false;





	protected WakeDati()
	{
	        super(Material.ground);

	}


	public void onBlockAdded(World world, int i, int j, int k){
	EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
	world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));

	}
	public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
	return red?1:0;
	}
	public void updateTick(World world, int i, int j, int k, Random random){
	EntityPlayer entity = Minecraft.getMinecraft().thePlayer;

	if(true){
	world.createExplosion((Entity)null, i, j, k, 1.0F, true);
	}

	world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));
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
	@Override
	public int tickRate(World world)
	{
	    return 100;
	}

	public int quantityDropped(Random par1Random){
	return 1;
	}

	}
	}

