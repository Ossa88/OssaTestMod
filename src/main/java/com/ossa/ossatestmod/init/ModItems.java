package com.ossa.ossatestmod.init;

import com.ossa.ossatestmod.item.ItemCore;
import com.ossa.ossatestmod.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemCore mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
		
	}
}
