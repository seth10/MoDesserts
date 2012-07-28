// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            TileEntity, Block, BlockPistonMoving, World, 
//            Entity, Facing, NBTTagCompound

public class TileEntityPiston extends TileEntity
{

    private int field_31016_a;
    private int field_31014_b;
    private int field_31020_c;
    private boolean field_31019_i;
    private boolean field_31018_j;
    private float field_31017_k;
    private float field_31015_l;
    private static List field_31013_m = new ArrayList();

    public TileEntityPiston()
    {
    }

    public TileEntityPiston(int p_i485_1_, int p_i485_2_, int p_i485_3_, boolean p_i485_4_, boolean p_i485_5_)
    {
        field_31016_a = p_i485_1_;
        field_31014_b = p_i485_2_;
        field_31020_c = p_i485_3_;
        field_31019_i = p_i485_4_;
        field_31018_j = p_i485_5_;
    }

    public int func_31012_a()
    {
        return field_31016_a;
    }

    public int func_31005_e()
    {
        return field_31014_b;
    }

    public boolean func_31010_c()
    {
        return field_31019_i;
    }

    public int func_31008_d()
    {
        return field_31020_c;
    }

    public float func_31007_a(float p_31007_1_)
    {
        if(p_31007_1_ > 1.0F)
        {
            p_31007_1_ = 1.0F;
        }
        return field_31015_l + (field_31017_k - field_31015_l) * p_31007_1_;
    }

    private void func_31009_a(float p_31009_1_, float p_31009_2_)
    {
        if(!field_31019_i)
        {
            p_31009_1_--;
        } else
        {
            p_31009_1_ = 1.0F - p_31009_1_;
        }
        AxisAlignedBB axisalignedbb = Block.field_9048_ac.func_31032_a(field_479_a, field_478_b, field_483_c, field_482_d, field_31016_a, p_31009_1_, field_31020_c);
        if(axisalignedbb != null)
        {
            List list = field_479_a.func_450_b(null, axisalignedbb);
            if(!list.isEmpty())
            {
                field_31013_m.addAll(list);
                Entity entity;
                for(Iterator iterator = field_31013_m.iterator(); iterator.hasNext(); entity.func_88_c(p_31009_2_ * (float)Facing.field_31051_b[field_31020_c], p_31009_2_ * (float)Facing.field_31054_c[field_31020_c], p_31009_2_ * (float)Facing.field_31053_d[field_31020_c]))
                {
                    entity = (Entity)iterator.next();
                }

                field_31013_m.clear();
            }
        }
    }

    public void func_31011_k()
    {
        if(field_31015_l < 1.0F && field_479_a != null)
        {
            field_31015_l = field_31017_k = 1.0F;
            field_479_a.func_513_l(field_478_b, field_483_c, field_482_d);
            func_31003_h();
            if(field_479_a.func_444_a(field_478_b, field_483_c, field_482_d) == Block.field_9048_ac.field_573_bc)
            {
                field_479_a.func_507_b(field_478_b, field_483_c, field_482_d, field_31016_a, field_31014_b);
            }
        }
    }

    public void func_184_b()
    {
        field_31015_l = field_31017_k;
        if(field_31015_l >= 1.0F)
        {
            func_31009_a(1.0F, 0.25F);
            field_479_a.func_513_l(field_478_b, field_483_c, field_482_d);
            func_31003_h();
            if(field_479_a.func_444_a(field_478_b, field_483_c, field_482_d) == Block.field_9048_ac.field_573_bc)
            {
                field_479_a.func_507_b(field_478_b, field_483_c, field_482_d, field_31016_a, field_31014_b);
            }
            return;
        }
        field_31017_k += 0.5F;
        if(field_31017_k >= 1.0F)
        {
            field_31017_k = 1.0F;
        }
        if(field_31019_i)
        {
            func_31009_a(field_31017_k, (field_31017_k - field_31015_l) + 0.0625F);
        }
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        field_31016_a = p_186_1_.func_395_d("blockId");
        field_31014_b = p_186_1_.func_395_d("blockData");
        field_31020_c = p_186_1_.func_395_d("facing");
        field_31015_l = field_31017_k = p_186_1_.func_389_f("progress");
        field_31019_i = p_186_1_.func_402_l("extending");
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_405_a("blockId", field_31016_a);
        p_188_1_.func_405_a("blockData", field_31014_b);
        p_188_1_.func_405_a("facing", field_31020_c);
        p_188_1_.func_390_a("progress", field_31015_l);
        p_188_1_.func_393_a("extending", field_31019_i);
    }

}
