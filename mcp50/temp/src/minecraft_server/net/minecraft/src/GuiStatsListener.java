// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Referenced classes of package net.minecraft.src:
//            GuiStatsComponent

class GuiStatsListener
    implements ActionListener
{

    final GuiStatsComponent field_527_a; /* synthetic field */

    GuiStatsListener(GuiStatsComponent p_i279_1_)
    {
        field_527_a = p_i279_1_;
        super();
    }

    public void actionPerformed(ActionEvent p_actionPerformed_1_)
    {
        GuiStatsComponent.func_435_a(field_527_a);
    }
}
