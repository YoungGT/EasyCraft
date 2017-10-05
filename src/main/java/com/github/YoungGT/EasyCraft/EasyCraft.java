package com.github.YoungGT.EasyCraft;

import com.github.YoungGT.EasyCraft.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author YoungGT
 */
@Mod(modid = EasyCraft.MODID, name = EasyCraft.NAME, version = EasyCraft.VERSION, acceptedMinecraftVersions = "1.10.2")
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
