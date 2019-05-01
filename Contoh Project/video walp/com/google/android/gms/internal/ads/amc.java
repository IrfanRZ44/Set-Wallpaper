package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.c.b;

@cm
public final class amc
  extends c<amf>
{
  amc(Context paramContext, Looper paramLooper, c.a parama, c.b paramb)
  {
    super(paramContext, paramLooper, 123, parama, paramb, null);
  }
  
  protected final String a()
  {
    return "com.google.android.gms.ads.service.CACHE";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.ads.internal.cache.ICacheService";
  }
  
  public final amf x()
  {
    return (amf)super.s();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amc
 * JD-Core Version:    0.7.0.1
 */