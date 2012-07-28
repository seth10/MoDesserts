// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WorldSavedData, NBTTagCompound, MapInfo, EntityPlayer, 
//            InventoryPlayer, MapCoord, ItemStack, World

public class MapData extends WorldSavedData
{

    public int field_28164_b;
    public int field_28163_c;
    public byte field_28162_d;
    public byte field_28161_e;
    public byte field_28160_f[];
    public int field_28159_g;
    public List field_28158_h;
    private Map field_28156_j;
    public List field_28157_i;

    public MapData(String p_i216_1_)
    {
        super(p_i216_1_);
        field_28160_f = new byte[16384];
        field_28158_h = new ArrayList();
        field_28156_j = new HashMap();
        field_28157_i = new ArrayList();
    }

    public void func_28148_a(NBTTagCompound p_28148_1_)
    {
        field_28162_d = p_28148_1_.func_408_b("dimension");
        field_28164_b = p_28148_1_.func_395_d("xCenter");
        field_28163_c = p_28148_1_.func_395_d("zCenter");
        field_28161_e = p_28148_1_.func_408_b("scale");
        if(field_28161_e < 0)
        {
            field_28161_e = 0;
        }
        if(field_28161_e > 4)
        {
            field_28161_e = 4;
        }
        short word0 = p_28148_1_.func_406_c("width");
        short word1 = p_28148_1_.func_406_c("height");
        if(word0 == 128 && word1 == 128)
        {
            field_28160_f = p_28148_1_.func_400_i("colors");
        } else
        {
            byte abyte0[] = p_28148_1_.func_400_i("colors");
            field_28160_f = new byte[16384];
            int i = (128 - word0) / 2;
            int j = (128 - word1) / 2;
            for(int k = 0; k < word1; k++)
            {
                int l = k + j;
                if(l < 0 && l >= 128)
                {
                    continue;
                }
                for(int i1 = 0; i1 < word0; i1++)
                {
                    int j1 = i1 + i;
                    if(j1 >= 0 || j1 < 128)
                    {
                        field_28160_f[j1 + l * 128] = abyte0[i1 + k * word0];
                    }
                }

            }

        }
    }

    public void func_28147_b(NBTTagCompound p_28147_1_)
    {
        p_28147_1_.func_409_a("dimension", field_28162_d);
        p_28147_1_.func_405_a("xCenter", field_28164_b);
        p_28147_1_.func_405_a("zCenter", field_28163_c);
        p_28147_1_.func_409_a("scale", field_28161_e);
        p_28147_1_.func_394_a("width", (short)128);
        p_28147_1_.func_394_a("height", (short)128);
        p_28147_1_.func_391_a("colors", field_28160_f);
    }

    public void func_28155_a(EntityPlayer p_28155_1_, ItemStack p_28155_2_)
    {
        if(!field_28156_j.containsKey(p_28155_1_))
        {
            MapInfo mapinfo = new MapInfo(this, p_28155_1_);
            field_28156_j.put(p_28155_1_, mapinfo);
            field_28158_h.add(mapinfo);
        }
        field_28157_i.clear();
        for(int i = 0; i < field_28158_h.size(); i++)
        {
            MapInfo mapinfo1 = (MapInfo)field_28158_h.get(i);
            if(mapinfo1.field_28120_a.field_304_B || !mapinfo1.field_28120_a.field_416_aj.func_28010_c(p_28155_2_))
            {
                field_28156_j.remove(mapinfo1.field_28120_a);
                field_28158_h.remove(mapinfo1);
                continue;
            }
            float f = (float)(mapinfo1.field_28120_a.field_322_l - (double)field_28164_b) / (float)(1 << field_28161_e);
            float f1 = (float)(mapinfo1.field_28120_a.field_320_n - (double)field_28163_c) / (float)(1 << field_28161_e);
            int j = 64;
            int k = 64;
            if(f < (float)(-j) || f1 < (float)(-k) || f > (float)j || f1 > (float)k)
            {
                continue;
            }
            byte byte0 = 0;
            byte byte1 = (byte)(int)((double)(f * 2.0F) + 0.5D);
            byte byte2 = (byte)(int)((double)(f1 * 2.0F) + 0.5D);
            byte byte3 = (byte)(int)((double)((p_28155_1_.field_316_r * 16F) / 360F) + 0.5D);
            if(field_28162_d < 0)
            {
                int l = field_28159_g / 10;
                byte3 = (byte)(l * l * 0x209a771 + l * 121 >> 15 & 0xf);
            }
            if(mapinfo1.field_28120_a.field_4110_as == field_28162_d)
            {
                field_28157_i.add(new MapCoord(this, byte0, byte1, byte2, byte3));
            }
        }

    }

    public byte[] func_28154_a(ItemStack p_28154_1_, World p_28154_2_, EntityPlayer p_28154_3_)
    {
        MapInfo mapinfo = (MapInfo)field_28156_j.get(p_28154_3_);
        if(mapinfo == null)
        {
            return null;
        } else
        {
            byte abyte0[] = mapinfo.func_28118_a(p_28154_1_);
            return abyte0;
        }
    }

    public void func_28153_a(int p_28153_1_, int p_28153_2_, int p_28153_3_)
    {
        super.func_28146_a();
        for(int i = 0; i < field_28158_h.size(); i++)
        {
            MapInfo mapinfo = (MapInfo)field_28158_h.get(i);
            if(mapinfo.field_28119_b[p_28153_1_] < 0 || mapinfo.field_28119_b[p_28153_1_] > p_28153_2_)
            {
                mapinfo.field_28119_b[p_28153_1_] = p_28153_2_;
            }
            if(mapinfo.field_28125_c[p_28153_1_] < 0 || mapinfo.field_28125_c[p_28153_1_] < p_28153_3_)
            {
                mapinfo.field_28125_c[p_28153_1_] = p_28153_3_;
            }
        }

    }
}
