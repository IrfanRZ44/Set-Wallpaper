package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import javax.annotation.concurrent.GuardedBy;

@cm
@TargetApi(19)
public final class at
  extends aq
{
  private Object d = new Object();
  @GuardedBy("mPopupWindowLock")
  private PopupWindow e;
  @GuardedBy("mPopupWindowLock")
  private boolean f = false;
  
  at(Context paramContext, ik paramik, qe paramqe, ap paramap)
  {
    super(paramContext, paramik, paramqe, paramap);
  }
  
  private final void e()
  {
    synchronized (this.d)
    {
      this.f = true;
      if (((this.a instanceof Activity)) && (((Activity)this.a).isDestroyed())) {
        this.e = null;
      }
      if (this.e != null)
      {
        if (this.e.isShowing()) {
          this.e.dismiss();
        }
        this.e = null;
      }
      return;
    }
  }
  
  protected final void a(int paramInt)
  {
    e();
    super.a(paramInt);
  }
  
  public final void b()
  {
    e();
    super.b();
  }
  
  protected final void d()
  {
    if ((this.a instanceof Activity)) {}
    for (Window localWindow = ((Activity)this.a).getWindow();; localWindow = null)
    {
      if ((localWindow == null) || (localWindow.getDecorView() == null)) {}
      while (((Activity)this.a).isDestroyed()) {
        return;
      }
      FrameLayout localFrameLayout = new FrameLayout(this.a);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localFrameLayout.addView(this.b.getView(), -1, -1);
      synchronized (this.d)
      {
        if (this.f) {
          return;
        }
      }
      this.e = new PopupWindow(localFrameLayout, 1, 1, false);
      this.e.setOutsideTouchable(true);
      this.e.setClippingEnabled(false);
      je.b("Displaying the 1x1 popup off the screen.");
      try
      {
        this.e.showAtLocation(localWindow.getDecorView(), 0, -1, -1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.e = null;
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.at
 * JD-Core Version:    0.7.0.1
 */