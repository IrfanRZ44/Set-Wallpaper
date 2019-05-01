package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

@TargetApi(19)
public class kc
  extends ka
{
  public final boolean a(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  public final ViewGroup.LayoutParams d()
  {
    return new ViewGroup.LayoutParams(-1, -1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kc
 * JD-Core Version:    0.7.0.1
 */