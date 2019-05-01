package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class aii
  implements Callable
{
  private final ahn a;
  private final zo b;
  
  public aii(ahn paramahn, zo paramzo)
  {
    this.a = paramahn;
    this.b = paramzo;
  }
  
  private final Void a()
  {
    if (this.a.l() != null) {
      this.a.l().get();
    }
    zo localzo1 = this.a.k();
    if (localzo1 != null) {
      try
      {
        synchronized (this.b)
        {
          afc.a(this.b, afc.a(localzo1));
        }
        return null;
      }
      catch (afb localafb) {}
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aii
 * JD-Core Version:    0.7.0.1
 */