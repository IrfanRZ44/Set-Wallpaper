package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v7.a.a.d;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class n
{
  private final Context a;
  private final h b;
  private final boolean c;
  private final int d;
  private final int e;
  private View f;
  private int g = 8388611;
  private boolean h;
  private o.a i;
  private m j;
  private PopupWindow.OnDismissListener k;
  private final PopupWindow.OnDismissListener l = new PopupWindow.OnDismissListener()
  {
    public void onDismiss()
    {
      n.this.f();
    }
  };
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramh, paramView, paramBoolean, paramInt, 0);
  }
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.b = paramh;
    this.f = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    m localm = c();
    localm.c(paramBoolean2);
    if (paramBoolean1)
    {
      if ((0x7 & d.a(this.g, s.e(this.f))) == 5) {
        paramInt1 += this.f.getWidth();
      }
      localm.b(paramInt1);
      localm.c(paramInt2);
      int m = (int)(48.0F * this.a.getResources().getDisplayMetrics().density / 2.0F);
      localm.a(new Rect(paramInt1 - m, paramInt2 - m, paramInt1 + m, m + paramInt2));
    }
    localm.show();
  }
  
  private m i()
  {
    Display localDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    int m;
    if (Build.VERSION.SDK_INT >= 17)
    {
      localDisplay.getRealSize(localPoint);
      if (Math.min(localPoint.x, localPoint.y) < this.a.getResources().getDimensionPixelSize(a.d.abc_cascading_menus_min_smallest_width)) {
        break label166;
      }
      m = 1;
      label68:
      if (m == 0) {
        break label171;
      }
    }
    label166:
    label171:
    for (Object localObject = new e(this.a, this.f, this.d, this.e, this.c);; localObject = new t(this.a, this.b, this.f, this.d, this.e, this.c))
    {
      ((m)localObject).a(this.b);
      ((m)localObject).a(this.l);
      ((m)localObject).a(this.f);
      ((m)localObject).a(this.i);
      ((m)localObject).b(this.h);
      ((m)localObject).a(this.g);
      return localObject;
      localDisplay.getSize(localPoint);
      break;
      m = 0;
      break label68;
    }
  }
  
  public int a()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void a(o.a parama)
  {
    this.i = parama;
    if (this.j != null) {
      this.j.a(parama);
    }
  }
  
  public void a(View paramView)
  {
    this.f = paramView;
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.k = paramOnDismissListener;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    if (this.j != null) {
      this.j.b(paramBoolean);
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if (g()) {
      return true;
    }
    if (this.f == null) {
      return false;
    }
    a(paramInt1, paramInt2, true, true);
    return true;
  }
  
  public void b()
  {
    if (!d()) {
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
  }
  
  public m c()
  {
    if (this.j == null) {
      this.j = i();
    }
    return this.j;
  }
  
  public boolean d()
  {
    if (g()) {
      return true;
    }
    if (this.f == null) {
      return false;
    }
    a(0, 0, false, false);
    return true;
  }
  
  public void e()
  {
    if (g()) {
      this.j.dismiss();
    }
  }
  
  protected void f()
  {
    this.j = null;
    if (this.k != null) {
      this.k.onDismiss();
    }
  }
  
  public boolean g()
  {
    return (this.j != null) && (this.j.isShowing());
  }
  
  public ListView h()
  {
    return c().getListView();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.n
 * JD-Core Version:    0.7.0.1
 */