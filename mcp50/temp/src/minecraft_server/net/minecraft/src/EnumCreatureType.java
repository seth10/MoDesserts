// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IMob, Material, EntityAnimal, EntityWaterMob

public final class EnumCreatureType extends Enum
{

    public static final EnumCreatureType monster;
    public static final EnumCreatureType creature;
    public static final EnumCreatureType waterCreature;
    private final Class field_21109_d;
    private final int field_21108_e;
    private final Material field_21107_f;
    private final boolean field_21106_g;
    private static final EnumCreatureType $VALUES[]; /* synthetic field */

    public static EnumCreatureType[] values()
    {
        return (EnumCreatureType[])$VALUES.clone();
    }

    public static EnumCreatureType valueOf(String p_valueOf_0_)
    {
        return (EnumCreatureType)Enum.valueOf(net.minecraft.src.EnumCreatureType.class, p_valueOf_0_);
    }

    private EnumCreatureType(String p_i269_1_, int p_i269_2_, Class p_i269_3_, int p_i269_4_, Material p_i269_5_, boolean p_i269_6_)
    {
        super(p_i269_1_, p_i269_2_);
        field_21109_d = p_i269_3_;
        field_21108_e = p_i269_4_;
        field_21107_f = p_i269_5_;
        field_21106_g = p_i269_6_;
    }

    public Class func_21105_a()
    {
        return field_21109_d;
    }

    public int func_21104_b()
    {
        return field_21108_e;
    }

    public Material func_21102_c()
    {
        return field_21107_f;
    }

    public boolean func_21103_d()
    {
        return field_21106_g;
    }

    static 
    {
        monster = new EnumCreatureType("monster", 0, net.minecraft.src.IMob.class, 70, Material.field_526_a, false);
        creature = new EnumCreatureType("creature", 1, net.minecraft.src.EntityAnimal.class, 15, Material.field_526_a, true);
        waterCreature = new EnumCreatureType("waterCreature", 2, net.minecraft.src.EntityWaterMob.class, 5, Material.field_521_f, true);
        $VALUES = (new EnumCreatureType[] {
            monster, creature, waterCreature
        });
    }
}
