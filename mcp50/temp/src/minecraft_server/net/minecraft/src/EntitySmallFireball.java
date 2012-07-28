// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFireball, World, MovingObjectPosition, Entity, 
//            DamageSource, Block, BlockFire, EntityLiving

public class EntitySmallFireball extends EntityFireball
{

    public EntitySmallFireball(World p_i532_1_)
    {
        super(p_i532_1_);
        func_113_a(0.3125F, 0.3125F);
    }

    public EntitySmallFireball(World p_i533_1_, EntityLiving p_i533_2_, double p_i533_3_, double p_i533_5_, double p_i533_7_)
    {
        super(p_i533_1_, p_i533_2_, p_i533_3_, p_i533_5_, p_i533_7_);
        func_113_a(0.3125F, 0.3125F);
    }

    public EntitySmallFireball(World p_i1087_1_, double p_i1087_2_, double p_i1087_4_, double p_i1087_6_, 
            double p_i1087_8_, double p_i1087_10_, double p_i1087_12_)
    {
        super(p_i1087_1_, p_i1087_2_, p_i1087_4_, p_i1087_6_, p_i1087_8_, p_i1087_10_, p_i1087_12_);
        func_113_a(0.3125F, 0.3125F);
    }

    protected void func_40063_a(MovingObjectPosition p_40063_1_)
    {
        if(!field_9093_l.field_792_x)
        {
            if(p_40063_1_.field_928_g != null)
            {
                if(!p_40063_1_.field_928_g.func_40033_ax() && p_40063_1_.field_928_g.func_121_a(DamageSource.func_35082_a(this, field_9191_am), 5))
                {
                    p_40063_1_.field_928_g.func_40034_j(5);
                }
            } else
            {
                int i = p_40063_1_.field_926_b;
                int j = p_40063_1_.field_932_c;
                int k = p_40063_1_.field_931_d;
                switch(p_40063_1_.field_930_e)
                {
                case 1: // '\001'
                    j++;
                    break;

                case 0: // '\0'
                    j--;
                    break;

                case 2: // '\002'
                    k--;
                    break;

                case 3: // '\003'
                    k++;
                    break;

                case 5: // '\005'
                    i++;
                    break;

                case 4: // '\004'
                    i--;
                    break;
                }
                if(field_9093_l.func_20111_e(i, j, k))
                {
                    field_9093_l.func_508_d(i, j, k, Block.field_599_as.field_573_bc);
                }
            }
            func_118_j();
        }
    }

    public boolean func_129_c_()
    {
        return false;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        return false;
    }
}
