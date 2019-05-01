package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.formats.NativeAd.Image;

@cm
public final class auq
  extends NativeAd.Image
{
  private final aun a;
  private final Drawable b;
  private final Uri c;
  private final double d;
  
  public auq(aun paramaun)
  {
    this.a = paramaun;
    try
    {
      a locala = this.a.a();
      if (locala == null) {
        break label92;
      }
      localDrawable = (Drawable)b.a(locala);
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        mk.b("", localRemoteException1);
        Drawable localDrawable = null;
      }
    }
    this.b = localDrawable;
    try
    {
      Uri localUri2 = this.a.b();
      localUri1 = localUri2;
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        double d1;
        mk.b("", localRemoteException2);
        Uri localUri1 = null;
      }
    }
    this.c = localUri1;
    d1 = 1.0D;
    try
    {
      double d2 = this.a.c();
      d1 = d2;
    }
    catch (RemoteException localRemoteException3)
    {
      for (;;)
      {
        mk.b("", localRemoteException3);
      }
    }
    this.d = d1;
  }
  
  public final Drawable getDrawable()
  {
    return this.b;
  }
  
  public final double getScale()
  {
    return this.d;
  }
  
  public final Uri getUri()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auq
 * JD-Core Version:    0.7.0.1
 */