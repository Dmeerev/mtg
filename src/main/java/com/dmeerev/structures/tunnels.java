package com.dmeerev.structures;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.util.Random;
import com.dmeerev.info;

public class tunnels {


    public static void genTurn (World world, Random random, int chunkX, int chunkZ){

        //получаем х и z + добавляем смещение да бы избежать каскадной генерации
        int x = (chunkX << 4) + 8;
       // int z = (chunkZ << 4) + 8;

        int z = 12;
        int y = 3;



//тут все ясно
        BlockPos position = new BlockPos(x, y, z);

//загружаем nbt файл с нашей структурой(я его положил в main/resources/assets/modid/structures/laboratory.nbt)
        WorldServer worldServer = (WorldServer)world;
        MinecraftServer minecraftServer = world.getMinecraftServer();
        TemplateManager templateManager = worldServer.getStructureTemplateManager();

        Template template = templateManager.get(minecraftServer, new ResourceLocation(info.MOD_ID + ":railfwd3"));

//создаем обьект с настройками размещения(тут можно вертеть нашу постройку и т.д.)
        PlacementSettings settings = new PlacementSettings();
       // settings.setRotation(Rotation.CLOCKWISE_90);

//генерим на позиции из position используя настройки settings
        template.addBlocksToWorld(world, position, settings);

    }
}
