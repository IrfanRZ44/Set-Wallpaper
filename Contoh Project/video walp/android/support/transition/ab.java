package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;

public class ab
  extends bb
{
  private float a = 3.0F;
  private int b = 80;
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int i = 5;
    int j = 3;
    int k = 1;
    if (this.b == 8388611) {
      if (s.e(paramView) == k) {
        label27:
        if (k == 0) {
          break label84;
        }
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return 0;
        k = 0;
        break label27;
        label84:
        i = j;
        continue;
        if (this.b == 8388613)
        {
          if (s.e(paramView) == k) {
            label109:
            if (k == 0) {
              break label127;
            }
          }
          for (;;)
          {
            i = j;
            break;
            k = 0;
            break label109;
            label127:
            j = i;
          }
        }
        i = this.b;
      }
    }
    return paramInt7 - paramInt1 + Math.abs(paramInt4 - paramInt2);
    return paramInt8 - paramInt2 + Math.abs(paramInt3 - paramInt1);
    return paramInt1 - paramInt5 + Math.abs(paramInt4 - paramInt2);
    return paramInt2 - paramInt6 + Math.abs(paramInt3 - paramInt1);
  }
  
  private int a(ViewGroup paramViewGroup)
  {
    switch (this.b)
    {
    default: 
      return paramViewGroup.getHeight();
    }
    return paramViewGroup.getWidth();
  }
  
  public long a(ViewGroup paramViewGroup, Transition paramTransition, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) && (paramah2 == null)) {
      return 0L;
    }
    Rect localRect = paramTransition.m();
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    if ((paramah2 == null) || (b(paramah1) == 0))
    {
      paramah2 = paramah1;
      i = -1;
      j = c(paramah2);
      k = d(paramah2);
      int[] arrayOfInt = new int[2];
      paramViewGroup.getLocationOnScreen(arrayOfInt);
      m = arrayOfInt[0] + Math.round(paramViewGroup.getTranslationX());
      n = arrayOfInt[1] + Math.round(paramViewGroup.getTranslationY());
      i1 = m + paramViewGroup.getWidth();
      i2 = n + paramViewGroup.getHeight();
      if (localRect == null) {
        break label203;
      }
      i3 = localRect.centerX();
    }
    for (int i4 = localRect.centerY();; i4 = (n + i2) / 2)
    {
      float f = a(paramViewGroup, j, k, i3, i4, m, n, i1, i2) / a(paramViewGroup);
      long l = paramTransition.b();
      if (l < 0L) {
        l = 300L;
      }
      return Math.round(f * ((float)(l * i) / this.a));
      i = 1;
      break;
      label203:
      i3 = (m + i1) / 2;
    }
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ab
 * JD-Core Version:    0.7.0.1
 */