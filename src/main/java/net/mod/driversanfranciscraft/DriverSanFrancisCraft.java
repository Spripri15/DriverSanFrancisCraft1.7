package net.mod.driversanfranciscraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
	
	@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
	
	public class DriverSanFrancisCraft 
{
		@Instance(Reference.MOD_ID)
	    public static DriverSanFrancisCraft instance;
		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
		public static net.mod.driversanfranciscraft.proxy.CommonProxy proxy;
		
		@EventHandler 
		public void preInit(FMLPreInitializationEvent event)
		{
			
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.registerRenderers();
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{

		}
		
	}

