package com.github.YoungGT.EasyCraft.common;

import com.github.YoungGT.EasyCraft.block.BlockLoader;
import com.github.YoungGT.EasyCraft.crafting.CraftingLoader;
import com.github.YoungGT.EasyCraft.creativetab.CreativeTabsLoader;
import com.github.YoungGT.EasyCraft.item.ItemLoader;
import com.github.YoungGT.EasyCraft.worldgen.WorldGeneratorLoader;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
	}

	public void init(FMLInitializationEvent event) {
		new CraftingLoader();
		new WorldGeneratorLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
