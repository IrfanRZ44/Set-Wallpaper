package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeScroll
  extends Transition
{
  private static final String[] g = { "android:changeScroll:x", "android:changeScroll:y" };
  
  public ChangeScroll() {}
  
  public ChangeScroll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void d(ah paramah)
  {
    paramah.a.put("android:changeScroll:x", Integer.valueOf(paramah.b.getScrollX()));
    paramah.a.put("android:changeScroll:y", Integer.valueOf(paramah.b.getScrollY()));
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null)) {
      return null;
    }
    View localView = paramah2.b;
    int i = ((Integer)paramah1.a.get("android:changeScroll:x")).intValue();
    int j = ((Integer)paramah2.a.get("android:changeScroll:x")).intValue();
    int k = ((Integer)paramah1.a.get("android:changeScroll:y")).intValue();
    int m = ((Integer)paramah2.a.get("android:changeScroll:y")).intValue();
    if (i != j) {
      localView.setScrollX(i);
    }
    for (ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofInt(localView, "scrollX", new int[] { i, j });; localObjectAnimator1 = null)
    {
      if (k != m) {
        localView.setScrollY(k);
      }
      for (ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofInt(localView, "scrollY", new int[] { k, m });; localObjectAnimator2 = null) {
        return ag.a(localObjectAnimator1, localObjectAnimator2);
      }
    }
  }
  
  public void a(ah paramah)
  {
    d(paramah);
  }
  
  public String[] a()
  {
    return g;
  }
  
  public void b(ah paramah)
  {
    d(paramah);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeScroll
 * JD-Core Version:    0.7.0.1
 */