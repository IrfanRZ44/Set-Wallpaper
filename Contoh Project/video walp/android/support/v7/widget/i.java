package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a.b.a;
import android.support.v4.widget.b;
import android.support.v7.a.a.j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class i
{
  final TextView a;
  private ad b;
  private ad c;
  private ad d;
  private ad e;
  private final k f;
  private int g = 0;
  private Typeface h;
  private boolean i;
  
  i(TextView paramTextView)
  {
    this.a = paramTextView;
    this.f = new k(this.a);
  }
  
  protected static ad a(Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    ColorStateList localColorStateList = paramAppCompatDrawableManager.getTintList(paramContext, paramInt);
    if (localColorStateList != null)
    {
      ad localad = new ad();
      localad.d = true;
      localad.a = localColorStateList;
      return localad;
    }
    return null;
  }
  
  static i a(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new j(paramTextView);
    }
    return new i(paramTextView);
  }
  
  private void a(Context paramContext, TintTypedArray paramTintTypedArray)
  {
    int j = 1;
    this.g = paramTintTypedArray.getInt(a.j.TextAppearance_android_textStyle, this.g);
    if ((paramTintTypedArray.hasValue(a.j.TextAppearance_android_fontFamily)) || (paramTintTypedArray.hasValue(a.j.TextAppearance_fontFamily)))
    {
      this.h = null;
      if (paramTintTypedArray.hasValue(a.j.TextAppearance_fontFamily))
      {
        k = a.j.TextAppearance_fontFamily;
        if (!paramContext.isRestricted()) {
          local1 = new b.a()
          {
            public void a(int paramAnonymousInt) {}
            
            public void a(Typeface paramAnonymousTypeface)
            {
              i.a(i.this, this.a, paramAnonymousTypeface);
            }
          };
        }
      }
    }
    try
    {
      this.h = paramTintTypedArray.getFont(k, this.g, local1);
      if (this.h != null) {
        break label155;
      }
      this.i = j;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      break label113;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      label113:
      break label113;
    }
    if (this.h == null)
    {
      str = paramTintTypedArray.getString(k);
      if (str != null) {
        this.h = Typeface.create(str, this.g);
      }
    }
    label155:
    while (!paramTintTypedArray.hasValue(a.j.TextAppearance_android_typeface)) {
      for (;;)
      {
        b.a local1;
        String str;
        return;
        int k = a.j.TextAppearance_android_fontFamily;
        continue;
        j = 0;
      }
    }
    this.i = false;
    switch (paramTintTypedArray.getInt(a.j.TextAppearance_android_typeface, j))
    {
    default: 
      return;
    case 1: 
      this.h = Typeface.SANS_SERIF;
      return;
    case 2: 
      this.h = Typeface.SERIF;
      return;
    }
    this.h = Typeface.MONOSPACE;
  }
  
  private void a(WeakReference<TextView> paramWeakReference, Typeface paramTypeface)
  {
    if (this.i)
    {
      this.h = paramTypeface;
      TextView localTextView = (TextView)paramWeakReference.get();
      if (localTextView != null) {
        localTextView.setTypeface(paramTypeface, this.g);
      }
    }
  }
  
  private void b(int paramInt, float paramFloat)
  {
    this.f.a(paramInt, paramFloat);
  }
  
  void a()
  {
    if ((this.b != null) || (this.c != null) || (this.d != null) || (this.e != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[1], this.c);
      a(arrayOfDrawable[2], this.d);
      a(arrayOfDrawable[3], this.e);
    }
  }
  
  void a(int paramInt)
  {
    this.f.a(paramInt);
  }
  
  void a(int paramInt, float paramFloat)
  {
    if ((!b.a) && (!c())) {
      b(paramInt, paramFloat);
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void a(Context paramContext, int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, a.j.TextAppearance);
    if (localTintTypedArray.hasValue(a.j.TextAppearance_textAllCaps)) {
      a(localTintTypedArray.getBoolean(a.j.TextAppearance_textAllCaps, false));
    }
    if ((Build.VERSION.SDK_INT < 23) && (localTintTypedArray.hasValue(a.j.TextAppearance_android_textColor)))
    {
      ColorStateList localColorStateList = localTintTypedArray.getColorStateList(a.j.TextAppearance_android_textColor);
      if (localColorStateList != null) {
        this.a.setTextColor(localColorStateList);
      }
    }
    a(paramContext, localTintTypedArray);
    localTintTypedArray.recycle();
    if (this.h != null) {
      this.a.setTypeface(this.h, this.g);
    }
  }
  
  final void a(Drawable paramDrawable, ad paramad)
  {
    if ((paramDrawable != null) && (paramad != null)) {
      AppCompatDrawableManager.tintDrawable(paramDrawable, paramad, this.a.getDrawableState());
    }
  }
  
  @SuppressLint({"NewApi"})
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Context localContext = this.a.getContext();
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    TintTypedArray localTintTypedArray1 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, a.j.AppCompatTextHelper, paramInt, 0);
    int j = localTintTypedArray1.getResourceId(a.j.AppCompatTextHelper_android_textAppearance, -1);
    if (localTintTypedArray1.hasValue(a.j.AppCompatTextHelper_android_drawableLeft)) {
      this.b = a(localContext, localAppCompatDrawableManager, localTintTypedArray1.getResourceId(a.j.AppCompatTextHelper_android_drawableLeft, 0));
    }
    if (localTintTypedArray1.hasValue(a.j.AppCompatTextHelper_android_drawableTop)) {
      this.c = a(localContext, localAppCompatDrawableManager, localTintTypedArray1.getResourceId(a.j.AppCompatTextHelper_android_drawableTop, 0));
    }
    if (localTintTypedArray1.hasValue(a.j.AppCompatTextHelper_android_drawableRight)) {
      this.d = a(localContext, localAppCompatDrawableManager, localTintTypedArray1.getResourceId(a.j.AppCompatTextHelper_android_drawableRight, 0));
    }
    if (localTintTypedArray1.hasValue(a.j.AppCompatTextHelper_android_drawableBottom)) {
      this.e = a(localContext, localAppCompatDrawableManager, localTintTypedArray1.getResourceId(a.j.AppCompatTextHelper_android_drawableBottom, 0));
    }
    localTintTypedArray1.recycle();
    boolean bool1 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool2;
    int k;
    ColorStateList localColorStateList1;
    label256:
    ColorStateList localColorStateList3;
    label277:
    ColorStateList localColorStateList2;
    if (j != -1)
    {
      TintTypedArray localTintTypedArray3 = TintTypedArray.obtainStyledAttributes(localContext, j, a.j.TextAppearance);
      if ((!bool1) && (localTintTypedArray3.hasValue(a.j.TextAppearance_textAllCaps)))
      {
        bool2 = localTintTypedArray3.getBoolean(a.j.TextAppearance_textAllCaps, false);
        k = 1;
        a(localContext, localTintTypedArray3);
        if (Build.VERSION.SDK_INT < 23) {
          if (localTintTypedArray3.hasValue(a.j.TextAppearance_android_textColor))
          {
            localColorStateList1 = localTintTypedArray3.getColorStateList(a.j.TextAppearance_android_textColor);
            if (localTintTypedArray3.hasValue(a.j.TextAppearance_android_textColorHint))
            {
              localColorStateList3 = localTintTypedArray3.getColorStateList(a.j.TextAppearance_android_textColorHint);
              boolean bool3 = localTintTypedArray3.hasValue(a.j.TextAppearance_android_textColorLink);
              localColorStateList2 = null;
              if (bool3) {
                localColorStateList2 = localTintTypedArray3.getColorStateList(a.j.TextAppearance_android_textColorLink);
              }
              label305:
              localTintTypedArray3.recycle();
            }
          }
        }
      }
    }
    for (;;)
    {
      TintTypedArray localTintTypedArray2 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, a.j.TextAppearance, paramInt, 0);
      if ((!bool1) && (localTintTypedArray2.hasValue(a.j.TextAppearance_textAllCaps)))
      {
        bool2 = localTintTypedArray2.getBoolean(a.j.TextAppearance_textAllCaps, false);
        k = 1;
      }
      if (Build.VERSION.SDK_INT < 23)
      {
        if (localTintTypedArray2.hasValue(a.j.TextAppearance_android_textColor)) {
          localColorStateList1 = localTintTypedArray2.getColorStateList(a.j.TextAppearance_android_textColor);
        }
        if (localTintTypedArray2.hasValue(a.j.TextAppearance_android_textColorHint)) {
          localColorStateList3 = localTintTypedArray2.getColorStateList(a.j.TextAppearance_android_textColorHint);
        }
        if (localTintTypedArray2.hasValue(a.j.TextAppearance_android_textColorLink)) {
          localColorStateList2 = localTintTypedArray2.getColorStateList(a.j.TextAppearance_android_textColorLink);
        }
      }
      a(localContext, localTintTypedArray2);
      localTintTypedArray2.recycle();
      if (localColorStateList1 != null) {
        this.a.setTextColor(localColorStateList1);
      }
      if (localColorStateList3 != null) {
        this.a.setHintTextColor(localColorStateList3);
      }
      if (localColorStateList2 != null) {
        this.a.setLinkTextColor(localColorStateList2);
      }
      if ((!bool1) && (k != 0)) {
        a(bool2);
      }
      if (this.h != null) {
        this.a.setTypeface(this.h, this.g);
      }
      this.f.a(paramAttributeSet, paramInt);
      int[] arrayOfInt;
      if ((b.a) && (this.f.a() != 0))
      {
        arrayOfInt = this.f.e();
        if (arrayOfInt.length > 0)
        {
          if (this.a.getAutoSizeStepGranularity() == -1.0F) {
            break label600;
          }
          this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f.c(), this.f.d(), this.f.b(), 0);
        }
      }
      return;
      label600:
      this.a.setAutoSizeTextTypeUniformWithPresetSizes(arrayOfInt, 0);
      return;
      localColorStateList3 = null;
      break label277;
      localColorStateList1 = null;
      break label256;
      localColorStateList1 = null;
      localColorStateList2 = null;
      localColorStateList3 = null;
      break label305;
      k = 0;
      bool2 = false;
      break;
      k = 0;
      bool2 = false;
      localColorStateList1 = null;
      localColorStateList2 = null;
      localColorStateList3 = null;
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.a.setAllCaps(paramBoolean);
  }
  
  void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!b.a) {
      b();
    }
  }
  
  void a(int[] paramArrayOfInt, int paramInt)
  {
    this.f.a(paramArrayOfInt, paramInt);
  }
  
  void b()
  {
    this.f.f();
  }
  
  boolean c()
  {
    return this.f.g();
  }
  
  int d()
  {
    return this.f.a();
  }
  
  int e()
  {
    return this.f.b();
  }
  
  int f()
  {
    return this.f.c();
  }
  
  int g()
  {
    return this.f.d();
  }
  
  int[] h()
  {
    return this.f.e();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.i
 * JD-Core Version:    0.7.0.1
 */