package com.builtbroken.armory.aerocycle.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * HZ-1 Aerocycle - M1W3ST
 * Created using Tabula 7.0.0
 */
@SideOnly(Side.CLIENT)
public class ModelAerocycle extends ModelBase
{
    public ModelRenderer Platform;
    public ModelRenderer shape10;
    public ModelRenderer shape4;
    public ModelRenderer Battery;
    public ModelRenderer FlagPlatform;
    public ModelRenderer rottorsconnector;
    public ModelRenderer TopBladesConector;
    public ModelRenderer BottomBladesConector;
    public ModelRenderer LandingGear;
    public ModelRenderer TopBlades;
    public ModelRenderer BottomBlades;
    public ModelRenderer shape20;
    public ModelRenderer shape20_1;
    public ModelRenderer shape22;
    public ModelRenderer shape22_1;
    public ModelRenderer shape24;
    public ModelRenderer shape24_1;
    public ModelRenderer shape24_2;
    public ModelRenderer shape24_3;
    public ModelRenderer shape28;
    public ModelRenderer shape28_1;
    public ModelRenderer shape30;
    public ModelRenderer shape30_1;
    public ModelRenderer shape30_2;
    public ModelRenderer shape30_3;
    public ModelRenderer shape5;
    public ModelRenderer shape3;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape34;
    public ModelRenderer shape35;
    public ModelRenderer shape17;
    public ModelRenderer shape18;
    public ModelRenderer FlagPole;
    public ModelRenderer Flag;

    public ModelAerocycle() {
    this.textureWidth = 230;
    this.textureHeight = 150;
    this.FlagPlatform = new ModelRenderer(this, 0, 16);
    this.FlagPlatform.setRotationPoint(-5.5F, -2.0F, 8.5F);
    this.FlagPlatform.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
    this.Platform = new ModelRenderer(this, 157, 69);
    this.Platform.setRotationPoint(0.0F, 0.1F, 0.0F);
    this.Platform.addBox(-7.0F, -1.0F, -10.0F, 14, 2, 20, 0.0F);
    this.FlagPole = new ModelRenderer(this, 19, 28);
    this.FlagPole.setRotationPoint(-0.5F, -7.0F, -0.5F);
    this.FlagPole.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    this.shape6 = new ModelRenderer(this, 0, 0);
    this.shape6.setRotationPoint(0.0F, -14.0F, 0.0F);
    this.shape6.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
    this.TopBlades = new ModelRenderer(this, 0, 100);
    this.TopBlades.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.TopBlades.addBox(-50.0F, -0.5F, -1.5F, 100, 1, 3, 0.0F);
    this.shape28 = new ModelRenderer(this, 0, 56);
    this.shape28.setRotationPoint(-0.5F, 8.4F, -9.0F);
    this.shape28.addBox(0.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F);
    this.BottomBlades = new ModelRenderer(this, 0, 100);
    this.BottomBlades.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.BottomBlades.addBox(-50.0F, -0.5F, -1.5F, 100, 1, 3, 0.0F);
    this.shape22 = new ModelRenderer(this, 0, 76);
    this.shape22.setRotationPoint(12.5F, 0.0F, 0.0F);
    this.shape22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    this.shape24_2 = new ModelRenderer(this, 0, 71);
    this.shape24_2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape24_2.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
    this.setRotateAngle(shape24_2, -0.3490658503988659F, 0.0F, 0.0F);
    this.BottomBladesConector = new ModelRenderer(this, 0, 86);
    this.BottomBladesConector.setRotationPoint(0.0F, 7.5F, 0.0F);
    this.BottomBladesConector.addBox(-2.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F);
    this.shape8_1 = new ModelRenderer(this, 40, 0);
    this.shape8_1.setRotationPoint(-2.0F, -1.0F, 0.0F);
    this.shape8_1.addBox(-6.0F, -1.5F, -1.5F, 6, 3, 3, 0.0F);
    this.setRotateAngle(shape8_1, 0.0F, 0.17453292519943295F, 0.0F);
    this.rottorsconnector = new ModelRenderer(this, 0, 47);
    this.rottorsconnector.setRotationPoint(0.0F, 4.0F, 8.0F);
    this.rottorsconnector.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
    this.shape24_1 = new ModelRenderer(this, 0, 71);
    this.shape24_1.setRotationPoint(-25.0F, 0.0F, 0.0F);
    this.shape24_1.addBox(0.0F, 0.0F, -1.0F, 1, 9, 1, 0.0F);
    this.shape4 = new ModelRenderer(this, 30, 87);
    this.shape4.setRotationPoint(0.0F, -1.0F, -7.5F);
    this.shape4.addBox(-2.5F, -3.0F, -2.5F, 5, 3, 5, 0.0F);
    this.TopBladesConector = new ModelRenderer(this, 0, 86);
    this.TopBladesConector.setRotationPoint(0.0F, 3.0F, 0.0F);
    this.TopBladesConector.addBox(-2.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F);
    this.shape34 = new ModelRenderer(this, 0, 0);
    this.shape34.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.shape34.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
    this.shape30 = new ModelRenderer(this, 0, 76);
    this.shape30.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.shape30.addBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F);
    this.setRotateAngle(shape30, -2.2689280275926285F, 0.0F, 0.0F);
    this.shape17 = new ModelRenderer(this, 0, 30);
    this.shape17.setRotationPoint(0.5F, -10.9F, 0.5F);
    this.shape17.addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
    this.shape5 = new ModelRenderer(this, 0, 0);
    this.shape5.setRotationPoint(0.0F, -3.0F, 0.0F);
    this.shape5.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F);
    this.shape22_1 = new ModelRenderer(this, 0, 76);
    this.shape22_1.setRotationPoint(-12.5F, 0.0F, 0.0F);
    this.shape22_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    this.shape7 = new ModelRenderer(this, 0, 0);
    this.shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape7.addBox(-3.0F, -2.0F, -1.0F, 6, 2, 2, 0.0F);
    this.shape8 = new ModelRenderer(this, 40, 0);
    this.shape8.setRotationPoint(2.0F, -1.0F, 0.0F);
    this.shape8.addBox(0.0F, -1.5F, -1.5F, 6, 3, 3, 0.0F);
    this.setRotateAngle(shape8, 0.0F, -0.17453292519943295F, 0.0F);
    this.shape20_1 = new ModelRenderer(this, 0, 80);
    this.shape20_1.setRotationPoint(0.0F, 0.5F, -3.0F);
    this.shape20_1.addBox(-12.5F, 0.0F, 0.0F, 25, 1, 1, 0.0F);
    this.shape24_3 = new ModelRenderer(this, 0, 71);
    this.shape24_3.setRotationPoint(25.0F, 0.0F, 0.0F);
    this.shape24_3.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
    this.setRotateAngle(shape24_3, -0.3490658503988659F, 0.0F, 0.0F);
    this.shape24 = new ModelRenderer(this, 0, 71);
    this.shape24.setRotationPoint(0.0F, 0.0F, 6.0F);
    this.shape24.addBox(0.0F, 0.0F, -1.0F, 1, 9, 1, 0.0F);
    this.setRotateAngle(shape24, 0.3490658503988659F, 0.0F, 0.0F);
    this.shape20 = new ModelRenderer(this, 0, 80);
    this.shape20.setRotationPoint(0.0F, 0.5F, 2.0F);
    this.shape20.addBox(-12.5F, 0.0F, 0.0F, 25, 1, 1, 0.0F);
    this.shape30_3 = new ModelRenderer(this, 0, 76);
    this.shape30_3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape30_3.addBox(-25.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    this.shape18 = new ModelRenderer(this, 0, 30);
    this.shape18.setRotationPoint(0.0F, 3.0F, 2.0F);
    this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    this.shape28_1 = new ModelRenderer(this, 0, 56);
    this.shape28_1.setRotationPoint(25.0F, 0.0F, 0.0F);
    this.shape28_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F);
    this.shape35 = new ModelRenderer(this, 87, 63);
    this.shape35.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.shape35.addBox(-4.0F, -3.0F, 0.0F, 8, 6, 2, 0.0F);
    this.setRotateAngle(shape35, 0.5235987755982988F, 0.0F, 0.0F);
    this.Battery = new ModelRenderer(this, 34, 62);
    this.Battery.setRotationPoint(-5.5F, -6.0F, -10.0F);
    this.Battery.addBox(0.0F, 0.0F, 0.0F, 3, 5, 7, 0.0F);
    this.shape30_2 = new ModelRenderer(this, 0, 76);
    this.shape30_2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape30_2.addBox(-25.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F);
    this.shape10 = new ModelRenderer(this, 94, 71);
    this.shape10.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.shape10.addBox(-5.0F, 1.0F, 0.0F, 10, 4, 16, 0.0F);
    this.shape3 = new ModelRenderer(this, 44, 0);
    this.shape3.setRotationPoint(0.0F, -0.8F, 0.0F);
    this.shape3.addBox(-1.5F, -11.0F, -1.5F, 3, 11, 3, 0.0F);
    this.Flag = new ModelRenderer(this, 15, 12);
    this.Flag.setRotationPoint(0.5F, 0.0F, 1.0F);
    this.Flag.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 5, 0.0F);
    this.LandingGear = new ModelRenderer(this, 59, 74);
    this.LandingGear.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.LandingGear.addBox(-3.5F, 0.0F, -3.5F, 7, 2, 7, 0.0F);
    this.shape30_1 = new ModelRenderer(this, 0, 76);
    this.shape30_1.setRotationPoint(0.0F, 1.0F, 24.0F);
    this.shape30_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    this.setRotateAngle(shape30_1, 2.2689280275926285F, 0.0F, 0.0F);
    this.Platform.addChild(this.FlagPlatform);
    this.FlagPlatform.addChild(this.FlagPole);
    this.shape3.addChild(this.shape6);
    this.TopBladesConector.addChild(this.TopBlades);
    this.shape22_1.addChild(this.shape28);
    this.BottomBladesConector.addChild(this.BottomBlades);
    this.shape20_1.addChild(this.shape22);
    this.shape22_1.addChild(this.shape24_2);
    this.rottorsconnector.addChild(this.BottomBladesConector);
    this.shape7.addChild(this.shape8_1);
    this.shape10.addChild(this.rottorsconnector);
    this.shape24.addChild(this.shape24_1);
    this.Platform.addChild(this.shape4);
    this.rottorsconnector.addChild(this.TopBladesConector);
    this.shape7.addChild(this.shape34);
    this.shape28_1.addChild(this.shape30);
    this.Battery.addChild(this.shape17);
    this.shape4.addChild(this.shape5);
    this.shape20_1.addChild(this.shape22_1);
    this.shape6.addChild(this.shape7);
    this.shape7.addChild(this.shape8);
    this.LandingGear.addChild(this.shape20_1);
    this.shape22_1.addChild(this.shape24_3);
    this.shape22.addChild(this.shape24);
    this.LandingGear.addChild(this.shape20);
    this.shape30_1.addChild(this.shape30_3);
    this.shape17.addChild(this.shape18);
    this.shape28.addChild(this.shape28_1);
    this.shape34.addChild(this.shape35);
    this.Platform.addChild(this.Battery);
    this.shape30.addChild(this.shape30_2);
    this.Platform.addChild(this.shape10);
    this.shape5.addChild(this.shape3);
    this.FlagPole.addChild(this.Flag);
    this.rottorsconnector.addChild(this.LandingGear);
    this.shape28_1.addChild(this.shape30_1);
}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        render(f5, 0);
    }

    public void render(float scale, float bladeAngle)
    {
        this.Platform.render(scale);

        //Reset
        this.TopBlades.rotateAngleY = 0;
        this.BottomBlades.rotateAngleY = 0;

        //Apply rotation
        this.TopBlades.rotateAngleY += bladeAngle;
        this.BottomBlades.rotateAngleY += -bladeAngle;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
