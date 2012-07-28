// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, ChunkPosition, 
//            Item, IBlockAccess, Direction, AxisAlignedBB

public class BlockRedstoneWire extends Block
{

    private boolean field_652_a;
    private Set field_21032_b;

    public BlockRedstoneWire(int p_i443_1_, int p_i443_2_)
    {
        super(p_i443_1_, p_i443_2_, Material.field_513_n);
        field_652_a = true;
        field_21032_b = new HashSet();
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return field_575_bb;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 5;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_) || p_259_1_.func_444_a(p_259_2_, p_259_3_ - 1, p_259_4_) == Block.field_6065_bd.field_573_bc;
    }

    private void func_292_g(World p_292_1_, int p_292_2_, int p_292_3_, int p_292_4_)
    {
        func_21031_a(p_292_1_, p_292_2_, p_292_3_, p_292_4_, p_292_2_, p_292_3_, p_292_4_);
        ArrayList arraylist = new ArrayList(field_21032_b);
        field_21032_b.clear();
        for(int i = 0; i < arraylist.size(); i++)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(i);
            p_292_1_.func_449_g(chunkposition.field_846_a, chunkposition.field_845_b, chunkposition.field_847_c, field_573_bc);
        }

    }

    private void func_21031_a(World p_21031_1_, int p_21031_2_, int p_21031_3_, int p_21031_4_, int p_21031_5_, int p_21031_6_, int p_21031_7_)
    {
        int i = p_21031_1_.func_446_b(p_21031_2_, p_21031_3_, p_21031_4_);
        int j = 0;
        field_652_a = false;
        boolean flag = p_21031_1_.func_474_n(p_21031_2_, p_21031_3_, p_21031_4_);
        field_652_a = true;
        if(flag)
        {
            j = 15;
        } else
        {
            for(int k = 0; k < 4; k++)
            {
                int i1 = p_21031_2_;
                int k1 = p_21031_4_;
                if(k == 0)
                {
                    i1--;
                }
                if(k == 1)
                {
                    i1++;
                }
                if(k == 2)
                {
                    k1--;
                }
                if(k == 3)
                {
                    k1++;
                }
                if(i1 != p_21031_5_ || p_21031_3_ != p_21031_6_ || k1 != p_21031_7_)
                {
                    j = func_290_f(p_21031_1_, i1, p_21031_3_, k1, j);
                }
                if(p_21031_1_.func_445_d(i1, p_21031_3_, k1) && !p_21031_1_.func_445_d(p_21031_2_, p_21031_3_ + 1, p_21031_4_))
                {
                    if(i1 != p_21031_5_ || p_21031_3_ + 1 != p_21031_6_ || k1 != p_21031_7_)
                    {
                        j = func_290_f(p_21031_1_, i1, p_21031_3_ + 1, k1, j);
                    }
                    continue;
                }
                if(!p_21031_1_.func_445_d(i1, p_21031_3_, k1) && (i1 != p_21031_5_ || p_21031_3_ - 1 != p_21031_6_ || k1 != p_21031_7_))
                {
                    j = func_290_f(p_21031_1_, i1, p_21031_3_ - 1, k1, j);
                }
            }

            if(j > 0)
            {
                j--;
            } else
            {
                j = 0;
            }
        }
        if(i != j)
        {
            p_21031_1_.field_808_h = true;
            p_21031_1_.func_511_b(p_21031_2_, p_21031_3_, p_21031_4_, j);
            p_21031_1_.func_519_b(p_21031_2_, p_21031_3_, p_21031_4_, p_21031_2_, p_21031_3_, p_21031_4_);
            p_21031_1_.field_808_h = false;
            for(int l = 0; l < 4; l++)
            {
                int j1 = p_21031_2_;
                int l1 = p_21031_4_;
                int i2 = p_21031_3_ - 1;
                if(l == 0)
                {
                    j1--;
                }
                if(l == 1)
                {
                    j1++;
                }
                if(l == 2)
                {
                    l1--;
                }
                if(l == 3)
                {
                    l1++;
                }
                if(p_21031_1_.func_445_d(j1, p_21031_3_, l1))
                {
                    i2 += 2;
                }
                int j2 = 0;
                j2 = func_290_f(p_21031_1_, j1, p_21031_3_, l1, -1);
                j = p_21031_1_.func_446_b(p_21031_2_, p_21031_3_, p_21031_4_);
                if(j > 0)
                {
                    j--;
                }
                if(j2 >= 0 && j2 != j)
                {
                    func_21031_a(p_21031_1_, j1, p_21031_3_, l1, p_21031_2_, p_21031_3_, p_21031_4_);
                }
                j2 = func_290_f(p_21031_1_, j1, i2, l1, -1);
                j = p_21031_1_.func_446_b(p_21031_2_, p_21031_3_, p_21031_4_);
                if(j > 0)
                {
                    j--;
                }
                if(j2 >= 0 && j2 != j)
                {
                    func_21031_a(p_21031_1_, j1, i2, l1, p_21031_2_, p_21031_3_, p_21031_4_);
                }
            }

            if(i < j || j == 0)
            {
                field_21032_b.add(new ChunkPosition(p_21031_2_, p_21031_3_, p_21031_4_));
                field_21032_b.add(new ChunkPosition(p_21031_2_ - 1, p_21031_3_, p_21031_4_));
                field_21032_b.add(new ChunkPosition(p_21031_2_ + 1, p_21031_3_, p_21031_4_));
                field_21032_b.add(new ChunkPosition(p_21031_2_, p_21031_3_ - 1, p_21031_4_));
                field_21032_b.add(new ChunkPosition(p_21031_2_, p_21031_3_ + 1, p_21031_4_));
                field_21032_b.add(new ChunkPosition(p_21031_2_, p_21031_3_, p_21031_4_ - 1));
                field_21032_b.add(new ChunkPosition(p_21031_2_, p_21031_3_, p_21031_4_ + 1));
            }
        }
    }

    private void func_291_h(World p_291_1_, int p_291_2_, int p_291_3_, int p_291_4_)
    {
        if(p_291_1_.func_444_a(p_291_2_, p_291_3_, p_291_4_) != field_573_bc)
        {
            return;
        } else
        {
            p_291_1_.func_449_g(p_291_2_, p_291_3_, p_291_4_, field_573_bc);
            p_291_1_.func_449_g(p_291_2_ - 1, p_291_3_, p_291_4_, field_573_bc);
            p_291_1_.func_449_g(p_291_2_ + 1, p_291_3_, p_291_4_, field_573_bc);
            p_291_1_.func_449_g(p_291_2_, p_291_3_, p_291_4_ - 1, field_573_bc);
            p_291_1_.func_449_g(p_291_2_, p_291_3_, p_291_4_ + 1, field_573_bc);
            p_291_1_.func_449_g(p_291_2_, p_291_3_ - 1, p_291_4_, field_573_bc);
            p_291_1_.func_449_g(p_291_2_, p_291_3_ + 1, p_291_4_, field_573_bc);
            return;
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        if(p_250_1_.field_792_x)
        {
            return;
        }
        func_292_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        p_250_1_.func_449_g(p_250_2_, p_250_3_ + 1, p_250_4_, field_573_bc);
        p_250_1_.func_449_g(p_250_2_, p_250_3_ - 1, p_250_4_, field_573_bc);
        func_291_h(p_250_1_, p_250_2_ - 1, p_250_3_, p_250_4_);
        func_291_h(p_250_1_, p_250_2_ + 1, p_250_3_, p_250_4_);
        func_291_h(p_250_1_, p_250_2_, p_250_3_, p_250_4_ - 1);
        func_291_h(p_250_1_, p_250_2_, p_250_3_, p_250_4_ + 1);
        if(p_250_1_.func_445_d(p_250_2_ - 1, p_250_3_, p_250_4_))
        {
            func_291_h(p_250_1_, p_250_2_ - 1, p_250_3_ + 1, p_250_4_);
        } else
        {
            func_291_h(p_250_1_, p_250_2_ - 1, p_250_3_ - 1, p_250_4_);
        }
        if(p_250_1_.func_445_d(p_250_2_ + 1, p_250_3_, p_250_4_))
        {
            func_291_h(p_250_1_, p_250_2_ + 1, p_250_3_ + 1, p_250_4_);
        } else
        {
            func_291_h(p_250_1_, p_250_2_ + 1, p_250_3_ - 1, p_250_4_);
        }
        if(p_250_1_.func_445_d(p_250_2_, p_250_3_, p_250_4_ - 1))
        {
            func_291_h(p_250_1_, p_250_2_, p_250_3_ + 1, p_250_4_ - 1);
        } else
        {
            func_291_h(p_250_1_, p_250_2_, p_250_3_ - 1, p_250_4_ - 1);
        }
        if(p_250_1_.func_445_d(p_250_2_, p_250_3_, p_250_4_ + 1))
        {
            func_291_h(p_250_1_, p_250_2_, p_250_3_ + 1, p_250_4_ + 1);
        } else
        {
            func_291_h(p_250_1_, p_250_2_, p_250_3_ - 1, p_250_4_ + 1);
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        if(p_242_1_.field_792_x)
        {
            return;
        }
        p_242_1_.func_449_g(p_242_2_, p_242_3_ + 1, p_242_4_, field_573_bc);
        p_242_1_.func_449_g(p_242_2_, p_242_3_ - 1, p_242_4_, field_573_bc);
        p_242_1_.func_449_g(p_242_2_ + 1, p_242_3_, p_242_4_, field_573_bc);
        p_242_1_.func_449_g(p_242_2_ - 1, p_242_3_, p_242_4_, field_573_bc);
        p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ + 1, field_573_bc);
        p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ - 1, field_573_bc);
        func_292_g(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        func_291_h(p_242_1_, p_242_2_ - 1, p_242_3_, p_242_4_);
        func_291_h(p_242_1_, p_242_2_ + 1, p_242_3_, p_242_4_);
        func_291_h(p_242_1_, p_242_2_, p_242_3_, p_242_4_ - 1);
        func_291_h(p_242_1_, p_242_2_, p_242_3_, p_242_4_ + 1);
        if(p_242_1_.func_445_d(p_242_2_ - 1, p_242_3_, p_242_4_))
        {
            func_291_h(p_242_1_, p_242_2_ - 1, p_242_3_ + 1, p_242_4_);
        } else
        {
            func_291_h(p_242_1_, p_242_2_ - 1, p_242_3_ - 1, p_242_4_);
        }
        if(p_242_1_.func_445_d(p_242_2_ + 1, p_242_3_, p_242_4_))
        {
            func_291_h(p_242_1_, p_242_2_ + 1, p_242_3_ + 1, p_242_4_);
        } else
        {
            func_291_h(p_242_1_, p_242_2_ + 1, p_242_3_ - 1, p_242_4_);
        }
        if(p_242_1_.func_445_d(p_242_2_, p_242_3_, p_242_4_ - 1))
        {
            func_291_h(p_242_1_, p_242_2_, p_242_3_ + 1, p_242_4_ - 1);
        } else
        {
            func_291_h(p_242_1_, p_242_2_, p_242_3_ - 1, p_242_4_ - 1);
        }
        if(p_242_1_.func_445_d(p_242_2_, p_242_3_, p_242_4_ + 1))
        {
            func_291_h(p_242_1_, p_242_2_, p_242_3_ + 1, p_242_4_ + 1);
        } else
        {
            func_291_h(p_242_1_, p_242_2_, p_242_3_ - 1, p_242_4_ + 1);
        }
    }

    private int func_290_f(World p_290_1_, int p_290_2_, int p_290_3_, int p_290_4_, int p_290_5_)
    {
        if(p_290_1_.func_444_a(p_290_2_, p_290_3_, p_290_4_) != field_573_bc)
        {
            return p_290_5_;
        }
        int i = p_290_1_.func_446_b(p_290_2_, p_290_3_, p_290_4_);
        if(i > p_290_5_)
        {
            return i;
        } else
        {
            return p_290_5_;
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_1_.field_792_x)
        {
            return;
        }
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        boolean flag = func_259_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
        if(!flag)
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        } else
        {
            func_292_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
        }
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_252_aA.field_234_aS;
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        if(!field_652_a)
        {
            return false;
        } else
        {
            return func_239_b(p_238_1_, p_238_2_, p_238_3_, p_238_4_, p_238_5_);
        }
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        if(!field_652_a)
        {
            return false;
        }
        if(p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_) == 0)
        {
            return false;
        }
        if(p_239_5_ == 1)
        {
            return true;
        }
        boolean flag = func_293_b(p_239_1_, p_239_2_ - 1, p_239_3_, p_239_4_, 1) || !p_239_1_.func_445_d(p_239_2_ - 1, p_239_3_, p_239_4_) && func_293_b(p_239_1_, p_239_2_ - 1, p_239_3_ - 1, p_239_4_, -1);
        boolean flag1 = func_293_b(p_239_1_, p_239_2_ + 1, p_239_3_, p_239_4_, 3) || !p_239_1_.func_445_d(p_239_2_ + 1, p_239_3_, p_239_4_) && func_293_b(p_239_1_, p_239_2_ + 1, p_239_3_ - 1, p_239_4_, -1);
        boolean flag2 = func_293_b(p_239_1_, p_239_2_, p_239_3_, p_239_4_ - 1, 2) || !p_239_1_.func_445_d(p_239_2_, p_239_3_, p_239_4_ - 1) && func_293_b(p_239_1_, p_239_2_, p_239_3_ - 1, p_239_4_ - 1, -1);
        boolean flag3 = func_293_b(p_239_1_, p_239_2_, p_239_3_, p_239_4_ + 1, 0) || !p_239_1_.func_445_d(p_239_2_, p_239_3_, p_239_4_ + 1) && func_293_b(p_239_1_, p_239_2_, p_239_3_ - 1, p_239_4_ + 1, -1);
        if(!p_239_1_.func_445_d(p_239_2_, p_239_3_ + 1, p_239_4_))
        {
            if(p_239_1_.func_445_d(p_239_2_ - 1, p_239_3_, p_239_4_) && func_293_b(p_239_1_, p_239_2_ - 1, p_239_3_ + 1, p_239_4_, -1))
            {
                flag = true;
            }
            if(p_239_1_.func_445_d(p_239_2_ + 1, p_239_3_, p_239_4_) && func_293_b(p_239_1_, p_239_2_ + 1, p_239_3_ + 1, p_239_4_, -1))
            {
                flag1 = true;
            }
            if(p_239_1_.func_445_d(p_239_2_, p_239_3_, p_239_4_ - 1) && func_293_b(p_239_1_, p_239_2_, p_239_3_ + 1, p_239_4_ - 1, -1))
            {
                flag2 = true;
            }
            if(p_239_1_.func_445_d(p_239_2_, p_239_3_, p_239_4_ + 1) && func_293_b(p_239_1_, p_239_2_, p_239_3_ + 1, p_239_4_ + 1, -1))
            {
                flag3 = true;
            }
        }
        if(!flag2 && !flag1 && !flag && !flag3 && p_239_5_ >= 2 && p_239_5_ <= 5)
        {
            return true;
        }
        if(p_239_5_ == 2 && flag2 && !flag && !flag1)
        {
            return true;
        }
        if(p_239_5_ == 3 && flag3 && !flag && !flag1)
        {
            return true;
        }
        if(p_239_5_ == 4 && flag && !flag2 && !flag3)
        {
            return true;
        }
        return p_239_5_ == 5 && flag1 && !flag2 && !flag3;
    }

    public boolean func_225_d()
    {
        return field_652_a;
    }

    public static boolean func_41007_c(IBlockAccess p_41007_0_, int p_41007_1_, int p_41007_2_, int p_41007_3_, int p_41007_4_)
    {
        int i = p_41007_0_.func_444_a(p_41007_1_, p_41007_2_, p_41007_3_);
        if(i == Block.field_591_aw.field_573_bc)
        {
            return true;
        }
        if(i == 0)
        {
            return false;
        }
        if(i == Block.field_22011_bh.field_573_bc || i == Block.field_22010_bi.field_573_bc)
        {
            int j = p_41007_0_.func_446_b(p_41007_1_, p_41007_2_, p_41007_3_);
            return p_41007_4_ == (j & 3) || p_41007_4_ == Direction.field_22153_b[j & 3];
        }
        return Block.field_542_n[i].func_225_d() && p_41007_4_ != -1;
    }

    public static boolean func_293_b(IBlockAccess p_293_0_, int p_293_1_, int p_293_2_, int p_293_3_, int p_293_4_)
    {
        if(func_41007_c(p_293_0_, p_293_1_, p_293_2_, p_293_3_, p_293_4_))
        {
            return true;
        }
        int i = p_293_0_.func_444_a(p_293_1_, p_293_2_, p_293_3_);
        if(i == Block.field_22010_bi.field_573_bc)
        {
            int j = p_293_0_.func_446_b(p_293_1_, p_293_2_, p_293_3_);
            return p_293_4_ == (j & 3);
        } else
        {
            return false;
        }
    }
}
