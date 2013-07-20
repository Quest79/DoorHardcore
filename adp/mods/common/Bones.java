package adp.mods.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="ModIDName", name="ModName", version="Version")
@NetworkMod(clientSideRequired = true, serverSideRequired=false)

public class Bones {
	
	/* Instance of Mod */
	public static Bones instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	
	}
	
	@EventHandler
	public void load(FMLLoadEvent event){		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	@EventHandler
	public void ServerStart(FMLServerStartingEvent event){
		
	}
	
}
