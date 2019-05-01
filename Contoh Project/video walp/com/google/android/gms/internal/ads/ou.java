package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.n;

@cm
public final class ou
{
  private final Context a;
  private final pd b;
  private final ViewGroup c;
  private op d;
  
  private ou(Context paramContext, ViewGroup paramViewGroup, pd parampd, op paramop)
  {
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    this.a = paramContext;
    this.c = paramViewGroup;
    this.b = parampd;
    this.d = null;
  }
  
  public ou(Context paramContext, ViewGroup paramViewGroup, qe paramqe)
  {
    this(paramContext, paramViewGroup, paramqe, null);
  }
  
  public final op a()
  {
    n.b("getAdVideoUnderlay must be called from the UI thread.");
    return this.d;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    n.b("The underlay may only be modified from the UI thread.");
    if (this.d != null) {
      this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, pc parampc)
  {
    if (this.d != null) {
      return;
    }
    asg.a(this.b.h().a(), this.b.c(), new String[] { "vpr2" });
    this.d = new op(this.a, this.b, paramInt5, paramBoolean, this.b.h().a(), parampc);
    this.c.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
    this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.b.a(false);
  }
  
  public final void b()
  {
    n.b("onPause must be called from the UI thread.");
    if (this.d != null) {
      this.d.i();
    }
  }
  
  public final void c()
  {
    n.b("onDestroy must be called from the UI thread.");
    if (this.d != null)
    {
      this.d.n();
      this.c.removeView(this.d);
      this.d = null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ou
 * JD-Core Version:    0.7.0.1
 */