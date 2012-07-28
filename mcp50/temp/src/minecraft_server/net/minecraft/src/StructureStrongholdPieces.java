// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStrongholdPieceWeight, ComponentStrongholdStraight, ComponentStrongholdPrison, ComponentStrongholdLeftTurn, 
//            ComponentStrongholdRightTurn, ComponentStrongholdRoomCrossing, ComponentStrongholdStairsStraight, ComponentStrongholdStairs, 
//            ComponentStrongholdCrossing, ComponentStrongholdChestCorridor, ComponentStrongholdLibrary, ComponentStrongholdPortalRoom, 
//            ComponentStrongholdStairs2, ComponentStrongholdCorridor, StructureBoundingBox, StructureStrongholdPieceWeight2, 
//            StructureStrongholdPieceWeight3, StructureStrongholdStones, ComponentStronghold, StructureComponent

public class StructureStrongholdPieces
{

    private static final StructureStrongholdPieceWeight field_35628_b[];
    private static List field_35629_c;
    private static Class field_40542_d;
    static int field_35630_a = 0;
    private static final StructureStrongholdStones field_35627_d = new StructureStrongholdStones(null);

    public StructureStrongholdPieces()
    {
    }

    public static void func_35625_a()
    {
        field_35629_c = new ArrayList();
        StructureStrongholdPieceWeight astructurestrongholdpieceweight[] = field_35628_b;
        int i = astructurestrongholdpieceweight.length;
        for(int j = 0; j < i; j++)
        {
            StructureStrongholdPieceWeight structurestrongholdpieceweight = astructurestrongholdpieceweight[j];
            structurestrongholdpieceweight.field_35579_c = 0;
            field_35629_c.add(structurestrongholdpieceweight);
        }

        field_40542_d = null;
    }

    private static boolean func_35626_c()
    {
        boolean flag = false;
        field_35630_a = 0;
        for(Iterator iterator = field_35629_c.iterator(); iterator.hasNext();)
        {
            StructureStrongholdPieceWeight structurestrongholdpieceweight = (StructureStrongholdPieceWeight)iterator.next();
            if(structurestrongholdpieceweight.field_35577_d > 0 && structurestrongholdpieceweight.field_35579_c < structurestrongholdpieceweight.field_35577_d)
            {
                flag = true;
            }
            field_35630_a += structurestrongholdpieceweight.field_35578_b;
        }

        return flag;
    }

    private static ComponentStronghold func_35620_a(Class p_35620_0_, List p_35620_1_, Random p_35620_2_, int p_35620_3_, int p_35620_4_, int p_35620_5_, int p_35620_6_, int p_35620_7_)
    {
        Object obj = null;
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdStraight.class))
        {
            obj = ComponentStrongholdStraight.func_35338_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdPrison.class))
        {
            obj = ComponentStrongholdPrison.func_35332_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdLeftTurn.class))
        {
            obj = ComponentStrongholdLeftTurn.func_35330_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdRightTurn.class))
        {
            obj = ComponentStrongholdRightTurn.func_35330_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdRoomCrossing.class))
        {
            obj = ComponentStrongholdRoomCrossing.func_35346_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdStairsStraight.class))
        {
            obj = ComponentStrongholdStairsStraight.func_35344_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdStairs.class))
        {
            obj = ComponentStrongholdStairs.func_35325_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdCrossing.class))
        {
            obj = ComponentStrongholdCrossing.func_35350_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdChestCorridor.class))
        {
            obj = ComponentStrongholdChestCorridor.func_40311_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdLibrary.class))
        {
            obj = ComponentStrongholdLibrary.func_35334_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        } else
        if(p_35620_0_ == (net.minecraft.src.ComponentStrongholdPortalRoom.class))
        {
            obj = ComponentStrongholdPortalRoom.func_40315_a(p_35620_1_, p_35620_2_, p_35620_3_, p_35620_4_, p_35620_5_, p_35620_6_, p_35620_7_);
        }
        return ((ComponentStronghold) (obj));
    }

    private static ComponentStronghold func_35623_b(ComponentStrongholdStairs2 p_35623_0_, List p_35623_1_, Random p_35623_2_, int p_35623_3_, int p_35623_4_, int p_35623_5_, int p_35623_6_, int p_35623_7_)
    {
        int i;
        if(!func_35626_c())
        {
            return null;
        }
        if(field_40542_d != null)
        {
            ComponentStronghold componentstronghold = func_35620_a(field_40542_d, p_35623_1_, p_35623_2_, p_35623_3_, p_35623_4_, p_35623_5_, p_35623_6_, p_35623_7_);
            field_40542_d = null;
            if(componentstronghold != null)
            {
                return componentstronghold;
            }
        }
        i = 0;
_L2:
        int j;
        Iterator iterator;
        if(i >= 5)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        i++;
        j = p_35623_2_.nextInt(field_35630_a);
        iterator = field_35629_c.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureStrongholdPieceWeight structurestrongholdpieceweight;
        structurestrongholdpieceweight = (StructureStrongholdPieceWeight)iterator.next();
        j -= structurestrongholdpieceweight.field_35578_b;
        if(j >= 0) goto _L4; else goto _L3
_L3:
        if(structurestrongholdpieceweight.func_35575_a(p_35623_7_) && structurestrongholdpieceweight != p_35623_0_.field_35329_a) goto _L5; else goto _L2
_L5:
        ComponentStronghold componentstronghold1 = func_35620_a(structurestrongholdpieceweight.field_35580_a, p_35623_1_, p_35623_2_, p_35623_3_, p_35623_4_, p_35623_5_, p_35623_6_, p_35623_7_);
        if(componentstronghold1 == null) goto _L4; else goto _L6
_L6:
        structurestrongholdpieceweight.field_35579_c++;
        p_35623_0_.field_35329_a = structurestrongholdpieceweight;
        if(!structurestrongholdpieceweight.func_35576_a())
        {
            field_35629_c.remove(structurestrongholdpieceweight);
        }
        return componentstronghold1;
        StructureBoundingBox structureboundingbox = ComponentStrongholdCorridor.func_35342_a(p_35623_1_, p_35623_2_, p_35623_3_, p_35623_4_, p_35623_5_, p_35623_6_);
        if(structureboundingbox != null && structureboundingbox.field_35676_b > 1)
        {
            return new ComponentStrongholdCorridor(p_35623_7_, p_35623_2_, structureboundingbox, p_35623_6_);
        } else
        {
            return null;
        }
    }

    private static StructureComponent func_35621_c(ComponentStrongholdStairs2 p_35621_0_, List p_35621_1_, Random p_35621_2_, int p_35621_3_, int p_35621_4_, int p_35621_5_, int p_35621_6_, int p_35621_7_)
    {
        if(p_35621_7_ > 50)
        {
            return null;
        }
        if(Math.abs(p_35621_3_ - p_35621_0_.func_35313_b().field_35678_a) > 112 || Math.abs(p_35621_5_ - p_35621_0_.func_35313_b().field_35677_c) > 112)
        {
            return null;
        }
        ComponentStronghold componentstronghold = func_35623_b(p_35621_0_, p_35621_1_, p_35621_2_, p_35621_3_, p_35621_4_, p_35621_5_, p_35621_6_, p_35621_7_ + 1);
        if(componentstronghold != null)
        {
            p_35621_1_.add(componentstronghold);
            p_35621_0_.field_35328_b.add(componentstronghold);
        }
        return componentstronghold;
    }

    static StructureComponent func_35624_a(ComponentStrongholdStairs2 p_35624_0_, List p_35624_1_, Random p_35624_2_, int p_35624_3_, int p_35624_4_, int p_35624_5_, int p_35624_6_, int p_35624_7_)
    {
        return func_35621_c(p_35624_0_, p_35624_1_, p_35624_2_, p_35624_3_, p_35624_4_, p_35624_5_, p_35624_6_, p_35624_7_);
    }

    static Class func_40541_a(Class p_40541_0_)
    {
        return field_40542_d = p_40541_0_;
    }

    static StructureStrongholdStones func_35622_b()
    {
        return field_35627_d;
    }

    static 
    {
        field_35628_b = (new StructureStrongholdPieceWeight[] {
            new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStraight.class, 40, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdPrison.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdLeftTurn.class, 20, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdRightTurn.class, 20, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdRoomCrossing.class, 10, 6), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStairsStraight.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStairs.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdCrossing.class, 5, 4), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdChestCorridor.class, 5, 4), new StructureStrongholdPieceWeight2(net.minecraft.src.ComponentStrongholdLibrary.class, 10, 2), 
            new StructureStrongholdPieceWeight3(net.minecraft.src.ComponentStrongholdPortalRoom.class, 20, 1)
        });
    }
}
