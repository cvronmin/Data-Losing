package net.Minproject.ML.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.Minproject.ML.RItem.MLItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RepairRecipes {
    private static final RepairRecipes smeltingBase = new RepairRecipes();
    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static RepairRecipes repairing()
    {
        return smeltingBase;
    }

    private RepairRecipes()
    {
        this.repairBlock(Blocks.iron_ore, new ItemStack(Items.iron_ingot));
        this.repairBlock(Blocks.gold_ore, new ItemStack(Items.gold_ingot));
        this.repairBlock(Blocks.diamond_ore, new ItemStack(Items.diamond));
        this.repairBlock(Blocks.sand, new ItemStack(Blocks.glass));
        this.repairItem(Items.porkchop, new ItemStack(Items.cooked_porkchop));
        this.repairItem(Items.beef, new ItemStack(Items.cooked_beef));
        this.repairItem(Items.chicken, new ItemStack(Items.cooked_chicken));
        this.repairBlock(Blocks.cobblestone, new ItemStack(Blocks.stone));
        this.repairItem(Items.clay_ball, new ItemStack(Items.brick));
        this.repairBlock(Blocks.clay, new ItemStack(Blocks.hardened_clay));
        this.repairBlock(Blocks.cactus, new ItemStack(Items.dye, 1, 2));
        this.repairBlock(Blocks.log, new ItemStack(Items.coal, 1, 1));
        this.repairBlock(Blocks.log2, new ItemStack(Items.coal, 1, 1));
        this.repairBlock(Blocks.emerald_ore, new ItemStack(Items.emerald));
        this.repairItem(Items.potato, new ItemStack(Items.baked_potato));
        this.repairBlock(Blocks.netherrack, new ItemStack(Items.netherbrick));
        this.repairBlock(Blocks.coal_ore, new ItemStack(Items.coal));
        this.repairBlock(Blocks.redstone_ore, new ItemStack(Items.redstone));
        this.repairBlock(Blocks.lapis_ore, new ItemStack(Items.dye, 1, 4));
        this.repairBlock(Blocks.quartz_ore, new ItemStack(Items.quartz));
        this.repairItem(MLItems.rGunpowder,new ItemStack(Items.gunpowder));
        this.repairItem(MLItems.rFlesh,new ItemStack(Items.rotten_flesh));
        this.repairItem(MLItems.rString,new ItemStack(Items.string));
        this.repairItem(MLItems.rSpider_eye,new ItemStack(Items.spider_eye));
        this.repairItem(MLItems.rSlime_ball,new ItemStack(Items.slime_ball));
    }

    public void repairBlock(Block p_151393_1_, ItemStack p_151393_2_)
    {
        this.repairItem(Item.getItemFromBlock(p_151393_1_), p_151393_2_);
    }

    public void repairItem(Item p_151396_1_, ItemStack p_151396_2_)
    {
        this.func_151394_a(new ItemStack(p_151396_1_, 1, 32767), p_151396_2_);
    }

    public void func_151394_a(ItemStack p_151394_1_, ItemStack p_151394_2_)
    {
        this.smeltingList.put(p_151394_1_, p_151394_2_);
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }
}
