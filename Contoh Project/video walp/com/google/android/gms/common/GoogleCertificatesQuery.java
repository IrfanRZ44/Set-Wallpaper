package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.i.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;

public class GoogleCertificatesQuery
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new f();
  private final String a;
  @Nullable
  private final e.a b;
  private final boolean c;
  
  GoogleCertificatesQuery(String paramString, @Nullable IBinder paramIBinder, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = a(paramIBinder);
    this.c = paramBoolean;
  }
  
  @Nullable
  private static e.a a(@Nullable IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    for (;;)
    {
      a locala;
      try
      {
        locala = i.a.a(paramIBinder).b();
        if (locala == null)
        {
          arrayOfByte = null;
          if (arrayOfByte == null) {
            break label66;
          }
          localm = new m(arrayOfByte);
          return localm;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", localRemoteException);
        return null;
      }
      byte[] arrayOfByte = (byte[])com.google.android.gms.a.b.a(locala);
      continue;
      label66:
      Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
      m localm = null;
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  @Nullable
  public IBinder b()
  {
    if (this.b == null)
    {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      return null;
    }
    return this.b.asBinder();
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, a(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, b(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, c());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleCertificatesQuery
 * JD-Core Version:    0.7.0.1
 */