package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.lang.reflect.Constructor;
import java.util.Map;

@cm
public final class bcj
  extends bcl
{
  private static final ben b = new ben();
  private Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> a;
  
  private final <NetworkExtrasT extends com.google.ads.mediation.NetworkExtras, ServerParametersT extends MediationServerParameters> bcn d(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString, false, bcj.class.getClassLoader());
      if (com.google.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass))
      {
        com.google.ads.mediation.MediationAdapter localMediationAdapter = (com.google.ads.mediation.MediationAdapter)localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        return new bdn(localMediationAdapter, (com.google.ads.mediation.NetworkExtras)this.a.get(localMediationAdapter.getAdditionalParametersType()));
      }
      if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass)) {
        return new bdi((com.google.android.gms.ads.mediation.MediationAdapter)localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      }
      mk.e(64 + String.valueOf(paramString).length() + "Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable) {}
    return e(paramString);
  }
  
  private final bcn e(String paramString)
  {
    do
    {
      try
      {
        mk.b("Reflection failed, retrying using direct instantiation");
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {
          return new bdi(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        {
          bdi localbdi = new bdi(new AdUrlAdapter());
          return localbdi;
        }
      }
      catch (Throwable localThrowable)
      {
        mk.c(43 + String.valueOf(paramString).length() + "Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
        throw new RemoteException();
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
        return new bdi(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
      }
    } while (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString));
    com.google.ads.mediation.customevent.CustomEventAdapter localCustomEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
    bdn localbdn = new bdn(localCustomEventAdapter, (CustomEventExtras)this.a.get(localCustomEventAdapter.getAdditionalParametersType()));
    return localbdn;
  }
  
  public final bcn a(String paramString)
  {
    return d(paramString);
  }
  
  public final void a(Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> paramMap)
  {
    this.a = paramMap;
  }
  
  public final boolean b(String paramString)
  {
    try
    {
      boolean bool = CustomEvent.class.isAssignableFrom(Class.forName(paramString, false, bcj.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      mk.e(80 + String.valueOf(paramString).length() + "Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }
  
  public final bei c(String paramString)
  {
    return ben.a(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcj
 * JD-Core Version:    0.7.0.1
 */