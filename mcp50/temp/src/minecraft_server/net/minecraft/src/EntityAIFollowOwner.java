// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityTameable, PathNavigate, EntityLookHelper, 
//            EntityLiving, MathHelper, AxisAlignedBB, World

public class EntityAIFollowOwner extends EntityAIBase
{

    private EntityTameable field_48247_d;
    private EntityLiving field_48248_e;
    World field_48251_a;
    private float field_48245_f;
    private PathNavigate field_48246_g;
    private int field_48252_h;
    float field_48249_b;
    float field_48250_c;
    private boolean field_48253_i;

    public EntityAIFollowOwner(EntityTameable p_i1072_1_, float p_i1072_2_, float p_i1072_3_, float p_i1072_4_)
    {
        field_48247_d = p_i1072_1_;
        field_48251_a = p_i1072_1_.field_9093_l;
        field_48245_f = p_i1072_2_;
        field_48246_g = p_i1072_1_.func_48333_ak();
        field_48250_c = p_i1072_3_;
        field_48249_b = p_i1072_4_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        EntityLiving entityliving = field_48247_d.func_48368_w_();
        if(entityliving == null)
        {
            return false;
        }
        if(field_48247_d.func_48371_v_())
        {
            return false;
        }
        if(field_48247_d.func_102_b(entityliving) < (double)(field_48250_c * field_48250_c))
        {
            return false;
        } else
        {
            field_48248_e = entityliving;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return !field_48246_g.func_46034_b() && field_48247_d.func_102_b(field_48248_e) > (double)(field_48249_b * field_48249_b) && !field_48247_d.func_48371_v_();
    }

    public void func_46088_e()
    {
        field_48252_h = 0;
        field_48253_i = field_48247_d.func_48333_ak().func_48649_a();
        field_48247_d.func_48333_ak().func_48656_a(false);
    }

    public void func_46085_d()
    {
        field_48248_e = null;
        field_48246_g.func_48662_f();
        field_48247_d.func_48333_ak().func_48656_a(field_48253_i);
    }

    public void func_46089_b()
    {
        field_48247_d.func_46021_ae().func_46058_a(field_48248_e, 10F, field_48247_d.func_25018_n_());
        if(field_48247_d.func_48371_v_())
        {
            return;
        }
        if(--field_48252_h > 0)
        {
            return;
        }
        field_48252_h = 10;
        if(field_48246_g.func_48652_a(field_48248_e, field_48245_f))
        {
            return;
        }
        if(field_48247_d.func_102_b(field_48248_e) < 144D)
        {
            return;
        }
        int i = MathHelper.func_584_b(field_48248_e.field_322_l) - 2;
        int j = MathHelper.func_584_b(field_48248_e.field_320_n) - 2;
        int k = MathHelper.func_584_b(field_48248_e.field_312_v.field_963_b);
        for(int l = 0; l <= 4; l++)
        {
            for(int i1 = 0; i1 <= 4; i1++)
            {
                if((l < 1 || i1 < 1 || l > 3 || i1 > 3) && field_48251_a.func_445_d(i + l, k - 1, j + i1) && !field_48251_a.func_445_d(i + l, k, j + i1) && !field_48251_a.func_445_d(i + l, k + 1, j + i1))
                {
                    field_48247_d.func_107_c((float)(i + l) + 0.5F, k, (float)(j + i1) + 0.5F, field_48247_d.field_316_r, field_48247_d.field_315_s);
                    field_48246_g.func_48662_f();
                    return;
                }
            }

        }

    }
}
