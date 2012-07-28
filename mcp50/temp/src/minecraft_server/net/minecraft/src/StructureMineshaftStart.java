// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.LinkedList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureStart, ComponentMineshaftRoom, World

public class StructureMineshaftStart extends StructureStart
{

    public StructureMineshaftStart(World p_i552_1_, Random p_i552_2_, int p_i552_3_, int p_i552_4_)
    {
        ComponentMineshaftRoom componentmineshaftroom = new ComponentMineshaftRoom(0, p_i552_2_, (p_i552_3_ << 4) + 2, (p_i552_4_ << 4) + 2);
        field_35547_a.add(componentmineshaftroom);
        componentmineshaftroom.func_35308_a(componentmineshaftroom, field_35547_a, p_i552_2_);
        func_35544_c();
        func_35545_a(p_i552_1_, p_i552_2_, 10);
    }
}
