package com.stackcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = StackCraft.MODID, name = StackCraft.NAME, version = StackCraft.VERSION)
public class StackCraft {
    public static final String MODID = "stackcraft";
    public static final String NAME = "StackCraft";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("StackCraft carregado com sucesso!");
    }
}
