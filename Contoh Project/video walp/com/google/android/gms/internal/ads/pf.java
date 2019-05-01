package com.google.android.gms.internal.ads;

import android.os.Handler;

@cm
final class pf
  implements Runnable
{
  private op a;
  private boolean b = false;
  
  pf(op paramop)
  {
    this.a = paramop;
  }
  
  private final void c()
  {
    jn.a.removeCallbacks(this);
    jn.a.postDelayed(this, 250L);
  }
  
  public final void a()
  {
    this.b = true;
  }
  
  public final void b()
  {
    this.b = false;
    c();
  }
  
  public final void run()
  {
    if (!this.b)
    {
      this.a.o();
      c();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pf
 * JD-Core Version:    0.7.0.1
 */