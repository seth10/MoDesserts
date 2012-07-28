// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityPlayer, PlayerCapabilities, World, Block, 
//            EntityPlayerMP, Packet53BlockChange, NetServerHandler, ItemStack, 
//            InventoryPlayer, WorldServer

public class ItemInWorldManager
{

    public World field_674_b;
    public EntityPlayer field_675_a;
    private int field_35699_c;
    private float field_672_d;
    private int field_22055_d;
    private int field_22054_g;
    private int field_22053_h;
    private int field_22052_i;
    private int field_22051_j;
    private boolean field_22050_k;
    private int field_22049_l;
    private int field_22048_m;
    private int field_22047_n;
    private int field_22046_o;

    public ItemInWorldManager(World p_i496_1_)
    {
        field_35699_c = -1;
        field_672_d = 0.0F;
        field_674_b = p_i496_1_;
    }

    public void func_35696_a(int p_35696_1_)
    {
        field_35699_c = p_35696_1_;
        if(p_35696_1_ == 0)
        {
            field_675_a.field_35214_K.field_35659_c = false;
            field_675_a.field_35214_K.field_35658_b = false;
            field_675_a.field_35214_K.field_35657_d = false;
            field_675_a.field_35214_K.field_35660_a = false;
        } else
        {
            field_675_a.field_35214_K.field_35659_c = true;
            field_675_a.field_35214_K.field_35657_d = true;
            field_675_a.field_35214_K.field_35660_a = true;
        }
        field_675_a.func_50022_L();
    }

    public int func_35697_a()
    {
        return field_35699_c;
    }

    public boolean func_35698_b()
    {
        return field_35699_c == 1;
    }

    public void func_35695_b(int p_35695_1_)
    {
        if(field_35699_c == -1)
        {
            field_35699_c = p_35695_1_;
        }
        func_35696_a(field_35699_c);
    }

    public void func_328_a()
    {
        field_22051_j++;
        if(field_22050_k)
        {
            int i = field_22051_j - field_22046_o;
            int j = field_674_b.func_444_a(field_22049_l, field_22048_m, field_22047_n);
            if(j != 0)
            {
                Block block = Block.field_542_n[j];
                float f = block.func_254_a(field_675_a) * (float)(i + 1);
                if(f >= 1.0F)
                {
                    field_22050_k = false;
                    func_325_c(field_22049_l, field_22048_m, field_22047_n);
                }
            } else
            {
                field_22050_k = false;
            }
        }
    }

    public void func_324_a(int p_324_1_, int p_324_2_, int p_324_3_, int p_324_4_)
    {
        if(func_35698_b())
        {
            if(!field_674_b.func_48093_a(null, p_324_1_, p_324_2_, p_324_3_, p_324_4_))
            {
                func_325_c(p_324_1_, p_324_2_, p_324_3_);
            }
            return;
        }
        field_674_b.func_48093_a(null, p_324_1_, p_324_2_, p_324_3_, p_324_4_);
        field_22055_d = field_22051_j;
        int i = field_674_b.func_444_a(p_324_1_, p_324_2_, p_324_3_);
        if(i > 0)
        {
            Block.field_542_n[i].func_235_b(field_674_b, p_324_1_, p_324_2_, p_324_3_, field_675_a);
        }
        if(i > 0 && Block.field_542_n[i].func_254_a(field_675_a) >= 1.0F)
        {
            func_325_c(p_324_1_, p_324_2_, p_324_3_);
        } else
        {
            field_22054_g = p_324_1_;
            field_22053_h = p_324_2_;
            field_22052_i = p_324_3_;
        }
    }

    public void func_22045_b(int p_22045_1_, int p_22045_2_, int p_22045_3_)
    {
        if(p_22045_1_ == field_22054_g && p_22045_2_ == field_22053_h && p_22045_3_ == field_22052_i)
        {
            int i = field_22051_j - field_22055_d;
            int j = field_674_b.func_444_a(p_22045_1_, p_22045_2_, p_22045_3_);
            if(j != 0)
            {
                Block block = Block.field_542_n[j];
                float f = block.func_254_a(field_675_a) * (float)(i + 1);
                if(f >= 0.7F)
                {
                    func_325_c(p_22045_1_, p_22045_2_, p_22045_3_);
                } else
                if(!field_22050_k)
                {
                    field_22050_k = true;
                    field_22049_l = p_22045_1_;
                    field_22048_m = p_22045_2_;
                    field_22047_n = p_22045_3_;
                    field_22046_o = field_22055_d;
                }
            }
        }
        field_672_d = 0.0F;
    }

    public boolean func_323_b(int p_323_1_, int p_323_2_, int p_323_3_)
    {
        Block block = Block.field_542_n[field_674_b.func_444_a(p_323_1_, p_323_2_, p_323_3_)];
        int i = field_674_b.func_446_b(p_323_1_, p_323_2_, p_323_3_);
        boolean flag = field_674_b.func_508_d(p_323_1_, p_323_2_, p_323_3_, 0);
        if(block != null && flag)
        {
            block.func_251_a(field_674_b, p_323_1_, p_323_2_, p_323_3_, i);
        }
        return flag;
    }

    public boolean func_325_c(int p_325_1_, int p_325_2_, int p_325_3_)
    {
        int i = field_674_b.func_444_a(p_325_1_, p_325_2_, p_325_3_);
        int j = field_674_b.func_446_b(p_325_1_, p_325_2_, p_325_3_);
        field_674_b.func_28101_a(field_675_a, 2001, p_325_1_, p_325_2_, p_325_3_, i + (field_674_b.func_446_b(p_325_1_, p_325_2_, p_325_3_) << 12));
        boolean flag = func_323_b(p_325_1_, p_325_2_, p_325_3_);
        if(func_35698_b())
        {
            ((EntityPlayerMP)field_675_a).field_20908_a.func_39_b(new Packet53BlockChange(p_325_1_, p_325_2_, p_325_3_, field_674_b));
        } else
        {
            ItemStack itemstack = field_675_a.func_172_B();
            boolean flag1 = field_675_a.func_167_b(Block.field_542_n[i]);
            if(itemstack != null)
            {
                itemstack.func_25124_a(i, p_325_1_, p_325_2_, p_325_3_, field_675_a);
                if(itemstack.field_853_a == 0)
                {
                    itemstack.func_577_a(field_675_a);
                    field_675_a.func_164_C();
                }
            }
            if(flag && flag1)
            {
                Block.field_542_n[i].func_12007_g(field_674_b, field_675_a, p_325_1_, p_325_2_, p_325_3_, j);
            }
        }
        return flag;
    }

    public boolean func_6154_a(EntityPlayer p_6154_1_, World p_6154_2_, ItemStack p_6154_3_)
    {
        int i = p_6154_3_.field_853_a;
        int j = p_6154_3_.func_21125_h();
        ItemStack itemstack = p_6154_3_.func_6168_a(p_6154_2_, p_6154_1_);
        if(itemstack != p_6154_3_ || itemstack != null && itemstack.field_853_a != i || itemstack != null && itemstack.func_35614_l() > 0)
        {
            p_6154_1_.field_416_aj.field_496_a[p_6154_1_.field_416_aj.field_499_d] = itemstack;
            if(func_35698_b())
            {
                itemstack.field_853_a = i;
                itemstack.func_28145_b(j);
            }
            if(itemstack.field_853_a == 0)
            {
                p_6154_1_.field_416_aj.field_496_a[p_6154_1_.field_416_aj.field_499_d] = null;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_327_a(EntityPlayer p_327_1_, World p_327_2_, ItemStack p_327_3_, int p_327_4_, int p_327_5_, int p_327_6_, int p_327_7_)
    {
        int i = p_327_2_.func_444_a(p_327_4_, p_327_5_, p_327_6_);
        if(i > 0 && Block.field_542_n[i].func_246_a(p_327_2_, p_327_4_, p_327_5_, p_327_6_, p_327_1_))
        {
            return true;
        }
        if(p_327_3_ == null)
        {
            return false;
        }
        if(func_35698_b())
        {
            int j = p_327_3_.func_21125_h();
            int k = p_327_3_.field_853_a;
            boolean flag = p_327_3_.func_572_a(p_327_1_, p_327_2_, p_327_4_, p_327_5_, p_327_6_, p_327_7_);
            p_327_3_.func_28145_b(j);
            p_327_3_.field_853_a = k;
            return flag;
        } else
        {
            return p_327_3_.func_572_a(p_327_1_, p_327_2_, p_327_4_, p_327_5_, p_327_6_, p_327_7_);
        }
    }

    public void func_35694_a(WorldServer p_35694_1_)
    {
        field_674_b = p_35694_1_;
    }
}
