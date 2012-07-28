// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Block, 
//            BlockPistonMoving, BlockSand, NBTTagCompound

public class EntityFallingSand extends Entity
{

    public int field_427_a;
    public int field_426_b;

    public EntityFallingSand(World p_i239_1_)
    {
        super(p_i239_1_);
        field_426_b = 0;
    }

    public EntityFallingSand(World p_i240_1_, double p_i240_2_, double p_i240_4_, double p_i240_6_, 
            int p_i240_8_)
    {
        super(p_i240_1_);
        field_426_b = 0;
        field_427_a = p_i240_8_;
        field_329_e = true;
        func_113_a(0.98F, 0.98F);
        field_9076_H = field_298_E / 2.0F;
        func_86_a(p_i240_2_, p_i240_4_, p_i240_6_);
        field_319_o = 0.0D;
        field_318_p = 0.0D;
        field_317_q = 0.0D;
        field_9092_m = p_i240_2_;
        field_9091_n = p_i240_4_;
        field_9090_o = p_i240_6_;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected void func_21044_a()
    {
    }

    public boolean func_129_c_()
    {
        return !field_304_B;
    }

    public void func_106_b_()
    {
        if(field_427_a == 0)
        {
            func_118_j();
            return;
        }
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_426_b++;
        field_318_p -= 0.039999999105930328D;
        func_88_c(field_319_o, field_318_p, field_317_q);
        field_319_o *= 0.98000001907348633D;
        field_318_p *= 0.98000001907348633D;
        field_317_q *= 0.98000001907348633D;
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_321_m);
        int k = MathHelper.func_584_b(field_320_n);
        if(field_426_b == 1 && field_9093_l.func_444_a(i, j, k) == field_427_a)
        {
            field_9093_l.func_508_d(i, j, k, 0);
        } else
        if(!field_9093_l.field_792_x && field_426_b == 1)
        {
            func_118_j();
        }
        if(field_9086_A)
        {
            field_319_o *= 0.69999998807907104D;
            field_317_q *= 0.69999998807907104D;
            field_318_p *= -0.5D;
            if(field_9093_l.func_444_a(i, j, k) != Block.field_9048_ac.field_573_bc)
            {
                func_118_j();
                if((!field_9093_l.func_516_a(field_427_a, i, j, k, true, 1) || BlockSand.func_285_g(field_9093_l, i, j - 1, k) || !field_9093_l.func_508_d(i, j, k, field_427_a)) && !field_9093_l.field_792_x)
                {
                    func_128_a(field_427_a, 1);
                }
            }
        } else
        if(field_426_b > 100 && !field_9093_l.field_792_x && (j < 1 || j > 256) || field_426_b > 600)
        {
            func_128_a(field_427_a, 1);
            func_118_j();
        }
    }

    protected void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_409_a("Tile", (byte)field_427_a);
    }

    protected void func_99_b(NBTTagCompound p_99_1_)
    {
        field_427_a = p_99_1_.func_408_b("Tile") & 0xff;
    }
}
