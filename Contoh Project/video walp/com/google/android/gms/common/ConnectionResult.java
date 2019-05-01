package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConnectionResult
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ConnectionResult> CREATOR = new b();
  public static final ConnectionResult a = new ConnectionResult(0);
  private final int b;
  private final int c;
  private final PendingIntent d;
  private final String e;
  
  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramPendingIntent;
    this.e = paramString;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 31 + "UNKNOWN_ERROR_CODE(" + paramInt + ")";
    case 0: 
      return "SUCCESS";
    case 1: 
      return "SERVICE_MISSING";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 7: 
      return "NETWORK_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 9: 
      return "SERVICE_INVALID";
    case 10: 
      return "DEVELOPER_ERROR";
    case 11: 
      return "LICENSE_CHECK_FAILED";
    case 13: 
      return "CANCELED";
    case 14: 
      return "TIMEOUT";
    case 15: 
      return "INTERRUPTED";
    case 16: 
      return "API_UNAVAILABLE";
    case 17: 
      return "SIGN_IN_FAILED";
    case 18: 
      return "SERVICE_UPDATING";
    case 19: 
      return "SERVICE_MISSING_PERMISSION";
    case 20: 
      return "RESTRICTED_PROFILE";
    case 21: 
      return "API_VERSION_UPDATE_REQUIRED";
    case 1500: 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    case 99: 
      return "UNFINISHED";
    }
    return "UNKNOWN";
  }
  
  public final boolean a()
  {
    return this.c == 0;
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final PendingIntent c()
  {
    return this.d;
  }
  
  public final String d()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ConnectionResult localConnectionResult;
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult)) {
        return false;
      }
      localConnectionResult = (ConnectionResult)paramObject;
    } while ((this.c == localConnectionResult.c) && (m.a(this.d, localConnectionResult.d)) && (m.a(this.e, localConnectionResult.e)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.c);
    arrayOfObject[1] = this.d;
    arrayOfObject[2] = this.e;
    return m.a(arrayOfObject);
  }
  
  public final String toString()
  {
    return m.a(this).a("statusCode", a(this.c)).a("resolution", this.d).a("message", this.e).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, this.b);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, b());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, c(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, d(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.7.0.1
 */