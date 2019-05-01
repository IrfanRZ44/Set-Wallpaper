package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.c.b;

@cm
public final class dj
  extends de
  implements c.a, c.b
{
  private Context a;
  private zzang b;
  private nr<zzaef> c;
  private final dc d;
  private final Object e = new Object();
  private dk f;
  
  public dj(Context paramContext, zzang paramzzang, nr<zzaef> paramnr, dc paramdc)
  {
    super(paramnr, paramdc);
    this.a = paramContext;
    this.b = paramzzang;
    this.c = paramnr;
    this.d = paramdc;
    arq localarq = asa.G;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {}
    for (Looper localLooper = zzbv.zzez().a();; localLooper = paramContext.getMainLooper())
    {
      this.f = new dk(paramContext, localLooper, this, this);
      this.f.g();
      return;
    }
  }
  
  public final void a()
  {
    synchronized (this.e)
    {
      if ((this.f.h()) || (this.f.i())) {
        this.f.j();
      }
      Binder.flushPendingCommands();
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    je.b("Disconnected from remote ad request service.");
  }
  
  public final void a(Bundle paramBundle)
  {
    c();
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    je.b("Cannot connect to remote service, fallback to local instance.");
    new di(this.a, this.c, this.d).c();
    Bundle localBundle = new Bundle();
    localBundle.putString("action", "gms_connection_failed_fallback_to_local");
    zzbv.zzek().b(this.a, this.b.a, "gmob-apps", localBundle, true);
  }
  
  /* Error */
  public final dq d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/internal/ads/dj:e	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 82	com/google/android/gms/internal/ads/dj:f	Lcom/google/android/gms/internal/ads/dk;
    //   11: invokevirtual 162	com/google/android/gms/internal/ads/dk:x	()Lcom/google/android/gms/internal/ads/dq;
    //   14: astore 5
    //   16: aload_1
    //   17: monitorexit
    //   18: aload 5
    //   20: areturn
    //   21: aload_1
    //   22: monitorexit
    //   23: aconst_null
    //   24: areturn
    //   25: astore_3
    //   26: aload_1
    //   27: monitorexit
    //   28: aload_3
    //   29: athrow
    //   30: astore_2
    //   31: goto -10 -> 21
    //   34: astore 4
    //   36: goto -15 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	dj
    //   30	1	2	localDeadObjectException	android.os.DeadObjectException
    //   25	4	3	localObject2	Object
    //   34	1	4	localIllegalStateException	java.lang.IllegalStateException
    //   14	5	5	localdq	dq
    // Exception table:
    //   from	to	target	type
    //   7	16	25	finally
    //   16	18	25	finally
    //   21	23	25	finally
    //   26	28	25	finally
    //   7	16	30	android/os/DeadObjectException
    //   7	16	34	java/lang/IllegalStateException
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.dj
 * JD-Core Version:    0.7.0.1
 */