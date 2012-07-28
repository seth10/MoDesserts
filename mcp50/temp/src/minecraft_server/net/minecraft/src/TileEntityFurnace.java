// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, BlockFurnace, FurnaceRecipes, 
//            Item, Block, Material, EntityPlayer

public class TileEntityFurnace extends TileEntity
    implements IInventory
{

    private ItemStack field_489_e[];
    public int field_488_f;
    public int field_487_g;
    public int field_486_h;

    public TileEntityFurnace()
    {
        field_489_e = new ItemStack[3];
        field_488_f = 0;
        field_487_g = 0;
        field_486_h = 0;
    }

    public int func_83_a()
    {
        return field_489_e.length;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_489_e[p_82_1_];
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_489_e[p_20069_1_] != null)
        {
            if(field_489_e[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_489_e[p_20069_1_];
                field_489_e[p_20069_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = field_489_e[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_489_e[p_20069_1_].field_853_a == 0)
            {
                field_489_e[p_20069_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(field_489_e[p_48315_1_] != null)
        {
            ItemStack itemstack = field_489_e[p_48315_1_];
            field_489_e[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_489_e[p_206_1_] = p_206_2_;
        if(p_206_2_ != null && p_206_2_.field_853_a > func_202_d())
        {
            p_206_2_.field_853_a = func_202_d();
        }
    }

    public String func_20068_b()
    {
        return "container.furnace";
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        NBTTagList nbttaglist = p_186_1_.func_407_k("Items");
        field_489_e = new ItemStack[func_83_a()];
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(i);
            byte byte0 = nbttagcompound.func_408_b("Slot");
            if(byte0 >= 0 && byte0 < field_489_e.length)
            {
                field_489_e[byte0] = ItemStack.func_35618_a(nbttagcompound);
            }
        }

        field_488_f = p_186_1_.func_406_c("BurnTime");
        field_486_h = p_186_1_.func_406_c("CookTime");
        field_487_g = func_194_a(field_489_e[1]);
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_394_a("BurnTime", (short)field_488_f);
        p_188_1_.func_394_a("CookTime", (short)field_486_h);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_489_e.length; i++)
        {
            if(field_489_e[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_409_a("Slot", (byte)i);
                field_489_e[i].func_570_a(nbttagcompound);
                nbttaglist.func_386_a(nbttagcompound);
            }
        }

        p_188_1_.func_399_a("Items", nbttaglist);
    }

    public int func_202_d()
    {
        return 64;
    }

    public boolean func_191_e()
    {
        return field_488_f > 0;
    }

    public void func_184_b()
    {
        boolean flag = field_488_f > 0;
        boolean flag1 = false;
        if(field_488_f > 0)
        {
            field_488_f--;
        }
        if(!field_479_a.field_792_x)
        {
            if(field_488_f == 0 && func_193_g())
            {
                field_487_g = field_488_f = func_194_a(field_489_e[1]);
                if(field_488_f > 0)
                {
                    flag1 = true;
                    if(field_489_e[1] != null)
                    {
                        field_489_e[1].field_853_a--;
                        if(field_489_e[1].field_853_a == 0)
                        {
                            field_489_e[1] = null;
                        }
                    }
                }
            }
            if(func_191_e() && func_193_g())
            {
                field_486_h++;
                if(field_486_h == 200)
                {
                    field_486_h = 0;
                    func_189_f();
                    flag1 = true;
                }
            } else
            {
                field_486_h = 0;
            }
            if(flag != (field_488_f > 0))
            {
                flag1 = true;
                BlockFurnace.func_295_a(field_488_f > 0, field_479_a, field_478_b, field_483_c, field_482_d);
            }
        }
        if(flag1)
        {
            func_183_c();
        }
    }

    private boolean func_193_g()
    {
        if(field_489_e[0] == null)
        {
            return false;
        }
        ItemStack itemstack = FurnaceRecipes.func_21162_a().func_21161_a(field_489_e[0].func_569_a().field_234_aS);
        if(itemstack == null)
        {
            return false;
        }
        if(field_489_e[2] == null)
        {
            return true;
        }
        if(!field_489_e[2].func_21127_a(itemstack))
        {
            return false;
        }
        if(field_489_e[2].field_853_a < func_202_d() && field_489_e[2].field_853_a < field_489_e[2].func_576_b())
        {
            return true;
        }
        return field_489_e[2].field_853_a < itemstack.func_576_b();
    }

    public void func_189_f()
    {
        if(!func_193_g())
        {
            return;
        }
        ItemStack itemstack = FurnaceRecipes.func_21162_a().func_21161_a(field_489_e[0].func_569_a().field_234_aS);
        if(field_489_e[2] == null)
        {
            field_489_e[2] = itemstack.func_578_d();
        } else
        if(field_489_e[2].field_855_c == itemstack.field_855_c)
        {
            field_489_e[2].field_853_a++;
        }
        field_489_e[0].field_853_a--;
        if(field_489_e[0].field_853_a <= 0)
        {
            field_489_e[0] = null;
        }
    }

    public static int func_194_a(ItemStack p_194_1_)
    {
        if(p_194_1_ == null)
        {
            return 0;
        }
        int i = p_194_1_.func_569_a().field_234_aS;
        if(i < 256 && Block.field_542_n[i].field_553_bn == Material.field_524_c)
        {
            return 300;
        }
        if(i == Item.field_209_B.field_234_aS)
        {
            return 100;
        }
        if(i == Item.field_168_k.field_234_aS)
        {
            return 1600;
        }
        if(i == Item.field_201_aw.field_234_aS)
        {
            return 20000;
        }
        if(i == Block.field_6047_y.field_573_bc)
        {
            return 100;
        }
        return i != Item.field_40239_bm.field_234_aS ? 0 : 2400;
    }

    public static boolean func_52006_b(ItemStack p_52006_0_)
    {
        return func_194_a(p_52006_0_) > 0;
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        if(field_479_a.func_451_k(field_478_b, field_483_c, field_482_d) != this)
        {
            return false;
        }
        return p_20067_1_.func_101_d((double)field_478_b + 0.5D, (double)field_483_c + 0.5D, (double)field_482_d + 0.5D) <= 64D;
    }

    public void func_35161_e()
    {
    }

    public void func_35162_t_()
    {
    }
}
