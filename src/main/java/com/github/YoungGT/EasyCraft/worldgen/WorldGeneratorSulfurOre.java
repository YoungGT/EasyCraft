package com.github.YoungGT.EasyCraft.worldgen;

import java.util.Random;

import com.github.YoungGT.EasyCraft.block.BlockLoader;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class WorldGeneratorSulfurOre extends WorldGenerator {
	private final WorldGenerator sulfurOreGenerator = new WorldGenMinable(BlockLoader.sulfurOre.getDefaultState(), 16);

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		if (TerrainGen.generateOre(worldIn, rand, this, position, OreGenEvent.GenerateMinable.EventType.CUSTOM)) {
			for (int i = 0; i < 18; ++i) {
				int posX = position.getX() + rand.nextInt(16);
				int posY = 10 + rand.nextInt(60);
				int posZ = position.getZ() + rand.nextInt(16);
				BlockPos blockPos = new BlockPos(posX, posY, posZ);
				sulfurOreGenerator.generate(worldIn, rand, blockPos);
			}
		}
		return true;
	}

}
