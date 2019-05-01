package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aqp;

public final class AdView
  extends BaseAdView
{
  public AdView(Context paramContext)
  {
    super(paramContext, 0);
    n.a(paramContext, "Context cannot be null");
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public final VideoController getVideoController()
  {
    if (this.a != null) {
      return this.a.m();
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdView
 * JD-Core Version:    0.7.0.1
 */