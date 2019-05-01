package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ags;
import com.google.android.gms.internal.ads.agv;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.zzang;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@cm
public final class zzag
  implements ags, Runnable
{
  private final List<Object[]> a = new Vector();
  private final AtomicReference<ags> b = new AtomicReference();
  private Context c;
  private zzang d;
  private CountDownLatch e = new CountDownLatch(1);
  
  private zzag(Context paramContext, zzang paramzzang)
  {
    this.c = paramContext;
    this.d = paramzzang;
    aos.a();
    if (lz.b())
    {
      jl.a(this);
      return;
    }
    run();
  }
  
  public zzag(zzbw paramzzbw)
  {
    this(paramzzbw.zzrt, paramzzbw.zzacr);
  }
  
  private static Context a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      return paramContext;
    }
    return localContext;
  }
  
  private final boolean a()
  {
    try
    {
      this.e.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      je.c("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
  
  private final void b()
  {
    if (this.a.isEmpty()) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1) {
        ((ags)this.b.get()).zza((MotionEvent)arrayOfObject[0]);
      } else if (arrayOfObject.length == 3) {
        ((ags)this.b.get()).zza(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
    this.a.clear();
  }
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        if (!this.d.d) {
          break label113;
        }
        i = 1;
        arq localarq = asa.aL;
        if ((!((Boolean)aos.f().a(localarq)).booleanValue()) && (i != 0))
        {
          bool = true;
          agv localagv = agv.a(this.d.a, a(this.c), bool);
          this.b.set(localagv);
          return;
        }
      }
      finally
      {
        this.e.countDown();
        this.c = null;
        this.d = null;
      }
      boolean bool = false;
      continue;
      label113:
      int i = 0;
    }
  }
  
  public final String zza(Context paramContext)
  {
    if (a())
    {
      ags localags = (ags)this.b.get();
      if (localags != null)
      {
        b();
        return localags.zza(a(paramContext));
      }
    }
    return "";
  }
  
  public final String zza(Context paramContext, String paramString, View paramView)
  {
    return zza(paramContext, paramString, paramView, null);
  }
  
  public final String zza(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    if (a())
    {
      ags localags = (ags)this.b.get();
      if (localags != null)
      {
        b();
        return localags.zza(a(paramContext), paramString, paramView, paramActivity);
      }
    }
    return "";
  }
  
  public final void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    ags localags = (ags)this.b.get();
    if (localags != null)
    {
      b();
      localags.zza(paramInt1, paramInt2, paramInt3);
      return;
    }
    List localList = this.a;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    localList.add(arrayOfObject);
  }
  
  public final void zza(MotionEvent paramMotionEvent)
  {
    ags localags = (ags)this.b.get();
    if (localags != null)
    {
      b();
      localags.zza(paramMotionEvent);
      return;
    }
    this.a.add(new Object[] { paramMotionEvent });
  }
  
  public final void zzb(View paramView)
  {
    ags localags = (ags)this.b.get();
    if (localags != null) {
      localags.zzb(paramView);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzag
 * JD-Core Version:    0.7.0.1
 */