package com.google.android.gms.internal.ads;

@cm
final class ayx
{
  private static final ayu a = ;
  private static final float b;
  private static final long c;
  private static final float d;
  private static final long e;
  
  static
  {
    arq localarq1 = asa.bf;
    b = ((Float)aos.f().a(localarq1)).floatValue();
    arq localarq2 = asa.bd;
    c = ((Long)aos.f().a(localarq2)).longValue();
    arq localarq3 = asa.bg;
    d = ((Float)aos.f().a(localarq3)).floatValue();
    arq localarq4 = asa.be;
    e = ((Long)aos.f().a(localarq4)).longValue();
  }
  
  private static int a(long paramLong, int paramInt)
  {
    return (int)(0xF & paramLong >>> 4 * (paramInt % 16));
  }
  
  static boolean a()
  {
    int i = 2147483647;
    int j = a.h();
    int k = a.i();
    int m = a.g() + a.f();
    int n;
    if ((j < 16) && (e != 0L))
    {
      n = a(e, j);
      if (k > n) {
        break label136;
      }
      if ((j >= 16) || (c == 0L)) {
        break label117;
      }
      i = a(c, j);
    }
    for (;;)
    {
      if (m > i) {
        break label136;
      }
      return true;
      if (d != 0.0F)
      {
        n = 1 + (int)(d * j);
        break;
      }
      n = i;
      break;
      label117:
      if (b != 0.0F) {
        i = (int)(b * j);
      }
    }
    label136:
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayx
 * JD-Core Version:    0.7.0.1
 */