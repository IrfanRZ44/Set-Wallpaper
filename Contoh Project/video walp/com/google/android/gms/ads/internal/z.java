package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;

final class z
  implements Runnable
{
  z(zzbl paramzzbl, WeakReference paramWeakReference) {}
  
  public final void run()
  {
    zzbl.a(this.b, false);
    zza localzza = (zza)this.a.get();
    zzjj localzzjj;
    if (localzza != null)
    {
      localzzjj = zzbl.a(this.b);
      if (localzza.b(localzzjj)) {
        localzza.zzb(localzzjj);
      }
    }
    else
    {
      return;
    }
    je.d("Ad is not visible. Not refreshing ad.");
    localzza.d.zzg(localzzjj);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.z
 * JD-Core Version:    0.7.0.1
 */