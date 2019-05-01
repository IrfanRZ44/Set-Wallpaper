package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.e.c;
import android.support.v4.view.s;
import android.support.v7.a.a.j;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class e
{
  private static final boolean a;
  private static final Paint b;
  private boolean A;
  private Bitmap B;
  private Paint C;
  private float D;
  private float E;
  private float F;
  private float G;
  private int[] H;
  private boolean I;
  private final TextPaint J;
  private Interpolator K;
  private Interpolator L;
  private float M;
  private float N;
  private float O;
  private int P;
  private float Q;
  private float R;
  private float S;
  private int T;
  private final View c;
  private boolean d;
  private float e;
  private final Rect f;
  private final Rect g;
  private final RectF h;
  private int i = 16;
  private int j = 16;
  private float k = 15.0F;
  private float l = 15.0F;
  private ColorStateList m;
  private ColorStateList n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private float t;
  private Typeface u;
  private Typeface v;
  private Typeface w;
  private CharSequence x;
  private CharSequence y;
  private boolean z;
  
  static
  {
    if (Build.VERSION.SDK_INT < 18) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      b = null;
      if (b != null)
      {
        b.setAntiAlias(true);
        b.setColor(-65281);
      }
      return;
    }
  }
  
  public e(View paramView)
  {
    this.c = paramView;
    this.J = new TextPaint(129);
    this.g = new Rect();
    this.f = new Rect();
    this.h = new RectF();
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null) {
      paramFloat3 = paramInterpolator.getInterpolation(paramFloat3);
    }
    return a.a(paramFloat1, paramFloat2, paramFloat3);
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = f1 * Color.alpha(paramInt1) + paramFloat * Color.alpha(paramInt2);
    float f3 = f1 * Color.red(paramInt1) + paramFloat * Color.red(paramInt2);
    float f4 = f1 * Color.green(paramInt1) + paramFloat * Color.green(paramInt2);
    float f5 = f1 * Color.blue(paramInt1) + paramFloat * Color.blue(paramInt2);
    return Color.argb((int)f2, (int)f3, (int)f4, (int)f5);
  }
  
  private static boolean a(float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat1 - paramFloat2) < 0.001F;
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4);
  }
  
  private boolean a(Typeface paramTypeface1, Typeface paramTypeface2)
  {
    return ((paramTypeface1 != null) && (!paramTypeface1.equals(paramTypeface2))) || ((paramTypeface1 == null) && (paramTypeface2 != null));
  }
  
  private boolean b(CharSequence paramCharSequence)
  {
    int i1 = 1;
    if (s.e(this.c) == i1) {
      if (i1 == 0) {
        break label41;
      }
    }
    label41:
    for (c localc = android.support.v4.e.d.d;; localc = android.support.v4.e.d.c)
    {
      return localc.a(paramCharSequence, 0, paramCharSequence.length());
      i1 = 0;
      break;
    }
  }
  
  private void c(float paramFloat)
  {
    d(paramFloat);
    this.s = a(this.q, this.r, paramFloat, this.K);
    this.t = a(this.o, this.p, paramFloat, this.K);
    e(a(this.k, this.l, paramFloat, this.L));
    if (this.n != this.m) {
      this.J.setColor(a(m(), n(), paramFloat));
    }
    for (;;)
    {
      this.J.setShadowLayer(a(this.Q, this.M, paramFloat, null), a(this.R, this.N, paramFloat, null), a(this.S, this.O, paramFloat, null), a(this.T, this.P, paramFloat));
      s.c(this.c);
      return;
      this.J.setColor(n());
    }
  }
  
  private void d(float paramFloat)
  {
    this.h.left = a(this.f.left, this.g.left, paramFloat, this.K);
    this.h.top = a(this.o, this.p, paramFloat, this.K);
    this.h.right = a(this.f.right, this.g.right, paramFloat, this.K);
    this.h.bottom = a(this.f.bottom, this.g.bottom, paramFloat, this.K);
  }
  
  private Typeface e(int paramInt)
  {
    TypedArray localTypedArray = this.c.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      String str = localTypedArray.getString(0);
      if (str != null)
      {
        Typeface localTypeface = Typeface.create(str, 0);
        return localTypeface;
      }
      return null;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  private void e(float paramFloat)
  {
    f(paramFloat);
    if ((a) && (this.F != 1.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      this.A = bool;
      if (this.A) {
        p();
      }
      s.c(this.c);
      return;
    }
  }
  
  private void f(float paramFloat)
  {
    boolean bool1 = true;
    if (this.x == null) {
      return;
    }
    float f1 = this.g.width();
    float f2 = this.f.width();
    float f3;
    boolean bool2;
    if (a(paramFloat, this.l))
    {
      f3 = this.l;
      this.F = 1.0F;
      if (!a(this.w, this.u)) {
        break label341;
      }
      this.w = this.u;
      bool2 = bool1;
    }
    for (;;)
    {
      if (f1 > 0.0F)
      {
        if ((this.G != f3) || (this.I) || (bool2))
        {
          bool2 = bool1;
          label108:
          this.G = f3;
          this.I = false;
        }
      }
      else
      {
        if ((this.y != null) && (!bool2)) {
          break;
        }
        this.J.setTextSize(this.G);
        this.J.setTypeface(this.w);
        TextPaint localTextPaint = this.J;
        if (this.F == 1.0F) {
          break label330;
        }
        label169:
        localTextPaint.setLinearText(bool1);
        CharSequence localCharSequence = TextUtils.ellipsize(this.x, this.J, f1, TextUtils.TruncateAt.END);
        if (TextUtils.equals(localCharSequence, this.y)) {
          break;
        }
        this.y = localCharSequence;
        this.z = b(this.y);
        return;
        f3 = this.k;
        if (!a(this.w, this.v)) {
          break label335;
        }
        this.w = this.v;
      }
      label318:
      label330:
      label335:
      for (bool2 = bool1;; bool2 = false)
      {
        if (a(paramFloat, this.k)) {}
        for (this.F = 1.0F;; this.F = (paramFloat / this.k))
        {
          float f4 = this.l / this.k;
          if (f2 * f4 <= f1) {
            break label318;
          }
          f1 = Math.min(f1 / f4, f2);
          break;
        }
        f1 = f2;
        break;
        bool2 = false;
        break label108;
        bool1 = false;
        break label169;
      }
      label341:
      bool2 = false;
    }
  }
  
  private void l()
  {
    c(this.e);
  }
  
  private int m()
  {
    if (this.H != null) {
      return this.m.getColorForState(this.H, 0);
    }
    return this.m.getDefaultColor();
  }
  
  private int n()
  {
    if (this.H != null) {
      return this.n.getColorForState(this.H, 0);
    }
    return this.n.getDefaultColor();
  }
  
  private void o()
  {
    int i1 = 1;
    float f1 = this.G;
    f(this.l);
    float f2;
    int i3;
    label60:
    float f3;
    if (this.y != null)
    {
      f2 = this.J.measureText(this.y, 0, this.y.length());
      int i2 = this.j;
      if (!this.z) {
        break label379;
      }
      i3 = i1;
      int i4 = android.support.v4.view.d.a(i2, i3);
      switch (i4 & 0x70)
      {
      default: 
        this.p = ((this.J.descent() - this.J.ascent()) / 2.0F - this.J.descent() + this.g.centerY());
        label138:
        switch (i4 & 0x800007)
        {
        default: 
          this.r = this.g.left;
          label184:
          f(this.k);
          CharSequence localCharSequence = this.y;
          f3 = 0.0F;
          if (localCharSequence != null) {
            f3 = this.J.measureText(this.y, 0, this.y.length());
          }
          int i5 = this.i;
          if (this.z)
          {
            label242:
            int i6 = android.support.v4.view.d.a(i5, i1);
            switch (i6 & 0x70)
            {
            default: 
              this.o = ((this.J.descent() - this.J.ascent()) / 2.0F - this.J.descent() + this.f.centerY());
              label318:
              switch (i6 & 0x800007)
              {
              default: 
                this.q = this.f.left;
              }
              break;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      q();
      e(f1);
      return;
      f2 = 0.0F;
      break;
      label379:
      i3 = 0;
      break label60;
      this.p = this.g.bottom;
      break label138;
      this.p = (this.g.top - this.J.ascent());
      break label138;
      this.r = (this.g.centerX() - f2 / 2.0F);
      break label184;
      this.r = (this.g.right - f2);
      break label184;
      i1 = 0;
      break label242;
      this.o = this.f.bottom;
      break label318;
      this.o = (this.f.top - this.J.ascent());
      break label318;
      this.q = (this.f.centerX() - f3 / 2.0F);
      continue;
      this.q = (this.f.right - f3);
    }
  }
  
  private void p()
  {
    if ((this.B != null) || (this.f.isEmpty()) || (TextUtils.isEmpty(this.y))) {}
    do
    {
      int i1;
      int i2;
      do
      {
        return;
        c(0.0F);
        this.D = this.J.ascent();
        this.E = this.J.descent();
        i1 = Math.round(this.J.measureText(this.y, 0, this.y.length()));
        i2 = Math.round(this.E - this.D);
      } while ((i1 <= 0) || (i2 <= 0));
      this.B = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
      new Canvas(this.B).drawText(this.y, 0, this.y.length(), 0.0F, i2 - this.J.descent(), this.J);
    } while (this.C != null);
    this.C = new Paint(3);
  }
  
  private void q()
  {
    if (this.B != null)
    {
      this.B.recycle();
      this.B = null;
    }
  }
  
  void a()
  {
    if ((this.g.width() > 0) && (this.g.height() > 0) && (this.f.width() > 0) && (this.f.height() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
  
  void a(float paramFloat)
  {
    if (this.k != paramFloat)
    {
      this.k = paramFloat;
      i();
    }
  }
  
  void a(int paramInt)
  {
    if (this.i != paramInt)
    {
      this.i = paramInt;
      i();
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.f, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.f.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      a();
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.n != paramColorStateList)
    {
      this.n = paramColorStateList;
      i();
    }
  }
  
  public void a(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    float f1;
    float f2;
    int i2;
    float f3;
    if ((this.y != null) && (this.d))
    {
      f1 = this.s;
      f2 = this.t;
      if ((!this.A) || (this.B == null)) {
        break label135;
      }
      i2 = 1;
      if (i2 == 0) {
        break label141;
      }
      f3 = this.D * this.F;
      (this.E * this.F);
      label73:
      if (i2 != 0) {
        f2 += f3;
      }
      if (this.F != 1.0F) {
        paramCanvas.scale(this.F, this.F, f1, f2);
      }
      if (i2 == 0) {
        break label171;
      }
      paramCanvas.drawBitmap(this.B, f1, f2, this.C);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(i1);
      return;
      label135:
      i2 = 0;
      break;
      label141:
      f3 = this.J.ascent() * this.F;
      (this.J.descent() * this.F);
      break label73;
      label171:
      paramCanvas.drawText(this.y, 0, this.y.length(), f1, f2, this.J);
    }
  }
  
  void a(Typeface paramTypeface)
  {
    if (a(this.u, paramTypeface))
    {
      this.u = paramTypeface;
      i();
    }
  }
  
  void a(Interpolator paramInterpolator)
  {
    this.L = paramInterpolator;
    i();
  }
  
  void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.x)))
    {
      this.x = paramCharSequence;
      this.y = null;
      q();
      i();
    }
  }
  
  final boolean a(int[] paramArrayOfInt)
  {
    this.H = paramArrayOfInt;
    if (f())
    {
      i();
      return true;
    }
    return false;
  }
  
  int b()
  {
    return this.i;
  }
  
  void b(float paramFloat)
  {
    float f1 = android.support.v4.c.a.a(paramFloat, 0.0F, 1.0F);
    if (f1 != this.e)
    {
      this.e = f1;
      l();
    }
  }
  
  void b(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      i();
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.g, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      a();
    }
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (this.m != paramColorStateList)
    {
      this.m = paramColorStateList;
      i();
    }
  }
  
  void b(Typeface paramTypeface)
  {
    if (a(this.v, paramTypeface))
    {
      this.v = paramTypeface;
      i();
    }
  }
  
  void b(Interpolator paramInterpolator)
  {
    this.K = paramInterpolator;
    i();
  }
  
  int c()
  {
    return this.j;
  }
  
  void c(int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.c.getContext(), paramInt, a.j.TextAppearance);
    if (localTintTypedArray.hasValue(a.j.TextAppearance_android_textColor)) {
      this.n = localTintTypedArray.getColorStateList(a.j.TextAppearance_android_textColor);
    }
    if (localTintTypedArray.hasValue(a.j.TextAppearance_android_textSize)) {
      this.l = localTintTypedArray.getDimensionPixelSize(a.j.TextAppearance_android_textSize, (int)this.l);
    }
    this.P = localTintTypedArray.getInt(a.j.TextAppearance_android_shadowColor, 0);
    this.N = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowDx, 0.0F);
    this.O = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowDy, 0.0F);
    this.M = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowRadius, 0.0F);
    localTintTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.u = e(paramInt);
    }
    i();
  }
  
  void c(Typeface paramTypeface)
  {
    this.v = paramTypeface;
    this.u = paramTypeface;
    i();
  }
  
  Typeface d()
  {
    if (this.u != null) {
      return this.u;
    }
    return Typeface.DEFAULT;
  }
  
  void d(int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.c.getContext(), paramInt, a.j.TextAppearance);
    if (localTintTypedArray.hasValue(a.j.TextAppearance_android_textColor)) {
      this.m = localTintTypedArray.getColorStateList(a.j.TextAppearance_android_textColor);
    }
    if (localTintTypedArray.hasValue(a.j.TextAppearance_android_textSize)) {
      this.k = localTintTypedArray.getDimensionPixelSize(a.j.TextAppearance_android_textSize, (int)this.k);
    }
    this.T = localTintTypedArray.getInt(a.j.TextAppearance_android_shadowColor, 0);
    this.R = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowDx, 0.0F);
    this.S = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowDy, 0.0F);
    this.Q = localTintTypedArray.getFloat(a.j.TextAppearance_android_shadowRadius, 0.0F);
    localTintTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.v = e(paramInt);
    }
    i();
  }
  
  Typeface e()
  {
    if (this.v != null) {
      return this.v;
    }
    return Typeface.DEFAULT;
  }
  
  final boolean f()
  {
    return ((this.n != null) && (this.n.isStateful())) || ((this.m != null) && (this.m.isStateful()));
  }
  
  float g()
  {
    return this.e;
  }
  
  float h()
  {
    return this.l;
  }
  
  public void i()
  {
    if ((this.c.getHeight() > 0) && (this.c.getWidth() > 0))
    {
      o();
      l();
    }
  }
  
  CharSequence j()
  {
    return this.x;
  }
  
  ColorStateList k()
  {
    return this.n;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.e
 * JD-Core Version:    0.7.0.1
 */