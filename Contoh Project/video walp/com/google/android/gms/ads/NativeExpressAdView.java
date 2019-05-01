package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.internal.ads.aqp;
import com.google.android.gms.internal.ads.cm;

@cm
public final class NativeExpressAdView
  extends BaseAdView
{
  public NativeExpressAdView(Context paramContext)
  {
    super(paramContext, 1);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 1);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 1);
  }
  
  public final VideoController getVideoController()
  {
    return this.a.m();
  }
  
  public final VideoOptions getVideoOptions()
  {
    return this.a.o();
  }
  
  public final void setVideoOptions(VideoOptions paramVideoOptions)
  {
    this.a.a(paramVideoOptions);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.NativeExpressAdView
 * JD-Core Version:    0.7.0.1
 */