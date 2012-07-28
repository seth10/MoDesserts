// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IBlockAccess, World, Chunk, Material, 
//            Block, TileEntity

public class ChunkCache
    implements IBlockAccess
{

    private int field_823_a;
    private int field_822_b;
    private Chunk field_825_c[][];
    private boolean field_48098_d;
    private World field_824_d;

    public ChunkCache(World p_i125_1_, int p_i125_2_, int p_i125_3_, int p_i125_4_, int p_i125_5_, int p_i125_6_, int p_i125_7_)
    {
        field_824_d = p_i125_1_;
        field_823_a = p_i125_2_ >> 4;
        field_822_b = p_i125_4_ >> 4;
        int i = p_i125_5_ >> 4;
        int j = p_i125_7_ >> 4;
        field_825_c = new Chunk[(i - field_823_a) + 1][(j - field_822_b) + 1];
        field_48098_d = true;
        for(int k = field_823_a; k <= i; k++)
        {
            for(int l = field_822_b; l <= j; l++)
            {
                Chunk chunk = p_i125_1_.func_525_b(k, l);
                if(chunk == null)
                {
                    continue;
                }
                field_825_c[k - field_823_a][l - field_822_b] = chunk;
                if(!chunk.func_48556_c(p_i125_3_, p_i125_6_))
                {
                    field_48098_d = false;
                }
            }

        }

    }

    public int func_444_a(int p_444_1_, int p_444_2_, int p_444_3_)
    {
        if(p_444_2_ < 0)
        {
            return 0;
        }
        if(p_444_2_ >= 256)
        {
            return 0;
        }
        int i = (p_444_1_ >> 4) - field_823_a;
        int j = (p_444_3_ >> 4) - field_822_b;
        if(i < 0 || i >= field_825_c.length || j < 0 || j >= field_825_c[i].length)
        {
            return 0;
        }
        Chunk chunk = field_825_c[i][j];
        if(chunk == null)
        {
            return 0;
        } else
        {
            return chunk.func_344_a(p_444_1_ & 0xf, p_444_2_, p_444_3_ & 0xf);
        }
    }

    public TileEntity func_451_k(int p_451_1_, int p_451_2_, int p_451_3_)
    {
        int i = (p_451_1_ >> 4) - field_823_a;
        int j = (p_451_3_ >> 4) - field_822_b;
        return field_825_c[i][j].func_338_d(p_451_1_ & 0xf, p_451_2_, p_451_3_ & 0xf);
    }

    public int func_446_b(int p_446_1_, int p_446_2_, int p_446_3_)
    {
        if(p_446_2_ < 0)
        {
            return 0;
        }
        if(p_446_2_ >= 256)
        {
            return 0;
        } else
        {
            int i = (p_446_1_ >> 4) - field_823_a;
            int j = (p_446_3_ >> 4) - field_822_b;
            return field_825_c[i][j].func_356_b(p_446_1_ & 0xf, p_446_2_, p_446_3_ & 0xf);
        }
    }

    public Material func_443_c(int p_443_1_, int p_443_2_, int p_443_3_)
    {
        int i = func_444_a(p_443_1_, p_443_2_, p_443_3_);
        if(i == 0)
        {
            return Material.field_526_a;
        } else
        {
            return Block.field_542_n[i].field_553_bn;
        }
    }

    public boolean func_445_d(int p_445_1_, int p_445_2_, int p_445_3_)
    {
        Block block = Block.field_542_n[func_444_a(p_445_1_, p_445_2_, p_445_3_)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.field_553_bn.func_218_c() && block.func_28025_b();
        }
    }
}
