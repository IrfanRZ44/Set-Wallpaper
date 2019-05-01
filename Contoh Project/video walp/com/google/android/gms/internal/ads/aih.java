package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.lang.reflect.Method;

public final class aih
  extends aiy
{
  public aih(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 24);
  }
  
  private final void c()
  {
    AdvertisingIdClient localAdvertisingIdClient = this.a.m();
    if (localAdvertisingIdClient == null) {}
    for (;;)
    {
      return;
      try
      {
        AdvertisingIdClient.Info localInfo = localAdvertisingIdClient.getInfo();
        String str = ahv.a(localInfo.getId());
        if (str == null) {
          continue;
        }
        synchronized (this.b)
        {
          this.b.T = str;
          this.b.V = Boolean.valueOf(localInfo.isLimitAdTrackingEnabled());
          this.b.U = Integer.valueOf(5);
          return;
        }
        return;
      }
      catch (IOException localIOException) {}
    }
  }
  
  protected final void a()
  {
    if (this.a.g())
    {
      c();
      return;
    }
    synchronized (this.b)
    {
      zo localzo2 = this.b;
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a();
      localzo2.T = ((String)localMethod.invoke(null, arrayOfObject));
      return;
    }
  }
  
  public final Void b()
  {
    if (this.a.b()) {
      return super.b();
    }
    if (this.a.g()) {
      c();
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aih
 * JD-Core Version:    0.7.0.1
 */