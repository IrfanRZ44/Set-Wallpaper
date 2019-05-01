package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.lang.ref.WeakReference;

public final class ahx
  implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final Handler a = new Handler(Looper.getMainLooper());
  private final Context b;
  private Application c;
  private final PowerManager d;
  private final KeyguardManager e;
  private final ahn f;
  private BroadcastReceiver g;
  private WeakReference<ViewTreeObserver> h;
  private WeakReference<View> i;
  private ahb j;
  private boolean k = false;
  private int l = -1;
  private long m = -3L;
  
  public ahx(ahn paramahn, View paramView)
  {
    this.f = paramahn;
    this.b = paramahn.a;
    this.d = ((PowerManager)this.b.getSystemService("power"));
    this.e = ((KeyguardManager)this.b.getSystemService("keyguard"));
    if ((this.b instanceof Application))
    {
      this.c = ((Application)this.b);
      this.j = new ahb((Application)this.b, this);
    }
    a(paramView);
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
    this.l = paramInt;
  }
  
  private final void b()
  {
    a.post(new ahy(this));
  }
  
  private final void b(View paramView)
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
      this.g = new ahz(this);
      this.b.registerReceiver(this.g, localIntentFilter);
    }
    if (this.c != null) {}
    try
    {
      this.c.registerActivityLifecycleCallbacks(this.j);
      return;
    }
    catch (Exception localException) {}
  }
  
  private final void c()
  {
    boolean bool1 = true;
    if (this.i == null) {
      return;
    }
    View localView = (View)this.i.get();
    if (localView == null)
    {
      this.m = -3L;
      this.k = false;
      return;
    }
    boolean bool2 = localView.getGlobalVisibleRect(new Rect());
    boolean bool3 = localView.getLocalVisibleRect(new Rect());
    Window localWindow;
    WindowManager.LayoutParams localLayoutParams;
    label109:
    int i2;
    label128:
    int n;
    if (!this.f.j())
    {
      if (!this.e.inKeyguardRestrictedInputMode()) {
        break label244;
      }
      Activity localActivity = ahv.a(localView);
      if (localActivity == null) {
        break label238;
      }
      localWindow = localActivity.getWindow();
      if (localWindow == null)
      {
        localLayoutParams = null;
        if ((localLayoutParams == null) || ((0x80000 & localLayoutParams.flags) == 0)) {
          break label238;
        }
        i2 = bool1;
        if (i2 == 0) {
          break label244;
        }
      }
    }
    else
    {
      n = bool1;
      label136:
      int i1 = localView.getWindowVisibility();
      if (this.l != -1) {
        i1 = this.l;
      }
      if ((localView.getVisibility() != 0) || (!localView.isShown()) || (!this.d.isScreenOn()) || (n == 0) || (!bool3) || (!bool2) || (i1 != 0)) {
        break label250;
      }
      label199:
      if (this.k == bool1) {
        break label253;
      }
      if (!bool1) {
        break label255;
      }
    }
    label238:
    label244:
    label250:
    label253:
    label255:
    for (long l1 = SystemClock.elapsedRealtime();; l1 = -2L)
    {
      this.m = l1;
      this.k = bool1;
      return;
      localLayoutParams = localWindow.getAttributes();
      break label109;
      i2 = 0;
      break label128;
      n = 0;
      break label136;
      bool1 = false;
      break label199;
      break;
    }
  }
  
  private final void c(View paramView)
  {
    for (;;)
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
      }
      catch (Exception localException1)
      {
        ViewTreeObserver localViewTreeObserver1;
        continue;
      }
      try
      {
        localViewTreeObserver1 = paramView.getViewTreeObserver();
        if (localViewTreeObserver1.isAlive())
        {
          localViewTreeObserver1.removeOnScrollChangedListener(this);
          localViewTreeObserver1.removeGlobalOnLayoutListener(this);
        }
        if (this.g != null) {}
        try
        {
          this.b.unregisterReceiver(this.g);
          this.g = null;
          if (this.c != null) {}
          try
          {
            this.c.unregisterActivityLifecycleCallbacks(this.j);
            return;
          }
          catch (Exception localException3) {}
        }
        catch (Exception localException4) {}
      }
      catch (Exception localException2) {}
    }
  }
  
  public final long a()
  {
    if ((this.m == -2L) && (this.i.get() == null)) {
      this.m = -3L;
    }
    return this.m;
  }
  
  final void a(View paramView)
  {
    View localView;
    if (this.i != null)
    {
      localView = (View)this.i.get();
      if (localView != null)
      {
        localView.removeOnAttachStateChangeListener(this);
        c(localView);
      }
      this.i = new WeakReference(paramView);
      if (paramView == null) {
        break label98;
      }
      if ((paramView.getWindowToken() == null) && (paramView.getWindowVisibility() == 8)) {
        break label93;
      }
    }
    label93:
    for (int n = 1;; n = 0)
    {
      if (n != 0) {
        b(paramView);
      }
      paramView.addOnAttachStateChangeListener(this);
      this.m = -2L;
      return;
      localView = null;
      break;
    }
    label98:
    this.m = -3L;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, 0);
    c();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    c();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity, 4);
    c();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity, 0);
    c();
    b();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    c();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity, 0);
    c();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    c();
  }
  
  public final void onGlobalLayout()
  {
    c();
  }
  
  public final void onScrollChanged()
  {
    c();
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    this.l = -1;
    b(paramView);
    c();
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.l = -1;
    c();
    b();
    c(paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahx
 * JD-Core Version:    0.7.0.1
 */