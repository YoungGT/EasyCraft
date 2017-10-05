package com.github.YoungGT.EasyCraft.client;

import com.github.YoungGT.EasyCraft.block.BlockLoader;
import com.github.YoungGT.EasyCraft.item.ItemLoader;

public class ItemRenderLoader {
	public ItemRenderLoader() {
		ItemLoader.registerRenders();
		BlockLoader.registerRenders();
	}
}
