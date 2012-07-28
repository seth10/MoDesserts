// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StatCollector, EnumAction, EntityPlayer, Vec3D, 
//            MathHelper, World, ItemSpade, EnumToolMaterial, 
//            ItemPickaxe, ItemAxe, ItemFlintAndSteel, ItemFood, 
//            ItemBow, ItemCoal, ItemSword, ItemSoup, 
//            PotionHelper, ItemHoe, ItemSeeds, Block, 
//            ItemArmor, EnumArmorMaterial, ItemPainting, ItemAppleGold, 
//            Potion, ItemSign, ItemDoor, Material, 
//            ItemBucket, ItemMinecart, ItemSaddle, ItemRedstone, 
//            ItemSnowball, ItemBoat, ItemBucketMilk, ItemReed, 
//            ItemEgg, ItemFishingRod, ItemDye, ItemBed, 
//            ItemMap, ItemShears, ItemEnderPearl, ItemPotion, 
//            ItemGlassBottle, ItemEnderEye, ItemMonsterPlacer, ItemExpBottle, 
//            ItemFireball, ItemRecord, StatList, ItemStack, 
//            EntityLiving, Entity, MovingObjectPosition

public class Item
{

    protected static Random field_4154_b = new Random();
    public static Item field_176_c[] = new Item[32000];
    public static Item field_4153_d;
    public static Item field_4152_e;
    public static Item field_4151_f;
    public static Item field_4150_g = (new ItemFlintAndSteel(3)).func_20104_a(5, 0).func_20105_a("flintAndSteel");
    public static Item field_171_h = (new ItemFood(4, 4, 0.3F, false)).func_20104_a(10, 0).func_20105_a("apple");
    public static Item field_4149_i = (new ItemBow(5)).func_20104_a(5, 1).func_20105_a("bow");
    public static Item field_4148_j = (new Item(6)).func_20104_a(5, 2).func_20105_a("arrow");
    public static Item field_168_k = (new ItemCoal(7)).func_20104_a(7, 0).func_20105_a("coal");
    public static Item field_167_l = (new Item(8)).func_20104_a(7, 3).func_20105_a("emerald");
    public static Item field_166_m = (new Item(9)).func_20104_a(7, 1).func_20105_a("ingotIron");
    public static Item field_4147_n = (new Item(10)).func_20104_a(7, 2).func_20105_a("ingotGold");
    public static Item field_4146_o;
    public static Item field_4145_p;
    public static Item field_4144_q;
    public static Item field_4143_r;
    public static Item field_4142_s;
    public static Item field_4141_t;
    public static Item field_4140_u;
    public static Item field_4139_v;
    public static Item field_4138_w;
    public static Item field_4137_x;
    public static Item field_4136_y;
    public static Item field_4135_z;
    public static Item field_4175_A;
    public static Item field_209_B = (new Item(24)).func_20104_a(5, 3).func_4050_c().func_20105_a("stick");
    public static Item field_4173_C = (new Item(25)).func_20104_a(7, 4).func_20105_a("bowl");
    public static Item field_4172_D = (new ItemSoup(26, 8)).func_20104_a(8, 4).func_20105_a("mushroomStew");
    public static Item field_4171_E;
    public static Item field_4169_F;
    public static Item field_4168_G;
    public static Item field_4167_H;
    public static Item field_196_I = (new Item(31)).func_20104_a(8, 0).func_20105_a("string");
    public static Item field_194_J = (new Item(32)).func_20104_a(8, 1).func_20105_a("feather");
    public static Item field_193_K;
    public static Item field_4166_L;
    public static Item field_4165_M;
    public static Item field_4164_N;
    public static Item field_4163_O;
    public static Item field_4162_P;
    public static Item field_187_Q;
    public static Item field_186_R = (new Item(40)).func_20104_a(9, 1).func_20105_a("wheat");
    public static Item field_185_S = (new ItemFood(41, 5, 0.6F, false)).func_20104_a(9, 2).func_20105_a("bread");
    public static Item field_4161_T;
    public static Item field_4160_U;
    public static Item field_4159_V;
    public static Item field_4158_W;
    public static Item field_4157_X;
    public static Item field_4156_Y;
    public static Item field_4155_Z;
    public static Item field_4189_aa;
    public static Item field_4188_ab;
    public static Item field_4187_ac;
    public static Item field_4186_ad;
    public static Item field_4185_ae;
    public static Item field_4184_af;
    public static Item field_4183_ag;
    public static Item field_4182_ah;
    public static Item field_4181_ai;
    public static Item field_4180_aj;
    public static Item field_4179_ak;
    public static Item field_4178_al;
    public static Item field_4177_am;
    public static Item field_216_an = (new Item(62)).func_20104_a(6, 0).func_20105_a("flint");
    public static Item field_215_ao = (new ItemFood(63, 3, 0.3F, true)).func_20104_a(7, 5).func_20105_a("porkchopRaw");
    public static Item field_4176_ap = (new ItemFood(64, 8, 0.8F, true)).func_20104_a(8, 5).func_20105_a("porkchopCooked");
    public static Item field_213_aq = (new ItemPainting(65)).func_20104_a(10, 1).func_20105_a("painting");
    public static Item field_212_ar;
    public static Item field_4174_as = (new ItemSign(67)).func_20104_a(10, 2).func_20105_a("sign");
    public static Item field_208_at;
    public static Item field_205_au;
    public static Item field_4170_av;
    public static Item field_201_aw;
    public static Item field_199_ax = (new ItemMinecart(72, 0)).func_20104_a(7, 8).func_20105_a("minecart");
    public static Item field_197_ay = (new ItemSaddle(73)).func_20104_a(8, 6).func_20105_a("saddle");
    public static Item field_195_az;
    public static Item field_252_aA;
    public static Item field_251_aB = (new ItemSnowball(76)).func_20104_a(14, 0).func_20105_a("snowball");
    public static Item field_4205_aC = (new ItemBoat(77)).func_20104_a(8, 8).func_20105_a("boat");
    public static Item field_249_aD = (new Item(78)).func_20104_a(7, 6).func_20105_a("leather");
    public static Item field_4204_aE;
    public static Item field_4203_aF = (new Item(80)).func_20104_a(6, 1).func_20105_a("brick");
    public static Item field_246_aG = (new Item(81)).func_20104_a(9, 3).func_20105_a("clay");
    public static Item field_4202_aH;
    public static Item field_4201_aI = (new Item(83)).func_20104_a(10, 3).func_20105_a("paper");
    public static Item field_4200_aJ = (new Item(84)).func_20104_a(11, 3).func_20105_a("book");
    public static Item field_242_aK = (new Item(85)).func_20104_a(14, 1).func_20105_a("slimeball");
    public static Item field_4199_aL = (new ItemMinecart(86, 1)).func_20104_a(7, 9).func_20105_a("minecartChest");
    public static Item field_4198_aM = (new ItemMinecart(87, 2)).func_20104_a(7, 10).func_20105_a("minecartFurnace");
    public static Item field_239_aN = (new ItemEgg(88)).func_20104_a(12, 0).func_20105_a("egg");
    public static Item field_4197_aO = (new Item(89)).func_20104_a(6, 3).func_20105_a("compass");
    public static Item field_4196_aP = (new ItemFishingRod(90)).func_20104_a(5, 4).func_20105_a("fishingRod");
    public static Item field_4195_aQ = (new Item(91)).func_20104_a(6, 4).func_20105_a("clock");
    public static Item field_4194_aR;
    public static Item field_4193_aS = (new ItemFood(93, 2, 0.3F, false)).func_20104_a(9, 5).func_20105_a("fishRaw");
    public static Item field_4192_aT = (new ItemFood(94, 5, 0.6F, false)).func_20104_a(10, 5).func_20105_a("fishCooked");
    public static Item field_21097_aU = (new ItemDye(95)).func_20104_a(14, 4).func_20105_a("dyePowder");
    public static Item field_21096_aV = (new Item(96)).func_20104_a(12, 1).func_20105_a("bone").func_4050_c();
    public static Item field_21095_aW;
    public static Item field_21098_aX;
    public static Item field_22008_aY = (new ItemBed(99)).func_21086_c(1).func_20104_a(13, 2).func_20105_a("bed");
    public static Item field_22007_aZ;
    public static Item field_25008_ba = (new ItemFood(101, 1, 0.1F, false)).func_20104_a(12, 5).func_20105_a("cookie");
    public static ItemMap field_28021_bb = (ItemMap)(new ItemMap(102)).func_20104_a(12, 3).func_20105_a("map");
    public static ItemShears field_31022_bc = (ItemShears)(new ItemShears(103)).func_20104_a(13, 5).func_20105_a("shears");
    public static Item field_35416_bd = (new ItemFood(104, 2, 0.3F, false)).func_20104_a(13, 6).func_20105_a("melon");
    public static Item field_35417_be;
    public static Item field_35412_bf;
    public static Item field_35413_bg = (new ItemFood(107, 3, 0.3F, true)).func_20104_a(9, 6).func_20105_a("beefRaw");
    public static Item field_35414_bh = (new ItemFood(108, 8, 0.8F, true)).func_20104_a(10, 6).func_20105_a("beefCooked");
    public static Item field_35415_bi;
    public static Item field_35409_bj = (new ItemFood(110, 6, 0.6F, true)).func_20104_a(10, 7).func_20105_a("chickenCooked");
    public static Item field_35410_bk;
    public static Item field_35411_bl = (new ItemEnderPearl(112)).func_20104_a(11, 6).func_20105_a("enderPearl");
    public static Item field_40239_bm = (new Item(113)).func_20104_a(12, 6).func_20105_a("blazeRod");
    public static Item field_40235_bn;
    public static Item field_40236_bo = (new Item(115)).func_20104_a(12, 7).func_20105_a("goldNugget");
    public static Item field_40237_bp;
    public static ItemPotion field_40238_bq = (ItemPotion)(new ItemPotion(117)).func_20104_a(13, 8).func_20105_a("potion");
    public static Item field_40232_br = (new ItemGlassBottle(118)).func_20104_a(12, 8).func_20105_a("glassBottle");
    public static Item field_40231_bs;
    public static Item field_40234_bt;
    public static Item field_40233_bu;
    public static Item field_40228_bv;
    public static Item field_40227_bw;
    public static Item field_40230_bx;
    public static Item field_40229_by = (new ItemEnderEye(125)).func_20104_a(11, 9).func_20105_a("eyeOfEnder");
    public static Item field_40226_bz;
    public static Item field_44008_bB = (new ItemMonsterPlacer(127)).func_20104_a(9, 9).func_20105_a("monsterPlacer");
    public static Item field_48389_bC = (new ItemExpBottle(128)).func_20104_a(11, 10).func_20105_a("expBottle");
    public static Item field_48388_bD = (new ItemFireball(129)).func_20104_a(14, 2).func_20105_a("fireball");
    public static Item field_236_aQ = (new ItemRecord(2000, "13")).func_20104_a(0, 15).func_20105_a("record");
    public static Item field_4191_aV = (new ItemRecord(2001, "cat")).func_20104_a(1, 15).func_20105_a("record");
    public static Item field_40244_bC = (new ItemRecord(2002, "blocks")).func_20104_a(2, 15).func_20105_a("record");
    public static Item field_40242_bD = (new ItemRecord(2003, "chirp")).func_20104_a(3, 15).func_20105_a("record");
    public static Item field_40243_bE = (new ItemRecord(2004, "far")).func_20104_a(4, 15).func_20105_a("record");
    public static Item field_40247_bF = (new ItemRecord(2005, "mall")).func_20104_a(5, 15).func_20105_a("record");
    public static Item field_40248_bG = (new ItemRecord(2006, "mellohi")).func_20104_a(6, 15).func_20105_a("record");
    public static Item field_40245_bH = (new ItemRecord(2007, "stal")).func_20104_a(7, 15).func_20105_a("record");
    public static Item field_40246_bI = (new ItemRecord(2008, "strad")).func_20104_a(8, 15).func_20105_a("record");
    public static Item field_40240_bJ = (new ItemRecord(2009, "ward")).func_20104_a(9, 15).func_20105_a("record");
    public static Item field_40241_bK = (new ItemRecord(2010, "11")).func_20104_a(10, 15).func_20105_a("record");
    public final int field_234_aS;
    protected int field_233_aT;
    private int field_232_aU;
    protected int field_6153_aZ;
    protected boolean field_230_aW;
    protected boolean field_21094_bf;
    private Item field_20900_a;
    private String field_39006_bR;
    private String field_275_a;

    protected Item(int p_i169_1_)
    {
        field_233_aT = 64;
        field_232_aU = 0;
        field_230_aW = false;
        field_21094_bf = false;
        field_20900_a = null;
        field_39006_bR = null;
        field_234_aS = 256 + p_i169_1_;
        if(field_176_c[256 + p_i169_1_] != null)
        {
            System.out.println((new StringBuilder()).append("CONFLICT @ ").append(p_i169_1_).toString());
        }
        field_176_c[256 + p_i169_1_] = this;
    }

    public Item func_4049_a(int p_4049_1_)
    {
        field_6153_aZ = p_4049_1_;
        return this;
    }

    public Item func_21086_c(int p_21086_1_)
    {
        field_233_aT = p_21086_1_;
        return this;
    }

    public Item func_20104_a(int p_20104_1_, int p_20104_2_)
    {
        field_6153_aZ = p_20104_1_ + p_20104_2_ * 16;
        return this;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int i, int j, int k, int l)
    {
        return false;
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        return 1.0F;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        return p_6152_1_;
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        return p_35405_1_;
    }

    public int func_81_a()
    {
        return field_233_aT;
    }

    public int func_21089_a(int p_21089_1_)
    {
        return 0;
    }

    public boolean func_21092_c()
    {
        return field_21094_bf;
    }

    protected Item func_21091_a(boolean p_21091_1_)
    {
        field_21094_bf = p_21091_1_;
        return this;
    }

    public int func_77_b()
    {
        return field_232_aU;
    }

    protected Item func_21090_d(int p_21090_1_)
    {
        field_232_aU = p_21090_1_;
        return this;
    }

    public boolean func_25005_e()
    {
        return field_232_aU > 0 && !field_21094_bf;
    }

    public boolean func_9201_a(ItemStack p_9201_1_, EntityLiving p_9201_2_, EntityLiving p_9201_3_)
    {
        return false;
    }

    public boolean func_25007_a(ItemStack p_25007_1_, int p_25007_2_, int p_25007_3_, int i, int j, EntityLiving entityliving)
    {
        return false;
    }

    public int func_9203_a(Entity p_9203_1_)
    {
        return 1;
    }

    public boolean func_80_a(Block p_80_1_)
    {
        return false;
    }

    public void func_9202_b(ItemStack itemstack, EntityLiving entityliving)
    {
    }

    public Item func_4050_c()
    {
        field_230_aW = true;
        return this;
    }

    public Item func_20105_a(String p_20105_1_)
    {
        field_275_a = (new StringBuilder()).append("item.").append(p_20105_1_).toString();
        return this;
    }

    public String func_20106_a()
    {
        return field_275_a;
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        return field_275_a;
    }

    public Item func_21093_a(Item p_21093_1_)
    {
        field_20900_a = p_21093_1_;
        return this;
    }

    public boolean func_46004_e(ItemStack p_46004_1_)
    {
        return true;
    }

    public boolean func_46003_i()
    {
        return false;
    }

    public Item func_21087_f()
    {
        return field_20900_a;
    }

    public boolean func_21088_g()
    {
        return field_20900_a != null;
    }

    public String func_25006_i()
    {
        return StatCollector.func_25136_a((new StringBuilder()).append(func_20106_a()).append(".name").toString());
    }

    public void func_28018_a(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
    }

    public void func_28020_c(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    }

    public boolean func_28019_b()
    {
        return false;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.none;
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 0;
    }

    public void func_35408_a(ItemStack itemstack, World world, EntityPlayer entityplayer, int i)
    {
    }

    protected Item func_40223_b(String p_40223_1_)
    {
        field_39006_bR = p_40223_1_;
        return this;
    }

    public String func_40221_l()
    {
        return field_39006_bR;
    }

    public boolean func_40220_m()
    {
        return field_39006_bR != null;
    }

    public boolean func_40222_e(ItemStack p_40222_1_)
    {
        return func_81_a() == 1 && func_25005_e();
    }

    protected MovingObjectPosition func_40225_a(World p_40225_1_, EntityPlayer p_40225_2_, boolean p_40225_3_)
    {
        float f = 1.0F;
        float f1 = p_40225_2_.field_9088_y + (p_40225_2_.field_315_s - p_40225_2_.field_9088_y) * f;
        float f2 = p_40225_2_.field_9089_x + (p_40225_2_.field_316_r - p_40225_2_.field_9089_x) * f;
        double d = p_40225_2_.field_9092_m + (p_40225_2_.field_322_l - p_40225_2_.field_9092_m) * (double)f;
        double d1 = (p_40225_2_.field_9091_n + (p_40225_2_.field_321_m - p_40225_2_.field_9091_n) * (double)f + 1.6200000000000001D) - (double)p_40225_2_.field_9076_H;
        double d2 = p_40225_2_.field_9090_o + (p_40225_2_.field_320_n - p_40225_2_.field_9090_o) * (double)f;
        Vec3D vec3d = Vec3D.func_768_b(d, d1, d2);
        float f3 = MathHelper.func_582_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.func_585_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.func_582_b(-f1 * 0.01745329F);
        float f6 = MathHelper.func_585_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3D vec3d1 = vec3d.func_757_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = p_40225_1_.func_28099_a(vec3d, vec3d1, p_40225_3_, !p_40225_3_);
        return movingobjectposition;
    }

    public int func_40224_c()
    {
        return 0;
    }

    static 
    {
        field_4153_d = (new ItemSpade(0, EnumToolMaterial.IRON)).func_20104_a(2, 5).func_20105_a("shovelIron");
        field_4152_e = (new ItemPickaxe(1, EnumToolMaterial.IRON)).func_20104_a(2, 6).func_20105_a("pickaxeIron");
        field_4151_f = (new ItemAxe(2, EnumToolMaterial.IRON)).func_20104_a(2, 7).func_20105_a("hatchetIron");
        field_4146_o = (new ItemSword(11, EnumToolMaterial.IRON)).func_20104_a(2, 4).func_20105_a("swordIron");
        field_4145_p = (new ItemSword(12, EnumToolMaterial.WOOD)).func_20104_a(0, 4).func_20105_a("swordWood");
        field_4144_q = (new ItemSpade(13, EnumToolMaterial.WOOD)).func_20104_a(0, 5).func_20105_a("shovelWood");
        field_4143_r = (new ItemPickaxe(14, EnumToolMaterial.WOOD)).func_20104_a(0, 6).func_20105_a("pickaxeWood");
        field_4142_s = (new ItemAxe(15, EnumToolMaterial.WOOD)).func_20104_a(0, 7).func_20105_a("hatchetWood");
        field_4141_t = (new ItemSword(16, EnumToolMaterial.STONE)).func_20104_a(1, 4).func_20105_a("swordStone");
        field_4140_u = (new ItemSpade(17, EnumToolMaterial.STONE)).func_20104_a(1, 5).func_20105_a("shovelStone");
        field_4139_v = (new ItemPickaxe(18, EnumToolMaterial.STONE)).func_20104_a(1, 6).func_20105_a("pickaxeStone");
        field_4138_w = (new ItemAxe(19, EnumToolMaterial.STONE)).func_20104_a(1, 7).func_20105_a("hatchetStone");
        field_4137_x = (new ItemSword(20, EnumToolMaterial.EMERALD)).func_20104_a(3, 4).func_20105_a("swordDiamond");
        field_4136_y = (new ItemSpade(21, EnumToolMaterial.EMERALD)).func_20104_a(3, 5).func_20105_a("shovelDiamond");
        field_4135_z = (new ItemPickaxe(22, EnumToolMaterial.EMERALD)).func_20104_a(3, 6).func_20105_a("pickaxeDiamond");
        field_4175_A = (new ItemAxe(23, EnumToolMaterial.EMERALD)).func_20104_a(3, 7).func_20105_a("hatchetDiamond");
        field_4171_E = (new ItemSword(27, EnumToolMaterial.GOLD)).func_20104_a(4, 4).func_20105_a("swordGold");
        field_4169_F = (new ItemSpade(28, EnumToolMaterial.GOLD)).func_20104_a(4, 5).func_20105_a("shovelGold");
        field_4168_G = (new ItemPickaxe(29, EnumToolMaterial.GOLD)).func_20104_a(4, 6).func_20105_a("pickaxeGold");
        field_4167_H = (new ItemAxe(30, EnumToolMaterial.GOLD)).func_20104_a(4, 7).func_20105_a("hatchetGold");
        field_193_K = (new Item(33)).func_20104_a(8, 2).func_20105_a("sulphur").func_40223_b(PotionHelper.field_40568_k);
        field_4166_L = (new ItemHoe(34, EnumToolMaterial.WOOD)).func_20104_a(0, 8).func_20105_a("hoeWood");
        field_4165_M = (new ItemHoe(35, EnumToolMaterial.STONE)).func_20104_a(1, 8).func_20105_a("hoeStone");
        field_4164_N = (new ItemHoe(36, EnumToolMaterial.IRON)).func_20104_a(2, 8).func_20105_a("hoeIron");
        field_4163_O = (new ItemHoe(37, EnumToolMaterial.EMERALD)).func_20104_a(3, 8).func_20105_a("hoeDiamond");
        field_4162_P = (new ItemHoe(38, EnumToolMaterial.GOLD)).func_20104_a(4, 8).func_20105_a("hoeGold");
        field_187_Q = (new ItemSeeds(39, Block.field_644_aA.field_573_bc, Block.field_643_aB.field_573_bc)).func_20104_a(9, 0).func_20105_a("seeds");
        field_4161_T = (new ItemArmor(42, EnumArmorMaterial.CLOTH, 0, 0)).func_20104_a(0, 0).func_20105_a("helmetCloth");
        field_4160_U = (new ItemArmor(43, EnumArmorMaterial.CLOTH, 0, 1)).func_20104_a(0, 1).func_20105_a("chestplateCloth");
        field_4159_V = (new ItemArmor(44, EnumArmorMaterial.CLOTH, 0, 2)).func_20104_a(0, 2).func_20105_a("leggingsCloth");
        field_4158_W = (new ItemArmor(45, EnumArmorMaterial.CLOTH, 0, 3)).func_20104_a(0, 3).func_20105_a("bootsCloth");
        field_4157_X = (new ItemArmor(46, EnumArmorMaterial.CHAIN, 1, 0)).func_20104_a(1, 0).func_20105_a("helmetChain");
        field_4156_Y = (new ItemArmor(47, EnumArmorMaterial.CHAIN, 1, 1)).func_20104_a(1, 1).func_20105_a("chestplateChain");
        field_4155_Z = (new ItemArmor(48, EnumArmorMaterial.CHAIN, 1, 2)).func_20104_a(1, 2).func_20105_a("leggingsChain");
        field_4189_aa = (new ItemArmor(49, EnumArmorMaterial.CHAIN, 1, 3)).func_20104_a(1, 3).func_20105_a("bootsChain");
        field_4188_ab = (new ItemArmor(50, EnumArmorMaterial.IRON, 2, 0)).func_20104_a(2, 0).func_20105_a("helmetIron");
        field_4187_ac = (new ItemArmor(51, EnumArmorMaterial.IRON, 2, 1)).func_20104_a(2, 1).func_20105_a("chestplateIron");
        field_4186_ad = (new ItemArmor(52, EnumArmorMaterial.IRON, 2, 2)).func_20104_a(2, 2).func_20105_a("leggingsIron");
        field_4185_ae = (new ItemArmor(53, EnumArmorMaterial.IRON, 2, 3)).func_20104_a(2, 3).func_20105_a("bootsIron");
        field_4184_af = (new ItemArmor(54, EnumArmorMaterial.DIAMOND, 3, 0)).func_20104_a(3, 0).func_20105_a("helmetDiamond");
        field_4183_ag = (new ItemArmor(55, EnumArmorMaterial.DIAMOND, 3, 1)).func_20104_a(3, 1).func_20105_a("chestplateDiamond");
        field_4182_ah = (new ItemArmor(56, EnumArmorMaterial.DIAMOND, 3, 2)).func_20104_a(3, 2).func_20105_a("leggingsDiamond");
        field_4181_ai = (new ItemArmor(57, EnumArmorMaterial.DIAMOND, 3, 3)).func_20104_a(3, 3).func_20105_a("bootsDiamond");
        field_4180_aj = (new ItemArmor(58, EnumArmorMaterial.GOLD, 4, 0)).func_20104_a(4, 0).func_20105_a("helmetGold");
        field_4179_ak = (new ItemArmor(59, EnumArmorMaterial.GOLD, 4, 1)).func_20104_a(4, 1).func_20105_a("chestplateGold");
        field_4178_al = (new ItemArmor(60, EnumArmorMaterial.GOLD, 4, 2)).func_20104_a(4, 2).func_20105_a("leggingsGold");
        field_4177_am = (new ItemArmor(61, EnumArmorMaterial.GOLD, 4, 3)).func_20104_a(4, 3).func_20105_a("bootsGold");
        field_212_ar = (new ItemAppleGold(66, 4, 1.2F, false)).func_35423_n().func_35422_a(Potion.field_35458_l.field_35447_H, 5, 0, 1.0F).func_20104_a(11, 0).func_20105_a("appleGold");
        field_208_at = (new ItemDoor(68, Material.field_524_c)).func_20104_a(11, 2).func_20105_a("doorWood");
        field_205_au = (new ItemBucket(69, 0)).func_20104_a(10, 4).func_20105_a("bucket");
        field_4170_av = (new ItemBucket(70, Block.field_598_B.field_573_bc)).func_20104_a(11, 4).func_20105_a("bucketWater").func_21093_a(field_205_au);
        field_201_aw = (new ItemBucket(71, Block.field_594_D.field_573_bc)).func_20104_a(12, 4).func_20105_a("bucketLava").func_21093_a(field_205_au);
        field_195_az = (new ItemDoor(74, Material.field_522_e)).func_20104_a(12, 2).func_20105_a("doorIron");
        field_252_aA = (new ItemRedstone(75)).func_20104_a(8, 3).func_20105_a("redstone").func_40223_b(PotionHelper.field_40570_i);
        field_4204_aE = (new ItemBucketMilk(79)).func_20104_a(13, 4).func_20105_a("milk").func_21093_a(field_205_au);
        field_4202_aH = (new ItemReed(82, Block.field_620_aY)).func_20104_a(11, 1).func_20105_a("reeds");
        field_4194_aR = (new Item(92)).func_20104_a(9, 4).func_20105_a("yellowDust").func_40223_b(PotionHelper.field_40567_j);
        field_21095_aW = (new Item(97)).func_20104_a(13, 0).func_20105_a("sugar").func_40223_b(PotionHelper.field_40560_b);
        field_21098_aX = (new ItemReed(98, Block.field_21026_bg)).func_21086_c(1).func_20104_a(13, 1).func_20105_a("cake");
        field_22007_aZ = (new ItemReed(100, Block.field_22011_bh)).func_20104_a(6, 5).func_20105_a("diode");
        field_35417_be = (new ItemSeeds(105, Block.field_35051_bt.field_573_bc, Block.field_643_aB.field_573_bc)).func_20104_a(13, 3).func_20105_a("seeds_pumpkin");
        field_35412_bf = (new ItemSeeds(106, Block.field_35050_bu.field_573_bc, Block.field_643_aB.field_573_bc)).func_20104_a(14, 3).func_20105_a("seeds_melon");
        field_35415_bi = (new ItemFood(109, 2, 0.3F, true)).func_35422_a(Potion.field_35468_s.field_35447_H, 30, 0, 0.3F).func_20104_a(9, 7).func_20105_a("chickenRaw");
        field_35410_bk = (new ItemFood(111, 4, 0.1F, true)).func_35422_a(Potion.field_35468_s.field_35447_H, 30, 0, 0.8F).func_20104_a(11, 5).func_20105_a("rottenFlesh");
        field_40235_bn = (new Item(114)).func_20104_a(11, 7).func_20105_a("ghastTear").func_40223_b(PotionHelper.field_40561_c);
        field_40237_bp = (new ItemSeeds(116, Block.field_40170_bE.field_573_bc, Block.field_4048_bd.field_573_bc)).func_20104_a(13, 7).func_20105_a("netherStalkSeeds").func_40223_b("+4");
        field_40231_bs = (new ItemFood(119, 2, 0.8F, false)).func_35422_a(Potion.field_35466_u.field_35447_H, 5, 0, 1.0F).func_20104_a(11, 8).func_20105_a("spiderEye").func_40223_b(PotionHelper.field_40558_d);
        field_40234_bt = (new Item(120)).func_20104_a(10, 8).func_20105_a("fermentedSpiderEye").func_40223_b(PotionHelper.field_40559_e);
        field_40233_bu = (new Item(121)).func_20104_a(13, 9).func_20105_a("blazePowder").func_40223_b(PotionHelper.field_40557_g);
        field_40228_bv = (new Item(122)).func_20104_a(13, 10).func_20105_a("magmaCream").func_40223_b(PotionHelper.field_40569_h);
        field_40227_bw = (new ItemReed(123, Block.field_40176_bG)).func_20104_a(12, 10).func_20105_a("brewingStand");
        field_40230_bx = (new ItemReed(124, Block.field_40173_bH)).func_20104_a(12, 9).func_20105_a("cauldron");
        field_40226_bz = (new Item(126)).func_20104_a(9, 8).func_20105_a("speckledMelon").func_40223_b(PotionHelper.field_40556_f);
        StatList.func_25086_b();
    }
}
