package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.TextView;

class j
  extends i
{
  private ad b;
  private ad c;
  
  j(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  void a()
  {
    super.a();
    if ((this.b != null) || (this.c != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[2], this.c);
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Context localContext = this.a.getContext();
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, a.j.AppCompatTextHelper, paramInt, 0);
    if (localTypedArray.hasValue(a.j.AppCompatTextHelper_android_drawableStart)) {
      this.b = a(localContext, localAppCompatDrawableManager, localTypedArray.getResourceId(a.j.AppCompatTextHelper_android_drawableStart, 0));
    }
    if (localTypedArray.hasValue(a.j.AppCompatTextHelper_android_drawableEnd)) {
      this.c = a(localContext, localAppCompatDrawableManager, localTypedArray.getResourceId(a.j.AppCompatTextHelper_android_drawableEnd, 0));
    }
    localTypedArray.recycle();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.j
 * JD-Core Version:    0.7.0.1
 */