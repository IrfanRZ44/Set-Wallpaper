package com.admob.android.ads;

import android.graphics.PointF;
import android.view.View;

public final class f
{
  public float a = 0.0F;
  public PointF b = new PointF(0.5F, 0.5F);
  
  public static float a(View paramView)
  {
    if (paramView != null) {
      return c(paramView).a;
    }
    return 0.0F;
  }
  
  public static PointF b(View paramView)
  {
    if (paramView != null) {
      return c(paramView).b;
    }
    return null;
  }
  
  public static f c(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject != null) && ((localObject instanceof f))) {
      return (f)localObject;
    }
    return new f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.f
 * JD-Core Version:    0.7.0.1
 */