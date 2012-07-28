// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Material, IBlockAccess, AxisAlignedBB, EntityPlayer, 
//            World, ItemStack, EntityItem, Vec3D, 
//            MovingObjectPosition, StatList, EnchantmentHelper, Item, 
//            StatCollector, StepSound, StepSoundStone, StepSoundSand, 
//            BlockStone, BlockGrass, BlockDirt, BlockWood, 
//            BlockSapling, BlockFlowing, BlockStationary, BlockSand, 
//            BlockGravel, BlockOre, BlockLog, BlockLeaves, 
//            BlockSponge, BlockGlass, BlockDispenser, BlockSandStone, 
//            BlockNote, BlockBed, BlockRail, BlockDetectorRail, 
//            BlockPistonBase, BlockWeb, BlockTallGrass, BlockDeadBush, 
//            BlockPistonExtension, BlockCloth, BlockPistonMoving, BlockFlower, 
//            BlockMushroom, BlockOreStorage, BlockStep, BlockTNT, 
//            BlockBookshelf, BlockObsidian, BlockTorch, BlockFire, 
//            BlockMobSpawner, BlockStairs, BlockChest, BlockRedstoneWire, 
//            BlockWorkbench, BlockCrops, BlockFarmland, BlockFurnace, 
//            BlockSign, TileEntitySign, BlockDoor, BlockLadder, 
//            BlockLever, BlockPressurePlate, EnumMobType, BlockRedstoneOre, 
//            BlockRedstoneTorch, BlockButton, BlockSnow, BlockIce, 
//            BlockSnowBlock, BlockCactus, BlockClay, BlockReed, 
//            BlockJukeBox, BlockFence, BlockPumpkin, BlockNetherrack, 
//            BlockSoulSand, BlockGlowStone, BlockPortal, BlockCake, 
//            BlockRedstoneRepeater, BlockLockedChest, BlockTrapDoor, BlockSilverfish, 
//            BlockStoneBrick, BlockMushroomCap, BlockPane, BlockMelon, 
//            BlockStem, BlockVine, BlockFenceGate, BlockMycelium, 
//            BlockLilyPad, BlockNetherStalk, BlockEnchantmentTable, BlockBrewingStand, 
//            BlockCauldron, BlockEndPortal, BlockEndPortalFrame, BlockDragonEgg, 
//            BlockRedstoneLight, ItemCloth, ItemMetadata, ItemSlab, 
//            ItemSapling, ItemLeaves, ItemColored, ItemLilyPad, 
//            ItemPiston, ItemBlock, Entity, EntityLiving

public class Block
{

    public static final StepSound field_551_e;
    public static final StepSound field_9028_e;
    public static final StepSound field_9027_f;
    public static final StepSound field_9026_g;
    public static final StepSound field_9025_h;
    public static final StepSound field_9024_i;
    public static final StepSound field_9023_j;
    public static final StepSound field_9022_k;
    public static final StepSound field_9021_l;
    public static final Block field_542_n[];
    public static final boolean field_540_p[] = new boolean[4096];
    public static final int field_538_r[] = new int[4096];
    public static final boolean field_537_s[];
    public static final int field_536_t[] = new int[4096];
    public static final boolean field_28029_t[] = new boolean[4096];
    public static boolean field_40166_bL[];
    public static final Block field_535_u;
    public static final BlockGrass field_534_v;
    public static final Block field_533_w;
    public static final Block field_532_x;
    public static final Block field_531_y;
    public static final Block field_6047_y;
    public static final Block field_4064_A;
    public static final Block field_598_B;
    public static final Block field_596_C;
    public static final Block field_594_D;
    public static final Block field_592_E;
    public static final Block field_590_F;
    public static final Block field_4062_G;
    public static final Block field_4061_H;
    public static final Block field_4059_I;
    public static final Block field_583_J;
    public static final Block field_582_K;
    public static final BlockLeaves field_581_L;
    public static final Block field_9043_L;
    public static final Block field_4056_N;
    public static final Block field_9042_N;
    public static final Block field_9041_O;
    public static final Block field_9040_P;
    public static final Block field_9039_Q;
    public static final Block field_9038_R = (new BlockNote(25)).func_237_c(0.8F).func_20037_a("musicBlock").func_28027_k();
    public static final Block field_9037_S = (new BlockBed(26)).func_237_c(0.2F).func_20037_a("bed").func_27021_h().func_28027_k();
    public static final Block field_9036_T;
    public static final Block field_9034_U;
    public static final Block field_9033_V;
    public static final Block field_9032_W = (new BlockWeb(30, 11)).func_258_c(1).func_237_c(4F).func_20037_a("web");
    public static final BlockTallGrass field_9031_X;
    public static final BlockDeadBush field_9030_Y;
    public static final Block field_9029_Z;
    public static final BlockPistonExtension field_9049_aa = (BlockPistonExtension)(new BlockPistonExtension(34, 107)).func_28027_k();
    public static final Block field_616_ac;
    public static final BlockPistonMoving field_9048_ac = new BlockPistonMoving(36);
    public static final BlockFlower field_4072_ae;
    public static final BlockFlower field_4071_af;
    public static final BlockFlower field_4070_ag;
    public static final BlockFlower field_4069_ah;
    public static final Block field_4068_ai;
    public static final Block field_4067_aj;
    public static final Block field_608_ak;
    public static final Block field_607_al;
    public static final Block field_9047_al;
    public static final Block field_605_an;
    public static final Block field_604_ao;
    public static final Block field_603_ap;
    public static final Block field_602_aq;
    public static final Block field_9046_aq;
    public static final BlockFire field_599_as;
    public static final Block field_597_at;
    public static final Block field_9045_at;
    public static final Block field_593_av;
    public static final Block field_591_aw;
    public static final Block field_588_ax;
    public static final Block field_4060_ay;
    public static final Block field_9044_ay;
    public static final Block field_644_aA;
    public static final Block field_643_aB;
    public static final Block field_642_aC;
    public static final Block field_641_aD;
    public static final Block field_4084_aE;
    public static final Block field_639_aF;
    public static final Block field_638_aG;
    public static final Block field_637_aH;
    public static final Block field_9055_aH;
    public static final Block field_4082_aJ;
    public static final Block field_9054_aJ;
    public static final Block field_9053_aK;
    public static final Block field_632_aM;
    public static final Block field_9052_aM;
    public static final Block field_630_aO;
    public static final Block field_629_aP;
    public static final Block field_628_aQ;
    public static final Block field_627_aR;
    public static final Block field_9051_aR;
    public static final Block field_625_aT;
    public static final Block field_4077_aU;
    public static final Block field_4076_aV;
    public static final Block field_622_aW;
    public static final Block field_621_aX;
    public static final Block field_620_aY;
    public static final Block field_619_aZ;
    public static final Block field_9050_aZ;
    public static final Block field_4052_bb;
    public static final Block field_4050_bc;
    public static final Block field_4048_bd;
    public static final Block field_6065_bd;
    public static final BlockPortal field_4044_bf;
    public static final Block field_9035_bf;
    public static final Block field_21026_bg;
    public static final Block field_22011_bh;
    public static final Block field_22010_bi;
    public static final Block field_25013_bj;
    public static final Block field_28030_bl;
    public static final Block field_35056_bm = (new BlockSilverfish(97)).func_237_c(0.75F);
    public static final Block field_35052_bn;
    public static final Block field_35053_bo;
    public static final Block field_35054_bp;
    public static final Block field_35055_bq;
    public static final Block field_35049_br;
    public static final Block field_35048_bs;
    public static final Block field_35051_bt;
    public static final Block field_35050_bu;
    public static final Block field_35045_bv;
    public static final Block field_35044_bw;
    public static final Block field_35047_bx;
    public static final Block field_35046_by;
    public static final BlockMycelium field_40164_bz;
    public static final Block field_40165_bA;
    public static final Block field_40171_bB;
    public static final Block field_40172_bC;
    public static final Block field_40169_bD;
    public static final Block field_40170_bE = (new BlockNetherStalk(115)).func_20037_a("netherStalk").func_28027_k();
    public static final Block field_40175_bF = (new BlockEnchantmentTable(116)).func_237_c(5F).func_232_b(2000F).func_20037_a("enchantmentTable");
    public static final Block field_40176_bG = (new BlockBrewingStand(117)).func_237_c(0.5F).func_224_a(0.125F).func_20037_a("brewingStand").func_28027_k();
    public static final Block field_40173_bH = (new BlockCauldron(118)).func_237_c(2.0F).func_20037_a("cauldron").func_28027_k();
    public static final Block field_40174_bI;
    public static final Block field_40167_bJ;
    public static final Block field_40168_bK;
    public static final Block field_41002_bK;
    public static final Block field_48130_bL;
    public static final Block field_48131_bM;
    public int field_575_bb;
    public final int field_573_bc;
    protected float field_571_bd;
    protected float field_569_be;
    protected boolean field_27024_bo;
    protected boolean field_27023_bp;
    protected boolean field_48129_bT;
    protected boolean field_48128_bU;
    public double field_567_bf;
    public double field_565_bg;
    public double field_563_bh;
    public double field_561_bi;
    public double field_559_bj;
    public double field_557_bk;
    public StepSound field_555_bl;
    public float field_554_bm;
    public final Material field_553_bn;
    public float field_552_bo;
    private String field_666_a;

    protected Block(int p_i492_1_, Material p_i492_2_)
    {
        field_27024_bo = true;
        field_27023_bp = true;
        field_555_bl = field_551_e;
        field_554_bm = 1.0F;
        field_552_bo = 0.6F;
        if(field_542_n[p_i492_1_] != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Slot ").append(p_i492_1_).append(" is already occupied by ").append(field_542_n[p_i492_1_]).append(" when adding ").append(this).toString());
        } else
        {
            field_553_bn = p_i492_2_;
            field_542_n[p_i492_1_] = this;
            field_573_bc = p_i492_1_;
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            field_540_p[p_i492_1_] = func_240_b();
            field_538_r[p_i492_1_] = func_240_b() ? 255 : 0;
            field_537_s[p_i492_1_] = !p_i492_2_.func_219_b();
            return;
        }
    }

    protected Block func_28027_k()
    {
        field_28029_t[field_573_bc] = true;
        return this;
    }

    protected void func_28028_f()
    {
    }

    protected Block(int p_i493_1_, int p_i493_2_, Material p_i493_3_)
    {
        this(p_i493_1_, p_i493_3_);
        field_575_bb = p_i493_2_;
    }

    protected Block func_4026_a(StepSound p_4026_1_)
    {
        field_555_bl = p_4026_1_;
        return this;
    }

    protected Block func_258_c(int p_258_1_)
    {
        field_538_r[field_573_bc] = p_258_1_;
        return this;
    }

    protected Block func_224_a(float p_224_1_)
    {
        field_536_t[field_573_bc] = (int)(15F * p_224_1_);
        return this;
    }

    protected Block func_232_b(float p_232_1_)
    {
        field_569_be = p_232_1_ * 3F;
        return this;
    }

    public static boolean func_48126_g(int p_48126_0_)
    {
        Block block = field_542_n[p_48126_0_];
        if(block == null)
        {
            return false;
        } else
        {
            return block.field_553_bn.func_28128_h() && block.func_28025_b();
        }
    }

    public boolean func_28025_b()
    {
        return true;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return !field_553_bn.func_218_c();
    }

    public int func_40161_b()
    {
        return 0;
    }

    protected Block func_237_c(float p_237_1_)
    {
        field_571_bd = p_237_1_;
        if(field_569_be < p_237_1_ * 5F)
        {
            field_569_be = p_237_1_ * 5F;
        }
        return this;
    }

    protected Block func_31027_i()
    {
        func_237_c(-1F);
        return this;
    }

    public float func_31026_j()
    {
        return field_571_bd;
    }

    protected Block func_231_a(boolean p_231_1_)
    {
        field_48129_bT = p_231_1_;
        return this;
    }

    public boolean func_48125_m()
    {
        return field_48129_bT;
    }

    public boolean func_48124_n()
    {
        return field_48128_bU;
    }

    public void func_229_a(float p_229_1_, float p_229_2_, float p_229_3_, float p_229_4_, float p_229_5_, float p_229_6_)
    {
        field_567_bf = p_229_1_;
        field_565_bg = p_229_2_;
        field_563_bh = p_229_3_;
        field_561_bi = p_229_4_;
        field_559_bj = p_229_5_;
        field_557_bk = p_229_6_;
    }

    public boolean func_253_a(IBlockAccess p_253_1_, int p_253_2_, int p_253_3_, int p_253_4_, int p_253_5_)
    {
        return p_253_1_.func_443_c(p_253_2_, p_253_3_, p_253_4_).func_216_a();
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return func_241_a(p_22009_1_);
    }

    public int func_241_a(int p_241_1_)
    {
        return field_575_bb;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        AxisAlignedBB axisalignedbb = func_248_d(p_264_1_, p_264_2_, p_264_3_, p_264_4_);
        if(axisalignedbb != null && p_264_5_.func_704_a(axisalignedbb))
        {
            p_264_6_.add(axisalignedbb);
        }
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        return AxisAlignedBB.func_693_b((double)p_248_2_ + field_567_bf, (double)p_248_3_ + field_565_bg, (double)p_248_4_ + field_563_bh, (double)p_248_2_ + field_561_bi, (double)p_248_3_ + field_559_bj, (double)p_248_4_ + field_557_bk);
    }

    public boolean func_240_b()
    {
        return true;
    }

    public boolean func_243_a(int p_243_1_, boolean p_243_2_)
    {
        return func_245_e();
    }

    public boolean func_245_e()
    {
        return true;
    }

    public void func_221_a(World world, int i, int j, int k, Random random)
    {
    }

    public void func_251_a(World world, int i, int j, int k, int l)
    {
    }

    public void func_234_b(World world, int i, int j, int k, int l)
    {
    }

    public int func_4028_b()
    {
        return 10;
    }

    public void func_250_e(World world, int i, int j, int k)
    {
    }

    public void func_242_b(World world, int i, int j, int k)
    {
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return field_573_bc;
    }

    public float func_254_a(EntityPlayer p_254_1_)
    {
        if(field_571_bd < 0.0F)
        {
            return 0.0F;
        }
        if(!p_254_1_.func_167_b(this))
        {
            return 1.0F / field_571_bd / 100F;
        } else
        {
            return p_254_1_.func_165_a(this) / field_571_bd / 30F;
        }
    }

    public final void func_247_a_(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, int p_247_5_, int p_247_6_)
    {
        func_227_a(p_247_1_, p_247_2_, p_247_3_, p_247_4_, p_247_5_, 1.0F, p_247_6_);
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(p_227_1_.field_792_x)
        {
            return;
        }
        int i = func_40162_a(p_227_7_, p_227_1_.field_803_m);
        for(int j = 0; j < i; j++)
        {
            if(p_227_1_.field_803_m.nextFloat() > p_227_6_)
            {
                continue;
            }
            int k = func_252_a(p_227_5_, p_227_1_.field_803_m, p_227_7_);
            if(k > 0)
            {
                func_31024_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, new ItemStack(k, 1, func_21025_b(p_227_5_)));
            }
        }

    }

    protected void func_31024_a(World p_31024_1_, int p_31024_2_, int p_31024_3_, int p_31024_4_, ItemStack p_31024_5_)
    {
        if(p_31024_1_.field_792_x)
        {
            return;
        } else
        {
            float f = 0.7F;
            double d = (double)(p_31024_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(p_31024_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d2 = (double)(p_31024_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(p_31024_1_, (double)p_31024_2_ + d, (double)p_31024_3_ + d1, (double)p_31024_4_ + d2, p_31024_5_);
            entityitem.field_433_ad = 10;
            p_31024_1_.func_526_a(entityitem);
            return;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return 0;
    }

    public float func_226_a(Entity p_226_1_)
    {
        return field_569_be / 5F;
    }

    public MovingObjectPosition func_262_a(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_, Vec3D p_262_5_, Vec3D p_262_6_)
    {
        func_233_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_);
        p_262_5_ = p_262_5_.func_757_c(-p_262_2_, -p_262_3_, -p_262_4_);
        p_262_6_ = p_262_6_.func_757_c(-p_262_2_, -p_262_3_, -p_262_4_);
        Vec3D vec3d = p_262_5_.func_766_a(p_262_6_, field_567_bf);
        Vec3D vec3d1 = p_262_5_.func_766_a(p_262_6_, field_561_bi);
        Vec3D vec3d2 = p_262_5_.func_763_b(p_262_6_, field_565_bg);
        Vec3D vec3d3 = p_262_5_.func_763_b(p_262_6_, field_559_bj);
        Vec3D vec3d4 = p_262_5_.func_762_c(p_262_6_, field_563_bh);
        Vec3D vec3d5 = p_262_5_.func_762_c(p_262_6_, field_557_bk);
        if(!func_223_a(vec3d))
        {
            vec3d = null;
        }
        if(!func_223_a(vec3d1))
        {
            vec3d1 = null;
        }
        if(!func_228_b(vec3d2))
        {
            vec3d2 = null;
        }
        if(!func_228_b(vec3d3))
        {
            vec3d3 = null;
        }
        if(!func_236_c(vec3d4))
        {
            vec3d4 = null;
        }
        if(!func_236_c(vec3d5))
        {
            vec3d5 = null;
        }
        Vec3D vec3d6 = null;
        if(vec3d != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d;
        }
        if(vec3d1 != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d1) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d1;
        }
        if(vec3d2 != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d2) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d2;
        }
        if(vec3d3 != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d3) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d3;
        }
        if(vec3d4 != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d4) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d4;
        }
        if(vec3d5 != null && (vec3d6 == null || p_262_5_.func_767_a(vec3d5) < p_262_5_.func_767_a(vec3d6)))
        {
            vec3d6 = vec3d5;
        }
        if(vec3d6 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(vec3d6 == vec3d)
        {
            byte0 = 4;
        }
        if(vec3d6 == vec3d1)
        {
            byte0 = 5;
        }
        if(vec3d6 == vec3d2)
        {
            byte0 = 0;
        }
        if(vec3d6 == vec3d3)
        {
            byte0 = 1;
        }
        if(vec3d6 == vec3d4)
        {
            byte0 = 2;
        }
        if(vec3d6 == vec3d5)
        {
            byte0 = 3;
        }
        return new MovingObjectPosition(p_262_2_, p_262_3_, p_262_4_, byte0, vec3d6.func_757_c(p_262_2_, p_262_3_, p_262_4_));
    }

    private boolean func_223_a(Vec3D p_223_1_)
    {
        if(p_223_1_ == null)
        {
            return false;
        } else
        {
            return p_223_1_.field_1054_b >= field_565_bg && p_223_1_.field_1054_b <= field_559_bj && p_223_1_.field_1058_c >= field_563_bh && p_223_1_.field_1058_c <= field_557_bk;
        }
    }

    private boolean func_228_b(Vec3D p_228_1_)
    {
        if(p_228_1_ == null)
        {
            return false;
        } else
        {
            return p_228_1_.field_1055_a >= field_567_bf && p_228_1_.field_1055_a <= field_561_bi && p_228_1_.field_1058_c >= field_563_bh && p_228_1_.field_1058_c <= field_557_bk;
        }
    }

    private boolean func_236_c(Vec3D p_236_1_)
    {
        if(p_236_1_ == null)
        {
            return false;
        } else
        {
            return p_236_1_.field_1055_a >= field_567_bf && p_236_1_.field_1055_a <= field_561_bi && p_236_1_.field_1054_b >= field_565_bg && p_236_1_.field_1054_b <= field_559_bj;
        }
    }

    public void func_4029_c(World world, int i, int j, int k)
    {
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int p_28026_4_, int p_28026_5_)
    {
        return func_259_a(p_28026_1_, p_28026_2_, p_28026_3_, p_28026_4_);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        int i = p_259_1_.func_444_a(p_259_2_, p_259_3_, p_259_4_);
        return i == 0 || field_542_n[i].field_553_bn.func_27090_g();
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int i, EntityPlayer entityplayer)
    {
        return false;
    }

    public void func_249_b(World world, int i, int j, int k, Entity entity)
    {
    }

    public void func_255_c(World world, int i, int j, int k, int l)
    {
    }

    public void func_235_b(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
    }

    public void func_230_a(World world, int i, int j, int k, Entity entity, Vec3D vec3d)
    {
    }

    public void func_233_a(IBlockAccess iblockaccess, int i, int j, int k)
    {
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int i, int j)
    {
        return false;
    }

    public boolean func_225_d()
    {
        return false;
    }

    public void func_263_a(World world, int i, int j, int k, Entity entity)
    {
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int i, int j)
    {
        return false;
    }

    public void func_40163_f()
    {
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        p_12007_2_.func_25046_a(StatList.field_25094_y[field_573_bc], 1);
        p_12007_2_.func_35198_b(0.025F);
        if(func_50008_h() && EnchantmentHelper.func_40644_d(p_12007_2_.field_416_aj))
        {
            ItemStack itemstack = func_41001_e(p_12007_6_);
            if(itemstack != null)
            {
                func_31024_a(p_12007_1_, p_12007_3_, p_12007_4_, p_12007_5_, itemstack);
            }
        } else
        {
            int i = EnchantmentHelper.func_40635_e(p_12007_2_.field_416_aj);
            func_247_a_(p_12007_1_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_, i);
        }
    }

    protected boolean func_50008_h()
    {
        return func_28025_b() && !field_48128_bU;
    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        int i = 0;
        if(field_573_bc >= 0 && field_573_bc < Item.field_176_c.length && Item.field_176_c[field_573_bc].func_21092_c())
        {
            i = p_41001_1_;
        }
        return new ItemStack(field_573_bc, 1, i);
    }

    public int func_40162_a(int p_40162_1_, Random p_40162_2_)
    {
        return func_244_a(p_40162_2_);
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int i)
    {
        return true;
    }

    public void func_4027_a(World world, int i, int j, int k, EntityLiving entityliving)
    {
    }

    public Block func_20037_a(String p_20037_1_)
    {
        field_666_a = (new StringBuilder()).append("tile.").append(p_20037_1_).toString();
        return this;
    }

    public String func_25012_e()
    {
        return StatCollector.func_25136_a((new StringBuilder()).append(func_20036_e()).append(".name").toString());
    }

    public String func_20036_e()
    {
        return field_666_a;
    }

    public void func_21024_a(World world, int i, int j, int k, int l, int i1)
    {
    }

    public boolean func_27022_g()
    {
        return field_27023_bp;
    }

    protected Block func_27021_h()
    {
        field_27023_bp = false;
        return this;
    }

    public int func_31025_e()
    {
        return field_553_bn.func_31056_j();
    }

    public void func_43001_a(World world, int i, int j, int k, Entity entity, float f)
    {
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        field_551_e = new StepSound("stone", 1.0F, 1.0F);
        field_9028_e = new StepSound("wood", 1.0F, 1.0F);
        field_9027_f = new StepSound("gravel", 1.0F, 1.0F);
        field_9026_g = new StepSound("grass", 1.0F, 1.0F);
        field_9025_h = new StepSound("stone", 1.0F, 1.0F);
        field_9024_i = new StepSound("stone", 1.0F, 1.5F);
        field_9023_j = new StepSoundStone("stone", 1.0F, 1.0F);
        field_9022_k = new StepSound("cloth", 1.0F, 1.0F);
        field_9021_l = new StepSoundSand("sand", 1.0F, 1.0F);
        field_542_n = new Block[4096];
        field_537_s = new boolean[4096];
        field_40166_bL = new boolean[4096];
        field_535_u = (new BlockStone(1, 1)).func_237_c(1.5F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stone");
        field_534_v = (BlockGrass)(new BlockGrass(2)).func_237_c(0.6F).func_4026_a(field_9026_g).func_20037_a("grass");
        field_533_w = (new BlockDirt(3, 2)).func_237_c(0.5F).func_4026_a(field_9027_f).func_20037_a("dirt");
        field_532_x = (new Block(4, 16, Material.field_523_d)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stonebrick");
        field_531_y = (new BlockWood(5)).func_237_c(2.0F).func_232_b(5F).func_4026_a(field_9028_e).func_20037_a("wood").func_28027_k();
        field_6047_y = (new BlockSapling(6, 15)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("sapling").func_28027_k();
        field_4064_A = (new Block(7, 17, Material.field_523_d)).func_31027_i().func_232_b(6000000F).func_4026_a(field_9025_h).func_20037_a("bedrock").func_27021_h();
        field_598_B = (new BlockFlowing(8, Material.field_521_f)).func_237_c(100F).func_258_c(3).func_20037_a("water").func_27021_h().func_28027_k();
        field_596_C = (new BlockStationary(9, Material.field_521_f)).func_237_c(100F).func_258_c(3).func_20037_a("water").func_27021_h().func_28027_k();
        field_594_D = (new BlockFlowing(10, Material.field_520_g)).func_237_c(0.0F).func_224_a(1.0F).func_258_c(255).func_20037_a("lava").func_27021_h().func_28027_k();
        field_592_E = (new BlockStationary(11, Material.field_520_g)).func_237_c(100F).func_224_a(1.0F).func_258_c(255).func_20037_a("lava").func_27021_h().func_28027_k();
        field_590_F = (new BlockSand(12, 18)).func_237_c(0.5F).func_4026_a(field_9021_l).func_20037_a("sand");
        field_4062_G = (new BlockGravel(13, 19)).func_237_c(0.6F).func_4026_a(field_9027_f).func_20037_a("gravel");
        field_4061_H = (new BlockOre(14, 32)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreGold");
        field_4059_I = (new BlockOre(15, 33)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreIron");
        field_583_J = (new BlockOre(16, 34)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreCoal");
        field_582_K = (new BlockLog(17)).func_237_c(2.0F).func_4026_a(field_9028_e).func_20037_a("log").func_28027_k();
        field_581_L = (BlockLeaves)(new BlockLeaves(18, 52)).func_237_c(0.2F).func_258_c(1).func_4026_a(field_9026_g).func_20037_a("leaves").func_28027_k();
        field_9043_L = (new BlockSponge(19)).func_237_c(0.6F).func_4026_a(field_9026_g).func_20037_a("sponge");
        field_4056_N = (new BlockGlass(20, 49, Material.field_4216_o, false)).func_237_c(0.3F).func_4026_a(field_9023_j).func_20037_a("glass");
        field_9042_N = (new BlockOre(21, 160)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreLapis");
        field_9041_O = (new Block(22, 144, Material.field_523_d)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("blockLapis");
        field_9040_P = (new BlockDispenser(23)).func_237_c(3.5F).func_4026_a(field_9025_h).func_20037_a("dispenser").func_28027_k();
        field_9039_Q = (new BlockSandStone(24)).func_4026_a(field_9025_h).func_237_c(0.8F).func_20037_a("sandStone").func_28027_k();
        field_9036_T = (new BlockRail(27, 179, true)).func_237_c(0.7F).func_4026_a(field_9024_i).func_20037_a("goldenRail").func_28027_k();
        field_9034_U = (new BlockDetectorRail(28, 195)).func_237_c(0.7F).func_4026_a(field_9024_i).func_20037_a("detectorRail").func_28027_k();
        field_9033_V = (new BlockPistonBase(29, 106, true)).func_20037_a("pistonStickyBase").func_28027_k();
        field_9031_X = (BlockTallGrass)(new BlockTallGrass(31, 39)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("tallgrass");
        field_9030_Y = (BlockDeadBush)(new BlockDeadBush(32, 55)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("deadbush");
        field_9029_Z = (new BlockPistonBase(33, 107, false)).func_20037_a("pistonBase").func_28027_k();
        field_616_ac = (new BlockCloth()).func_237_c(0.8F).func_4026_a(field_9022_k).func_20037_a("cloth").func_28027_k();
        field_4072_ae = (BlockFlower)(new BlockFlower(37, 13)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("flower");
        field_4071_af = (BlockFlower)(new BlockFlower(38, 12)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("rose");
        field_4070_ag = (BlockFlower)(new BlockMushroom(39, 29)).func_237_c(0.0F).func_4026_a(field_9026_g).func_224_a(0.125F).func_20037_a("mushroom");
        field_4069_ah = (BlockFlower)(new BlockMushroom(40, 28)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("mushroom");
        field_4068_ai = (new BlockOreStorage(41, 23)).func_237_c(3F).func_232_b(10F).func_4026_a(field_9024_i).func_20037_a("blockGold");
        field_4067_aj = (new BlockOreStorage(42, 22)).func_237_c(5F).func_232_b(10F).func_4026_a(field_9024_i).func_20037_a("blockIron");
        field_608_ak = (new BlockStep(43, true)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stoneSlab");
        field_607_al = (new BlockStep(44, false)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stoneSlab");
        field_9047_al = (new Block(45, 7, Material.field_523_d)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("brick");
        field_605_an = (new BlockTNT(46, 8)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("tnt");
        field_604_ao = (new BlockBookshelf(47, 35)).func_237_c(1.5F).func_4026_a(field_9028_e).func_20037_a("bookshelf");
        field_603_ap = (new Block(48, 36, Material.field_523_d)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stoneMoss");
        field_602_aq = (new BlockObsidian(49, 37)).func_237_c(50F).func_232_b(2000F).func_4026_a(field_9025_h).func_20037_a("obsidian");
        field_9046_aq = (new BlockTorch(50, 80)).func_237_c(0.0F).func_224_a(0.9375F).func_4026_a(field_9028_e).func_20037_a("torch").func_28027_k();
        field_599_as = (BlockFire)(new BlockFire(51, 31)).func_237_c(0.0F).func_224_a(1.0F).func_4026_a(field_9028_e).func_20037_a("fire").func_27021_h();
        field_597_at = (new BlockMobSpawner(52, 65)).func_237_c(5F).func_4026_a(field_9024_i).func_20037_a("mobSpawner").func_27021_h();
        field_9045_at = (new BlockStairs(53, field_531_y)).func_20037_a("stairsWood").func_28027_k();
        field_593_av = (new BlockChest(54)).func_237_c(2.5F).func_4026_a(field_9028_e).func_20037_a("chest").func_28027_k();
        field_591_aw = (new BlockRedstoneWire(55, 164)).func_237_c(0.0F).func_4026_a(field_551_e).func_20037_a("redstoneDust").func_27021_h().func_28027_k();
        field_588_ax = (new BlockOre(56, 50)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreDiamond");
        field_4060_ay = (new BlockOreStorage(57, 24)).func_237_c(5F).func_232_b(10F).func_4026_a(field_9024_i).func_20037_a("blockDiamond");
        field_9044_ay = (new BlockWorkbench(58)).func_237_c(2.5F).func_4026_a(field_9028_e).func_20037_a("workbench");
        field_644_aA = (new BlockCrops(59, 88)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("crops").func_27021_h().func_28027_k();
        field_643_aB = (new BlockFarmland(60)).func_237_c(0.6F).func_4026_a(field_9027_f).func_20037_a("farmland").func_28027_k();
        field_642_aC = (new BlockFurnace(61, false)).func_237_c(3.5F).func_4026_a(field_9025_h).func_20037_a("furnace").func_28027_k();
        field_641_aD = (new BlockFurnace(62, true)).func_237_c(3.5F).func_4026_a(field_9025_h).func_224_a(0.875F).func_20037_a("furnace").func_28027_k();
        field_4084_aE = (new BlockSign(63, net.minecraft.src.TileEntitySign.class, true)).func_237_c(1.0F).func_4026_a(field_9028_e).func_20037_a("sign").func_27021_h().func_28027_k();
        field_639_aF = (new BlockDoor(64, Material.field_524_c)).func_237_c(3F).func_4026_a(field_9028_e).func_20037_a("doorWood").func_27021_h().func_28027_k();
        field_638_aG = (new BlockLadder(65, 83)).func_237_c(0.4F).func_4026_a(field_9028_e).func_20037_a("ladder").func_28027_k();
        field_637_aH = (new BlockRail(66, 128, false)).func_237_c(0.7F).func_4026_a(field_9024_i).func_20037_a("rail").func_28027_k();
        field_9055_aH = (new BlockStairs(67, field_532_x)).func_20037_a("stairsStone").func_28027_k();
        field_4082_aJ = (new BlockSign(68, net.minecraft.src.TileEntitySign.class, false)).func_237_c(1.0F).func_4026_a(field_9028_e).func_20037_a("sign").func_27021_h().func_28027_k();
        field_9054_aJ = (new BlockLever(69, 96)).func_237_c(0.5F).func_4026_a(field_9028_e).func_20037_a("lever").func_28027_k();
        field_9053_aK = (new BlockPressurePlate(70, field_535_u.field_575_bb, EnumMobType.mobs, Material.field_523_d)).func_237_c(0.5F).func_4026_a(field_9025_h).func_20037_a("pressurePlate").func_28027_k();
        field_632_aM = (new BlockDoor(71, Material.field_522_e)).func_237_c(5F).func_4026_a(field_9024_i).func_20037_a("doorIron").func_27021_h().func_28027_k();
        field_9052_aM = (new BlockPressurePlate(72, field_531_y.field_575_bb, EnumMobType.everything, Material.field_524_c)).func_237_c(0.5F).func_4026_a(field_9028_e).func_20037_a("pressurePlate").func_28027_k();
        field_630_aO = (new BlockRedstoneOre(73, 51, false)).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreRedstone").func_28027_k();
        field_629_aP = (new BlockRedstoneOre(74, 51, true)).func_224_a(0.625F).func_237_c(3F).func_232_b(5F).func_4026_a(field_9025_h).func_20037_a("oreRedstone").func_28027_k();
        field_628_aQ = (new BlockRedstoneTorch(75, 115, false)).func_237_c(0.0F).func_4026_a(field_9028_e).func_20037_a("notGate").func_28027_k();
        field_627_aR = (new BlockRedstoneTorch(76, 99, true)).func_237_c(0.0F).func_224_a(0.5F).func_4026_a(field_9028_e).func_20037_a("notGate").func_28027_k();
        field_9051_aR = (new BlockButton(77, field_535_u.field_575_bb)).func_237_c(0.5F).func_4026_a(field_9025_h).func_20037_a("button").func_28027_k();
        field_625_aT = (new BlockSnow(78, 66)).func_237_c(0.1F).func_4026_a(field_9022_k).func_20037_a("snow").func_258_c(0);
        field_4077_aU = (new BlockIce(79, 67)).func_237_c(0.5F).func_258_c(3).func_4026_a(field_9023_j).func_20037_a("ice");
        field_4076_aV = (new BlockSnowBlock(80, 66)).func_237_c(0.2F).func_4026_a(field_9022_k).func_20037_a("snow");
        field_622_aW = (new BlockCactus(81, 70)).func_237_c(0.4F).func_4026_a(field_9022_k).func_20037_a("cactus");
        field_621_aX = (new BlockClay(82, 72)).func_237_c(0.6F).func_4026_a(field_9027_f).func_20037_a("clay");
        field_620_aY = (new BlockReed(83, 73)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("reeds").func_27021_h();
        field_619_aZ = (new BlockJukeBox(84, 74)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("jukebox").func_28027_k();
        field_9050_aZ = (new BlockFence(85, 4)).func_237_c(2.0F).func_232_b(5F).func_4026_a(field_9028_e).func_20037_a("fence");
        field_4052_bb = (new BlockPumpkin(86, 102, false)).func_237_c(1.0F).func_4026_a(field_9028_e).func_20037_a("pumpkin").func_28027_k();
        field_4050_bc = (new BlockNetherrack(87, 103)).func_237_c(0.4F).func_4026_a(field_9025_h).func_20037_a("hellrock");
        field_4048_bd = (new BlockSoulSand(88, 104)).func_237_c(0.5F).func_4026_a(field_9021_l).func_20037_a("hellsand");
        field_6065_bd = (new BlockGlowStone(89, 105, Material.field_4216_o)).func_237_c(0.3F).func_4026_a(field_9023_j).func_224_a(1.0F).func_20037_a("lightgem");
        field_4044_bf = (BlockPortal)(new BlockPortal(90, 14)).func_237_c(-1F).func_4026_a(field_9023_j).func_224_a(0.75F).func_20037_a("portal");
        field_9035_bf = (new BlockPumpkin(91, 102, true)).func_237_c(1.0F).func_4026_a(field_9028_e).func_224_a(1.0F).func_20037_a("litpumpkin").func_28027_k();
        field_21026_bg = (new BlockCake(92, 121)).func_237_c(0.5F).func_4026_a(field_9022_k).func_20037_a("cake").func_27021_h().func_28027_k();
        field_22011_bh = (new BlockRedstoneRepeater(93, false)).func_237_c(0.0F).func_4026_a(field_9028_e).func_20037_a("diode").func_27021_h().func_28027_k();
        field_22010_bi = (new BlockRedstoneRepeater(94, true)).func_237_c(0.0F).func_224_a(0.625F).func_4026_a(field_9028_e).func_20037_a("diode").func_27021_h().func_28027_k();
        field_25013_bj = (new BlockLockedChest(95)).func_237_c(0.0F).func_224_a(1.0F).func_4026_a(field_9028_e).func_20037_a("lockedchest").func_231_a(true).func_28027_k();
        field_28030_bl = (new BlockTrapDoor(96, Material.field_524_c)).func_237_c(3F).func_4026_a(field_9028_e).func_20037_a("trapdoor").func_27021_h().func_28027_k();
        field_35052_bn = (new BlockStoneBrick(98)).func_237_c(1.5F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("stonebricksmooth");
        field_35053_bo = (new BlockMushroomCap(99, Material.field_524_c, 142, 0)).func_237_c(0.2F).func_4026_a(field_9028_e).func_20037_a("mushroom").func_28027_k();
        field_35054_bp = (new BlockMushroomCap(100, Material.field_524_c, 142, 1)).func_237_c(0.2F).func_4026_a(field_9028_e).func_20037_a("mushroom").func_28027_k();
        field_35055_bq = (new BlockPane(101, 85, 85, Material.field_522_e, true)).func_237_c(5F).func_232_b(10F).func_4026_a(field_9024_i).func_20037_a("fenceIron");
        field_35049_br = (new BlockPane(102, 49, 148, Material.field_4216_o, false)).func_237_c(0.3F).func_4026_a(field_9023_j).func_20037_a("thinGlass");
        field_35048_bs = (new BlockMelon(103)).func_237_c(1.0F).func_4026_a(field_9028_e).func_20037_a("melon");
        field_35051_bt = (new BlockStem(104, field_4052_bb)).func_237_c(0.0F).func_4026_a(field_9028_e).func_20037_a("pumpkinStem").func_28027_k();
        field_35050_bu = (new BlockStem(105, field_35048_bs)).func_237_c(0.0F).func_4026_a(field_9028_e).func_20037_a("pumpkinStem").func_28027_k();
        field_35045_bv = (new BlockVine(106)).func_237_c(0.2F).func_4026_a(field_9026_g).func_20037_a("vine").func_28027_k();
        field_35044_bw = (new BlockFenceGate(107, 4)).func_237_c(2.0F).func_232_b(5F).func_4026_a(field_9028_e).func_20037_a("fenceGate").func_28027_k();
        field_35047_bx = (new BlockStairs(108, field_9047_al)).func_20037_a("stairsBrick").func_28027_k();
        field_35046_by = (new BlockStairs(109, field_35052_bn)).func_20037_a("stairsStoneBrickSmooth").func_28027_k();
        field_40164_bz = (BlockMycelium)(new BlockMycelium(110)).func_237_c(0.6F).func_4026_a(field_9026_g).func_20037_a("mycel");
        field_40165_bA = (new BlockLilyPad(111, 76)).func_237_c(0.0F).func_4026_a(field_9026_g).func_20037_a("waterlily");
        field_40171_bB = (new Block(112, 224, Material.field_523_d)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("netherBrick");
        field_40172_bC = (new BlockFence(113, 224, Material.field_523_d)).func_237_c(2.0F).func_232_b(10F).func_4026_a(field_9025_h).func_20037_a("netherFence");
        field_40169_bD = (new BlockStairs(114, field_40171_bB)).func_20037_a("stairsNetherBrick").func_28027_k();
        field_40174_bI = (new BlockEndPortal(119, Material.field_4212_x)).func_237_c(-1F).func_232_b(6000000F);
        field_40167_bJ = (new BlockEndPortalFrame(120)).func_4026_a(field_9023_j).func_224_a(0.125F).func_237_c(-1F).func_20037_a("endPortalFrame").func_28027_k().func_232_b(6000000F);
        field_40168_bK = (new Block(121, 175, Material.field_523_d)).func_237_c(3F).func_232_b(15F).func_4026_a(field_9025_h).func_20037_a("whiteStone");
        field_41002_bK = (new BlockDragonEgg(122, 167)).func_237_c(3F).func_232_b(15F).func_4026_a(field_9025_h).func_224_a(0.125F).func_20037_a("dragonEgg");
        field_48130_bL = (new BlockRedstoneLight(123, false)).func_237_c(0.3F).func_4026_a(field_9023_j).func_20037_a("redstoneLight");
        field_48131_bM = (new BlockRedstoneLight(124, true)).func_237_c(0.3F).func_4026_a(field_9023_j).func_20037_a("redstoneLight");
        Item.field_176_c[field_616_ac.field_573_bc] = (new ItemCloth(field_616_ac.field_573_bc - 256)).func_20105_a("cloth");
        Item.field_176_c[field_582_K.field_573_bc] = (new ItemMetadata(field_582_K.field_573_bc - 256, field_582_K)).func_20105_a("log");
        Item.field_176_c[field_531_y.field_573_bc] = (new ItemMetadata(field_531_y.field_573_bc - 256, field_531_y)).func_20105_a("wood");
        Item.field_176_c[field_35052_bn.field_573_bc] = (new ItemMetadata(field_35052_bn.field_573_bc - 256, field_35052_bn)).func_20105_a("stonebricksmooth");
        Item.field_176_c[field_9039_Q.field_573_bc] = (new ItemMetadata(field_9039_Q.field_573_bc - 256, field_9039_Q)).func_20105_a("sandStone");
        Item.field_176_c[field_607_al.field_573_bc] = (new ItemSlab(field_607_al.field_573_bc - 256)).func_20105_a("stoneSlab");
        Item.field_176_c[field_6047_y.field_573_bc] = (new ItemSapling(field_6047_y.field_573_bc - 256)).func_20105_a("sapling");
        Item.field_176_c[field_581_L.field_573_bc] = (new ItemLeaves(field_581_L.field_573_bc - 256)).func_20105_a("leaves");
        Item.field_176_c[field_35045_bv.field_573_bc] = new ItemColored(field_35045_bv.field_573_bc - 256, false);
        Item.field_176_c[field_9031_X.field_573_bc] = (new ItemColored(field_9031_X.field_573_bc - 256, true)).func_41040_a(new String[] {
            "shrub", "grass", "fern"
        });
        Item.field_176_c[field_40165_bA.field_573_bc] = new ItemLilyPad(field_40165_bA.field_573_bc - 256);
        Item.field_176_c[field_9029_Z.field_573_bc] = new ItemPiston(field_9029_Z.field_573_bc - 256);
        Item.field_176_c[field_9033_V.field_573_bc] = new ItemPiston(field_9033_V.field_573_bc - 256);
        for(int i = 0; i < 256; i++)
        {
            if(field_542_n[i] == null)
            {
                continue;
            }
            if(Item.field_176_c[i] == null)
            {
                Item.field_176_c[i] = new ItemBlock(i - 256);
                field_542_n[i].func_28028_f();
            }
            boolean flag = false;
            if(i > 0 && field_542_n[i].func_40161_b() == 10)
            {
                flag = true;
            }
            if(i > 0 && (field_542_n[i] instanceof BlockStep))
            {
                flag = true;
            }
            if(i == field_643_aB.field_573_bc)
            {
                flag = true;
            }
            if(field_537_s[i])
            {
                flag = true;
            }
            field_40166_bL[i] = flag;
        }

        field_537_s[0] = true;
        StatList.func_25088_a();
    }
}
