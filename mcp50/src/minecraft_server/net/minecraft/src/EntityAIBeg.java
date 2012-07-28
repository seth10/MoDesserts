package net.minecraft.src;

import java.util.Random;

public class EntityAIBeg extends EntityAIBase
{
    private EntityWolf theWolf;
    private EntityPlayer field_48145_b;
    private World worldObject;
    private float minPlayerDistance;
    private int field_48144_e;

    public EntityAIBeg(EntityWolf par1EntityWolf, float par2)
    {
        theWolf = par1EntityWolf;
        worldObject = par1EntityWolf.worldObj;
        minPlayerDistance = par2;
        setMutexBits(2);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        field_48145_b = worldObject.getClosestPlayerToEntity(theWolf, minPlayerDistance);

        if (field_48145_b == null)
        {
            return false;
        }
        else
        {
            return func_48142_a(field_48145_b);
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        if (!field_48145_b.isEntityAlive())
        {
            return false;
        }

        if (theWolf.getDistanceSqToEntity(field_48145_b) > (double)(minPlayerDistance * minPlayerDistance))
        {
            return false;
        }
        else
        {
            return field_48144_e > 0 && func_48142_a(field_48145_b);
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        theWolf.func_48378_e(true);
        field_48144_e = 40 + theWolf.getRNG().nextInt(40);
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        theWolf.func_48378_e(false);
        field_48145_b = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        theWolf.getLookHelper().setLookPosition(field_48145_b.posX, field_48145_b.posY + (double)field_48145_b.getEyeHeight(), field_48145_b.posZ, 10F, theWolf.getVerticalFaceSpeed());
        field_48144_e--;
    }

    private boolean func_48142_a(EntityPlayer par1EntityPlayer)
    {
        ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();

        if (itemstack == null)
        {
            return false;
        }

        if (!theWolf.isTamed() && itemstack.itemID == Item.bone.shiftedIndex)
        {
            return true;
        }
        else
        {
            return theWolf.isWheat(itemstack);
        }
    }
}
