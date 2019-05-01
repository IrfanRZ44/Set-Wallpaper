package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class tp
{
  private xc a;
  
  private tp(xc paramxc)
  {
    this.a = paramxc;
  }
  
  static final tp a(xc paramxc)
  {
    if ((paramxc == null) || (paramxc.c() <= 0)) {
      throw new GeneralSecurityException("empty keyset");
    }
    return new tp(paramxc);
  }
  
  final xc a()
  {
    return this.a;
  }
  
  public final String toString()
  {
    return tx.a(this.a).toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tp
 * JD-Core Version:    0.7.0.1
 */