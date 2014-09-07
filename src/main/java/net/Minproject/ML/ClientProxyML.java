package net.Minproject.ML;

public class ClientProxyML extends CommonProxyML{
	  public void registerRenderers(DL ins)
	  {
		  ins.biome.registerRenderers();
		  ins.dati.registerRenderers();
		  ins.wda.registerRenderers();
          ins.format.registerRenderers();
          ins.bit.registerRenderers();
		  ins.dim1.registerRenderers();
		  ins.sword.registerRenderers();
		  ins.armor.registerRenderers();
		  ins.ml1.registerRenderers();
		  ins.ml2.registerRenderers();
//		  ins.ml3.registerRenderers();
		  ins.ml4.registerRenderers();
		  ins.ml5.registerRenderers();
		  ins.ml8.registerRenderers();
	  }
}
