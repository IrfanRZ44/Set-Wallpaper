package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class awa
  extends aiz
  implements avy
{
  awa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
  }
  
  public final void a(avk paramavk)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavk);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awa
 * JD-Core Version:    0.7.0.1
 */