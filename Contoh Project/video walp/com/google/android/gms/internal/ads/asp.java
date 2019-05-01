package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;

@cm
public final class asp
  implements CustomRenderedAd
{
  private final asr a;
  
  public asp(asr paramasr)
  {
    this.a = paramasr;
  }
  
  public final String getBaseUrl()
  {
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return null;
  }
  
  public final String getContent()
  {
    try
    {
      String str = this.a.b();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return null;
  }
  
  public final void onAdRendered(View paramView)
  {
    try
    {
      asr localasr = this.a;
      if (paramView != null) {}
      for (a locala = b.a(paramView);; locala = null)
      {
        localasr.a(locala);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void recordClick()
  {
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void recordImpression()
  {
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asp
 * JD-Core Version:    0.7.0.1
 */