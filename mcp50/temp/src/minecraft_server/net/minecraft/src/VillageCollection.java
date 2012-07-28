// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ChunkCoordinates, Village, VillageDoorInfo, Block, 
//            BlockDoor, World

public class VillageCollection
{

    private World field_48644_a;
    private final List field_48642_b = new ArrayList();
    private final List field_48643_c = new ArrayList();
    private final List field_48640_d = new ArrayList();
    private int field_48641_e;

    public VillageCollection(World p_i1067_1_)
    {
        field_48641_e = 0;
        field_48644_a = p_i1067_1_;
    }

    public void func_48639_a(int p_48639_1_, int p_48639_2_, int p_48639_3_)
    {
        if(field_48642_b.size() > 64)
        {
            return;
        }
        if(!func_48636_d(p_48639_1_, p_48639_2_, p_48639_3_))
        {
            field_48642_b.add(new ChunkCoordinates(p_48639_1_, p_48639_2_, p_48639_3_));
        }
    }

    public void func_48633_a()
    {
        field_48641_e++;
        Village village;
        for(Iterator iterator = field_48640_d.iterator(); iterator.hasNext(); village.func_48519_a(field_48641_e))
        {
            village = (Village)iterator.next();
        }

        func_48637_c();
        func_48631_d();
        func_48634_e();
    }

    private void func_48637_c()
    {
        Iterator iterator = field_48640_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Village village = (Village)iterator.next();
            if(village.func_48524_g())
            {
                iterator.remove();
            }
        } while(true);
    }

    public List func_48628_b()
    {
        return field_48640_d;
    }

    public Village func_48632_a(int p_48632_1_, int p_48632_2_, int p_48632_3_, int p_48632_4_)
    {
        Village village = null;
        float f = 3.402823E+38F;
        Iterator iterator = field_48640_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Village village1 = (Village)iterator.next();
            float f1 = village1.func_48526_a().func_48473_c(p_48632_1_, p_48632_2_, p_48632_3_);
            if(f1 < f)
            {
                int i = p_48632_4_ + village1.func_48527_b();
                if(f1 <= (float)(i * i))
                {
                    village = village1;
                    f = f1;
                }
            }
        } while(true);
        return village;
    }

    private void func_48631_d()
    {
        if(field_48642_b.isEmpty())
        {
            return;
        } else
        {
            func_48635_a((ChunkCoordinates)field_48642_b.remove(0));
            return;
        }
    }

    private void func_48634_e()
    {
        for(int i = 0; i < field_48643_c.size(); i++)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)field_48643_c.get(i);
            boolean flag = false;
            Iterator iterator = field_48640_d.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Village village1 = (Village)iterator.next();
                int j = (int)village1.func_48526_a().func_27127_a(villagedoorinfo.field_48493_a, villagedoorinfo.field_48491_b, villagedoorinfo.field_48492_c);
                if(j > 32 + village1.func_48527_b())
                {
                    continue;
                }
                village1.func_48532_a(villagedoorinfo);
                flag = true;
                break;
            } while(true);
            if(!flag)
            {
                Village village = new Village(field_48644_a);
                village.func_48532_a(villagedoorinfo);
                field_48640_d.add(village);
            }
        }

        field_48643_c.clear();
    }

    private void func_48635_a(ChunkCoordinates p_48635_1_)
    {
        byte byte0 = 16;
        byte byte1 = 4;
        byte byte2 = 16;
        for(int i = p_48635_1_.field_22216_a - byte0; i < p_48635_1_.field_22216_a + byte0; i++)
        {
            for(int j = p_48635_1_.field_529_a - byte1; j < p_48635_1_.field_529_a + byte1; j++)
            {
                for(int k = p_48635_1_.field_528_b - byte2; k < p_48635_1_.field_528_b + byte2; k++)
                {
                    if(!func_48629_e(i, j, k))
                    {
                        continue;
                    }
                    VillageDoorInfo villagedoorinfo = func_48638_b(i, j, k);
                    if(villagedoorinfo == null)
                    {
                        func_48630_c(i, j, k);
                    } else
                    {
                        villagedoorinfo.field_48487_f = field_48641_e;
                    }
                }

            }

        }

    }

    private VillageDoorInfo func_48638_b(int p_48638_1_, int p_48638_2_, int p_48638_3_)
    {
        for(Iterator iterator = field_48643_c.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(villagedoorinfo.field_48493_a == p_48638_1_ && villagedoorinfo.field_48492_c == p_48638_3_ && Math.abs(villagedoorinfo.field_48491_b - p_48638_2_) <= 1)
            {
                return villagedoorinfo;
            }
        }

        for(Iterator iterator1 = field_48640_d.iterator(); iterator1.hasNext();)
        {
            Village village = (Village)iterator1.next();
            VillageDoorInfo villagedoorinfo1 = village.func_48518_d(p_48638_1_, p_48638_2_, p_48638_3_);
            if(villagedoorinfo1 != null)
            {
                return villagedoorinfo1;
            }
        }

        return null;
    }

    private void func_48630_c(int p_48630_1_, int p_48630_2_, int p_48630_3_)
    {
        int i = ((BlockDoor)Block.field_639_aF).func_48136_c(field_48644_a, p_48630_1_, p_48630_2_, p_48630_3_);
        if(i == 0 || i == 2)
        {
            int j = 0;
            for(int l = -5; l < 0; l++)
            {
                if(field_48644_a.func_497_g(p_48630_1_ + l, p_48630_2_, p_48630_3_))
                {
                    j--;
                }
            }

            for(int i1 = 1; i1 <= 5; i1++)
            {
                if(field_48644_a.func_497_g(p_48630_1_ + i1, p_48630_2_, p_48630_3_))
                {
                    j++;
                }
            }

            if(j != 0)
            {
                field_48643_c.add(new VillageDoorInfo(p_48630_1_, p_48630_2_, p_48630_3_, j <= 0 ? 2 : -2, 0, field_48641_e));
            }
        } else
        {
            int k = 0;
            for(int j1 = -5; j1 < 0; j1++)
            {
                if(field_48644_a.func_497_g(p_48630_1_, p_48630_2_, p_48630_3_ + j1))
                {
                    k--;
                }
            }

            for(int k1 = 1; k1 <= 5; k1++)
            {
                if(field_48644_a.func_497_g(p_48630_1_, p_48630_2_, p_48630_3_ + k1))
                {
                    k++;
                }
            }

            if(k != 0)
            {
                field_48643_c.add(new VillageDoorInfo(p_48630_1_, p_48630_2_, p_48630_3_, 0, k <= 0 ? 2 : -2, field_48641_e));
            }
        }
    }

    private boolean func_48636_d(int p_48636_1_, int p_48636_2_, int p_48636_3_)
    {
        for(Iterator iterator = field_48642_b.iterator(); iterator.hasNext();)
        {
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)iterator.next();
            if(chunkcoordinates.field_22216_a == p_48636_1_ && chunkcoordinates.field_529_a == p_48636_2_ && chunkcoordinates.field_528_b == p_48636_3_)
            {
                return true;
            }
        }

        return false;
    }

    private boolean func_48629_e(int p_48629_1_, int p_48629_2_, int p_48629_3_)
    {
        int i = field_48644_a.func_444_a(p_48629_1_, p_48629_2_, p_48629_3_);
        return i == Block.field_639_aF.field_573_bc;
    }
}
