package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

@cm
final class im
{
  private long a = -1L;
  private long b = -1L;
  
  public final long a()
  {
    return this.b;
  }
  
  public final void b()
  {
    this.b = SystemClock.elapsedRealtime();
  }
  
  public final void c()
  {
    this.a = SystemClock.elapsedRealtime();
  }
  
  public final Bundle d()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("topen", this.a);
    localBundle.putLong("tclose", this.b);
    return localBundle;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.im
 * JD-Core Version:    0.7.0.1
 */