package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import java.util.Set;

@cm
public final class d
  extends n
{
  private static final Set<String> a = com.google.android.gms.common.util.d.a(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  private String b = "top-right";
  private boolean c = true;
  private int d = 0;
  private int e = 0;
  private int f = -1;
  private int g = 0;
  private int h = 0;
  private int i = -1;
  private final Object j = new Object();
  private final qe k;
  private final Activity l;
  private rs m;
  private ImageView n;
  private LinearLayout o;
  private o p;
  private PopupWindow q;
  private RelativeLayout r;
  private ViewGroup s;
  
  public d(qe paramqe, o paramo)
  {
    super(paramqe, "resize");
    this.k = paramqe;
    this.l = paramqe.d();
    this.p = paramo;
  }
  
  private final void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2 - zzbv.zzek().c(this.l)[0], this.i, this.f);
  }
  
  private final int[] b()
  {
    int[] arrayOfInt1 = zzbv.zzek().b(this.l);
    int[] arrayOfInt2 = zzbv.zzek().c(this.l);
    int i1 = arrayOfInt1[0];
    int i2 = arrayOfInt1[1];
    int i3;
    if ((this.i < 50) || (this.i > i1))
    {
      je.e("Width is too small or too large.");
      i3 = 0;
    }
    while (i3 == 0)
    {
      return null;
      if ((this.f < 50) || (this.f > i2))
      {
        je.e("Height is too small or too large.");
        i3 = 0;
      }
      else if ((this.f == i2) && (this.i == i1))
      {
        je.e("Cannot resize to a full-screen ad.");
        i3 = 0;
      }
      else
      {
        if (this.c)
        {
          String str = this.b;
          int i7 = -1;
          label200:
          int i8;
          int i9;
          switch (str.hashCode())
          {
          default: 
            switch (i7)
            {
            default: 
              i8 = -50 + (this.d + this.g + this.i);
              i9 = this.e + this.h;
            }
            break;
          }
          for (;;)
          {
            if ((i8 >= 0) && (i8 + 50 <= i1) && (i9 >= arrayOfInt2[0]) && (i9 + 50 <= arrayOfInt2[1])) {
              break label627;
            }
            i3 = 0;
            break;
            if (!str.equals("top-left")) {
              break label200;
            }
            i7 = 0;
            break label200;
            if (!str.equals("top-center")) {
              break label200;
            }
            i7 = 1;
            break label200;
            if (!str.equals("center")) {
              break label200;
            }
            i7 = 2;
            break label200;
            if (!str.equals("bottom-left")) {
              break label200;
            }
            i7 = 3;
            break label200;
            if (!str.equals("bottom-center")) {
              break label200;
            }
            i7 = 4;
            break label200;
            if (!str.equals("bottom-right")) {
              break label200;
            }
            i7 = 5;
            break label200;
            i8 = this.d + this.g;
            i9 = this.e + this.h;
            continue;
            i8 = -25 + (this.d + this.g + this.i / 2);
            i9 = this.e + this.h;
            continue;
            i8 = -25 + (this.d + this.g + this.i / 2);
            i9 = -25 + (this.e + this.h + this.f / 2);
            continue;
            i8 = this.d + this.g;
            i9 = -50 + (this.e + this.h + this.f);
            continue;
            i8 = -25 + (this.d + this.g + this.i / 2);
            i9 = -50 + (this.e + this.h + this.f);
            continue;
            i8 = -50 + (this.d + this.g + this.i);
            i9 = -50 + (this.e + this.h + this.f);
          }
        }
        label627:
        i3 = 1;
      }
    }
    if (this.c)
    {
      int[] arrayOfInt5 = new int[2];
      arrayOfInt5[0] = (this.d + this.g);
      arrayOfInt5[1] = (this.e + this.h);
      return arrayOfInt5;
    }
    int[] arrayOfInt3 = zzbv.zzek().b(this.l);
    int[] arrayOfInt4 = zzbv.zzek().c(this.l);
    int i4 = arrayOfInt3[0];
    int i5 = this.d + this.g;
    int i6 = this.e + this.h;
    if (i5 < 0)
    {
      i5 = 0;
      if (i6 >= arrayOfInt4[0]) {
        break label787;
      }
      i6 = arrayOfInt4[0];
    }
    for (;;)
    {
      return new int[] { i5, i6 };
      if (i5 + this.i <= i4) {
        break;
      }
      i5 = i4 - this.i;
      break;
      label787:
      if (i6 + this.f > arrayOfInt4[1]) {
        i6 = arrayOfInt4[1] - this.f;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.j)
    {
      this.d = paramInt1;
      this.e = paramInt2;
      if ((this.q != null) && (paramBoolean))
      {
        int[] arrayOfInt = b();
        if (arrayOfInt != null)
        {
          PopupWindow localPopupWindow = this.q;
          aos.a();
          int i1 = lz.a(this.l, arrayOfInt[0]);
          aos.a();
          localPopupWindow.update(i1, lz.a(this.l, arrayOfInt[1]), this.q.getWidth(), this.q.getHeight());
          b(arrayOfInt[0], arrayOfInt[1]);
        }
      }
      else
      {
        return;
      }
      a(true);
    }
  }
  
  public final void a(Map<String, String> paramMap)
  {
    synchronized (this.j)
    {
      if (this.l == null)
      {
        a("Not an activity context. Cannot resize.");
        return;
      }
      if (this.k.r() == null)
      {
        a("Webview is not yet available, size is not set.");
        return;
      }
    }
    if (this.k.r().d())
    {
      a("Is interstitial. Cannot resize an interstitial.");
      return;
    }
    if (this.k.x())
    {
      a("Cannot resize an expanded banner.");
      return;
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("width")))
    {
      zzbv.zzek();
      this.i = jn.b((String)paramMap.get("width"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("height")))
    {
      zzbv.zzek();
      this.f = jn.b((String)paramMap.get("height"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX")))
    {
      zzbv.zzek();
      this.g = jn.b((String)paramMap.get("offsetX"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY")))
    {
      zzbv.zzek();
      this.h = jn.b((String)paramMap.get("offsetY"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen"))) {
      this.c = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
    }
    String str1 = (String)paramMap.get("customClosePosition");
    if (!TextUtils.isEmpty(str1)) {
      this.b = str1;
    }
    int i1;
    Window localWindow;
    int[] arrayOfInt;
    int i2;
    int i3;
    PopupWindow localPopupWindow1;
    if ((this.i >= 0) && (this.f >= 0))
    {
      i1 = 1;
      if (i1 == 0)
      {
        a("Invalid width and height options. Cannot resize.");
        return;
      }
      localWindow = this.l.getWindow();
      if ((localWindow == null) || (localWindow.getDecorView() == null))
      {
        a("Activity context is not ready, cannot get window or decor view.");
        return;
      }
      arrayOfInt = b();
      if (arrayOfInt == null)
      {
        a("Resize location out of screen or close button is not visible.");
        return;
      }
      aos.a();
      i2 = lz.a(this.l, this.i);
      aos.a();
      i3 = lz.a(this.l, this.f);
      ViewParent localViewParent = this.k.getView().getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      {
        ((ViewGroup)localViewParent).removeView(this.k.getView());
        if (this.q == null)
        {
          this.s = ((ViewGroup)localViewParent);
          zzbv.zzek();
          Bitmap localBitmap = jn.a(this.k.getView());
          this.n = new ImageView(this.l);
          this.n.setImageBitmap(localBitmap);
          this.m = this.k.r();
          this.s.addView(this.n);
          this.r = new RelativeLayout(this.l);
          this.r.setBackgroundColor(0);
          this.r.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
          zzbv.zzek();
          this.q = jn.a(this.r, i2, i3, false);
          this.q.setOutsideTouchable(true);
          this.q.setTouchable(true);
          localPopupWindow1 = this.q;
          if (this.c) {
            break label1360;
          }
        }
      }
    }
    label1294:
    label1315:
    label1318:
    label1360:
    for (boolean bool = true;; bool = false)
    {
      localPopupWindow1.setClippingEnabled(bool);
      this.r.addView(this.k.getView(), -1, -1);
      this.o = new LinearLayout(this.l);
      aos.a();
      int i4 = lz.a(this.l, 50);
      aos.a();
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i4, lz.a(this.l, 50));
      String str2 = this.b;
      int i5;
      switch (str2.hashCode())
      {
      case -1012429441: 
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(11);
      case 1755462605: 
      case -1364013995: 
      case -655373719: 
      case 1288627767: 
      case 1163912186: 
        for (;;)
        {
          this.o.setOnClickListener(new e(this));
          this.o.setContentDescription("Close button");
          this.r.addView(this.o, localLayoutParams);
          try
          {
            PopupWindow localPopupWindow2 = this.q;
            View localView = localWindow.getDecorView();
            aos.a();
            int i6 = lz.a(this.l, arrayOfInt[0]);
            aos.a();
            localPopupWindow2.showAtLocation(localView, 0, i6, lz.a(this.l, arrayOfInt[1]));
            int i7 = arrayOfInt[0];
            int i8 = arrayOfInt[1];
            if (this.p != null) {
              this.p.zza(i7, i8, this.i, this.f);
            }
            this.k.a(rs.a(i2, i3));
            b(arrayOfInt[0], arrayOfInt[1]);
            c("resized");
            return;
          }
          catch (RuntimeException localRuntimeException)
          {
            str3 = String.valueOf(localRuntimeException.getMessage());
            if (str3.length() == 0) {
              break label1294;
            }
          }
          this.q.dismiss();
          break;
          a("Webview is detached, probably in the middle of a resize or expand.");
          return;
          if (!str2.equals("top-left")) {
            break label1315;
          }
          i5 = 0;
          break label1318;
          if (!str2.equals("top-center")) {
            break label1315;
          }
          i5 = 1;
          break label1318;
          if (!str2.equals("center")) {
            break label1315;
          }
          i5 = 2;
          break label1318;
          if (!str2.equals("bottom-left")) {
            break label1315;
          }
          i5 = 3;
          break label1318;
          if (!str2.equals("bottom-center")) {
            break label1315;
          }
          i5 = 4;
          break label1318;
          if (!str2.equals("bottom-right")) {
            break label1315;
          }
          i5 = 5;
          break label1318;
          localLayoutParams.addRule(10);
          localLayoutParams.addRule(9);
          continue;
          localLayoutParams.addRule(10);
          localLayoutParams.addRule(14);
          continue;
          localLayoutParams.addRule(13);
          continue;
          localLayoutParams.addRule(12);
          localLayoutParams.addRule(9);
          continue;
          localLayoutParams.addRule(12);
          localLayoutParams.addRule(14);
          continue;
          localLayoutParams.addRule(12);
          localLayoutParams.addRule(11);
        }
        String str3;
        for (String str4 = "Cannot show popup window: ".concat(str3);; str4 = new String("Cannot show popup window: "))
        {
          a(str4);
          this.r.removeView(this.k.getView());
          if (this.s != null)
          {
            this.s.removeView(this.n);
            this.s.addView(this.k.getView());
            this.k.a(this.m);
          }
          return;
        }
        i1 = 0;
        break;
      default: 
        i5 = -1;
        switch (i5)
        {
        }
        break;
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.j)
    {
      if (this.q != null)
      {
        this.q.dismiss();
        this.r.removeView(this.k.getView());
        if (this.s != null)
        {
          this.s.removeView(this.n);
          this.s.addView(this.k.getView());
          this.k.a(this.m);
        }
        if (paramBoolean)
        {
          c("default");
          if (this.p != null) {
            this.p.zzcq();
          }
        }
        this.q = null;
        this.r = null;
        this.s = null;
        this.o = null;
      }
      return;
    }
  }
  
  public final boolean a()
  {
    for (;;)
    {
      synchronized (this.j)
      {
        if (this.q != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.d
 * JD-Core Version:    0.7.0.1
 */