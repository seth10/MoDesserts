// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ExtendedBlockStorage, World, WorldProvider, Profiler, 
//            EnumSkyBlock, Block, BlockContainer, TileEntity, 
//            Entity, MathHelper, ChunkPosition, AxisAlignedBB, 
//            IChunkProvider, Material, ChunkCoordIntPair, WorldChunkManager, 
//            BiomeGenBase

public class Chunk
{

    public static boolean field_694_a;
    private ExtendedBlockStorage field_48566_p[];
    private byte field_48565_q[];
    public int field_35637_c[];
    public boolean field_35636_d[];
    public boolean field_692_c;
    public World field_691_d;
    public int field_48562_f[];
    public final int field_685_j;
    public final int field_684_k;
    private boolean field_40544_v;
    public Map field_683_l;
    public List field_48563_j[];
    public boolean field_681_n;
    public boolean field_680_o;
    public boolean field_677_r;
    public long field_676_s;
    public boolean field_50025_o;
    private int field_48564_s;
    boolean field_35638_u;

    public Chunk(World p_i272_1_, int p_i272_2_, int p_i272_3_)
    {
        field_48566_p = new ExtendedBlockStorage[16];
        field_48565_q = new byte[256];
        field_35637_c = new int[256];
        field_35636_d = new boolean[256];
        field_40544_v = false;
        field_683_l = new HashMap();
        field_681_n = false;
        field_680_o = false;
        field_677_r = false;
        field_676_s = 0L;
        field_50025_o = false;
        field_48564_s = 4096;
        field_35638_u = false;
        field_48563_j = new List[16];
        field_691_d = p_i272_1_;
        field_685_j = p_i272_2_;
        field_684_k = p_i272_3_;
        field_48562_f = new int[256];
        for(int i = 0; i < field_48563_j.length; i++)
        {
            field_48563_j[i] = new ArrayList();
        }

        Arrays.fill(field_35637_c, -999);
        Arrays.fill(field_48565_q, (byte)-1);
    }

    public Chunk(World p_i273_1_, byte p_i273_2_[], int p_i273_3_, int p_i273_4_)
    {
        this(p_i273_1_, p_i273_3_, p_i273_4_);
        int i = p_i273_2_.length / 256;
        for(int j = 0; j < 16; j++)
        {
            for(int k = 0; k < 16; k++)
            {
                for(int l = 0; l < i; l++)
                {
                    byte byte0 = p_i273_2_[j << 11 | k << 7 | l];
                    if(byte0 == 0)
                    {
                        continue;
                    }
                    int i1 = l >> 4;
                    if(field_48566_p[i1] == null)
                    {
                        field_48566_p[i1] = new ExtendedBlockStorage(i1 << 4);
                    }
                    field_48566_p[i1].func_48588_a(j, l & 0xf, k, byte0);
                }

            }

        }

    }

    public boolean func_351_a(int p_351_1_, int p_351_2_)
    {
        return p_351_1_ == field_685_j && p_351_2_ == field_684_k;
    }

    public int func_337_b(int p_337_1_, int p_337_2_)
    {
        return field_48562_f[p_337_2_ << 4 | p_337_1_];
    }

    public int func_48561_g()
    {
        for(int i = field_48566_p.length - 1; i >= 0; i--)
        {
            if(field_48566_p[i] != null)
            {
                return field_48566_p[i].func_48597_c();
            }
        }

        return 0;
    }

    public ExtendedBlockStorage[] func_48553_h()
    {
        return field_48566_p;
    }

    public void func_353_b()
    {
        int i = func_48561_g();
        for(int j = 0; j < 16; j++)
        {
            for(int l = 0; l < 16; l++)
            {
                field_35637_c[j + (l << 4)] = -999;
                int j1 = (i + 16) - 1;
                do
                {
                    if(j1 <= 0)
                    {
                        break;
                    }
                    if(func_48555_b(j, j1 - 1, l) != 0)
                    {
                        field_48562_f[l << 4 | j] = j1;
                        break;
                    }
                    j1--;
                } while(true);
                if(field_691_d.field_4272_q.field_4306_c)
                {
                    continue;
                }
                j1 = 15;
                int k1 = (i + 16) - 1;
                do
                {
                    j1 -= func_48555_b(j, k1, l);
                    if(j1 > 0)
                    {
                        ExtendedBlockStorage extendedblockstorage = field_48566_p[k1 >> 4];
                        if(extendedblockstorage != null)
                        {
                            extendedblockstorage.func_48592_c(j, k1 & 0xf, l, j1);
                            field_691_d.func_48086_o((field_685_j << 4) + j, k1, (field_684_k << 4) + l);
                        }
                    }
                } while(--k1 > 0 && j1 > 0);
            }

        }

        field_680_o = true;
        for(int k = 0; k < 16; k++)
        {
            for(int i1 = 0; i1 < 16; i1++)
            {
                func_333_c(k, i1);
            }

        }

    }

    public void func_4053_c()
    {
    }

    private void func_333_c(int p_333_1_, int p_333_2_)
    {
        field_35636_d[p_333_1_ + p_333_2_ * 16] = true;
        field_40544_v = true;
    }

    private void func_35633_i()
    {
        Profiler.func_40518_a("recheckGaps");
        if(field_691_d.func_21118_a(field_685_j * 16 + 8, 0, field_684_k * 16 + 8, 16))
        {
            for(int i = 0; i < 16; i++)
            {
                for(int j = 0; j < 16; j++)
                {
                    if(!field_35636_d[i + j * 16])
                    {
                        continue;
                    }
                    field_35636_d[i + j * 16] = false;
                    int k = func_337_b(i, j);
                    int l = field_685_j * 16 + i;
                    int i1 = field_684_k * 16 + j;
                    int j1 = field_691_d.func_488_c(l - 1, i1);
                    int k1 = field_691_d.func_488_c(l + 1, i1);
                    int l1 = field_691_d.func_488_c(l, i1 - 1);
                    int i2 = field_691_d.func_488_c(l, i1 + 1);
                    if(k1 < j1)
                    {
                        j1 = k1;
                    }
                    if(l1 < j1)
                    {
                        j1 = l1;
                    }
                    if(i2 < j1)
                    {
                        j1 = i2;
                    }
                    func_355_f(l, i1, j1);
                    func_355_f(l - 1, i1, k);
                    func_355_f(l + 1, i1, k);
                    func_355_f(l, i1 - 1, k);
                    func_355_f(l, i1 + 1, k);
                }

            }

            field_40544_v = false;
        }
        Profiler.func_40517_a();
    }

    private void func_355_f(int p_355_1_, int p_355_2_, int p_355_3_)
    {
        int i = field_691_d.func_488_c(p_355_1_, p_355_2_);
        if(i > p_355_3_)
        {
            func_35634_d(p_355_1_, p_355_2_, p_355_3_, i + 1);
        } else
        if(i < p_355_3_)
        {
            func_35634_d(p_355_1_, p_355_2_, i, p_355_3_ + 1);
        }
    }

    private void func_35634_d(int p_35634_1_, int p_35634_2_, int p_35634_3_, int p_35634_4_)
    {
        if(p_35634_4_ > p_35634_3_ && field_691_d.func_21118_a(p_35634_1_, 0, p_35634_2_, 16))
        {
            for(int i = p_35634_3_; i < p_35634_4_; i++)
            {
                field_691_d.func_35243_b(EnumSkyBlock.Sky, p_35634_1_, i, p_35634_2_);
            }

            field_680_o = true;
        }
    }

    private void func_339_g(int p_339_1_, int p_339_2_, int p_339_3_)
    {
        int i = field_48562_f[p_339_3_ << 4 | p_339_1_] & 0xff;
        int j = i;
        if(p_339_2_ > i)
        {
            j = p_339_2_;
        }
        for(; j > 0 && func_48555_b(p_339_1_, j - 1, p_339_3_) == 0; j--) { }
        if(j == i)
        {
            return;
        }
        field_691_d.func_498_f(p_339_1_, p_339_3_, j, i);
        field_48562_f[p_339_3_ << 4 | p_339_1_] = j;
        int k = field_685_j * 16 + p_339_1_;
        int l = field_684_k * 16 + p_339_3_;
        if(!field_691_d.field_4272_q.field_4306_c)
        {
            if(j < i)
            {
                for(int i1 = j; i1 < i; i1++)
                {
                    ExtendedBlockStorage extendedblockstorage = field_48566_p[i1 >> 4];
                    if(extendedblockstorage != null)
                    {
                        extendedblockstorage.func_48592_c(p_339_1_, i1 & 0xf, p_339_3_, 15);
                        field_691_d.func_48086_o((field_685_j << 4) + p_339_1_, i1, (field_684_k << 4) + p_339_3_);
                    }
                }

            } else
            {
                for(int j1 = i; j1 < j; j1++)
                {
                    ExtendedBlockStorage extendedblockstorage1 = field_48566_p[j1 >> 4];
                    if(extendedblockstorage1 != null)
                    {
                        extendedblockstorage1.func_48592_c(p_339_1_, j1 & 0xf, p_339_3_, 0);
                        field_691_d.func_48086_o((field_685_j << 4) + p_339_1_, j1, (field_684_k << 4) + p_339_3_);
                    }
                }

            }
            int k1 = 15;
            do
            {
                if(j <= 0 || k1 <= 0)
                {
                    break;
                }
                j--;
                int i2 = func_48555_b(p_339_1_, j, p_339_3_);
                if(i2 == 0)
                {
                    i2 = 1;
                }
                k1 -= i2;
                if(k1 < 0)
                {
                    k1 = 0;
                }
                ExtendedBlockStorage extendedblockstorage2 = field_48566_p[j >> 4];
                if(extendedblockstorage2 != null)
                {
                    extendedblockstorage2.func_48592_c(p_339_1_, j & 0xf, p_339_3_, k1);
                }
            } while(true);
        }
        int l1 = field_48562_f[p_339_3_ << 4 | p_339_1_];
        int j2 = i;
        int k2 = l1;
        if(k2 < j2)
        {
            int l2 = j2;
            j2 = k2;
            k2 = l2;
        }
        if(!field_691_d.field_4272_q.field_4306_c)
        {
            func_35634_d(k - 1, l, j2, k2);
            func_35634_d(k + 1, l, j2, k2);
            func_35634_d(k, l - 1, j2, k2);
            func_35634_d(k, l + 1, j2, k2);
            func_35634_d(k, l, j2, k2);
        }
        field_680_o = true;
    }

    public int func_48555_b(int p_48555_1_, int p_48555_2_, int p_48555_3_)
    {
        return Block.field_538_r[func_344_a(p_48555_1_, p_48555_2_, p_48555_3_)];
    }

    public int func_344_a(int p_344_1_, int p_344_2_, int p_344_3_)
    {
        if(p_344_2_ >> 4 >= field_48566_p.length)
        {
            return 0;
        }
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_344_2_ >> 4];
        if(extendedblockstorage != null)
        {
            return extendedblockstorage.func_48591_a(p_344_1_, p_344_2_ & 0xf, p_344_3_);
        } else
        {
            return 0;
        }
    }

    public int func_356_b(int p_356_1_, int p_356_2_, int p_356_3_)
    {
        if(p_356_2_ >> 4 >= field_48566_p.length)
        {
            return 0;
        }
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_356_2_ >> 4];
        if(extendedblockstorage != null)
        {
            return extendedblockstorage.func_48598_b(p_356_1_, p_356_2_ & 0xf, p_356_3_);
        } else
        {
            return 0;
        }
    }

    public boolean func_357_a(int p_357_1_, int p_357_2_, int p_357_3_, int p_357_4_)
    {
        return func_346_a(p_357_1_, p_357_2_, p_357_3_, p_357_4_, 0);
    }

    public boolean func_346_a(int p_346_1_, int p_346_2_, int p_346_3_, int p_346_4_, int p_346_5_)
    {
        int i = p_346_3_ << 4 | p_346_1_;
        if(p_346_2_ >= field_35637_c[i] - 1)
        {
            field_35637_c[i] = -999;
        }
        int j = field_48562_f[i];
        int k = func_344_a(p_346_1_, p_346_2_, p_346_3_);
        if(k == p_346_4_ && func_356_b(p_346_1_, p_346_2_, p_346_3_) == p_346_5_)
        {
            return false;
        }
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_346_2_ >> 4];
        boolean flag = false;
        if(extendedblockstorage == null)
        {
            if(p_346_4_ == 0)
            {
                return false;
            }
            extendedblockstorage = field_48566_p[p_346_2_ >> 4] = new ExtendedBlockStorage((p_346_2_ >> 4) << 4);
            flag = p_346_2_ >= j;
        }
        extendedblockstorage.func_48588_a(p_346_1_, p_346_2_ & 0xf, p_346_3_, p_346_4_);
        int l = field_685_j * 16 + p_346_1_;
        int i1 = field_684_k * 16 + p_346_3_;
        if(k != 0)
        {
            if(!field_691_d.field_792_x)
            {
                Block.field_542_n[k].func_242_b(field_691_d, l, p_346_2_, i1);
            } else
            if((Block.field_542_n[k] instanceof BlockContainer) && k != p_346_4_)
            {
                field_691_d.func_513_l(l, p_346_2_, i1);
            }
        }
        if(extendedblockstorage.func_48591_a(p_346_1_, p_346_2_ & 0xf, p_346_3_) != p_346_4_)
        {
            return false;
        }
        extendedblockstorage.func_48585_b(p_346_1_, p_346_2_ & 0xf, p_346_3_, p_346_5_);
        if(flag)
        {
            func_353_b();
        } else
        {
            if(Block.field_538_r[p_346_4_ & 0xfff] > 0)
            {
                if(p_346_2_ >= j)
                {
                    func_339_g(p_346_1_, p_346_2_ + 1, p_346_3_);
                }
            } else
            if(p_346_2_ == j - 1)
            {
                func_339_g(p_346_1_, p_346_2_, p_346_3_);
            }
            func_333_c(p_346_1_, p_346_3_);
        }
        if(p_346_4_ != 0)
        {
            if(!field_691_d.field_792_x)
            {
                Block.field_542_n[p_346_4_].func_250_e(field_691_d, l, p_346_2_, i1);
            }
            if(Block.field_542_n[p_346_4_] instanceof BlockContainer)
            {
                TileEntity tileentity = func_338_d(p_346_1_, p_346_2_, p_346_3_);
                if(tileentity == null)
                {
                    tileentity = ((BlockContainer)Block.field_542_n[p_346_4_]).func_294_a_();
                    field_691_d.func_473_a(l, p_346_2_, i1, tileentity);
                }
                if(tileentity != null)
                {
                    tileentity.func_35164_g();
                }
            }
        } else
        if(k > 0 && (Block.field_542_n[k] instanceof BlockContainer))
        {
            TileEntity tileentity1 = func_338_d(p_346_1_, p_346_2_, p_346_3_);
            if(tileentity1 != null)
            {
                tileentity1.func_35164_g();
            }
        }
        field_680_o = true;
        return true;
    }

    public boolean func_345_b(int p_345_1_, int p_345_2_, int p_345_3_, int p_345_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_345_2_ >> 4];
        if(extendedblockstorage == null)
        {
            return false;
        }
        int i = extendedblockstorage.func_48598_b(p_345_1_, p_345_2_ & 0xf, p_345_3_);
        if(i == p_345_4_)
        {
            return false;
        }
        field_680_o = true;
        extendedblockstorage.func_48585_b(p_345_1_, p_345_2_ & 0xf, p_345_3_, p_345_4_);
        int j = extendedblockstorage.func_48591_a(p_345_1_, p_345_2_ & 0xf, p_345_3_);
        if(j > 0 && (Block.field_542_n[j] instanceof BlockContainer))
        {
            TileEntity tileentity = func_338_d(p_345_1_, p_345_2_, p_345_3_);
            if(tileentity != null)
            {
                tileentity.func_35164_g();
                tileentity.field_35165_n = p_345_4_;
            }
        }
        return true;
    }

    public int func_341_a(EnumSkyBlock p_341_1_, int p_341_2_, int p_341_3_, int p_341_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_341_3_ >> 4];
        if(extendedblockstorage == null)
        {
            return p_341_1_.field_984_c;
        }
        if(p_341_1_ == EnumSkyBlock.Sky)
        {
            return extendedblockstorage.func_48602_c(p_341_2_, p_341_3_ & 0xf, p_341_4_);
        }
        if(p_341_1_ == EnumSkyBlock.Block)
        {
            return extendedblockstorage.func_48604_d(p_341_2_, p_341_3_ & 0xf, p_341_4_);
        } else
        {
            return p_341_1_.field_984_c;
        }
    }

    public void func_330_a(EnumSkyBlock p_330_1_, int p_330_2_, int p_330_3_, int p_330_4_, int p_330_5_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_330_3_ >> 4];
        if(extendedblockstorage == null)
        {
            extendedblockstorage = field_48566_p[p_330_3_ >> 4] = new ExtendedBlockStorage((p_330_3_ >> 4) << 4);
            func_353_b();
        }
        field_680_o = true;
        if(p_330_1_ == EnumSkyBlock.Sky)
        {
            if(!field_691_d.field_4272_q.field_4306_c)
            {
                extendedblockstorage.func_48592_c(p_330_2_, p_330_3_ & 0xf, p_330_4_, p_330_5_);
            }
        } else
        if(p_330_1_ == EnumSkyBlock.Block)
        {
            extendedblockstorage.func_48608_d(p_330_2_, p_330_3_ & 0xf, p_330_4_, p_330_5_);
        } else
        {
            return;
        }
    }

    public int func_354_c(int p_354_1_, int p_354_2_, int p_354_3_, int p_354_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48566_p[p_354_2_ >> 4];
        if(extendedblockstorage == null)
        {
            if(!field_691_d.field_4272_q.field_4306_c && p_354_4_ < EnumSkyBlock.Sky.field_984_c)
            {
                return EnumSkyBlock.Sky.field_984_c - p_354_4_;
            } else
            {
                return 0;
            }
        }
        int i = field_691_d.field_4272_q.field_4306_c ? 0 : extendedblockstorage.func_48602_c(p_354_1_, p_354_2_ & 0xf, p_354_3_);
        if(i > 0)
        {
            field_694_a = true;
        }
        i -= p_354_4_;
        int j = extendedblockstorage.func_48604_d(p_354_1_, p_354_2_ & 0xf, p_354_3_);
        if(j > i)
        {
            i = j;
        }
        return i;
    }

    public void func_335_a(Entity p_335_1_)
    {
        field_677_r = true;
        int i = MathHelper.func_584_b(p_335_1_.field_322_l / 16D);
        int j = MathHelper.func_584_b(p_335_1_.field_320_n / 16D);
        if(i != field_685_j || j != field_684_k)
        {
            System.out.println((new StringBuilder()).append("Wrong location! ").append(p_335_1_).toString());
            Thread.dumpStack();
        }
        int k = MathHelper.func_584_b(p_335_1_.field_321_m / 16D);
        if(k < 0)
        {
            k = 0;
        }
        if(k >= field_48563_j.length)
        {
            k = field_48563_j.length - 1;
        }
        p_335_1_.field_276_Z = true;
        p_335_1_.field_307_aa = field_685_j;
        p_335_1_.field_305_ab = k;
        p_335_1_.field_303_ac = field_684_k;
        field_48563_j[k].add(p_335_1_);
    }

    public void func_350_b(Entity p_350_1_)
    {
        func_332_a(p_350_1_, p_350_1_.field_305_ab);
    }

    public void func_332_a(Entity p_332_1_, int p_332_2_)
    {
        if(p_332_2_ < 0)
        {
            p_332_2_ = 0;
        }
        if(p_332_2_ >= field_48563_j.length)
        {
            p_332_2_ = field_48563_j.length - 1;
        }
        field_48563_j[p_332_2_].remove(p_332_1_);
    }

    public boolean func_343_c(int p_343_1_, int p_343_2_, int p_343_3_)
    {
        return p_343_2_ >= field_48562_f[p_343_3_ << 4 | p_343_1_];
    }

    public TileEntity func_338_d(int p_338_1_, int p_338_2_, int p_338_3_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_338_1_, p_338_2_, p_338_3_);
        TileEntity tileentity = (TileEntity)field_683_l.get(chunkposition);
        if(tileentity == null)
        {
            int i = func_344_a(p_338_1_, p_338_2_, p_338_3_);
            if(i <= 0 || !Block.field_542_n[i].func_48124_n())
            {
                return null;
            }
            if(tileentity == null)
            {
                tileentity = ((BlockContainer)Block.field_542_n[i]).func_294_a_();
                field_691_d.func_473_a(field_685_j * 16 + p_338_1_, p_338_2_, field_684_k * 16 + p_338_3_, tileentity);
            }
            tileentity = (TileEntity)field_683_l.get(chunkposition);
        }
        if(tileentity != null && tileentity.func_31004_g())
        {
            field_683_l.remove(chunkposition);
            return null;
        } else
        {
            return tileentity;
        }
    }

    public void func_349_a(TileEntity p_349_1_)
    {
        int i = p_349_1_.field_478_b - field_685_j * 16;
        int j = p_349_1_.field_483_c;
        int k = p_349_1_.field_482_d - field_684_k * 16;
        func_352_a(i, j, k, p_349_1_);
        if(field_692_c)
        {
            field_691_d.field_814_b.add(p_349_1_);
        }
    }

    public void func_352_a(int p_352_1_, int p_352_2_, int p_352_3_, TileEntity p_352_4_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_352_1_, p_352_2_, p_352_3_);
        p_352_4_.field_479_a = field_691_d;
        p_352_4_.field_478_b = field_685_j * 16 + p_352_1_;
        p_352_4_.field_483_c = p_352_2_;
        p_352_4_.field_482_d = field_684_k * 16 + p_352_3_;
        if(func_344_a(p_352_1_, p_352_2_, p_352_3_) == 0 || !(Block.field_542_n[func_344_a(p_352_1_, p_352_2_, p_352_3_)] instanceof BlockContainer))
        {
            return;
        } else
        {
            p_352_4_.func_31002_j();
            field_683_l.put(chunkposition, p_352_4_);
            return;
        }
    }

    public void func_359_e(int p_359_1_, int p_359_2_, int p_359_3_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_359_1_, p_359_2_, p_359_3_);
        if(field_692_c)
        {
            TileEntity tileentity = (TileEntity)field_683_l.remove(chunkposition);
            if(tileentity != null)
            {
                tileentity.func_31003_h();
            }
        }
    }

    public void func_358_c()
    {
        field_692_c = true;
        field_691_d.func_31047_a(field_683_l.values());
        for(int i = 0; i < field_48563_j.length; i++)
        {
            field_691_d.func_464_a(field_48563_j[i]);
        }

    }

    public void func_331_d()
    {
        field_692_c = false;
        TileEntity tileentity;
        for(Iterator iterator = field_683_l.values().iterator(); iterator.hasNext(); field_691_d.func_35239_a(tileentity))
        {
            tileentity = (TileEntity)iterator.next();
        }

        for(int i = 0; i < field_48563_j.length; i++)
        {
            field_691_d.func_461_b(field_48563_j[i]);
        }

    }

    public void func_336_e()
    {
        field_680_o = true;
    }

    public void func_329_a(Entity p_329_1_, AxisAlignedBB p_329_2_, List p_329_3_)
    {
        int i = MathHelper.func_584_b((p_329_2_.field_963_b - 2D) / 16D);
        int j = MathHelper.func_584_b((p_329_2_.field_968_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        }
        if(j >= field_48563_j.length)
        {
            j = field_48563_j.length - 1;
        }
        for(int k = i; k <= j; k++)
        {
            List list = field_48563_j[k];
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                if(entity == p_329_1_ || !entity.field_312_v.func_704_a(p_329_2_))
                {
                    continue;
                }
                p_329_3_.add(entity);
                Entity aentity[] = entity.func_40037_aF();
                if(aentity == null)
                {
                    continue;
                }
                for(int i1 = 0; i1 < aentity.length; i1++)
                {
                    Entity entity1 = aentity[i1];
                    if(entity1 != p_329_1_ && entity1.field_312_v.func_704_a(p_329_2_))
                    {
                        p_329_3_.add(entity1);
                    }
                }

            }

        }

    }

    public void func_342_a(Class p_342_1_, AxisAlignedBB p_342_2_, List p_342_3_)
    {
        int i = MathHelper.func_584_b((p_342_2_.field_963_b - 2D) / 16D);
        int j = MathHelper.func_584_b((p_342_2_.field_968_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        } else
        if(i >= field_48563_j.length)
        {
            i = field_48563_j.length - 1;
        }
        if(j >= field_48563_j.length)
        {
            j = field_48563_j.length - 1;
        } else
        if(j < 0)
        {
            j = 0;
        }
        for(int k = i; k <= j; k++)
        {
            List list = field_48563_j[k];
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                if(p_342_1_.isAssignableFrom(entity.getClass()) && entity.field_312_v.func_704_a(p_342_2_))
                {
                    p_342_3_.add(entity);
                }
            }

        }

    }

    public boolean func_347_a(boolean p_347_1_)
    {
        if(p_347_1_)
        {
            if(field_677_r && field_691_d.func_22080_k() != field_676_s)
            {
                return true;
            }
        } else
        if(field_677_r && field_691_d.func_22080_k() >= field_676_s + 600L)
        {
            return true;
        }
        return field_680_o;
    }

    public Random func_334_a(long p_334_1_)
    {
        return new Random(field_691_d.func_22079_j() + (long)(field_685_j * field_685_j * 0x4c1906) + (long)(field_685_j * 0x5ac0db) + (long)(field_684_k * field_684_k) * 0x4307a7L + (long)(field_684_k * 0x5f24f) ^ p_334_1_);
    }

    public boolean func_41049_g()
    {
        return false;
    }

    public void func_25083_h()
    {
        ExtendedBlockStorage aextendedblockstorage[] = field_48566_p;
        int i = aextendedblockstorage.length;
        for(int j = 0; j < i; j++)
        {
            ExtendedBlockStorage extendedblockstorage = aextendedblockstorage[j];
            if(extendedblockstorage != null)
            {
                extendedblockstorage.func_48603_e();
            }
        }

    }

    public void func_35632_a(IChunkProvider p_35632_1_, IChunkProvider p_35632_2_, int p_35632_3_, int p_35632_4_)
    {
        if(!field_681_n && p_35632_1_.func_365_a(p_35632_3_ + 1, p_35632_4_ + 1) && p_35632_1_.func_365_a(p_35632_3_, p_35632_4_ + 1) && p_35632_1_.func_365_a(p_35632_3_ + 1, p_35632_4_))
        {
            p_35632_1_.func_4055_a(p_35632_2_, p_35632_3_, p_35632_4_);
        }
        if(p_35632_1_.func_365_a(p_35632_3_ - 1, p_35632_4_) && !p_35632_1_.func_363_b(p_35632_3_ - 1, p_35632_4_).field_681_n && p_35632_1_.func_365_a(p_35632_3_ - 1, p_35632_4_ + 1) && p_35632_1_.func_365_a(p_35632_3_, p_35632_4_ + 1) && p_35632_1_.func_365_a(p_35632_3_ - 1, p_35632_4_ + 1))
        {
            p_35632_1_.func_4055_a(p_35632_2_, p_35632_3_ - 1, p_35632_4_);
        }
        if(p_35632_1_.func_365_a(p_35632_3_, p_35632_4_ - 1) && !p_35632_1_.func_363_b(p_35632_3_, p_35632_4_ - 1).field_681_n && p_35632_1_.func_365_a(p_35632_3_ + 1, p_35632_4_ - 1) && p_35632_1_.func_365_a(p_35632_3_ + 1, p_35632_4_ - 1) && p_35632_1_.func_365_a(p_35632_3_ + 1, p_35632_4_))
        {
            p_35632_1_.func_4055_a(p_35632_2_, p_35632_3_, p_35632_4_ - 1);
        }
        if(p_35632_1_.func_365_a(p_35632_3_ - 1, p_35632_4_ - 1) && !p_35632_1_.func_363_b(p_35632_3_ - 1, p_35632_4_ - 1).field_681_n && p_35632_1_.func_365_a(p_35632_3_, p_35632_4_ - 1) && p_35632_1_.func_365_a(p_35632_3_ - 1, p_35632_4_))
        {
            p_35632_1_.func_4055_a(p_35632_2_, p_35632_3_ - 1, p_35632_4_ - 1);
        }
    }

    public int func_35631_c(int p_35631_1_, int p_35631_2_)
    {
        int i = p_35631_1_ | p_35631_2_ << 4;
        int j = field_35637_c[i];
        if(j == -999)
        {
            int k = func_48561_g() + 15;
            for(j = -1; k > 0 && j == -1;)
            {
                int l = func_344_a(p_35631_1_, k, p_35631_2_);
                Material material = l != 0 ? Block.field_542_n[l].field_553_bn : Material.field_526_a;
                if(!material.func_218_c() && !material.func_217_d())
                {
                    k--;
                } else
                {
                    j = k + 1;
                }
            }

            field_35637_c[i] = j;
        }
        return j;
    }

    public void func_35635_h()
    {
        if(field_40544_v && !field_691_d.field_4272_q.field_4306_c)
        {
            func_35633_i();
        }
    }

    public ChunkCoordIntPair func_40543_i()
    {
        return new ChunkCoordIntPair(field_685_j, field_684_k);
    }

    public boolean func_48556_c(int p_48556_1_, int p_48556_2_)
    {
        if(p_48556_1_ < 0)
        {
            p_48556_1_ = 0;
        }
        if(p_48556_2_ >= 256)
        {
            p_48556_2_ = 255;
        }
        for(int i = p_48556_1_; i <= p_48556_2_; i += 16)
        {
            ExtendedBlockStorage extendedblockstorage = field_48566_p[i >> 4];
            if(extendedblockstorage != null && !extendedblockstorage.func_48595_a())
            {
                return false;
            }
        }

        return true;
    }

    public void func_48558_a(ExtendedBlockStorage p_48558_1_[])
    {
        field_48566_p = p_48558_1_;
    }

    public BiomeGenBase func_48560_a(int p_48560_1_, int p_48560_2_, WorldChunkManager p_48560_3_)
    {
        int i = field_48565_q[p_48560_2_ << 4 | p_48560_1_] & 0xff;
        if(i == 255)
        {
            BiomeGenBase biomegenbase = p_48560_3_.func_4067_a((field_685_j << 4) + p_48560_1_, (field_684_k << 4) + p_48560_2_);
            i = biomegenbase.field_35529_y;
            field_48565_q[p_48560_2_ << 4 | p_48560_1_] = (byte)(i & 0xff);
        }
        if(BiomeGenBase.field_35521_a[i] == null)
        {
            return BiomeGenBase.field_35520_c;
        } else
        {
            return BiomeGenBase.field_35521_a[i];
        }
    }

    public byte[] func_48552_l()
    {
        return field_48565_q;
    }

    public void func_48559_a(byte p_48559_1_[])
    {
        field_48565_q = p_48559_1_;
    }

    public void func_48554_m()
    {
        field_48564_s = 0;
    }

    public void func_48557_n()
    {
        for(int i = 0; i < 8; i++)
        {
            if(field_48564_s >= 4096)
            {
                return;
            }
            int j = field_48564_s % 16;
            int k = (field_48564_s / 16) % 16;
            int l = field_48564_s / 256;
            field_48564_s++;
            int i1 = (field_685_j << 4) + k;
            int j1 = (field_684_k << 4) + l;
            for(int k1 = 0; k1 < 16; k1++)
            {
                int l1 = (j << 4) + k1;
                if((field_48566_p[j] != null || k1 != 0 && k1 != 15 && k != 0 && k != 15 && l != 0 && l != 15) && (field_48566_p[j] == null || field_48566_p[j].func_48591_a(k, k1, l) != 0))
                {
                    continue;
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1, l1 - 1, j1)] > 0)
                {
                    field_691_d.func_35242_p(i1, l1 - 1, j1);
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1, l1 + 1, j1)] > 0)
                {
                    field_691_d.func_35242_p(i1, l1 + 1, j1);
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1 - 1, l1, j1)] > 0)
                {
                    field_691_d.func_35242_p(i1 - 1, l1, j1);
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1 + 1, l1, j1)] > 0)
                {
                    field_691_d.func_35242_p(i1 + 1, l1, j1);
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1, l1, j1 - 1)] > 0)
                {
                    field_691_d.func_35242_p(i1, l1, j1 - 1);
                }
                if(Block.field_536_t[field_691_d.func_444_a(i1, l1, j1 + 1)] > 0)
                {
                    field_691_d.func_35242_p(i1, l1, j1 + 1);
                }
                field_691_d.func_35242_p(i1, l1, j1);
            }

        }

    }
}
