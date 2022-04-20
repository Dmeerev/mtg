package com.dmeerev;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item {
    public ItemTest() {
        this.setRegistryName("test");
        //this.setUnlocalizedName("test");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

}

