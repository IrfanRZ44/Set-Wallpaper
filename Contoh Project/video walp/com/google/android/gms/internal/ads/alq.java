package com.google.android.gms.internal.ads;

public final class alq
{
  final long a;
  final String b;
  final int c;
  
  alq(long paramLong, String paramString, int paramInt)
  {
    this.a = paramLong;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof alq))) {
      return false;
    }
    return (((alq)paramObject).a == this.a) && (((alq)paramObject).c == this.c);
  }
  
  public final int hashCode()
  {
    return (int)this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alq
 * JD-Core Version:    0.7.0.1
 */