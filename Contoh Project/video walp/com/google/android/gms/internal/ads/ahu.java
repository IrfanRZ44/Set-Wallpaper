package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahu
  extends afu<Integer, Long>
{
  public Long a;
  public Long b;
  public Long c;
  public Long d;
  public Long e;
  public Long f;
  public Long g;
  public Long h;
  public Long i;
  public Long j;
  public Long k;
  
  public ahu() {}
  
  public ahu(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap<Integer, Long> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), this.a);
    localHashMap.put(Integer.valueOf(1), this.b);
    localHashMap.put(Integer.valueOf(2), this.c);
    localHashMap.put(Integer.valueOf(3), this.d);
    localHashMap.put(Integer.valueOf(4), this.e);
    localHashMap.put(Integer.valueOf(5), this.f);
    localHashMap.put(Integer.valueOf(6), this.g);
    localHashMap.put(Integer.valueOf(7), this.h);
    localHashMap.put(Integer.valueOf(8), this.i);
    localHashMap.put(Integer.valueOf(9), this.j);
    localHashMap.put(Integer.valueOf(10), this.k);
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
      this.d = ((Long)localHashMap.get(Integer.valueOf(3)));
      this.e = ((Long)localHashMap.get(Integer.valueOf(4)));
      this.f = ((Long)localHashMap.get(Integer.valueOf(5)));
      this.g = ((Long)localHashMap.get(Integer.valueOf(6)));
      this.h = ((Long)localHashMap.get(Integer.valueOf(7)));
      this.i = ((Long)localHashMap.get(Integer.valueOf(8)));
      this.j = ((Long)localHashMap.get(Integer.valueOf(9)));
      this.k = ((Long)localHashMap.get(Integer.valueOf(10)));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahu
 * JD-Core Version:    0.7.0.1
 */