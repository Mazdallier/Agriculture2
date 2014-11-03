package com.teammetallurgy.agriculture.machine.oven;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.teammetallurgy.agriculture.Agriculture;
import com.teammetallurgy.metallurgycore.machines.BlockMetallurgyCore;

public class BlockOven extends BlockMetallurgyCore
{

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityOven();
    }

    @Override
    protected void doOnActivate(World world, int x, int y, int z, EntityPlayer player, int side, float xOffset, float yOffset, float zOffset)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public CreativeTabs getCreativeTabToDisplayOn()
    {
        return Agriculture.instance.creativeTabBlock;
    }

}
