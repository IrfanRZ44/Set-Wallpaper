package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class ConnectionInfo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ConnectionInfo> CREATOR = new d();
  private Bundle a;
  private Feature[] b;
  
  public ConnectionInfo() {}
  
  ConnectionInfo(Bundle paramBundle, Feature[] paramArrayOfFeature)
  {
    this.a = paramBundle;
    this.b = paramArrayOfFeature;
  }
  
  public Bundle a()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a, false);
    b.a(paramParcel, 2, this.b, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ConnectionInfo
 * JD-Core Version:    0.7.0.1
 */