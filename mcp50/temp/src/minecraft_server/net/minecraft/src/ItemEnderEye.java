// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, World, EntityPlayer, Block, 
//            BlockEndPortalFrame, ItemStack, Direction, MovingObjectPosition, 
//            EnumMovingObjectType, EntityEnderEye, ChunkPosition, PlayerCapabilities

public class ItemEnderEye extends Item
{

    public ItemEnderEye(int p_i511_1_)
    {
        super(p_i511_1_);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        int j = p_78_3_.func_446_b(p_78_4_, p_78_5_, p_78_6_);
        if(p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_) && i == Block.field_40167_bJ.field_573_bc && !BlockEndPortalFrame.func_40179_c(j))
        {
            if(p_78_3_.field_792_x)
            {
                return true;
            }
            p_78_3_.func_511_b(p_78_4_, p_78_5_, p_78_6_, j + 4);
            p_78_1_.field_853_a--;
            for(int k = 0; k < 16; k++)
            {
                double d = (float)p_78_4_ + (5F + field_4154_b.nextFloat() * 6F) / 16F;
                double d1 = (float)p_78_5_ + 0.8125F;
                double d2 = (float)p_78_6_ + (5F + field_4154_b.nextFloat() * 6F) / 16F;
                double d3 = 0.0D;
                double d4 = 0.0D;
                double d5 = 0.0D;
                p_78_3_.func_514_a("smoke", d, d1, d2, d3, d4, d5);
            }

            int l = j & 3;
            int i1 = 0;
            int j1 = 0;
            boolean flag = false;
            boolean flag1 = true;
            int k1 = Direction.field_35607_f[l];
            for(int l1 = -2; l1 <= 2; l1++)
            {
                int l2 = p_78_4_ + Direction.field_35612_a[k1] * l1;
                int l3 = p_78_6_ + Direction.field_35610_b[k1] * l1;
                int l4 = p_78_3_.func_444_a(l2, p_78_5_, l3);
                if(l4 != Block.field_40167_bJ.field_573_bc)
                {
                    continue;
                }
                int l5 = p_78_3_.func_446_b(l2, p_78_5_, l3);
                if(!BlockEndPortalFrame.func_40179_c(l5))
                {
                    flag1 = false;
                    break;
                }
                if(!flag)
                {
                    i1 = l1;
                    j1 = l1;
                    flag = true;
                } else
                {
                    j1 = l1;
                }
            }

            if(flag1 && j1 == i1 + 2)
            {
                int i2 = i1;
                do
                {
                    if(i2 > j1)
                    {
                        break;
                    }
                    int i3 = p_78_4_ + Direction.field_35612_a[k1] * i2;
                    int i4 = p_78_6_ + Direction.field_35610_b[k1] * i2;
                    i3 += Direction.field_35612_a[l] * 4;
                    i4 += Direction.field_35610_b[l] * 4;
                    int i5 = p_78_3_.func_444_a(i3, p_78_5_, i4);
                    int i6 = p_78_3_.func_446_b(i3, p_78_5_, i4);
                    if(i5 != Block.field_40167_bJ.field_573_bc || !BlockEndPortalFrame.func_40179_c(i6))
                    {
                        flag1 = false;
                        break;
                    }
                    i2++;
                } while(true);
label0:
                for(int j2 = i1 - 1; j2 <= j1 + 1; j2 += 4)
                {
                    int j3 = 1;
                    do
                    {
                        if(j3 > 3)
                        {
                            continue label0;
                        }
                        int j4 = p_78_4_ + Direction.field_35612_a[k1] * j2;
                        int j5 = p_78_6_ + Direction.field_35610_b[k1] * j2;
                        j4 += Direction.field_35612_a[l] * j3;
                        j5 += Direction.field_35610_b[l] * j3;
                        int j6 = p_78_3_.func_444_a(j4, p_78_5_, j5);
                        int k6 = p_78_3_.func_446_b(j4, p_78_5_, j5);
                        if(j6 != Block.field_40167_bJ.field_573_bc || !BlockEndPortalFrame.func_40179_c(k6))
                        {
                            flag1 = false;
                            continue label0;
                        }
                        j3++;
                    } while(true);
                }

                if(flag1)
                {
                    for(int k2 = i1; k2 <= j1; k2++)
                    {
                        for(int k3 = 1; k3 <= 3; k3++)
                        {
                            int k4 = p_78_4_ + Direction.field_35612_a[k1] * k2;
                            int k5 = p_78_6_ + Direction.field_35610_b[k1] * k2;
                            k4 += Direction.field_35612_a[l] * k3;
                            k5 += Direction.field_35610_b[l] * k3;
                            p_78_3_.func_508_d(k4, p_78_5_, k5, Block.field_40174_bI.field_573_bc);
                        }

                    }

                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        MovingObjectPosition movingobjectposition = func_40225_a(p_6152_2_, p_6152_3_, false);
        if(movingobjectposition != null && movingobjectposition.field_927_a == EnumMovingObjectType.TILE)
        {
            int i = p_6152_2_.func_444_a(movingobjectposition.field_926_b, movingobjectposition.field_932_c, movingobjectposition.field_931_d);
            if(i == Block.field_40167_bJ.field_573_bc)
            {
                return p_6152_1_;
            }
        }
        if(!p_6152_2_.field_792_x)
        {
            ChunkPosition chunkposition = p_6152_2_.func_40214_b("Stronghold", (int)p_6152_3_.field_322_l, (int)p_6152_3_.field_321_m, (int)p_6152_3_.field_320_n);
            if(chunkposition != null)
            {
                EntityEnderEye entityendereye = new EntityEnderEye(p_6152_2_, p_6152_3_.field_322_l, (p_6152_3_.field_321_m + 1.6200000000000001D) - (double)p_6152_3_.field_9076_H, p_6152_3_.field_320_n);
                entityendereye.func_40056_a(chunkposition.field_846_a, chunkposition.field_845_b, chunkposition.field_847_c);
                p_6152_2_.func_526_a(entityendereye);
                p_6152_2_.func_506_a(p_6152_3_, "random.bow", 0.5F, 0.4F / (field_4154_b.nextFloat() * 0.4F + 0.8F));
                p_6152_2_.func_28101_a(null, 1002, (int)p_6152_3_.field_322_l, (int)p_6152_3_.field_321_m, (int)p_6152_3_.field_320_n, 0);
                if(!p_6152_3_.field_35214_K.field_35657_d)
                {
                    p_6152_1_.field_853_a--;
                }
            }
        }
        return p_6152_1_;
    }
}
