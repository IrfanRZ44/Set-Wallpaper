package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import javax.annotation.concurrent.GuardedBy;

@cm
public abstract class ak
  extends iz
{
  protected final ap a;
  protected final Context b;
  protected final Object c = new Object();
  protected final Object d = new Object();
  protected final ik e;
  @GuardedBy("mLock")
  protected zzaej f;
  
  protected ak(Context paramContext, ik paramik, ap paramap)
  {
    super(true);
    this.b = paramContext;
    this.e = paramik;
    this.f = paramik.b;
    this.a = paramap;
  }
  
  protected abstract ij a(int paramInt);
  
  public final void a()
  {
    for (;;)
    {
      int j;
      synchronized (this.c)
      {
        je.b("AdRendererBackgroundTask started.");
        int i = this.e.e;
        try
        {
          a(SystemClock.elapsedRealtime());
          ij localij = a(i);
          jn.a.post(new am(this, localij));
          return;
        }
        catch (an localan)
        {
          j = localan.a();
          if (j == 3) {
            continue;
          }
        }
        if (j == -1)
        {
          je.d(localan.getMessage());
          if (this.f == null)
          {
            this.f = new zzaej(j);
            jn.a.post(new al(this));
            i = j;
          }
        }
        else
        {
          je.e(localan.getMessage());
        }
      }
      this.f = new zzaej(j, this.f.j);
    }
  }
  
  protected abstract void a(long paramLong);
  
  public void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ak
 * JD-Core Version:    0.7.0.1
 */