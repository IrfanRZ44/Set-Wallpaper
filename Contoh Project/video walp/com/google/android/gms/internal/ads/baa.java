package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class baa
{
  private final Object a = new Object();
  private final Context b;
  private final String c;
  private final zzang d;
  private ks<azo> e;
  private ks<azo> f;
  private bar g;
  private int h = 1;
  
  public baa(Context paramContext, zzang paramzzang, String paramString)
  {
    this.c = paramString;
    this.b = paramContext.getApplicationContext();
    this.d = paramzzang;
    this.e = new bam();
    this.f = new bam();
  }
  
  public baa(Context paramContext, zzang paramzzang, String paramString, ks<azo> paramks1, ks<azo> paramks2)
  {
    this(paramContext, paramzzang, paramString);
    this.e = paramks1;
    this.f = paramks2;
  }
  
  protected final bar a(agw paramagw)
  {
    bar localbar = new bar(this.f);
    nk.a.execute(new bab(this, paramagw, localbar));
    localbar.a(new baj(this, localbar), new bak(this, localbar));
    return localbar;
  }
  
  public final ban b(agw paramagw)
  {
    synchronized (this.a)
    {
      if ((this.g == null) || (this.g.b() == -1))
      {
        this.h = 2;
        this.g = a(null);
        ban localban1 = this.g.c();
        return localban1;
      }
      if (this.h == 0)
      {
        ban localban5 = this.g.c();
        return localban5;
      }
    }
    if (this.h == 1)
    {
      this.h = 2;
      a(null);
      ban localban4 = this.g.c();
      return localban4;
    }
    if (this.h == 2)
    {
      ban localban3 = this.g.c();
      return localban3;
    }
    ban localban2 = this.g.c();
    return localban2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.baa
 * JD-Core Version:    0.7.0.1
 */