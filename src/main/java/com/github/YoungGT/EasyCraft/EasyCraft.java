package com.github.YoungGT.EasyCraft;

import com.github.YoungGT.EasyCraft.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author YoungGT
 */
@Mod(modid = EasyCraft.MODID, name = EasyCraft.NAME, version = EasyCraft.VERSION, acceptedMinecraftVersions = "1.7.10")
public class EasyCraft {
	public final static String MODID = "easycraft";
	public final static String NAME = "Easy Craft";
	public final static String VERSION = "1.0.0";

	@Instance(EasyCraft.MODID)
	public static EasyCraft instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@SidedProxy(clientSide = "com.github.YoungGT.EasyCraft.client.ClientProxy", serverSide = "com.github.YoungGT.EasyCraft.common.CommonProxy")
	public static CommonProxy proxy;
}
