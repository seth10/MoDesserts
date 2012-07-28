// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, MathHelper, World, 
//            Block, BlockTallGrass, BlockGrass, PathNavigate

public class EntityAIEatGrass extends EntityAIBase
{

    private EntityLiving field_48228_b;
    private World field_48229_c;
    int field_48230_a;

    public EntityAIEatGrass(EntityLiving p_i1041_1_)
    {
        field_48230_a = 0;
        field_48228_b = p_i1041_1_;
        field_48229_c = p_i1041_1_.field_9093_l;
        func_46087_a(7);
    }

    public boolean func_46090_a()
    {
        if(field_48228_b.func_46019_ai().nextInt(field_48228_b.func_40104_l() ? 50 : 1000) != 0)
        {
            return false;
        }
        int i = MathHelper.func_584_b(field_48228_b.field_322_l);
        int j = MathHelper.func_584_b(field_48228_b.field_321_m);
        int k = MathHelper.func_584_b(field_48228_b.field_320_n);
        if(field_48229_c.func_444_a(i, j, k) == Block.field_9031_X.field_573_bc && field_48229_c.func_446_b(i, j, k) == 1)
        {
            return true;
        }
        return field_48229_c.func_444_a(i, j - 1, k) == Block.field_534_v.field_573_bc;
    }

    public void func_46088_e()
    {
        field_48230_a = 40;
        field_48229_c.func_9206_a(field_48228_b, (byte)10);
        field_48228_b.func_48333_ak().func_48662_f();
    }

    public void func_46085_d()
    {
        field_48230_a = 0;
    }

    public boolean func_46092_g()
    {
        return field_48230_a > 0;
    }

    public int func_48227_f()
    {
        return field_48230_a;
    }

    public void func_46089_b()
    {
        field_48230_a = Math.max(0, field_48230_a - 1);
        if(field_48230_a != 4)
        {
            return;
        }
        int i = MathHelper.func_584_b(field_48228_b.field_322_l);
        int j = MathHelper.func_584_b(field_48228_b.field_321_m);
        int k = MathHelper.func_584_b(field_48228_b.field_320_n);
        if(field_48229_c.func_444_a(i, j, k) == Block.field_9031_X.field_573_bc)
        {
            field_48229_c.func_28097_e(2001, i, j, k, Block.field_9031_X.field_573_bc + 4096);
            field_48229_c.func_508_d(i, j, k, 0);
            field_48228_b.func_48319_z();
        } else
        if(field_48229_c.func_444_a(i, j - 1, k) == Block.field_534_v.field_573_bc)
        {
            field_48229_c.func_28097_e(2001, i, j - 1, k, Block.field_534_v.field_573_bc);
            field_48229_c.func_508_d(i, j - 1, k, Block.field_533_w.field_573_bc);
            field_48228_b.func_48319_z();
        }
    }
}
