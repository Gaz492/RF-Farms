package uk.gaz492.rffarms;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.gaz492.rffarms.util.ModInfo;


@GameRegistry.ObjectHolder(ModInfo.MOD_ID);
@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID)
public class RFFBlocks {
    public static final Block FARM_MK1 = Blocks.AIR;
}
