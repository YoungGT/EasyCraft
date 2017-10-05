package com.github.YoungGT.EasyCraft.block;

import com.github.YoungGT.EasyCraft.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMagicMatter extends Block {
	public BlockMagicMatter() {
		super(Material.ROCK);
		this.setUnlocalizedName("magicMatterBlock");
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 3);
		setResistance(10);
		this.setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabsLoader.tabEasyCraft);
	}
}