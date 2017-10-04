package com.github.YoungGT.EasyCraft.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockLoader {
	public static Block slimeBlock = new BlockSlimeBlock();
	public static Block sulfurOre = new OreSulfur();
	public static Block magicMatterBlock = new BlockMagicMatter();

	public BlockLoader(FMLPreInitializationEvent event) {
		register(slimeBlock, "slime_block");
		register(sulfurOre, "sulfur_ore");
		register(magicMatterBlock, "magic_matter_block");
	}

	private static void register(Block Block, String name) {
		GameRegistry.registerBlock(Block, name);
	}
}
