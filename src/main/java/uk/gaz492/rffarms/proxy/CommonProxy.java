package uk.gaz492.rffarms.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import uk.gaz492.rffarms.util.ModInfo;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID)
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
//        event.getRegistry().register(new BlockFramland());
//        event.getRegistry().register(new BlockDrit());
//
//        GameRegistry.registerTileEntity(TileFramland.class, new ResourceLocation(ModInformation.MOD_ID + ":framland"));
//        GameRegistry.registerTileEntity(TileDrit.class, new ResourceLocation(ModInformation.MOD_ID + ":drit"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
//        event.getRegistry().register(new ItemBlock(ModBlocks.blockFramland).setRegistryName(BlockFramland.FRAMLAND));
//        event.getRegistry().register(new ItemBlock(ModBlocks.blockDrit).setRegistryName(BlockDrit.DRIT));
//        event.getRegistry().register(new ItemThunderHoe());
    }

}
