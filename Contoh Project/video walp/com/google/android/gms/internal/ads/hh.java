package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class hh
  extends aiz
  implements hf
{
  hh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public final void a(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(12, localParcel);
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(1, localParcel);
  }
  
  public final void a(a parama, int paramInt)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeInt(paramInt);
    b(2, localParcel);
  }
  
  public final void a(a parama, zzaig paramzzaig)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzaig);
    b(7, localParcel);
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(3, localParcel);
  }
  
  public final void b(a parama, int paramInt)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeInt(paramInt);
    b(9, localParcel);
  }
  
  public final void c(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(4, localParcel);
  }
  
  public final void d(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(5, localParcel);
  }
  
  public final void e(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(6, localParcel);
  }
  
  public final void f(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(8, localParcel);
  }
  
  public final void g(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(10, localParcel);
  }
  
  public final void h(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(11, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hh
 * JD-Core Version:    0.7.0.1
 */