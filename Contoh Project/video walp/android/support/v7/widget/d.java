package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.View;

class d
{
  private final View a;
  private final AppCompatDrawableManager b;
  private int c = -1;
  private ad d;
  private ad e;
  private ad f;
  
  d(View paramView)
  {
    this.a = paramView;
    this.b = AppCompatDrawableManager.get();
  }
  
  private boolean b(Drawable paramDrawable)
  {
    if (this.f == null) {
      this.f = new ad();
    }
    ad localad = this.f;
    localad.a();
    ColorStateList localColorStateList = s.t(this.a);
    if (localColorStateList != null)
    {
      localad.d = true;
      localad.a = localColorStateList;
    }
    PorterDuff.Mode localMode = s.u(this.a);
    if (localMode != null)
    {
      localad.c = true;
      localad.b = localMode;
    }
    if ((localad.d) || (localad.c))
    {
      AppCompatDrawableManager.tintDrawable(paramDrawable, localad, this.a.getDrawableState());
      return true;
    }
    return false;
  }
  
  private boolean d()
  {
    int i = Build.VERSION.SDK_INT;
    if (i > 21) {
      if (this.d == null) {}
    }
    while (i == 21)
    {
      return true;
      return false;
    }
    return false;
  }
  
  ColorStateList a()
  {
    if (this.e != null) {
      return this.e.a;
    }
    return null;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
    if (this.b != null) {}
    for (ColorStateList localColorStateList = this.b.getTintList(this.a.getContext(), paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      c();
      return;
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.e == null) {
      this.e = new ad();
    }
    this.e.a = paramColorStateList;
    this.e.d = true;
    c();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.e == null) {
      this.e = new ad();
    }
    this.e.b = paramMode;
    this.e.c = true;
    c();
  }
  
  void a(Drawable paramDrawable)
  {
    this.c = -1;
    b(null);
    c();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.a.getContext(), paramAttributeSet, a.j.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (localTintTypedArray.hasValue(a.j.ViewBackgroundHelper_android_background))
      {
        this.c = localTintTypedArray.getResourceId(a.j.ViewBackgroundHelper_android_background, -1);
        ColorStateList localColorStateList = this.b.getTintList(this.a.getContext(), this.c);
        if (localColorStateList != null) {
          b(localColorStateList);
        }
      }
      if (localTintTypedArray.hasValue(a.j.ViewBackgroundHelper_backgroundTint)) {
        s.a(this.a, localTintTypedArray.getColorStateList(a.j.ViewBackgroundHelper_backgroundTint));
      }
      if (localTintTypedArray.hasValue(a.j.ViewBackgroundHelper_backgroundTintMode)) {
        s.a(this.a, DrawableUtils.parseTintMode(localTintTypedArray.getInt(a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
      }
      return;
    }
    finally
    {
      localTintTypedArray.recycle();
    }
  }
  
  PorterDuff.Mode b()
  {
    if (this.e != null) {
      return this.e.b;
    }
    return null;
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.d == null) {
        this.d = new ad();
      }
      this.d.a = paramColorStateList;
      this.d.d = true;
    }
    for (;;)
    {
      c();
      return;
      this.d = null;
    }
  }
  
  void c()
  {
    Drawable localDrawable = this.a.getBackground();
    if ((localDrawable == null) || ((d()) && (b(localDrawable)))) {}
    do
    {
      return;
      if (this.e != null)
      {
        AppCompatDrawableManager.tintDrawable(localDrawable, this.e, this.a.getDrawableState());
        return;
      }
    } while (this.d == null);
    AppCompatDrawableManager.tintDrawable(localDrawable, this.d, this.a.getDrawableState());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.d
 * JD-Core Version:    0.7.0.1
 */