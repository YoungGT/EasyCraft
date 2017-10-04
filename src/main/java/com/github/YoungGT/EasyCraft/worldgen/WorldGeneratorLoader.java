package com.github.YoungGT.EasyCraft.worldgen;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;

public class WorldGeneratorLoader {
	private static WorldGenerator generatorSulfurOre = new WorldGeneratorSulfurOre();
	private int aX, aZ;

	public WorldGeneratorLoader() {
		MinecraftForge.ORE_GEN_BUS.register(this);
	}

	@SubscribeEvent
	public void onOreGenPost(OreGenEvent.Post event) {
		this.aX = event.worldX;
		this.aZ = event.worldZ;
		generatorSulfurOre.generate(event.world, event.rand, event.worldX, 0, event.worldZ);
	}
}
