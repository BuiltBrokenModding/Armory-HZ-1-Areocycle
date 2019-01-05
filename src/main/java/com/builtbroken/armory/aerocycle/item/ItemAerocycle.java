package com.builtbroken.armory.aerocycle.item;

import com.builtbroken.armory.aerocycle.Aerocycle;
import com.builtbroken.armory.aerocycle.entity.EntityAerocycle;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 1/5/2019.
 */
public class ItemAerocycle extends Item
{
    public ItemAerocycle()
    {
        setTranslationKey(Aerocycle.PREFIX + "areocycle");
        setRegistryName(Aerocycle.DOMAIN, "areocycle");
        setCreativeTab(CreativeTabs.TRANSPORTATION);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        final ItemStack itemstack = player.getHeldItem(hand);
        if(worldIn.isRemote)
        {
            return EnumActionResult.SUCCESS;
        }
        else if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            EntityAerocycle areoCycle = new EntityAerocycle(worldIn);
            areoCycle.setPosition(pos.getX() + hitX, pos.getY() + 1, pos.getZ() + hitZ);
            //TODO rotate to face pilot
            //TODO load save data
            worldIn.spawnEntity(areoCycle);
        }
        return EnumActionResult.SUCCESS;
    }
}
