package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class ql
{
  public static ne<qe> a(Context paramContext, zzang paramzzang, String paramString, agw paramagw, zzw paramzzw)
  {
    return mt.a(mt.a(null), new qm(paramContext, paramagw, paramzzang, paramzzw, paramString), nk.a);
  }
  
  public static qe a(Context paramContext, rs paramrs, String paramString, boolean paramBoolean1, boolean paramBoolean2, agw paramagw, zzang paramzzang, asn paramasn, zzbo paramzzbo, zzw paramzzw, amj paramamj)
  {
    asa.a(paramContext);
    arq localarq = asa.az;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      return ry.a(paramContext, paramrs, paramString, paramBoolean2, paramBoolean1, paramagw, paramzzang, paramasn, paramzzbo, paramzzw, paramamj);
    }
    try
    {
      qe localqe = (qe)lq.a(new qn(paramContext, paramrs, paramString, paramBoolean1, paramBoolean2, paramagw, paramzzang, paramasn, paramzzbo, paramzzw, paramamj));
      return localqe;
    }
    catch (Throwable localThrowable)
    {
      throw new qp("Webview initialization failed.", localThrowable);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ql
 * JD-Core Version:    0.7.0.1
 */