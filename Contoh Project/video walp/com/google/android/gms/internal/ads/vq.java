package com.google.android.gms.internal.ads;

public final class vq
  extends abe<vq, a>
  implements acn
{
  private static volatile acx<vq> zzakh;
  private static final vq zzdja = new vq();
  private int zzdir;
  
  static
  {
    abe.a(vq.class, zzdja);
  }
  
  public static vq a(zw paramzw)
  {
    return (vq)abe.a(zzdja, paramzw);
  }
  
  public final int a()
  {
    return this.zzdir;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vr.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vq();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdir" };
        return a(zzdja, "", arrayOfObject);
        return zzdja;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdja);
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
    extends abe.a<vq, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vq
 * JD-Core Version:    0.7.0.1
 */