package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public abstract class pp
{
  protected Context a;
  private String b;
  private WeakReference<pd> c;
  
  public pp(pd parampd)
  {
    this.a = parampd.getContext();
    this.b = zzbv.zzek().b(this.a, parampd.i().a);
    this.c = new WeakReference(parampd);
  }
  
  private final void a(String paramString, Map<String, String> paramMap)
  {
    pd localpd = (pd)this.c.get();
    if (localpd != null) {
      localpd.a(paramString, paramMap);
    }
  }
  
  private static String b(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return "internal";
        if (paramString.equals("contentLengthMissing"))
        {
          i = 0;
          continue;
          if (paramString.equals("error"))
          {
            i = 1;
            continue;
            if (paramString.equals("inProgress"))
            {
              i = 2;
              continue;
              if (paramString.equals("interrupted"))
              {
                i = 3;
                continue;
                if (paramString.equals("noop"))
                {
                  i = 4;
                  continue;
                  if (paramString.equals("playerFailed"))
                  {
                    i = 5;
                    continue;
                    if (paramString.equals("expireFailed"))
                    {
                      i = 6;
                      continue;
                      if (paramString.equals("noCacheDir"))
                      {
                        i = 7;
                        continue;
                        if (paramString.equals("badUrl"))
                        {
                          i = 8;
                          continue;
                          if (paramString.equals("downloadTimeout"))
                          {
                            i = 9;
                            continue;
                            if (paramString.equals("externalAbort"))
                            {
                              i = 10;
                              continue;
                              if (paramString.equals("sizeExceeded")) {
                                i = 11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    return "internal";
    return "io";
    return "network";
    return "policy";
  }
  
  public abstract void a();
  
  protected final void a(String paramString1, String paramString2, int paramInt)
  {
    lz.a.post(new pr(this, paramString1, paramString2, paramInt));
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    lz.a.post(new ps(this, paramString1, paramString2, paramString3, paramString4));
  }
  
  public abstract boolean a(String paramString);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pp
 * JD-Core Version:    0.7.0.1
 */