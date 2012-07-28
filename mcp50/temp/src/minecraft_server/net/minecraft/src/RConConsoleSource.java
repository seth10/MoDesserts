// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ICommandListener

public class RConConsoleSource
    implements ICommandListener
{

    public static final RConConsoleSource field_40005_a = new RConConsoleSource();
    private StringBuffer field_40004_b;

    public RConConsoleSource()
    {
        field_40004_b = new StringBuffer();
    }

    public void func_40002_a()
    {
        field_40004_b.setLength(0);
    }

    public String func_40003_b()
    {
        return field_40004_b.toString();
    }

    public void func_2_b(String p_2_1_)
    {
        field_40004_b.append(p_2_1_);
    }

    public String func_1_c()
    {
        return "Rcon";
    }

}
