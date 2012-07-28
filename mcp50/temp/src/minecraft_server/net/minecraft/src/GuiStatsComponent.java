// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.Timer;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            GuiStatsListener, NetworkManager, WorldServer, ChunkProviderServer

public class GuiStatsComponent extends JComponent
{

    private static final DecimalFormat field_40573_a = new DecimalFormat("########0.000");
    private int field_767_a[];
    private int field_766_b;
    private String field_768_c[];
    private final MinecraftServer field_40572_e;

    public GuiStatsComponent(MinecraftServer p_i259_1_)
    {
        field_767_a = new int[256];
        field_766_b = 0;
        field_768_c = new String[10];
        field_40572_e = p_i259_1_;
        setPreferredSize(new Dimension(356, 246));
        setMinimumSize(new Dimension(356, 246));
        setMaximumSize(new Dimension(356, 246));
        (new Timer(500, new GuiStatsListener(this))).start();
        setBackground(Color.BLACK);
    }

    private void func_436_a()
    {
        int i;
        long l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.gc();
        field_768_c[0] = (new StringBuilder()).append("Memory use: ").append(l / 1024L / 1024L).append(" mb (").append((Runtime.getRuntime().freeMemory() * 100L) / Runtime.getRuntime().maxMemory()).append("% free)").toString();
        field_768_c[1] = (new StringBuilder()).append("Threads: ").append(NetworkManager.field_1052_b).append(" + ").append(NetworkManager.field_1051_c).toString();
        field_768_c[2] = (new StringBuilder()).append("Avg tick: ").append(field_40573_a.format(func_48551_a(field_40572_e.field_40027_f) * 9.9999999999999995E-07D)).append(" ms").toString();
        field_768_c[3] = (new StringBuilder()).append("Avg sent: ").append((int)func_48551_a(field_40572_e.field_48080_u)).append(", Avg size: ").append((int)func_48551_a(field_40572_e.field_48079_v)).toString();
        field_768_c[4] = (new StringBuilder()).append("Avg rec: ").append((int)func_48551_a(field_40572_e.field_48078_w)).append(", Avg size: ").append((int)func_48551_a(field_40572_e.field_48082_x)).toString();
        if(field_40572_e.field_6034_e == null)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        i = 0;
_L3:
        if(i >= field_40572_e.field_6034_e.length) goto _L2; else goto _L1
_L1:
        field_768_c[5 + i] = (new StringBuilder()).append("Lvl ").append(i).append(" tick: ").append(field_40573_a.format(func_48551_a(field_40572_e.field_40028_g[i]) * 9.9999999999999995E-07D)).append(" ms").toString();
        if(field_40572_e.field_6034_e[i] == null || field_40572_e.field_6034_e[i].field_20911_y == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        new StringBuilder();
        field_768_c;
        5 + i;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        ", ";
        append();
        field_40572_e.field_6034_e[i].field_20911_y.func_46040_d();
        append();
        toString();
        JVM INSTR aastore ;
        i++;
          goto _L3
_L2:
        field_767_a[field_766_b++ & 0xff] = (int)((func_48551_a(field_40572_e.field_48079_v) * 100D) / 12500D);
        repaint();
        return;
    }

    private double func_48551_a(long p_48551_1_[])
    {
        long l = 0L;
        for(int i = 0; i < p_48551_1_.length; i++)
        {
            l += p_48551_1_[i];
        }

        return (double)l / (double)p_48551_1_.length;
    }

    public void paint(Graphics p_paint_1_)
    {
        p_paint_1_.setColor(new Color(0xffffff));
        p_paint_1_.fillRect(0, 0, 356, 246);
        for(int i = 0; i < 256; i++)
        {
            int k = field_767_a[i + field_766_b & 0xff];
            p_paint_1_.setColor(new Color(k + 28 << 16));
            p_paint_1_.fillRect(i, 100 - k, 1, k);
        }

        p_paint_1_.setColor(Color.BLACK);
        for(int j = 0; j < field_768_c.length; j++)
        {
            String s = field_768_c[j];
            if(s != null)
            {
                p_paint_1_.drawString(s, 32, 116 + j * 16);
            }
        }

    }

    static void func_435_a(GuiStatsComponent p_435_0_)
    {
        p_435_0_.func_436_a();
    }

}
