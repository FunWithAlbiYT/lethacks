package me.funwithalbiyt.lethack;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LetHack.MODID, name = LetHack.NAME, version = LetHack.VERSION)
public class ExampleMod
{
    public static final String MODID = "lethack";
    public static final String NAME = "LetHack";
    public static final String VERSION = "b1.01";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Im done F**ker");
    }
}
