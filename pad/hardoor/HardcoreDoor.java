package pad.hardoor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="HCD", name="Hardcoredoor", version="0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired=false)

public class HardcoreDoor {
	
	//Instance of Mod
	public static HardcoreDoor instance;
	
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
