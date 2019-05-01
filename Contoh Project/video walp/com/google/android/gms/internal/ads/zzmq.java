package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzmq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzmq> CREATOR = new ari();
  public final String a;
  
  public zzmq(SearchAdRequest paramSearchAdRequest)
  {
    this.a = paramSearchAdRequest.getQuery();
  }
  
  zzmq(String paramString)
  {
    this.a = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 15, this.a, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzmq
 * JD-Core Version:    0.7.0.1
 */