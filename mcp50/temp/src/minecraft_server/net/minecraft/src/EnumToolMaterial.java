// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumToolMaterial extends Enum
{

    public static final EnumToolMaterial WOOD;
    public static final EnumToolMaterial STONE;
    public static final EnumToolMaterial IRON;
    public static final EnumToolMaterial EMERALD;
    public static final EnumToolMaterial GOLD;
    private final int field_21186_f;
    private final int field_21185_g;
    private final float field_21184_h;
    private final int field_21183_i;
    private final int field_40488_j;
    private static final EnumToolMaterial $VALUES[]; /* synthetic field */

    public static EnumToolMaterial[] values()
    {
        return (EnumToolMaterial[])$VALUES.clone();
    }

    public static EnumToolMaterial valueOf(String p_valueOf_0_)
    {
        return (EnumToolMaterial)Enum.valueOf(net.minecraft.src.EnumToolMaterial.class, p_valueOf_0_);
    }

    private EnumToolMaterial(String p_i51_1_, int p_i51_2_, int p_i51_3_, int p_i51_4_, float p_i51_5_, int p_i51_6_, int p_i51_7_)
    {
        super(p_i51_1_, p_i51_2_);
        field_21186_f = p_i51_3_;
        field_21185_g = p_i51_4_;
        field_21184_h = p_i51_5_;
        field_21183_i = p_i51_6_;
        field_40488_j = p_i51_7_;
    }

    public int func_21180_a()
    {
        return field_21185_g;
    }

    public float func_21179_b()
    {
        return field_21184_h;
    }

    public int func_21178_c()
    {
        return field_21183_i;
    }

    public int func_21181_d()
    {
        return field_21186_f;
    }

    public int func_40487_e()
    {
        return field_40488_j;
    }

    static 
    {
        WOOD = new EnumToolMaterial("WOOD", 0, 0, 59, 2.0F, 0, 15);
        STONE = new EnumToolMaterial("STONE", 1, 1, 131, 4F, 1, 5);
        IRON = new EnumToolMaterial("IRON", 2, 2, 250, 6F, 2, 14);
        EMERALD = new EnumToolMaterial("EMERALD", 3, 3, 1561, 8F, 3, 10);
        GOLD = new EnumToolMaterial("GOLD", 4, 0, 32, 12F, 0, 22);
        $VALUES = (new EnumToolMaterial[] {
            WOOD, STONE, IRON, EMERALD, GOLD
        });
    }
}
