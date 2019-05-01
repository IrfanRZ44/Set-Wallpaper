package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@cm
public final class kr
  extends ib
{
  private final Context a;
  
  private kr(Context paramContext, qi paramqi)
  {
    super(paramqi);
    this.a = paramContext;
  }
  
  public static azu a(Context paramContext)
  {
    kr localkr = new kr(paramContext, new rj());
    azu localazu = new azu(new le(new File(paramContext.getCacheDir(), "admob_volley")), localkr);
    localazu.a();
    return localazu;
  }
  
  public final atr a(avs<?> paramavs)
  {
    String str2;
    if ((paramavs.h()) && (paramavs.c() == 0))
    {
      String str1 = paramavs.e();
      arq localarq = asa.cJ;
      if (Pattern.matches((String)aos.f().a(localarq), str1))
      {
        aos.a();
        if (lz.c(this.a))
        {
          atr localatr = new axe(this.a).a(paramavs);
          if (localatr != null)
          {
            String str4 = String.valueOf(paramavs.e());
            if (str4.length() != 0) {}
            for (String str5 = "Got gmscore asset response: ".concat(str4);; str5 = new String("Got gmscore asset response: "))
            {
              je.a(str5);
              return localatr;
            }
          }
          str2 = String.valueOf(paramavs.e());
          if (str2.length() == 0) {
            break label161;
          }
        }
      }
    }
    label161:
    for (String str3 = "Failed to get gmscore asset response: ".concat(str2);; str3 = new String("Failed to get gmscore asset response: "))
    {
      je.a(str3);
      return super.a(paramavs);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kr
 * JD-Core Version:    0.7.0.1
 */