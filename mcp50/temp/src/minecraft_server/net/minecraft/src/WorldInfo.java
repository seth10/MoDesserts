// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            WorldType, NBTTagCompound, WorldSettings, EntityPlayer

public class WorldInfo
{

    private long field_22202_a;
    private WorldType field_46070_b;
    private int field_22201_b;
    private int field_22200_c;
    private int field_22199_d;
    private long field_22198_e;
    private long field_22197_f;
    private long field_22196_g;
    private NBTTagCompound field_22195_h;
    private int field_22194_i;
    private String field_22193_j;
    private int field_22192_k;
    private boolean field_27126_l;
    private int field_27125_m;
    private boolean field_27124_n;
    private int field_27123_o;
    private int field_35503_p;
    private boolean field_35502_q;
    private boolean field_40471_r;

    public WorldInfo(NBTTagCompound p_i112_1_)
    {
        field_46070_b = WorldType.field_48457_b;
        field_40471_r = false;
        field_22202_a = p_i112_1_.func_404_e("RandomSeed");
        if(p_i112_1_.func_410_a("generatorName"))
        {
            String s = p_i112_1_.func_401_h("generatorName");
            field_46070_b = WorldType.func_46049_a(s);
            if(field_46070_b == null)
            {
                field_46070_b = WorldType.field_48457_b;
            } else
            if(field_46070_b.func_48453_c())
            {
                int i = 0;
                if(p_i112_1_.func_410_a("generatorVersion"))
                {
                    i = p_i112_1_.func_395_d("generatorVersion");
                }
                field_46070_b = field_46070_b.func_48451_a(i);
            }
        }
        field_35503_p = p_i112_1_.func_395_d("GameType");
        if(p_i112_1_.func_410_a("MapFeatures"))
        {
            field_35502_q = p_i112_1_.func_402_l("MapFeatures");
        } else
        {
            field_35502_q = true;
        }
        field_22201_b = p_i112_1_.func_395_d("SpawnX");
        field_22200_c = p_i112_1_.func_395_d("SpawnY");
        field_22199_d = p_i112_1_.func_395_d("SpawnZ");
        field_22198_e = p_i112_1_.func_404_e("Time");
        field_22197_f = p_i112_1_.func_404_e("LastPlayed");
        field_22196_g = p_i112_1_.func_404_e("SizeOnDisk");
        field_22193_j = p_i112_1_.func_401_h("LevelName");
        field_22192_k = p_i112_1_.func_395_d("version");
        field_27125_m = p_i112_1_.func_395_d("rainTime");
        field_27126_l = p_i112_1_.func_402_l("raining");
        field_27123_o = p_i112_1_.func_395_d("thunderTime");
        field_27124_n = p_i112_1_.func_402_l("thundering");
        field_40471_r = p_i112_1_.func_402_l("hardcore");
        if(p_i112_1_.func_410_a("Player"))
        {
            field_22195_h = p_i112_1_.func_397_j("Player");
            field_22194_i = field_22195_h.func_395_d("Dimension");
        }
    }

    public WorldInfo(WorldSettings p_i113_1_, String p_i113_2_)
    {
        field_46070_b = WorldType.field_48457_b;
        field_40471_r = false;
        field_22202_a = p_i113_1_.func_35038_a();
        field_35503_p = p_i113_1_.func_35039_b();
        field_35502_q = p_i113_1_.func_35040_c();
        field_22193_j = p_i113_2_;
        field_40471_r = p_i113_1_.func_40279_c();
        field_46070_b = p_i113_1_.func_46128_e();
    }

    public WorldInfo(WorldInfo p_i114_1_)
    {
        field_46070_b = WorldType.field_48457_b;
        field_40471_r = false;
        field_22202_a = p_i114_1_.field_22202_a;
        field_46070_b = p_i114_1_.field_46070_b;
        field_35503_p = p_i114_1_.field_35503_p;
        field_35502_q = p_i114_1_.field_35502_q;
        field_22201_b = p_i114_1_.field_22201_b;
        field_22200_c = p_i114_1_.field_22200_c;
        field_22199_d = p_i114_1_.field_22199_d;
        field_22198_e = p_i114_1_.field_22198_e;
        field_22197_f = p_i114_1_.field_22197_f;
        field_22196_g = p_i114_1_.field_22196_g;
        field_22195_h = p_i114_1_.field_22195_h;
        field_22194_i = p_i114_1_.field_22194_i;
        field_22193_j = p_i114_1_.field_22193_j;
        field_22192_k = p_i114_1_.field_22192_k;
        field_27125_m = p_i114_1_.field_27125_m;
        field_27126_l = p_i114_1_.field_27126_l;
        field_27123_o = p_i114_1_.field_27123_o;
        field_27124_n = p_i114_1_.field_27124_n;
        field_40471_r = p_i114_1_.field_40471_r;
    }

    public NBTTagCompound func_22185_a()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        func_22176_a(nbttagcompound, field_22195_h);
        return nbttagcompound;
    }

    public NBTTagCompound func_22183_a(List p_22183_1_)
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        EntityPlayer entityplayer = null;
        NBTTagCompound nbttagcompound1 = null;
        if(p_22183_1_.size() > 0)
        {
            entityplayer = (EntityPlayer)p_22183_1_.get(0);
        }
        if(entityplayer != null)
        {
            nbttagcompound1 = new NBTTagCompound();
            entityplayer.func_98_d(nbttagcompound1);
        }
        func_22176_a(nbttagcompound, nbttagcompound1);
        return nbttagcompound;
    }

    private void func_22176_a(NBTTagCompound p_22176_1_, NBTTagCompound p_22176_2_)
    {
        p_22176_1_.func_396_a("RandomSeed", field_22202_a);
        p_22176_1_.func_403_a("generatorName", field_46070_b.func_48449_a());
        p_22176_1_.func_405_a("generatorVersion", field_46070_b.func_48452_b());
        p_22176_1_.func_405_a("GameType", field_35503_p);
        p_22176_1_.func_393_a("MapFeatures", field_35502_q);
        p_22176_1_.func_405_a("SpawnX", field_22201_b);
        p_22176_1_.func_405_a("SpawnY", field_22200_c);
        p_22176_1_.func_405_a("SpawnZ", field_22199_d);
        p_22176_1_.func_396_a("Time", field_22198_e);
        p_22176_1_.func_396_a("SizeOnDisk", field_22196_g);
        p_22176_1_.func_396_a("LastPlayed", System.currentTimeMillis());
        p_22176_1_.func_403_a("LevelName", field_22193_j);
        p_22176_1_.func_405_a("version", field_22192_k);
        p_22176_1_.func_405_a("rainTime", field_27125_m);
        p_22176_1_.func_393_a("raining", field_27126_l);
        p_22176_1_.func_405_a("thunderTime", field_27123_o);
        p_22176_1_.func_393_a("thundering", field_27124_n);
        p_22176_1_.func_393_a("hardcore", field_40471_r);
        if(p_22176_2_ != null)
        {
            p_22176_1_.func_392_a("Player", p_22176_2_);
        }
    }

    public long func_22187_b()
    {
        return field_22202_a;
    }

    public int func_22184_c()
    {
        return field_22201_b;
    }

    public int func_22179_d()
    {
        return field_22200_c;
    }

    public int func_22189_e()
    {
        return field_22199_d;
    }

    public long func_22186_f()
    {
        return field_22198_e;
    }

    public int func_22178_h()
    {
        return field_22194_i;
    }

    public void func_22180_a(long p_22180_1_)
    {
        field_22198_e = p_22180_1_;
    }

    public void func_22181_a(int p_22181_1_, int p_22181_2_, int p_22181_3_)
    {
        field_22201_b = p_22181_1_;
        field_22200_c = p_22181_2_;
        field_22199_d = p_22181_3_;
    }

    public void func_22190_a(String p_22190_1_)
    {
        field_22193_j = p_22190_1_;
    }

    public int func_22188_i()
    {
        return field_22192_k;
    }

    public void func_22191_a(int p_22191_1_)
    {
        field_22192_k = p_22191_1_;
    }

    public boolean func_27122_j()
    {
        return field_27124_n;
    }

    public void func_27119_a(boolean p_27119_1_)
    {
        field_27124_n = p_27119_1_;
    }

    public int func_27117_k()
    {
        return field_27123_o;
    }

    public void func_27121_b(int p_27121_1_)
    {
        field_27123_o = p_27121_1_;
    }

    public boolean func_27115_l()
    {
        return field_27126_l;
    }

    public void func_27116_b(boolean p_27116_1_)
    {
        field_27126_l = p_27116_1_;
    }

    public int func_27120_m()
    {
        return field_27125_m;
    }

    public void func_27118_c(int p_27118_1_)
    {
        field_27125_m = p_27118_1_;
    }

    public int func_35501_n()
    {
        return field_35503_p;
    }

    public boolean func_35499_o()
    {
        return field_35502_q;
    }

    public void func_35500_d(int p_35500_1_)
    {
        field_35503_p = p_35500_1_;
    }

    public boolean func_40470_p()
    {
        return field_40471_r;
    }

    public WorldType func_46069_q()
    {
        return field_46070_b;
    }

    public void func_48392_a(WorldType p_48392_1_)
    {
        field_46070_b = p_48392_1_;
    }
}
