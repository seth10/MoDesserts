// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Block, BlockGrass, WorldGenTrees, WorldGenBigTree, 
//            WorldGenForest, WorldGenSwamp, SpawnListEntry, EntitySheep, 
//            EntityPig, EntityChicken, EntityCow, EntitySpider, 
//            EntityZombie, EntitySkeleton, EntityCreeper, EntitySlime, 
//            EntityEnderman, EntitySquid, BiomeDecorator, WorldGenTallGrass, 
//            BlockTallGrass, EnumCreatureType, BiomeGenOcean, BiomeGenPlains, 
//            BiomeGenDesert, BiomeGenHills, BiomeGenForest, BiomeGenTaiga, 
//            BiomeGenSwamp, BiomeGenRiver, BiomeGenHell, BiomeGenEnd, 
//            BiomeGenSnow, BiomeGenMushroomIsland, BiomeGenBeach, BiomeGenJungle, 
//            WorldGenerator, World

public abstract class BiomeGenBase
{

    public static final BiomeGenBase field_35521_a[] = new BiomeGenBase[256];
    public static final BiomeGenBase field_35519_b = (new BiomeGenOcean(0)).func_4079_b(112).func_4082_a("Ocean").func_35511_b(-1F, 0.4F);
    public static final BiomeGenBase field_35520_c = (new BiomeGenPlains(1)).func_4079_b(0x8db360).func_4082_a("Plains").func_35512_a(0.8F, 0.4F);
    public static final BiomeGenBase field_4293_h = (new BiomeGenDesert(2)).func_4079_b(0xfa9418).func_4082_a("Desert").func_27047_e().func_35512_a(2.0F, 0.0F).func_35511_b(0.1F, 0.2F);
    public static final BiomeGenBase field_35518_e = (new BiomeGenHills(3)).func_4079_b(0x606060).func_4082_a("Extreme Hills").func_35511_b(0.2F, 1.3F).func_35512_a(0.2F, 0.3F);
    public static final BiomeGenBase field_4297_d = (new BiomeGenForest(4)).func_4079_b(0x56621).func_4082_a("Forest").func_4080_a(0x4eba31).func_35512_a(0.7F, 0.8F);
    public static final BiomeGenBase field_4294_g = (new BiomeGenTaiga(5)).func_4079_b(0xb6659).func_4082_a("Taiga").func_4080_a(0x4eba31).func_50024_b().func_35512_a(0.05F, 0.8F).func_35511_b(0.1F, 0.4F);
    public static final BiomeGenBase field_4299_b = (new BiomeGenSwamp(6)).func_4079_b(0x7f9b2).func_4082_a("Swampland").func_4080_a(0x8baf48).func_35511_b(-0.2F, 0.1F).func_35512_a(0.8F, 0.9F);
    public static final BiomeGenBase field_35522_i = (new BiomeGenRiver(7)).func_4079_b(255).func_4082_a("River").func_35511_b(-0.5F, 0.0F);
    public static final BiomeGenBase field_4289_l = (new BiomeGenHell(8)).func_4079_b(0xff0000).func_4082_a("Hell").func_27047_e().func_35512_a(2.0F, 0.0F);
    public static final BiomeGenBase field_28054_m = (new BiomeGenEnd(9)).func_4079_b(0x8080ff).func_4082_a("Sky").func_27047_e();
    public static final BiomeGenBase field_40464_l = (new BiomeGenOcean(10)).func_4079_b(0x9090a0).func_4082_a("FrozenOcean").func_50024_b().func_35511_b(-1F, 0.5F).func_35512_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40465_m = (new BiomeGenRiver(11)).func_4079_b(0xa0a0ff).func_4082_a("FrozenRiver").func_50024_b().func_35511_b(-0.5F, 0.0F).func_35512_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40462_n = (new BiomeGenSnow(12)).func_4079_b(0xffffff).func_4082_a("Ice Plains").func_50024_b().func_35512_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40463_o = (new BiomeGenSnow(13)).func_4079_b(0xa0a0a0).func_4082_a("Ice Mountains").func_50024_b().func_35511_b(0.2F, 1.2F).func_35512_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40467_p = (new BiomeGenMushroomIsland(14)).func_4079_b(0xff00ff).func_4082_a("MushroomIsland").func_35512_a(0.9F, 1.0F).func_35511_b(0.2F, 1.0F);
    public static final BiomeGenBase field_40466_q = (new BiomeGenMushroomIsland(15)).func_4079_b(0xa000ff).func_4082_a("MushroomIslandShore").func_35512_a(0.9F, 1.0F).func_35511_b(-1F, 0.1F);
    public static final BiomeGenBase field_46084_r = (new BiomeGenBeach(16)).func_4079_b(0xfade55).func_4082_a("Beach").func_35512_a(0.8F, 0.4F).func_35511_b(0.0F, 0.1F);
    public static final BiomeGenBase field_46083_s = (new BiomeGenDesert(17)).func_4079_b(0xd25f12).func_4082_a("DesertHills").func_27047_e().func_35512_a(2.0F, 0.0F).func_35511_b(0.2F, 0.7F);
    public static final BiomeGenBase field_46082_t = (new BiomeGenForest(18)).func_4079_b(0x22551c).func_4082_a("ForestHills").func_4080_a(0x4eba31).func_35512_a(0.7F, 0.8F).func_35511_b(0.2F, 0.6F);
    public static final BiomeGenBase field_46081_u = (new BiomeGenTaiga(19)).func_4079_b(0x163933).func_4082_a("TaigaHills").func_50024_b().func_4080_a(0x4eba31).func_35512_a(0.05F, 0.8F).func_35511_b(0.2F, 0.7F);
    public static final BiomeGenBase field_46080_v = (new BiomeGenHills(20)).func_4079_b(0x72789a).func_4082_a("Extreme Hills Edge").func_35511_b(0.2F, 0.8F).func_35512_a(0.2F, 0.3F);
    public static final BiomeGenBase field_48443_w = (new BiomeGenJungle(21)).func_4079_b(0x537b09).func_4082_a("Jungle").func_4080_a(0x537b09).func_35512_a(1.2F, 0.9F).func_35511_b(0.2F, 0.4F);
    public static final BiomeGenBase field_48444_x = (new BiomeGenJungle(22)).func_4079_b(0x2c4205).func_4082_a("JungleHills").func_4080_a(0x537b09).func_35512_a(1.2F, 0.9F).func_35511_b(1.8F, 0.2F);
    public String field_6163_m;
    public int field_6162_n;
    public byte field_4286_o;
    public byte field_4285_p;
    public int field_6161_q;
    public float field_35527_q;
    public float field_35526_r;
    public float field_35525_s;
    public float field_35524_t;
    public int field_40461_A;
    public BiomeDecorator field_35523_u;
    protected List field_25058_r;
    protected List field_25057_s;
    protected List field_25056_t;
    private boolean field_27051_u;
    private boolean field_27050_v;
    public final int field_35529_y;
    protected WorldGenTrees field_35528_z;
    protected WorldGenBigTree field_35515_A;
    protected WorldGenForest field_35516_B;
    protected WorldGenSwamp field_35517_C;

    protected BiomeGenBase(int p_i246_1_)
    {
        field_4286_o = (byte)Block.field_534_v.field_573_bc;
        field_4285_p = (byte)Block.field_533_w.field_573_bc;
        field_6161_q = 0x4ee031;
        field_35527_q = 0.1F;
        field_35526_r = 0.3F;
        field_35525_s = 0.5F;
        field_35524_t = 0.5F;
        field_40461_A = 0xffffff;
        field_25058_r = new ArrayList();
        field_25057_s = new ArrayList();
        field_25056_t = new ArrayList();
        field_27050_v = true;
        field_35528_z = new WorldGenTrees(false);
        field_35515_A = new WorldGenBigTree(false);
        field_35516_B = new WorldGenForest(false);
        field_35517_C = new WorldGenSwamp();
        field_35529_y = p_i246_1_;
        field_35521_a[p_i246_1_] = this;
        field_35523_u = func_35514_a();
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntitySheep.class, 12, 4, 4));
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityPig.class, 10, 4, 4));
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityChicken.class, 10, 4, 4));
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityCow.class, 8, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntitySpider.class, 10, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntityZombie.class, 10, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntitySkeleton.class, 10, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntityCreeper.class, 10, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntitySlime.class, 10, 4, 4));
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntityEnderman.class, 1, 1, 4));
        field_25056_t.add(new SpawnListEntry(net.minecraft.src.EntitySquid.class, 10, 4, 4));
    }

    protected BiomeDecorator func_35514_a()
    {
        return new BiomeDecorator(this);
    }

    private BiomeGenBase func_35512_a(float p_35512_1_, float p_35512_2_)
    {
        if(p_35512_1_ > 0.1F && p_35512_1_ < 0.2F)
        {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        } else
        {
            field_35525_s = p_35512_1_;
            field_35524_t = p_35512_2_;
            return this;
        }
    }

    private BiomeGenBase func_35511_b(float p_35511_1_, float p_35511_2_)
    {
        field_35527_q = p_35511_1_;
        field_35526_r = p_35511_2_;
        return this;
    }

    private BiomeGenBase func_27047_e()
    {
        field_27050_v = false;
        return this;
    }

    public WorldGenerator func_21114_a(Random p_21114_1_)
    {
        if(p_21114_1_.nextInt(10) == 0)
        {
            return field_35515_A;
        } else
        {
            return field_35528_z;
        }
    }

    public WorldGenerator func_48440_b(Random p_48440_1_)
    {
        return new WorldGenTallGrass(Block.field_9031_X.field_573_bc, 1);
    }

    protected BiomeGenBase func_50024_b()
    {
        field_27051_u = true;
        return this;
    }

    protected BiomeGenBase func_4082_a(String p_4082_1_)
    {
        field_6163_m = p_4082_1_;
        return this;
    }

    protected BiomeGenBase func_4080_a(int p_4080_1_)
    {
        field_6161_q = p_4080_1_;
        return this;
    }

    protected BiomeGenBase func_4079_b(int p_4079_1_)
    {
        field_6162_n = p_4079_1_;
        return this;
    }

    public List func_25055_a(EnumCreatureType p_25055_1_)
    {
        if(p_25055_1_ == EnumCreatureType.monster)
        {
            return field_25058_r;
        }
        if(p_25055_1_ == EnumCreatureType.creature)
        {
            return field_25057_s;
        }
        if(p_25055_1_ == EnumCreatureType.waterCreature)
        {
            return field_25056_t;
        } else
        {
            return null;
        }
    }

    public boolean func_27049_c()
    {
        return field_27051_u;
    }

    public boolean func_27048_d()
    {
        if(field_27051_u)
        {
            return false;
        } else
        {
            return field_27050_v;
        }
    }

    public boolean func_48441_d()
    {
        return field_35524_t > 0.85F;
    }

    public float func_4078_a()
    {
        return 0.1F;
    }

    public final int func_35510_e()
    {
        return (int)(field_35524_t * 65536F);
    }

    public final int func_35509_f()
    {
        return (int)(field_35525_s * 65536F);
    }

    public final float func_48442_h()
    {
        return field_35525_s;
    }

    public void func_35513_a(World p_35513_1_, Random p_35513_2_, int p_35513_3_, int p_35513_4_)
    {
        field_35523_u.func_35255_a(p_35513_1_, p_35513_2_, p_35513_3_, p_35513_4_);
    }

}
