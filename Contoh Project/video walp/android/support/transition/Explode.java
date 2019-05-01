package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

public class Explode
  extends Visibility
{
  private static final TimeInterpolator g = new DecelerateInterpolator();
  private static final TimeInterpolator h = new AccelerateInterpolator();
  private int[] i = new int[2];
  
  public Explode()
  {
    a(new e());
  }
  
  public Explode(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(new e());
  }
  
  private static float a(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }
  
  private static float a(View paramView, int paramInt1, int paramInt2)
  {
    int j = Math.max(paramInt1, paramView.getWidth() - paramInt1);
    int k = Math.max(paramInt2, paramView.getHeight() - paramInt2);
    return a(j, k);
  }
  
  private void a(View paramView, Rect paramRect, int[] paramArrayOfInt)
  {
    paramView.getLocationOnScreen(this.i);
    int j = this.i[0];
    int k = this.i[1];
    Rect localRect = m();
    int m;
    if (localRect == null) {
      m = j + paramView.getWidth() / 2 + Math.round(paramView.getTranslationX());
    }
    for (int n = k + paramView.getHeight() / 2 + Math.round(paramView.getTranslationY());; n = localRect.centerY())
    {
      int i1 = paramRect.centerX();
      int i2 = paramRect.centerY();
      float f1 = i1 - m;
      float f2 = i2 - n;
      if ((f1 == 0.0F) && (f2 == 0.0F))
      {
        f1 = (float)(2.0D * Math.random()) - 1.0F;
        f2 = (float)(2.0D * Math.random()) - 1.0F;
      }
      float f3 = a(f1, f2);
      float f4 = f1 / f3;
      float f5 = f2 / f3;
      float f6 = a(paramView, m - j, n - k);
      paramArrayOfInt[0] = Math.round(f4 * f6);
      paramArrayOfInt[1] = Math.round(f6 * f5);
      return;
      m = localRect.centerX();
    }
  }
  
  private void d(ah paramah)
  {
    View localView = paramah.b;
    localView.getLocationOnScreen(this.i);
    int j = this.i[0];
    int k = this.i[1];
    int m = j + localView.getWidth();
    int n = k + localView.getHeight();
    paramah.a.put("android:explode:screenBounds", new Rect(j, k, m, n));
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    if (paramah2 == null) {
      return null;
    }
    Rect localRect = (Rect)paramah2.a.get("android:explode:screenBounds");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    a(paramViewGroup, localRect, this.i);
    float f3 = f1 + this.i[0];
    float f4 = f2 + this.i[1];
    return aj.a(paramView, paramah2, localRect.left, localRect.top, f3, f4, f1, f2, g);
  }
  
  public void a(ah paramah)
  {
    super.a(paramah);
    d(paramah);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    if (paramah1 == null) {
      return null;
    }
    Rect localRect = (Rect)paramah1.a.get("android:explode:screenBounds");
    int j = localRect.left;
    int k = localRect.top;
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    int[] arrayOfInt = (int[])paramah1.b.getTag(y.a.transition_position);
    float f5;
    float f3;
    if (arrayOfInt != null)
    {
      f5 = f1 + (arrayOfInt[0] - localRect.left);
      float f6 = f2 + (arrayOfInt[1] - localRect.top);
      localRect.offsetTo(arrayOfInt[0], arrayOfInt[1]);
      f3 = f6;
    }
    for (float f4 = f5;; f4 = f1)
    {
      a(paramViewGroup, localRect, this.i);
      return aj.a(paramView, paramah1, j, k, f1, f2, f4 + this.i[0], f3 + this.i[1], h);
      f3 = f2;
    }
  }
  
  public void b(ah paramah)
  {
    super.b(paramah);
    d(paramah);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.Explode
 * JD-Core Version:    0.7.0.1
 */