package com.google.android.gms.internal.ads;

import android.content.Context;

final class jp
  implements Runnable
{
  jp(jn paramjn, Context paramContext) {}
  
  public final void run()
  {
    synchronized (jn.a(this.b))
    {
      jn.a(this.b, jn.d(this.a));
      jn.a(this.b).notifyAll();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jp
 * JD-Core Version:    0.7.0.1
 */