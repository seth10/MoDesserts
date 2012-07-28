// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            ICommandListener, ServerWindowAdapter, GuiStatsComponent, PlayerListBox, 
//            GuiLogOutputHandler, ServerGuiCommandListener, ServerGuiFocusAdapter

public class ServerGUI extends JComponent
    implements ICommandListener
{

    public static Logger field_22_a = Logger.getLogger("Minecraft");
    private MinecraftServer field_21_b;

    public static void func_46_a(MinecraftServer p_46_0_)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception exception) { }
        ServerGUI servergui = new ServerGUI(p_46_0_);
        JFrame jframe = new JFrame("Minecraft server");
        jframe.add(servergui);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        jframe.addWindowListener(new ServerWindowAdapter(p_46_0_));
    }

    public ServerGUI(MinecraftServer p_i504_1_)
    {
        field_21_b = p_i504_1_;
        setPreferredSize(new Dimension(854, 480));
        setLayout(new BorderLayout());
        try
        {
            add(func_47_d(), "Center");
            add(func_45_a(), "West");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private JComponent func_45_a()
    {
        JPanel jpanel = new JPanel(new BorderLayout());
        jpanel.add(new GuiStatsComponent(field_21_b), "North");
        jpanel.add(func_48_b(), "Center");
        jpanel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
        return jpanel;
    }

    private JComponent func_48_b()
    {
        PlayerListBox playerlistbox = new PlayerListBox(field_21_b);
        JScrollPane jscrollpane = new JScrollPane(playerlistbox, 22, 30);
        jscrollpane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        return jscrollpane;
    }

    private JComponent func_47_d()
    {
        JPanel jpanel = new JPanel(new BorderLayout());
        JTextArea jtextarea = new JTextArea();
        field_22_a.addHandler(new GuiLogOutputHandler(jtextarea));
        JScrollPane jscrollpane = new JScrollPane(jtextarea, 22, 30);
        jtextarea.setEditable(false);
        JTextField jtextfield = new JTextField();
        jtextfield.addActionListener(new ServerGuiCommandListener(this, jtextfield));
        jtextarea.addFocusListener(new ServerGuiFocusAdapter(this));
        jpanel.add(jscrollpane, "Center");
        jpanel.add(jtextfield, "South");
        jpanel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
        return jpanel;
    }

    public void func_2_b(String p_2_1_)
    {
        field_22_a.info(p_2_1_);
    }

    public String func_1_c()
    {
        return "CONSOLE";
    }

    static MinecraftServer func_44_a(ServerGUI p_44_0_)
    {
        return p_44_0_.field_21_b;
    }

}
