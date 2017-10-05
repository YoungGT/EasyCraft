package com.github.YoungGT.EasyCraft.crafting;

import com.github.YoungGT.EasyCraft.block.BlockLoader;
import com.github.YoungGT.EasyCraft.item.ItemLoader;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
	}

	private void registerFuel() {

	}

	private void registerSmelting() {
		GameRegistry.addSmelting(ItemLoader.magicMatter, new ItemStack(Items.DIAMOND), 0.5F);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.5F);
	}

	private void registerRecipe() {
		// Shaped Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.slimeBlock),
				new Object[] { "SSS", "SSS", "SSS", 'S', Items.SLIME_BALL });
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.magicMatterBlock),
				new Object[] { "MMM", "MMM", "MMM", 'M', ItemLoader.magicMatter });
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.magicMatter),
				new Object[] { "SIS", "SDS", "SIS", 'S', Items.DYE, 'I', Items.IRON_INGOT, 'D', Items.DIAMOND });
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.magicMatter),
				new Object[] { "SSS", "IDI", "SSS", 'S', Items.DYE, 'I', Items.IRON_INGOT, 'D', Items.DIAMOND });
		GameRegistry.addShapedRecipe(new ItemStack(Items.NAME_TAG, 3),
				new Object[] { "S", "P", "P", 'S', Items.STRING, 'P', Items.PAPER });
		GameRegistry.addShapedRecipe(new ItemStack(Items.SADDLE),
				new Object[] { "LLL", "LLL", "  I", 'L', Items.LEATHER, 'I', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(Items.IRON_HORSE_ARMOR),
				new Object[] { "  I", " SI", "III", 'I', Items.IRON_INGOT, 'S', Items.SADDLE });
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR),
				new Object[] { "  G", " SG", "GGG", 'G', Items.GOLD_INGOT, 'S', Items.SADDLE });
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR),
				new Object[] { "  D", " SD", "DDD", 'D', Items.DIAMOND, 'S', Items.SADDLE });
		GameRegistry.addShapedRecipe(new ItemStack(Items.NETHER_STAR), new Object[] { "ODO", "DMD", "ODO", 'O',
				Blocks.OBSIDIAN, 'D', Items.DIAMOND, 'M', ItemLoader.magicMatter });
		GameRegistry.addShapedRecipe(new ItemStack(Items.LEAD, 3),
				new Object[] { "SSS", "SLS", "SSS", 'S', Items.STRING, 'L', Items.LEATHER });
		GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT, 32),
				new Object[] { " C ", "CIC", " C ", 'C', Items.COAL, 'I', Items.IRON_INGOT });
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 4),
				new Object[] { " S ", "SWS", " S ", 'S', Items.WHEAT_SEEDS, 'W', Items.WATER_BUCKET });
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 8),
				new Object[] { "SSS", "SWS", "SSS", 'S', Items.WHEAT_SEEDS, 'W', Items.WATER_BUCKET });
		GameRegistry.addShapedRecipe(new ItemStack(Items.FEATHER),
				new Object[] { "S  ", "S  ", "S  ", 'S', Items.STRING });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.ICE),
				new Object[] { " S ", "SWS", " S ", 'S', Items.SNOWBALL, 'W', Items.WATER_BUCKET });
		// Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ItemLoader.magicMatter, 9), BlockLoader.magicMatterBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS), Items.WHEAT);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.BRICK, 4), Blocks.BRICK_BLOCK);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), Blocks.GLOWSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING, 4), Blocks.WOOL);
	}
}
