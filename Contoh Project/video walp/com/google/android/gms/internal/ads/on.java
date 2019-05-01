package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@cm
@TargetApi(14)
public abstract class on
  extends TextureView
  implements pi
{
  protected final ow a = new ow();
  protected final pg b = new pg(paramContext, this);
  
  public on(Context paramContext)
  {
    super(paramContext);
  }
  
  public abstract String a();
  
  public abstract void a(float paramFloat1, float paramFloat2);
  
  public abstract void a(int paramInt);
  
  public abstract void a(om paramom);
  
  public abstract void b();
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract int getCurrentPosition();
  
  public abstract int getDuration();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoWidth();
  
  public abstract void setVideoPath(String paramString);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.on
 * JD-Core Version:    0.7.0.1
 */