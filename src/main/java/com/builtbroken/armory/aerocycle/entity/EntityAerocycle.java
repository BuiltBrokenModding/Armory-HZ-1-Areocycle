package com.builtbroken.armory.aerocycle.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.UUID;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 1/5/2019.
 */
public class EntityAerocycle extends EntityLiving
{
    public UUID owner;
    public String ownerName;

    public float bladeRotation;

    public EntityAerocycle(World worldIn)
    {
        super(worldIn);
        this.preventEntitySpawning = true;
        this.setSize(0.98F, 1.55F);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        Vec3d vec3d1 = new Vec3d(this.posX, this.posY + 1, this.posZ);
        Vec3d vec3d = new Vec3d(this.posX, this.posY - 0.1, this.posZ);
        RayTraceResult raytraceresult = this.world.rayTraceBlocks(vec3d1, vec3d, false, true, false);

        isAirBorne = raytraceresult == null || raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    @Override
    public void travel(float strafe, float vertical, float forward)
    {
        if (!isInWater())
        {
            Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
            if (this.isBeingRidden() && this.canBeSteered())
            {
                //Sync rotation
                this.prevRotationYaw = this.rotationYaw = entity.rotationYaw;
                this.rotationPitch = entity.rotationPitch * 0.5F;
                this.setRotation(this.rotationYaw, this.rotationPitch);
                this.rotationYawHead = this.renderYawOffset = this.rotationYaw;

                //Set jump height
                this.stepHeight = 0;
                this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

                //Do movement
                if (this.canPassengerSteer())
                {
                    //Set speed
                    float speed = (float) this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
                    this.setAIMoveSpeed(speed);

                    //Get vertical movement
                    float v = entity.rotationPitch / 180f;
                    super.travel(0.0F, -v * 4, 1.0F);
                }
                else
                {
                    this.motionX *= 0.98D;
                    this.motionY *= 0.98D;
                    this.motionZ *= 0.98D;
                    move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
                }

                //Do animation
                this.prevLimbSwingAmount = this.limbSwingAmount;
                double d1 = this.posX - this.prevPosX;
                double d0 = this.posZ - this.prevPosZ;
                float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
                if (f1 > 1.0F)
                {
                    f1 = 1.0F;
                }
                this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
                this.limbSwing += this.limbSwingAmount;
            }
            else
            {
                this.stepHeight = 0.5F;
                this.jumpMovementFactor = 0.02F;
                super.travel(strafe, vertical, forward);
            }
        }
        else
        {
            this.motionY -= 0.03999999910593033D;
            move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
        }
    }

    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);
        //TODO drop inventory if we add one
    }

    @Override
    public boolean hasNoGravity()
    {
        return super.hasNoGravity() || isBeingRidden(); //TODO check if engine is running
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        if(!super.processInteract(player, hand))
        {
            if (!this.isBeingRidden())
            {
                if (!this.world.isRemote)
                {
                    player.startRiding(this);
                }
                return true;
            }

            //TODO insert fuel
            return false;
        }
        return true;
    }

    @Override
    public void fall(float distance, float damageMultiplier)
    {
        //TODO add collision sound
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean canBeSteered()
    {
        return true;
    }

    @Override
    @Nullable
    public Entity getControllingPassenger()
    {
        return this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
    }

    @Override
    public boolean canPassengerSteer()
    {
        return getControllingPassenger() instanceof EntityPlayer;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void applyOrientationToEntity(Entity entityToUpdate)
    {

    }

    @Override
    public double getMountedYOffset()
    {
        return 1.8D;
    }

    @Override
    public boolean shouldRiderSit()
    {
        return false;
    }
}
