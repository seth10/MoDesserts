// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NibbleArray, Block

public class ExtendedBlockStorage
{

    private int field_48615_a;
    private int field_48613_b;
    private int field_48614_c;
    private byte field_48611_d[];
    private NibbleArray field_48612_e;
    private NibbleArray field_48609_f;
    private NibbleArray field_48610_g;
    private NibbleArray field_48616_h;

    public ExtendedBlockStorage(int p_i1040_1_)
    {
        field_48615_a = p_i1040_1_;
        field_48611_d = new byte[4096];
        field_48609_f = new NibbleArray(field_48611_d.length, 4);
        field_48616_h = new NibbleArray(field_48611_d.length, 4);
        field_48610_g = new NibbleArray(field_48611_d.length, 4);
    }

    public int func_48591_a(int p_48591_1_, int p_48591_2_, int p_48591_3_)
    {
        int i = field_48611_d[p_48591_2_ << 8 | p_48591_3_ << 4 | p_48591_1_] & 0xff;
        if(field_48612_e != null)
        {
            return field_48612_e.func_562_a(p_48591_1_, p_48591_2_, p_48591_3_) << 8 | i;
        } else
        {
            return i;
        }
    }

    public void func_48588_a(int p_48588_1_, int p_48588_2_, int p_48588_3_, int p_48588_4_)
    {
        int i = field_48611_d[p_48588_2_ << 8 | p_48588_3_ << 4 | p_48588_1_] & 0xff;
        if(field_48612_e != null)
        {
            i = field_48612_e.func_562_a(p_48588_1_, p_48588_2_, p_48588_3_) << 8 | i;
        }
        if(i == 0 && p_48588_4_ != 0)
        {
            field_48613_b++;
            if(Block.field_542_n[p_48588_4_] != null && Block.field_542_n[p_48588_4_].func_48125_m())
            {
                field_48614_c++;
            }
        } else
        if(i != 0 && p_48588_4_ == 0)
        {
            field_48613_b--;
            if(Block.field_542_n[i] != null && Block.field_542_n[i].func_48125_m())
            {
                field_48614_c--;
            }
        } else
        if(Block.field_542_n[i] != null && Block.field_542_n[i].func_48125_m() && (Block.field_542_n[p_48588_4_] == null || !Block.field_542_n[p_48588_4_].func_48125_m()))
        {
            field_48614_c--;
        } else
        if((Block.field_542_n[i] == null || !Block.field_542_n[i].func_48125_m()) && Block.field_542_n[p_48588_4_] != null && Block.field_542_n[p_48588_4_].func_48125_m())
        {
            field_48614_c++;
        }
        field_48611_d[p_48588_2_ << 8 | p_48588_3_ << 4 | p_48588_1_] = (byte)(p_48588_4_ & 0xff);
        if(p_48588_4_ > 255)
        {
            if(field_48612_e == null)
            {
                field_48612_e = new NibbleArray(field_48611_d.length, 4);
            }
            field_48612_e.func_561_a(p_48588_1_, p_48588_2_, p_48588_3_, (p_48588_4_ & 0xf00) >> 8);
        } else
        if(field_48612_e != null)
        {
            field_48612_e.func_561_a(p_48588_1_, p_48588_2_, p_48588_3_, 0);
        }
    }

    public int func_48598_b(int p_48598_1_, int p_48598_2_, int p_48598_3_)
    {
        return field_48609_f.func_562_a(p_48598_1_, p_48598_2_, p_48598_3_);
    }

    public void func_48585_b(int p_48585_1_, int p_48585_2_, int p_48585_3_, int p_48585_4_)
    {
        field_48609_f.func_561_a(p_48585_1_, p_48585_2_, p_48585_3_, p_48585_4_);
    }

    public boolean func_48595_a()
    {
        return field_48613_b == 0;
    }

    public boolean func_48607_b()
    {
        return field_48614_c > 0;
    }

    public int func_48597_c()
    {
        return field_48615_a;
    }

    public void func_48592_c(int p_48592_1_, int p_48592_2_, int p_48592_3_, int p_48592_4_)
    {
        field_48616_h.func_561_a(p_48592_1_, p_48592_2_, p_48592_3_, p_48592_4_);
    }

    public int func_48602_c(int p_48602_1_, int p_48602_2_, int p_48602_3_)
    {
        return field_48616_h.func_562_a(p_48602_1_, p_48602_2_, p_48602_3_);
    }

    public void func_48608_d(int p_48608_1_, int p_48608_2_, int p_48608_3_, int p_48608_4_)
    {
        field_48610_g.func_561_a(p_48608_1_, p_48608_2_, p_48608_3_, p_48608_4_);
    }

    public int func_48604_d(int p_48604_1_, int p_48604_2_, int p_48604_3_)
    {
        return field_48610_g.func_562_a(p_48604_1_, p_48604_2_, p_48604_3_);
    }

    public void func_48599_d()
    {
        field_48613_b = 0;
        field_48614_c = 0;
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                for(int k = 0; k < 16; k++)
                {
                    int l = func_48591_a(i, j, k);
                    if(l <= 0)
                    {
                        continue;
                    }
                    if(Block.field_542_n[l] == null)
                    {
                        field_48611_d[j << 8 | k << 4 | i] = 0;
                        if(field_48612_e != null)
                        {
                            field_48612_e.func_561_a(i, j, k, 0);
                        }
                        continue;
                    }
                    field_48613_b++;
                    if(Block.field_542_n[l].func_48125_m())
                    {
                        field_48614_c++;
                    }
                }

            }

        }

    }

    public void func_48603_e()
    {
    }

    public int func_48587_f()
    {
        return field_48613_b;
    }

    public byte[] func_48590_g()
    {
        return field_48611_d;
    }

    public NibbleArray func_48601_h()
    {
        return field_48612_e;
    }

    public NibbleArray func_48594_i()
    {
        return field_48609_f;
    }

    public NibbleArray func_48600_j()
    {
        return field_48610_g;
    }

    public NibbleArray func_48605_k()
    {
        return field_48616_h;
    }

    public void func_48596_a(byte p_48596_1_[])
    {
        field_48611_d = p_48596_1_;
    }

    public void func_48593_a(NibbleArray p_48593_1_)
    {
        field_48612_e = p_48593_1_;
    }

    public void func_48586_b(NibbleArray p_48586_1_)
    {
        field_48609_f = p_48586_1_;
    }

    public void func_48606_c(NibbleArray p_48606_1_)
    {
        field_48610_g = p_48606_1_;
    }

    public void func_48589_d(NibbleArray p_48589_1_)
    {
        field_48616_h = p_48589_1_;
    }
}
