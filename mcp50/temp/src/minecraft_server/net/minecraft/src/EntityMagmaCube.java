// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntitySlime, World, Item

public class EntityMagmaCube extends EntitySlime
{

    public EntityMagmaCube(World p_i469_1_)
    {
        super(p_i469_1_);
        field_9119_aG = "/mob/lava.png";
        field_9079_ae = true;
        field_35194_aj = 0.2F;
    }

    public boolean func_155_a()
    {
        return field_9093_l.field_804_l > 0 && field_9093_l.func_522_a(field_312_v) && field_9093_l.func_481_a(this, field_312_v).size() == 0 && !field_9093_l.func_469_b(field_312_v);
    }

    public int func_40092_O()
    {
        return func_25027_m() * 3;
    }

    public float func_108_b(float p_108_1_)
    {
        return 1.0F;
    }

    protected String func_40120_w()
    {
        return "flame";
    }

    protected EntitySlime func_40114_y()
    {
        return new EntityMagmaCube(field_9093_l);
    }

    protected int func_149_g()
    {
        return Item.field_40228_bv.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = func_149_g();
        if(i > 0 && func_25027_m() > 1)
        {
            int j = field_9064_W.nextInt(4) - 2;
            if(p_21047_2_ > 0)
            {
                j += field_9064_W.nextInt(p_21047_2_ + 1);
            }
            for(int k = 0; k < j; k++)
            {
                func_128_a(i, 1);
            }

        }
    }

    public boolean func_40035_z()
    {
        return false;
    }

    protected int func_40115_A()
    {
        return super.func_40115_A() * 4;
    }

    protected void func_40116_B()
    {
        field_40122_a = field_40122_a * 0.9F;
    }

    protected void func_154_F()
    {
        field_318_p = 0.42F + (float)func_25027_m() * 0.1F;
        field_35151_ca = true;
    }

    protected void func_114_a(float f)
    {
    }

    protected boolean func_40119_C()
    {
        return true;
    }

    protected int func_40113_D()
    {
        return super.func_40113_D() + 2;
    }

    protected String func_6100_e()
    {
        return "mob.slime";
    }

    protected String func_6098_f()
    {
        return "mob.slime";
    }

    protected String func_40118_E()
    {
        if(func_25027_m() > 1)
        {
            return "mob.magmacube.big";
        } else
        {
            return "mob.magmacube.small";
        }
    }

    public boolean func_112_q()
    {
        return false;
    }

    protected boolean func_40121_G()
    {
        return true;
    }
}
