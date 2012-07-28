// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World, TileEntityMobSpawner

public class ComponentMineshaftCorridor extends StructureComponent
{

    private final boolean field_35361_a;
    private final boolean field_35359_b;
    private boolean field_35360_c;
    private int field_35358_d;

    public ComponentMineshaftCorridor(int p_i458_1_, Random p_i458_2_, StructureBoundingBox p_i458_3_, int p_i458_4_)
    {
        super(p_i458_1_);
        field_35317_h = p_i458_4_;
        field_35316_g = p_i458_3_;
        field_35361_a = p_i458_2_.nextInt(3) == 0;
        field_35359_b = !field_35361_a && p_i458_2_.nextInt(23) == 0;
        if(field_35317_h == 2 || field_35317_h == 0)
        {
            field_35358_d = p_i458_3_.func_35665_d() / 5;
        } else
        {
            field_35358_d = p_i458_3_.func_35669_b() / 5;
        }
    }

    public static StructureBoundingBox func_35357_a(List p_35357_0_, Random p_35357_1_, int p_35357_2_, int p_35357_3_, int p_35357_4_, int p_35357_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35357_2_, p_35357_3_, p_35357_4_, p_35357_2_, p_35357_3_ + 2, p_35357_4_);
        int i = p_35357_1_.nextInt(3) + 2;
        do
        {
            if(i <= 0)
            {
                break;
            }
            int j = i * 5;
            switch(p_35357_5_)
            {
            case 2: // '\002'
                structureboundingbox.field_35674_d = p_35357_2_ + 2;
                structureboundingbox.field_35677_c = p_35357_4_ - (j - 1);
                break;

            case 0: // '\0'
                structureboundingbox.field_35674_d = p_35357_2_ + 2;
                structureboundingbox.field_35673_f = p_35357_4_ + (j - 1);
                break;

            case 1: // '\001'
                structureboundingbox.field_35678_a = p_35357_2_ - (j - 1);
                structureboundingbox.field_35673_f = p_35357_4_ + 2;
                break;

            case 3: // '\003'
                structureboundingbox.field_35674_d = p_35357_2_ + (j - 1);
                structureboundingbox.field_35673_f = p_35357_4_ + 2;
                break;
            }
            if(StructureComponent.func_35312_a(p_35357_0_, structureboundingbox) == null)
            {
                break;
            }
            i--;
        } while(true);
        if(i > 0)
        {
            return structureboundingbox;
        } else
        {
            return null;
        }
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        int i = func_35305_c();
        int j = p_35308_3_.nextInt(4);
        switch(field_35317_h)
        {
        case 2: // '\002'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c - 1, field_35317_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c, 1, i);
            } else
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c, 3, i);
            }
            break;

        case 0: // '\0'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35673_f + 1, field_35317_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35673_f - 3, 1, i);
            } else
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35673_f - 3, 3, i);
            }
            break;

        case 1: // '\001'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c, field_35317_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c - 1, 2, i);
            } else
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35673_f + 1, 0, i);
            }
            break;

        case 3: // '\003'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c, field_35317_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d - 3, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35677_c - 1, 2, i);
            } else
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d - 3, (field_35316_g.field_35676_b - 1) + p_35308_3_.nextInt(3), field_35316_g.field_35673_f + 1, 0, i);
            }
            break;
        }
        if(i < 8)
        {
            if(field_35317_h == 2 || field_35317_h == 0)
            {
                for(int k = field_35316_g.field_35677_c + 3; k + 3 <= field_35316_g.field_35673_f; k += 5)
                {
                    int i1 = p_35308_3_.nextInt(5);
                    if(i1 == 0)
                    {
                        StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, k, 1, i + 1);
                    } else
                    if(i1 == 1)
                    {
                        StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, k, 3, i + 1);
                    }
                }

            } else
            {
                for(int l = field_35316_g.field_35678_a + 3; l + 3 <= field_35316_g.field_35674_d; l += 5)
                {
                    int j1 = p_35308_3_.nextInt(5);
                    if(j1 == 0)
                    {
                        StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, l, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, i + 1);
                        continue;
                    }
                    if(j1 == 1)
                    {
                        StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, l, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, i + 1);
                    }
                }

            }
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        int i = field_35358_d * 5 - 1;
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 2, 1, i, 0, 0, false);
        func_35315_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.8F, 0, 2, 0, 2, 2, i, 0, 0, false);
        if(field_35359_b)
        {
            func_35315_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.6F, 0, 0, 0, 2, 1, i, Block.field_9032_W.field_573_bc, 0, false);
        }
        for(int j = 0; j < field_35358_d; j++)
        {
            int i1 = 2 + j * 5;
            func_35294_a(p_35310_1_, p_35310_3_, 0, 0, i1, 0, 1, i1, Block.field_9050_aZ.field_573_bc, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, 2, 0, i1, 2, 1, i1, Block.field_9050_aZ.field_573_bc, 0, false);
            if(p_35310_2_.nextInt(4) != 0)
            {
                func_35294_a(p_35310_1_, p_35310_3_, 0, 2, i1, 2, 2, i1, Block.field_531_y.field_573_bc, 0, false);
            } else
            {
                func_35294_a(p_35310_1_, p_35310_3_, 0, 2, i1, 0, 2, i1, Block.field_531_y.field_573_bc, 0, false);
                func_35294_a(p_35310_1_, p_35310_3_, 2, 2, i1, 2, 2, i1, Block.field_531_y.field_573_bc, 0, false);
            }
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 0, 2, i1 - 1, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 2, 2, i1 - 1, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 0, 2, i1 + 1, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 2, 2, i1 + 1, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 0, 2, i1 - 2, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 2, 2, i1 - 2, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 0, 2, i1 + 2, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 2, 2, i1 + 2, Block.field_9032_W.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 1, 2, i1 - 1, Block.field_9046_aq.field_573_bc, 0);
            func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.05F, 1, 2, i1 + 1, Block.field_9046_aq.field_573_bc, 0);
            if(p_35310_2_.nextInt(100) == 0)
            {
                func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 2, 0, i1 - 1, StructureMineshaftPieces.func_35432_a(), 3 + p_35310_2_.nextInt(4));
            }
            if(p_35310_2_.nextInt(100) == 0)
            {
                func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 0, 0, i1 + 1, StructureMineshaftPieces.func_35432_a(), 3 + p_35310_2_.nextInt(4));
            }
            if(!field_35359_b || field_35360_c)
            {
                continue;
            }
            int l1 = func_35300_a(0);
            int j2 = (i1 - 1) + p_35310_2_.nextInt(3);
            int k2 = func_35306_a(1, j2);
            j2 = func_35296_b(1, j2);
            if(!p_35310_3_.func_35667_b(k2, l1, j2))
            {
                continue;
            }
            field_35360_c = true;
            p_35310_1_.func_508_d(k2, l1, j2, Block.field_597_at.field_573_bc);
            TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_35310_1_.func_451_k(k2, l1, j2);
            if(tileentitymobspawner != null)
            {
                tileentitymobspawner.func_21078_a("CaveSpider");
            }
        }

        for(int k = 0; k <= 2; k++)
        {
            for(int j1 = 0; j1 <= i; j1++)
            {
                int i2 = func_35297_a(p_35310_1_, k, -1, j1, p_35310_3_);
                if(i2 == 0)
                {
                    func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, k, -1, j1, p_35310_3_);
                }
            }

        }

        if(field_35361_a)
        {
            for(int l = 0; l <= i; l++)
            {
                int k1 = func_35297_a(p_35310_1_, 1, -1, l, p_35310_3_);
                if(k1 > 0 && Block.field_540_p[k1])
                {
                    func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.7F, 1, 0, l, Block.field_637_aH.field_573_bc, func_35301_c(Block.field_637_aH.field_573_bc, 0));
                }
            }

        }
        return true;
    }
}
