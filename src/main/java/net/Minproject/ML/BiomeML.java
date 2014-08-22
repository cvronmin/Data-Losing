package net.Minproject.ML;

import java.util.Random;

import net.Minproject.ML.Entity.*;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class BiomeML {

public static BiomeGenML biome = new BiomeGenML();

public Object instance;

public BiomeML(){}

public void load(){
BiomeDictionary.registerBiomeType(biome, BiomeDictionary.Type.PLAINS);
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void registerRenderers(){}

public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}

static class BiomeGenML extends BiomeGenBase
{

	@SuppressWarnings("unchecked")
    public BiomeGenML()
    {
        super(112);
        setBiomeName("ML");
        topBlock = BlockDati.block;
        fillerBlock = BlockDati.block;
        theBiomeDecorator.generateLakes = false;
	theBiomeDecorator.treesPerChunk = 0;
	theBiomeDecorator.flowersPerChunk = 0;
	theBiomeDecorator.grassPerChunk = 0;
	theBiomeDecorator.deadBushPerChunk = 0;
	theBiomeDecorator.mushroomsPerChunk = 0;
	theBiomeDecorator.reedsPerChunk = 0;
	theBiomeDecorator.cactiPerChunk = 0;
   	theBiomeDecorator.sandPerChunk = 0;
   	rainfall = 0F;
   	setHeight(new BiomeGenBase.Height(0.1F, 0.5F));
   	
   	
this.spawnableMonsterList.clear();
this.spawnableCreatureList.clear();
this.spawnableWaterCreatureList.clear();
this.spawnableCaveCreatureList.clear();
this.spawnableMonsterList.add(new SpawnListEntry(MLEntityZombie.class,10,1,10));
this.spawnableMonsterList.add(new SpawnListEntry(MLEntityCreeper.class,10,1,10));
//this.spawnableMonsterList.add(new SpawnListEntry(MLEntitySkeleton.class,10,1,10));
this.spawnableMonsterList.add(new SpawnListEntry(MLEntitySpider.class,10,1,10));
this.spawnableMonsterList.add(new SpawnListEntry(MLEntitySlime.class,10,1,10));
this.spawnableMonsterList.add(new SpawnListEntry(MLEntityEnderman.class,10,1,10));
    }    
}
}
