// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityCow, EntityPlayer, InventoryPlayer, ItemStack, 
//            Item, PlayerCapabilities, ItemShears, World, 
//            EntityItem, Block, EntityAnimal

public class EntityMooshroom extends EntityCow
{

    public EntityMooshroom(World p_i462_1_)
    {
        super(p_i462_1_);
        field_9119_aG = "/mob/redcow.png";
        func_113_a(0.9F, 1.3F);
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(itemstack != null && itemstack.field_855_c == Item.field_4173_C.field_234_aS && func_48351_J() >= 0)
        {
            if(itemstack.field_853_a == 1)
            {
                p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, new ItemStack(Item.field_4172_D));
                return true;
            }
            if(p_6092_1_.field_416_aj.func_201_a(new ItemStack(Item.field_4172_D)) && !p_6092_1_.field_35214_K.field_35657_d)
            {
                p_6092_1_.field_416_aj.func_20069_a(p_6092_1_.field_416_aj.field_499_d, 1);
                return true;
            }
        }
        if(itemstack != null && itemstack.field_855_c == Item.field_31022_bc.field_234_aS && func_48351_J() >= 0)
        {
            func_118_j();
            field_9093_l.func_514_a("largeexplode", field_322_l, field_321_m + (double)(field_298_E / 2.0F), field_320_n, 0.0D, 0.0D, 0.0D);
            if(!field_9093_l.field_792_x)
            {
                EntityCow entitycow = new EntityCow(field_9093_l);
                entitycow.func_107_c(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
                entitycow.func_40103_i(func_40097_ai());
                entitycow.field_9095_az = field_9095_az;
                field_9093_l.func_526_a(entitycow);
                for(int i = 0; i < 5; i++)
                {
                    field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m + (double)field_298_E, field_320_n, new ItemStack(Block.field_4069_ah)));
                }

            }
            return true;
        } else
        {
            return super.func_6092_a(p_6092_1_);
        }
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        return new EntityMooshroom(field_9093_l);
    }
}
