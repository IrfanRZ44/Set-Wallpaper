package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class aha
  extends afu<Integer, Long>
{
  public long a = -1L;
  public long b = -1L;
  
  public aha() {}
  
  public aha(String paramString)
  {
    this();
    a(paramString);
  }
  
  protected final HashMap<Integer, Long> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), Long.valueOf(this.a));
    localHashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    HashMap localHashMap = b(paramString);
    if (localHashMap != null)
    {
      this.a = ((Long)localHashMap.get(Integer.valueOf(0))).longValue();
      this.b = ((Long)localHashMap.get(Integer.valueOf(1))).longValue();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aha
 * JD-Core Version:    0.7.0.1
 */