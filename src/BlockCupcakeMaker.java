package net.minecraft.src;

import java.util.Random;

public class BlockCupcakeMaker extends Block
{
    public BlockCupcakeMaker()
    {
        super(125, 0, Material.rock);
    }
    public int getBlockTextureFromSide(int par1)
    {
    	if(par1 == 0 || par1 == 1){
    		return mod_MoDesserts.cupcakeMakerTop;
    	}else{
    		return blockIndexInTexture;
    	}
    }
}