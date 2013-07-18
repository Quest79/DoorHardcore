package pad.mods.hardoor;

import pad.mods.hardoor.items.Items16;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = HardcoreDoor.modID, name = "HardDoor", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HardcoreDoor {

	/* Mod setup and information */
	public static HardcoreDoor instance;
	public static final String modID = "HardDoor";
	
	/* New Items section */
	public final static Item hinge = new Items16(4000).setUnlocalizedName("Hinge2");
	public final static Item woodpanel = new Items16(4001).setUnlocalizedName("woodpanel");
	public final static Item iscrews = new Items16(4002).setUnlocalizedName("iscrews");
	public final static Item hinge2 = new Items16(4003).setUnlocalizedName("Hinge3");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		/* Language Registery */
		LanguageRegistry.addName(hinge, "Hinge");
		LanguageRegistry.addName(woodpanel, "Wooden Panel");
		LanguageRegistry.addName(hinge2, "Hinge with Iron Screws");
		LanguageRegistry.addName(iscrews, "Iron Screws");
				
		/* Recipes */
		GameRegistry.addRecipe(new ItemStack(hinge, 1), new Object[]{"xxx", "x  ", "xxx", 'x', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(woodpanel, 1), new Object[]{"xx ", "xx ", "xx ", 'x', Block.wood});
		GameRegistry.addRecipe(new ItemStack(iscrews, 1), new Object[]{" x ", "xxx", " x ", 'x', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(hinge2, 1), new Object[]{"x x", "xcx", "x x", 'x', iscrews, 'c', hinge});
		GameRegistry.addRecipe(new ItemStack(Block.doorWood, 1), new Object[]{"xcc", "xcc", "xcc", 'x', hinge2, 'c', woodpanel});
		
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
