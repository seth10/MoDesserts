// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureVillagePieceWeight, ComponentVillageHouse4_Garden, MathHelper, ComponentVillageChurch, 
//            ComponentVillageHouse1, ComponentVillageWoodHut, ComponentVillageHall, ComponentVillageField, 
//            ComponentVillageField2, ComponentVillageHouse2, ComponentVillageHouse3, ComponentVillageStartPiece, 
//            ComponentVillageTorch, StructureBoundingBox, StructureComponent, MapGenVillage, 
//            WorldChunkManager, ComponentVillagePathGen, ComponentVillage

public class StructureVillagePieces
{

    public StructureVillagePieces()
    {
    }

    public static ArrayList func_35646_a(Random p_35646_0_, int p_35646_1_)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse4_Garden.class, 4, MathHelper.func_35476_a(p_35646_0_, 2 + p_35646_1_, 4 + p_35646_1_ * 2)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageChurch.class, 20, MathHelper.func_35476_a(p_35646_0_, 0 + p_35646_1_, 1 + p_35646_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse1.class, 20, MathHelper.func_35476_a(p_35646_0_, 0 + p_35646_1_, 2 + p_35646_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageWoodHut.class, 3, MathHelper.func_35476_a(p_35646_0_, 2 + p_35646_1_, 5 + p_35646_1_ * 3)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHall.class, 15, MathHelper.func_35476_a(p_35646_0_, 0 + p_35646_1_, 2 + p_35646_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageField.class, 3, MathHelper.func_35476_a(p_35646_0_, 1 + p_35646_1_, 4 + p_35646_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageField2.class, 3, MathHelper.func_35476_a(p_35646_0_, 2 + p_35646_1_, 4 + p_35646_1_ * 2)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse2.class, 15, MathHelper.func_35476_a(p_35646_0_, 0, 1 + p_35646_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse3.class, 8, MathHelper.func_35476_a(p_35646_0_, 0 + p_35646_1_, 3 + p_35646_1_ * 2)));
        Iterator iterator = arraylist.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            if(((StructureVillagePieceWeight)iterator.next()).field_35493_d == 0)
            {
                iterator.remove();
            }
        } while(true);
        return arraylist;
    }

    private static int func_35645_a(ArrayList p_35645_0_)
    {
        boolean flag = false;
        int i = 0;
        for(Iterator iterator = p_35645_0_.iterator(); iterator.hasNext();)
        {
            StructureVillagePieceWeight structurevillagepieceweight = (StructureVillagePieceWeight)iterator.next();
            if(structurevillagepieceweight.field_35493_d > 0 && structurevillagepieceweight.field_35495_c < structurevillagepieceweight.field_35493_d)
            {
                flag = true;
            }
            i += structurevillagepieceweight.field_35494_b;
        }

        return flag ? i : -1;
    }

    private static ComponentVillage func_35639_a(StructureVillagePieceWeight p_35639_0_, List p_35639_1_, Random p_35639_2_, int p_35639_3_, int p_35639_4_, int p_35639_5_, int p_35639_6_, int p_35639_7_)
    {
        Class class1 = p_35639_0_.field_35496_a;
        Object obj = null;
        if(class1 == (net.minecraft.src.ComponentVillageHouse4_Garden.class))
        {
            obj = ComponentVillageHouse4_Garden.func_35401_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageChurch.class))
        {
            obj = ComponentVillageChurch.func_35380_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse1.class))
        {
            obj = ComponentVillageHouse1.func_35397_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageWoodHut.class))
        {
            obj = ComponentVillageWoodHut.func_35393_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHall.class))
        {
            obj = ComponentVillageHall.func_35374_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageField.class))
        {
            obj = ComponentVillageField.func_35370_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageField2.class))
        {
            obj = ComponentVillageField2.func_35399_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse2.class))
        {
            obj = ComponentVillageHouse2.func_35376_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse3.class))
        {
            obj = ComponentVillageHouse3.func_35372_a(p_35639_1_, p_35639_2_, p_35639_3_, p_35639_4_, p_35639_5_, p_35639_6_, p_35639_7_);
        }
        return ((ComponentVillage) (obj));
    }

    private static ComponentVillage func_35643_c(ComponentVillageStartPiece p_35643_0_, List p_35643_1_, Random p_35643_2_, int p_35643_3_, int p_35643_4_, int p_35643_5_, int p_35643_6_, int p_35643_7_)
    {
        int i;
        int j;
        i = func_35645_a(p_35643_0_.field_35388_d);
        if(i <= 0)
        {
            return null;
        }
        j = 0;
_L2:
        int k;
        Iterator iterator;
        if(j >= 5)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        j++;
        k = p_35643_2_.nextInt(i);
        iterator = p_35643_0_.field_35388_d.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureVillagePieceWeight structurevillagepieceweight;
        structurevillagepieceweight = (StructureVillagePieceWeight)iterator.next();
        k -= structurevillagepieceweight.field_35494_b;
        if(k >= 0) goto _L4; else goto _L3
_L3:
        if(structurevillagepieceweight.func_35491_a(p_35643_7_) && (structurevillagepieceweight != p_35643_0_.field_35391_c || p_35643_0_.field_35388_d.size() <= 1)) goto _L5; else goto _L2
_L5:
        ComponentVillage componentvillage = func_35639_a(structurevillagepieceweight, p_35643_1_, p_35643_2_, p_35643_3_, p_35643_4_, p_35643_5_, p_35643_6_, p_35643_7_);
        if(componentvillage == null) goto _L4; else goto _L6
_L6:
        structurevillagepieceweight.field_35495_c++;
        p_35643_0_.field_35391_c = structurevillagepieceweight;
        if(!structurevillagepieceweight.func_35492_a())
        {
            p_35643_0_.field_35388_d.remove(structurevillagepieceweight);
        }
        return componentvillage;
        StructureBoundingBox structureboundingbox = ComponentVillageTorch.func_35382_a(p_35643_1_, p_35643_2_, p_35643_3_, p_35643_4_, p_35643_5_, p_35643_6_);
        if(structureboundingbox != null)
        {
            return new ComponentVillageTorch(p_35643_7_, p_35643_2_, structureboundingbox, p_35643_6_);
        } else
        {
            return null;
        }
    }

    private static StructureComponent func_35641_d(ComponentVillageStartPiece p_35641_0_, List p_35641_1_, Random p_35641_2_, int p_35641_3_, int p_35641_4_, int p_35641_5_, int p_35641_6_, int p_35641_7_)
    {
        if(p_35641_7_ > 50)
        {
            return null;
        }
        if(Math.abs(p_35641_3_ - p_35641_0_.func_35313_b().field_35678_a) > 112 || Math.abs(p_35641_5_ - p_35641_0_.func_35313_b().field_35677_c) > 112)
        {
            return null;
        }
        ComponentVillage componentvillage = func_35643_c(p_35641_0_, p_35641_1_, p_35641_2_, p_35641_3_, p_35641_4_, p_35641_5_, p_35641_6_, p_35641_7_ + 1);
        if(componentvillage != null)
        {
            int i = (((StructureComponent) (componentvillage)).field_35316_g.field_35678_a + ((StructureComponent) (componentvillage)).field_35316_g.field_35674_d) / 2;
            int j = (((StructureComponent) (componentvillage)).field_35316_g.field_35677_c + ((StructureComponent) (componentvillage)).field_35316_g.field_35673_f) / 2;
            int k = ((StructureComponent) (componentvillage)).field_35316_g.field_35674_d - ((StructureComponent) (componentvillage)).field_35316_g.field_35678_a;
            int l = ((StructureComponent) (componentvillage)).field_35316_g.field_35673_f - ((StructureComponent) (componentvillage)).field_35316_g.field_35677_c;
            int i1 = k <= l ? l : k;
            if(p_35641_0_.func_35386_a().func_35141_a(i, j, i1 / 2 + 4, MapGenVillage.field_35538_a))
            {
                p_35641_1_.add(componentvillage);
                p_35641_0_.field_35389_e.add(componentvillage);
                return componentvillage;
            }
        }
        return null;
    }

    private static StructureComponent func_35644_e(ComponentVillageStartPiece p_35644_0_, List p_35644_1_, Random p_35644_2_, int p_35644_3_, int p_35644_4_, int p_35644_5_, int p_35644_6_, int p_35644_7_)
    {
        if(p_35644_7_ > 3 + p_35644_0_.field_35390_b)
        {
            return null;
        }
        if(Math.abs(p_35644_3_ - p_35644_0_.func_35313_b().field_35678_a) > 112 || Math.abs(p_35644_5_ - p_35644_0_.func_35313_b().field_35677_c) > 112)
        {
            return null;
        }
        StructureBoundingBox structureboundingbox = ComponentVillagePathGen.func_35378_a(p_35644_0_, p_35644_1_, p_35644_2_, p_35644_3_, p_35644_4_, p_35644_5_, p_35644_6_);
        if(structureboundingbox != null && structureboundingbox.field_35676_b > 10)
        {
            ComponentVillagePathGen componentvillagepathgen = new ComponentVillagePathGen(p_35644_7_, p_35644_2_, structureboundingbox, p_35644_6_);
            int i = (((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35678_a + ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35674_d) / 2;
            int j = (((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35677_c + ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35673_f) / 2;
            int k = ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35674_d - ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35678_a;
            int l = ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35673_f - ((StructureComponent) (componentvillagepathgen)).field_35316_g.field_35677_c;
            int i1 = k <= l ? l : k;
            if(p_35644_0_.func_35386_a().func_35141_a(i, j, i1 / 2 + 4, MapGenVillage.field_35538_a))
            {
                p_35644_1_.add(componentvillagepathgen);
                p_35644_0_.field_35387_f.add(componentvillagepathgen);
                return componentvillagepathgen;
            }
        }
        return null;
    }

    static StructureComponent func_35640_a(ComponentVillageStartPiece p_35640_0_, List p_35640_1_, Random p_35640_2_, int p_35640_3_, int p_35640_4_, int p_35640_5_, int p_35640_6_, int p_35640_7_)
    {
        return func_35641_d(p_35640_0_, p_35640_1_, p_35640_2_, p_35640_3_, p_35640_4_, p_35640_5_, p_35640_6_, p_35640_7_);
    }

    static StructureComponent func_35642_b(ComponentVillageStartPiece p_35642_0_, List p_35642_1_, Random p_35642_2_, int p_35642_3_, int p_35642_4_, int p_35642_5_, int p_35642_6_, int p_35642_7_)
    {
        return func_35644_e(p_35642_0_, p_35642_1_, p_35642_2_, p_35642_3_, p_35642_4_, p_35642_5_, p_35642_6_, p_35642_7_);
    }
}
