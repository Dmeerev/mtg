package com.dmeerev.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBestStone extends Block {
    public BlockBestStone(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
       // this.setUnlocalizedName(name);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
