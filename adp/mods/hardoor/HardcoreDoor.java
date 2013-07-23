package adp.mods.hardoor;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import adp.mods.common.Cons;
import adp.mods.hardoor.items.Items16;
import adp.mods.hardoor.items.Items64;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Cons.MOD.ID, name = Cons.MOD.NAME, version = Cons.MOD.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HardcoreDoor {

	/* Mod setup and information */
	@Instance(Cons.MOD.ID)
	public static HardcoreDoor instance;
	
	public static CreativeTabs hcdTab = new CreativeTabs("HCD_HCDTab"){
		@Override
		public ItemStack getIconItemStack(){
			return new ItemStack(hinge);
		}
	};
	
	//int hingeID;
	
	/* New Items section */
	public final static Item hinge = new Items16(4000).setUnlocalizedName("Hinge2").setCreativeTab(hcdTab);
	public final static Item hinge2 = new Items16(4001).setUnlocalizedName("Hinge3").setCreativeTab(hcdTab);
	public final static Item iscrews = new Items16(4002).setUnlocalizedName("iscrews").setCreativeTab(hcdTab);
	public final static Item woodpanel = new Items16(4003).setUnlocalizedName("woodpanel").setCreativeTab(hcdTab);
	public final static Item nugiron = new Items64(4004).setUnlocalizedName("nug_iron").setCreativeTab(hcdTab);
	public final static Item gear1 = new Items16(4005).setUnlocalizedName("gear1").setCreativeTab(hcdTab);
	public final static Item doorknob = new Items16(4006).setUnlocalizedName("doorknob").setCreativeTab(hcdTab);
	

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){	
		this.InitLangReg();
		this.InitRecipeReg();
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

	private void InitLangReg(){
		LanguageRegistry.instance().addStringLocalization("itemGroup.HCD_HCDTab","HardDoor");
		LanguageRegistry.addName(hinge, "Hinge");
		LanguageRegistry.addName(woodpanel, "Wooden Panel");
		LanguageRegistry.addName(hinge2, "Hinge with Iron Screws");
		LanguageRegistry.addName(iscrews, "Iron Screws");
		LanguageRegistry.addName(doorknob, "Door Knob");
		LanguageRegistry.addName(gear1, "Simple Gear");
		LanguageRegistry.addName(nugiron, "Iron Nugget");
	}
	
	private void InitRecipeReg(){
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron, 1), new Object[]{
			"xxx", "xxx", "xxx", 
			'x', nugiron
			});
		
		GameRegistry.addRecipe(new ItemStack(nugiron, 9), new Object[]{
			"   ", " x ", "   ", 
			'x', Item.ingotIron
			});
		
		GameRegistry.addRecipe(new ItemStack(hinge, 1), new Object[]{
			"x x", "xxx", "x x", 
			'x', nugiron
			});
		
		GameRegistry.addRecipe(new ItemStack(woodpanel,1), new Object[]{
			"xx ", "xx ", "xx ", 
			'x', Block.wood
			});
		
		GameRegistry.addRecipe(new ItemStack(iscrews, 1), new Object[]{
			" x ", "xxx", " x ", 
			'x', nugiron
			});
		
		GameRegistry.addRecipe(new ItemStack(hinge2, 1), new Object[]{
			"x x", "xcx", "x x", 
			'x', iscrews,
			'c', hinge
			});
		
		GameRegistry.addRecipe(new ItemStack(doorknob, 1), new Object[]{
			"xx ", "cx ", "cxx", 
			'x', Item.ingotIron,
			'c', gear1
			});
		
		GameRegistry.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]{
			"ccx", "ncx", "ccx", 
			'x', hinge2, 
			'c', woodpanel,
			'n', doorknob
			});
		
		GameRegistry.addRecipe(new ItemStack(gear1, 1), new Object[]{
			" x ", "x x", " x ", 
			'x', nugiron
			});
	}
	
}
