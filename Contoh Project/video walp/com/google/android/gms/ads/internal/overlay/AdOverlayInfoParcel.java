package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zzang;

@cm
public final class AdOverlayInfoParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
  public final int orientation;
  public final String url;
  public final zzang zzacr;
  public final zzc zzbyl;
  public final anw zzbym;
  public final zzn zzbyn;
  public final qe zzbyo;
  public final zzd zzbyp;
  public final String zzbyq;
  public final boolean zzbyr;
  public final String zzbys;
  public final zzt zzbyt;
  public final int zzbyu;
  public final String zzbyv;
  public final zzaq zzbyw;
  public final zzb zzbyx;
  
  AdOverlayInfoParcel(zzc paramzzc, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, zzang paramzzang, String paramString4, zzaq paramzzaq, IBinder paramIBinder6)
  {
    this.zzbyl = paramzzc;
    this.zzbym = ((anw)com.google.android.gms.a.b.a(a.a.a(paramIBinder1)));
    this.zzbyn = ((zzn)com.google.android.gms.a.b.a(a.a.a(paramIBinder2)));
    this.zzbyo = ((qe)com.google.android.gms.a.b.a(a.a.a(paramIBinder3)));
    this.zzbyx = ((zzb)com.google.android.gms.a.b.a(a.a.a(paramIBinder6)));
    this.zzbyp = ((zzd)com.google.android.gms.a.b.a(a.a.a(paramIBinder4)));
    this.zzbyq = paramString1;
    this.zzbyr = paramBoolean;
    this.zzbys = paramString2;
    this.zzbyt = ((zzt)com.google.android.gms.a.b.a(a.a.a(paramIBinder5)));
    this.orientation = paramInt1;
    this.zzbyu = paramInt2;
    this.url = paramString3;
    this.zzacr = paramzzang;
    this.zzbyv = paramString4;
    this.zzbyw = paramzzaq;
  }
  
  public AdOverlayInfoParcel(zzc paramzzc, anw paramanw, zzn paramzzn, zzt paramzzt, zzang paramzzang)
  {
    this.zzbyl = paramzzc;
    this.zzbym = paramanw;
    this.zzbyn = paramzzn;
    this.zzbyo = null;
    this.zzbyx = null;
    this.zzbyp = null;
    this.zzbyq = null;
    this.zzbyr = false;
    this.zzbys = null;
    this.zzbyt = paramzzt;
    this.orientation = -1;
    this.zzbyu = 4;
    this.url = null;
    this.zzacr = paramzzang;
    this.zzbyv = null;
    this.zzbyw = null;
  }
  
  public AdOverlayInfoParcel(anw paramanw, zzn paramzzn, zzb paramzzb, zzd paramzzd, zzt paramzzt, qe paramqe, boolean paramBoolean, int paramInt, String paramString, zzang paramzzang)
  {
    this.zzbyl = null;
    this.zzbym = paramanw;
    this.zzbyn = paramzzn;
    this.zzbyo = paramqe;
    this.zzbyx = paramzzb;
    this.zzbyp = paramzzd;
    this.zzbyq = null;
    this.zzbyr = paramBoolean;
    this.zzbys = null;
    this.zzbyt = paramzzt;
    this.orientation = paramInt;
    this.zzbyu = 3;
    this.url = paramString;
    this.zzacr = paramzzang;
    this.zzbyv = null;
    this.zzbyw = null;
  }
  
  public AdOverlayInfoParcel(anw paramanw, zzn paramzzn, zzb paramzzb, zzd paramzzd, zzt paramzzt, qe paramqe, boolean paramBoolean, int paramInt, String paramString1, String paramString2, zzang paramzzang)
  {
    this.zzbyl = null;
    this.zzbym = paramanw;
    this.zzbyn = paramzzn;
    this.zzbyo = paramqe;
    this.zzbyx = paramzzb;
    this.zzbyp = paramzzd;
    this.zzbyq = paramString2;
    this.zzbyr = paramBoolean;
    this.zzbys = paramString1;
    this.zzbyt = paramzzt;
    this.orientation = paramInt;
    this.zzbyu = 3;
    this.url = null;
    this.zzacr = paramzzang;
    this.zzbyv = null;
    this.zzbyw = null;
  }
  
  public AdOverlayInfoParcel(anw paramanw, zzn paramzzn, zzt paramzzt, qe paramqe, int paramInt, zzang paramzzang, String paramString, zzaq paramzzaq)
  {
    this.zzbyl = null;
    this.zzbym = paramanw;
    this.zzbyn = paramzzn;
    this.zzbyo = paramqe;
    this.zzbyx = null;
    this.zzbyp = null;
    this.zzbyq = null;
    this.zzbyr = false;
    this.zzbys = null;
    this.zzbyt = paramzzt;
    this.orientation = paramInt;
    this.zzbyu = 1;
    this.url = null;
    this.zzacr = paramzzang;
    this.zzbyv = paramString;
    this.zzbyw = paramzzaq;
  }
  
  public AdOverlayInfoParcel(anw paramanw, zzn paramzzn, zzt paramzzt, qe paramqe, boolean paramBoolean, int paramInt, zzang paramzzang)
  {
    this.zzbyl = null;
    this.zzbym = paramanw;
    this.zzbyn = paramzzn;
    this.zzbyo = paramqe;
    this.zzbyx = null;
    this.zzbyp = null;
    this.zzbyq = null;
    this.zzbyr = paramBoolean;
    this.zzbys = null;
    this.zzbyt = paramzzt;
    this.orientation = paramInt;
    this.zzbyu = 2;
    this.url = null;
    this.zzacr = paramzzang;
    this.zzbyv = null;
    this.zzbyw = null;
  }
  
  public static void zza(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  public static AdOverlayInfoParcel zzc(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      localBundle.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      AdOverlayInfoParcel localAdOverlayInfoParcel = (AdOverlayInfoParcel)localBundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return localAdOverlayInfoParcel;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, this.zzbyl, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, com.google.android.gms.a.b.a(this.zzbym).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, com.google.android.gms.a.b.a(this.zzbyn).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, com.google.android.gms.a.b.a(this.zzbyo).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, com.google.android.gms.a.b.a(this.zzbyp).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 7, this.zzbyq, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 8, this.zzbyr);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 9, this.zzbys, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 10, com.google.android.gms.a.b.a(this.zzbyt).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 11, this.orientation);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 12, this.zzbyu);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 13, this.url, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 14, this.zzacr, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 16, this.zzbyv, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 17, this.zzbyw, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 18, com.google.android.gms.a.b.a(this.zzbyx).asBinder(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
 * JD-Core Version:    0.7.0.1
 */