// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ChunkCoordinates, World, MathHelper, EntityIronGolem, 
//            Vec3D, AxisAlignedBB, EntityVillager, VillageDoorInfo, 
//            VillageAgressor, EntityLiving, Block

public class Village
{

    private final World field_48542_a;
    private final List field_48540_b = new ArrayList();
    private final ChunkCoordinates field_48541_c = new ChunkCoordinates(0, 0, 0);
    private final ChunkCoordinates field_48538_d = new ChunkCoordinates(0, 0, 0);
    private int field_48539_e;
    private int field_48536_f;
    private int field_48537_g;
    private int field_48544_h;
    private List field_48545_i;
    private int field_48543_j;

    public Village(World p_i1062_1_)
    {
        field_48539_e = 0;
        field_48536_f = 0;
        field_48537_g = 0;
        field_48544_h = 0;
        field_48545_i = new ArrayList();
        field_48543_j = 0;
        field_48542_a = p_i1062_1_;
    }

    public void func_48519_a(int p_48519_1_)
    {
        field_48537_g = p_48519_1_;
        func_48515_k();
        func_48523_j();
        if(p_48519_1_ % 20 == 0)
        {
            func_48529_i();
        }
        if(p_48519_1_ % 30 == 0)
        {
            func_48535_h();
        }
        int i = field_48544_h / 16;
        if(field_48543_j < i && field_48540_b.size() > 20 && field_48542_a.field_803_m.nextInt(7000) == 0)
        {
            Vec3D vec3d = func_48516_a(MathHelper.func_588_d(field_48538_d.field_22216_a), MathHelper.func_588_d(field_48538_d.field_529_a), MathHelper.func_588_d(field_48538_d.field_528_b), 2, 4, 2);
            if(vec3d != null)
            {
                EntityIronGolem entityirongolem = new EntityIronGolem(field_48542_a);
                entityirongolem.func_86_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c);
                field_48542_a.func_526_a(entityirongolem);
                field_48543_j++;
            }
        }
    }

    private Vec3D func_48516_a(int p_48516_1_, int p_48516_2_, int p_48516_3_, int p_48516_4_, int p_48516_5_, int p_48516_6_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_48516_1_ + field_48542_a.field_803_m.nextInt(16)) - 8;
            int k = (p_48516_2_ + field_48542_a.field_803_m.nextInt(6)) - 3;
            int l = (p_48516_3_ + field_48542_a.field_803_m.nextInt(16)) - 8;
            if(func_48528_a(j, k, l) && func_48522_b(j, k, l, p_48516_4_, p_48516_5_, p_48516_6_))
            {
                return Vec3D.func_768_b(j, k, l);
            }
        }

        return null;
    }

    private boolean func_48522_b(int p_48522_1_, int p_48522_2_, int p_48522_3_, int p_48522_4_, int p_48522_5_, int p_48522_6_)
    {
        if(!field_48542_a.func_445_d(p_48522_1_, p_48522_2_ - 1, p_48522_3_))
        {
            return false;
        }
        int i = p_48522_1_ - p_48522_4_ / 2;
        int j = p_48522_3_ - p_48522_6_ / 2;
        for(int k = i; k < i + p_48522_4_; k++)
        {
            for(int l = p_48522_2_; l < p_48522_2_ + p_48522_5_; l++)
            {
                for(int i1 = j; i1 < j + p_48522_6_; i1++)
                {
                    if(field_48542_a.func_445_d(k, l, i1))
                    {
                        return false;
                    }
                }

            }

        }

        return true;
    }

    private void func_48535_h()
    {
        List list = field_48542_a.func_457_a(net.minecraft.src.EntityIronGolem.class, AxisAlignedBB.func_693_b(field_48538_d.field_22216_a - field_48539_e, field_48538_d.field_529_a - 4, field_48538_d.field_528_b - field_48539_e, field_48538_d.field_22216_a + field_48539_e, field_48538_d.field_529_a + 4, field_48538_d.field_528_b + field_48539_e));
        field_48543_j = list.size();
    }

    private void func_48529_i()
    {
        List list = field_48542_a.func_457_a(net.minecraft.src.EntityVillager.class, AxisAlignedBB.func_693_b(field_48538_d.field_22216_a - field_48539_e, field_48538_d.field_529_a - 4, field_48538_d.field_528_b - field_48539_e, field_48538_d.field_22216_a + field_48539_e, field_48538_d.field_529_a + 4, field_48538_d.field_528_b + field_48539_e));
        field_48544_h = list.size();
    }

    public ChunkCoordinates func_48526_a()
    {
        return field_48538_d;
    }

    public int func_48527_b()
    {
        return field_48539_e;
    }

    public int func_48525_c()
    {
        return field_48540_b.size();
    }

    public int func_48520_d()
    {
        return field_48537_g - field_48536_f;
    }

    public int func_48521_e()
    {
        return field_48544_h;
    }

    public boolean func_48528_a(int p_48528_1_, int p_48528_2_, int p_48528_3_)
    {
        return field_48538_d.func_48473_c(p_48528_1_, p_48528_2_, p_48528_3_) < (float)(field_48539_e * field_48539_e);
    }

    public List func_48517_f()
    {
        return field_48540_b;
    }

    public VillageDoorInfo func_48533_b(int p_48533_1_, int p_48533_2_, int p_48533_3_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        Iterator iterator = field_48540_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48481_a(p_48533_1_, p_48533_2_, p_48533_3_);
            if(j < i)
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    public VillageDoorInfo func_48513_c(int p_48513_1_, int p_48513_2_, int p_48513_3_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        Iterator iterator = field_48540_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48481_a(p_48513_1_, p_48513_2_, p_48513_3_);
            if(j > 256)
            {
                j *= 1000;
            } else
            {
                j = villagedoorinfo1.func_48480_f();
            }
            if(j < i)
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    public VillageDoorInfo func_48518_d(int p_48518_1_, int p_48518_2_, int p_48518_3_)
    {
        if(field_48538_d.func_48473_c(p_48518_1_, p_48518_2_, p_48518_3_) > (float)(field_48539_e * field_48539_e))
        {
            return null;
        }
        for(Iterator iterator = field_48540_b.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(villagedoorinfo.field_48493_a == p_48518_1_ && villagedoorinfo.field_48492_c == p_48518_3_ && Math.abs(villagedoorinfo.field_48491_b - p_48518_2_) <= 1)
            {
                return villagedoorinfo;
            }
        }

        return null;
    }

    public void func_48532_a(VillageDoorInfo p_48532_1_)
    {
        field_48540_b.add(p_48532_1_);
        field_48541_c.field_22216_a += p_48532_1_.field_48493_a;
        field_48541_c.field_529_a += p_48532_1_.field_48491_b;
        field_48541_c.field_528_b += p_48532_1_.field_48492_c;
        func_48531_l();
        field_48536_f = p_48532_1_.field_48487_f;
    }

    public boolean func_48524_g()
    {
        return field_48540_b.isEmpty();
    }

    public void func_48530_a(EntityLiving p_48530_1_)
    {
        for(Iterator iterator = field_48545_i.iterator(); iterator.hasNext();)
        {
            VillageAgressor villageagressor = (VillageAgressor)iterator.next();
            if(villageagressor.field_48627_a == p_48530_1_)
            {
                villageagressor.field_48625_b = field_48537_g;
                return;
            }
        }

        field_48545_i.add(new VillageAgressor(this, p_48530_1_, field_48537_g));
    }

    public EntityLiving func_48534_b(EntityLiving p_48534_1_)
    {
        double d = 1.7976931348623157E+308D;
        VillageAgressor villageagressor = null;
        for(int i = 0; i < field_48545_i.size(); i++)
        {
            VillageAgressor villageagressor1 = (VillageAgressor)field_48545_i.get(i);
            double d1 = villageagressor1.field_48627_a.func_102_b(p_48534_1_);
            if(d1 <= d)
            {
                villageagressor = villageagressor1;
                d = d1;
            }
        }

        return villageagressor == null ? null : villageagressor.field_48627_a;
    }

    private void func_48523_j()
    {
        Iterator iterator = field_48545_i.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageAgressor villageagressor = (VillageAgressor)iterator.next();
            if(!villageagressor.field_48627_a.func_120_t() || Math.abs(field_48537_g - villageagressor.field_48625_b) > 300)
            {
                iterator.remove();
            }
        } while(true);
    }

    private void func_48515_k()
    {
        boolean flag = false;
        boolean flag1 = field_48542_a.field_803_m.nextInt(50) == 0;
        Iterator iterator = field_48540_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(flag1)
            {
                villagedoorinfo.func_48478_d();
            }
            if(!func_48514_e(villagedoorinfo.field_48493_a, villagedoorinfo.field_48491_b, villagedoorinfo.field_48492_c) || Math.abs(field_48537_g - villagedoorinfo.field_48487_f) > 1200)
            {
                field_48541_c.field_22216_a -= villagedoorinfo.field_48493_a;
                field_48541_c.field_529_a -= villagedoorinfo.field_48491_b;
                field_48541_c.field_528_b -= villagedoorinfo.field_48492_c;
                flag = true;
                villagedoorinfo.field_48488_g = true;
                iterator.remove();
            }
        } while(true);
        if(flag)
        {
            func_48531_l();
        }
    }

    private boolean func_48514_e(int p_48514_1_, int p_48514_2_, int p_48514_3_)
    {
        int i = field_48542_a.func_444_a(p_48514_1_, p_48514_2_, p_48514_3_);
        if(i <= 0)
        {
            return false;
        } else
        {
            return i == Block.field_639_aF.field_573_bc;
        }
    }

    private void func_48531_l()
    {
        int i = field_48540_b.size();
        if(i == 0)
        {
            field_48538_d.func_48474_a(0, 0, 0);
            field_48539_e = 0;
            return;
        }
        field_48538_d.func_48474_a(field_48541_c.field_22216_a / i, field_48541_c.field_529_a / i, field_48541_c.field_528_b / i);
        int j = 0;
        for(Iterator iterator = field_48540_b.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            j = Math.max(villagedoorinfo.func_48481_a(field_48538_d.field_22216_a, field_48538_d.field_529_a, field_48538_d.field_528_b), j);
        }

        field_48539_e = Math.max(32, (int)Math.sqrt(j) + 1);
    }
}
