package com.dmeerev;

import com.dmeerev.blocks.BlocksRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.dmeerev.worldgen.worldGen;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        BlocksRegister.register();
        worldGen.init();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
