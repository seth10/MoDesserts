// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillageWell, WorldChunkManager, StructureVillagePieceWeight

public class ComponentVillageStartPiece extends ComponentVillageWell
{

    public WorldChunkManager field_35392_a;
    public int field_35390_b;
    public StructureVillagePieceWeight field_35391_c;
    public ArrayList field_35388_d;
    public ArrayList field_35389_e;
    public ArrayList field_35387_f;

    public ComponentVillageStartPiece(WorldChunkManager p_i208_1_, int p_i208_2_, Random p_i208_3_, int p_i208_4_, int p_i208_5_, ArrayList p_i208_6_, int p_i208_7_)
    {
        super(0, p_i208_3_, p_i208_4_, p_i208_5_);
        field_35389_e = new ArrayList();
        field_35387_f = new ArrayList();
        field_35392_a = p_i208_1_;
        field_35388_d = p_i208_6_;
        field_35390_b = p_i208_7_;
    }

    public WorldChunkManager func_35386_a()
    {
        return field_35392_a;
    }
}
