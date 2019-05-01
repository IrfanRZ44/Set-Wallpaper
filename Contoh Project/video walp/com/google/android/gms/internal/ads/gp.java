package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.concurrent.Future;

@cm
public final class gp
  extends iz
  implements gv, gy, hd
{
  public final String a;
  private final ik b;
  private final Context c;
  private final he d;
  private final gy e;
  private final Object f;
  private final String g;
  private final bbt h;
  private final long i;
  private int j = 0;
  private int k = 3;
  private gs l;
  private Future m;
  private volatile zzb n;
  
  public gp(Context paramContext, String paramString1, String paramString2, bbt parambbt, ik paramik, he paramhe, gy paramgy, long paramLong)
  {
    this.c = paramContext;
    this.a = paramString1;
    this.g = paramString2;
    this.h = parambbt;
    this.b = paramik;
    this.d = paramhe;
    this.f = new Object();
    this.e = paramgy;
    this.i = paramLong;
  }
  
  private final void a(zzjj paramzzjj, bcn parambcn)
  {
    this.d.b().a(this);
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a))
      {
        parambcn.a(paramzzjj, this.g, this.h.a);
        return;
      }
      parambcn.a(paramzzjj, this.g);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.c("Fail to load ad from adapter.", localRemoteException);
      a(this.a, 0);
    }
  }
  
  private final boolean a(long paramLong)
  {
    long l1 = this.i - (zzbv.zzer().b() - paramLong);
    if (l1 <= 0L)
    {
      this.k = 4;
      return false;
    }
    try
    {
      this.f.wait(l1);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      this.k = 5;
    }
    return false;
  }
  
  public final void a()
  {
    if ((this.d == null) || (this.d.b() == null) || (this.d.a() == null)) {
      return;
    }
    gx localgx = this.d.b();
    localgx.a(null);
    localgx.a(this);
    localgx.a(this);
    zzjj localzzjj = this.b.a.c;
    bcn localbcn = this.d.a();
    try
    {
      if (localbcn.g())
      {
        lz.a.post(new gq(this, localzzjj, localbcn));
        l1 = zzbv.zzer().b();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        synchronized (this.f)
        {
          long l1;
          if (this.j != 0)
          {
            gu localgu = new gu().a(zzbv.zzer().b() - l1);
            if (1 == this.j)
            {
              i1 = 6;
              this.l = localgu.a(i1).a(this.a).b(this.h.d).a();
              localgx.a(null);
              localgx.a(null);
              if (this.j != 1) {
                break;
              }
              this.e.a(this.a);
              return;
              lz.a.post(new gr(this, localbcn, localzzjj, localgx));
              continue;
              localRemoteException = localRemoteException;
              je.c("Fail to check if adapter is initialized.", localRemoteException);
              a(this.a, 0);
              continue;
            }
            int i1 = this.k;
            continue;
          }
          if (!a(l1)) {
            this.l = new gu().a(this.k).a(zzbv.zzer().b() - l1).a(this.a).b(this.h.d).a();
          }
        }
      }
      this.e.a(this.a, this.k);
    }
  }
  
  public final void a(int paramInt)
  {
    a(this.a, 0);
  }
  
  public final void a(Bundle paramBundle)
  {
    zzb localzzb = this.n;
    if (localzzb != null) {
      localzzb.zza("", paramBundle);
    }
  }
  
  public final void a(zzb paramzzb)
  {
    this.n = paramzzb;
  }
  
  public final void a(String paramString)
  {
    synchronized (this.f)
    {
      this.j = 1;
      this.f.notify();
      return;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    synchronized (this.f)
    {
      this.j = 2;
      this.k = paramInt;
      this.f.notify();
      return;
    }
  }
  
  public final void b_() {}
  
  public final Future d()
  {
    if (this.m != null) {
      return this.m;
    }
    ne localne = (ne)c();
    this.m = localne;
    return localne;
  }
  
  public final gs e()
  {
    synchronized (this.f)
    {
      gs localgs = this.l;
      return localgs;
    }
  }
  
  public final bbt f()
  {
    return this.h;
  }
  
  public final void g()
  {
    a(this.b.a.c, this.d.a());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gp
 * JD-Core Version:    0.7.0.1
 */