package com.google.android.gms.internal.ads;

public final class wg
  extends abe<wg, a>
  implements acn
{
  private static volatile acx<wg> zzakh;
  private static final wg zzdjx = new wg();
  private int zzdju;
  private int zzdjv;
  private zw zzdjw = zw.a;
  
  static
  {
    abe.a(wg.class, zzdjx);
  }
  
  public static wg d()
  {
    return zzdjx;
  }
  
  public final wi a()
  {
    wi localwi = wi.a(this.zzdju);
    if (localwi == null) {
      localwi = wi.d;
    }
    return localwi;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wh.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wg();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdju", "zzdjv", "zzdjw" };
        return a(zzdjx, "", arrayOfObject);
        return zzdjx;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdjx);
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
  
  public final wl b()
  {
    wl localwl = wl.a(this.zzdjv);
    if (localwl == null) {
      localwl = wl.d;
    }
    return localwl;
  }
  
  public final zw c()
  {
    return this.zzdjw;
  }
  
  public static final class a
    extends abe.a<wg, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wg
 * JD-Core Version:    0.7.0.1
 */