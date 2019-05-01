package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class agt
  implements ags
{
  protected static volatile ahn a = null;
  protected MotionEvent b;
  protected LinkedList<MotionEvent> c = new LinkedList();
  protected long d = 0L;
  protected long e = 0L;
  protected long f = 0L;
  protected long g = 0L;
  protected long h = 0L;
  protected long i = 0L;
  protected long j = 0L;
  protected double k;
  protected float l;
  protected float m;
  protected float n;
  protected float o;
  protected boolean p = false;
  protected DisplayMetrics q;
  private double r;
  private double s;
  private boolean t = false;
  
  protected agt(Context paramContext)
  {
    try
    {
      arq localarq = asa.bL;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        afx.a();
      }
      for (;;)
      {
        this.q = paramContext.getResources().getDisplayMetrics();
        return;
        aht.a(a);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private final String a(Context paramContext, String paramString, boolean paramBoolean, View paramView, Activity paramActivity, byte[] paramArrayOfByte)
  {
    if (paramBoolean) {}
    try
    {
      zo localzo = a(paramContext, paramView, paramActivity);
      this.t = true;
      while ((localzo == null) || (localzo.d() == 0))
      {
        return Integer.toString(5);
        localzo = a(paramContext, null);
      }
      String str = afx.a(localzo, paramString);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return Integer.toString(7);
    }
    catch (Throwable localThrowable)
    {
      return Integer.toString(3);
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      label62:
      break label62;
    }
  }
  
  protected abstract long a(StackTraceElement[] paramArrayOfStackTraceElement);
  
  protected abstract ahu a(MotionEvent paramMotionEvent);
  
  protected abstract zo a(Context paramContext, View paramView, Activity paramActivity);
  
  protected abstract zo a(Context paramContext, wk paramwk);
  
  public final String zza(Context paramContext)
  {
    if (ahv.a())
    {
      arq localarq = asa.bN;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        throw new IllegalStateException("The caller must not be called from the UI thread.");
      }
    }
    return a(paramContext, null, false, null, null, null);
  }
  
  public final String zza(Context paramContext, String paramString, View paramView)
  {
    return zza(paramContext, paramString, paramView, null);
  }
  
  public final String zza(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    return a(paramContext, paramString, true, paramView, paramActivity, null);
  }
  
  public final void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.b != null) {
      this.b.recycle();
    }
    if (this.q != null) {}
    for (this.b = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.q.density, paramInt2 * this.q.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);; this.b = null)
    {
      this.p = false;
      return;
    }
  }
  
  public final void zza(MotionEvent paramMotionEvent)
  {
    if (this.t)
    {
      this.g = 0L;
      this.f = 0L;
      this.e = 0L;
      this.d = 0L;
      this.h = 0L;
      this.j = 0L;
      this.i = 0L;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((MotionEvent)localIterator.next()).recycle();
      }
      this.c.clear();
      this.b = null;
      this.t = false;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      switch (paramMotionEvent.getAction())
      {
      }
      break;
    }
    for (;;)
    {
      this.p = true;
      return;
      this.k = 0.0D;
      this.r = paramMotionEvent.getRawX();
      this.s = paramMotionEvent.getRawY();
      break;
      double d1 = paramMotionEvent.getRawX();
      double d2 = paramMotionEvent.getRawY();
      double d3 = d1 - this.r;
      double d4 = d2 - this.s;
      this.k += Math.sqrt(d3 * d3 + d4 * d4);
      this.r = d1;
      this.s = d2;
      break;
      this.b = MotionEvent.obtain(paramMotionEvent);
      this.c.add(this.b);
      if (this.c.size() > 6) {
        ((MotionEvent)this.c.remove()).recycle();
      }
      this.f = (1L + this.f);
      try
      {
        this.h = a(new Throwable().getStackTrace());
      }
      catch (ahk localahk2) {}
      continue;
      this.l = paramMotionEvent.getX();
      this.m = paramMotionEvent.getY();
      this.n = paramMotionEvent.getRawX();
      this.o = paramMotionEvent.getRawY();
      this.d = (1L + this.d);
      continue;
      this.g = (1L + this.g);
    }
    this.e += 1 + paramMotionEvent.getHistorySize();
    for (;;)
    {
      try
      {
        ahu localahu = a(paramMotionEvent);
        if ((localahu == null) || (localahu.d == null) || (localahu.g == null)) {
          break label546;
        }
        i1 = 1;
        if (i1 != 0) {
          this.i += localahu.d.longValue() + localahu.g.longValue();
        }
        if ((this.q == null) || (localahu == null) || (localahu.e == null) || (localahu.h == null)) {
          break label552;
        }
        i2 = 1;
        if (i2 == 0) {
          break;
        }
        this.j += localahu.e.longValue() + localahu.h.longValue();
      }
      catch (ahk localahk1) {}
      break;
      label546:
      int i1 = 0;
      continue;
      label552:
      int i2 = 0;
    }
  }
  
  public void zzb(View paramView) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agt
 * JD-Core Version:    0.7.0.1
 */