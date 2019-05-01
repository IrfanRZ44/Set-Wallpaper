package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@cm
abstract class oa
{
  private final WeakReference<View> a;
  
  public oa(View paramView)
  {
    this.a = new WeakReference(paramView);
  }
  
  private final ViewTreeObserver c()
  {
    View localView = (View)this.a.get();
    ViewTreeObserver localViewTreeObserver;
    if (localView == null) {
      localViewTreeObserver = null;
    }
    do
    {
      return localViewTreeObserver;
      localViewTreeObserver = localView.getViewTreeObserver();
    } while ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive()));
    return null;
  }
  
  public final void a()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      a(localViewTreeObserver);
    }
  }
  
  protected abstract void a(ViewTreeObserver paramViewTreeObserver);
  
  public final void b()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      b(localViewTreeObserver);
    }
  }
  
  protected abstract void b(ViewTreeObserver paramViewTreeObserver);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.oa
 * JD-Core Version:    0.7.0.1
 */