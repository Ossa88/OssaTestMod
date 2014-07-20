package com.ossa.ossatestmod;

// Internal Imports

import net.minecraftforge.oredict.OreDictionary;

import com.ossa.ossatestmod.handler.ConfigurationHandler;
import com.ossa.ossatestmod.init.ModBlocks;
import com.ossa.ossatestmod.init.ModItems;
import com.ossa.ossatestmod.proxy.IProxy;
import com.ossa.ossatestmod.reference.Reference;
import com.ossa.ossatestmod.utility.LogHelper;

// Forge Imports




import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OssaTestMod 
{
	@Mod.Instance(Reference.MODID)
	public static OssaTestMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		LogHelper.info("Pre Initialization Complete!");
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());	
		
		ModItems.init();
		
		ModBlocks.init();
	}
			
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
		
		/* For Ore Library debugging
		for (String oreName : OreDictionary.getOreNames())
		{
			// Returns all ore names in use
			LogHelper.info(oreName);
			// Returns Items Stacks Registered Under a particular ore name
			OreDictionary.getOres(oreName);
		}
		*/
	}
}