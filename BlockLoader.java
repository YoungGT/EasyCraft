package com.github.YoungGT.EasyCraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block slimeBlock = new BlockSlimeBlock();
	public static Block sulfurOre = new OreSulfur();
	public static Block magicMatterBlock = new BlockMagicMatter();
	public BlockLoader(FMLPreInitializationEvent event) {
		register(slimeBlock,"slimeBlock");
		register(sulfurOre,"sulfurOre");
		register(magicMatterBlock,"magicMatterBlock");
	}

	private static void register(Block Block,String name) {
		GameRegistry.registerBlock(Block.setRegistryName(name));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(magicMatterBlock);
		registerRender(slimeBlock);
		registerRender(sulfurOre);
	}
}
