package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeClipBounds
  extends Transition
{
  private static final String[] g = { "android:clipBounds:clip" };
  
  public ChangeClipBounds() {}
  
  public ChangeClipBounds(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void d(ah paramah)
  {
    View localView = paramah.b;
    if (localView.getVisibility() == 8) {}
    Rect localRect1;
    do
    {
      return;
      localRect1 = s.z(localView);
      paramah.a.put("android:clipBounds:clip", localRect1);
    } while (localRect1 != null);
    Rect localRect2 = new Rect(0, 0, localView.getWidth(), localView.getHeight());
    paramah.a.put("android:clipBounds:bounds", localRect2);
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    Object localObject;
    if ((paramah1 == null) || (paramah2 == null) || (!paramah1.a.containsKey("android:clipBounds:clip")) || (!paramah2.a.containsKey("android:clipBounds:clip"))) {
      localObject = null;
    }
    int i;
    do
    {
      return localObject;
      Rect localRect1 = (Rect)paramah1.a.get("android:clipBounds:clip");
      Rect localRect2 = (Rect)paramah2.a.get("android:clipBounds:clip");
      if (localRect2 == null) {}
      for (i = 1; (localRect1 == null) && (localRect2 == null); i = 0) {
        return null;
      }
      if (localRect1 == null) {
        localRect1 = (Rect)paramah1.a.get("android:clipBounds:bounds");
      }
      while (localRect1.equals(localRect2))
      {
        return null;
        if (localRect2 == null) {
          localRect2 = (Rect)paramah2.a.get("android:clipBounds:bounds");
        }
      }
      s.a(paramah2.b, localRect1);
      z localz = new z(new Rect());
      localObject = ObjectAnimator.ofObject(paramah2.b, au.b, localz, new Rect[] { localRect1, localRect2 });
    } while (i == 0);
    ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        s.a(this.a, null);
      }
    });
    return localObject;
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
 * Qualified Name:     android.support.transition.ChangeClipBounds
 * JD-Core Version:    0.7.0.1
 */