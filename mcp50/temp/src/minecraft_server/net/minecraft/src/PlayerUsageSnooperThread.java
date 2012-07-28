// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PlayerUsageSnooper, PostHttp

class PlayerUsageSnooperThread extends Thread
{

    final PlayerUsageSnooper field_52017_a; /* synthetic field */

    PlayerUsageSnooperThread(PlayerUsageSnooper p_i1300_1_, String p_i1300_2_)
    {
        field_52017_a = p_i1300_1_;
        super(p_i1300_2_);
    }

    public void run()
    {
        PostHttp.func_52010_a(PlayerUsageSnooper.func_52013_a(field_52017_a), PlayerUsageSnooper.func_52011_b(field_52017_a), true);
    }
}
