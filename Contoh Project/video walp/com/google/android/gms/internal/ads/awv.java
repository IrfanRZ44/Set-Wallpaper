package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

public final class awv
  extends awc
{
  private final OnPublisherAdViewLoadedListener a;
  
  public awv(OnPublisherAdViewLoadedListener paramOnPublisherAdViewLoadedListener)
  {
    this.a = paramOnPublisherAdViewLoadedListener;
  }
  
  public final void a(apj paramapj, a parama)
  {
    if ((paramapj == null) || (parama == null)) {
      return;
    }
    PublisherAdView localPublisherAdView = new PublisherAdView((Context)b.a(parama));
    for (;;)
    {
      try
      {
        if ((paramapj.zzbx() instanceof any))
        {
          any localany = (any)paramapj.zzbx();
          if (localany == null) {
            continue;
          }
          localAdListener = localany.g();
          localPublisherAdView.setAdListener(localAdListener);
        }
      }
      catch (RemoteException localRemoteException1)
      {
        AdListener localAdListener;
        mk.b("", localRemoteException1);
        continue;
        AppEventListener localAppEventListener = null;
        continue;
      }
      try
      {
        if ((paramapj.zzbw() instanceof aog))
        {
          aog localaog = (aog)paramapj.zzbw();
          if (localaog == null) {
            continue;
          }
          localAppEventListener = localaog.a();
          localPublisherAdView.setAppEventListener(localAppEventListener);
        }
      }
      catch (RemoteException localRemoteException2)
      {
        mk.b("", localRemoteException2);
        continue;
      }
      lz.a.post(new aww(this, localPublisherAdView, paramapj));
      return;
      localAdListener = null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awv
 * JD-Core Version:    0.7.0.1
 */