package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class s
  extends aja
  implements r
{
  public s()
  {
    super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static r zzu(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    if ((localIInterface instanceof r)) {
      return (r)localIInterface;
    }
    return new t(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      onCreate((Bundle)ajb.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      onRestart();
      paramParcel2.writeNoException();
      continue;
      onStart();
      paramParcel2.writeNoException();
      continue;
      onResume();
      paramParcel2.writeNoException();
      continue;
      onPause();
      paramParcel2.writeNoException();
      continue;
      Bundle localBundle = (Bundle)ajb.a(paramParcel1, Bundle.CREATOR);
      onSaveInstanceState(localBundle);
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      onStop();
      paramParcel2.writeNoException();
      continue;
      onDestroy();
      paramParcel2.writeNoException();
      continue;
      zzax();
      paramParcel2.writeNoException();
      continue;
      onBackPressed();
      paramParcel2.writeNoException();
      continue;
      boolean bool = zznj();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      onActivityResult(paramParcel1.readInt(), paramParcel1.readInt(), (Intent)ajb.a(paramParcel1, Intent.CREATOR));
      paramParcel2.writeNoException();
      continue;
      zzo(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.s
 * JD-Core Version:    0.7.0.1
 */