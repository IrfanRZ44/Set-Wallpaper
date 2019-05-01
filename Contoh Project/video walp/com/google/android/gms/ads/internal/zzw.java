package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.hv;
import com.google.android.gms.internal.ads.oo;
import com.google.android.gms.internal.ads.ov;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.pu;

@cm
public final class zzw
{
  public final pu zzwy;
  public final oo zzwz;
  public final hv zzxa;
  public final amo zzxb;
  
  private zzw(pu parampu, oo paramoo, hv paramhv, amo paramamo)
  {
    this.zzwy = parampu;
    this.zzwz = paramoo;
    this.zzxa = paramhv;
    this.zzxb = paramamo;
  }
  
  public static zzw zzc(Context paramContext)
  {
    return new zzw(new pj(), new ov(), new hq(new hr()), new amo(paramContext));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzw
 * JD-Core Version:    0.7.0.1
 */