package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@cm
public final class fp
  implements es
{
  private bbb<JSONObject, JSONObject> a;
  private bbb<JSONObject, JSONObject> b;
  
  public fp(Context paramContext)
  {
    this.a = zzbv.zzey().a(paramContext, zzang.a()).a("google.afma.request.getAdDictionary", bbg.a, bbg.a);
    this.b = zzbv.zzey().a(paramContext, zzang.a()).a("google.afma.sdkConstants.getSdkConstants", bbg.a, bbg.a);
  }
  
  public final bbb<JSONObject, JSONObject> a()
  {
    return this.a;
  }
  
  public final bbb<JSONObject, JSONObject> b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fp
 * JD-Core Version:    0.7.0.1
 */