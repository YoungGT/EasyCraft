package com.github.YoungGT.EasyCraft.worldgen;

import java.util.Random;

import com.github.YoungGT.EasyCraft.block.BlockLoader;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class WorldGeneratorSulfurOre extends WorldGenerator {
	private final WorldGenerator sulfurOreGenerator = new WorldGenMinable(BlockLoader.sulfurOre, 16);

	@Override
	public boolean generate(World world, Random rand, int aX, int aY, int aZ) {
		if (TerrainGen.generateOre(world, rand, this, aX, aZ, OreGenEvent.GenerateMinable.EventType.CUSTOM)) {
			for (int i = 0; i < 18; ++i) {
				int posX = aX + rand.nextInt(16);
				int posY = 10 + rand.nextInt(60);
				int posZ = aZ + rand.nextInt(16);
				sulfurOreGenerator.generate(world, rand, posX, posY, posZ);
			}
		}
		return true;
	}

}
