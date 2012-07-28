// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStrongholdStairs, ComponentStrongholdPortalRoom, StructureStrongholdPieceWeight, ChunkPosition

public class ComponentStrongholdStairs2 extends ComponentStrongholdStairs
{

    public StructureStrongholdPieceWeight field_35329_a;
    public ComponentStrongholdPortalRoom field_40317_b;
    public ArrayList field_35328_b;

    public ComponentStrongholdStairs2(int p_i565_1_, Random p_i565_2_, int p_i565_3_, int p_i565_4_)
    {
        super(0, p_i565_2_, p_i565_3_, p_i565_4_);
        field_35328_b = new ArrayList();
    }

    public ChunkPosition func_40281_b_()
    {
        if(field_40317_b != null)
        {
            return field_40317_b.func_40281_b_();
        } else
        {
            return super.func_40281_b_();
        }
    }
}
