package com.google.android.gms.internal.ads;

final class adc
{
  private final String a;
  private int b;
  
  adc(String paramString)
  {
    this.a = paramString;
    this.b = 0;
  }
  
  final boolean a()
  {
    return this.b < this.a.length();
  }
  
  final int b()
  {
    String str1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    int j = str1.charAt(i);
    if (j < 55296) {
      return j;
    }
    int k = j & 0x1FFF;
    int i1;
    for (int m = 13;; m += 13)
    {
      String str2 = this.a;
      int n = this.b;
      this.b = (n + 1);
      i1 = str2.charAt(n);
      if (i1 < 55296) {
        break;
      }
      k |= (i1 & 0x1FFF) << m;
    }
    return k | i1 << m;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adc
 * JD-Core Version:    0.7.0.1
 */