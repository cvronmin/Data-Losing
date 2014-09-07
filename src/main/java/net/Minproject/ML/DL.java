package net.Minproject.ML;

import java.util.Random;

import net.Minproject.ML.Entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = DL.MODID,name = "dataloss", version = DL.VERSION)
public class DL implements IFuelHandler, IWorldGenerator {
    public static final String MODID = "DL";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide="net.Minproject.ML.ClientProxyML", serverSide="net.Minproject.ML.CommonProxyML")
    public static CommonProxyML proxy;

    @Instance("DL")
    public static DL instance;
    BiomeML biome;
    BlockDati dati;
    BlockWakeDati wda;
    BlockFormat format;
    ItemBit bit;
    MLDIM dim1;
    ItemBSword sword;
    ArmorBit armor;
    BitRecipe recipe;
    MLEntityZombie ml1;
    MLEntityCreeper ml2;
//    MLEntitySkeleton ml3;
    MLEntitySpider ml4;
    MLEntitySlime ml5;
    MLEntityEnderman ml8;
	private World par1World;
    public DL(){
    	this.biome = new BiomeML();
		this.dati = new BlockDati();
		this.wda = new BlockWakeDati();
        this.format = new BlockFormat();
        this.bit = new ItemBit();
		this.dim1 = new MLDIM();
		this.sword = new ItemBSword();
		this.armor = new ArmorBit();
		this.recipe = new BitRecipe();
		this.ml1 = new MLEntityZombie(par1World);
		this.ml2 = new MLEntityCreeper(par1World);
//		this.ml3 = new MLEntitySkeleton(par1World);
		this.ml4 = new MLEntitySpider(par1World);
		this.ml5 = new MLEntitySlime(par1World);
		this.ml8 = new MLEntityEnderman(par1World);
    }
    public int getBurnTime(ItemStack fuel)
    {
        if (this.dim1.addFuel(fuel) != 0) return this.dim1.addFuel(fuel);
        if (this.dati.addFuel(fuel) != 0) return this.dati.addFuel(fuel);
		return 0;
    }
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
      chunkX *= 16;
      chunkZ *= 16;
      if (world.provider.dimensionId == -1) this.dim1.generateNether(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == 0) this.dim1.generateSurface(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == -1) this.dati.generateNether(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == 0) this.dati.generateSurface(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == 0) this.wda.generateSurface(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == -1) this.biome.generateNether(world, random, chunkX, chunkZ);
      if (world.provider.dimensionId == 0) this.biome.generateSurface(world, random, chunkX, chunkZ);
    }
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    	this.biome.serverLoad(event);
    	this.dati.serverLoad(event);
    	this.wda.serverLoad(event);
        this.format.serverLoad(event);
        this.bit.serverLoad(event);
    	this.dim1.serverLoad(event);
    	this.sword.serverLoad(event);
    	this.armor.serverLoad(event);
    	this.recipe.serverLoad(event);
    	this.ml1.serverLoad(event);
    	this.ml2.serverLoad(event);
 //   	this.ml3.serverLoad(event);
    	this.ml4.serverLoad(event);
    	this.ml5.serverLoad(event);
    	this.ml8.serverLoad(event);
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	this.biome.instance = instance;
        this.dati.instance = instance;
        this.wda.instance = instance;
        this.format.instance = instance;
        this.bit.instance = instance;
        this.dim1.instance = instance;
        this.sword.instance = instance;
        this.armor.instance = instance;
        this.recipe.instance = instance;
        this.ml1.instance = instance;
        this.ml2.instance = instance;
//        this.ml3.instance = instance;
        this.ml4.instance = instance;
        this.ml5.instance = instance;
        this.ml8.instance = instance;
        this.biome.preInit(event);
    	this.dati.preInit(event);
    	this.wda.preInit(event);
        this.format.preInit(event);
        this.bit.preInit(event);
    	this.dim1.preInit(event);
    	this.sword.preInit(event);
    	this.armor.preInit(event);
    	this.recipe.preInit(event);
    	this.ml1.preInit(event);
    	this.ml2.preInit(event);
//    	this.ml3.preInit(event);
    	this.ml4.preInit(event);
    	this.ml5.preInit(event);
    	this.ml8.preInit(event);
        proxy.registerRenderers(this); 

}
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerFuelHandler(this);
        GameRegistry.registerWorldGenerator(this, 1);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new DL.GuiHandler());
        this.biome.load();
    	this.dati.load();
    	this.wda.load();
        this.format.load();
        this.bit.load();
    	this.dim1.load();
    	this.sword.load();
    	this.armor.load();
    	this.recipe.load();
    	this.ml1.load();
    	this.ml2.load();
//    	this.ml3.load();
    	this.ml4.load();
    	this.ml5.load();
    	this.ml8.load();
}
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        return null;
        }
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) { 
        	return null;
        }
      }
}
