package com.builtbroken.armory.aerocycle;

import com.builtbroken.armory.aerocycle.entity.EntityAerocycle;
import com.builtbroken.armory.aerocycle.entity.RenderAerocycle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 1/5/2019.
 */
@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Aerocycle.DOMAIN)
public class ClientReg
{
    @SubscribeEvent
    public static void registerAllModels(ModelRegistryEvent event)
    {
        //Item
        ModelLoader.setCustomModelResourceLocation(Aerocycle.itemAreocycle, 0, new ModelResourceLocation(Aerocycle.itemAreocycle.getRegistryName(), "inventory"));

        //Entity
        RenderingRegistry.registerEntityRenderingHandler(EntityAerocycle.class, manager -> new RenderAerocycle(manager));
    }
}
