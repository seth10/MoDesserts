// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            World, Block, BlockRail, ChunkPosition

class RailLogic
{

    private World field_887_b;
    private int field_893_c;
    private int field_892_d;
    private int field_891_e;
    private final boolean field_27084_f;
    private List field_889_g;
    final BlockRail field_888_a; /* synthetic field */

    public RailLogic(BlockRail p_i522_1_, World p_i522_2_, int p_i522_3_, int p_i522_4_, int p_i522_5_)
    {
        field_888_a = p_i522_1_;
        super();
        field_889_g = new ArrayList();
        field_887_b = p_i522_2_;
        field_893_c = p_i522_3_;
        field_892_d = p_i522_4_;
        field_891_e = p_i522_5_;
        int i = p_i522_2_.func_444_a(p_i522_3_, p_i522_4_, p_i522_5_);
        int j = p_i522_2_.func_446_b(p_i522_3_, p_i522_4_, p_i522_5_);
        if(BlockRail.func_27033_a((BlockRail)Block.field_542_n[i]))
        {
            field_27084_f = true;
            j &= -9;
        } else
        {
            field_27084_f = false;
        }
        func_27083_a(j);
    }

    private void func_27083_a(int p_27083_1_)
    {
        field_889_g.clear();
        if(p_27083_1_ == 0)
        {
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e - 1));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e + 1));
        } else
        if(p_27083_1_ == 1)
        {
            field_889_g.add(new ChunkPosition(field_893_c - 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c + 1, field_892_d, field_891_e));
        } else
        if(p_27083_1_ == 2)
        {
            field_889_g.add(new ChunkPosition(field_893_c - 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c + 1, field_892_d + 1, field_891_e));
        } else
        if(p_27083_1_ == 3)
        {
            field_889_g.add(new ChunkPosition(field_893_c - 1, field_892_d + 1, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c + 1, field_892_d, field_891_e));
        } else
        if(p_27083_1_ == 4)
        {
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d + 1, field_891_e - 1));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e + 1));
        } else
        if(p_27083_1_ == 5)
        {
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e - 1));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d + 1, field_891_e + 1));
        } else
        if(p_27083_1_ == 6)
        {
            field_889_g.add(new ChunkPosition(field_893_c + 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e + 1));
        } else
        if(p_27083_1_ == 7)
        {
            field_889_g.add(new ChunkPosition(field_893_c - 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e + 1));
        } else
        if(p_27083_1_ == 8)
        {
            field_889_g.add(new ChunkPosition(field_893_c - 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e - 1));
        } else
        if(p_27083_1_ == 9)
        {
            field_889_g.add(new ChunkPosition(field_893_c + 1, field_892_d, field_891_e));
            field_889_g.add(new ChunkPosition(field_893_c, field_892_d, field_891_e - 1));
        }
    }

    private void func_591_b()
    {
        for(int i = 0; i < field_889_g.size(); i++)
        {
            RailLogic raillogic = func_595_a((ChunkPosition)field_889_g.get(i));
            if(raillogic == null || !raillogic.func_590_b(this))
            {
                field_889_g.remove(i--);
            } else
            {
                field_889_g.set(i, new ChunkPosition(raillogic.field_893_c, raillogic.field_892_d, raillogic.field_891_e));
            }
        }

    }

    private boolean func_589_a(int p_589_1_, int p_589_2_, int p_589_3_)
    {
        if(BlockRail.func_27029_g(field_887_b, p_589_1_, p_589_2_, p_589_3_))
        {
            return true;
        }
        if(BlockRail.func_27029_g(field_887_b, p_589_1_, p_589_2_ + 1, p_589_3_))
        {
            return true;
        }
        return BlockRail.func_27029_g(field_887_b, p_589_1_, p_589_2_ - 1, p_589_3_);
    }

    private RailLogic func_595_a(ChunkPosition p_595_1_)
    {
        if(BlockRail.func_27029_g(field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b, p_595_1_.field_847_c))
        {
            return new RailLogic(field_888_a, field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b, p_595_1_.field_847_c);
        }
        if(BlockRail.func_27029_g(field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b + 1, p_595_1_.field_847_c))
        {
            return new RailLogic(field_888_a, field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b + 1, p_595_1_.field_847_c);
        }
        if(BlockRail.func_27029_g(field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b - 1, p_595_1_.field_847_c))
        {
            return new RailLogic(field_888_a, field_887_b, p_595_1_.field_846_a, p_595_1_.field_845_b - 1, p_595_1_.field_847_c);
        } else
        {
            return null;
        }
    }

    private boolean func_590_b(RailLogic p_590_1_)
    {
        for(int i = 0; i < field_889_g.size(); i++)
        {
            ChunkPosition chunkposition = (ChunkPosition)field_889_g.get(i);
            if(chunkposition.field_846_a == p_590_1_.field_893_c && chunkposition.field_847_c == p_590_1_.field_891_e)
            {
                return true;
            }
        }

        return false;
    }

    private boolean func_599_b(int p_599_1_, int p_599_2_, int p_599_3_)
    {
        for(int i = 0; i < field_889_g.size(); i++)
        {
            ChunkPosition chunkposition = (ChunkPosition)field_889_g.get(i);
            if(chunkposition.field_846_a == p_599_1_ && chunkposition.field_847_c == p_599_3_)
            {
                return true;
            }
        }

        return false;
    }

    private int func_594_c()
    {
        int i = 0;
        if(func_589_a(field_893_c, field_892_d, field_891_e - 1))
        {
            i++;
        }
        if(func_589_a(field_893_c, field_892_d, field_891_e + 1))
        {
            i++;
        }
        if(func_589_a(field_893_c - 1, field_892_d, field_891_e))
        {
            i++;
        }
        if(func_589_a(field_893_c + 1, field_892_d, field_891_e))
        {
            i++;
        }
        return i;
    }

    private boolean func_597_c(RailLogic p_597_1_)
    {
        if(func_590_b(p_597_1_))
        {
            return true;
        }
        if(field_889_g.size() == 2)
        {
            return false;
        }
        if(field_889_g.size() == 0)
        {
            return true;
        }
        ChunkPosition chunkposition = (ChunkPosition)field_889_g.get(0);
        return p_597_1_.field_892_d != field_892_d || chunkposition.field_845_b != field_892_d ? true : true;
    }

    private void func_598_d(RailLogic p_598_1_)
    {
        field_889_g.add(new ChunkPosition(p_598_1_.field_893_c, p_598_1_.field_892_d, p_598_1_.field_891_e));
        boolean flag = func_599_b(field_893_c, field_892_d, field_891_e - 1);
        boolean flag1 = func_599_b(field_893_c, field_892_d, field_891_e + 1);
        boolean flag2 = func_599_b(field_893_c - 1, field_892_d, field_891_e);
        boolean flag3 = func_599_b(field_893_c + 1, field_892_d, field_891_e);
        byte byte0 = -1;
        if(flag || flag1)
        {
            byte0 = 0;
        }
        if(flag2 || flag3)
        {
            byte0 = 1;
        }
        if(!field_27084_f)
        {
            if(flag1 && flag3 && !flag && !flag2)
            {
                byte0 = 6;
            }
            if(flag1 && flag2 && !flag && !flag3)
            {
                byte0 = 7;
            }
            if(flag && flag2 && !flag1 && !flag3)
            {
                byte0 = 8;
            }
            if(flag && flag3 && !flag1 && !flag2)
            {
                byte0 = 9;
            }
        }
        if(byte0 == 0)
        {
            if(BlockRail.func_27029_g(field_887_b, field_893_c, field_892_d + 1, field_891_e - 1))
            {
                byte0 = 4;
            }
            if(BlockRail.func_27029_g(field_887_b, field_893_c, field_892_d + 1, field_891_e + 1))
            {
                byte0 = 5;
            }
        }
        if(byte0 == 1)
        {
            if(BlockRail.func_27029_g(field_887_b, field_893_c + 1, field_892_d + 1, field_891_e))
            {
                byte0 = 2;
            }
            if(BlockRail.func_27029_g(field_887_b, field_893_c - 1, field_892_d + 1, field_891_e))
            {
                byte0 = 3;
            }
        }
        if(byte0 < 0)
        {
            byte0 = 0;
        }
        int i = byte0;
        if(field_27084_f)
        {
            i = field_887_b.func_446_b(field_893_c, field_892_d, field_891_e) & 8 | byte0;
        }
        field_887_b.func_511_b(field_893_c, field_892_d, field_891_e, i);
    }

    private boolean func_592_c(int p_592_1_, int p_592_2_, int p_592_3_)
    {
        RailLogic raillogic = func_595_a(new ChunkPosition(p_592_1_, p_592_2_, p_592_3_));
        if(raillogic == null)
        {
            return false;
        } else
        {
            raillogic.func_591_b();
            return raillogic.func_597_c(this);
        }
    }

    public void func_596_a(boolean p_596_1_, boolean p_596_2_)
    {
        boolean flag = func_592_c(field_893_c, field_892_d, field_891_e - 1);
        boolean flag1 = func_592_c(field_893_c, field_892_d, field_891_e + 1);
        boolean flag2 = func_592_c(field_893_c - 1, field_892_d, field_891_e);
        boolean flag3 = func_592_c(field_893_c + 1, field_892_d, field_891_e);
        byte byte0 = -1;
        if((flag || flag1) && !flag2 && !flag3)
        {
            byte0 = 0;
        }
        if((flag2 || flag3) && !flag && !flag1)
        {
            byte0 = 1;
        }
        if(!field_27084_f)
        {
            if(flag1 && flag3 && !flag && !flag2)
            {
                byte0 = 6;
            }
            if(flag1 && flag2 && !flag && !flag3)
            {
                byte0 = 7;
            }
            if(flag && flag2 && !flag1 && !flag3)
            {
                byte0 = 8;
            }
            if(flag && flag3 && !flag1 && !flag2)
            {
                byte0 = 9;
            }
        }
        if(byte0 == -1)
        {
            if(flag || flag1)
            {
                byte0 = 0;
            }
            if(flag2 || flag3)
            {
                byte0 = 1;
            }
            if(!field_27084_f)
            {
                if(p_596_1_)
                {
                    if(flag1 && flag3)
                    {
                        byte0 = 6;
                    }
                    if(flag2 && flag1)
                    {
                        byte0 = 7;
                    }
                    if(flag3 && flag)
                    {
                        byte0 = 9;
                    }
                    if(flag && flag2)
                    {
                        byte0 = 8;
                    }
                } else
                {
                    if(flag && flag2)
                    {
                        byte0 = 8;
                    }
                    if(flag3 && flag)
                    {
                        byte0 = 9;
                    }
                    if(flag2 && flag1)
                    {
                        byte0 = 7;
                    }
                    if(flag1 && flag3)
                    {
                        byte0 = 6;
                    }
                }
            }
        }
        if(byte0 == 0)
        {
            if(BlockRail.func_27029_g(field_887_b, field_893_c, field_892_d + 1, field_891_e - 1))
            {
                byte0 = 4;
            }
            if(BlockRail.func_27029_g(field_887_b, field_893_c, field_892_d + 1, field_891_e + 1))
            {
                byte0 = 5;
            }
        }
        if(byte0 == 1)
        {
            if(BlockRail.func_27029_g(field_887_b, field_893_c + 1, field_892_d + 1, field_891_e))
            {
                byte0 = 2;
            }
            if(BlockRail.func_27029_g(field_887_b, field_893_c - 1, field_892_d + 1, field_891_e))
            {
                byte0 = 3;
            }
        }
        if(byte0 < 0)
        {
            byte0 = 0;
        }
        func_27083_a(byte0);
        int i = byte0;
        if(field_27084_f)
        {
            i = field_887_b.func_446_b(field_893_c, field_892_d, field_891_e) & 8 | byte0;
        }
        if(p_596_2_ || field_887_b.func_446_b(field_893_c, field_892_d, field_891_e) != i)
        {
            field_887_b.func_511_b(field_893_c, field_892_d, field_891_e, i);
            for(int j = 0; j < field_889_g.size(); j++)
            {
                RailLogic raillogic = func_595_a((ChunkPosition)field_889_g.get(j));
                if(raillogic == null)
                {
                    continue;
                }
                raillogic.func_591_b();
                if(raillogic.func_597_c(this))
                {
                    raillogic.func_598_d(this);
                }
            }

        }
    }

    static int func_600_a(RailLogic p_600_0_)
    {
        return p_600_0_.func_594_c();
    }
}
