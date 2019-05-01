package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip
  extends PagerTitleStrip
{
  private int g = this.f;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private final Paint m = new Paint();
  private final Rect n = new Rect();
  private int o = 255;
  private boolean p = false;
  private boolean q = false;
  private int r;
  private boolean s;
  private float t;
  private float u;
  private int v;
  
  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.m.setColor(this.g);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.h = ((int)(0.5F + 3.0F * f));
    this.i = ((int)(0.5F + 6.0F * f));
    this.j = ((int)(64.0F * f));
    this.l = ((int)(0.5F + 16.0F * f));
    this.r = ((int)(0.5F + 1.0F * f));
    this.k = ((int)(0.5F + f * 32.0F));
    this.v = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    setTextSpacing(getTextSpacing());
    setWillNotDraw(false);
    this.b.setFocusable(true);
    this.b.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        PagerTabStrip.this.a.setCurrentItem(-1 + PagerTabStrip.this.a.getCurrentItem());
      }
    });
    this.d.setFocusable(true);
    this.d.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        PagerTabStrip.this.a.setCurrentItem(1 + PagerTabStrip.this.a.getCurrentItem());
      }
    });
    if (getBackground() == null) {
      this.p = true;
    }
  }
  
  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.n;
    int i1 = getHeight();
    int i2 = this.c.getLeft() - this.l;
    int i3 = this.c.getRight() + this.l;
    int i4 = i1 - this.h;
    localRect.set(i2, i4, i3, i1);
    super.a(paramInt, paramFloat, paramBoolean);
    this.o = ((int)(255.0F * (2.0F * Math.abs(paramFloat - 0.5F))));
    localRect.union(this.c.getLeft() - this.l, i4, this.c.getRight() + this.l, i1);
    invalidate(localRect);
  }
  
  public boolean getDrawFullUnderline()
  {
    return this.p;
  }
  
  int getMinHeight()
  {
    return Math.max(super.getMinHeight(), this.k);
  }
  
  public int getTabIndicatorColor()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getHeight();
    int i2 = this.c.getLeft() - this.l;
    int i3 = this.c.getRight() + this.l;
    int i4 = i1 - this.h;
    this.m.setColor(this.o << 24 | 0xFFFFFF & this.g);
    paramCanvas.drawRect(i2, i4, i3, i1, this.m);
    if (this.p)
    {
      this.m.setColor(0xFF000000 | 0xFFFFFF & this.g);
      paramCanvas.drawRect(getPaddingLeft(), i1 - this.r, getWidth() - getPaddingRight(), i1, this.m);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((i1 != 0) && (this.s)) {
      return false;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i1)
    {
    }
    for (;;)
    {
      return true;
      this.t = f1;
      this.u = f2;
      this.s = false;
      continue;
      if ((Math.abs(f1 - this.t) > this.v) || (Math.abs(f2 - this.u) > this.v))
      {
        this.s = true;
        continue;
        if (f1 < this.c.getLeft() - this.l) {
          this.a.setCurrentItem(-1 + this.a.getCurrentItem());
        } else if (f1 > this.c.getRight() + this.l) {
          this.a.setCurrentItem(1 + this.a.getCurrentItem());
        }
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!this.q) {
      if ((0xFF000000 & paramInt) != 0) {
        break label27;
      }
    }
    label27:
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.q) {
      if (paramDrawable != null) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      return;
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!this.q) {
      if (paramInt != 0) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      return;
    }
  }
  
  public void setDrawFullUnderline(boolean paramBoolean)
  {
    this.p = paramBoolean;
    this.q = true;
    invalidate();
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt4 < this.i) {
      paramInt4 = this.i;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setTabIndicatorColor(int paramInt)
  {
    this.g = paramInt;
    this.m.setColor(this.g);
    invalidate();
  }
  
  public void setTabIndicatorColorResource(int paramInt)
  {
    setTabIndicatorColor(a.getColor(getContext(), paramInt));
  }
  
  public void setTextSpacing(int paramInt)
  {
    if (paramInt < this.j) {
      paramInt = this.j;
    }
    super.setTextSpacing(paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTabStrip
 * JD-Core Version:    0.7.0.1
 */