// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureBoundingBox, ChunkPosition, World, Block, 
//            Material, StructurePieceBlockSelector, TileEntityChest, WeightedRandom, 
//            StructurePieceTreasure, Item, ItemStack, ItemDoor

public abstract class StructureComponent
{

    protected StructureBoundingBox field_35316_g;
    protected int field_35317_h;
    protected int field_35318_i;

    protected StructureComponent(int p_i243_1_)
    {
        field_35318_i = p_i243_1_;
        field_35317_h = -1;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public abstract boolean func_35310_a(World world, Random random, StructureBoundingBox structureboundingbox);

    public StructureBoundingBox func_35313_b()
    {
        return field_35316_g;
    }

    public int func_35305_c()
    {
        return field_35318_i;
    }

    public static StructureComponent func_35312_a(List p_35312_0_, StructureBoundingBox p_35312_1_)
    {
        for(Iterator iterator = p_35312_0_.iterator(); iterator.hasNext();)
        {
            StructureComponent structurecomponent = (StructureComponent)iterator.next();
            if(structurecomponent.func_35313_b() != null && structurecomponent.func_35313_b().func_35664_a(p_35312_1_))
            {
                return structurecomponent;
            }
        }

        return null;
    }

    public ChunkPosition func_40281_b_()
    {
        return new ChunkPosition(field_35316_g.func_40623_e(), field_35316_g.func_40622_f(), field_35316_g.func_40624_g());
    }

    protected boolean func_35295_a(World p_35295_1_, StructureBoundingBox p_35295_2_)
    {
        int i = Math.max(field_35316_g.field_35678_a - 1, p_35295_2_.field_35678_a);
        int j = Math.max(field_35316_g.field_35676_b - 1, p_35295_2_.field_35676_b);
        int k = Math.max(field_35316_g.field_35677_c - 1, p_35295_2_.field_35677_c);
        int l = Math.min(field_35316_g.field_35674_d + 1, p_35295_2_.field_35674_d);
        int i1 = Math.min(field_35316_g.field_35675_e + 1, p_35295_2_.field_35675_e);
        int j1 = Math.min(field_35316_g.field_35673_f + 1, p_35295_2_.field_35673_f);
        for(int k1 = i; k1 <= l; k1++)
        {
            for(int j2 = k; j2 <= j1; j2++)
            {
                int i3 = p_35295_1_.func_444_a(k1, j, j2);
                if(i3 > 0 && Block.field_542_n[i3].field_553_bn.func_217_d())
                {
                    return true;
                }
                i3 = p_35295_1_.func_444_a(k1, i1, j2);
                if(i3 > 0 && Block.field_542_n[i3].field_553_bn.func_217_d())
                {
                    return true;
                }
            }

        }

        for(int l1 = i; l1 <= l; l1++)
        {
            for(int k2 = j; k2 <= i1; k2++)
            {
                int j3 = p_35295_1_.func_444_a(l1, k2, k);
                if(j3 > 0 && Block.field_542_n[j3].field_553_bn.func_217_d())
                {
                    return true;
                }
                j3 = p_35295_1_.func_444_a(l1, k2, j1);
                if(j3 > 0 && Block.field_542_n[j3].field_553_bn.func_217_d())
                {
                    return true;
                }
            }

        }

        for(int i2 = k; i2 <= j1; i2++)
        {
            for(int l2 = j; l2 <= i1; l2++)
            {
                int k3 = p_35295_1_.func_444_a(i, l2, i2);
                if(k3 > 0 && Block.field_542_n[k3].field_553_bn.func_217_d())
                {
                    return true;
                }
                k3 = p_35295_1_.func_444_a(l, l2, i2);
                if(k3 > 0 && Block.field_542_n[k3].field_553_bn.func_217_d())
                {
                    return true;
                }
            }

        }

        return false;
    }

    protected int func_35306_a(int p_35306_1_, int p_35306_2_)
    {
        switch(field_35317_h)
        {
        case 0: // '\0'
        case 2: // '\002'
            return field_35316_g.field_35678_a + p_35306_1_;

        case 1: // '\001'
            return field_35316_g.field_35674_d - p_35306_2_;

        case 3: // '\003'
            return field_35316_g.field_35678_a + p_35306_2_;
        }
        return p_35306_1_;
    }

    protected int func_35300_a(int p_35300_1_)
    {
        if(field_35317_h == -1)
        {
            return p_35300_1_;
        } else
        {
            return p_35300_1_ + field_35316_g.field_35676_b;
        }
    }

    protected int func_35296_b(int p_35296_1_, int p_35296_2_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return field_35316_g.field_35673_f - p_35296_2_;

        case 0: // '\0'
            return field_35316_g.field_35677_c + p_35296_2_;

        case 1: // '\001'
        case 3: // '\003'
            return field_35316_g.field_35677_c + p_35296_1_;
        }
        return p_35296_2_;
    }

    protected int func_35301_c(int p_35301_1_, int p_35301_2_)
    {
        if(p_35301_1_ == Block.field_637_aH.field_573_bc)
        {
            if(field_35317_h == 1 || field_35317_h == 3)
            {
                return p_35301_2_ != 1 ? 1 : 0;
            }
        } else
        if(p_35301_1_ == Block.field_639_aF.field_573_bc || p_35301_1_ == Block.field_632_aM.field_573_bc)
        {
            if(field_35317_h == 0)
            {
                if(p_35301_2_ == 0)
                {
                    return 2;
                }
                if(p_35301_2_ == 2)
                {
                    return 0;
                }
            } else
            {
                if(field_35317_h == 1)
                {
                    return p_35301_2_ + 1 & 3;
                }
                if(field_35317_h == 3)
                {
                    return p_35301_2_ + 3 & 3;
                }
            }
        } else
        if(p_35301_1_ == Block.field_9055_aH.field_573_bc || p_35301_1_ == Block.field_9045_at.field_573_bc || p_35301_1_ == Block.field_40169_bD.field_573_bc || p_35301_1_ == Block.field_35046_by.field_573_bc)
        {
            if(field_35317_h == 0)
            {
                if(p_35301_2_ == 2)
                {
                    return 3;
                }
                if(p_35301_2_ == 3)
                {
                    return 2;
                }
            } else
            if(field_35317_h == 1)
            {
                if(p_35301_2_ == 0)
                {
                    return 2;
                }
                if(p_35301_2_ == 1)
                {
                    return 3;
                }
                if(p_35301_2_ == 2)
                {
                    return 0;
                }
                if(p_35301_2_ == 3)
                {
                    return 1;
                }
            } else
            if(field_35317_h == 3)
            {
                if(p_35301_2_ == 0)
                {
                    return 2;
                }
                if(p_35301_2_ == 1)
                {
                    return 3;
                }
                if(p_35301_2_ == 2)
                {
                    return 1;
                }
                if(p_35301_2_ == 3)
                {
                    return 0;
                }
            }
        } else
        if(p_35301_1_ == Block.field_638_aG.field_573_bc)
        {
            if(field_35317_h == 0)
            {
                if(p_35301_2_ == 2)
                {
                    return 3;
                }
                if(p_35301_2_ == 3)
                {
                    return 2;
                }
            } else
            if(field_35317_h == 1)
            {
                if(p_35301_2_ == 2)
                {
                    return 4;
                }
                if(p_35301_2_ == 3)
                {
                    return 5;
                }
                if(p_35301_2_ == 4)
                {
                    return 2;
                }
                if(p_35301_2_ == 5)
                {
                    return 3;
                }
            } else
            if(field_35317_h == 3)
            {
                if(p_35301_2_ == 2)
                {
                    return 5;
                }
                if(p_35301_2_ == 3)
                {
                    return 4;
                }
                if(p_35301_2_ == 4)
                {
                    return 2;
                }
                if(p_35301_2_ == 5)
                {
                    return 3;
                }
            }
        } else
        if(p_35301_1_ == Block.field_9051_aR.field_573_bc)
        {
            if(field_35317_h == 0)
            {
                if(p_35301_2_ == 3)
                {
                    return 4;
                }
                if(p_35301_2_ == 4)
                {
                    return 3;
                }
            } else
            if(field_35317_h == 1)
            {
                if(p_35301_2_ == 3)
                {
                    return 1;
                }
                if(p_35301_2_ == 4)
                {
                    return 2;
                }
                if(p_35301_2_ == 2)
                {
                    return 3;
                }
                if(p_35301_2_ == 1)
                {
                    return 4;
                }
            } else
            if(field_35317_h == 3)
            {
                if(p_35301_2_ == 3)
                {
                    return 2;
                }
                if(p_35301_2_ == 4)
                {
                    return 1;
                }
                if(p_35301_2_ == 2)
                {
                    return 3;
                }
                if(p_35301_2_ == 1)
                {
                    return 4;
                }
            }
        }
        return p_35301_2_;
    }

    protected void func_35309_a(World p_35309_1_, int p_35309_2_, int p_35309_3_, int p_35309_4_, int p_35309_5_, int p_35309_6_, StructureBoundingBox p_35309_7_)
    {
        int i = func_35306_a(p_35309_4_, p_35309_6_);
        int j = func_35300_a(p_35309_5_);
        int k = func_35296_b(p_35309_4_, p_35309_6_);
        if(!p_35309_7_.func_35667_b(i, j, k))
        {
            return;
        } else
        {
            p_35309_1_.func_470_a(i, j, k, p_35309_2_, p_35309_3_);
            return;
        }
    }

    protected int func_35297_a(World p_35297_1_, int p_35297_2_, int p_35297_3_, int p_35297_4_, StructureBoundingBox p_35297_5_)
    {
        int i = func_35306_a(p_35297_2_, p_35297_4_);
        int j = func_35300_a(p_35297_3_);
        int k = func_35296_b(p_35297_2_, p_35297_4_);
        if(!p_35297_5_.func_35667_b(i, j, k))
        {
            return 0;
        } else
        {
            return p_35297_1_.func_444_a(i, j, k);
        }
    }

    protected void func_35294_a(World p_35294_1_, StructureBoundingBox p_35294_2_, int p_35294_3_, int p_35294_4_, int p_35294_5_, int p_35294_6_, int p_35294_7_, 
            int p_35294_8_, int p_35294_9_, int p_35294_10_, boolean p_35294_11_)
    {
        for(int i = p_35294_4_; i <= p_35294_7_; i++)
        {
            for(int j = p_35294_3_; j <= p_35294_6_; j++)
            {
                for(int k = p_35294_5_; k <= p_35294_8_; k++)
                {
                    if(p_35294_11_ && func_35297_a(p_35294_1_, j, i, k, p_35294_2_) == 0)
                    {
                        continue;
                    }
                    if(i == p_35294_4_ || i == p_35294_7_ || j == p_35294_3_ || j == p_35294_6_ || k == p_35294_5_ || k == p_35294_8_)
                    {
                        func_35309_a(p_35294_1_, p_35294_9_, 0, j, i, k, p_35294_2_);
                    } else
                    {
                        func_35309_a(p_35294_1_, p_35294_10_, 0, j, i, k, p_35294_2_);
                    }
                }

            }

        }

    }

    protected void func_35307_a(World p_35307_1_, StructureBoundingBox p_35307_2_, int p_35307_3_, int p_35307_4_, int p_35307_5_, int p_35307_6_, int p_35307_7_, 
            int p_35307_8_, boolean p_35307_9_, Random p_35307_10_, StructurePieceBlockSelector p_35307_11_)
    {
        for(int i = p_35307_4_; i <= p_35307_7_; i++)
        {
            for(int j = p_35307_3_; j <= p_35307_6_; j++)
            {
                for(int k = p_35307_5_; k <= p_35307_8_; k++)
                {
                    if(!p_35307_9_ || func_35297_a(p_35307_1_, j, i, k, p_35307_2_) != 0)
                    {
                        p_35307_11_.func_35565_a(p_35307_10_, j, i, k, i == p_35307_4_ || i == p_35307_7_ || j == p_35307_3_ || j == p_35307_6_ || k == p_35307_5_ || k == p_35307_8_);
                        func_35309_a(p_35307_1_, p_35307_11_.func_35566_a(), p_35307_11_.func_35567_b(), j, i, k, p_35307_2_);
                    }
                }

            }

        }

    }

    protected void func_35315_a(World p_35315_1_, StructureBoundingBox p_35315_2_, Random p_35315_3_, float p_35315_4_, int p_35315_5_, int p_35315_6_, int p_35315_7_, 
            int p_35315_8_, int p_35315_9_, int p_35315_10_, int p_35315_11_, int p_35315_12_, boolean p_35315_13_)
    {
        for(int i = p_35315_6_; i <= p_35315_9_; i++)
        {
            for(int j = p_35315_5_; j <= p_35315_8_; j++)
            {
                for(int k = p_35315_7_; k <= p_35315_10_; k++)
                {
                    if(p_35315_3_.nextFloat() > p_35315_4_ || p_35315_13_ && func_35297_a(p_35315_1_, j, i, k, p_35315_2_) == 0)
                    {
                        continue;
                    }
                    if(i == p_35315_6_ || i == p_35315_9_ || j == p_35315_5_ || j == p_35315_8_ || k == p_35315_7_ || k == p_35315_10_)
                    {
                        func_35309_a(p_35315_1_, p_35315_11_, 0, j, i, k, p_35315_2_);
                    } else
                    {
                        func_35309_a(p_35315_1_, p_35315_12_, 0, j, i, k, p_35315_2_);
                    }
                }

            }

        }

    }

    protected void func_35302_a(World p_35302_1_, StructureBoundingBox p_35302_2_, Random p_35302_3_, float p_35302_4_, int p_35302_5_, int p_35302_6_, int p_35302_7_, 
            int p_35302_8_, int p_35302_9_)
    {
        if(p_35302_3_.nextFloat() < p_35302_4_)
        {
            func_35309_a(p_35302_1_, p_35302_8_, p_35302_9_, p_35302_5_, p_35302_6_, p_35302_7_, p_35302_2_);
        }
    }

    protected void func_35304_a(World p_35304_1_, StructureBoundingBox p_35304_2_, int p_35304_3_, int p_35304_4_, int p_35304_5_, int p_35304_6_, int p_35304_7_, 
            int p_35304_8_, int p_35304_9_, boolean p_35304_10_)
    {
        float f = (p_35304_6_ - p_35304_3_) + 1;
        float f1 = (p_35304_7_ - p_35304_4_) + 1;
        float f2 = (p_35304_8_ - p_35304_5_) + 1;
        float f3 = (float)p_35304_3_ + f / 2.0F;
        float f4 = (float)p_35304_5_ + f2 / 2.0F;
        for(int i = p_35304_4_; i <= p_35304_7_; i++)
        {
            float f5 = (float)(i - p_35304_4_) / f1;
            for(int j = p_35304_3_; j <= p_35304_6_; j++)
            {
                float f6 = ((float)j - f3) / (f * 0.5F);
                for(int k = p_35304_5_; k <= p_35304_8_; k++)
                {
                    float f7 = ((float)k - f4) / (f2 * 0.5F);
                    if(p_35304_10_ && func_35297_a(p_35304_1_, j, i, k, p_35304_2_) == 0)
                    {
                        continue;
                    }
                    float f8 = f6 * f6 + f5 * f5 + f7 * f7;
                    if(f8 <= 1.05F)
                    {
                        func_35309_a(p_35304_1_, p_35304_9_, 0, j, i, k, p_35304_2_);
                    }
                }

            }

        }

    }

    protected void func_35314_b(World p_35314_1_, int p_35314_2_, int p_35314_3_, int p_35314_4_, StructureBoundingBox p_35314_5_)
    {
        int i = func_35306_a(p_35314_2_, p_35314_4_);
        int j = func_35300_a(p_35314_3_);
        int k = func_35296_b(p_35314_2_, p_35314_4_);
        if(!p_35314_5_.func_35667_b(i, j, k))
        {
            return;
        }
        for(; !p_35314_1_.func_20111_e(i, j, k) && j < 255; j++)
        {
            p_35314_1_.func_470_a(i, j, k, 0, 0);
        }

    }

    protected void func_35303_b(World p_35303_1_, int p_35303_2_, int p_35303_3_, int p_35303_4_, int p_35303_5_, int p_35303_6_, StructureBoundingBox p_35303_7_)
    {
        int i = func_35306_a(p_35303_4_, p_35303_6_);
        int j = func_35300_a(p_35303_5_);
        int k = func_35296_b(p_35303_4_, p_35303_6_);
        if(!p_35303_7_.func_35667_b(i, j, k))
        {
            return;
        }
        for(; (p_35303_1_.func_20111_e(i, j, k) || p_35303_1_.func_443_c(i, j, k).func_217_d()) && j > 1; j--)
        {
            p_35303_1_.func_470_a(i, j, k, p_35303_2_, p_35303_3_);
        }

    }

    protected void func_35299_a(World p_35299_1_, StructureBoundingBox p_35299_2_, Random p_35299_3_, int p_35299_4_, int p_35299_5_, int p_35299_6_, StructurePieceTreasure p_35299_7_[], 
            int p_35299_8_)
    {
        int i = func_35306_a(p_35299_4_, p_35299_6_);
        int j = func_35300_a(p_35299_5_);
        int k = func_35296_b(p_35299_4_, p_35299_6_);
        if(p_35299_2_.func_35667_b(i, j, k) && p_35299_1_.func_444_a(i, j, k) != Block.field_593_av.field_573_bc)
        {
            p_35299_1_.func_508_d(i, j, k, Block.field_593_av.field_573_bc);
            TileEntityChest tileentitychest = (TileEntityChest)p_35299_1_.func_451_k(i, j, k);
            if(tileentitychest != null)
            {
                func_35311_a(p_35299_3_, p_35299_7_, tileentitychest, p_35299_8_);
            }
        }
    }

    private static void func_35311_a(Random p_35311_0_, StructurePieceTreasure p_35311_1_[], TileEntityChest p_35311_2_, int p_35311_3_)
    {
        for(int i = 0; i < p_35311_3_; i++)
        {
            StructurePieceTreasure structurepiecetreasure = (StructurePieceTreasure)WeightedRandom.func_35691_a(p_35311_0_, p_35311_1_);
            int j = structurepiecetreasure.field_35488_c + p_35311_0_.nextInt((structurepiecetreasure.field_35486_e - structurepiecetreasure.field_35488_c) + 1);
            if(Item.field_176_c[structurepiecetreasure.field_35489_a].func_81_a() >= j)
            {
                p_35311_2_.func_206_a(p_35311_0_.nextInt(p_35311_2_.func_83_a()), new ItemStack(structurepiecetreasure.field_35489_a, j, structurepiecetreasure.field_35487_b));
                continue;
            }
            for(int k = 0; k < j; k++)
            {
                p_35311_2_.func_206_a(p_35311_0_.nextInt(p_35311_2_.func_83_a()), new ItemStack(structurepiecetreasure.field_35489_a, 1, structurepiecetreasure.field_35487_b));
            }

        }

    }

    protected void func_35298_a(World p_35298_1_, StructureBoundingBox p_35298_2_, Random p_35298_3_, int p_35298_4_, int p_35298_5_, int p_35298_6_, int p_35298_7_)
    {
        int i = func_35306_a(p_35298_4_, p_35298_6_);
        int j = func_35300_a(p_35298_5_);
        int k = func_35296_b(p_35298_4_, p_35298_6_);
        if(p_35298_2_.func_35667_b(i, j, k))
        {
            ItemDoor.func_35418_a(p_35298_1_, i, j, k, p_35298_7_, Block.field_639_aF);
        }
    }
}
