// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IChunkLoader, IThreadedFileIO, ChunkCoordIntPair, AnvilChunkLoaderPending, 
//            RegionFileCache, CompressedStreamTools, NBTTagCompound, Chunk, 
//            World, ThreadedFileIOBase, NBTTagList, ExtendedBlockStorage, 
//            NibbleArray, Entity, TileEntity, NextTickListEntry, 
//            EntityList

public class AnvilChunkLoader
    implements IChunkLoader, IThreadedFileIO
{

    private List field_48469_a;
    private Set field_48467_b;
    private Object field_48468_c;
    private final File field_48466_d;

    public AnvilChunkLoader(File p_i1081_1_)
    {
        field_48469_a = new ArrayList();
        field_48467_b = new HashSet();
        field_48468_c = new Object();
        field_48466_d = p_i1081_1_;
    }

    public Chunk func_659_a(World p_659_1_, int p_659_2_, int p_659_3_)
        throws IOException
    {
        NBTTagCompound nbttagcompound = null;
        ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(p_659_2_, p_659_3_);
        synchronized(field_48468_c)
        {
            if(field_48467_b.contains(chunkcoordintpair))
            {
                int i = 0;
                do
                {
                    if(i >= field_48469_a.size())
                    {
                        break;
                    }
                    if(((AnvilChunkLoaderPending)field_48469_a.get(i)).field_48581_a.equals(chunkcoordintpair))
                    {
                        nbttagcompound = ((AnvilChunkLoaderPending)field_48469_a.get(i)).field_48580_b;
                        break;
                    }
                    i++;
                } while(true);
            }
        }
        if(nbttagcompound == null)
        {
            java.io.DataInputStream datainputstream = RegionFileCache.func_22124_c(field_48466_d, p_659_2_, p_659_3_);
            if(datainputstream != null)
            {
                nbttagcompound = CompressedStreamTools.func_774_a(datainputstream);
            } else
            {
                return null;
            }
        }
        return func_48464_a(p_659_1_, p_659_2_, p_659_3_, nbttagcompound);
    }

    protected Chunk func_48464_a(World p_48464_1_, int p_48464_2_, int p_48464_3_, NBTTagCompound p_48464_4_)
    {
        if(!p_48464_4_.func_410_a("Level"))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48464_2_).append(",").append(p_48464_3_).append(" is missing level data, skipping").toString());
            return null;
        }
        if(!p_48464_4_.func_397_j("Level").func_410_a("Sections"))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48464_2_).append(",").append(p_48464_3_).append(" is missing block data, skipping").toString());
            return null;
        }
        Chunk chunk = func_48465_a(p_48464_1_, p_48464_4_.func_397_j("Level"));
        if(!chunk.func_351_a(p_48464_2_, p_48464_3_))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48464_2_).append(",").append(p_48464_3_).append(" is in the wrong location; relocating. (Expected ").append(p_48464_2_).append(", ").append(p_48464_3_).append(", got ").append(chunk.field_685_j).append(", ").append(chunk.field_684_k).append(")").toString());
            p_48464_4_.func_405_a("xPos", p_48464_2_);
            p_48464_4_.func_405_a("zPos", p_48464_3_);
            chunk = func_48465_a(p_48464_1_, p_48464_4_.func_397_j("Level"));
        }
        chunk.func_25083_h();
        return chunk;
    }

    public void func_662_a(World p_662_1_, Chunk p_662_2_)
        throws IOException
    {
        p_662_1_.func_476_g();
        try
        {
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound.func_399_a("Level", nbttagcompound1);
            func_48462_a(p_662_2_, p_662_1_, nbttagcompound1);
            func_48463_a(p_662_2_.func_40543_i(), nbttagcompound);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void func_48463_a(ChunkCoordIntPair p_48463_1_, NBTTagCompound p_48463_2_)
    {
        synchronized(field_48468_c)
        {
            if(field_48467_b.contains(p_48463_1_))
            {
                for(int i = 0; i < field_48469_a.size(); i++)
                {
                    if(((AnvilChunkLoaderPending)field_48469_a.get(i)).field_48581_a.equals(p_48463_1_))
                    {
                        field_48469_a.set(i, new AnvilChunkLoaderPending(p_48463_1_, p_48463_2_));
                        return;
                    }
                }

            }
            field_48469_a.add(new AnvilChunkLoaderPending(p_48463_1_, p_48463_2_));
            field_48467_b.add(p_48463_1_);
            ThreadedFileIOBase.field_40514_a.func_40507_a(this);
            return;
        }
    }

    public boolean func_40324_c()
    {
        AnvilChunkLoaderPending anvilchunkloaderpending = null;
        synchronized(field_48468_c)
        {
            if(field_48469_a.size() > 0)
            {
                anvilchunkloaderpending = (AnvilChunkLoaderPending)field_48469_a.remove(0);
                field_48467_b.remove(anvilchunkloaderpending.field_48581_a);
            } else
            {
                return false;
            }
        }
        if(anvilchunkloaderpending != null)
        {
            try
            {
                func_48461_a(anvilchunkloaderpending);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return true;
    }

    private void func_48461_a(AnvilChunkLoaderPending p_48461_1_)
        throws IOException
    {
        DataOutputStream dataoutputstream = RegionFileCache.func_22120_d(field_48466_d, p_48461_1_.field_48581_a.field_152_a, p_48461_1_.field_48581_a.field_151_b);
        CompressedStreamTools.func_771_a(p_48461_1_.field_48580_b, dataoutputstream);
        dataoutputstream.close();
    }

    public void func_4104_b(World world, Chunk chunk)
        throws IOException
    {
    }

    public void func_661_a()
    {
    }

    public void func_660_b()
    {
    }

    private void func_48462_a(Chunk p_48462_1_, World p_48462_2_, NBTTagCompound p_48462_3_)
    {
        p_48462_2_.func_476_g();
        p_48462_3_.func_405_a("xPos", p_48462_1_.field_685_j);
        p_48462_3_.func_405_a("zPos", p_48462_1_.field_684_k);
        p_48462_3_.func_396_a("LastUpdate", p_48462_2_.func_22080_k());
        p_48462_3_.func_48446_a("HeightMap", p_48462_1_.field_48562_f);
        p_48462_3_.func_393_a("TerrainPopulated", p_48462_1_.field_681_n);
        ExtendedBlockStorage aextendedblockstorage[] = p_48462_1_.func_48553_h();
        NBTTagList nbttaglist = new NBTTagList("Sections");
        ExtendedBlockStorage aextendedblockstorage1[] = aextendedblockstorage;
        int i = aextendedblockstorage1.length;
        for(int k = 0; k < i; k++)
        {
            ExtendedBlockStorage extendedblockstorage = aextendedblockstorage1[k];
            if(extendedblockstorage == null || extendedblockstorage.func_48587_f() == 0)
            {
                continue;
            }
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.func_409_a("Y", (byte)(extendedblockstorage.func_48597_c() >> 4 & 0xff));
            nbttagcompound.func_391_a("Blocks", extendedblockstorage.func_48590_g());
            if(extendedblockstorage.func_48601_h() != null)
            {
                nbttagcompound.func_391_a("Add", extendedblockstorage.func_48601_h().field_844_a);
            }
            nbttagcompound.func_391_a("Data", extendedblockstorage.func_48594_i().field_844_a);
            nbttagcompound.func_391_a("SkyLight", extendedblockstorage.func_48605_k().field_844_a);
            nbttagcompound.func_391_a("BlockLight", extendedblockstorage.func_48600_j().field_844_a);
            nbttaglist.func_386_a(nbttagcompound);
        }

        p_48462_3_.func_399_a("Sections", nbttaglist);
        p_48462_3_.func_391_a("Biomes", p_48462_1_.func_48552_l());
        p_48462_1_.field_677_r = false;
        NBTTagList nbttaglist1 = new NBTTagList();
label0:
        for(int j = 0; j < p_48462_1_.field_48563_j.length; j++)
        {
            Iterator iterator = p_48462_1_.field_48563_j[j].iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    continue label0;
                }
                Entity entity = (Entity)iterator.next();
                p_48462_1_.field_677_r = true;
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                if(entity.func_95_c(nbttagcompound1))
                {
                    nbttaglist1.func_386_a(nbttagcompound1);
                }
            } while(true);
        }

        p_48462_3_.func_399_a("Entities", nbttaglist1);
        NBTTagList nbttaglist2 = new NBTTagList();
        NBTTagCompound nbttagcompound2;
        for(Iterator iterator1 = p_48462_1_.field_683_l.values().iterator(); iterator1.hasNext(); nbttaglist2.func_386_a(nbttagcompound2))
        {
            TileEntity tileentity = (TileEntity)iterator1.next();
            nbttagcompound2 = new NBTTagCompound();
            tileentity.func_188_b(nbttagcompound2);
        }

        p_48462_3_.func_399_a("TileEntities", nbttaglist2);
        List list = p_48462_2_.func_41046_a(p_48462_1_, false);
        if(list != null)
        {
            long l = p_48462_2_.func_22080_k();
            NBTTagList nbttaglist3 = new NBTTagList();
            NBTTagCompound nbttagcompound3;
            for(Iterator iterator2 = list.iterator(); iterator2.hasNext(); nbttaglist3.func_386_a(nbttagcompound3))
            {
                NextTickListEntry nextticklistentry = (NextTickListEntry)iterator2.next();
                nbttagcompound3 = new NBTTagCompound();
                nbttagcompound3.func_405_a("i", nextticklistentry.field_1022_d);
                nbttagcompound3.func_405_a("x", nextticklistentry.field_1018_a);
                nbttagcompound3.func_405_a("y", nextticklistentry.field_1017_b);
                nbttagcompound3.func_405_a("z", nextticklistentry.field_1023_c);
                nbttagcompound3.func_405_a("t", (int)(nextticklistentry.field_1021_e - l));
            }

            p_48462_3_.func_399_a("TileTicks", nbttaglist3);
        }
    }

    private Chunk func_48465_a(World p_48465_1_, NBTTagCompound p_48465_2_)
    {
        int i = p_48465_2_.func_395_d("xPos");
        int j = p_48465_2_.func_395_d("zPos");
        Chunk chunk = new Chunk(p_48465_1_, i, j);
        chunk.field_48562_f = p_48465_2_.func_48445_l("HeightMap");
        chunk.field_681_n = p_48465_2_.func_402_l("TerrainPopulated");
        NBTTagList nbttaglist = p_48465_2_.func_407_k("Sections");
        byte byte0 = 16;
        ExtendedBlockStorage aextendedblockstorage[] = new ExtendedBlockStorage[byte0];
        for(int k = 0; k < nbttaglist.func_387_b(); k++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(k);
            byte byte1 = nbttagcompound.func_408_b("Y");
            ExtendedBlockStorage extendedblockstorage = new ExtendedBlockStorage(byte1 << 4);
            extendedblockstorage.func_48596_a(nbttagcompound.func_400_i("Blocks"));
            if(nbttagcompound.func_410_a("Add"))
            {
                extendedblockstorage.func_48593_a(new NibbleArray(nbttagcompound.func_400_i("Add"), 4));
            }
            extendedblockstorage.func_48586_b(new NibbleArray(nbttagcompound.func_400_i("Data"), 4));
            extendedblockstorage.func_48589_d(new NibbleArray(nbttagcompound.func_400_i("SkyLight"), 4));
            extendedblockstorage.func_48606_c(new NibbleArray(nbttagcompound.func_400_i("BlockLight"), 4));
            extendedblockstorage.func_48599_d();
            aextendedblockstorage[byte1] = extendedblockstorage;
        }

        chunk.func_48558_a(aextendedblockstorage);
        if(p_48465_2_.func_410_a("Biomes"))
        {
            chunk.func_48559_a(p_48465_2_.func_400_i("Biomes"));
        }
        NBTTagList nbttaglist1 = p_48465_2_.func_407_k("Entities");
        if(nbttaglist1 != null)
        {
            for(int l = 0; l < nbttaglist1.func_387_b(); l++)
            {
                NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist1.func_388_a(l);
                Entity entity = EntityList.func_566_a(nbttagcompound1, p_48465_1_);
                chunk.field_677_r = true;
                if(entity != null)
                {
                    chunk.func_335_a(entity);
                }
            }

        }
        NBTTagList nbttaglist2 = p_48465_2_.func_407_k("TileEntities");
        if(nbttaglist2 != null)
        {
            for(int i1 = 0; i1 < nbttaglist2.func_387_b(); i1++)
            {
                NBTTagCompound nbttagcompound2 = (NBTTagCompound)nbttaglist2.func_388_a(i1);
                TileEntity tileentity = TileEntity.func_185_c(nbttagcompound2);
                if(tileentity != null)
                {
                    chunk.func_349_a(tileentity);
                }
            }

        }
        if(p_48465_2_.func_410_a("TileTicks"))
        {
            NBTTagList nbttaglist3 = p_48465_2_.func_407_k("TileTicks");
            if(nbttaglist3 != null)
            {
                for(int j1 = 0; j1 < nbttaglist3.func_387_b(); j1++)
                {
                    NBTTagCompound nbttagcompound3 = (NBTTagCompound)nbttaglist3.func_388_a(j1);
                    p_48465_1_.func_41045_d(nbttagcompound3.func_395_d("x"), nbttagcompound3.func_395_d("y"), nbttagcompound3.func_395_d("z"), nbttagcompound3.func_395_d("i"), nbttagcompound3.func_395_d("t"));
                }

            }
        }
        return chunk;
    }
}
