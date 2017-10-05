package com.github.YoungGT.EasyCraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {

	public static CreativeTabs tabEasyCraft;

	public CreativeTabsLoader(FMLPreInitializationEvent event) {
		tabEasyCraft = new CreativeTabsEasyCraft();
	}
}
