package com.google.android.gms.internal.ads;

public final class wy
  extends abe<wy, a>
  implements acn
{
  private static volatile acx<wy> zzakh;
  private static final wy zzdlk = new wy();
  private String zzdks = "";
  private zw zzdkt = zw.a;
  private int zzdlj;
  
  static
  {
    abe.a(wy.class, zzdlk);
  }
  
  public static wy c()
  {
    return zzdlk;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wz.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wy();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdks", "zzdkt", "zzdlj" };
        return a(zzdlk, "", arrayOfObject);
        return zzdlk;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdlk);
          zzakh = (acx)localObject3;
        }
        return localObject3;
      }
      finally {}
    case 6: 
      return Byte.valueOf((byte)1);
    }
    return null;
  }
  
  public final String a()
  {
    return this.zzdks;
  }
  
  public final zw b()
  {
    return this.zzdkt;
  }
  
  public static final class a
    extends abe.a<wy, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wy
 * JD-Core Version:    0.7.0.1
 */