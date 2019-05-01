package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ads.cm;

@cm
public final class zzc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzc> CREATOR = new zzb();
  private final String a;
  private final String b;
  public final Intent intent;
  public final String mimeType;
  public final String packageName;
  public final String url;
  public final String zzbxj;
  public final String zzbxk;
  
  public zzc(Intent paramIntent)
  {
    this(null, null, null, null, null, null, null, paramIntent);
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    this.a = paramString1;
    this.url = paramString2;
    this.mimeType = paramString3;
    this.packageName = paramString4;
    this.zzbxj = paramString5;
    this.zzbxk = paramString6;
    this.b = paramString7;
    this.intent = paramIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.url, false);
    b.a(paramParcel, 4, this.mimeType, false);
    b.a(paramParcel, 5, this.packageName, false);
    b.a(paramParcel, 6, this.zzbxj, false);
    b.a(paramParcel, 7, this.zzbxk, false);
    b.a(paramParcel, 8, this.b, false);
    b.a(paramParcel, 9, this.intent, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzc
 * JD-Core Version:    0.7.0.1
 */