// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            LongHashMap, PlayerInstance, WorldServer, WorldProvider, 
//            ChunkProviderServer, EntityPlayerMP

public class PlayerManager
{

    public List field_9216_a;
    private LongHashMap field_9215_b;
    private List field_833_c;
    private MinecraftServer field_832_d;
    private int field_28110_e;
    private int field_28109_f;
    private final int field_22089_e[][] = {
        {
            1, 0
        }, {
            0, 1
        }, {
            -1, 0
        }, {
            0, -1
        }
    };

    public PlayerManager(MinecraftServer p_i569_1_, int p_i569_2_, int p_i569_3_)
    {
        field_9216_a = new ArrayList();
        field_9215_b = new LongHashMap();
        field_833_c = new ArrayList();
        if(p_i569_3_ > 15)
        {
            throw new IllegalArgumentException("Too big view radius!");
        }
        if(p_i569_3_ < 3)
        {
            throw new IllegalArgumentException("Too small view radius!");
        } else
        {
            field_28109_f = p_i569_3_;
            field_832_d = p_i569_1_;
            field_28110_e = p_i569_2_;
            return;
        }
    }

    public WorldServer func_540_a()
    {
        return field_832_d.func_28004_a(field_28110_e);
    }

    public void func_538_a()
    {
        for(int i = 0; i < field_833_c.size(); i++)
        {
            ((PlayerInstance)field_833_c.get(i)).func_777_a();
        }

        field_833_c.clear();
        if(field_9216_a.isEmpty())
        {
            WorldServer worldserver = field_832_d.func_28004_a(field_28110_e);
            WorldProvider worldprovider = worldserver.field_4272_q;
            if(!worldprovider.func_28108_d())
            {
                worldserver.field_20911_y.func_46041_c();
            }
        }
    }

    private PlayerInstance func_537_a(int p_537_1_, int p_537_2_, boolean p_537_3_)
    {
        long l = (long)p_537_1_ + 0x7fffffffL | (long)p_537_2_ + 0x7fffffffL << 32;
        PlayerInstance playerinstance = (PlayerInstance)field_9215_b.func_677_a(l);
        if(playerinstance == null && p_537_3_)
        {
            playerinstance = new PlayerInstance(this, p_537_1_, p_537_2_);
            field_9215_b.func_675_a(l, playerinstance);
        }
        return playerinstance;
    }

    public void func_535_a(int p_535_1_, int p_535_2_, int p_535_3_)
    {
        int i = p_535_1_ >> 4;
        int j = p_535_3_ >> 4;
        PlayerInstance playerinstance = func_537_a(i, j, false);
        if(playerinstance != null)
        {
            playerinstance.func_775_a(p_535_1_ & 0xf, p_535_2_, p_535_3_ & 0xf);
        }
    }

    public void func_9214_a(EntityPlayerMP p_9214_1_)
    {
        int i = (int)p_9214_1_.field_322_l >> 4;
        int j = (int)p_9214_1_.field_320_n >> 4;
        p_9214_1_.field_9155_d = p_9214_1_.field_322_l;
        p_9214_1_.field_9154_e = p_9214_1_.field_320_n;
        int k = 0;
        int l = field_28109_f;
        int i1 = 0;
        int j1 = 0;
        func_537_a(i, j, true).func_779_a(p_9214_1_);
        for(int k1 = 1; k1 <= l * 2; k1++)
        {
            for(int i2 = 0; i2 < 2; i2++)
            {
                int ai[] = field_22089_e[k++ % 4];
                for(int j2 = 0; j2 < k1; j2++)
                {
                    i1 += ai[0];
                    j1 += ai[1];
                    func_537_a(i + i1, j + j1, true).func_779_a(p_9214_1_);
                }

            }

        }

        k %= 4;
        for(int l1 = 0; l1 < l * 2; l1++)
        {
            i1 += field_22089_e[k][0];
            j1 += field_22089_e[k][1];
            func_537_a(i + i1, j + j1, true).func_779_a(p_9214_1_);
        }

        field_9216_a.add(p_9214_1_);
    }

    public void func_9213_b(EntityPlayerMP p_9213_1_)
    {
        int i = (int)p_9213_1_.field_9155_d >> 4;
        int j = (int)p_9213_1_.field_9154_e >> 4;
        for(int k = i - field_28109_f; k <= i + field_28109_f; k++)
        {
            for(int l = j - field_28109_f; l <= j + field_28109_f; l++)
            {
                PlayerInstance playerinstance = func_537_a(k, l, false);
                if(playerinstance != null)
                {
                    playerinstance.func_778_b(p_9213_1_);
                }
            }

        }

        field_9216_a.remove(p_9213_1_);
    }

    private boolean func_544_a(int p_544_1_, int p_544_2_, int p_544_3_, int p_544_4_)
    {
        int i = p_544_1_ - p_544_3_;
        int j = p_544_2_ - p_544_4_;
        if(i < -field_28109_f || i > field_28109_f)
        {
            return false;
        }
        return j >= -field_28109_f && j <= field_28109_f;
    }

    public void func_543_c(EntityPlayerMP p_543_1_)
    {
        int i = (int)p_543_1_.field_322_l >> 4;
        int j = (int)p_543_1_.field_320_n >> 4;
        double d = p_543_1_.field_9155_d - p_543_1_.field_322_l;
        double d1 = p_543_1_.field_9154_e - p_543_1_.field_320_n;
        double d2 = d * d + d1 * d1;
        if(d2 < 64D)
        {
            return;
        }
        int k = (int)p_543_1_.field_9155_d >> 4;
        int l = (int)p_543_1_.field_9154_e >> 4;
        int i1 = i - k;
        int j1 = j - l;
        if(i1 == 0 && j1 == 0)
        {
            return;
        }
        for(int k1 = i - field_28109_f; k1 <= i + field_28109_f; k1++)
        {
            for(int l1 = j - field_28109_f; l1 <= j + field_28109_f; l1++)
            {
                if(!func_544_a(k1, l1, k, l))
                {
                    func_537_a(k1, l1, true).func_779_a(p_543_1_);
                }
                if(func_544_a(k1 - i1, l1 - j1, i, j))
                {
                    continue;
                }
                PlayerInstance playerinstance = func_537_a(k1 - i1, l1 - j1, false);
                if(playerinstance != null)
                {
                    playerinstance.func_778_b(p_543_1_);
                }
            }

        }

        p_543_1_.field_9155_d = p_543_1_.field_322_l;
        p_543_1_.field_9154_e = p_543_1_.field_320_n;
    }

    public int func_542_b()
    {
        return field_28109_f * 16 - 16;
    }

    static LongHashMap func_539_b(PlayerManager p_539_0_)
    {
        return p_539_0_.field_9215_b;
    }

    static List func_533_c(PlayerManager p_533_0_)
    {
        return p_533_0_.field_833_c;
    }
}
