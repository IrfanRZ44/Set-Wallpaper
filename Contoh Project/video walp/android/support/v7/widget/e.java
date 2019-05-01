package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.support.v7.a.a.j;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class e
{
  private final CompoundButton a;
  private ColorStateList b = null;
  private PorterDuff.Mode c = null;
  private boolean d = false;
  private boolean e = false;
  private boolean f;
  
  e(CompoundButton paramCompoundButton)
  {
    this.a = paramCompoundButton;
  }
  
  int a(int paramInt)
  {
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = android.support.v4.widget.e.a(this.a);
      if (localDrawable != null) {
        paramInt += localDrawable.getIntrinsicWidth();
      }
    }
    return paramInt;
  }
  
  ColorStateList a()
  {
    return this.b;
  }
  
  void a(ColorStateList paramColorStateList)
  {
    this.b = paramColorStateList;
    this.d = true;
    d();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    this.c = paramMode;
    this.e = true;
    d();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = this.a.getContext().obtainStyledAttributes(paramAttributeSet, a.j.CompoundButton, paramInt, 0);
    try
    {
      if (localTypedArray.hasValue(a.j.CompoundButton_android_button))
      {
        int i = localTypedArray.getResourceId(a.j.CompoundButton_android_button, 0);
        if (i != 0) {
          this.a.setButtonDrawable(b.b(this.a.getContext(), i));
        }
      }
      if (localTypedArray.hasValue(a.j.CompoundButton_buttonTint)) {
        android.support.v4.widget.e.a(this.a, localTypedArray.getColorStateList(a.j.CompoundButton_buttonTint));
      }
      if (localTypedArray.hasValue(a.j.CompoundButton_buttonTintMode)) {
        android.support.v4.widget.e.a(this.a, DrawableUtils.parseTintMode(localTypedArray.getInt(a.j.CompoundButton_buttonTintMode, -1), null));
      }
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  PorterDuff.Mode b()
  {
    return this.c;
  }
  
  void c()
  {
    if (this.f)
    {
      this.f = false;
      return;
    }
    this.f = true;
    d();
  }
  
  void d()
  {
    Drawable localDrawable1 = android.support.v4.widget.e.a(this.a);
    if ((localDrawable1 != null) && ((this.d) || (this.e)))
    {
      Drawable localDrawable2 = a.g(localDrawable1).mutate();
      if (this.d) {
        a.a(localDrawable2, this.b);
      }
      if (this.e) {
        a.a(localDrawable2, this.c);
      }
      if (localDrawable2.isStateful()) {
        localDrawable2.setState(this.a.getDrawableState());
      }
      this.a.setButtonDrawable(localDrawable2);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e
 * JD-Core Version:    0.7.0.1
 */