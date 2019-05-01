package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzaey
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaey> CREATOR = new ea();
  private final Bundle a;
  private final zzang b;
  private final ApplicationInfo c;
  private final String d;
  private final List<String> e;
  @Nullable
  private final PackageInfo f;
  private final String g;
  private final boolean h;
  private final String i;
  
  public zzaey(Bundle paramBundle, zzang paramzzang, ApplicationInfo paramApplicationInfo, String paramString1, List<String> paramList, @Nullable PackageInfo paramPackageInfo, String paramString2, boolean paramBoolean, String paramString3)
  {
    this.a = paramBundle;
    this.b = paramzzang;
    this.d = paramString1;
    this.c = paramApplicationInfo;
    this.e = paramList;
    this.f = paramPackageInfo;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = paramString3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = b.a(paramParcel);
    b.a(paramParcel, 1, this.a, false);
    b.a(paramParcel, 2, this.b, paramInt, false);
    b.a(paramParcel, 3, this.c, paramInt, false);
    b.a(paramParcel, 4, this.d, false);
    b.b(paramParcel, 5, this.e, false);
    b.a(paramParcel, 6, this.f, paramInt, false);
    b.a(paramParcel, 7, this.g, false);
    b.a(paramParcel, 8, this.h);
    b.a(paramParcel, 9, this.i, false);
    b.a(paramParcel, j);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaey
 * JD-Core Version:    0.7.0.1
 */