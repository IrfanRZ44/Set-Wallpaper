package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@cm
public final class f
{
  private final qe a;
  private final boolean b;
  private final String c;
  
  public f(qe paramqe, Map<String, String> paramMap)
  {
    this.a = paramqe;
    this.c = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
    {
      this.b = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
      return;
    }
    this.b = true;
  }
  
  public final void a()
  {
    if (this.a == null)
    {
      je.e("AdWebView is null");
      return;
    }
    int i;
    if ("portrait".equalsIgnoreCase(this.c)) {
      i = zzbv.zzem().b();
    }
    for (;;)
    {
      this.a.setRequestedOrientation(i);
      return;
      if ("landscape".equalsIgnoreCase(this.c)) {
        i = zzbv.zzem().a();
      } else if (this.b) {
        i = -1;
      } else {
        i = zzbv.zzem().c();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.f
 * JD-Core Version:    0.7.0.1
 */