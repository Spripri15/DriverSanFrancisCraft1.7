package net.mod.driversanfranciscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.mod.driversanfranciscraft.DriverSanFrancisCraft;
import net.mod.driversanfranciscraft.Reference;

public class Items
{
	public static Item JurassicParkJeep;
	
	public static void init()
	{
		JurassicParkJeep = new Item().setCreativeTab(DriverSanFrancisCraft.tabDriverSanFrancisCraft).setUnlocalizedName("jp_jeep").setMaxStackSize(16).setTextureName(Reference.MOD_ID + ":/vehicles/cars/JPjeep");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(JurassicParkJeep, "jp_jeep");
	}
}
