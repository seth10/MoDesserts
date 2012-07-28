// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound, AnvilConverterData, NibbleArrayReader, NBTTagList, 
//            NibbleArray, WorldChunkManager, BiomeGenBase

public class ChunkLoader
{

    public ChunkLoader()
    {
    }

    public static AnvilConverterData func_48624_a(NBTTagCompound p_48624_0_)
    {
        int i = p_48624_0_.func_395_d("xPos");
        int j = p_48624_0_.func_395_d("zPos");
        AnvilConverterData anvilconverterdata = new AnvilConverterData(i, j);
        anvilconverterdata.field_48569_g = p_48624_0_.func_400_i("Blocks");
        anvilconverterdata.field_48568_f = new NibbleArrayReader(p_48624_0_.func_400_i("Data"), 7);
        anvilconverterdata.field_48571_e = new NibbleArrayReader(p_48624_0_.func_400_i("SkyLight"), 7);
        anvilconverterdata.field_48570_d = new NibbleArrayReader(p_48624_0_.func_400_i("BlockLight"), 7);
        anvilconverterdata.field_48573_c = p_48624_0_.func_400_i("HeightMap");
        anvilconverterdata.field_48572_b = p_48624_0_.func_402_l("TerrainPopulated");
        anvilconverterdata.field_48578_h = p_48624_0_.func_407_k("Entities");
        anvilconverterdata.field_48579_i = p_48624_0_.func_407_k("TileEntities");
        anvilconverterdata.field_48576_j = p_48624_0_.func_407_k("TileTicks");
        try
        {
            anvilconverterdata.field_48574_a = p_48624_0_.func_404_e("LastUpdate");
        }
        catch(ClassCastException classcastexception)
        {
            anvilconverterdata.field_48574_a = p_48624_0_.func_395_d("LastUpdate");
        }
        return anvilconverterdata;
    }

    public static void func_48623_a(AnvilConverterData p_48623_0_, NBTTagCompound p_48623_1_, WorldChunkManager p_48623_2_)
    {
        p_48623_1_.func_405_a("xPos", p_48623_0_.field_48577_k);
        p_48623_1_.func_405_a("zPos", p_48623_0_.field_48575_l);
        p_48623_1_.func_396_a("LastUpdate", p_48623_0_.field_48574_a);
        int ai[] = new int[p_48623_0_.field_48573_c.length];
        for(int i = 0; i < p_48623_0_.field_48573_c.length; i++)
        {
            ai[i] = p_48623_0_.field_48573_c[i];
        }

        p_48623_1_.func_48446_a("HeightMap", ai);
        p_48623_1_.func_393_a("TerrainPopulated", p_48623_0_.field_48572_b);
        NBTTagList nbttaglist = new NBTTagList("Sections");
        for(int j = 0; j < 8; j++)
        {
            boolean flag = true;
            for(int l = 0; l < 16 && flag; l++)
            {
label0:
                for(int j1 = 0; j1 < 16 && flag; j1++)
                {
                    int k1 = 0;
                    do
                    {
                        if(k1 >= 16)
                        {
                            continue label0;
                        }
                        int l1 = l << 11 | k1 << 7 | j1 + (j << 4);
                        byte byte0 = p_48623_0_.field_48569_g[l1];
                        if(byte0 != 0)
                        {
                            flag = false;
                            continue label0;
                        }
                        k1++;
                    } while(true);
                }

            }

            if(flag)
            {
                continue;
            }
            byte abyte1[] = new byte[4096];
            NibbleArray nibblearray = new NibbleArray(abyte1.length, 4);
            NibbleArray nibblearray1 = new NibbleArray(abyte1.length, 4);
            NibbleArray nibblearray2 = new NibbleArray(abyte1.length, 4);
            for(int i2 = 0; i2 < 16; i2++)
            {
                for(int j2 = 0; j2 < 16; j2++)
                {
                    for(int k2 = 0; k2 < 16; k2++)
                    {
                        int l2 = i2 << 11 | k2 << 7 | j2 + (j << 4);
                        byte byte1 = p_48623_0_.field_48569_g[l2];
                        abyte1[j2 << 8 | k2 << 4 | i2] = (byte)(byte1 & 0xff);
                        nibblearray.func_561_a(i2, j2, k2, p_48623_0_.field_48568_f.func_48618_a(i2, j2 + (j << 4), k2));
                        nibblearray1.func_561_a(i2, j2, k2, p_48623_0_.field_48571_e.func_48618_a(i2, j2 + (j << 4), k2));
                        nibblearray2.func_561_a(i2, j2, k2, p_48623_0_.field_48570_d.func_48618_a(i2, j2 + (j << 4), k2));
                    }

                }

            }

            NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.func_409_a("Y", (byte)(j & 0xff));
            nbttagcompound.func_391_a("Blocks", abyte1);
            nbttagcompound.func_391_a("Data", nibblearray.field_844_a);
            nbttagcompound.func_391_a("SkyLight", nibblearray1.field_844_a);
            nbttagcompound.func_391_a("BlockLight", nibblearray2.field_844_a);
            nbttaglist.func_386_a(nbttagcompound);
        }

        p_48623_1_.func_399_a("Sections", nbttaglist);
        byte abyte0[] = new byte[256];
        for(int k = 0; k < 16; k++)
        {
            for(int i1 = 0; i1 < 16; i1++)
            {
                abyte0[i1 << 4 | k] = (byte)(p_48623_2_.func_4067_a(p_48623_0_.field_48577_k << 4 | k, p_48623_0_.field_48575_l << 4 | i1).field_35529_y & 0xff);
            }

        }

        p_48623_1_.func_391_a("Biomes", abyte0);
        p_48623_1_.func_399_a("Entities", p_48623_0_.field_48578_h);
        p_48623_1_.func_399_a("TileEntities", p_48623_0_.field_48579_i);
        if(p_48623_0_.field_48576_j != null)
        {
            p_48623_1_.func_399_a("TileTicks", p_48623_0_.field_48576_j);
        }
    }
}
