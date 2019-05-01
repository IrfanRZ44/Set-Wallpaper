package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ph
{
  private final int a;
  private final List<apr> b;
  private final int c;
  private final InputStream d;
  
  public ph(int paramInt, List<apr> paramList)
  {
    this(paramInt, paramList, -1, null);
  }
  
  public ph(int paramInt1, List<apr> paramList, int paramInt2, InputStream paramInputStream)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
    this.d = paramInputStream;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final List<apr> b()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final InputStream d()
  {
    return this.d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ph
 * JD-Core Version:    0.7.0.1
 */