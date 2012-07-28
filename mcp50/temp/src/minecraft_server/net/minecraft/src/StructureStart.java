// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, World

public abstract class StructureStart
{

    protected LinkedList field_35547_a;
    protected StructureBoundingBox field_35546_b;

    protected StructureStart()
    {
        field_35547_a = new LinkedList();
    }

    public StructureBoundingBox func_35543_b()
    {
        return field_35546_b;
    }

    public LinkedList func_40208_c()
    {
        return field_35547_a;
    }

    public void func_35541_a(World p_35541_1_, Random p_35541_2_, StructureBoundingBox p_35541_3_)
    {
        Iterator iterator = field_35547_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureComponent structurecomponent = (StructureComponent)iterator.next();
            if(structurecomponent.func_35313_b().func_35664_a(p_35541_3_) && !structurecomponent.func_35310_a(p_35541_1_, p_35541_2_, p_35541_3_))
            {
                iterator.remove();
            }
        } while(true);
    }

    protected void func_35544_c()
    {
        field_35546_b = StructureBoundingBox.func_35672_a();
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35547_a.iterator(); iterator.hasNext(); field_35546_b.func_35666_b(structurecomponent.func_35313_b()))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    protected void func_35545_a(World p_35545_1_, Random p_35545_2_, int p_35545_3_)
    {
        int i = 63 - p_35545_3_;
        int j = field_35546_b.func_35668_c() + 1;
        if(j < i)
        {
            j += p_35545_2_.nextInt(i - j);
        }
        int k = j - field_35546_b.field_35675_e;
        field_35546_b.func_35670_a(0, k, 0);
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35547_a.iterator(); iterator.hasNext(); structurecomponent.func_35313_b().func_35670_a(0, k, 0))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    protected void func_40209_a(World p_40209_1_, Random p_40209_2_, int p_40209_3_, int p_40209_4_)
    {
        int i = ((p_40209_4_ - p_40209_3_) + 1) - field_35546_b.func_35668_c();
        int j = 1;
        if(i > 1)
        {
            j = p_40209_3_ + p_40209_2_.nextInt(i);
        } else
        {
            j = p_40209_3_;
        }
        int k = j - field_35546_b.field_35676_b;
        field_35546_b.func_35670_a(0, k, 0);
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35547_a.iterator(); iterator.hasNext(); structurecomponent.func_35313_b().func_35670_a(0, k, 0))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    public boolean func_35542_a()
    {
        return true;
    }
}
