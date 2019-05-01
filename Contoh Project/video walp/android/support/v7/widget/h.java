package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.view.s;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.SeekBar;

class h
  extends g
{
  private final SeekBar a;
  private Drawable b;
  private ColorStateList c = null;
  private PorterDuff.Mode d = null;
  private boolean e = false;
  private boolean f = false;
  
  h(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    this.a = paramSeekBar;
  }
  
  private void d()
  {
    if ((this.b != null) && ((this.e) || (this.f)))
    {
      this.b = a.g(this.b.mutate());
      if (this.e) {
        a.a(this.b, this.c);
      }
      if (this.f) {
        a.a(this.b, this.d);
      }
      if (this.b.isStateful()) {
        this.b.setState(this.a.getDrawableState());
      }
    }
  }
  
  void a(Canvas paramCanvas)
  {
    int i = 1;
    if (this.b != null)
    {
      int j = this.a.getMax();
      if (j > i)
      {
        int k = this.b.getIntrinsicWidth();
        int m = this.b.getIntrinsicHeight();
        if (k >= 0) {}
        int i1;
        for (int n = k / 2;; n = i)
        {
          if (m >= 0) {
            i = m / 2;
          }
          this.b.setBounds(-n, -i, n, i);
          float f1 = (this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight()) / j;
          i1 = paramCanvas.save();
          paramCanvas.translate(this.a.getPaddingLeft(), this.a.getHeight() / 2);
          for (int i2 = 0; i2 <= j; i2++)
          {
            this.b.draw(paramCanvas);
            paramCanvas.translate(f1, 0.0F);
          }
        }
        paramCanvas.restoreToCount(i1);
      }
    }
  }
  
  void a(Drawable paramDrawable)
  {
    if (this.b != null) {
      this.b.setCallback(null);
    }
    this.b = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this.a);
      a.b(paramDrawable, s.e(this.a));
      if (paramDrawable.isStateful()) {
        paramDrawable.setState(this.a.getDrawableState());
      }
      d();
    }
    this.a.invalidate();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.a.getContext(), paramAttributeSet, a.j.AppCompatSeekBar, paramInt, 0);
    Drawable localDrawable = localTintTypedArray.getDrawableIfKnown(a.j.AppCompatSeekBar_android_thumb);
    if (localDrawable != null) {
      this.a.setThumb(localDrawable);
    }
    a(localTintTypedArray.getDrawable(a.j.AppCompatSeekBar_tickMark));
    if (localTintTypedArray.hasValue(a.j.AppCompatSeekBar_tickMarkTintMode))
    {
      this.d = DrawableUtils.parseTintMode(localTintTypedArray.getInt(a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.d);
      this.f = true;
    }
    if (localTintTypedArray.hasValue(a.j.AppCompatSeekBar_tickMarkTint))
    {
      this.c = localTintTypedArray.getColorStateList(a.j.AppCompatSeekBar_tickMarkTint);
      this.e = true;
    }
    localTintTypedArray.recycle();
    d();
  }
  
  void b()
  {
    if (this.b != null) {
      this.b.jumpToCurrentState();
    }
  }
  
  void c()
  {
    Drawable localDrawable = this.b;
    if ((localDrawable != null) && (localDrawable.isStateful()) && (localDrawable.setState(this.a.getDrawableState()))) {
      this.a.invalidateDrawable(localDrawable);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.h
 * JD-Core Version:    0.7.0.1
 */