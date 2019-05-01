package com.google.android.gms.internal.ads;

public final class wp
  extends abe<wp, a>
  implements acn
{
  private static volatile acx<wp> zzakh;
  private static final wp zzdko = new wp();
  private int zzdir;
  private wr zzdkm;
  
  static
  {
    abe.a(wp.class, zzdko);
  }
  
  public static wp a(zw paramzw)
  {
    return (wp)abe.a(zzdko, paramzw);
  }
  
  public static wp c()
  {
    return zzdko;
  }
  
  public final wr a()
  {
    if (this.zzdkm == null) {
      return wr.c();
    }
    return this.zzdkm;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wq.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wp();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdkm", "zzdir" };
        return a(zzdko, "", arrayOfObject);
        return zzdko;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdko);
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
  
  public final int b()
  {
    return this.zzdir;
  }
  
  public static final class a
    extends abe.a<wp, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wp
 * JD-Core Version:    0.7.0.1
 */