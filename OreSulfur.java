package com.github.YoungGT.EasyCraft.block;

import java.util.Random;

import com.github.YoungGT.EasyCraft.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OreSulfur extends Block {
	public OreSulfur() {
		super(Material.ROCK);
		setUnlocalizedName("sulfurOre");
		setHardness(2.0F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
		setResistance(10);
		setCreativeTab(CreativeTabsLoader.tabEasyCraft);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.GUNPOWDER;
	}
	@Override
	public int quantityDropped(Random random) {
		return 4;
	}
}