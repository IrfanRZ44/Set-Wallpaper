package android.support.transition;

import android.view.View;
import java.util.Map;

public abstract class bb
  extends af
{
  private static final String[] a = { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
  
  private static int a(ah paramah, int paramInt)
  {
    if (paramah == null) {
      return -1;
    }
    int[] arrayOfInt = (int[])paramah.a.get("android:visibilityPropagation:center");
    if (arrayOfInt == null) {
      return -1;
    }
    return arrayOfInt[paramInt];
  }
  
  public void a(ah paramah)
  {
    View localView = paramah.b;
    Integer localInteger = (Integer)paramah.a.get("android:visibility:visibility");
    if (localInteger == null) {
      localInteger = Integer.valueOf(localView.getVisibility());
    }
    paramah.a.put("android:visibilityPropagation:visibility", localInteger);
    int[] arrayOfInt = new int[2];
    localView.getLocationOnScreen(arrayOfInt);
    arrayOfInt[0] += Math.round(localView.getTranslationX());
    arrayOfInt[0] += localView.getWidth() / 2;
    arrayOfInt[1] += Math.round(localView.getTranslationY());
    arrayOfInt[1] += localView.getHeight() / 2;
    paramah.a.put("android:visibilityPropagation:center", arrayOfInt);
  }
  
  public String[] a()
  {
    return a;
  }
  
  public int b(ah paramah)
  {
    if (paramah == null) {
      return 8;
    }
    Integer localInteger = (Integer)paramah.a.get("android:visibilityPropagation:visibility");
    if (localInteger == null) {
      return 8;
    }
    return localInteger.intValue();
  }
  
  public int c(ah paramah)
  {
    return a(paramah, 0);
  }
  
  public int d(ah paramah)
  {
    return a(paramah, 1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.bb
 * JD-Core Version:    0.7.0.1
 */