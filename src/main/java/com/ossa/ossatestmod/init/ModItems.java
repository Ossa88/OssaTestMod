package com.ossa.ossatestmod.init;

import com.ossa.ossatestmod.item.ItemCore;
import com.ossa.ossatestmod.item.ItemMapleLeaf;
import com.ossa.ossatestmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)	
public class ModItems 
{
	public static final ItemCore mapleLeaf = new ItemMapleLeaf();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
