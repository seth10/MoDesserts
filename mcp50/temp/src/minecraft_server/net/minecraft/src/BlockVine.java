// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            Direction, EntityPlayer, ItemStack, Item, 
//            ItemShears, StatList, AxisAlignedBB

public class BlockVine extends Block
{

    public BlockVine(int p_i348_1_)
    {
        super(p_i348_1_, 143, Material.field_35574_k);
        func_231_a(true);
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public int func_40161_b()
    {
        return 20;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        float f = 1.0F;
        float f1 = 1.0F;
        float f2 = 1.0F;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        boolean flag = i > 0;
        if((i & 2) != 0)
        {
            f3 = Math.max(f3, 0.0625F);
            f = 0.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
            flag = true;
        }
        if((i & 8) != 0)
        {
            f = Math.min(f, 0.9375F);
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
            flag = true;
        }
        if((i & 4) != 0)
        {
            f5 = Math.max(f5, 0.0625F);
            f2 = 0.0F;
            f = 0.0F;
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            flag = true;
        }
        if((i & 1) != 0)
        {
            f2 = Math.min(f2, 0.9375F);
            f5 = 1.0F;
            f = 0.0F;
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            flag = true;
        }
        if(!flag && func_35058_c(p_233_1_.func_444_a(p_233_2_, p_233_3_ + 1, p_233_4_)))
        {
            f1 = Math.min(f1, 0.9375F);
            f4 = 1.0F;
            f = 0.0F;
            f3 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
        }
        func_229_a(f, f1, f2, f3, f4, f5);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int p_28026_4_, int p_28026_5_)
    {
        switch(p_28026_5_)
        {
        default:
            return false;

        case 1: // '\001'
            return func_35058_c(p_28026_1_.func_444_a(p_28026_2_, p_28026_3_ + 1, p_28026_4_));

        case 2: // '\002'
            return func_35058_c(p_28026_1_.func_444_a(p_28026_2_, p_28026_3_, p_28026_4_ + 1));

        case 3: // '\003'
            return func_35058_c(p_28026_1_.func_444_a(p_28026_2_, p_28026_3_, p_28026_4_ - 1));

        case 5: // '\005'
            return func_35058_c(p_28026_1_.func_444_a(p_28026_2_ - 1, p_28026_3_, p_28026_4_));

        case 4: // '\004'
            return func_35058_c(p_28026_1_.func_444_a(p_28026_2_ + 1, p_28026_3_, p_28026_4_));
        }
    }

    private boolean func_35058_c(int p_35058_1_)
    {
        if(p_35058_1_ == 0)
        {
            return false;
        }
        Block block = Block.field_542_n[p_35058_1_];
        return block.func_28025_b() && block.field_553_bn.func_218_c();
    }

    private boolean func_35059_g(World p_35059_1_, int p_35059_2_, int p_35059_3_, int p_35059_4_)
    {
        int i = p_35059_1_.func_446_b(p_35059_2_, p_35059_3_, p_35059_4_);
        int j = i;
        if(j > 0)
        {
            for(int k = 0; k <= 3; k++)
            {
                int l = 1 << k;
                if((i & l) != 0 && !func_35058_c(p_35059_1_.func_444_a(p_35059_2_ + Direction.field_35612_a[k], p_35059_3_, p_35059_4_ + Direction.field_35610_b[k])) && (p_35059_1_.func_444_a(p_35059_2_, p_35059_3_ + 1, p_35059_4_) != field_573_bc || (p_35059_1_.func_446_b(p_35059_2_, p_35059_3_ + 1, p_35059_4_) & l) == 0))
                {
                    j &= ~l;
                }
            }

        }
        if(j == 0 && !func_35058_c(p_35059_1_.func_444_a(p_35059_2_, p_35059_3_ + 1, p_35059_4_)))
        {
            return false;
        }
        if(j != i)
        {
            p_35059_1_.func_511_b(p_35059_2_, p_35059_3_, p_35059_4_, j);
        }
        return true;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!p_234_1_.field_792_x && !func_35059_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(!p_221_1_.field_792_x && p_221_1_.field_803_m.nextInt(4) == 0)
        {
            byte byte0 = 4;
            int i = 5;
            boolean flag = false;
            int j = p_221_2_ - byte0;
label0:
            do
            {
                if(j > p_221_2_ + byte0)
                {
                    break;
                }
label1:
                for(int k = p_221_4_ - byte0; k <= p_221_4_ + byte0; k++)
                {
                    int i1 = p_221_3_ - 1;
                    do
                    {
                        if(i1 > p_221_3_ + 1)
                        {
                            continue label1;
                        }
                        if(p_221_1_.func_444_a(j, i1, k) == field_573_bc && --i <= 0)
                        {
                            flag = true;
                            break label0;
                        }
                        i1++;
                    } while(true);
                }

                j++;
            } while(true);
            j = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
            int l = p_221_1_.field_803_m.nextInt(6);
            int j1 = Direction.field_35609_d[l];
            if(l == 1 && p_221_3_ < 255 && p_221_1_.func_20111_e(p_221_2_, p_221_3_ + 1, p_221_4_))
            {
                if(flag)
                {
                    return;
                }
                int k1 = p_221_1_.field_803_m.nextInt(16) & j;
                if(k1 > 0)
                {
                    for(int j2 = 0; j2 <= 3; j2++)
                    {
                        if(!func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j2], p_221_3_ + 1, p_221_4_ + Direction.field_35610_b[j2])))
                        {
                            k1 &= ~(1 << j2);
                        }
                    }

                    if(k1 > 0)
                    {
                        p_221_1_.func_507_b(p_221_2_, p_221_3_ + 1, p_221_4_, field_573_bc, k1);
                    }
                }
            } else
            if(l >= 2 && l <= 5 && (j & 1 << j1) == 0)
            {
                if(flag)
                {
                    return;
                }
                int l1 = p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j1], p_221_3_, p_221_4_ + Direction.field_35610_b[j1]);
                if(l1 == 0 || Block.field_542_n[l1] == null)
                {
                    int k2 = j1 + 1 & 3;
                    int j3 = j1 + 3 & 3;
                    if((j & 1 << k2) != 0 && func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[k2], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[k2])))
                    {
                        p_221_1_.func_507_b(p_221_2_ + Direction.field_35612_a[j1], p_221_3_, p_221_4_ + Direction.field_35610_b[j1], field_573_bc, 1 << k2);
                    } else
                    if((j & 1 << j3) != 0 && func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[j3], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[j3])))
                    {
                        p_221_1_.func_507_b(p_221_2_ + Direction.field_35612_a[j1], p_221_3_, p_221_4_ + Direction.field_35610_b[j1], field_573_bc, 1 << j3);
                    } else
                    if((j & 1 << k2) != 0 && p_221_1_.func_20111_e(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[k2], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[k2]) && func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[k2], p_221_3_, p_221_4_ + Direction.field_35610_b[k2])))
                    {
                        p_221_1_.func_507_b(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[k2], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[k2], field_573_bc, 1 << (j1 + 2 & 3));
                    } else
                    if((j & 1 << j3) != 0 && p_221_1_.func_20111_e(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[j3], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[j3]) && func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j3], p_221_3_, p_221_4_ + Direction.field_35610_b[j3])))
                    {
                        p_221_1_.func_507_b(p_221_2_ + Direction.field_35612_a[j1] + Direction.field_35612_a[j3], p_221_3_, p_221_4_ + Direction.field_35610_b[j1] + Direction.field_35610_b[j3], field_573_bc, 1 << (j1 + 2 & 3));
                    } else
                    if(func_35058_c(p_221_1_.func_444_a(p_221_2_ + Direction.field_35612_a[j1], p_221_3_ + 1, p_221_4_ + Direction.field_35610_b[j1])))
                    {
                        p_221_1_.func_507_b(p_221_2_ + Direction.field_35612_a[j1], p_221_3_, p_221_4_ + Direction.field_35610_b[j1], field_573_bc, 0);
                    }
                } else
                if(Block.field_542_n[l1].field_553_bn.func_28128_h() && Block.field_542_n[l1].func_28025_b())
                {
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, j | 1 << j1);
                }
            } else
            if(p_221_3_ > 1)
            {
                int i2 = p_221_1_.func_444_a(p_221_2_, p_221_3_ - 1, p_221_4_);
                if(i2 == 0)
                {
                    int l2 = p_221_1_.field_803_m.nextInt(16) & j;
                    if(l2 > 0)
                    {
                        p_221_1_.func_507_b(p_221_2_, p_221_3_ - 1, p_221_4_, field_573_bc, l2);
                    }
                } else
                if(i2 == field_573_bc)
                {
                    int i3 = p_221_1_.field_803_m.nextInt(16) & j;
                    int k3 = p_221_1_.func_446_b(p_221_2_, p_221_3_ - 1, p_221_4_);
                    if(k3 != (k3 | i3))
                    {
                        p_221_1_.func_511_b(p_221_2_, p_221_3_ - 1, p_221_4_, k3 | i3);
                    }
                }
            }
        }
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        byte byte0 = 0;
        switch(p_255_5_)
        {
        case 2: // '\002'
            byte0 = 1;
            break;

        case 3: // '\003'
            byte0 = 4;
            break;

        case 4: // '\004'
            byte0 = 8;
            break;

        case 5: // '\005'
            byte0 = 2;
            break;
        }
        if(byte0 != 0)
        {
            p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, byte0);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        if(!p_12007_1_.field_792_x && p_12007_2_.func_172_B() != null && p_12007_2_.func_172_B().field_855_c == Item.field_31022_bc.field_234_aS)
        {
            p_12007_2_.func_25046_a(StatList.field_25094_y[field_573_bc], 1);
            func_31024_a(p_12007_1_, p_12007_3_, p_12007_4_, p_12007_5_, new ItemStack(Block.field_35045_bv, 1, 0));
        } else
        {
            super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
        }
    }
}
