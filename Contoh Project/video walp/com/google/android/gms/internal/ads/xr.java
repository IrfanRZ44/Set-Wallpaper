package com.google.android.gms.internal.ads;

import java.util.List;

public final class xr
  extends abe<xr, a>
  implements acn
{
  private static volatile acx<xr> zzakh;
  private static final xr zzdmt = new xr();
  private int zzdlq;
  private String zzdmr = "";
  private abj<xa> zzdms = m();
  
  static
  {
    abe.a(xr.class, zzdmt);
  }
  
  private final void a(xa paramxa)
  {
    if (paramxa == null) {
      throw new NullPointerException();
    }
    abj localabj;
    int i;
    if (!this.zzdms.a())
    {
      localabj = this.zzdms;
      i = localabj.size();
      if (i != 0) {
        break label70;
      }
    }
    label70:
    for (int j = 10;; j = i << 1)
    {
      this.zzdms = localabj.a(j);
      this.zzdms.add(paramxa);
      return;
    }
  }
  
  private final void a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.zzdmr = paramString;
  }
  
  public static a b()
  {
    return (a)zzdmt.a(abe.e.e, null, null);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xs.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xr();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdlq", "zzdmr", "zzdms", xa.class };
        return a(zzdmt, "", arrayOfObject);
        return zzdmt;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdmt);
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
  
  public final List<xa> a()
  {
    return this.zzdms;
  }
  
  public static final class a
    extends abe.a<xr, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(xa paramxa)
    {
      b();
      xr.a((xr)this.a, paramxa);
      return this;
    }
    
    public final a a(String paramString)
    {
      b();
      xr.a((xr)this.a, paramString);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xr
 * JD-Core Version:    0.7.0.1
 */