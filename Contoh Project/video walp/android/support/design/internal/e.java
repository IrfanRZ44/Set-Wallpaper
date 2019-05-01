package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.transition.Transition;
import android.support.transition.ah;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public class e
  extends Transition
{
  private void d(ah paramah)
  {
    if ((paramah.b instanceof TextView))
    {
      TextView localTextView = (TextView)paramah.b;
      paramah.a.put("android:textscale:scale", Float.valueOf(localTextView.getScaleX()));
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    float f1 = 1.0F;
    if ((paramah1 == null) || (paramah2 == null) || (!(paramah1.b instanceof TextView)) || (!(paramah2.b instanceof TextView))) {
      return null;
    }
    final TextView localTextView = (TextView)paramah2.b;
    Map localMap1 = paramah1.a;
    Map localMap2 = paramah2.a;
    if (localMap1.get("android:textscale:scale") != null) {}
    for (float f2 = ((Float)localMap1.get("android:textscale:scale")).floatValue();; f2 = f1)
    {
      if (localMap2.get("android:textscale:scale") != null) {
        f1 = ((Float)localMap2.get("android:textscale:scale")).floatValue();
      }
      if (f2 != f1) {
        break;
      }
      return null;
    }
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { f2, f1 });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        localTextView.setScaleX(f);
        localTextView.setScaleY(f);
      }
    });
    return localValueAnimator;
  }
  
  public void a(ah paramah)
  {
    d(paramah);
  }
  
  public void b(ah paramah)
  {
    d(paramah);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.e
 * JD-Core Version:    0.7.0.1
 */