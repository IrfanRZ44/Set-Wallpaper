package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.j;
import android.support.v7.a.a.j;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageHelper
{
  private ad mImageTint;
  private ad mInternalImageTint;
  private ad mTmpInfo;
  private final ImageView mView;
  
  public AppCompatImageHelper(ImageView paramImageView)
  {
    this.mView = paramImageView;
  }
  
  private boolean applyFrameworkTintUsingColorFilter(Drawable paramDrawable)
  {
    if (this.mTmpInfo == null) {
      this.mTmpInfo = new ad();
    }
    ad localad = this.mTmpInfo;
    localad.a();
    ColorStateList localColorStateList = j.a(this.mView);
    if (localColorStateList != null)
    {
      localad.d = true;
      localad.a = localColorStateList;
    }
    PorterDuff.Mode localMode = j.b(this.mView);
    if (localMode != null)
    {
      localad.c = true;
      localad.b = localMode;
    }
    if ((localad.d) || (localad.c))
    {
      AppCompatDrawableManager.tintDrawable(paramDrawable, localad, this.mView.getDrawableState());
      return true;
    }
    return false;
  }
  
  private boolean shouldApplyFrameworkTintUsingColorFilter()
  {
    int i = Build.VERSION.SDK_INT;
    if (i > 21) {
      if (this.mInternalImageTint == null) {}
    }
    while (i == 21)
    {
      return true;
      return false;
    }
    return false;
  }
  
  void applySupportImageTint()
  {
    Drawable localDrawable = this.mView.getDrawable();
    if (localDrawable != null) {
      DrawableUtils.fixDrawable(localDrawable);
    }
    if ((localDrawable == null) || ((shouldApplyFrameworkTintUsingColorFilter()) && (applyFrameworkTintUsingColorFilter(localDrawable)))) {}
    do
    {
      return;
      if (this.mImageTint != null)
      {
        AppCompatDrawableManager.tintDrawable(localDrawable, this.mImageTint, this.mView.getDrawableState());
        return;
      }
    } while (this.mInternalImageTint == null);
    AppCompatDrawableManager.tintDrawable(localDrawable, this.mInternalImageTint, this.mView.getDrawableState());
  }
  
  ColorStateList getSupportImageTintList()
  {
    if (this.mImageTint != null) {
      return this.mImageTint.a;
    }
    return null;
  }
  
  PorterDuff.Mode getSupportImageTintMode()
  {
    if (this.mImageTint != null) {
      return this.mImageTint.b;
    }
    return null;
  }
  
  boolean hasOverlappingRendering()
  {
    Drawable localDrawable = this.mView.getBackground();
    return (Build.VERSION.SDK_INT < 21) || (!(localDrawable instanceof RippleDrawable));
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), paramAttributeSet, a.j.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = this.mView.getDrawable();
      if (localDrawable == null)
      {
        int i = localTintTypedArray.getResourceId(a.j.AppCompatImageView_srcCompat, -1);
        if (i != -1)
        {
          localDrawable = b.b(this.mView.getContext(), i);
          if (localDrawable != null) {
            this.mView.setImageDrawable(localDrawable);
          }
        }
      }
      if (localDrawable != null) {
        DrawableUtils.fixDrawable(localDrawable);
      }
      if (localTintTypedArray.hasValue(a.j.AppCompatImageView_tint)) {
        j.a(this.mView, localTintTypedArray.getColorStateList(a.j.AppCompatImageView_tint));
      }
      if (localTintTypedArray.hasValue(a.j.AppCompatImageView_tintMode)) {
        j.a(this.mView, DrawableUtils.parseTintMode(localTintTypedArray.getInt(a.j.AppCompatImageView_tintMode, -1), null));
      }
      return;
    }
    finally
    {
      localTintTypedArray.recycle();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = b.b(this.mView.getContext(), paramInt);
      if (localDrawable != null) {
        DrawableUtils.fixDrawable(localDrawable);
      }
      this.mView.setImageDrawable(localDrawable);
    }
    for (;;)
    {
      applySupportImageTint();
      return;
      this.mView.setImageDrawable(null);
    }
  }
  
  void setInternalImageTint(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.mInternalImageTint == null) {
        this.mInternalImageTint = new ad();
      }
      this.mInternalImageTint.a = paramColorStateList;
      this.mInternalImageTint.d = true;
    }
    for (;;)
    {
      applySupportImageTint();
      return;
      this.mInternalImageTint = null;
    }
  }
  
  void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    if (this.mImageTint == null) {
      this.mImageTint = new ad();
    }
    this.mImageTint.a = paramColorStateList;
    this.mImageTint.d = true;
    applySupportImageTint();
  }
  
  void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    if (this.mImageTint == null) {
      this.mImageTint = new ad();
    }
    this.mImageTint.b = paramMode;
    this.mImageTint.c = true;
    applySupportImageTint();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatImageHelper
 * JD-Core Version:    0.7.0.1
 */