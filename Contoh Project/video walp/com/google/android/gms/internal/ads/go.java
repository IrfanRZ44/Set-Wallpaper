package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@cm
public final class go
  implements RewardedVideoAd
{
  private final gb a;
  private final Context b;
  private final Object c = new Object();
  private final gm d = new gm(null);
  private String e;
  
  public go(Context paramContext, gb paramgb)
  {
    this.a = paramgb;
    this.b = paramContext;
  }
  
  private final void a(String paramString, aqn paramaqn)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a(new zzahk(aoe.a(this.b, paramaqn), paramString));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void destroy()
  {
    destroy(null);
  }
  
  public final void destroy(Context paramContext)
  {
    synchronized (this.c)
    {
      this.d.a(null);
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.c(b.a(paramContext));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final String getMediationAdapterClassName()
  {
    try
    {
      if (this.a != null)
      {
        String str = this.a.g();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return null;
  }
  
  public final RewardedVideoAdListener getRewardedVideoAdListener()
  {
    synchronized (this.c)
    {
      RewardedVideoAdListener localRewardedVideoAdListener = this.d.g();
      return localRewardedVideoAdListener;
    }
  }
  
  public final String getUserId()
  {
    synchronized (this.c)
    {
      String str = this.e;
      return str;
    }
  }
  
  public final boolean isLoaded()
  {
    boolean bool;
    synchronized (this.c)
    {
      if (this.a == null) {
        return false;
      }
    }
    return false;
  }
  
  public final void loadAd(String paramString, AdRequest paramAdRequest)
  {
    a(paramString, paramAdRequest.zzay());
  }
  
  public final void loadAd(String paramString, PublisherAdRequest paramPublisherAdRequest)
  {
    a(paramString, paramPublisherAdRequest.zzay());
  }
  
  public final void pause()
  {
    pause(null);
  }
  
  public final void pause(Context paramContext)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a(b.a(paramContext));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void resume()
  {
    resume(null);
  }
  
  public final void resume(Context paramContext)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.b(b.a(paramContext));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      gb localgb = this.a;
      if (localgb != null) {}
      try
      {
        this.a.a(paramBoolean);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          mk.d("#007 Could not call remote method.", localRemoteException);
        }
      }
    }
  }
  
  public final void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    synchronized (this.c)
    {
      this.d.a(paramRewardedVideoAdListener);
      gb localgb = this.a;
      if (localgb != null) {}
      try
      {
        this.a.a(this.d);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          mk.d("#007 Could not call remote method.", localRemoteException);
        }
      }
    }
  }
  
  public final void setUserId(String paramString)
  {
    synchronized (this.c)
    {
      this.e = paramString;
      gb localgb = this.a;
      if (localgb != null) {}
      try
      {
        this.a.a(paramString);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          mk.d("#007 Could not call remote method.", localRemoteException);
        }
      }
    }
  }
  
  public final void show()
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a();
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.go
 * JD-Core Version:    0.7.0.1
 */