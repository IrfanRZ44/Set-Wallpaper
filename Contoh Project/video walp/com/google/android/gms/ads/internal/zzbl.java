package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzbl
{
  private final zzbn a;
  private final Runnable b;
  private zzjj c;
  private boolean d = false;
  private boolean e = false;
  private long f = 0L;
  
  public zzbl(zza paramzza)
  {
    this(paramzza, new zzbn(jn.a));
  }
  
  private zzbl(zza paramzza, zzbn paramzzbn)
  {
    this.a = paramzzbn;
    this.b = new z(this, new WeakReference(paramzza));
  }
  
  public final void cancel()
  {
    this.d = false;
    this.a.removeCallbacks(this.b);
  }
  
  public final void pause()
  {
    this.e = true;
    if (this.d) {
      this.a.removeCallbacks(this.b);
    }
  }
  
  public final void resume()
  {
    this.e = false;
    if (this.d)
    {
      this.d = false;
      zza(this.c, this.f);
    }
  }
  
  public final void zza(zzjj paramzzjj, long paramLong)
  {
    if (this.d) {
      je.e("An ad refresh is already scheduled.");
    }
    do
    {
      return;
      this.c = paramzzjj;
      this.d = true;
      this.f = paramLong;
    } while (this.e);
    je.d(65 + "Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.a.postDelayed(this.b, paramLong);
  }
  
  public final void zzdy()
  {
    this.e = false;
    this.d = false;
    if ((this.c != null) && (this.c.c != null)) {
      this.c.c.remove("_ad");
    }
    zza(this.c, 0L);
  }
  
  public final boolean zzdz()
  {
    return this.d;
  }
  
  public final void zzf(zzjj paramzzjj)
  {
    this.c = paramzzjj;
  }
  
  public final void zzg(zzjj paramzzjj)
  {
    zza(paramzzjj, 60000L);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbl
 * JD-Core Version:    0.7.0.1
 */