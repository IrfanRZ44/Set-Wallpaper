package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class pr
  implements Runnable
{
  pr(pp parampp, String paramString1, String paramString2, int paramInt) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheComplete");
    localHashMap.put("src", this.a);
    localHashMap.put("cachedSrc", this.b);
    localHashMap.put("totalBytes", Integer.toString(this.c));
    pp.a(this.d, "onPrecacheEvent", localHashMap);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pr
 * JD-Core Version:    0.7.0.1
 */