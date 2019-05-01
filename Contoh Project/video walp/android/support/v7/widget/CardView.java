package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.b.a.a;
import android.support.v7.b.a.b;
import android.support.v7.b.a.d;
import android.support.v7.b.a.e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
{
  private static final int[] COLOR_BACKGROUND_ATTR = { 16842801 };
  private static final p IMPL;
  private final o mCardViewDelegate = new o()
  {
    private Drawable b;
    
    public void a(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (paramAnonymousInt1 > CardView.this.mUserSetMinWidth) {
        CardView.this.setMinimumWidth(paramAnonymousInt1);
      }
      if (paramAnonymousInt2 > CardView.this.mUserSetMinHeight) {
        CardView.this.setMinimumHeight(paramAnonymousInt2);
      }
    }
    
    public void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
    {
      CardView.this.mShadowBounds.set(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
      CardView.this.setPadding(paramAnonymousInt1 + CardView.this.mContentPadding.left, paramAnonymousInt2 + CardView.this.mContentPadding.top, paramAnonymousInt3 + CardView.this.mContentPadding.right, paramAnonymousInt4 + CardView.this.mContentPadding.bottom);
    }
    
    public void a(Drawable paramAnonymousDrawable)
    {
      this.b = paramAnonymousDrawable;
      CardView.this.setBackgroundDrawable(paramAnonymousDrawable);
    }
    
    public boolean a()
    {
      return CardView.this.getUseCompatPadding();
    }
    
    public boolean b()
    {
      return CardView.this.getPreventCornerOverlap();
    }
    
    public Drawable c()
    {
      return this.b;
    }
    
    public View d()
    {
      return CardView.this;
    }
  };
  private boolean mCompatPadding;
  final Rect mContentPadding = new Rect();
  private boolean mPreventCornerOverlap;
  final Rect mShadowBounds = new Rect();
  int mUserSetMinHeight;
  int mUserSetMinWidth;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      IMPL = new m();
    }
    for (;;)
    {
      IMPL.a();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        IMPL = new l();
      } else {
        IMPL = new n();
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.cardViewStyle);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, a.e.CardView, paramInt, a.d.CardView);
    ColorStateList localColorStateList;
    if (localTypedArray1.hasValue(a.e.CardView_cardBackgroundColor))
    {
      localColorStateList = localTypedArray1.getColorStateList(a.e.CardView_cardBackgroundColor);
      float f1 = localTypedArray1.getDimension(a.e.CardView_cardCornerRadius, 0.0F);
      float f2 = localTypedArray1.getDimension(a.e.CardView_cardElevation, 0.0F);
      float f3 = localTypedArray1.getDimension(a.e.CardView_cardMaxElevation, 0.0F);
      this.mCompatPadding = localTypedArray1.getBoolean(a.e.CardView_cardUseCompatPadding, false);
      this.mPreventCornerOverlap = localTypedArray1.getBoolean(a.e.CardView_cardPreventCornerOverlap, true);
      int k = localTypedArray1.getDimensionPixelSize(a.e.CardView_contentPadding, 0);
      this.mContentPadding.left = localTypedArray1.getDimensionPixelSize(a.e.CardView_contentPaddingLeft, k);
      this.mContentPadding.top = localTypedArray1.getDimensionPixelSize(a.e.CardView_contentPaddingTop, k);
      this.mContentPadding.right = localTypedArray1.getDimensionPixelSize(a.e.CardView_contentPaddingRight, k);
      this.mContentPadding.bottom = localTypedArray1.getDimensionPixelSize(a.e.CardView_contentPaddingBottom, k);
      if (f2 > f3) {
        f3 = f2;
      }
      this.mUserSetMinWidth = localTypedArray1.getDimensionPixelSize(a.e.CardView_android_minWidth, 0);
      this.mUserSetMinHeight = localTypedArray1.getDimensionPixelSize(a.e.CardView_android_minHeight, 0);
      localTypedArray1.recycle();
      IMPL.a(this.mCardViewDelegate, paramContext, localColorStateList, f1, f2, f3);
      return;
    }
    TypedArray localTypedArray2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
    int i = localTypedArray2.getColor(0, 0);
    localTypedArray2.recycle();
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(i, arrayOfFloat);
    if (arrayOfFloat[2] > 0.5F) {}
    for (int j = getResources().getColor(a.b.cardview_light_background);; j = getResources().getColor(a.b.cardview_dark_background))
    {
      localColorStateList = ColorStateList.valueOf(j);
      break;
    }
  }
  
  public ColorStateList getCardBackgroundColor()
  {
    return IMPL.i(this.mCardViewDelegate);
  }
  
  public float getCardElevation()
  {
    return IMPL.e(this.mCardViewDelegate);
  }
  
  public int getContentPaddingBottom()
  {
    return this.mContentPadding.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.mContentPadding.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.mContentPadding.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.mContentPadding.top;
  }
  
  public float getMaxCardElevation()
  {
    return IMPL.a(this.mCardViewDelegate);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.mPreventCornerOverlap;
  }
  
  public float getRadius()
  {
    return IMPL.d(this.mCardViewDelegate);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.mCompatPadding;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(IMPL instanceof m))
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j;
      switch (i)
      {
      default: 
        j = View.MeasureSpec.getMode(paramInt2);
        switch (j)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.b(this.mCardViewDelegate)), View.MeasureSpec.getSize(paramInt1)), i);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.c(this.mCardViewDelegate)), View.MeasureSpec.getSize(paramInt2)), j);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    IMPL.a(this.mCardViewDelegate, ColorStateList.valueOf(paramInt));
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    IMPL.a(this.mCardViewDelegate, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat)
  {
    IMPL.c(this.mCardViewDelegate, paramFloat);
  }
  
  public void setContentPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mContentPadding.set(paramInt1, paramInt2, paramInt3, paramInt4);
    IMPL.f(this.mCardViewDelegate);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    IMPL.b(this.mCardViewDelegate, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.mUserSetMinHeight = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.mUserSetMinWidth = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean != this.mPreventCornerOverlap)
    {
      this.mPreventCornerOverlap = paramBoolean;
      IMPL.h(this.mCardViewDelegate);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    IMPL.a(this.mCardViewDelegate, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.mCompatPadding != paramBoolean)
    {
      this.mCompatPadding = paramBoolean;
      IMPL.g(this.mCardViewDelegate);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.CardView
 * JD-Core Version:    0.7.0.1
 */