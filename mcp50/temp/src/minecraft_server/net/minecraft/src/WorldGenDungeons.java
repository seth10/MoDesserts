// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            TileEntityChest, TileEntityMobSpawner, ItemStack, Item

public class WorldGenDungeons extends WorldGenerator
{

    public WorldGenDungeons()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        byte byte0 = 3;
        int i = p_419_2_.nextInt(2) + 2;
        int j = p_419_2_.nextInt(2) + 2;
        int k = 0;
        for(int l = p_419_3_ - i - 1; l <= p_419_3_ + i + 1; l++)
        {
            for(int k1 = p_419_4_ - 1; k1 <= p_419_4_ + byte0 + 1; k1++)
            {
                for(int j2 = p_419_5_ - j - 1; j2 <= p_419_5_ + j + 1; j2++)
                {
                    Material material = p_419_1_.func_443_c(l, k1, j2);
                    if(k1 == p_419_4_ - 1 && !material.func_216_a())
                    {
                        return false;
                    }
                    if(k1 == p_419_4_ + byte0 + 1 && !material.func_216_a())
                    {
                        return false;
                    }
                    if((l == p_419_3_ - i - 1 || l == p_419_3_ + i + 1 || j2 == p_419_5_ - j - 1 || j2 == p_419_5_ + j + 1) && k1 == p_419_4_ && p_419_1_.func_20111_e(l, k1, j2) && p_419_1_.func_20111_e(l, k1 + 1, j2))
                    {
                        k++;
                    }
                }

            }

        }

        if(k < 1 || k > 5)
        {
            return false;
        }
        for(int i1 = p_419_3_ - i - 1; i1 <= p_419_3_ + i + 1; i1++)
        {
            for(int l1 = p_419_4_ + byte0; l1 >= p_419_4_ - 1; l1--)
            {
                for(int k2 = p_419_5_ - j - 1; k2 <= p_419_5_ + j + 1; k2++)
                {
                    if(i1 == p_419_3_ - i - 1 || l1 == p_419_4_ - 1 || k2 == p_419_5_ - j - 1 || i1 == p_419_3_ + i + 1 || l1 == p_419_4_ + byte0 + 1 || k2 == p_419_5_ + j + 1)
                    {
                        if(l1 >= 0 && !p_419_1_.func_443_c(i1, l1 - 1, k2).func_216_a())
                        {
                            p_419_1_.func_508_d(i1, l1, k2, 0);
                            continue;
                        }
                        if(!p_419_1_.func_443_c(i1, l1, k2).func_216_a())
                        {
                            continue;
                        }
                        if(l1 == p_419_4_ - 1 && p_419_2_.nextInt(4) != 0)
                        {
                            p_419_1_.func_508_d(i1, l1, k2, Block.field_603_ap.field_573_bc);
                        } else
                        {
                            p_419_1_.func_508_d(i1, l1, k2, Block.field_532_x.field_573_bc);
                        }
                    } else
                    {
                        p_419_1_.func_508_d(i1, l1, k2, 0);
                    }
                }

            }

        }

        for(int j1 = 0; j1 < 2; j1++)
        {
label0:
            for(int i2 = 0; i2 < 3; i2++)
            {
                int l2 = (p_419_3_ + p_419_2_.nextInt(i * 2 + 1)) - i;
                int i3 = p_419_4_;
                int j3 = (p_419_5_ + p_419_2_.nextInt(j * 2 + 1)) - j;
                if(!p_419_1_.func_20111_e(l2, i3, j3))
                {
                    continue;
                }
                int k3 = 0;
                if(p_419_1_.func_443_c(l2 - 1, i3, j3).func_216_a())
                {
                    k3++;
                }
                if(p_419_1_.func_443_c(l2 + 1, i3, j3).func_216_a())
                {
                    k3++;
                }
                if(p_419_1_.func_443_c(l2, i3, j3 - 1).func_216_a())
                {
                    k3++;
                }
                if(p_419_1_.func_443_c(l2, i3, j3 + 1).func_216_a())
                {
                    k3++;
                }
                if(k3 != 1)
                {
                    continue;
                }
                p_419_1_.func_508_d(l2, i3, j3, Block.field_593_av.field_573_bc);
                TileEntityChest tileentitychest = (TileEntityChest)p_419_1_.func_451_k(l2, i3, j3);
                if(tileentitychest == null)
                {
                    break;
                }
                int l3 = 0;
                do
                {
                    if(l3 >= 8)
                    {
                        break label0;
                    }
                    ItemStack itemstack = func_434_a(p_419_2_);
                    if(itemstack != null)
                    {
                        tileentitychest.func_206_a(p_419_2_.nextInt(tileentitychest.func_83_a()), itemstack);
                    }
                    l3++;
                } while(true);
            }

        }

        p_419_1_.func_508_d(p_419_3_, p_419_4_, p_419_5_, Block.field_597_at.field_573_bc);
        TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_419_1_.func_451_k(p_419_3_, p_419_4_, p_419_5_);
        if(tileentitymobspawner != null)
        {
            tileentitymobspawner.func_21078_a(func_433_b(p_419_2_));
        } else
        {
            System.err.println((new StringBuilder()).append("Failed to fetch mob spawner entity at (").append(p_419_3_).append(", ").append(p_419_4_).append(", ").append(p_419_5_).append(")").toString());
        }
        return true;
    }

    private ItemStack func_434_a(Random p_434_1_)
    {
        int i = p_434_1_.nextInt(11);
        if(i == 0)
        {
            return new ItemStack(Item.field_197_ay);
        }
        if(i == 1)
        {
            return new ItemStack(Item.field_166_m, p_434_1_.nextInt(4) + 1);
        }
        if(i == 2)
        {
            return new ItemStack(Item.field_185_S);
        }
        if(i == 3)
        {
            return new ItemStack(Item.field_186_R, p_434_1_.nextInt(4) + 1);
        }
        if(i == 4)
        {
            return new ItemStack(Item.field_193_K, p_434_1_.nextInt(4) + 1);
        }
        if(i == 5)
        {
            return new ItemStack(Item.field_196_I, p_434_1_.nextInt(4) + 1);
        }
        if(i == 6)
        {
            return new ItemStack(Item.field_205_au);
        }
        if(i == 7 && p_434_1_.nextInt(100) == 0)
        {
            return new ItemStack(Item.field_212_ar);
        }
        if(i == 8 && p_434_1_.nextInt(2) == 0)
        {
            return new ItemStack(Item.field_252_aA, p_434_1_.nextInt(4) + 1);
        }
        if(i == 9 && p_434_1_.nextInt(10) == 0)
        {
            return new ItemStack(Item.field_176_c[Item.field_236_aQ.field_234_aS + p_434_1_.nextInt(2)]);
        }
        if(i == 10)
        {
            return new ItemStack(Item.field_21097_aU, 1, 3);
        } else
        {
            return null;
        }
    }

    private String func_433_b(Random p_433_1_)
    {
        int i = p_433_1_.nextInt(4);
        if(i == 0)
        {
            return "Skeleton";
        }
        if(i == 1)
        {
            return "Zombie";
        }
        if(i == 2)
        {
            return "Zombie";
        }
        if(i == 3)
        {
            return "Spider";
        } else
        {
            return "";
        }
    }
}
