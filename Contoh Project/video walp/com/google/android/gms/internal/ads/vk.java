package com.google.android.gms.internal.ads;

public final class vk
  extends abe<vk, a>
  implements acn
{
  private static volatile acx<vk> zzakh;
  private static final vk zzdix = new vk();
  private int zzdir;
  private vm zzdiv;
  
  static
  {
    abe.a(vk.class, zzdix);
  }
  
  public static vk a(zw paramzw)
  {
    return (vk)abe.a(zzdix, paramzw);
  }
  
  public final vm a()
  {
    if (this.zzdiv == null) {
      return vm.b();
    }
    return this.zzdiv;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vl.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vk();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdiv", "zzdir" };
        return a(zzdix, "", arrayOfObject);
        return zzdix;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdix);
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
    extends abe.a<vk, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vk
 * JD-Core Version:    0.7.0.1
 */