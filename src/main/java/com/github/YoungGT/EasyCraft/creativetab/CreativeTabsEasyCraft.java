package com.github.YoungGT.EasyCraft.creativetab;

import com.github.YoungGT.EasyCraft.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsEasyCraft extends CreativeTabs {
	public CreativeTabsEasyCraft() {
		super("easycraft");
	}

	@Override
	public Item getTabIconItem() {
		return ItemLoader.magicMatter;
	}
}
