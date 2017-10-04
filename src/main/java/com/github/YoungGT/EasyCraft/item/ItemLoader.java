package com.github.YoungGT.EasyCraft.item;

import com.github.YoungGT.EasyCraft.EasyCraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import scala.reflect.macros.internal.macroImpl;

public class ItemLoader {
	public static MetaItems magicMatter = new MetaItems("magicMatter");

	public ItemLoader(FMLPreInitializationEvent event) {
		register(magicMatter);
	}

	private static void register(MetaItems aItems) {
		GameRegistry.registerItem(aItems, aItems.mName);
		aItems.setTextureName(EasyCraft.MODID + ":" + aItems.mName);
	}
}
