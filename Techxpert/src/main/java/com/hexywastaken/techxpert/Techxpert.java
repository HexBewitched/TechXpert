package com.hexywastaken.techxpert;

import com.hexywastaken.techxpert.init.BlockInit;
import com.hexywastaken.techxpert.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("techxpert")
public class Techxpert {
	
	public static final String MOD_ID = "techxpert";
	
	public static final CreativeModeTab TECHXPERT_TOOLS = new CreativeModeTab(MOD_ID + "_tools") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return null;
		}
	};
	
	public static final CreativeModeTab TECHXPERT_MATERIALS = new CreativeModeTab(MOD_ID + "_materials ") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.ALUMINUM_INGOT.get());
		}
	};
	
	public Techxpert() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
