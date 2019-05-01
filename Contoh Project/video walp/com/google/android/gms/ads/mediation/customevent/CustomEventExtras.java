package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras
  implements NetworkExtras
{
  private final HashMap<String, Object> zzdgj = new HashMap();
  
  public final Object getExtra(String paramString)
  {
    return this.zzdgj.get(paramString);
  }
  
  public final void setExtra(String paramString, Object paramObject)
  {
    this.zzdgj.put(paramString, paramObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventExtras
 * JD-Core Version:    0.7.0.1
 */