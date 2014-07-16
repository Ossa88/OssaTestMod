package com.ossa.ossatestmod.block;

import com.ossa.ossatestmod.creativetab.CreativeTabOTM;
import com.ossa.ossatestmod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCore extends Block
{

	public BlockCore(Material material)
	{
		super(material); 
        this.setCreativeTab(CreativeTabOTM.OTM_TAB);
	}

	public BlockCore()
	{
		this(Material.rock);
	}
	
	@Override
    public String getUnlocalizedName()
    {
		//tile.modid:blockname.name
        return String.format("tile.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    
}
