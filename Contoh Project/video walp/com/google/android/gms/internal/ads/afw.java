package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class afw
  extends afu<Integer, Object>
{
  public String a = "E";
  public long b = -1L;
  public String c = "E";
  public String d = "E";
  public String e = "E";
  
  public afw() {}
  
  public afw(String paramString)
  {
    this();
    a(paramString);
  }
  
  protected final HashMap<Integer, Object> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), this.a);
    localHashMap.put(Integer.valueOf(4), this.e);
    localHashMap.put(Integer.valueOf(3), this.d);
    localHashMap.put(Integer.valueOf(2), this.c);
    localHashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    HashMap localHashMap = b(paramString);
    String str1;
    long l;
    label44:
    String str2;
    label65:
    String str3;
    if (localHashMap != null)
    {
      if (localHashMap.get(Integer.valueOf(0)) != null) {
        break label114;
      }
      str1 = "E";
      this.a = str1;
      if (localHashMap.get(Integer.valueOf(1)) != null) {
        break label129;
      }
      l = -1L;
      this.b = l;
      if (localHashMap.get(Integer.valueOf(2)) != null) {
        break label148;
      }
      str2 = "E";
      this.c = str2;
      if (localHashMap.get(Integer.valueOf(3)) != null) {
        break label164;
      }
      str3 = "E";
      label86:
      this.d = str3;
      if (localHashMap.get(Integer.valueOf(4)) != null) {
        break label180;
      }
    }
    label129:
    label148:
    label164:
    label180:
    for (String str4 = "E";; str4 = (String)localHashMap.get(Integer.valueOf(4)))
    {
      this.e = str4;
      return;
      label114:
      str1 = (String)localHashMap.get(Integer.valueOf(0));
      break;
      l = ((Long)localHashMap.get(Integer.valueOf(1))).longValue();
      break label44;
      str2 = (String)localHashMap.get(Integer.valueOf(2));
      break label65;
      str3 = (String)localHashMap.get(Integer.valueOf(3));
      break label86;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afw
 * JD-Core Version:    0.7.0.1
 */