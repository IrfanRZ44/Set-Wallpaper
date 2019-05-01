package com.google.android.gms.internal.ads;

public final class vy
  extends abe<vy, a>
  implements acn
{
  private static volatile acx<vy> zzakh;
  private static final vy zzdjk = new vy();
  private wa zzdjj;
  
  static
  {
    abe.a(vy.class, zzdjk);
  }
  
  public static vy a(zw paramzw)
  {
    return (vy)abe.a(zzdjk, paramzw);
  }
  
  public final wa a()
  {
    if (this.zzdjj == null) {
      return wa.d();
    }
    return this.zzdjj;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vz.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vy();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdjj" };
        return a(zzdjk, "", arrayOfObject);
        return zzdjk;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdjk);
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
  
  public static final class a
    extends abe.a<vy, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vy
 * JD-Core Version:    0.7.0.1
 */