package com.google.android.gms.internal.ads;

public final class wr
  extends abe<wr, a>
  implements acn
{
  private static volatile acx<wr> zzakh;
  private static final wr zzdkr = new wr();
  private int zzdkp;
  private int zzdkq;
  
  static
  {
    abe.a(wr.class, zzdkr);
  }
  
  public static wr c()
  {
    return zzdkr;
  }
  
  public final wl a()
  {
    wl localwl = wl.a(this.zzdkp);
    if (localwl == null) {
      localwl = wl.d;
    }
    return localwl;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (ws.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wr();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdkp", "zzdkq" };
        return a(zzdkr, "", arrayOfObject);
        return zzdkr;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdkr);
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
    return this.zzdkq;
  }
  
  public static final class a
    extends abe.a<wr, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wr
 * JD-Core Version:    0.7.0.1
 */