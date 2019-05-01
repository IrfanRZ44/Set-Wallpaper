package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@cm
@TargetApi(14)
public final class akg
  implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long a;
  private final Context b;
  private Application c;
  private final WindowManager d;
  private final PowerManager e;
  private final KeyguardManager f;
  private BroadcastReceiver g;
  private WeakReference<ViewTreeObserver> h;
  private WeakReference<View> i;
  private akl j;
  private lo k = new lo(a);
  private boolean l = false;
  private int m = -1;
  private final HashSet<akk> n = new HashSet();
  private final DisplayMetrics o;
  private final Rect p;
  
  static
  {
    arq localarq = asa.bn;
    a = ((Long)aos.f().a(localarq)).longValue();
  }
  
  public akg(Context paramContext, View paramView)
  {
    this.b = paramContext.getApplicationContext();
    this.d = ((WindowManager)paramContext.getSystemService("window"));
    this.e = ((PowerManager)this.b.getSystemService("power"));
    this.f = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    if ((this.b instanceof Application))
    {
      this.c = ((Application)this.b);
      this.j = new akl((Application)this.b, this);
    }
    this.o = paramContext.getResources().getDisplayMetrics();
    this.p = new Rect();
    this.p.right = this.d.getDefaultDisplay().getWidth();
    this.p.bottom = this.d.getDefaultDisplay().getHeight();
    if (this.i != null) {}
    for (View localView = (View)this.i.get();; localView = null)
    {
      if (localView != null)
      {
        localView.removeOnAttachStateChangeListener(this);
        b(localView);
      }
      this.i = new WeakReference(paramView);
      if (paramView != null)
      {
        if (zzbv.zzem().a(paramView)) {
          a(paramView);
        }
        paramView.addOnAttachStateChangeListener(this);
      }
      return;
    }
  }
  
  private final Rect a(Rect paramRect)
  {
    return new Rect(b(paramRect.left), b(paramRect.top), b(paramRect.right), b(paramRect.bottom));
  }
  
  private final void a(int paramInt)
  {
    if (this.n.size() == 0) {}
    for (;;)
    {
      return;
      if (this.i != null)
      {
        View localView = (View)this.i.get();
        int i1;
        int i2;
        Rect localRect1;
        Rect localRect2;
        Rect localRect3;
        Rect localRect4;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        boolean bool1;
        boolean bool2;
        if (paramInt == 1)
        {
          i1 = 1;
          if (localView != null) {
            break label438;
          }
          i2 = 1;
          localRect1 = new Rect();
          localRect2 = new Rect();
          localRect3 = new Rect();
          localRect4 = new Rect();
          arrayOfInt1 = new int[2];
          arrayOfInt2 = new int[2];
          bool1 = false;
          bool2 = false;
          if (localView != null)
          {
            bool1 = localView.getGlobalVisibleRect(localRect2);
            bool2 = localView.getLocalVisibleRect(localRect3);
            localView.getHitRect(localRect4);
          }
        }
        try
        {
          localView.getLocationOnScreen(arrayOfInt1);
          localView.getLocationInWindow(arrayOfInt2);
          localRect1.left = arrayOfInt1[0];
          localRect1.top = arrayOfInt1[1];
          localRect1.right = (localRect1.left + localView.getWidth());
          localRect1.bottom = (localRect1.top + localView.getHeight());
          if (localView != null)
          {
            i3 = localView.getWindowVisibility();
            if (this.m != -1) {
              i3 = this.m;
            }
            if ((i2 != 0) || (!zzbv.zzek().a(localView, this.e, this.f)) || (!bool1) || (!bool2) || (i3 != 0)) {
              break label464;
            }
            bool3 = true;
            if ((i1 != 0) && (!this.k.a()))
            {
              boolean bool6 = this.l;
              if (bool3 == bool6) {
                continue;
              }
            }
            if ((!bool3) && (!this.l) && (paramInt == 1)) {
              continue;
            }
            long l1 = zzbv.zzer().b();
            boolean bool4 = this.e.isScreenOn();
            if (localView == null) {
              break label470;
            }
            bool5 = zzbv.zzem().a(localView);
            if (localView == null) {
              break label476;
            }
            i4 = localView.getWindowVisibility();
            akj localakj = new akj(l1, bool4, bool5, i4, a(this.p), a(localRect1), a(localRect2), bool1, a(localRect3), bool2, a(localRect4), this.o.density, bool3);
            Iterator localIterator = this.n.iterator();
            for (;;)
            {
              if (localIterator.hasNext())
              {
                ((akk)localIterator.next()).a(localakj);
                continue;
                i1 = 0;
                break;
                label438:
                i2 = 0;
              }
            }
          }
        }
        catch (Exception localException)
        {
          boolean bool3;
          for (;;)
          {
            je.b("Failure getting view location.", localException);
            continue;
            int i3 = 8;
            continue;
            label464:
            bool3 = false;
            continue;
            label470:
            boolean bool5 = false;
            continue;
            label476:
            int i4 = 8;
          }
          this.l = bool3;
        }
      }
    }
  }
  
  private final void a(Activity paramActivity, int paramInt)
  {
    if (this.i == null) {}
    View localView1;
    View localView2;
    do
    {
      Window localWindow;
      do
      {
        return;
        localWindow = paramActivity.getWindow();
      } while (localWindow == null);
      localView1 = localWindow.peekDecorView();
      localView2 = (View)this.i.get();
    } while ((localView2 == null) || (localView1 == null) || (localView2.getRootView() != localView1.getRootView()));
    this.m = paramInt;
  }
  
  private final void a(View paramView)
  {
    ViewTreeObserver localViewTreeObserver = paramView.getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
    {
      this.h = new WeakReference(localViewTreeObserver);
      localViewTreeObserver.addOnScrollChangedListener(this);
      localViewTreeObserver.addOnGlobalLayoutListener(this);
    }
    if (this.g == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      this.g = new aki(this);
      zzbv.zzfk().a(this.b, this.g, localIntentFilter);
    }
    if (this.c != null) {}
    try
    {
      this.c.registerActivityLifecycleCallbacks(this.j);
      return;
    }
    catch (Exception localException)
    {
      je.b("Error registering activity lifecycle callbacks.", localException);
    }
  }
  
  private final int b(int paramInt)
  {
    float f1 = this.o.density;
    return (int)(paramInt / f1);
  }
  
  private final void b()
  {
    zzbv.zzek();
    jn.a.post(new akh(this));
  }
  
  private final void b(View paramView)
  {
    try
    {
      if (this.h != null)
      {
        ViewTreeObserver localViewTreeObserver2 = (ViewTreeObserver)this.h.get();
        if ((localViewTreeObserver2 != null) && (localViewTreeObserver2.isAlive()))
        {
          localViewTreeObserver2.removeOnScrollChangedListener(this);
          localViewTreeObserver2.removeGlobalOnLayoutListener(this);
        }
        this.h = null;
      }
      ViewTreeObserver localViewTreeObserver1;
      return;
    }
    catch (Exception localException2)
    {
      try
      {
        localViewTreeObserver1 = paramView.getViewTreeObserver();
        if (localViewTreeObserver1.isAlive())
        {
          localViewTreeObserver1.removeOnScrollChangedListener(this);
          localViewTreeObserver1.removeGlobalOnLayoutListener(this);
        }
        if (this.g == null) {}
      }
      catch (Exception localException2)
      {
        try
        {
          for (;;)
          {
            zzbv.zzfk().a(this.b, this.g);
            this.g = null;
            if (this.c != null) {}
            try
            {
              this.c.unregisterActivityLifecycleCallbacks(this.j);
              return;
            }
            catch (Exception localException3)
            {
              je.b("Error registering activity lifecycle callbacks.", localException3);
            }
            localException1 = localException1;
            je.b("Error while unregistering listeners from the last ViewTreeObserver.", localException1);
          }
          localException2 = localException2;
          je.b("Error while unregistering listeners from the ViewTreeObserver.", localException2);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          for (;;)
          {
            je.b("Failed trying to unregister the receiver", localIllegalStateException);
          }
        }
        catch (Exception localException4)
        {
          for (;;)
          {
            zzbv.zzeo().a(localException4, "ActiveViewUnit.stopScreenStatusMonitoring");
          }
        }
      }
    }
  }
  
  public final void a()
  {
    a(4);
  }
  
  public final void a(akk paramakk)
  {
    this.n.add(paramakk);
    a(3);
  }
  
  public final void b(akk paramakk)
  {
    this.n.remove(paramakk);
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(3);
    b();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity, 4);
    a(3);
    b();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(3);
    b();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(3);
    b();
  }
  
  public final void onGlobalLayout()
  {
    a(2);
    b();
  }
  
  public final void onScrollChanged()
  {
    a(1);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    this.m = -1;
    a(paramView);
    a(3);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.m = -1;
    a(3);
    b();
    b(paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.akg
 * JD-Core Version:    0.7.0.1
 */