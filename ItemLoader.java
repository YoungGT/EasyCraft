package com.github.YoungGT.EasyCraft.item;

import com.github.YoungGT.EasyCraft.EasyCraft;
import com.github.YoungGT.EasyCraft.block.BlockLoader;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static MetaItems magicMatter = new MetaItems("magicMatter");
	
	public ItemLoader(FMLPreInitializationEvent event) {
		register(magicMatter);
	}

	private static void register(MetaItems aItems) {
		GameRegistry.registerItem(aItems.setRegistryName(aItems.mName));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders(){
		registerRender(magicMatter);
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item){
		ModelResourceLocation model=new ModelResourceLocation(item.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);
	}
	
}
