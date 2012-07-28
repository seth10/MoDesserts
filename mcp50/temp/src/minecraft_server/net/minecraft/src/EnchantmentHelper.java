// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ItemStack, NBTTagList, NBTTagCompound, Enchantment, 
//            IEnchantmentModifier, EnchantmentModifierDamage, InventoryPlayer, EnchantmentModifierLiving, 
//            Item, EnchantmentData, WeightedRandom, EnumEnchantmentType, 
//            DamageSource, EntityLiving

public class EnchantmentHelper
{

    private static final Random field_40647_a = new Random();
    private static final EnchantmentModifierDamage field_40645_b = new EnchantmentModifierDamage(null);
    private static final EnchantmentModifierLiving field_40646_c = new EnchantmentModifierLiving(null);

    public EnchantmentHelper()
    {
    }

    public static int func_40638_b(int p_40638_0_, ItemStack p_40638_1_)
    {
        if(p_40638_1_ == null)
        {
            return 0;
        }
        NBTTagList nbttaglist = p_40638_1_.func_40609_p();
        if(nbttaglist == null)
        {
            return 0;
        }
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.func_388_a(i)).func_406_c("id");
            short word1 = ((NBTTagCompound)nbttaglist.func_388_a(i)).func_406_c("lvl");
            if(word0 == p_40638_0_)
            {
                return word1;
            }
        }

        return 0;
    }

    private static int func_40639_a(int p_40639_0_, ItemStack p_40639_1_[])
    {
        int i = 0;
        ItemStack aitemstack[] = p_40639_1_;
        int j = aitemstack.length;
        for(int k = 0; k < j; k++)
        {
            ItemStack itemstack = aitemstack[k];
            int l = func_40638_b(p_40639_0_, itemstack);
            if(l > i)
            {
                i = l;
            }
        }

        return i;
    }

    private static void func_40627_a(IEnchantmentModifier p_40627_0_, ItemStack p_40627_1_)
    {
        if(p_40627_1_ == null)
        {
            return;
        }
        NBTTagList nbttaglist = p_40627_1_.func_40609_p();
        if(nbttaglist == null)
        {
            return;
        }
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.func_388_a(i)).func_406_c("id");
            short word1 = ((NBTTagCompound)nbttaglist.func_388_a(i)).func_406_c("lvl");
            if(Enchantment.field_40355_b[word0] != null)
            {
                p_40627_0_.func_40482_a(Enchantment.field_40355_b[word0], word1);
            }
        }

    }

    private static void func_40640_a(IEnchantmentModifier p_40640_0_, ItemStack p_40640_1_[])
    {
        ItemStack aitemstack[] = p_40640_1_;
        int i = aitemstack.length;
        for(int j = 0; j < i; j++)
        {
            ItemStack itemstack = aitemstack[j];
            func_40627_a(p_40640_0_, itemstack);
        }

    }

    public static int func_40634_a(InventoryPlayer p_40634_0_, DamageSource p_40634_1_)
    {
        field_40645_b.field_40484_a = 0;
        field_40645_b.field_40483_b = p_40634_1_;
        func_40640_a(field_40645_b, p_40634_0_.field_495_b);
        if(field_40645_b.field_40484_a > 25)
        {
            field_40645_b.field_40484_a = 25;
        }
        return (field_40645_b.field_40484_a + 1 >> 1) + field_40647_a.nextInt((field_40645_b.field_40484_a >> 1) + 1);
    }

    public static int func_40641_a(InventoryPlayer p_40641_0_, EntityLiving p_40641_1_)
    {
        field_40646_c.field_40486_a = 0;
        field_40646_c.field_40485_b = p_40641_1_;
        func_40627_a(field_40646_c, p_40641_0_.func_213_b());
        if(field_40646_c.field_40486_a > 0)
        {
            return 1 + field_40647_a.nextInt(field_40646_c.field_40486_a);
        } else
        {
            return 0;
        }
    }

    public static int func_40637_b(InventoryPlayer p_40637_0_, EntityLiving p_40637_1_)
    {
        return func_40638_b(Enchantment.field_40361_m.field_40368_t, p_40637_0_.func_213_b());
    }

    public static int func_40636_c(InventoryPlayer p_40636_0_, EntityLiving p_40636_1_)
    {
        return func_40638_b(Enchantment.field_40358_n.field_40368_t, p_40636_0_.func_213_b());
    }

    public static int func_40628_a(InventoryPlayer p_40628_0_)
    {
        return func_40639_a(Enchantment.field_40364_h.field_40368_t, p_40628_0_.field_495_b);
    }

    public static int func_40630_b(InventoryPlayer p_40630_0_)
    {
        return func_40638_b(Enchantment.field_40372_p.field_40368_t, p_40630_0_.func_213_b());
    }

    public static int func_40643_c(InventoryPlayer p_40643_0_)
    {
        return func_40638_b(Enchantment.field_40370_r.field_40368_t, p_40643_0_.func_213_b());
    }

    public static boolean func_40644_d(InventoryPlayer p_40644_0_)
    {
        return func_40638_b(Enchantment.field_40371_q.field_40368_t, p_40644_0_.func_213_b()) > 0;
    }

    public static int func_40635_e(InventoryPlayer p_40635_0_)
    {
        return func_40638_b(Enchantment.field_40369_s.field_40368_t, p_40635_0_.func_213_b());
    }

    public static int func_40633_f(InventoryPlayer p_40633_0_)
    {
        return func_40638_b(Enchantment.field_40359_o.field_40368_t, p_40633_0_.func_213_b());
    }

    public static boolean func_40632_g(InventoryPlayer p_40632_0_)
    {
        return func_40639_a(Enchantment.field_40365_i.field_40368_t, p_40632_0_.field_495_b) > 0;
    }

    public static int func_40642_a(Random p_40642_0_, int p_40642_1_, int p_40642_2_, ItemStack p_40642_3_)
    {
        Item item = p_40642_3_.func_569_a();
        int i = item.func_40224_c();
        if(i <= 0)
        {
            return 0;
        }
        if(p_40642_2_ > 30)
        {
            p_40642_2_ = 30;
        }
        p_40642_2_ = 1 + (p_40642_2_ >> 1) + p_40642_0_.nextInt(p_40642_2_ + 1);
        int j = p_40642_0_.nextInt(5) + p_40642_2_;
        if(p_40642_1_ == 0)
        {
            return (j >> 1) + 1;
        }
        if(p_40642_1_ == 1)
        {
            return (j * 2) / 3 + 1;
        } else
        {
            return j;
        }
    }

    public static void func_48622_a(Random p_48622_0_, ItemStack p_48622_1_, int p_48622_2_)
    {
        List list = func_40629_a(p_48622_0_, p_48622_1_, p_48622_2_);
        if(list != null)
        {
            EnchantmentData enchantmentdata;
            for(Iterator iterator = list.iterator(); iterator.hasNext(); p_48622_1_.func_40605_a(enchantmentdata.field_40494_a, enchantmentdata.field_40493_b))
            {
                enchantmentdata = (EnchantmentData)iterator.next();
            }

        }
    }

    public static List func_40629_a(Random p_40629_0_, ItemStack p_40629_1_, int p_40629_2_)
    {
        Item item = p_40629_1_.func_569_a();
        int i = item.func_40224_c();
        if(i <= 0)
        {
            return null;
        }
        i = 1 + p_40629_0_.nextInt((i >> 1) + 1) + p_40629_0_.nextInt((i >> 1) + 1);
        int j = i + p_40629_2_;
        float f = ((p_40629_0_.nextFloat() + p_40629_0_.nextFloat()) - 1.0F) * 0.25F;
        int k = (int)((float)j * (1.0F + f) + 0.5F);
        ArrayList arraylist = null;
        Map map = func_40631_a(k, p_40629_1_);
        if(map != null && !map.isEmpty())
        {
            EnchantmentData enchantmentdata = (EnchantmentData)WeightedRandom.func_35689_a(p_40629_0_, map.values());
            if(enchantmentdata != null)
            {
                arraylist = new ArrayList();
                arraylist.add(enchantmentdata);
                for(int l = k >> 1; p_40629_0_.nextInt(50) <= l; l >>= 1)
                {
                    Iterator iterator = map.keySet().iterator();
                    do
                    {
                        if(!iterator.hasNext())
                        {
                            break;
                        }
                        Integer integer = (Integer)iterator.next();
                        boolean flag = true;
                        Iterator iterator1 = arraylist.iterator();
                        do
                        {
                            if(!iterator1.hasNext())
                            {
                                break;
                            }
                            EnchantmentData enchantmentdata2 = (EnchantmentData)iterator1.next();
                            if(enchantmentdata2.field_40494_a.func_40343_a(Enchantment.field_40355_b[integer.intValue()]))
                            {
                                continue;
                            }
                            flag = false;
                            break;
                        } while(true);
                        if(!flag)
                        {
                            iterator.remove();
                        }
                    } while(true);
                    if(!map.isEmpty())
                    {
                        EnchantmentData enchantmentdata1 = (EnchantmentData)WeightedRandom.func_35689_a(p_40629_0_, map.values());
                        arraylist.add(enchantmentdata1);
                    }
                }

            }
        }
        return arraylist;
    }

    public static Map func_40631_a(int p_40631_0_, ItemStack p_40631_1_)
    {
        Item item = p_40631_1_.func_569_a();
        HashMap hashmap = null;
        Enchantment aenchantment[] = Enchantment.field_40355_b;
        int i = aenchantment.length;
        for(int j = 0; j < i; j++)
        {
            Enchantment enchantment = aenchantment[j];
            if(enchantment == null || !enchantment.field_40367_u.func_40525_a(item))
            {
                continue;
            }
            for(int k = enchantment.func_40347_c(); k <= enchantment.func_40344_a(); k++)
            {
                if(p_40631_0_ < enchantment.func_40345_a(k) || p_40631_0_ > enchantment.func_40342_b(k))
                {
                    continue;
                }
                if(hashmap == null)
                {
                    hashmap = new HashMap();
                }
                hashmap.put(Integer.valueOf(enchantment.field_40368_t), new EnchantmentData(enchantment, k));
            }

        }

        return hashmap;
    }

}
