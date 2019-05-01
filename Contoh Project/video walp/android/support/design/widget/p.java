package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.b;
import android.support.design.a.g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

class p
{
  private static final int[] a = { 16843848 };
  
  static void a(View paramView)
  {
    paramView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
  }
  
  static void a(View paramView, float paramFloat)
  {
    int i = paramView.getResources().getInteger(a.g.app_bar_elevation_anim_duration);
    StateListAnimator localStateListAnimator = new StateListAnimator();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 16842766;
    arrayOfInt[1] = a.b.state_collapsible;
    arrayOfInt[2] = (-a.b.state_collapsed);
    localStateListAnimator.addState(arrayOfInt, ObjectAnimator.ofFloat(paramView, "elevation", new float[] { 0.0F }).setDuration(i));
    localStateListAnimator.addState(new int[] { 16842766 }, ObjectAnimator.ofFloat(paramView, "elevation", new float[] { paramFloat }).setDuration(i));
    localStateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(paramView, "elevation", new float[] { 0.0F }).setDuration(0L));
    paramView.setStateListAnimator(localStateListAnimator);
  }
  
  static void a(View paramView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Context localContext = paramView.getContext();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, a, paramInt1, paramInt2);
    try
    {
      if (localTypedArray.hasValue(0)) {
        paramView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(localContext, localTypedArray.getResourceId(0, 0)));
      }
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.p
 * JD-Core Version:    0.7.0.1
 */