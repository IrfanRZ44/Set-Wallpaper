package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.d;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

@CoordinatorLayout.b(a="Landroid/support/design/widget/FloatingActionButton$Behavior;")
public class FloatingActionButton
  extends VisibilityAwareImageButton
{
  int a;
  boolean b;
  final Rect c = new Rect();
  private ColorStateList d;
  private PorterDuff.Mode e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private final Rect k = new Rect();
  private AppCompatImageHelper l;
  private g m;
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    m.a(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.FloatingActionButton, paramInt, a.j.Widget_Design_FloatingActionButton);
    this.d = localTypedArray.getColorStateList(a.k.FloatingActionButton_backgroundTint);
    this.e = o.a(localTypedArray.getInt(a.k.FloatingActionButton_backgroundTintMode, -1), null);
    this.g = localTypedArray.getColor(a.k.FloatingActionButton_rippleColor, 0);
    this.h = localTypedArray.getInt(a.k.FloatingActionButton_fabSize, -1);
    this.i = localTypedArray.getDimensionPixelSize(a.k.FloatingActionButton_fabCustomSize, 0);
    this.f = localTypedArray.getDimensionPixelSize(a.k.FloatingActionButton_borderWidth, 0);
    float f1 = localTypedArray.getDimension(a.k.FloatingActionButton_elevation, 0.0F);
    float f2 = localTypedArray.getDimension(a.k.FloatingActionButton_pressedTranslationZ, 0.0F);
    this.b = localTypedArray.getBoolean(a.k.FloatingActionButton_useCompatPadding, false);
    localTypedArray.recycle();
    this.l = new AppCompatImageHelper(this);
    this.l.loadFromAttributes(paramAttributeSet, paramInt);
    this.j = ((int)getResources().getDimension(a.d.design_fab_image_size));
    getImpl().a(this.d, this.e, this.g, this.f);
    getImpl().a(f1);
    getImpl().b(f2);
  }
  
  private int a(int paramInt)
  {
    Resources localResources = getResources();
    if (this.i != 0) {
      return this.i;
    }
    switch (paramInt)
    {
    case 0: 
    default: 
      return localResources.getDimensionPixelSize(a.d.design_fab_size_normal);
    case -1: 
      if (Math.max(localResources.getConfiguration().screenWidthDp, localResources.getConfiguration().screenHeightDp) < 470) {
        return a(1);
      }
      return a(0);
    }
    return localResources.getDimensionPixelSize(a.d.design_fab_size_mini);
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    switch (n)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      return Math.min(paramInt1, i1);
    }
    return i1;
  }
  
  private g.c a(final a parama)
  {
    if (parama == null) {
      return null;
    }
    new g.c()
    {
      public void a()
      {
        parama.a(FloatingActionButton.this);
      }
      
      public void b()
      {
        parama.b(FloatingActionButton.this);
      }
    };
  }
  
  private g a()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return new h(this, new b());
    }
    return new g(this, new b());
  }
  
  private g getImpl()
  {
    if (this.m == null) {
      this.m = a();
    }
    return this.m;
  }
  
  void a(a parama, boolean paramBoolean)
  {
    getImpl().b(a(parama), paramBoolean);
  }
  
  public boolean a(Rect paramRect)
  {
    boolean bool1 = android.support.v4.view.s.x(this);
    boolean bool2 = false;
    if (bool1)
    {
      paramRect.set(0, 0, getWidth(), getHeight());
      paramRect.left += this.c.left;
      paramRect.top += this.c.top;
      paramRect.right -= this.c.right;
      paramRect.bottom -= this.c.bottom;
      bool2 = true;
    }
    return bool2;
  }
  
  void b(a parama, boolean paramBoolean)
  {
    getImpl().a(a(parama), paramBoolean);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    getImpl().a(getDrawableState());
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return this.d;
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.e;
  }
  
  public float getCompatElevation()
  {
    return getImpl().a();
  }
  
  public Drawable getContentBackground()
  {
    return getImpl().c();
  }
  
  public int getCustomSize()
  {
    return this.i;
  }
  
  public int getRippleColor()
  {
    return this.g;
  }
  
  public int getSize()
  {
    return this.h;
  }
  
  int getSizeDimension()
  {
    return a(this.h);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.b;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().b();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getImpl().f();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    getImpl().g();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = getSizeDimension();
    this.a = ((n - this.j) / 2);
    getImpl().e();
    int i1 = Math.min(a(n, paramInt1), a(n, paramInt2));
    setMeasuredDimension(i1 + this.c.left + this.c.right, i1 + this.c.top + this.c.bottom);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      return super.onTouchEvent(paramMotionEvent);
    } while ((!a(this.k)) || (this.k.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())));
    return false;
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.d != paramColorStateList)
    {
      this.d = paramColorStateList;
      getImpl().a(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != paramMode)
    {
      this.e = paramMode;
      getImpl().a(paramMode);
    }
  }
  
  public void setCompatElevation(float paramFloat)
  {
    getImpl().a(paramFloat);
  }
  
  public void setCustomSize(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Custom size should be non-negative.");
    }
    this.i = paramInt;
  }
  
  public void setImageResource(int paramInt)
  {
    this.l.setImageResource(paramInt);
  }
  
  public void setRippleColor(int paramInt)
  {
    if (this.g != paramInt)
    {
      this.g = paramInt;
      getImpl().a(paramInt);
    }
  }
  
  public void setSize(int paramInt)
  {
    if (paramInt != this.h)
    {
      this.h = paramInt;
      requestLayout();
    }
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      getImpl().d();
    }
  }
  
  public static class Behavior
    extends CoordinatorLayout.Behavior<FloatingActionButton>
  {
    private Rect a;
    private FloatingActionButton.a b;
    private boolean c;
    
    public Behavior()
    {
      this.c = true;
    }
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.FloatingActionButton_Behavior_Layout);
      this.c = localTypedArray.getBoolean(a.k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
      localTypedArray.recycle();
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
    {
      Rect localRect = paramFloatingActionButton.c;
      CoordinatorLayout.d locald;
      int i;
      if ((localRect != null) && (localRect.centerX() > 0) && (localRect.centerY() > 0))
      {
        locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
        if (paramFloatingActionButton.getRight() < paramCoordinatorLayout.getWidth() - locald.rightMargin) {
          break label101;
        }
        i = localRect.right;
      }
      for (;;)
      {
        int m;
        if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getHeight() - locald.bottomMargin) {
          m = localRect.bottom;
        }
        for (;;)
        {
          if (m != 0) {
            android.support.v4.view.s.c(paramFloatingActionButton, m);
          }
          if (i != 0) {
            android.support.v4.view.s.d(paramFloatingActionButton, i);
          }
          return;
          label101:
          if (paramFloatingActionButton.getLeft() > locald.leftMargin) {
            break label156;
          }
          i = -localRect.left;
          break;
          int j = paramFloatingActionButton.getTop();
          int k = locald.topMargin;
          m = 0;
          if (j <= k) {
            m = -localRect.top;
          }
        }
        label156:
        i = 0;
      }
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramAppBarLayout, paramFloatingActionButton)) {
        return false;
      }
      if (this.a == null) {
        this.a = new Rect();
      }
      Rect localRect = this.a;
      android.support.v4.widget.s.b(paramCoordinatorLayout, paramAppBarLayout, localRect);
      if (localRect.bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        paramFloatingActionButton.b(this.b, false);
      }
      for (;;)
      {
        return true;
        paramFloatingActionButton.a(this.b, false);
      }
    }
    
    private static boolean a(View paramView)
    {
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      if ((localLayoutParams instanceof CoordinatorLayout.d)) {
        return ((CoordinatorLayout.d)localLayoutParams).b() instanceof BottomSheetBehavior;
      }
      return false;
    }
    
    private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
      if (!this.c) {
        return false;
      }
      if (locald.a() != paramView.getId()) {
        return false;
      }
      return paramFloatingActionButton.getUserSetVisibility() == 0;
    }
    
    private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramView, paramFloatingActionButton)) {
        return false;
      }
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
      if (paramView.getTop() < paramFloatingActionButton.getHeight() / 2 + locald.topMargin) {
        paramFloatingActionButton.b(this.b, false);
      }
      for (;;)
      {
        return true;
        paramFloatingActionButton.a(this.b, false);
      }
    }
    
    public void a(CoordinatorLayout.d paramd)
    {
      if (paramd.h == 0) {
        paramd.h = 80;
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
    {
      List localList = paramCoordinatorLayout.c(paramFloatingActionButton);
      int i = localList.size();
      for (int j = 0;; j++)
      {
        View localView;
        if (j < i)
        {
          localView = (View)localList.get(j);
          if (!(localView instanceof AppBarLayout)) {
            break label76;
          }
          if (!a(paramCoordinatorLayout, (AppBarLayout)localView, paramFloatingActionButton)) {
            continue;
          }
        }
        label76:
        while ((a(localView)) && (b(localView, paramFloatingActionButton)))
        {
          paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
          a(paramCoordinatorLayout, paramFloatingActionButton);
          return true;
        }
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, Rect paramRect)
    {
      Rect localRect = paramFloatingActionButton.c;
      paramRect.set(paramFloatingActionButton.getLeft() + localRect.left, paramFloatingActionButton.getTop() + localRect.top, paramFloatingActionButton.getRight() - localRect.right, paramFloatingActionButton.getBottom() - localRect.bottom);
      return true;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        a(paramCoordinatorLayout, (AppBarLayout)paramView, paramFloatingActionButton);
      }
      for (;;)
      {
        return false;
        if (a(paramView)) {
          b(paramView, paramFloatingActionButton);
        }
      }
    }
  }
  
  public static abstract class a
  {
    public void a(FloatingActionButton paramFloatingActionButton) {}
    
    public void b(FloatingActionButton paramFloatingActionButton) {}
  }
  
  private class b
    implements j
  {
    b() {}
    
    public float a()
    {
      return FloatingActionButton.this.getSizeDimension() / 2.0F;
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      FloatingActionButton.this.c.set(paramInt1, paramInt2, paramInt3, paramInt4);
      FloatingActionButton.this.setPadding(paramInt1 + FloatingActionButton.this.a, paramInt2 + FloatingActionButton.this.a, paramInt3 + FloatingActionButton.this.a, paramInt4 + FloatingActionButton.this.a);
    }
    
    public void a(Drawable paramDrawable)
    {
      FloatingActionButton.a(FloatingActionButton.this, paramDrawable);
    }
    
    public boolean b()
    {
      return FloatingActionButton.this.b;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.FloatingActionButton
 * JD-Core Version:    0.7.0.1
 */