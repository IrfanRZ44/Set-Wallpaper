package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.ads.alw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqc;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.zzang;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class zzay
  extends aqc
{
  private static final Object b = new Object();
  @GuardedBy("sLock")
  private static zzay c;
  private final Context a;
  private final Object d = new Object();
  private boolean e;
  private zzang f;
  
  private zzay(Context paramContext, zzang paramzzang)
  {
    this.a = paramContext;
    this.f = paramzzang;
    this.e = false;
  }
  
  public static zzay zza(Context paramContext, zzang paramzzang)
  {
    synchronized (b)
    {
      if (c == null) {
        c = new zzay(paramContext.getApplicationContext(), paramzzang);
      }
      zzay localzzay = c;
      return localzzay;
    }
  }
  
  public final void setAppMuted(boolean paramBoolean)
  {
    zzbv.zzfj().a(paramBoolean);
  }
  
  public final void setAppVolume(float paramFloat)
  {
    zzbv.zzfj().a(paramFloat);
  }
  
  public final void zza()
  {
    synchronized (b)
    {
      if (this.e)
      {
        je.e("Mobile ads is initialized already.");
        return;
      }
      this.e = true;
      asa.a(this.a);
      zzbv.zzeo().a(this.a, this.f);
      zzbv.zzeq().a(this.a);
      return;
    }
  }
  
  public final void zza(String paramString, a parama)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      asa.a(this.a);
      arq localarq1 = asa.cs;
      boolean bool1 = ((Boolean)aos.f().a(localarq1)).booleanValue();
      arq localarq2 = asa.aD;
      boolean bool2 = bool1 | ((Boolean)aos.f().a(localarq2)).booleanValue();
      arq localarq3 = asa.aD;
      o localo;
      int i;
      if (((Boolean)aos.f().a(localarq3)).booleanValue())
      {
        localo = new o(this, (Runnable)b.a(parama));
        i = 1;
      }
      while (i != 0)
      {
        zzbv.zzes().zza(this.a, this.f, paramString, localo);
        return;
        i = bool2;
        localo = null;
      }
    }
  }
  
  public final void zzb(a parama, String paramString)
  {
    if (parama == null)
    {
      je.c("Wrapped context is null. Failed to open debug menu.");
      return;
    }
    Context localContext = (Context)b.a(parama);
    if (localContext == null)
    {
      je.c("Context is null. Failed to open debug menu.");
      return;
    }
    kh localkh = new kh(localContext);
    localkh.a(paramString);
    localkh.b(this.f.a);
    localkh.a();
  }
  
  public final float zzdo()
  {
    return zzbv.zzfj().a();
  }
  
  public final boolean zzdp()
  {
    return zzbv.zzfj().b();
  }
  
  public final void zzt(String paramString)
  {
    asa.a(this.a);
    if (!TextUtils.isEmpty(paramString))
    {
      arq localarq = asa.cs;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        zzbv.zzes().zza(this.a, this.f, paramString, null);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzay
 * JD-Core Version:    0.7.0.1
 */