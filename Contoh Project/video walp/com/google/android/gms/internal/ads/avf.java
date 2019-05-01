package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cm
public final class avf
  extends NativeAppInstallAd
{
  private final avc a;
  private final List<NativeAd.Image> b = new ArrayList();
  private final auq c;
  private final VideoController d = new VideoController();
  private final NativeAd.AdChoicesInfo e;
  
  public avf(avc paramavc)
  {
    this.a = paramavc;
    try
    {
      List localList = this.a.b();
      IBinder localIBinder;
      Object localObject3;
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = localIterator.next();
          if (!(localObject2 instanceof IBinder)) {
            break label254;
          }
          localIBinder = (IBinder)localObject2;
          if (localIBinder == null) {
            break label254;
          }
          IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
          if (!(localIInterface instanceof aun)) {
            break label236;
          }
          localObject3 = (aun)localIInterface;
          if (localObject3 != null) {
            this.b.add(new auq((aun)localObject3));
          }
        }
      }
      try
      {
        localaun = this.a.d();
        if (localaun != null) {
          localauq = new auq(localaun);
        }
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          mk.b("", localRemoteException2);
          auq localauq = null;
        }
      }
    }
    catch (RemoteException localRemoteException1)
    {
      mk.b("", localRemoteException1);
    }
    for (;;)
    {
      aun localaun;
      this.c = localauq;
      try
      {
        auj localauj = this.a.r();
        localObject1 = null;
        if (localauj != null)
        {
          aum localaum = new aum(this.a.r());
          localObject1 = localaum;
        }
      }
      catch (RemoteException localRemoteException3)
      {
        for (;;)
        {
          aup localaup;
          mk.b("", localRemoteException3);
          Object localObject1 = null;
        }
      }
      this.e = localObject1;
      return;
      label236:
      localaup = new aup(localIBinder);
      localObject3 = localaup;
      break;
      label254:
      localObject3 = null;
      break;
      localauq = null;
    }
  }
  
  private final a b()
  {
    try
    {
      a locala = this.a.j();
      return locala;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final void destroy()
  {
    try
    {
      this.a.s();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
  
  public final NativeAd.AdChoicesInfo getAdChoicesInfo()
  {
    return this.e;
  }
  
  public final CharSequence getBody()
  {
    try
    {
      String str = this.a.c();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence getCallToAction()
  {
    try
    {
      String str = this.a.e();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final Bundle getExtras()
  {
    try
    {
      Bundle localBundle = this.a.n();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence getHeadline()
  {
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.c;
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.b;
  }
  
  public final CharSequence getMediationAdapterClassName()
  {
    try
    {
      String str = this.a.q();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence getPrice()
  {
    try
    {
      String str = this.a.h();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final Double getStarRating()
  {
    try
    {
      double d1 = this.a.f();
      if (d1 == -1.0D) {
        return null;
      }
      Double localDouble = Double.valueOf(d1);
      return localDouble;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence getStore()
  {
    try
    {
      String str = this.a.g();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final VideoController getVideoController()
  {
    try
    {
      if (this.a.i() != null) {
        this.d.zza(this.a.i());
      }
      return this.d;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Exception occurred while getting video controller", localRemoteException);
      }
    }
  }
  
  public final void performClick(Bundle paramBundle)
  {
    try
    {
      this.a.a(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
  
  public final boolean recordImpression(Bundle paramBundle)
  {
    try
    {
      boolean bool = this.a.b(paramBundle);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return false;
  }
  
  public final void reportTouchEvent(Bundle paramBundle)
  {
    try
    {
      this.a.c(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avf
 * JD-Core Version:    0.7.0.1
 */