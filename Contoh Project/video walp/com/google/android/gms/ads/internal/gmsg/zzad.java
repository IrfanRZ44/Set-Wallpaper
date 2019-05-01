package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agx;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.d;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.zzang;
import java.util.Map;

@cm
public final class zzad<T extends ra,  extends rb,  extends rf,  extends ri,  extends rl>
  implements zzv<T>
{
  private final Context a;
  private final agw b;
  private final zzang c;
  private final zzt d;
  private final anw e;
  private final zzn f;
  private final zzb g;
  private final zzd h;
  private final zzx i;
  private final d j;
  private final qe k = null;
  
  public zzad(Context paramContext, zzang paramzzang, agw paramagw, zzt paramzzt, anw paramanw, zzb paramzzb, zzd paramzzd, zzn paramzzn, zzx paramzzx, d paramd)
  {
    this.a = paramContext;
    this.c = paramzzang;
    this.b = paramagw;
    this.d = paramzzt;
    this.e = paramanw;
    this.g = paramzzb;
    this.h = paramzzd;
    this.i = paramzzx;
    this.j = paramd;
    this.f = paramzzn;
  }
  
  static String a(Context paramContext, agw paramagw, String paramString, View paramView, Activity paramActivity)
  {
    if (paramagw == null) {
      return paramString;
    }
    try
    {
      Uri localUri = Uri.parse(paramString);
      if (paramagw.b(localUri)) {
        localUri = paramagw.a(localUri, paramContext, paramView, paramActivity);
      }
      String str = localUri.toString();
      return str;
    }
    catch (Exception localException)
    {
      zzbv.zzeo().a(localException, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
      return paramString;
    }
    catch (agx localagx) {}
    return paramString;
  }
  
  private final void a(boolean paramBoolean)
  {
    if (this.j != null) {
      this.j.a(paramBoolean);
    }
  }
  
  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int b(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str)) {
        return zzbv.zzem().b();
      }
      if ("l".equalsIgnoreCase(str)) {
        return zzbv.zzem().a();
      }
      if ("c".equalsIgnoreCase(str)) {
        return zzbv.zzem().c();
      }
    }
    return -1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzad
 * JD-Core Version:    0.7.0.1
 */