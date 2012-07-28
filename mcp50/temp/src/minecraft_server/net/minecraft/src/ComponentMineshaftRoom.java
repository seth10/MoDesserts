// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World

public class ComponentMineshaftRoom extends StructureComponent
{

    private LinkedList field_35356_a;

    public ComponentMineshaftRoom(int p_i161_1_, Random p_i161_2_, int p_i161_3_, int p_i161_4_)
    {
        super(p_i161_1_);
        field_35356_a = new LinkedList();
        field_35316_g = new StructureBoundingBox(p_i161_3_, 50, p_i161_4_, p_i161_3_ + 7 + p_i161_2_.nextInt(6), 54 + p_i161_2_.nextInt(6), p_i161_4_ + 7 + p_i161_2_.nextInt(6));
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        int i = func_35305_c();
        int j1 = field_35316_g.func_35668_c() - 3 - 1;
        if(j1 <= 0)
        {
            j1 = 1;
        }
        for(int j = 0; j < field_35316_g.func_35669_b(); j += 4)
        {
            j += p_35308_3_.nextInt(field_35316_g.func_35669_b());
            if(j + 3 > field_35316_g.func_35669_b())
            {
                break;
            }
            StructureComponent structurecomponent = StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + j, field_35316_g.field_35676_b + p_35308_3_.nextInt(j1) + 1, field_35316_g.field_35677_c - 1, 2, i);
            if(structurecomponent != null)
            {
                StructureBoundingBox structureboundingbox = structurecomponent.func_35313_b();
                field_35356_a.add(new StructureBoundingBox(structureboundingbox.field_35678_a, structureboundingbox.field_35676_b, field_35316_g.field_35677_c, structureboundingbox.field_35674_d, structureboundingbox.field_35675_e, field_35316_g.field_35677_c + 1));
            }
        }

        for(int k = 0; k < field_35316_g.func_35669_b(); k += 4)
        {
            k += p_35308_3_.nextInt(field_35316_g.func_35669_b());
            if(k + 3 > field_35316_g.func_35669_b())
            {
                break;
            }
            StructureComponent structurecomponent1 = StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + k, field_35316_g.field_35676_b + p_35308_3_.nextInt(j1) + 1, field_35316_g.field_35673_f + 1, 0, i);
            if(structurecomponent1 != null)
            {
                StructureBoundingBox structureboundingbox1 = structurecomponent1.func_35313_b();
                field_35356_a.add(new StructureBoundingBox(structureboundingbox1.field_35678_a, structureboundingbox1.field_35676_b, field_35316_g.field_35673_f - 1, structureboundingbox1.field_35674_d, structureboundingbox1.field_35675_e, field_35316_g.field_35673_f));
            }
        }

        for(int l = 0; l < field_35316_g.func_35665_d(); l += 4)
        {
            l += p_35308_3_.nextInt(field_35316_g.func_35665_d());
            if(l + 3 > field_35316_g.func_35665_d())
            {
                break;
            }
            StructureComponent structurecomponent2 = StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35308_3_.nextInt(j1) + 1, field_35316_g.field_35677_c + l, 1, i);
            if(structurecomponent2 != null)
            {
                StructureBoundingBox structureboundingbox2 = structurecomponent2.func_35313_b();
                field_35356_a.add(new StructureBoundingBox(field_35316_g.field_35678_a, structureboundingbox2.field_35676_b, structureboundingbox2.field_35677_c, field_35316_g.field_35678_a + 1, structureboundingbox2.field_35675_e, structureboundingbox2.field_35673_f));
            }
        }

        for(int i1 = 0; i1 < field_35316_g.func_35665_d(); i1 += 4)
        {
            i1 += p_35308_3_.nextInt(field_35316_g.func_35665_d());
            if(i1 + 3 > field_35316_g.func_35665_d())
            {
                break;
            }
            StructureComponent structurecomponent3 = StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35308_3_.nextInt(j1) + 1, field_35316_g.field_35677_c + i1, 3, i);
            if(structurecomponent3 != null)
            {
                StructureBoundingBox structureboundingbox3 = structurecomponent3.func_35313_b();
                field_35356_a.add(new StructureBoundingBox(field_35316_g.field_35674_d - 1, structureboundingbox3.field_35676_b, structureboundingbox3.field_35677_c, field_35316_g.field_35674_d, structureboundingbox3.field_35675_e, structureboundingbox3.field_35673_f));
            }
        }

    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35677_c, field_35316_g.field_35674_d, field_35316_g.field_35676_b, field_35316_g.field_35673_f, Block.field_533_w.field_573_bc, 0, true);
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b + 1, field_35316_g.field_35677_c, field_35316_g.field_35674_d, Math.min(field_35316_g.field_35676_b + 3, field_35316_g.field_35675_e), field_35316_g.field_35673_f, 0, 0, false);
        StructureBoundingBox structureboundingbox;
        for(Iterator iterator = field_35356_a.iterator(); iterator.hasNext(); func_35294_a(p_35310_1_, p_35310_3_, structureboundingbox.field_35678_a, structureboundingbox.field_35675_e - 2, structureboundingbox.field_35677_c, structureboundingbox.field_35674_d, structureboundingbox.field_35675_e, structureboundingbox.field_35673_f, 0, 0, false))
        {
            structureboundingbox = (StructureBoundingBox)iterator.next();
        }

        func_35304_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b + 4, field_35316_g.field_35677_c, field_35316_g.field_35674_d, field_35316_g.field_35675_e, field_35316_g.field_35673_f, 0, false);
        return true;
    }
}
