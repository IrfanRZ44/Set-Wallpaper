package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

class c
  extends ImageView
{
  int a;
  private Animation.AnimationListener b;
  
  c(Context paramContext, int paramInt)
  {
    super(paramContext);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    this.a = ((int)(3.5F * f));
    ShapeDrawable localShapeDrawable;
    if (a())
    {
      localShapeDrawable = new ShapeDrawable(new OvalShape());
      s.a(this, f * 4.0F);
    }
    for (;;)
    {
      localShapeDrawable.getPaint().setColor(paramInt);
      s.a(this, localShapeDrawable);
      return;
      localShapeDrawable = new ShapeDrawable(new a(this.a));
      setLayerType(1, localShapeDrawable.getPaint());
      localShapeDrawable.getPaint().setShadowLayer(this.a, j, i, 503316480);
      int k = this.a;
      setPadding(k, k, k, k);
    }
  }
  
  private boolean a()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  public void a(Animation.AnimationListener paramAnimationListener)
  {
    this.b = paramAnimationListener;
  }
  
  public void onAnimationEnd()
  {
    super.onAnimationEnd();
    if (this.b != null) {
      this.b.onAnimationEnd(getAnimation());
    }
  }
  
  public void onAnimationStart()
  {
    super.onAnimationStart();
    if (this.b != null) {
      this.b.onAnimationStart(getAnimation());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!a()) {
      setMeasuredDimension(getMeasuredWidth() + 2 * this.a, getMeasuredHeight() + 2 * this.a);
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable)) {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
    }
  }
  
  private class a
    extends OvalShape
  {
    private RadialGradient b;
    private Paint c = new Paint();
    
    a(int paramInt)
    {
      c.this.a = paramInt;
      a((int)rect().width());
    }
    
    private void a(int paramInt)
    {
      this.b = new RadialGradient(paramInt / 2, paramInt / 2, c.this.a, new int[] { 1023410176, 0 }, null, Shader.TileMode.CLAMP);
      this.c.setShader(this.b);
    }
    
    public void draw(Canvas paramCanvas, Paint paramPaint)
    {
      int i = c.this.getWidth();
      int j = c.this.getHeight();
      paramCanvas.drawCircle(i / 2, j / 2, i / 2, this.c);
      paramCanvas.drawCircle(i / 2, j / 2, i / 2 - c.this.a, paramPaint);
    }
    
    protected void onResize(float paramFloat1, float paramFloat2)
    {
      super.onResize(paramFloat1, paramFloat2);
      a((int)paramFloat1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.7.0.1
 */