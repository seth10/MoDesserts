// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Chunk, IProgressUpdate, EnumCreatureType, World, 
//            ChunkPosition

public interface IChunkProvider
{

    public abstract boolean func_365_a(int i, int j);

    public abstract Chunk func_363_b(int i, int j);

    public abstract Chunk func_376_d(int i, int j);

    public abstract void func_4055_a(IChunkProvider ichunkprovider, int i, int j);

    public abstract boolean func_360_a(boolean flag, IProgressUpdate iprogressupdate);

    public abstract boolean func_361_a();

    public abstract boolean func_364_b();

    public abstract List func_40181_a(EnumCreatureType enumcreaturetype, int i, int j, int k);

    public abstract ChunkPosition func_40182_a(World world, String s, int i, int j, int k);
}
