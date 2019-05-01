package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@cm
public final class bdo<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  implements MediationBannerListener, MediationInterstitialListener
{
  private final bcq a;
  
  public bdo(bcq parambcq)
  {
    this.a = parambcq;
  }
  
  public final void onClick(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    mk.b("Adapter called onClick.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdp(this));
      return;
    }
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onDismissScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    mk.b("Adapter called onDismissScreen.");
    aos.a();
    if (!lz.b())
    {
      mk.e("#008 Must be called on the main UI thread.");
      lz.a.post(new bds(this));
      return;
    }
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onDismissScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    mk.b("Adapter called onDismissScreen.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdx(this));
      return;
    }
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    String str = String.valueOf(paramErrorCode);
    mk.b(47 + String.valueOf(str).length() + "Adapter called onFailedToReceiveAd with error. " + str);
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdt(this, paramErrorCode));
      return;
    }
    try
    {
      this.a.a(beb.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    String str = String.valueOf(paramErrorCode);
    mk.b(47 + String.valueOf(str).length() + "Adapter called onFailedToReceiveAd with error " + str + ".");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdz(this, paramErrorCode));
      return;
    }
    try
    {
      this.a.a(beb.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onLeaveApplication(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    mk.b("Adapter called onLeaveApplication.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdu(this));
      return;
    }
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
  
  public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    mk.b("Adapter called onLeaveApplication.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bea(this));
      return;
    }
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
  
  public final void onPresentScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    mk.b("Adapter called onPresentScreen.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdv(this));
      return;
    }
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
  
  public final void onPresentScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    mk.b("Adapter called onPresentScreen.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdq(this));
      return;
    }
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
  
  public final void onReceivedAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    mk.b("Adapter called onReceivedAd.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdw(this));
      return;
    }
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onReceivedAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    mk.b("Adapter called onReceivedAd.");
    aos.a();
    if (!lz.b())
    {
      mk.d("#008 Must be called on the main UI thread.", null);
      lz.a.post(new bdr(this));
      return;
    }
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdo
 * JD-Core Version:    0.7.0.1
 */