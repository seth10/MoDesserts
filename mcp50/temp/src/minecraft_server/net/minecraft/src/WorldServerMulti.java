// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            WorldServer, ISaveHandler, WorldSettings

public class WorldServerMulti extends WorldServer
{

    public WorldServerMulti(MinecraftServer p_i165_1_, ISaveHandler p_i165_2_, String p_i165_3_, int p_i165_4_, WorldSettings p_i165_5_, WorldServer p_i165_6_)
    {
        super(p_i165_1_, p_i165_2_, p_i165_3_, p_i165_4_, p_i165_5_);
        field_28105_z = p_i165_6_.field_28105_z;
    }
}
