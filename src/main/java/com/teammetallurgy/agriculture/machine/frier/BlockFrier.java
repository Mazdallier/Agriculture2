package com.teammetallurgy.agriculture.machine.frier;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.teammetallurgy.agriculture.Agriculture;
import com.teammetallurgy.agriculture.machine.BlockBaseMachine;
import com.teammetallurgy.agriculture.utils.GuiIds;

public class BlockFrier extends BlockBaseMachine
{

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityFrier();
    }

    @Override
    protected void doOnActivate(World world, int x, int y, int z, EntityPlayer player, int side, float xOffset, float yOffset, float zOffset)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);

        if (!(tileEntity instanceof TileEntityFrier)) return;

        if (side == 1)
        {
            player.openGui(Agriculture.instance, GuiIds.FRIER, world, x, y, z);
        }
        else
        {
            player.openGui(Agriculture.instance, GuiIds.FUEL, world, x, y, z);
        }

    }

}