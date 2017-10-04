package com.github.YoungGT.EasyCraft.creativetab;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsLoader {
	
	public static CreativeTabs tabEasyCraft;

	public CreativeTabsLoader(FMLPreInitializationEvent event) {
		tabEasyCraft = new CreativeTabsEasyCraft();
	}
}
