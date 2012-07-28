// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, EntityLiving, 
//            MathHelper, Block, TileEntityChest, IInventory, 
//            ItemStack, EntityItem, NBTTagCompound, InventoryLargeChest, 
//            EntityPlayer, EntityOcelot, AxisAlignedBB, Entity, 
//            TileEntity

public class BlockChest extends BlockContainer
{

    private Random field_656_a;

    protected BlockChest(int p_i119_1_)
    {
        super(p_i119_1_, Material.field_524_c);
        field_656_a = new Random();
        field_575_bb = 26;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 22;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        func_35057_b(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        int i = p_250_1_.func_444_a(p_250_2_, p_250_3_, p_250_4_ - 1);
        int j = p_250_1_.func_444_a(p_250_2_, p_250_3_, p_250_4_ + 1);
        int k = p_250_1_.func_444_a(p_250_2_ - 1, p_250_3_, p_250_4_);
        int l = p_250_1_.func_444_a(p_250_2_ + 1, p_250_3_, p_250_4_);
        if(i == field_573_bc)
        {
            func_35057_b(p_250_1_, p_250_2_, p_250_3_, p_250_4_ - 1);
        }
        if(j == field_573_bc)
        {
            func_35057_b(p_250_1_, p_250_2_, p_250_3_, p_250_4_ + 1);
        }
        if(k == field_573_bc)
        {
            func_35057_b(p_250_1_, p_250_2_ - 1, p_250_3_, p_250_4_);
        }
        if(l == field_573_bc)
        {
            func_35057_b(p_250_1_, p_250_2_ + 1, p_250_3_, p_250_4_);
        }
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = p_4027_1_.func_444_a(p_4027_2_, p_4027_3_, p_4027_4_ - 1);
        int j = p_4027_1_.func_444_a(p_4027_2_, p_4027_3_, p_4027_4_ + 1);
        int k = p_4027_1_.func_444_a(p_4027_2_ - 1, p_4027_3_, p_4027_4_);
        int l = p_4027_1_.func_444_a(p_4027_2_ + 1, p_4027_3_, p_4027_4_);
        byte byte0 = 0;
        int i1 = MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3;
        if(i1 == 0)
        {
            byte0 = 2;
        }
        if(i1 == 1)
        {
            byte0 = 5;
        }
        if(i1 == 2)
        {
            byte0 = 3;
        }
        if(i1 == 3)
        {
            byte0 = 4;
        }
        if(i != field_573_bc && j != field_573_bc && k != field_573_bc && l != field_573_bc)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, byte0);
        } else
        {
            if((i == field_573_bc || j == field_573_bc) && (byte0 == 4 || byte0 == 5))
            {
                if(i == field_573_bc)
                {
                    p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_ - 1, byte0);
                } else
                {
                    p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_ + 1, byte0);
                }
                p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, byte0);
            }
            if((k == field_573_bc || l == field_573_bc) && (byte0 == 2 || byte0 == 3))
            {
                if(k == field_573_bc)
                {
                    p_4027_1_.func_511_b(p_4027_2_ - 1, p_4027_3_, p_4027_4_, byte0);
                } else
                {
                    p_4027_1_.func_511_b(p_4027_2_ + 1, p_4027_3_, p_4027_4_, byte0);
                }
                p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, byte0);
            }
        }
    }

    public void func_35057_b(World p_35057_1_, int p_35057_2_, int p_35057_3_, int p_35057_4_)
    {
        if(p_35057_1_.field_792_x)
        {
            return;
        }
        int i = p_35057_1_.func_444_a(p_35057_2_, p_35057_3_, p_35057_4_ - 1);
        int j = p_35057_1_.func_444_a(p_35057_2_, p_35057_3_, p_35057_4_ + 1);
        int k = p_35057_1_.func_444_a(p_35057_2_ - 1, p_35057_3_, p_35057_4_);
        int l = p_35057_1_.func_444_a(p_35057_2_ + 1, p_35057_3_, p_35057_4_);
        byte byte0 = 4;
        if(i == field_573_bc || j == field_573_bc)
        {
            int i1 = p_35057_1_.func_444_a(p_35057_2_ - 1, p_35057_3_, i != field_573_bc ? p_35057_4_ + 1 : p_35057_4_ - 1);
            int k1 = p_35057_1_.func_444_a(p_35057_2_ + 1, p_35057_3_, i != field_573_bc ? p_35057_4_ + 1 : p_35057_4_ - 1);
            byte0 = 5;
            int i2 = -1;
            if(i == field_573_bc)
            {
                i2 = p_35057_1_.func_446_b(p_35057_2_, p_35057_3_, p_35057_4_ - 1);
            } else
            {
                i2 = p_35057_1_.func_446_b(p_35057_2_, p_35057_3_, p_35057_4_ + 1);
            }
            if(i2 == 4)
            {
                byte0 = 4;
            }
            if((Block.field_540_p[k] || Block.field_540_p[i1]) && !Block.field_540_p[l] && !Block.field_540_p[k1])
            {
                byte0 = 5;
            }
            if((Block.field_540_p[l] || Block.field_540_p[k1]) && !Block.field_540_p[k] && !Block.field_540_p[i1])
            {
                byte0 = 4;
            }
        } else
        if(k == field_573_bc || l == field_573_bc)
        {
            int j1 = p_35057_1_.func_444_a(k != field_573_bc ? p_35057_2_ + 1 : p_35057_2_ - 1, p_35057_3_, p_35057_4_ - 1);
            int l1 = p_35057_1_.func_444_a(k != field_573_bc ? p_35057_2_ + 1 : p_35057_2_ - 1, p_35057_3_, p_35057_4_ + 1);
            byte0 = 3;
            int j2 = -1;
            if(k == field_573_bc)
            {
                j2 = p_35057_1_.func_446_b(p_35057_2_ - 1, p_35057_3_, p_35057_4_);
            } else
            {
                j2 = p_35057_1_.func_446_b(p_35057_2_ + 1, p_35057_3_, p_35057_4_);
            }
            if(j2 == 2)
            {
                byte0 = 2;
            }
            if((Block.field_540_p[i] || Block.field_540_p[j1]) && !Block.field_540_p[j] && !Block.field_540_p[l1])
            {
                byte0 = 3;
            }
            if((Block.field_540_p[j] || Block.field_540_p[l1]) && !Block.field_540_p[i] && !Block.field_540_p[j1])
            {
                byte0 = 2;
            }
        } else
        {
            byte0 = 3;
            if(Block.field_540_p[i] && !Block.field_540_p[j])
            {
                byte0 = 3;
            }
            if(Block.field_540_p[j] && !Block.field_540_p[i])
            {
                byte0 = 2;
            }
            if(Block.field_540_p[k] && !Block.field_540_p[l])
            {
                byte0 = 5;
            }
            if(Block.field_540_p[l] && !Block.field_540_p[k])
            {
                byte0 = 4;
            }
        }
        p_35057_1_.func_511_b(p_35057_2_, p_35057_3_, p_35057_4_, byte0);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb - 1;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb - 1;
        }
        if(p_241_1_ == 3)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        int i = 0;
        if(p_259_1_.func_444_a(p_259_2_ - 1, p_259_3_, p_259_4_) == field_573_bc)
        {
            i++;
        }
        if(p_259_1_.func_444_a(p_259_2_ + 1, p_259_3_, p_259_4_) == field_573_bc)
        {
            i++;
        }
        if(p_259_1_.func_444_a(p_259_2_, p_259_3_, p_259_4_ - 1) == field_573_bc)
        {
            i++;
        }
        if(p_259_1_.func_444_a(p_259_2_, p_259_3_, p_259_4_ + 1) == field_573_bc)
        {
            i++;
        }
        if(i > 1)
        {
            return false;
        }
        if(func_297_g(p_259_1_, p_259_2_ - 1, p_259_3_, p_259_4_))
        {
            return false;
        }
        if(func_297_g(p_259_1_, p_259_2_ + 1, p_259_3_, p_259_4_))
        {
            return false;
        }
        if(func_297_g(p_259_1_, p_259_2_, p_259_3_, p_259_4_ - 1))
        {
            return false;
        }
        return !func_297_g(p_259_1_, p_259_2_, p_259_3_, p_259_4_ + 1);
    }

    private boolean func_297_g(World p_297_1_, int p_297_2_, int p_297_3_, int p_297_4_)
    {
        if(p_297_1_.func_444_a(p_297_2_, p_297_3_, p_297_4_) != field_573_bc)
        {
            return false;
        }
        if(p_297_1_.func_444_a(p_297_2_ - 1, p_297_3_, p_297_4_) == field_573_bc)
        {
            return true;
        }
        if(p_297_1_.func_444_a(p_297_2_ + 1, p_297_3_, p_297_4_) == field_573_bc)
        {
            return true;
        }
        if(p_297_1_.func_444_a(p_297_2_, p_297_3_, p_297_4_ - 1) == field_573_bc)
        {
            return true;
        }
        return p_297_1_.func_444_a(p_297_2_, p_297_3_, p_297_4_ + 1) == field_573_bc;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
        TileEntityChest tileentitychest = (TileEntityChest)p_234_1_.func_451_k(p_234_2_, p_234_3_, p_234_4_);
        if(tileentitychest != null)
        {
            tileentitychest.func_35164_g();
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        TileEntityChest tileentitychest = (TileEntityChest)p_242_1_.func_451_k(p_242_2_, p_242_3_, p_242_4_);
        if(tileentitychest != null)
        {
            for(int i = 0; i < tileentitychest.func_83_a(); i++)
            {
                ItemStack itemstack = tileentitychest.func_82_a(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = field_656_a.nextFloat() * 0.8F + 0.1F;
                float f1 = field_656_a.nextFloat() * 0.8F + 0.1F;
                float f2 = field_656_a.nextFloat() * 0.8F + 0.1F;
                while(itemstack.field_853_a > 0) 
                {
                    int j = field_656_a.nextInt(21) + 10;
                    if(j > itemstack.field_853_a)
                    {
                        j = itemstack.field_853_a;
                    }
                    itemstack.field_853_a -= j;
                    EntityItem entityitem = new EntityItem(p_242_1_, (float)p_242_2_ + f, (float)p_242_3_ + f1, (float)p_242_4_ + f2, new ItemStack(itemstack.field_855_c, j, itemstack.func_21125_h()));
                    float f3 = 0.05F;
                    entityitem.field_319_o = (float)field_656_a.nextGaussian() * f3;
                    entityitem.field_318_p = (float)field_656_a.nextGaussian() * f3 + 0.2F;
                    entityitem.field_317_q = (float)field_656_a.nextGaussian() * f3;
                    if(itemstack.func_40608_n())
                    {
                        entityitem.field_429_a.func_40604_d((NBTTagCompound)itemstack.func_40607_o().func_40468_b());
                    }
                    p_242_1_.func_526_a(entityitem);
                }
            }

        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        Object obj = (TileEntityChest)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_);
        if(obj == null)
        {
            return true;
        }
        if(p_246_1_.func_445_d(p_246_2_, p_246_3_ + 1, p_246_4_))
        {
            return true;
        }
        if(func_50009_h(p_246_1_, p_246_2_, p_246_3_, p_246_4_))
        {
            return true;
        }
        if(p_246_1_.func_444_a(p_246_2_ - 1, p_246_3_, p_246_4_) == field_573_bc && (p_246_1_.func_445_d(p_246_2_ - 1, p_246_3_ + 1, p_246_4_) || func_50009_h(p_246_1_, p_246_2_ - 1, p_246_3_, p_246_4_)))
        {
            return true;
        }
        if(p_246_1_.func_444_a(p_246_2_ + 1, p_246_3_, p_246_4_) == field_573_bc && (p_246_1_.func_445_d(p_246_2_ + 1, p_246_3_ + 1, p_246_4_) || func_50009_h(p_246_1_, p_246_2_ + 1, p_246_3_, p_246_4_)))
        {
            return true;
        }
        if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_ - 1) == field_573_bc && (p_246_1_.func_445_d(p_246_2_, p_246_3_ + 1, p_246_4_ - 1) || func_50009_h(p_246_1_, p_246_2_, p_246_3_, p_246_4_ - 1)))
        {
            return true;
        }
        if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_ + 1) == field_573_bc && (p_246_1_.func_445_d(p_246_2_, p_246_3_ + 1, p_246_4_ + 1) || func_50009_h(p_246_1_, p_246_2_, p_246_3_, p_246_4_ + 1)))
        {
            return true;
        }
        if(p_246_1_.func_444_a(p_246_2_ - 1, p_246_3_, p_246_4_) == field_573_bc)
        {
            obj = new InventoryLargeChest("Large chest", (TileEntityChest)p_246_1_.func_451_k(p_246_2_ - 1, p_246_3_, p_246_4_), ((IInventory) (obj)));
        }
        if(p_246_1_.func_444_a(p_246_2_ + 1, p_246_3_, p_246_4_) == field_573_bc)
        {
            obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)p_246_1_.func_451_k(p_246_2_ + 1, p_246_3_, p_246_4_));
        }
        if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_ - 1) == field_573_bc)
        {
            obj = new InventoryLargeChest("Large chest", (TileEntityChest)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_ - 1), ((IInventory) (obj)));
        }
        if(p_246_1_.func_444_a(p_246_2_, p_246_3_, p_246_4_ + 1) == field_573_bc)
        {
            obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_ + 1));
        }
        if(p_246_1_.field_792_x)
        {
            return true;
        } else
        {
            p_246_5_.func_166_a(((IInventory) (obj)));
            return true;
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityChest();
    }

    private static boolean func_50009_h(World p_50009_0_, int p_50009_1_, int p_50009_2_, int p_50009_3_)
    {
        for(Iterator iterator = p_50009_0_.func_457_a(net.minecraft.src.EntityOcelot.class, AxisAlignedBB.func_693_b(p_50009_1_, p_50009_2_ + 1, p_50009_3_, p_50009_1_ + 1, p_50009_2_ + 2, p_50009_3_ + 1)).iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            EntityOcelot entityocelot = (EntityOcelot)entity;
            if(entityocelot.func_48371_v_())
            {
                return true;
            }
        }

        return false;
    }
}
