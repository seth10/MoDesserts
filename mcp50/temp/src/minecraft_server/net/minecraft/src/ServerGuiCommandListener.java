// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            ServerGUI

class ServerGuiCommandListener
    implements ActionListener
{

    final JTextField field_993_a; /* synthetic field */
    final ServerGUI field_992_b; /* synthetic field */

    ServerGuiCommandListener(ServerGUI p_i6_1_, JTextField p_i6_2_)
    {
        field_992_b = p_i6_1_;
        field_993_a = p_i6_2_;
        super();
    }

    public void actionPerformed(ActionEvent p_actionPerformed_1_)
    {
        String s = field_993_a.getText().trim();
        if(s.length() > 0)
        {
            ServerGUI.func_44_a(field_992_b).func_6010_a(s, field_992_b);
        }
        field_993_a.setText("");
    }
}
