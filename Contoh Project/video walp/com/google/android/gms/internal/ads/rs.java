package com.google.android.gms.internal.ads;

@cm
public final class rs
{
  public final int a;
  public final int b;
  private final int c;
  
  private rs(int paramInt1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.b = paramInt2;
    this.a = paramInt3;
  }
  
  public static rs a()
  {
    return new rs(0, 0, 0);
  }
  
  public static rs a(int paramInt1, int paramInt2)
  {
    return new rs(1, paramInt1, paramInt2);
  }
  
  public static rs a(zzjn paramzzjn)
  {
    if (paramzzjn.d) {
      return new rs(3, 0, 0);
    }
    if (paramzzjn.i) {
      return new rs(2, 0, 0);
    }
    if (paramzzjn.h) {
      return a();
    }
    return a(paramzzjn.f, paramzzjn.c);
  }
  
  public static rs b()
  {
    return new rs(4, 0, 0);
  }
  
  public final boolean c()
  {
    return this.c == 2;
  }
  
  public final boolean d()
  {
    return this.c == 3;
  }
  
  public final boolean e()
  {
    return this.c == 0;
  }
  
  public final boolean f()
  {
    return this.c == 4;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rs
 * JD-Core Version:    0.7.0.1
 */