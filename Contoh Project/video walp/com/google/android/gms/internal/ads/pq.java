package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class pq
  implements Runnable
{
  pq(pp parampp, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", this.a);
    localHashMap.put("cachedSrc", this.b);
    localHashMap.put("bytesLoaded", Integer.toString(this.c));
    localHashMap.put("totalBytes", Integer.toString(this.d));
    if (this.e) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("cacheReady", str);
      pp.a(this.f, "onPrecacheEvent", localHashMap);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pq
 * JD-Core Version:    0.7.0.1
 */