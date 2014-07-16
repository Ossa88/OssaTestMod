package com.ossa.ossatestmod.creativetab;

import com.ossa.ossatestmod.init.ModItems;
import com.ossa.ossatestmod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOTM 
{
	public static final CreativeTabs OTM_TAB = new CreativeTabs(Reference.MODID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
	};
}
