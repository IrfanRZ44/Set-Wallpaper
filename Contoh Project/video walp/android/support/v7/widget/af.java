package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class af
  implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener
{
  private static af i;
  private static af j;
  private final View a;
  private final CharSequence b;
  private final Runnable c = new Runnable()
  {
    public void run()
    {
      af.a(af.this, false);
    }
  };
  private final Runnable d = new Runnable()
  {
    public void run()
    {
      af.a(af.this);
    }
  };
  private int e;
  private int f;
  private ag g;
  private boolean h;
  
  private af(View paramView, CharSequence paramCharSequence)
  {
    this.a = paramView;
    this.b = paramCharSequence;
    this.a.setOnLongClickListener(this);
    this.a.setOnHoverListener(this);
  }
  
  private void a()
  {
    if (j == this)
    {
      j = null;
      if (this.g == null) {
        break label62;
      }
      this.g.a();
      this.g = null;
      this.a.removeOnAttachStateChangeListener(this);
    }
    for (;;)
    {
      if (i == this) {
        b(null);
      }
      this.a.removeCallbacks(this.d);
      return;
      label62:
      Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
    }
  }
  
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if ((i != null) && (i.a == paramView)) {
      b(null);
    }
    if (TextUtils.isEmpty(paramCharSequence))
    {
      if ((j != null) && (j.a == paramView)) {
        j.a();
      }
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
      return;
    }
    new af(paramView, paramCharSequence);
  }
  
  private void a(boolean paramBoolean)
  {
    if (!s.A(this.a)) {
      return;
    }
    b(null);
    if (j != null) {
      j.a();
    }
    j = this;
    this.h = paramBoolean;
    this.g = new ag(this.a.getContext());
    this.g.a(this.a, this.e, this.f, this.h, this.b);
    this.a.addOnAttachStateChangeListener(this);
    long l;
    if (this.h) {
      l = 2500L;
    }
    for (;;)
    {
      this.a.removeCallbacks(this.d);
      this.a.postDelayed(this.d, l);
      return;
      if ((0x1 & s.o(this.a)) == 1) {
        l = 3000L - ViewConfiguration.getLongPressTimeout();
      } else {
        l = 15000L - ViewConfiguration.getLongPressTimeout();
      }
    }
  }
  
  private void b()
  {
    this.a.postDelayed(this.c, ViewConfiguration.getLongPressTimeout());
  }
  
  private static void b(af paramaf)
  {
    if (i != null) {
      i.c();
    }
    i = paramaf;
    if (i != null) {
      i.b();
    }
  }
  
  private void c()
  {
    this.a.removeCallbacks(this.c);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((this.g != null) && (this.h)) {}
    do
    {
      AccessibilityManager localAccessibilityManager;
      do
      {
        return false;
        localAccessibilityManager = (AccessibilityManager)this.a.getContext().getSystemService("accessibility");
      } while ((localAccessibilityManager.isEnabled()) && (localAccessibilityManager.isTouchExplorationEnabled()));
      switch (paramMotionEvent.getAction())
      {
      case 8: 
      case 9: 
      default: 
        return false;
      }
    } while ((!this.a.isEnabled()) || (this.g != null));
    this.e = ((int)paramMotionEvent.getX());
    this.f = ((int)paramMotionEvent.getY());
    b(this);
    return false;
    a();
    return false;
  }
  
  public boolean onLongClick(View paramView)
  {
    this.e = (paramView.getWidth() / 2);
    this.f = (paramView.getHeight() / 2);
    a(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.af
 * JD-Core Version:    0.7.0.1
 */