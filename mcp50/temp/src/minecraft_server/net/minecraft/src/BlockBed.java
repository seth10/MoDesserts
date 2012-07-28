// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, WorldProvider, 
//            EntityPlayer, ChunkCoordinates, EnumStatus, Block, 
//            Direction, Item, IBlockAccess

public class BlockBed extends BlockDirectional
{

    public static final int field_22023_a[][] = {
        {
            0, 1
        }, {
            -1, 0
        }, {
            0, -1
        }, {
            1, 0
        }
    };

    public BlockBed(int p_i508_1_)
    {
        super(p_i508_1_, 134, Material.field_4217_k);
        func_22017_f();
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        if(!func_22020_d(i))
        {
            int j = func_48132_b(i);
            p_246_2_ += field_22023_a[j][0];
            p_246_4_ += field_22023_a[j][1];
            if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_) != field_573_bc)
            {
                return true;
            }
            i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        }
        if(!p_246_1_.field_4272_q.func_28108_d())
        {
            double d = (double)p_246_2_ + 0.5D;
            double d1 = (double)p_246_3_ + 0.5D;
            double d2 = (double)p_246_4_ + 0.5D;
            p_246_1_.func_508_d(p_246_2_, p_246_3_, p_246_4_, 0);
            int k = func_48132_b(i);
            p_246_2_ += field_22023_a[k][0];
            p_246_4_ += field_22023_a[k][1];
            if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_) == field_573_bc)
            {
                p_246_1_.func_508_d(p_246_2_, p_246_3_, p_246_4_, 0);
                d = (d + (double)p_246_2_ + 0.5D) / 2D;
                d1 = (d1 + (double)p_246_3_ + 0.5D) / 2D;
                d2 = (d2 + (double)p_246_4_ + 0.5D) / 2D;
            }
            p_246_1_.func_12015_a(null, (float)p_246_2_ + 0.5F, (float)p_246_3_ + 0.5F, (float)p_246_4_ + 0.5F, 5F, true);
            return true;
        }
        if(func_22018_f(i))
        {
            EntityPlayer entityplayer = null;
            Iterator iterator = p_246_1_.field_805_k.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                EntityPlayer entityplayer1 = (EntityPlayer)iterator.next();
                if(entityplayer1.func_22057_E())
                {
                    ChunkCoordinates chunkcoordinates = entityplayer1.field_21901_b;
                    if(chunkcoordinates.field_22216_a == p_246_2_ && chunkcoordinates.field_529_a == p_246_3_ && chunkcoordinates.field_528_b == p_246_4_)
                    {
                        entityplayer = entityplayer1;
                    }
                }
            } while(true);
            if(entityplayer == null)
            {
                func_22022_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, false);
            } else
            {
                p_246_5_.func_22061_a("tile.bed.occupied");
                return true;
            }
        }
        EnumStatus enumstatus = p_246_5_.func_22060_a(p_246_2_, p_246_3_, p_246_4_);
        if(enumstatus == EnumStatus.OK)
        {
            func_22022_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, true);
            return true;
        }
        if(enumstatus == EnumStatus.NOT_POSSIBLE_NOW)
        {
            p_246_5_.func_22061_a("tile.bed.noSleep");
        } else
        if(enumstatus == EnumStatus.NOT_SAFE)
        {
            p_246_5_.func_22061_a("tile.bed.notSafe");
        }
        return true;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 0)
        {
            return Block.field_531_y.field_575_bb;
        }
        int i = func_48132_b(p_22009_2_);
        int j = Direction.field_22155_c[i][p_22009_1_];
        if(func_22020_d(p_22009_2_))
        {
            if(j == 2)
            {
                return field_575_bb + 2 + 16;
            }
            if(j == 5 || j == 4)
            {
                return field_575_bb + 1 + 16;
            } else
            {
                return field_575_bb + 1;
            }
        }
        if(j == 3)
        {
            return (field_575_bb - 1) + 16;
        }
        if(j == 5 || j == 4)
        {
            return field_575_bb + 16;
        } else
        {
            return field_575_bb;
        }
    }

    public int func_40161_b()
    {
        return 14;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        func_22017_f();
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        int j = func_48132_b(i);
        if(func_22020_d(i))
        {
            if(p_234_1_.func_444_a(p_234_2_ - field_22023_a[j][0], p_234_3_, p_234_4_ - field_22023_a[j][1]) != field_573_bc)
            {
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            }
        } else
        if(p_234_1_.func_444_a(p_234_2_ + field_22023_a[j][0], p_234_3_, p_234_4_ + field_22023_a[j][1]) != field_573_bc)
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            if(!p_234_1_.field_792_x)
            {
                func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, 0);
            }
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(func_22020_d(p_252_1_))
        {
            return 0;
        } else
        {
            return Item.field_22008_aY.field_234_aS;
        }
    }

    private void func_22017_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
    }

    public static boolean func_22020_d(int p_22020_0_)
    {
        return (p_22020_0_ & 8) != 0;
    }

    public static boolean func_22018_f(int p_22018_0_)
    {
        return (p_22018_0_ & 4) != 0;
    }

    public static void func_22022_a(World p_22022_0_, int p_22022_1_, int p_22022_2_, int p_22022_3_, boolean p_22022_4_)
    {
        int i = p_22022_0_.func_446_b(p_22022_1_, p_22022_2_, p_22022_3_);
        if(p_22022_4_)
        {
            i |= 4;
        } else
        {
            i &= -5;
        }
        p_22022_0_.func_511_b(p_22022_1_, p_22022_2_, p_22022_3_, i);
    }

    public static ChunkCoordinates func_22021_g(World p_22021_0_, int p_22021_1_, int p_22021_2_, int p_22021_3_, int p_22021_4_)
    {
        int i = p_22021_0_.func_446_b(p_22021_1_, p_22021_2_, p_22021_3_);
        int j = BlockDirectional.func_48132_b(i);
        for(int k = 0; k <= 1; k++)
        {
            int l = p_22021_1_ - field_22023_a[j][0] * k - 1;
            int i1 = p_22021_3_ - field_22023_a[j][1] * k - 1;
            int j1 = l + 2;
            int k1 = i1 + 2;
            for(int l1 = l; l1 <= j1; l1++)
            {
                for(int i2 = i1; i2 <= k1; i2++)
                {
                    if(!p_22021_0_.func_445_d(l1, p_22021_2_ - 1, i2) || !p_22021_0_.func_20111_e(l1, p_22021_2_, i2) || !p_22021_0_.func_20111_e(l1, p_22021_2_ + 1, i2))
                    {
                        continue;
                    }
                    if(p_22021_4_ > 0)
                    {
                        p_22021_4_--;
                    } else
                    {
                        return new ChunkCoordinates(l1, p_22021_2_, i2);
                    }
                }

            }

        }

        return null;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(!func_22020_d(p_227_5_))
        {
            super.func_227_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, p_227_5_, p_227_6_, 0);
        }
    }

    public int func_31025_e()
    {
        return 1;
    }

}
