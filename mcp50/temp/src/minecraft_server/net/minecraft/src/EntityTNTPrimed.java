// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, World, NBTTagCompound

public class EntityTNTPrimed extends Entity
{

    public int field_446_a;

    public EntityTNTPrimed(World p_i399_1_)
    {
        super(p_i399_1_);
        field_446_a = 0;
        field_329_e = true;
        func_113_a(0.98F, 0.98F);
        field_9076_H = field_298_E / 2.0F;
    }

    public EntityTNTPrimed(World p_i400_1_, double p_i400_2_, double p_i400_4_, double p_i400_6_)
    {
        this(p_i400_1_);
        func_86_a(p_i400_2_, p_i400_4_, p_i400_6_);
        float f = (float)(Math.random() * 3.1415927410125732D * 2D);
        field_319_o = -(float)Math.sin(f) * 0.02F;
        field_318_p = 0.20000000298023224D;
        field_317_q = -(float)Math.cos(f) * 0.02F;
        field_446_a = 80;
        field_9092_m = p_i400_2_;
        field_9091_n = p_i400_4_;
        field_9090_o = p_i400_6_;
    }

    protected void func_21044_a()
    {
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    public boolean func_129_c_()
    {
        return !field_304_B;
    }

    public void func_106_b_()
    {
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_318_p -= 0.039999999105930328D;
        func_88_c(field_319_o, field_318_p, field_317_q);
        field_319_o *= 0.98000001907348633D;
        field_318_p *= 0.98000001907348633D;
        field_317_q *= 0.98000001907348633D;
        if(field_9086_A)
        {
            field_319_o *= 0.69999998807907104D;
            field_317_q *= 0.69999998807907104D;
            field_318_p *= -0.5D;
        }
        if(field_446_a-- <= 0)
        {
            if(!field_9093_l.field_792_x)
            {
                func_118_j();
                func_178_b();
            } else
            {
                func_118_j();
            }
        } else
        {
            field_9093_l.func_514_a("smoke", field_322_l, field_321_m + 0.5D, field_320_n, 0.0D, 0.0D, 0.0D);
        }
    }

    private void func_178_b()
    {
        float f = 4F;
        field_9093_l.func_12013_a(null, field_322_l, field_321_m, field_320_n, f);
    }

    protected void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_409_a("Fuse", (byte)field_446_a);
    }

    protected void func_99_b(NBTTagCompound p_99_1_)
    {
        field_446_a = p_99_1_.func_408_b("Fuse");
    }
}
