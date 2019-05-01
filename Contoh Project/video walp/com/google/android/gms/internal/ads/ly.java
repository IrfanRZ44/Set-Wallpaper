package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.zzbv;

@cm
public final class ly
{
  private final View a;
  private Activity b;
  private boolean c;
  private boolean d;
  private boolean e;
  private ViewTreeObserver.OnGlobalLayoutListener f;
  private ViewTreeObserver.OnScrollChangedListener g;
  
  public ly(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.b = paramActivity;
    this.a = paramView;
    this.f = paramOnGlobalLayoutListener;
    this.g = paramOnScrollChangedListener;
  }
  
  private static ViewTreeObserver b(Activity paramActivity)
  {
    if (paramActivity == null) {}
    View localView;
    do
    {
      Window localWindow;
      do
      {
        return null;
        localWindow = paramActivity.getWindow();
      } while (localWindow == null);
      localView = localWindow.getDecorView();
    } while (localView == null);
    return localView.getViewTreeObserver();
  }
  
  private final void e()
  {
    if (!this.c)
    {
      if (this.f != null)
      {
        if (this.b != null)
        {
          Activity localActivity2 = this.b;
          ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.f;
          ViewTreeObserver localViewTreeObserver2 = b(localActivity2);
          if (localViewTreeObserver2 != null) {
            localViewTreeObserver2.addOnGlobalLayoutListener(localOnGlobalLayoutListener);
          }
        }
        zzbv.zzfg();
        nx.a(this.a, this.f);
      }
      if (this.g != null)
      {
        if (this.b != null)
        {
          Activity localActivity1 = this.b;
          ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.g;
          ViewTreeObserver localViewTreeObserver1 = b(localActivity1);
          if (localViewTreeObserver1 != null) {
            localViewTreeObserver1.addOnScrollChangedListener(localOnScrollChangedListener);
          }
        }
        zzbv.zzfg();
        nx.a(this.a, this.g);
      }
      this.c = true;
    }
  }
  
  private final void f()
  {
    if (this.b == null) {}
    while (!this.c) {
      return;
    }
    if (this.f != null)
    {
      Activity localActivity2 = this.b;
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.f;
      ViewTreeObserver localViewTreeObserver2 = b(localActivity2);
      if (localViewTreeObserver2 != null) {
        zzbv.zzem().a(localViewTreeObserver2, localOnGlobalLayoutListener);
      }
    }
    if (this.g != null)
    {
      Activity localActivity1 = this.b;
      ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.g;
      ViewTreeObserver localViewTreeObserver1 = b(localActivity1);
      if (localViewTreeObserver1 != null) {
        localViewTreeObserver1.removeOnScrollChangedListener(localOnScrollChangedListener);
      }
    }
    this.c = false;
  }
  
  public final void a()
  {
    this.e = true;
    if (this.d) {
      e();
    }
  }
  
  public final void a(Activity paramActivity)
  {
    this.b = paramActivity;
  }
  
  public final void b()
  {
    this.e = false;
    f();
  }
  
  public final void c()
  {
    this.d = true;
    if (this.e) {
      e();
    }
  }
  
  public final void d()
  {
    this.d = false;
    f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ly
 * JD-Core Version:    0.7.0.1
 */