// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockLeavesBase, Material, World, Block, 
//            ItemStack, Item, EntityPlayer, ItemShears, 
//            StatList, Entity

public class BlockLeaves extends BlockLeavesBase
{

    private int field_663_c;
    int field_20041_b[];

    protected BlockLeaves(int p_i38_1_, int p_i38_2_)
    {
        super(p_i38_1_, p_i38_2_, Material.field_4218_h, false);
        field_663_c = p_i38_2_;
        func_231_a(true);
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        int i = 1;
        int j = i + 1;
        if(p_242_1_.func_466_a(p_242_2_ - j, p_242_3_ - j, p_242_4_ - j, p_242_2_ + j, p_242_3_ + j, p_242_4_ + j))
        {
            for(int k = -i; k <= i; k++)
            {
                for(int l = -i; l <= i; l++)
                {
                    for(int i1 = -i; i1 <= i; i1++)
                    {
                        int j1 = p_242_1_.func_444_a(p_242_2_ + k, p_242_3_ + l, p_242_4_ + i1);
                        if(j1 == Block.field_581_L.field_573_bc)
                        {
                            int k1 = p_242_1_.func_446_b(p_242_2_ + k, p_242_3_ + l, p_242_4_ + i1);
                            p_242_1_.func_463_c(p_242_2_ + k, p_242_3_ + l, p_242_4_ + i1, k1 | 8);
                        }
                    }

                }

            }

        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.field_792_x)
        {
            return;
        }
        int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
        if((i & 8) != 0 && (i & 4) == 0)
        {
            byte byte0 = 4;
            int j = byte0 + 1;
            byte byte1 = 32;
            int k = byte1 * byte1;
            int l = byte1 / 2;
            if(field_20041_b == null)
            {
                field_20041_b = new int[byte1 * byte1 * byte1];
            }
            if(p_221_1_.func_466_a(p_221_2_ - j, p_221_3_ - j, p_221_4_ - j, p_221_2_ + j, p_221_3_ + j, p_221_4_ + j))
            {
                for(int i1 = -byte0; i1 <= byte0; i1++)
                {
                    for(int l1 = -byte0; l1 <= byte0; l1++)
                    {
                        for(int j2 = -byte0; j2 <= byte0; j2++)
                        {
                            int l2 = p_221_1_.func_444_a(p_221_2_ + i1, p_221_3_ + l1, p_221_4_ + j2);
                            if(l2 == Block.field_582_K.field_573_bc)
                            {
                                field_20041_b[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = 0;
                                continue;
                            }
                            if(l2 == Block.field_581_L.field_573_bc)
                            {
                                field_20041_b[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -2;
                            } else
                            {
                                field_20041_b[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -1;
                            }
                        }

                    }

                }

                for(int j1 = 1; j1 <= 4; j1++)
                {
                    for(int i2 = -byte0; i2 <= byte0; i2++)
                    {
                        for(int k2 = -byte0; k2 <= byte0; k2++)
                        {
                            for(int i3 = -byte0; i3 <= byte0; i3++)
                            {
                                if(field_20041_b[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l)] != j1 - 1)
                                {
                                    continue;
                                }
                                if(field_20041_b[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20041_b[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20041_b[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20041_b[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20041_b[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20041_b[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20041_b[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20041_b[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20041_b[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] == -2)
                                {
                                    field_20041_b[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] = j1;
                                }
                                if(field_20041_b[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] == -2)
                                {
                                    field_20041_b[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] = j1;
                                }
                            }

                        }

                    }

                }

            }
            int k1 = field_20041_b[l * k + l * byte1 + l];
            if(k1 >= 0)
            {
                p_221_1_.func_463_c(p_221_2_, p_221_3_, p_221_4_, i & -9);
            } else
            {
                func_6091_h(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
            }
        }
    }

    private void func_6091_h(World p_6091_1_, int p_6091_2_, int p_6091_3_, int p_6091_4_)
    {
        func_247_a_(p_6091_1_, p_6091_2_, p_6091_3_, p_6091_4_, p_6091_1_.func_446_b(p_6091_2_, p_6091_3_, p_6091_4_), 0);
        p_6091_1_.func_508_d(p_6091_2_, p_6091_3_, p_6091_4_, 0);
    }

    public int func_244_a(Random p_244_1_)
    {
        return p_244_1_.nextInt(20) != 0 ? 0 : 1;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_6047_y.field_573_bc;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(!p_227_1_.field_792_x)
        {
            byte byte0 = 20;
            if((p_227_5_ & 3) == 3)
            {
                byte0 = 40;
            }
            if(p_227_1_.field_803_m.nextInt(byte0) == 0)
            {
                int i = func_252_a(p_227_5_, p_227_1_.field_803_m, p_227_7_);
                func_31024_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, new ItemStack(i, 1, func_21025_b(p_227_5_)));
            }
            if((p_227_5_ & 3) == 0 && p_227_1_.field_803_m.nextInt(200) == 0)
            {
                func_31024_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, new ItemStack(Item.field_171_h, 1, 0));
            }
        }
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        if(!p_12007_1_.field_792_x && p_12007_2_.func_172_B() != null && p_12007_2_.func_172_B().field_855_c == Item.field_31022_bc.field_234_aS)
        {
            p_12007_2_.func_25046_a(StatList.field_25094_y[field_573_bc], 1);
            func_31024_a(p_12007_1_, p_12007_3_, p_12007_4_, p_12007_5_, new ItemStack(Block.field_581_L.field_573_bc, 1, p_12007_6_ & 3));
        } else
        {
            super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 3;
    }

    public boolean func_240_b()
    {
        return !field_6088_a;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if((p_22009_2_ & 3) == 1)
        {
            return field_575_bb + 80;
        }
        if((p_22009_2_ & 3) == 3)
        {
            return field_575_bb + 144;
        } else
        {
            return field_575_bb;
        }
    }

    public void func_249_b(World p_249_1_, int p_249_2_, int p_249_3_, int p_249_4_, Entity p_249_5_)
    {
        super.func_249_b(p_249_1_, p_249_2_, p_249_3_, p_249_4_, p_249_5_);
    }
}
