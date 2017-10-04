package com.github.YoungGT.EasyCraft.crafting;

import com.github.YoungGT.EasyCraft.block.BlockLoader;
import com.github.YoungGT.EasyCraft.item.ItemLoader;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockLadder;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingLoader {
	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
	}

	private void registerFuel() {

	}

	private void registerSmelting() {
		GameRegistry.addSmelting(ItemLoader.magicMatter, new ItemStack(Items.diamond), 0.5F);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.5F);
	}

	private void registerRecipe() {
		// Shaped Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.slimeBlock),
				new Object[] { "SSS", "SSS", "SSS", 'S', Items.slime_ball });
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.magicMatterBlock),
				new Object[] { "MMM", "MMM", "MMM", 'M', ItemLoader.magicMatter });
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.magicMatter),
				new Object[] { "SIS", "SDS", "SIS", 'S', Items.dye, 'I', Items.iron_ingot, 'D', Items.diamond });
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.magicMatter),
				new Object[] { "SSS", "IDI", "SSS", 'S', Items.dye, 'I', Items.iron_ingot, 'D', Items.diamond });
		GameRegistry.addShapedRecipe(new ItemStack(Items.name_tag, 3),
				new Object[] { "S", "P", "P", 'S', Items.string, 'P', Items.paper });
		GameRegistry.addShapedRecipe(new ItemStack(Items.saddle),
				new Object[] { "LLL", "LLL", "  I", 'L', Items.leather, 'I', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor),
				new Object[] { "  I", " SI", "III", 'I', Items.iron_ingot, 'S', Items.saddle });
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor),
				new Object[] { "  G", " SG", "GGG", 'G', Items.gold_ingot, 'S', Items.saddle });
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor),
				new Object[] { "  D", " SD", "DDD", 'D', Items.diamond, 'S', Items.saddle });
		GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), new Object[] { "ODO", "DMD", "ODO", 'O',
				Blocks.obsidian, 'D', Items.diamond, 'M', ItemLoader.magicMatter });
		GameRegistry.addShapedRecipe(new ItemStack(Items.lead, 3),
				new Object[] { "SSS", "SLS", "SSS", 'S', Items.string, 'L', Items.leather });
		GameRegistry.addShapedRecipe(new ItemStack(Items.flint, 32),
				new Object[] { " C ", "CIC", " C ", 'C', Items.coal, 'I', Items.iron_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(Items.slime_ball, 4),
				new Object[] { " S ", "SWS", " S ", 'S', Items.wheat_seeds, 'W', Items.water_bucket });
		GameRegistry.addShapedRecipe(new ItemStack(Items.slime_ball, 8),
				new Object[] { "SSS", "SWS", "SSS", 'S', Items.wheat_seeds, 'W', Items.water_bucket });
		GameRegistry.addShapedRecipe(new ItemStack(Items.feather),
				new Object[] { "S  ", "S  ", "S  ", 'S', Items.string });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice),
				new Object[] { " S ", "SWS", " S ", 'S', Items.snowball, 'W', Items.water_bucket });
		// Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ItemLoader.magicMatter, 9), BlockLoader.magicMatterBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds), Items.wheat);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.brick, 4), Blocks.brick_block);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), Blocks.glowstone);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), Blocks.wool);
	}
}
