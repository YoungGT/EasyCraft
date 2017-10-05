package com.github.YoungGT.EasyCraft.item;

import com.github.YoungGT.EasyCraft.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;

public class MetaItems extends Item {
	public String mName;

	public MetaItems(String aUnlocalizedName) {
		super();
		mName = aUnlocalizedName;
		setUnlocalizedName(aUnlocalizedName);
		setCreativeTab(CreativeTabsLoader.tabEasyCraft);
	}
}
