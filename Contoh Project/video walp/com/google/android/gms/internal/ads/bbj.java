package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class bbj
{
  private static final ks<azo> a = new bbk();
  private static final ks<azo> b = new bbl();
  private final baa c;
  
  public bbj(Context paramContext, zzang paramzzang, String paramString)
  {
    this.c = new baa(paramContext, paramzzang, paramString, a, b);
  }
  
  public final <I, O> bbb<I, O> a(String paramString, bbe<I> parambbe, bbd<O> parambbd)
  {
    return new bbm(this.c, paramString, parambbe, parambbd);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbj
 * JD-Core Version:    0.7.0.1
 */