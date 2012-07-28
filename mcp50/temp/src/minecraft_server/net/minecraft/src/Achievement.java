// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            StatBase, ItemStack, AchievementList, Item, 
//            Block

public class Achievement extends StatBase
{

    public final int field_25067_a;
    public final int field_27991_b;
    public final Achievement field_27992_c;
    private final String field_27063_l;
    public final ItemStack field_27064_d;
    private boolean field_27062_m;

    public Achievement(int p_i331_1_, String p_i331_2_, int p_i331_3_, int p_i331_4_, Item p_i331_5_, Achievement p_i331_6_)
    {
        this(p_i331_1_, p_i331_2_, p_i331_3_, p_i331_4_, new ItemStack(p_i331_5_), p_i331_6_);
    }

    public Achievement(int p_i332_1_, String p_i332_2_, int p_i332_3_, int p_i332_4_, Block p_i332_5_, Achievement p_i332_6_)
    {
        this(p_i332_1_, p_i332_2_, p_i332_3_, p_i332_4_, new ItemStack(p_i332_5_), p_i332_6_);
    }

    public Achievement(int p_i333_1_, String p_i333_2_, int p_i333_3_, int p_i333_4_, ItemStack p_i333_5_, Achievement p_i333_6_)
    {
        super(0x500000 + p_i333_1_, (new StringBuilder()).append("achievement.").append(p_i333_2_).toString());
        field_27064_d = p_i333_5_;
        field_27063_l = (new StringBuilder()).append("achievement.").append(p_i333_2_).append(".desc").toString();
        field_25067_a = p_i333_3_;
        field_27991_b = p_i333_4_;
        if(p_i333_3_ < AchievementList.field_27114_a)
        {
            AchievementList.field_27114_a = p_i333_3_;
        }
        if(p_i333_4_ < AchievementList.field_27113_b)
        {
            AchievementList.field_27113_b = p_i333_4_;
        }
        if(p_i333_3_ > AchievementList.field_27112_c)
        {
            AchievementList.field_27112_c = p_i333_3_;
        }
        if(p_i333_4_ > AchievementList.field_27111_d)
        {
            AchievementList.field_27111_d = p_i333_4_;
        }
        field_27992_c = p_i333_6_;
    }

    public Achievement func_27059_a()
    {
        field_27058_g = true;
        return this;
    }

    public Achievement func_27060_b()
    {
        field_27062_m = true;
        return this;
    }

    public Achievement func_27061_c()
    {
        super.func_27053_d();
        AchievementList.field_25129_a.add(this);
        return this;
    }

    public StatBase func_27053_d()
    {
        return func_27061_c();
    }

    public StatBase func_27052_e()
    {
        return func_27059_a();
    }
}
