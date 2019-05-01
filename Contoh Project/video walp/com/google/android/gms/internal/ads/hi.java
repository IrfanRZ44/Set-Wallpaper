package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.n;

@cm
public final class hi
  implements MediationRewardedVideoAdListener
{
  private final hf a;
  
  public hi(hf paramhf)
  {
    this.a = paramhf;
  }
  
  public final void onAdClicked(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClicked.");
    try
    {
      this.a.f(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClosed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClosed.");
    try
    {
      this.a.e(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdFailedToLoad.");
    try
    {
      this.a.b(b.a(paramMediationRewardedVideoAdAdapter), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLeftApplication(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLeftApplication.");
    try
    {
      this.a.g(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLoaded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLoaded.");
    try
    {
      this.a.b(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdOpened(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdOpened.");
    try
    {
      this.a.c(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onInitializationFailed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onInitializationFailed.");
    try
    {
      this.a.a(b.a(paramMediationRewardedVideoAdAdapter), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onInitializationSucceeded.");
    try
    {
      this.a.a(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onRewarded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, RewardItem paramRewardItem)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onRewarded.");
    if (paramRewardItem != null) {}
    try
    {
      this.a.a(b.a(paramMediationRewardedVideoAdAdapter), new zzaig(paramRewardItem));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    this.a.a(b.a(paramMediationRewardedVideoAdAdapter), new zzaig("", 1));
    return;
  }
  
  public final void onVideoCompleted(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onVideoCompleted.");
    try
    {
      this.a.h(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onVideoStarted(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onVideoStarted.");
    try
    {
      this.a.d(b.a(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzc(Bundle paramBundle)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdMetadataChanged.");
    try
    {
      this.a.a(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hi
 * JD-Core Version:    0.7.0.1
 */