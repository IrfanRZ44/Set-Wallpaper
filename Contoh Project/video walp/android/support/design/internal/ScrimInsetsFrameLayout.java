package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout
  extends FrameLayout
{
  Drawable a;
  Rect b;
  private Rect c = new Rect();
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ScrimInsetsFrameLayout, paramInt, a.j.Widget_Design_ScrimInsetsFrameLayout);
    this.a = localTypedArray.getDrawable(a.k.ScrimInsetsFrameLayout_insetForeground);
    localTypedArray.recycle();
    setWillNotDraw(true);
    s.a(this, new o()
    {
      public aa a(View paramAnonymousView, aa paramAnonymousaa)
      {
        if (ScrimInsetsFrameLayout.this.b == null) {
          ScrimInsetsFrameLayout.this.b = new Rect();
        }
        ScrimInsetsFrameLayout.this.b.set(paramAnonymousaa.a(), paramAnonymousaa.b(), paramAnonymousaa.c(), paramAnonymousaa.d());
        ScrimInsetsFrameLayout.this.a(paramAnonymousaa);
        ScrimInsetsFrameLayout localScrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
        if ((!paramAnonymousaa.e()) || (ScrimInsetsFrameLayout.this.a == null)) {}
        for (boolean bool = true;; bool = false)
        {
          localScrimInsetsFrameLayout.setWillNotDraw(bool);
          s.c(ScrimInsetsFrameLayout.this);
          return paramAnonymousaa.g();
        }
      }
    });
  }
  
  protected void a(aa paramaa) {}
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((this.b != null) && (this.a != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      this.c.set(0, 0, i, this.b.top);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      this.c.set(0, j - this.b.bottom, i, j);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      this.c.set(0, this.b.top, this.b.left, j - this.b.bottom);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      this.c.set(i - this.b.right, this.b.top, i, j - this.b.bottom);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null) {
      this.a.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null) {
      this.a.setCallback(null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.ScrimInsetsFrameLayout
 * JD-Core Version:    0.7.0.1
 */