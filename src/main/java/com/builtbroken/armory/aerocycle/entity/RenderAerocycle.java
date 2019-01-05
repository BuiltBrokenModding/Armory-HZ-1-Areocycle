package com.builtbroken.armory.aerocycle.entity;

import com.builtbroken.armory.aerocycle.Aerocycle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 1/5/2019.
 */
@SideOnly(Side.CLIENT)
public class RenderAerocycle extends Render<EntityAerocycle>
{
    public static final ModelAerocycle MODEL = new ModelAerocycle();
    public static final ResourceLocation TEXTURE = new ResourceLocation(Aerocycle.DOMAIN, "textures/entity/areocycle.png");

    public RenderAerocycle(RenderManager renderManager)
    {
        super(renderManager);
    }

    @Override
    public void doRender(EntityAerocycle entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        GlStateManager.pushMatrix();

        //Set position and rotation
        GlStateManager.translate(x, y + 1.5f, z);
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(entityYaw, 0, 1, 0);

        //Rotate blades
        if(entity.isAirBorne || entity.isBeingRidden()) //TODO add engine check
        {
            entity.bladeRotation += 10 * partialTicks;
        }
        else if(entity.bladeRotation > 1)
        {
            entity.bladeRotation *= 0.85;
        }
        else
        {
            entity.bladeRotation = 0;
        }

        //Texture and render
        //GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        bindEntityTexture(entity);
        MODEL.render(0.0625F, entity.bladeRotation);

        GlStateManager.popMatrix();
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityAerocycle entity)
    {
        return TEXTURE;
    }

    @Override
    public boolean shouldRender(EntityAerocycle livingEntity, ICamera camera, double camX, double camY, double camZ)
    {
        return super.shouldRender(livingEntity, camera, camX, camY, camZ);
        //return true;
    }
}
