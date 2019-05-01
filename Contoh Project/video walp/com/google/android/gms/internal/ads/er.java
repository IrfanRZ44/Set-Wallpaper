package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final class er
  implements Runnable
{
  er(eo parameo, Future paramFuture) {}
  
  public final void run()
  {
    if (!this.a.isDone()) {
      this.a.cancel(true);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.er
 * JD-Core Version:    0.7.0.1
 */