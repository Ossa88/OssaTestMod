package com.ossa.ossatestmod.init;

import com.ossa.ossatestmod.block.BlockCore;
import com.ossa.ossatestmod.block.BlockFlag;
import com.ossa.ossatestmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	@GameRegistry.ObjectHolder(Reference.MODID)
	public static final BlockCore flag = new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
	
}
