package pad.mods.hardoor;

import pad.mods.hardoor.items.ItemTutorial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = HardcoreDoor.modID, name = "HardDoor", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HardcoreDoor {

	/* Mod setup and information */
	public static HardcoreDoor instance;
	public static final String modID = "HardDoor";
	
	/* New Items and block secion */
	public final static Item itemTutorial = new ItemTutorial(4000).setUnlocalizedName("itemtutorial");
	public final static Item itemTutorial2 = new ItemTutorial(4001).setUnlocalizedName("itemtutorial2");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		LanguageRegistry.addName(itemTutorial, "Tutorial Item");
		LanguageRegistry.addName(itemTutorial2, "Tutorial Item 2");
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
