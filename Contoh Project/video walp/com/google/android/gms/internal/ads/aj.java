package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

final class aj
  implements Runnable
{
  aj(ai paramai) {}
  
  public final void run()
  {
    if (!ai.a(this.a).get()) {
      return;
    }
    je.c("Timed out waiting for WebView to finish loading.");
    this.a.b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aj
 * JD-Core Version:    0.7.0.1
 */