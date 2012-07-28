// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            IUpdatePlayerListBox, ServerConfigurationManager, EntityPlayerMP

public class PlayerListBox extends JList
    implements IUpdatePlayerListBox
{

    private MinecraftServer field_955_a;
    private int field_954_b;

    public PlayerListBox(MinecraftServer p_i310_1_)
    {
        field_954_b = 0;
        field_955_a = p_i310_1_;
        p_i310_1_.func_6022_a(this);
    }

    public void func_690_a()
    {
        if(field_954_b++ % 20 == 0)
        {
            Vector vector = new Vector();
            for(int i = 0; i < field_955_a.field_6033_f.field_924_b.size(); i++)
            {
                vector.add(((EntityPlayerMP)field_955_a.field_6033_f.field_924_b.get(i)).field_409_aq);
            }

            setListData(vector);
        }
    }
}
