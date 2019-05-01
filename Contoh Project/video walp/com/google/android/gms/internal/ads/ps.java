package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class ps
  implements Runnable
{
  ps(pp parampp, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheCanceled");
    localHashMap.put("src", this.a);
    if (!TextUtils.isEmpty(this.b)) {
      localHashMap.put("cachedSrc", this.b);
    }
    localHashMap.put("type", pp.a(this.e, this.c));
    localHashMap.put("reason", this.c);
    if (!TextUtils.isEmpty(this.d)) {
      localHashMap.put("message", this.d);
    }
    pp.a(this.e, "onPrecacheEvent", localHashMap);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ps
 * JD-Core Version:    0.7.0.1
 */