package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class iv
{
  @GuardedBy("this")
  private BigInteger a = BigInteger.ONE;
  
  public final String a()
  {
    try
    {
      String str = this.a.toString();
      this.a = this.a.add(BigInteger.ONE);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.iv
 * JD-Core Version:    0.7.0.1
 */