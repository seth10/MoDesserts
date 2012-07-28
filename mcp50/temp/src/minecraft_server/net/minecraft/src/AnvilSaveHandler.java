// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            SaveHandler, WorldProviderHell, AnvilChunkLoader, WorldProviderEnd, 
//            WorldInfo, ThreadedFileIOBase, RegionFileCache, WorldProvider, 
//            IChunkLoader

public class AnvilSaveHandler extends SaveHandler
{

    public AnvilSaveHandler(File p_i1079_1_, String p_i1079_2_, boolean p_i1079_3_)
    {
        super(p_i1079_1_, p_i1079_2_, p_i1079_3_);
    }

    public IChunkLoader func_22092_a(WorldProvider p_22092_1_)
    {
        File file = func_22097_a();
        if(p_22092_1_ instanceof WorldProviderHell)
        {
            File file1 = new File(file, "DIM-1");
            file1.mkdirs();
            return new AnvilChunkLoader(file1);
        }
        if(p_22092_1_ instanceof WorldProviderEnd)
        {
            File file2 = new File(file, "DIM1");
            file2.mkdirs();
            return new AnvilChunkLoader(file2);
        } else
        {
            return new AnvilChunkLoader(file);
        }
    }

    public void func_22095_a(WorldInfo p_22095_1_, List p_22095_2_)
    {
        p_22095_1_.func_22191_a(19133);
        super.func_22095_a(p_22095_1_, p_22095_2_);
    }

    public void func_22093_e()
    {
        try
        {
            ThreadedFileIOBase.field_40514_a.func_40508_a();
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        RegionFileCache.func_22122_a();
    }
}
