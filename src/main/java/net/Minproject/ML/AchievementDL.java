package net.Minproject.ML;

import net.Minproject.ML.test.BlockTest;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AchievementDL extends AchievementPage{
    public AchievementDL() {
		super("Data Losing",dataGet,repair,repairing,dataBlocking,invertIt,enterDIM);
		// TODO Auto-generated constructor stub
	}
	AchievementPage pageDL;
    static Achievement dataGet = (new Achievement("achievement.dataGet", "dataGet", 0, -7, ItemBit.bit, null)).initIndependentStat().registerStat();
    static Achievement dataBlocking = (new Achievement("achievement.dataBlocking","dataBlocking",2,-5,BlockDati.block,dataGet)).registerStat();
    static Achievement invertIt = (new Achievement("achievement.invertIt","invertIt",1,-4,BlockDati_Invert.block,dataBlocking)).registerStat();
    static Achievement repair = (new Achievement("achievement.repair","repair",-2,-5,ItemRPIDT.rpidt,dataGet)).registerStat();
    static Achievement repairing = (new Achievement("achievement.repairing","repairing",-1,-4,BlockTest.block,repair)).registerStat();
    static Achievement enterDIM = (new Achievement("achievement.enterDIM", "enterDIM", 0, 0, BlockDati.block, invertIt)).registerStat();
}
