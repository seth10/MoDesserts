// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, EntityPlayer, 
//            ItemStack, PathNavigate, EntityLookHelper

public class EntityAITempt extends EntityAIBase
{

    private EntityCreature field_48268_a;
    private float field_48266_b;
    private double field_48267_c;
    private double field_48264_d;
    private double field_48265_e;
    private double field_48262_f;
    private double field_48263_g;
    private EntityPlayer field_48273_h;
    private int field_48274_i;
    private boolean field_48271_j;
    private int field_48272_k;
    private boolean field_48269_l;
    private boolean field_48270_m;

    public EntityAITempt(EntityCreature p_i1091_1_, float p_i1091_2_, int p_i1091_3_, boolean p_i1091_4_)
    {
        field_48274_i = 0;
        field_48268_a = p_i1091_1_;
        field_48266_b = p_i1091_2_;
        field_48272_k = p_i1091_3_;
        field_48269_l = p_i1091_4_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        if(field_48274_i > 0)
        {
            field_48274_i--;
            return false;
        }
        field_48273_h = field_48268_a.field_9093_l.func_472_a(field_48268_a, 10D);
        if(field_48273_h == null)
        {
            return false;
        }
        ItemStack itemstack = field_48273_h.func_172_B();
        if(itemstack == null)
        {
            return false;
        }
        return itemstack.field_855_c == field_48272_k;
    }

    public boolean func_46092_g()
    {
        if(field_48269_l)
        {
            if(field_48268_a.func_102_b(field_48273_h) < 36D)
            {
                if(field_48273_h.func_101_d(field_48267_c, field_48264_d, field_48265_e) > 0.010000000000000002D)
                {
                    return false;
                }
                if(Math.abs((double)field_48273_h.field_315_s - field_48262_f) > 5D || Math.abs((double)field_48273_h.field_316_r - field_48263_g) > 5D)
                {
                    return false;
                }
            } else
            {
                field_48267_c = field_48273_h.field_322_l;
                field_48264_d = field_48273_h.field_321_m;
                field_48265_e = field_48273_h.field_320_n;
            }
            field_48262_f = field_48273_h.field_315_s;
            field_48263_g = field_48273_h.field_316_r;
        }
        return func_46090_a();
    }

    public void func_46088_e()
    {
        field_48267_c = field_48273_h.field_322_l;
        field_48264_d = field_48273_h.field_321_m;
        field_48265_e = field_48273_h.field_320_n;
        field_48271_j = true;
        field_48270_m = field_48268_a.func_48333_ak().func_48649_a();
        field_48268_a.func_48333_ak().func_48656_a(false);
    }

    public void func_46085_d()
    {
        field_48273_h = null;
        field_48268_a.func_48333_ak().func_48662_f();
        field_48274_i = 100;
        field_48271_j = false;
        field_48268_a.func_48333_ak().func_48656_a(field_48270_m);
    }

    public void func_46089_b()
    {
        field_48268_a.func_46021_ae().func_46058_a(field_48273_h, 30F, field_48268_a.func_25018_n_());
        if(field_48268_a.func_102_b(field_48273_h) < 6.25D)
        {
            field_48268_a.func_48333_ak().func_48662_f();
        } else
        {
            field_48268_a.func_48333_ak().func_48652_a(field_48273_h, field_48266_b);
        }
    }

    public boolean func_48261_f()
    {
        return field_48271_j;
    }
}
