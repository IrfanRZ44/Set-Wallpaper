package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class ast
  extends aiz
  implements asr
{
  ast(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
  }
  
  public final String a()
  {
    Parcel localParcel = a(1, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(3, localParcel);
  }
  
  public final String b()
  {
    Parcel localParcel = a(2, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void c()
  {
    b(4, i_());
  }
  
  public final void d()
  {
    b(5, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ast
 * JD-Core Version:    0.7.0.1
 */