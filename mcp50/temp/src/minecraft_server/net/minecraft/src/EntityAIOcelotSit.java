// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityOcelot, PathNavigate, EntityAISit, 
//            World, Block, TileEntityChest, BlockBed

public class EntityAIOcelotSit extends EntityAIBase
{

    private final EntityOcelot field_50019_a;
    private final float field_50017_b;
    private int field_50018_c;
    private int field_52005_h;
    private int field_50015_d;
    private int field_50016_e;
    private int field_50013_f;
    private int field_50014_g;

    public EntityAIOcelotSit(EntityOcelot p_i1200_1_, float p_i1200_2_)
    {
        field_50018_c = 0;
        field_52005_h = 0;
        field_50015_d = 0;
        field_50016_e = 0;
        field_50013_f = 0;
        field_50014_g = 0;
        field_50019_a = p_i1200_1_;
        field_50017_b = p_i1200_2_;
        func_46087_a(5);
    }

    public boolean func_46090_a()
    {
        return field_50019_a.func_48373_u_() && !field_50019_a.func_48371_v_() && field_50019_a.func_46019_ai().nextDouble() <= 0.0065000001341104507D && func_50012_f();
    }

    public boolean func_46092_g()
    {
        return field_50018_c <= field_50015_d && field_52005_h <= 60 && func_50011_a(field_50019_a.field_9093_l, field_50016_e, field_50013_f, field_50014_g);
    }

    public void func_46088_e()
    {
        field_50019_a.func_48333_ak().func_48658_a((double)(float)field_50016_e + 0.5D, field_50013_f + 1, (double)(float)field_50014_g + 0.5D, field_50017_b);
        field_50018_c = 0;
        field_52005_h = 0;
        field_50015_d = field_50019_a.func_46019_ai().nextInt(field_50019_a.func_46019_ai().nextInt(1200) + 1200) + 1200;
        field_50019_a.func_50021_C().func_48210_a(false);
    }

    public void func_46085_d()
    {
        field_50019_a.func_48369_c(false);
    }

    public void func_46089_b()
    {
        field_50018_c++;
        field_50019_a.func_50021_C().func_48210_a(false);
        if(field_50019_a.func_101_d(field_50016_e, field_50013_f + 1, field_50014_g) > 1.0D)
        {
            field_50019_a.func_48369_c(false);
            field_50019_a.func_48333_ak().func_48658_a((double)(float)field_50016_e + 0.5D, field_50013_f + 1, (double)(float)field_50014_g + 0.5D, field_50017_b);
            field_52005_h++;
        } else
        if(!field_50019_a.func_48371_v_())
        {
            field_50019_a.func_48369_c(true);
        } else
        {
            field_52005_h--;
        }
    }

    private boolean func_50012_f()
    {
        int i = (int)field_50019_a.field_321_m;
        double d = 2147483647D;
        for(int j = (int)field_50019_a.field_322_l - 8; (double)j < field_50019_a.field_322_l + 8D; j++)
        {
            for(int k = (int)field_50019_a.field_320_n - 8; (double)k < field_50019_a.field_320_n + 8D; k++)
            {
                if(!func_50011_a(field_50019_a.field_9093_l, j, i, k) || !field_50019_a.field_9093_l.func_20111_e(j, i + 1, k))
                {
                    continue;
                }
                double d1 = field_50019_a.func_101_d(j, i, k);
                if(d1 < d)
                {
                    field_50016_e = j;
                    field_50013_f = i;
                    field_50014_g = k;
                    d = d1;
                }
            }

        }

        return d < 2147483647D;
    }

    private boolean func_50011_a(World p_50011_1_, int p_50011_2_, int p_50011_3_, int p_50011_4_)
    {
        int i = p_50011_1_.func_444_a(p_50011_2_, p_50011_3_, p_50011_4_);
        int j = p_50011_1_.func_446_b(p_50011_2_, p_50011_3_, p_50011_4_);
        if(i == Block.field_593_av.field_573_bc)
        {
            TileEntityChest tileentitychest = (TileEntityChest)p_50011_1_.func_451_k(p_50011_2_, p_50011_3_, p_50011_4_);
            if(tileentitychest.field_35176_h < 1)
            {
                return true;
            }
        } else
        {
            if(i == Block.field_641_aD.field_573_bc)
            {
                return true;
            }
            if(i == Block.field_9037_S.field_573_bc && !BlockBed.func_22020_d(j))
            {
                return true;
            }
        }
        return false;
    }
}
