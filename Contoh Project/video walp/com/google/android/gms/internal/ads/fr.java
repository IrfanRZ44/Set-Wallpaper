package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.m;

@cm
public final class fr
  extends fx
{
  private final String a;
  private final int b;
  
  public fr(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof fr))) {}
    fr localfr;
    do
    {
      return false;
      localfr = (fr)paramObject;
    } while ((!m.a(this.a, localfr.a)) || (!m.a(Integer.valueOf(this.b), Integer.valueOf(localfr.b))));
    return true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fr
 * JD-Core Version:    0.7.0.1
 */