// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            IWorldAccess, WorldServer, WorldProvider, EntityTracker, 
//            ServerConfigurationManager, Packet61DoorChange, Entity, TileEntity, 
//            EntityPlayer

public class WorldManager
    implements IWorldAccess
{

    private MinecraftServer field_953_a;
    private WorldServer field_28134_b;

    public WorldManager(MinecraftServer p_i136_1_, WorldServer p_i136_2_)
    {
        field_953_a = p_i136_1_;
        field_28134_b = p_i136_2_;
    }

    public void func_687_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
    }

    public void func_681_a(Entity p_681_1_)
    {
        field_953_a.func_28003_b(field_28134_b.field_4272_q.field_6165_g).func_611_a(p_681_1_);
    }

    public void func_688_b(Entity p_688_1_)
    {
        field_953_a.func_28003_b(field_28134_b.field_4272_q.field_6165_g).func_610_b(p_688_1_);
    }

    public void func_689_a(String s, double d, double d1, double d2, 
            float f, float f1)
    {
    }

    public void func_685_a(int i, int j, int k, int l, int i1, int j1)
    {
    }

    public void func_683_a(int p_683_1_, int p_683_2_, int p_683_3_)
    {
        field_953_a.field_6033_f.func_622_a(p_683_1_, p_683_2_, p_683_3_, field_28134_b.field_4272_q.field_6165_g);
    }

    public void func_48414_b(int i, int j, int k)
    {
    }

    public void func_682_a(String s, int i, int j, int k)
    {
    }

    public void func_686_a(int p_686_1_, int p_686_2_, int p_686_3_, TileEntity p_686_4_)
    {
        field_953_a.field_6033_f.func_636_a(p_686_1_, p_686_2_, p_686_3_, p_686_4_);
    }

    public void func_28133_a(EntityPlayer p_28133_1_, int p_28133_2_, int p_28133_3_, int p_28133_4_, int p_28133_5_, int p_28133_6_)
    {
        field_953_a.field_6033_f.func_28171_a(p_28133_1_, p_28133_3_, p_28133_4_, p_28133_5_, 64D, field_28134_b.field_4272_q.field_6165_g, new Packet61DoorChange(p_28133_2_, p_28133_3_, p_28133_4_, p_28133_5_, p_28133_6_));
    }
}
