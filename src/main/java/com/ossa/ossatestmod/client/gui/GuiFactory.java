package com.ossa.ossatestmod.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory
{

	@Override
	public void initialize(Minecraft minecraftInstance) 
	{
		// TODO Auto-generated method stub
		// Not Currently In Use
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() 
	{
		// TODO Auto-generated method stub
		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
	{
		// TODO Auto-generated method stub
		// Not Currently In Use
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
	{
		// TODO Auto-generated method stub
		// Not Currently In Use
		return null;
	}

}
