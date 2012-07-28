// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, PathEntity, 
//            PathPoint, MathHelper, World, Block, 
//            BlockDoor

public abstract class EntityAIDoorInteract extends EntityAIBase
{

    protected EntityLiving field_48192_a;
    protected int field_48190_b;
    protected int field_48191_c;
    protected int field_48188_d;
    protected BlockDoor field_48189_e;
    boolean field_48186_f;
    float field_48187_g;
    float field_48193_h;

    public EntityAIDoorInteract(EntityLiving p_i1058_1_)
    {
        field_48192_a = p_i1058_1_;
    }

    public boolean func_46090_a()
    {
        if(!field_48192_a.field_9084_B)
        {
            return false;
        }
        PathNavigate pathnavigate = field_48192_a.func_48333_ak();
        PathEntity pathentity = pathnavigate.func_48668_c();
        if(pathentity == null || pathentity.func_729_b() || !pathnavigate.func_48657_b())
        {
            return false;
        }
        for(int i = 0; i < Math.min(pathentity.func_48423_e() + 2, pathentity.func_48424_d()); i++)
        {
            PathPoint pathpoint = pathentity.func_48429_a(i);
            field_48190_b = pathpoint.field_1016_a;
            field_48191_c = pathpoint.field_1015_b + 1;
            field_48188_d = pathpoint.field_1014_c;
            if(field_48192_a.func_101_d(field_48190_b, field_48192_a.field_321_m, field_48188_d) > 2.25D)
            {
                continue;
            }
            field_48189_e = func_48185_a(field_48190_b, field_48191_c, field_48188_d);
            if(field_48189_e != null)
            {
                return true;
            }
        }

        field_48190_b = MathHelper.func_584_b(field_48192_a.field_322_l);
        field_48191_c = MathHelper.func_584_b(field_48192_a.field_321_m + 1.0D);
        field_48188_d = MathHelper.func_584_b(field_48192_a.field_320_n);
        field_48189_e = func_48185_a(field_48190_b, field_48191_c, field_48188_d);
        return field_48189_e != null;
    }

    public boolean func_46092_g()
    {
        return !field_48186_f;
    }

    public void func_46088_e()
    {
        field_48186_f = false;
        field_48187_g = (float)((double)((float)field_48190_b + 0.5F) - field_48192_a.field_322_l);
        field_48193_h = (float)((double)((float)field_48188_d + 0.5F) - field_48192_a.field_320_n);
    }

    public void func_46089_b()
    {
        float f = (float)((double)((float)field_48190_b + 0.5F) - field_48192_a.field_322_l);
        float f1 = (float)((double)((float)field_48188_d + 0.5F) - field_48192_a.field_320_n);
        float f2 = field_48187_g * f + field_48193_h * f1;
        if(f2 < 0.0F)
        {
            field_48186_f = true;
        }
    }

    private BlockDoor func_48185_a(int p_48185_1_, int p_48185_2_, int p_48185_3_)
    {
        int i = field_48192_a.field_9093_l.func_444_a(p_48185_1_, p_48185_2_, p_48185_3_);
        if(i != Block.field_639_aF.field_573_bc)
        {
            return null;
        } else
        {
            BlockDoor blockdoor = (BlockDoor)Block.field_542_n[i];
            return blockdoor;
        }
    }
}
