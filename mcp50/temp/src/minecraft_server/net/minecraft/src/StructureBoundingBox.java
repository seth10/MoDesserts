// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StructureBoundingBox
{

    public int field_35678_a;
    public int field_35676_b;
    public int field_35677_c;
    public int field_35674_d;
    public int field_35675_e;
    public int field_35673_f;

    public StructureBoundingBox()
    {
    }

    public static StructureBoundingBox func_35672_a()
    {
        return new StructureBoundingBox(0x7fffffff, 0x7fffffff, 0x7fffffff, 0x80000000, 0x80000000, 0x80000000);
    }

    public static StructureBoundingBox func_35663_a(int p_35663_0_, int p_35663_1_, int p_35663_2_, int p_35663_3_, int p_35663_4_, int p_35663_5_, int p_35663_6_, int p_35663_7_, 
            int p_35663_8_, int p_35663_9_)
    {
        switch(p_35663_9_)
        {
        default:
            return new StructureBoundingBox(p_35663_0_ + p_35663_3_, p_35663_1_ + p_35663_4_, p_35663_2_ + p_35663_5_, ((p_35663_0_ + p_35663_6_) - 1) + p_35663_3_, ((p_35663_1_ + p_35663_7_) - 1) + p_35663_4_, ((p_35663_2_ + p_35663_8_) - 1) + p_35663_5_);

        case 2: // '\002'
            return new StructureBoundingBox(p_35663_0_ + p_35663_3_, p_35663_1_ + p_35663_4_, (p_35663_2_ - p_35663_8_) + 1 + p_35663_5_, ((p_35663_0_ + p_35663_6_) - 1) + p_35663_3_, ((p_35663_1_ + p_35663_7_) - 1) + p_35663_4_, p_35663_2_ + p_35663_5_);

        case 0: // '\0'
            return new StructureBoundingBox(p_35663_0_ + p_35663_3_, p_35663_1_ + p_35663_4_, p_35663_2_ + p_35663_5_, ((p_35663_0_ + p_35663_6_) - 1) + p_35663_3_, ((p_35663_1_ + p_35663_7_) - 1) + p_35663_4_, ((p_35663_2_ + p_35663_8_) - 1) + p_35663_5_);

        case 1: // '\001'
            return new StructureBoundingBox((p_35663_0_ - p_35663_8_) + 1 + p_35663_5_, p_35663_1_ + p_35663_4_, p_35663_2_ + p_35663_3_, p_35663_0_ + p_35663_5_, ((p_35663_1_ + p_35663_7_) - 1) + p_35663_4_, ((p_35663_2_ + p_35663_6_) - 1) + p_35663_3_);

        case 3: // '\003'
            return new StructureBoundingBox(p_35663_0_ + p_35663_5_, p_35663_1_ + p_35663_4_, p_35663_2_ + p_35663_3_, ((p_35663_0_ + p_35663_8_) - 1) + p_35663_5_, ((p_35663_1_ + p_35663_7_) - 1) + p_35663_4_, ((p_35663_2_ + p_35663_6_) - 1) + p_35663_3_);
        }
    }

    public StructureBoundingBox(StructureBoundingBox p_i539_1_)
    {
        field_35678_a = p_i539_1_.field_35678_a;
        field_35676_b = p_i539_1_.field_35676_b;
        field_35677_c = p_i539_1_.field_35677_c;
        field_35674_d = p_i539_1_.field_35674_d;
        field_35675_e = p_i539_1_.field_35675_e;
        field_35673_f = p_i539_1_.field_35673_f;
    }

    public StructureBoundingBox(int p_i540_1_, int p_i540_2_, int p_i540_3_, int p_i540_4_, int p_i540_5_, int p_i540_6_)
    {
        field_35678_a = p_i540_1_;
        field_35676_b = p_i540_2_;
        field_35677_c = p_i540_3_;
        field_35674_d = p_i540_4_;
        field_35675_e = p_i540_5_;
        field_35673_f = p_i540_6_;
    }

    public StructureBoundingBox(int p_i541_1_, int p_i541_2_, int p_i541_3_, int p_i541_4_)
    {
        field_35678_a = p_i541_1_;
        field_35677_c = p_i541_2_;
        field_35674_d = p_i541_3_;
        field_35673_f = p_i541_4_;
        field_35676_b = 1;
        field_35675_e = 512;
    }

    public boolean func_35664_a(StructureBoundingBox p_35664_1_)
    {
        return field_35674_d >= p_35664_1_.field_35678_a && field_35678_a <= p_35664_1_.field_35674_d && field_35673_f >= p_35664_1_.field_35677_c && field_35677_c <= p_35664_1_.field_35673_f && field_35675_e >= p_35664_1_.field_35676_b && field_35676_b <= p_35664_1_.field_35675_e;
    }

    public boolean func_35671_a(int p_35671_1_, int p_35671_2_, int p_35671_3_, int p_35671_4_)
    {
        return field_35674_d >= p_35671_1_ && field_35678_a <= p_35671_3_ && field_35673_f >= p_35671_2_ && field_35677_c <= p_35671_4_;
    }

    public void func_35666_b(StructureBoundingBox p_35666_1_)
    {
        field_35678_a = Math.min(field_35678_a, p_35666_1_.field_35678_a);
        field_35676_b = Math.min(field_35676_b, p_35666_1_.field_35676_b);
        field_35677_c = Math.min(field_35677_c, p_35666_1_.field_35677_c);
        field_35674_d = Math.max(field_35674_d, p_35666_1_.field_35674_d);
        field_35675_e = Math.max(field_35675_e, p_35666_1_.field_35675_e);
        field_35673_f = Math.max(field_35673_f, p_35666_1_.field_35673_f);
    }

    public void func_35670_a(int p_35670_1_, int p_35670_2_, int p_35670_3_)
    {
        field_35678_a += p_35670_1_;
        field_35676_b += p_35670_2_;
        field_35677_c += p_35670_3_;
        field_35674_d += p_35670_1_;
        field_35675_e += p_35670_2_;
        field_35673_f += p_35670_3_;
    }

    public boolean func_35667_b(int p_35667_1_, int p_35667_2_, int p_35667_3_)
    {
        return p_35667_1_ >= field_35678_a && p_35667_1_ <= field_35674_d && p_35667_3_ >= field_35677_c && p_35667_3_ <= field_35673_f && p_35667_2_ >= field_35676_b && p_35667_2_ <= field_35675_e;
    }

    public int func_35669_b()
    {
        return (field_35674_d - field_35678_a) + 1;
    }

    public int func_35668_c()
    {
        return (field_35675_e - field_35676_b) + 1;
    }

    public int func_35665_d()
    {
        return (field_35673_f - field_35677_c) + 1;
    }

    public int func_40623_e()
    {
        return field_35678_a + ((field_35674_d - field_35678_a) + 1) / 2;
    }

    public int func_40622_f()
    {
        return field_35676_b + ((field_35675_e - field_35676_b) + 1) / 2;
    }

    public int func_40624_g()
    {
        return field_35677_c + ((field_35673_f - field_35677_c) + 1) / 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(field_35678_a).append(", ").append(field_35676_b).append(", ").append(field_35677_c).append("; ").append(field_35674_d).append(", ").append(field_35675_e).append(", ").append(field_35673_f).append(")").toString();
    }
}
