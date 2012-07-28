// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityWolf, World, EntityPlayer, 
//            EntityLookHelper, InventoryPlayer, ItemStack, Item

public class EntityAIBeg extends EntityAIBase
{

    private EntityWolf field_48147_a;
    private EntityPlayer field_48145_b;
    private World field_48146_c;
    private float field_48143_d;
    private int field_48144_e;

    public EntityAIBeg(EntityWolf p_i1028_1_, float p_i1028_2_)
    {
        field_48147_a = p_i1028_1_;
        field_48146_c = p_i1028_1_.field_9093_l;
        field_48143_d = p_i1028_2_;
        func_46087_a(2);
    }

    public boolean func_46090_a()
    {
        field_48145_b = field_48146_c.func_472_a(field_48147_a, field_48143_d);
        if(field_48145_b == null)
        {
            return false;
        } else
        {
            return func_48142_a(field_48145_b);
        }
    }

    public boolean func_46092_g()
    {
        if(!field_48145_b.func_120_t())
        {
            return false;
        }
        if(field_48147_a.func_102_b(field_48145_b) > (double)(field_48143_d * field_48143_d))
        {
            return false;
        } else
        {
            return field_48144_e > 0 && func_48142_a(field_48145_b);
        }
    }

    public void func_46088_e()
    {
        field_48147_a.func_48378_e(true);
        field_48144_e = 40 + field_48147_a.func_46019_ai().nextInt(40);
    }

    public void func_46085_d()
    {
        field_48147_a.func_48378_e(false);
        field_48145_b = null;
    }

    public void func_46089_b()
    {
        field_48147_a.func_46021_ae().func_46060_a(field_48145_b.field_322_l, field_48145_b.field_321_m + (double)field_48145_b.func_104_p(), field_48145_b.field_320_n, 10F, field_48147_a.func_25018_n_());
        field_48144_e--;
    }

    private boolean func_48142_a(EntityPlayer p_48142_1_)
    {
        ItemStack itemstack = p_48142_1_.field_416_aj.func_213_b();
        if(itemstack == null)
        {
            return false;
        }
        if(!field_48147_a.func_48373_u_() && itemstack.field_855_c == Item.field_21096_aV.field_234_aS)
        {
            return true;
        } else
        {
            return field_48147_a.func_40134_a(itemstack);
        }
    }
}
