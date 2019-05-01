package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public class zzjn
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzjn> CREATOR = new aof();
  public final String a;
  public final int b;
  public final int c;
  public final boolean d;
  public final int e;
  public final int f;
  public final zzjn[] g;
  public final boolean h;
  public final boolean i;
  public boolean j;
  
  public zzjn()
  {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public zzjn(Context paramContext, AdSize paramAdSize)
  {
    this(paramContext, new AdSize[] { paramAdSize });
  }
  
  public zzjn(Context paramContext, AdSize[] paramArrayOfAdSize)
  {
    AdSize localAdSize = paramArrayOfAdSize[0];
    this.d = false;
    this.i = localAdSize.isFluid();
    int k;
    label59:
    int m;
    label71:
    DisplayMetrics localDisplayMetrics;
    label129:
    int i1;
    label169:
    int i2;
    if (this.i)
    {
      this.e = AdSize.BANNER.getWidth();
      this.b = AdSize.BANNER.getHeight();
      if (this.e != -1) {
        break label311;
      }
      k = 1;
      if (this.b != -2) {
        break label317;
      }
      m = 1;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (k == 0) {
        break label335;
      }
      aos.a();
      if (!lz.g(paramContext)) {
        break label323;
      }
      aos.a();
      if (!lz.h(paramContext)) {
        break label323;
      }
      int i5 = localDisplayMetrics.widthPixels;
      aos.a();
      this.f = (i5 - lz.i(paramContext));
      double d1 = this.f / localDisplayMetrics.density;
      int i4 = (int)d1;
      if (d1 - (int)d1 >= 0.01D) {
        i4++;
      }
      i1 = i4;
      if (m == 0) {
        break label365;
      }
      i2 = c(localDisplayMetrics);
      label181:
      aos.a();
      this.c = lz.a(localDisplayMetrics, i2);
      if ((k == 0) && (m == 0)) {
        break label374;
      }
      this.a = (26 + i1 + "x" + i2 + "_as");
    }
    for (;;)
    {
      if (paramArrayOfAdSize.length <= 1) {
        break label401;
      }
      this.g = new zzjn[paramArrayOfAdSize.length];
      for (int i3 = 0; i3 < paramArrayOfAdSize.length; i3++) {
        this.g[i3] = new zzjn(paramContext, paramArrayOfAdSize[i3]);
      }
      this.e = localAdSize.getWidth();
      this.b = localAdSize.getHeight();
      break;
      label311:
      k = 0;
      break label59;
      label317:
      m = 0;
      break label71;
      label323:
      this.f = localDisplayMetrics.widthPixels;
      break label129;
      label335:
      int n = this.e;
      aos.a();
      this.f = lz.a(localDisplayMetrics, this.e);
      i1 = n;
      break label169;
      label365:
      i2 = this.b;
      break label181;
      label374:
      if (this.i) {
        this.a = "320x50_mb";
      } else {
        this.a = localAdSize.toString();
      }
    }
    label401:
    this.g = null;
    this.h = false;
    this.j = false;
  }
  
  public zzjn(zzjn paramzzjn, zzjn[] paramArrayOfzzjn)
  {
    this(paramzzjn.a, paramzzjn.b, paramzzjn.c, paramzzjn.d, paramzzjn.e, paramzzjn.f, paramArrayOfzzjn, paramzzjn.h, paramzzjn.i, paramzzjn.j);
  }
  
  zzjn(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, zzjn[] paramArrayOfzzjn, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean1;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramArrayOfzzjn;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
    this.j = paramBoolean4;
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static zzjn a()
  {
    return new zzjn("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public static zzjn a(Context paramContext)
  {
    return new zzjn("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int k = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (k <= 400) {
      return 32;
    }
    if (k <= 720) {
      return 50;
    }
    return 90;
  }
  
  public final AdSize b()
  {
    return zzb.zza(this.e, this.b, this.a);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, 4, this.c);
    b.a(paramParcel, 5, this.d);
    b.a(paramParcel, 6, this.e);
    b.a(paramParcel, 7, this.f);
    b.a(paramParcel, 8, this.g, paramInt, false);
    b.a(paramParcel, 9, this.h);
    b.a(paramParcel, 10, this.i);
    b.a(paramParcel, 11, this.j);
    b.a(paramParcel, k);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzjn
 * JD-Core Version:    0.7.0.1
 */