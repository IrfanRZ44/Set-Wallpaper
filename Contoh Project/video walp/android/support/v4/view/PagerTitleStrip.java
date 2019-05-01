package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.o;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.a
public class PagerTitleStrip
  extends ViewGroup
{
  private static final int[] n = { 16842804, 16842901, 16842904, 16842927 };
  private static final int[] o = { 16843660 };
  ViewPager a;
  TextView b;
  TextView c;
  TextView d;
  float e = -1.0F;
  int f;
  private int g = -1;
  private int h;
  private int i;
  private boolean j;
  private boolean k;
  private final a l = new a();
  private WeakReference<p> m;
  private int p;
  
  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView1 = new TextView(paramContext);
    this.b = localTextView1;
    addView(localTextView1);
    TextView localTextView2 = new TextView(paramContext);
    this.c = localTextView2;
    addView(localTextView2);
    TextView localTextView3 = new TextView(paramContext);
    this.d = localTextView3;
    addView(localTextView3);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, n);
    int i1 = localTypedArray1.getResourceId(0, 0);
    if (i1 != 0)
    {
      o.a(this.b, i1);
      o.a(this.c, i1);
      o.a(this.d, i1);
    }
    int i2 = localTypedArray1.getDimensionPixelSize(1, 0);
    if (i2 != 0) {
      a(0, i2);
    }
    if (localTypedArray1.hasValue(2))
    {
      int i3 = localTypedArray1.getColor(2, 0);
      this.b.setTextColor(i3);
      this.c.setTextColor(i3);
      this.d.setTextColor(i3);
    }
    this.i = localTypedArray1.getInteger(3, 80);
    localTypedArray1.recycle();
    this.f = this.c.getTextColors().getDefaultColor();
    setNonPrimaryAlpha(0.6F);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    boolean bool = false;
    if (i1 != 0)
    {
      TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(i1, o);
      bool = localTypedArray2.getBoolean(0, false);
      localTypedArray2.recycle();
    }
    if (bool)
    {
      setSingleLineAllCaps(this.b);
      setSingleLineAllCaps(this.c);
      setSingleLineAllCaps(this.d);
    }
    for (;;)
    {
      this.h = ((int)(16.0F * paramContext.getResources().getDisplayMetrics().density));
      return;
      this.b.setSingleLine();
      this.c.setSingleLine();
      this.d.setSingleLine();
    }
  }
  
  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    paramTextView.setTransformationMethod(new b(paramTextView.getContext()));
  }
  
  public void a(int paramInt, float paramFloat)
  {
    this.b.setTextSize(paramInt, paramFloat);
    this.c.setTextSize(paramInt, paramFloat);
    this.d.setTextSize(paramInt, paramFloat);
  }
  
  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i1;
    int i3;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i14;
    int i15;
    int i20;
    int i21;
    int i22;
    int i26;
    int i28;
    int i29;
    int i30;
    if (paramInt != this.g)
    {
      a(paramInt, this.a.getAdapter());
      this.k = true;
      i1 = this.b.getMeasuredWidth();
      int i2 = this.c.getMeasuredWidth();
      i3 = this.d.getMeasuredWidth();
      int i4 = i2 / 2;
      i5 = getWidth();
      i6 = getHeight();
      i7 = getPaddingLeft();
      i8 = getPaddingRight();
      i9 = getPaddingTop();
      i10 = getPaddingBottom();
      int i11 = i7 + i4;
      int i12 = i8 + i4;
      int i13 = i5 - i11 - i12;
      float f1 = 0.5F + paramFloat;
      if (f1 > 1.0F) {
        f1 -= 1.0F;
      }
      i14 = i5 - i12 - (int)(f1 * i13) - i2 / 2;
      i15 = i14 + i2;
      int i16 = this.b.getBaseline();
      int i17 = this.c.getBaseline();
      int i18 = this.d.getBaseline();
      int i19 = Math.max(Math.max(i16, i17), i18);
      i20 = i19 - i16;
      i21 = i19 - i17;
      i22 = i19 - i18;
      int i23 = i20 + this.b.getMeasuredHeight();
      int i24 = i21 + this.c.getMeasuredHeight();
      int i25 = i22 + this.d.getMeasuredHeight();
      i26 = Math.max(Math.max(i23, i24), i25);
      switch (0x70 & this.i)
      {
      default: 
        i28 = i9 + i20;
        i29 = i21 + i9;
        i30 = i9 + i22;
      }
    }
    for (;;)
    {
      this.c.layout(i14, i29, i15, i29 + this.c.getMeasuredHeight());
      int i31 = Math.min(i7, i14 - this.h - i1);
      this.b.layout(i31, i28, i1 + i31, i28 + this.b.getMeasuredHeight());
      int i32 = Math.max(i5 - i8 - i3, i15 + this.h);
      this.d.layout(i32, i30, i32 + i3, i30 + this.d.getMeasuredHeight());
      this.e = paramFloat;
      this.k = false;
      return;
      if ((paramBoolean) || (paramFloat != this.e)) {
        break;
      }
      return;
      int i33 = (i6 - i9 - i10 - i26) / 2;
      i28 = i33 + i20;
      i29 = i21 + i33;
      i30 = i33 + i22;
      continue;
      int i27 = i6 - i10 - i26;
      i28 = i27 + i20;
      i29 = i21 + i27;
      i30 = i27 + i22;
    }
  }
  
  void a(int paramInt, p paramp)
  {
    int i1;
    if (paramp != null)
    {
      i1 = paramp.getCount();
      this.j = true;
      if ((paramInt < 1) || (paramp == null)) {
        break label239;
      }
    }
    label239:
    for (CharSequence localCharSequence1 = paramp.getPageTitle(paramInt - 1);; localCharSequence1 = null)
    {
      this.b.setText(localCharSequence1);
      TextView localTextView = this.c;
      if ((paramp != null) && (paramInt < i1)) {}
      for (CharSequence localCharSequence2 = paramp.getPageTitle(paramInt);; localCharSequence2 = null)
      {
        localTextView.setText(localCharSequence2);
        int i2 = paramInt + 1;
        CharSequence localCharSequence3 = null;
        if (i2 < i1)
        {
          localCharSequence3 = null;
          if (paramp != null) {
            localCharSequence3 = paramp.getPageTitle(paramInt + 1);
          }
        }
        this.d.setText(localCharSequence3);
        int i3 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)(0.8F * (getWidth() - getPaddingLeft() - getPaddingRight()))), -2147483648);
        int i4 = View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), -2147483648);
        this.b.measure(i3, i4);
        this.c.measure(i3, i4);
        this.d.measure(i3, i4);
        this.g = paramInt;
        if (!this.k) {
          a(paramInt, this.e, false);
        }
        this.j = false;
        return;
        i1 = 0;
        break;
      }
    }
  }
  
  void a(p paramp1, p paramp2)
  {
    if (paramp1 != null)
    {
      paramp1.unregisterDataSetObserver(this.l);
      this.m = null;
    }
    if (paramp2 != null)
    {
      paramp2.registerDataSetObserver(this.l);
      this.m = new WeakReference(paramp2);
    }
    if (this.a != null)
    {
      this.g = -1;
      this.e = -1.0F;
      a(this.a.getCurrentItem(), paramp2);
      requestLayout();
    }
  }
  
  int getMinHeight()
  {
    Drawable localDrawable = getBackground();
    int i1 = 0;
    if (localDrawable != null) {
      i1 = localDrawable.getIntrinsicHeight();
    }
    return i1;
  }
  
  public int getTextSpacing()
  {
    return this.h;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if (!(localViewParent instanceof ViewPager)) {
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }
    ViewPager localViewPager = (ViewPager)localViewParent;
    p localp1 = localViewPager.getAdapter();
    localViewPager.c(this.l);
    localViewPager.a(this.l);
    this.a = localViewPager;
    if (this.m != null) {}
    for (p localp2 = (p)this.m.get();; localp2 = null)
    {
      a(localp2, localp1);
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
    {
      a(this.a.getAdapter(), null);
      this.a.c(null);
      this.a.b(this.l);
      this.a = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      boolean bool = this.e < 0.0F;
      float f1 = 0.0F;
      if (!bool) {
        f1 = this.e;
      }
      a(this.g, f1, true);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException("Must measure with an exact width");
    }
    int i1 = getPaddingTop() + getPaddingBottom();
    int i2 = getChildMeasureSpec(paramInt2, i1, -2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = getChildMeasureSpec(paramInt1, (int)(0.2F * i3), -2);
    this.b.measure(i4, i2);
    this.c.measure(i4, i2);
    this.d.measure(i4, i2);
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824) {}
    int i5;
    for (int i6 = View.MeasureSpec.getSize(paramInt2);; i6 = Math.max(getMinHeight(), i1 + i5))
    {
      setMeasuredDimension(i3, View.resolveSizeAndState(i6, paramInt2, this.c.getMeasuredState() << 16));
      return;
      i5 = this.c.getMeasuredHeight();
    }
  }
  
  public void requestLayout()
  {
    if (!this.j) {
      super.requestLayout();
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.i = paramInt;
    requestLayout();
  }
  
  public void setNonPrimaryAlpha(float paramFloat)
  {
    this.p = (0xFF & (int)(255.0F * paramFloat));
    int i1 = this.p << 24 | 0xFFFFFF & this.f;
    this.b.setTextColor(i1);
    this.d.setTextColor(i1);
  }
  
  public void setTextColor(int paramInt)
  {
    this.f = paramInt;
    this.c.setTextColor(paramInt);
    int i1 = this.p << 24 | 0xFFFFFF & this.f;
    this.b.setTextColor(i1);
    this.d.setTextColor(i1);
  }
  
  public void setTextSpacing(int paramInt)
  {
    this.h = paramInt;
    requestLayout();
  }
  
  private class a
    extends DataSetObserver
    implements ViewPager.d, ViewPager.e
  {
    private int b;
    
    a() {}
    
    public void a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public void a(int paramInt1, float paramFloat, int paramInt2)
    {
      if (paramFloat > 0.5F) {
        paramInt1++;
      }
      PagerTitleStrip.this.a(paramInt1, paramFloat, false);
    }
    
    public void a(ViewPager paramViewPager, p paramp1, p paramp2)
    {
      PagerTitleStrip.this.a(paramp1, paramp2);
    }
    
    public void b(int paramInt)
    {
      if (this.b == 0)
      {
        PagerTitleStrip.this.a(PagerTitleStrip.this.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
        boolean bool = PagerTitleStrip.this.e < 0.0F;
        float f = 0.0F;
        if (!bool) {
          f = PagerTitleStrip.this.e;
        }
        PagerTitleStrip.this.a(PagerTitleStrip.this.a.getCurrentItem(), f, true);
      }
    }
    
    public void onChanged()
    {
      PagerTitleStrip.this.a(PagerTitleStrip.this.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
      boolean bool = PagerTitleStrip.this.e < 0.0F;
      float f = 0.0F;
      if (!bool) {
        f = PagerTitleStrip.this.e;
      }
      PagerTitleStrip.this.a(PagerTitleStrip.this.a.getCurrentItem(), f, true);
    }
  }
  
  private static class b
    extends SingleLineTransformationMethod
  {
    private Locale a;
    
    b(Context paramContext)
    {
      this.a = paramContext.getResources().getConfiguration().locale;
    }
    
    public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
    {
      CharSequence localCharSequence = super.getTransformation(paramCharSequence, paramView);
      if (localCharSequence != null) {
        return localCharSequence.toString().toUpperCase(this.a);
      }
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTitleStrip
 * JD-Core Version:    0.7.0.1
 */