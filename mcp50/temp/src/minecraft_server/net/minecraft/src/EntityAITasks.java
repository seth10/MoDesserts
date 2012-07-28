// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package net.minecraft.src:
//            EntityAITaskEntry, EntityAIBase

public class EntityAITasks
{

    private ArrayList field_46138_a;
    private ArrayList field_46137_b;

    public EntityAITasks()
    {
        field_46138_a = new ArrayList();
        field_46137_b = new ArrayList();
    }

    public void func_46134_a(int p_46134_1_, EntityAIBase p_46134_2_)
    {
        field_46138_a.add(new EntityAITaskEntry(this, p_46134_1_, p_46134_2_));
    }

    public void func_46133_a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = field_46138_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            EntityAITaskEntry entityaitaskentry = (EntityAITaskEntry)iterator.next();
            boolean flag1 = field_46137_b.contains(entityaitaskentry);
            if(flag1)
            {
                if(func_46136_a(entityaitaskentry) && entityaitaskentry.field_46132_a.func_46092_g())
                {
                    continue;
                }
                entityaitaskentry.field_46132_a.func_46085_d();
                field_46137_b.remove(entityaitaskentry);
            }
            if(func_46136_a(entityaitaskentry) && entityaitaskentry.field_46132_a.func_46090_a())
            {
                arraylist.add(entityaitaskentry);
                field_46137_b.add(entityaitaskentry);
            }
        } while(true);
        boolean flag = false;
        if(flag && arraylist.size() > 0)
        {
            System.out.println("Starting: ");
        }
        EntityAITaskEntry entityaitaskentry1;
        for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); entityaitaskentry1.field_46132_a.func_46088_e())
        {
            entityaitaskentry1 = (EntityAITaskEntry)iterator1.next();
            if(flag)
            {
                System.out.println((new StringBuilder()).append(entityaitaskentry1.field_46132_a.toString()).append(", ").toString());
            }
        }

        if(flag && field_46137_b.size() > 0)
        {
            System.out.println("Running: ");
        }
        EntityAITaskEntry entityaitaskentry2;
        for(Iterator iterator2 = field_46137_b.iterator(); iterator2.hasNext(); entityaitaskentry2.field_46132_a.func_46089_b())
        {
            entityaitaskentry2 = (EntityAITaskEntry)iterator2.next();
            if(flag)
            {
                System.out.println(entityaitaskentry2.field_46132_a.toString());
            }
        }

    }

    private boolean func_46136_a(EntityAITaskEntry p_46136_1_)
    {
label0:
        {
            Iterator iterator = field_46138_a.iterator();
            EntityAITaskEntry entityaitaskentry;
label1:
            do
            {
                do
                {
                    do
                    {
                        if(!iterator.hasNext())
                        {
                            break label0;
                        }
                        entityaitaskentry = (EntityAITaskEntry)iterator.next();
                    } while(entityaitaskentry == p_46136_1_);
                    if(p_46136_1_.field_46130_b < entityaitaskentry.field_46130_b)
                    {
                        continue label1;
                    }
                } while(!field_46137_b.contains(entityaitaskentry) || func_46135_a(p_46136_1_, entityaitaskentry));
                return false;
            } while(!field_46137_b.contains(entityaitaskentry) || entityaitaskentry.field_46132_a.func_46086_f());
            return false;
        }
        return true;
    }

    private boolean func_46135_a(EntityAITaskEntry p_46135_1_, EntityAITaskEntry p_46135_2_)
    {
        return (p_46135_1_.field_46132_a.func_46091_c() & p_46135_2_.field_46132_a.func_46091_c()) == 0;
    }
}
