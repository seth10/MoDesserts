// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemArmor

public final class EnumArmorMaterial extends Enum
{

    public static final EnumArmorMaterial CLOTH;
    public static final EnumArmorMaterial CHAIN;
    public static final EnumArmorMaterial IRON;
    public static final EnumArmorMaterial GOLD;
    public static final EnumArmorMaterial DIAMOND;
    private int field_40498_f;
    private int field_40499_g[];
    private int field_40505_h;
    private static final EnumArmorMaterial $VALUES[]; /* synthetic field */

    public static EnumArmorMaterial[] values()
    {
        return (EnumArmorMaterial[])$VALUES.clone();
    }

    public static EnumArmorMaterial valueOf(String p_valueOf_0_)
    {
        return (EnumArmorMaterial)Enum.valueOf(net.minecraft.src.EnumArmorMaterial.class, p_valueOf_0_);
    }

    private EnumArmorMaterial(String p_i76_1_, int p_i76_2_, int p_i76_3_, int p_i76_4_[], int p_i76_5_)
    {
        super(p_i76_1_, p_i76_2_);
        field_40498_f = p_i76_3_;
        field_40499_g = p_i76_4_;
        field_40505_h = p_i76_5_;
    }

    public int func_40497_a(int p_40497_1_)
    {
        return ItemArmor.func_40250_n()[p_40497_1_] * field_40498_f;
    }

    public int func_40495_b(int p_40495_1_)
    {
        return field_40499_g[p_40495_1_];
    }

    public int func_40496_a()
    {
        return field_40505_h;
    }

    static 
    {
        CLOTH = new EnumArmorMaterial("CLOTH", 0, 5, new int[] {
            1, 3, 2, 1
        }, 15);
        CHAIN = new EnumArmorMaterial("CHAIN", 1, 15, new int[] {
            2, 5, 4, 1
        }, 12);
        IRON = new EnumArmorMaterial("IRON", 2, 15, new int[] {
            2, 6, 5, 2
        }, 9);
        GOLD = new EnumArmorMaterial("GOLD", 3, 7, new int[] {
            2, 5, 3, 1
        }, 25);
        DIAMOND = new EnumArmorMaterial("DIAMOND", 4, 33, new int[] {
            3, 8, 6, 3
        }, 10);
        $VALUES = (new EnumArmorMaterial[] {
            CLOTH, CHAIN, IRON, GOLD, DIAMOND
        });
    }
}
