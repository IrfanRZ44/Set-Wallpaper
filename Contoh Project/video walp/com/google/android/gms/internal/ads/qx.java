package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@cm
@TargetApi(17)
public final class qx<WebViewT extends ra,  extends ri,  extends rl>
{
  private final qz a;
  private final WebViewT b;
  
  private qx(WebViewT paramWebViewT, qz paramqz)
  {
    this.a = paramqz;
    this.b = paramWebViewT;
  }
  
  public static qx<qe> a(qe paramqe)
  {
    return new qx(paramqe, new qy(paramqe));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qx
 * JD-Core Version:    0.7.0.1
 */