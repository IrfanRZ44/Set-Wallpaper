package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbv;

@cm
public final class jf
  extends Handler
{
  public jf(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void dispatchMessage(Message paramMessage)
  {
    try
    {
      super.dispatchMessage(paramMessage);
      return;
    }
    catch (Throwable localThrowable)
    {
      zzbv.zzek();
      jn.a(zzbv.zzeo().m(), localThrowable);
      throw localThrowable;
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      super.handleMessage(paramMessage);
      return;
    }
    catch (Exception localException)
    {
      zzbv.zzeo().a(localException, "AdMobHandler.handleMessage");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jf
 * JD-Core Version:    0.7.0.1
 */