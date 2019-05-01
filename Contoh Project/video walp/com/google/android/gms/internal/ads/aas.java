package com.google.android.gms.internal.ads;

final class aas
{
  private final Object a;
  private final int b;
  
  aas(Object paramObject, int paramInt)
  {
    this.a = paramObject;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aas)) {}
    aas localaas;
    do
    {
      return false;
      localaas = (aas)paramObject;
    } while ((this.a != localaas.a) || (this.b != localaas.b));
    return true;
  }
  
  public final int hashCode()
  {
    return 65535 * System.identityHashCode(this.a) + this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aas
 * JD-Core Version:    0.7.0.1
 */