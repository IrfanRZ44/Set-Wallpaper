package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahw
  extends afu<Integer, Long>
{
  public Long a;
  public Long b;
  public Long c;
  
  public ahw() {}
  
  public ahw(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap<Integer, Long> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), this.a);
    localHashMap.put(Integer.valueOf(1), this.b);
    localHashMap.put(Integer.valueOf(2), this.c);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    HashMap localHashMap = b(paramString);
    if (localHashMap != null)
    {
      this.a = ((Long)localHashMap.get(Integer.valueOf(0)));
      this.b = ((Long)localHashMap.get(Integer.valueOf(1)));
      this.c = ((Long)localHashMap.get(Integer.valueOf(2)));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahw
 * JD-Core Version:    0.7.0.1
 */