package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;

public final class kv
{
  public final String a;
  public final double b;
  public final int c;
  private final double d;
  private final double e;
  
  public kv(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    this.a = paramString;
    this.e = paramDouble1;
    this.d = paramDouble2;
    this.b = paramDouble3;
    this.c = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof kv)) {}
    kv localkv;
    do
    {
      return false;
      localkv = (kv)paramObject;
    } while ((!m.a(this.a, localkv.a)) || (this.d != localkv.d) || (this.e != localkv.e) || (this.c != localkv.c) || (Double.compare(this.b, localkv.b) != 0));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Double.valueOf(this.d);
    arrayOfObject[2] = Double.valueOf(this.e);
    arrayOfObject[3] = Double.valueOf(this.b);
    arrayOfObject[4] = Integer.valueOf(this.c);
    return m.a(arrayOfObject);
  }
  
  public final String toString()
  {
    return m.a(this).a("name", this.a).a("minBound", Double.valueOf(this.e)).a("maxBound", Double.valueOf(this.d)).a("percent", Double.valueOf(this.b)).a("count", Integer.valueOf(this.c)).toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kv
 * JD-Core Version:    0.7.0.1
 */