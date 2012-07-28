// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, ChunkCoordinates, Vec3D, 
//            RandomPositionGenerator, PathNavigate

public class EntityAIMoveTwardsRestriction extends EntityAIBase
{

    private EntityCreature field_48152_a;
    private double field_48150_b;
    private double field_48151_c;
    private double field_48148_d;
    private float field_48149_e;

    public EntityAIMoveTwardsRestriction(EntityCreature p_i1024_1_, float p_i1024_2_)
    {
        field_48152_a = p_i1024_1_;
        field_48149_e = p_i1024_2_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_48152_a.func_48325_at())
        {
            return false;
        }
        ChunkCoordinates chunkcoordinates = field_48152_a.func_48323_au();
        Vec3D vec3d = RandomPositionGenerator.func_48395_a(field_48152_a, 16, 7, Vec3D.func_768_b(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48150_b = vec3d.field_1055_a;
            field_48151_c = vec3d.field_1054_b;
            field_48148_d = vec3d.field_1058_c;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return !field_48152_a.func_48333_ak().func_46034_b();
    }

    public void func_46088_e()
    {
        field_48152_a.func_48333_ak().func_48658_a(field_48150_b, field_48151_c, field_48148_d, field_48149_e);
    }
}
