package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class kx
{
  private static azu a;
  private static final Object b = new Object();
  @Deprecated
  private static final ld<Void> c = new ky();
  
  public kx(Context paramContext)
  {
    if (paramContext.getApplicationContext() == null) {}
    for (;;)
    {
      a(paramContext);
      return;
      paramContext = paramContext.getApplicationContext();
    }
  }
  
  private static azu a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
      {
        asa.a(paramContext);
        arq localarq = asa.cI;
        if (((Boolean)aos.f().a(localarq)).booleanValue())
        {
          localazu2 = kr.a(paramContext);
          a = localazu2;
        }
      }
      else
      {
        azu localazu1 = a;
        return localazu1;
      }
      ib localib = new ib(new rj());
      azu localazu2 = new azu(new le(new File(paramContext.getCacheDir(), "volley")), localib);
      localazu2.a();
    }
  }
  
  public final ne<String> a(int paramInt, String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    lf locallf = new lf(null);
    lb locallb = new lb(this, paramString, locallf);
    md localmd = new md(null);
    lc locallc = new lc(this, paramInt, paramString, locallf, locallb, paramArrayOfByte, paramMap, localmd);
    if (md.c()) {}
    try
    {
      localmd.a(paramString, "GET", locallc.b(), locallc.a());
      a.a(locallc);
      return locallf;
    }
    catch (a locala)
    {
      for (;;)
      {
        je.e(locala.getMessage());
      }
    }
  }
  
  @Deprecated
  public final <T> ne<T> a(String paramString, ld<T> paramld)
  {
    np localnp = new np();
    a.a(new lg(paramString, localnp));
    return mt.a(mt.a(localnp, new la(this, paramld), jl.a), Throwable.class, new kz(this, paramld), nk.b);
  }
  
  public final ne<String> a(String paramString, Map<String, String> paramMap)
  {
    return a(0, paramString, paramMap, null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kx
 * JD-Core Version:    0.7.0.1
 */