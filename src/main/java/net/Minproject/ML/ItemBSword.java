package net.Minproject.ML;

import cpw.mods.fml.common.event.*;
import net.minecraft.item.*;
import java.util.*;

import net.minecraftforge.common.util.*;

public class ItemBSword {

public ItemBSword(){}

public static Item bit_sword;
public Object instance;
public void load(){
ItemStack stack = new ItemStack(bit_sword, 1);}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
Item.ToolMaterial enumt = EnumHelper.addToolMaterial("bit_sword", 0, 100, 4F, 7, 2);bit_sword = (Item)(new ItemSword(enumt){public Set<String> getToolClasses(ItemStack stack){
HashMap<String, Integer> ret = new HashMap<String, Integer>();
ret.put("sword", 0);
return ret.keySet();
}
}).setUnlocalizedName("bit_sword").setTextureName("a");
Item.itemRegistry.addObject(426, "bit_sword", bit_sword);

}

}
