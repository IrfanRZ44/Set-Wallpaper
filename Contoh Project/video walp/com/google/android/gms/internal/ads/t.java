package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class t
  extends aiz
  implements r
{
  t(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    ajb.a(localParcel, paramIntent);
    b(12, localParcel);
  }
  
  public final void onBackPressed()
  {
    b(10, i_());
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(1, localParcel);
  }
  
  public final void onDestroy()
  {
    b(8, i_());
  }
  
  public final void onPause()
  {
    b(5, i_());
  }
  
  public final void onRestart()
  {
    b(2, i_());
  }
  
  public final void onResume()
  {
    b(4, i_());
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramBundle);
    Parcel localParcel2 = a(6, localParcel1);
    if (localParcel2.readInt() != 0) {
      paramBundle.readFromParcel(localParcel2);
    }
    localParcel2.recycle();
  }
  
  public final void onStart()
  {
    b(3, i_());
  }
  
  public final void onStop()
  {
    b(7, i_());
  }
  
  public final void zzax()
  {
    b(9, i_());
  }
  
  public final boolean zznj()
  {
    Parcel localParcel = a(11, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void zzo(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(13, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.t
 * JD-Core Version:    0.7.0.1
 */