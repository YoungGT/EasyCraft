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

public class BlockMagicMatter extends Block {
	public BlockMagicMatter() {
		super(Material.rock);
		setBlockName("magicMatterBlock");
		setHardness(2.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 3);
		setResistance(10);
		setCreativeTab(CreativeTabsLoader.tabEasyCraft);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register) {
		blockIcon = register.registerIcon("easycraft:magicMatterBlock");
	}
}