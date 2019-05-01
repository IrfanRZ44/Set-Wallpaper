package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class apr
{
  private final String a;
  private final String b;
  
  public apr(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    apr localapr;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localapr = (apr)paramObject;
    } while ((TextUtils.equals(this.a, localapr.a)) && (TextUtils.equals(this.b, localapr.b)));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * this.a.hashCode() + this.b.hashCode();
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    return 20 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Header[name=" + str1 + ",value=" + str2 + "]";
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apr
 * JD-Core Version:    0.7.0.1
 */