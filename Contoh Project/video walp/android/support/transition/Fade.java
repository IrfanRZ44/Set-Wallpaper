package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class Fade
  extends Visibility
{
  public Fade() {}
  
  public Fade(int paramInt)
  {
    b(paramInt);
  }
  
  public Fade(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.f);
    b(c.a(localTypedArray, (XmlResourceParser)paramAttributeSet, "fadingMode", 0, p()));
    localTypedArray.recycle();
  }
  
  private static float a(ah paramah, float paramFloat)
  {
    if (paramah != null)
    {
      Float localFloat = (Float)paramah.a.get("android:fade:transitionAlpha");
      if (localFloat != null) {
        paramFloat = localFloat.floatValue();
      }
    }
    return paramFloat;
  }
  
  private Animator a(final View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2) {
      return null;
    }
    au.a(paramView, paramFloat1);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, au.a, new float[] { paramFloat2 });
    localObjectAnimator.addListener(new a(paramView));
    a(new ad()
    {
      public void a(Transition paramAnonymousTransition)
      {
        au.a(paramView, 1.0F);
        au.e(paramView);
        paramAnonymousTransition.b(this);
      }
    });
    return localObjectAnimator;
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    float f1 = a(paramah1, 0.0F);
    boolean bool = f1 < 1.0F;
    float f2 = 0.0F;
    if (!bool) {}
    for (;;)
    {
      return a(paramView, f2, 1.0F);
      f2 = f1;
    }
  }
  
  public void a(ah paramah)
  {
    super.a(paramah);
    paramah.a.put("android:fade:transitionAlpha", Float.valueOf(au.c(paramah.b)));
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    au.d(paramView);
    return a(paramView, a(paramah1, 1.0F), 0.0F);
  }
  
  private static class a
    extends AnimatorListenerAdapter
  {
    private final View a;
    private boolean b = false;
    
    a(View paramView)
    {
      this.a = paramView;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      au.a(this.a, 1.0F);
      if (this.b) {
        this.a.setLayerType(0, null);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      if ((s.r(this.a)) && (this.a.getLayerType() == 0))
      {
        this.b = true;
        this.a.setLayerType(2, null);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.Fade
 * JD-Core Version:    0.7.0.1
 */