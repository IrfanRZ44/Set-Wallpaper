package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.lm;

@cm
final class e
  extends iz
{
  private e(zzd paramzzd) {}
  
  public final void a()
  {
    Bitmap localBitmap = zzbv.zzfe().a(Integer.valueOf(this.a.b.zzbyw.zzzj));
    if (localBitmap != null)
    {
      Drawable localDrawable = zzbv.zzem().a(this.a.a, localBitmap, this.a.b.zzbyw.zzzh, this.a.b.zzbyw.zzzi);
      jn.a.post(new f(this, localDrawable));
    }
  }
  
  public final void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.e
 * JD-Core Version:    0.7.0.1
 */