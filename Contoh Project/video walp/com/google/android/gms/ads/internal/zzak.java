package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.f.m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.apb;
import com.google.android.gms.internal.ads.apf;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.avo;
import com.google.android.gms.internal.ads.avr;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.awb;
import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;

@cm
public final class zzak
  extends apf
{
  private aoy a;
  private avo b;
  private awe c;
  private avr d;
  private m<String, avv> e;
  private m<String, avy> f;
  private awb g;
  private zzjn h;
  private PublisherAdViewOptions i;
  private zzpl j;
  private apy k;
  private final Context l;
  private final bck m;
  private final String n;
  private final zzang o;
  private final zzw p;
  
  public zzak(Context paramContext, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    this.l = paramContext;
    this.n = paramString;
    this.m = parambck;
    this.o = paramzzang;
    this.f = new m();
    this.e = new m();
    this.p = paramzzw;
  }
  
  public final void zza(PublisherAdViewOptions paramPublisherAdViewOptions)
  {
    this.i = paramPublisherAdViewOptions;
  }
  
  public final void zza(avo paramavo)
  {
    this.b = paramavo;
  }
  
  public final void zza(avr paramavr)
  {
    this.d = paramavr;
  }
  
  public final void zza(awb paramawb, zzjn paramzzjn)
  {
    this.g = paramawb;
    this.h = paramzzjn;
  }
  
  public final void zza(awe paramawe)
  {
    this.c = paramawe;
  }
  
  public final void zza(zzpl paramzzpl)
  {
    this.j = paramzzpl;
  }
  
  public final void zza(String paramString, avy paramavy, avv paramavv)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
    this.f.put(paramString, paramavy);
    this.e.put(paramString, paramavv);
  }
  
  public final void zzb(aoy paramaoy)
  {
    this.a = paramaoy;
  }
  
  public final void zzb(apy paramapy)
  {
    this.k = paramapy;
  }
  
  public final apb zzdh()
  {
    return new zzah(this.l, this.n, this.m, this.o, this.a, this.b, this.c, this.d, this.f, this.e, this.j, this.k, this.p, this.g, this.h, this.i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzak
 * JD-Core Version:    0.7.0.1
 */