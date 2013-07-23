package adp.mods.hardoor.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items64 extends Item{

	public Items64(int id){
		super(id);
		this.setMaxStackSize(64);
	}
	
	@Override
		@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("common:" + this.getUnlocalizedName().substring(5));
	}
	
}