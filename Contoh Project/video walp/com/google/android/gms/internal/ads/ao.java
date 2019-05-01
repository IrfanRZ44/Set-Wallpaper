package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.common.util.k;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class ao
{
  public static kg a(Context paramContext, zza paramzza, ik paramik, agw paramagw, qe paramqe, bck parambck, ap paramap, asn paramasn)
  {
    zzaej localzzaej = paramik.b;
    Object localObject;
    String str1;
    if (localzzaej.g)
    {
      localObject = new au(paramContext, paramik, parambck, paramap, paramasn, paramqe);
      str1 = String.valueOf(localObject.getClass().getName());
      if (str1.length() == 0) {
        break label235;
      }
    }
    label235:
    for (String str2 = "AdRenderer: ".concat(str1);; str2 = new String("AdRenderer: "))
    {
      je.b(str2);
      ((kg)localObject).c();
      return localObject;
      if ((localzzaej.s) || ((paramzza instanceof zzbc)))
      {
        if ((localzzaej.s) && ((paramzza instanceof zzbc)))
        {
          localObject = new aw(paramContext, (zzbc)paramzza, paramik, paramagw, paramap, paramasn);
          break;
        }
        localObject = new ar(paramik, paramap);
        break;
      }
      arq localarq = asa.ah;
      if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (k.g()) && (!k.i()) && (paramqe != null) && (paramqe.r().d()))
      {
        localObject = new at(paramContext, paramik, paramqe, paramap);
        break;
      }
      localObject = new aq(paramContext, paramik, paramqe, paramap);
      break;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ao
 * JD-Core Version:    0.7.0.1
 */