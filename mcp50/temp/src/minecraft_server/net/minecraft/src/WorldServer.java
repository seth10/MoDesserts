// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            World, WorldProvider, IntHashMap, EntityAnimal, 
//            EntityWaterMob, Entity, INpc, EntityPlayer, 
//            ISaveHandler, ChunkProviderServer, TileEntity, WorldInfo, 
//            MathHelper, ServerConfigurationManager, Packet71Weather, Packet38EntityStatus, 
//            EntityTracker, Explosion, Packet60Explosion, Packet54PlayNoteBlock, 
//            Packet70Bed, WorldSettings, IChunkProvider

public class WorldServer extends World
{

    public ChunkProviderServer field_20911_y;
    public boolean field_819_z;
    public boolean field_816_A;
    private MinecraftServer field_6160_D;
    private IntHashMap field_34902_Q;

    public WorldServer(MinecraftServer p_i138_1_, ISaveHandler p_i138_2_, String p_i138_3_, int p_i138_4_, WorldSettings p_i138_5_)
    {
        super(p_i138_2_, p_i138_3_, p_i138_5_, WorldProvider.func_4091_a(p_i138_4_));
        field_819_z = false;
        field_6160_D = p_i138_1_;
        if(field_34902_Q == null)
        {
            field_34902_Q = new IntHashMap();
        }
    }

    public void func_4074_a(Entity p_4074_1_, boolean p_4074_2_)
    {
        if(!field_6160_D.field_6026_m && ((p_4074_1_ instanceof EntityAnimal) || (p_4074_1_ instanceof EntityWaterMob)))
        {
            p_4074_1_.func_118_j();
        }
        if(!field_6160_D.field_44002_p && (p_4074_1_ instanceof INpc))
        {
            p_4074_1_.func_118_j();
        }
        if(p_4074_1_.field_328_f == null || !(p_4074_1_.field_328_f instanceof EntityPlayer))
        {
            super.func_4074_a(p_4074_1_, p_4074_2_);
        }
    }

    public void func_12017_b(Entity p_12017_1_, boolean p_12017_2_)
    {
        super.func_4074_a(p_12017_1_, p_12017_2_);
    }

    protected IChunkProvider func_22086_b()
    {
        IChunkLoader ichunkloader = field_9211_s.func_22092_a(field_4272_q);
        field_20911_y = new ChunkProviderServer(this, ichunkloader, field_4272_q.func_4087_c());
        return field_20911_y;
    }

    public List func_532_d(int p_532_1_, int p_532_2_, int p_532_3_, int p_532_4_, int p_532_5_, int p_532_6_)
    {
        ArrayList arraylist = new ArrayList();
        for(int i = 0; i < field_814_b.size(); i++)
        {
            TileEntity tileentity = (TileEntity)field_814_b.get(i);
            if(tileentity.field_478_b >= p_532_1_ && tileentity.field_483_c >= p_532_2_ && tileentity.field_482_d >= p_532_3_ && tileentity.field_478_b < p_532_4_ && tileentity.field_483_c < p_532_5_ && tileentity.field_482_d < p_532_6_)
            {
                arraylist.add(tileentity);
            }
        }

        return arraylist;
    }

    public boolean func_6157_a(EntityPlayer p_6157_1_, int p_6157_2_, int p_6157_3_, int p_6157_4_)
    {
        int i = MathHelper.func_35475_a(p_6157_2_ - field_797_s.func_22184_c());
        int j = MathHelper.func_35475_a(p_6157_4_ - field_797_s.func_22189_e());
        if(i > j)
        {
            j = i;
        }
        return j > 16 || field_6160_D.field_6033_f.func_639_g(p_6157_1_.field_409_aq);
    }

    protected void func_25072_c()
    {
        if(field_34902_Q == null)
        {
            field_34902_Q = new IntHashMap();
        }
        super.func_25072_c();
    }

    protected void func_479_b(Entity p_479_1_)
    {
        super.func_479_b(p_479_1_);
        field_34902_Q.func_554_a(p_479_1_.field_331_c, p_479_1_);
        Entity aentity[] = p_479_1_.func_40037_aF();
        if(aentity != null)
        {
            for(int i = 0; i < aentity.length; i++)
            {
                field_34902_Q.func_554_a(aentity[i].field_331_c, aentity[i]);
            }

        }
    }

    protected void func_531_c(Entity p_531_1_)
    {
        super.func_531_c(p_531_1_);
        field_34902_Q.func_553_d(p_531_1_.field_331_c);
        Entity aentity[] = p_531_1_.func_40037_aF();
        if(aentity != null)
        {
            for(int i = 0; i < aentity.length; i++)
            {
                field_34902_Q.func_553_d(aentity[i].field_331_c);
            }

        }
    }

    public Entity func_6158_a(int p_6158_1_)
    {
        return (Entity)field_34902_Q.func_550_a(p_6158_1_);
    }

    public boolean func_27073_a(Entity p_27073_1_)
    {
        if(super.func_27073_a(p_27073_1_))
        {
            field_6160_D.field_6033_f.func_12022_a(p_27073_1_.field_322_l, p_27073_1_.field_321_m, p_27073_1_.field_320_n, 512D, field_4272_q.field_6165_g, new Packet71Weather(p_27073_1_));
            return true;
        } else
        {
            return false;
        }
    }

    public void func_9206_a(Entity p_9206_1_, byte p_9206_2_)
    {
        Packet38EntityStatus packet38entitystatus = new Packet38EntityStatus(p_9206_1_.field_331_c, p_9206_2_);
        field_6160_D.func_28003_b(field_4272_q.field_6165_g).func_609_a(p_9206_1_, packet38entitystatus);
    }

    public Explosion func_12015_a(Entity p_12015_1_, double p_12015_2_, double p_12015_4_, double p_12015_6_, 
            float p_12015_8_, boolean p_12015_9_)
    {
        Explosion explosion = new Explosion(this, p_12015_1_, p_12015_2_, p_12015_4_, p_12015_6_, p_12015_8_);
        explosion.field_12031_a = p_12015_9_;
        explosion.func_12023_a();
        explosion.func_732_a(false);
        field_6160_D.field_6033_f.func_12022_a(p_12015_2_, p_12015_4_, p_12015_6_, 64D, field_4272_q.field_6165_g, new Packet60Explosion(p_12015_2_, p_12015_4_, p_12015_6_, p_12015_8_, explosion.field_12025_g));
        return explosion;
    }

    public void func_21117_c(int p_21117_1_, int p_21117_2_, int p_21117_3_, int p_21117_4_, int p_21117_5_)
    {
        super.func_21117_c(p_21117_1_, p_21117_2_, p_21117_3_, p_21117_4_, p_21117_5_);
        field_6160_D.field_6033_f.func_12022_a(p_21117_1_, p_21117_2_, p_21117_3_, 64D, field_4272_q.field_6165_g, new Packet54PlayNoteBlock(p_21117_1_, p_21117_2_, p_21117_3_, p_21117_4_, p_21117_5_));
    }

    public void func_30006_w()
    {
        field_9211_s.func_22093_e();
    }

    protected void func_27066_i()
    {
        boolean flag = func_27068_v();
        super.func_27066_i();
        if(flag != func_27068_v())
        {
            if(flag)
            {
                field_6160_D.field_6033_f.func_631_a(new Packet70Bed(2, 0));
            } else
            {
                field_6160_D.field_6033_f.func_631_a(new Packet70Bed(1, 0));
            }
        }
    }
}
