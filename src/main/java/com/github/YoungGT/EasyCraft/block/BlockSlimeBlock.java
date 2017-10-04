package com.github.YoungGT.EasyCraft.block;

import java.util.Random;

import com.github.YoungGT.EasyCraft.creativetab.CreativeTabsLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockSlimeBlock extends Block {
	public BlockSlimeBlock() {
		super(Material.rock);
		setBlockName("slimeBlock");
		setHardness(1.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 1);
		setResistance(10);
		setCreativeTab(CreativeTabsLoader.tabEasyCraft);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register) {
		blockIcon = register.registerIcon("easycraft:slimeBlock");
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		// TODO 自动生成的方法存根
		return Items.slime_ball;
	}

	@Override
	public int quantityDropped(Random random) {
		// TODO 自动生成的方法存根
		return 9;
	}
}