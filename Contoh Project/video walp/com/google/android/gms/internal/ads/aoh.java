package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

@cm
public class aoh
{
  @GuardedBy("mLock")
  private apv a;
  private final Object b = new Object();
  private final aoa c;
  private final anz d;
  private final aqw e;
  private final awo f;
  private final gl g;
  private final q h;
  private final awp i;
  
  public aoh(aoa paramaoa, anz paramanz, aqw paramaqw, awo paramawo, gl paramgl, q paramq, awp paramawp)
  {
    this.c = paramaoa;
    this.d = paramanz;
    this.e = paramaqw;
    this.f = paramawo;
    this.g = paramgl;
    this.h = paramq;
    this.i = paramawp;
  }
  
  private static apv a()
  {
    try
    {
      Object localObject = aoh.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
      if (!(localObject instanceof IBinder))
      {
        mk.e("ClientApi class is not an instance of IBinder");
        return null;
      }
      apv localapv = apw.asInterface((IBinder)localObject);
      return localapv;
    }
    catch (Exception localException)
    {
      mk.c("Failed to instantiate ClientApi class.", localException);
    }
    return null;
  }
  
  static <T> T a(Context paramContext, boolean paramBoolean, a<T> parama)
  {
    int j = 1;
    int k;
    if (paramBoolean)
    {
      k = j;
      if (k == 0)
      {
        aos.a();
        if (!lz.c(paramContext))
        {
          mk.b("Google Play Services is not available");
          k = j;
        }
      }
      aos.a();
      int m = lz.e(paramContext);
      aos.a();
      if (m <= lz.d(paramContext)) {
        break label130;
      }
    }
    for (;;)
    {
      asa.a(paramContext);
      arq localarq = asa.de;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        j = 0;
      }
      Object localObject;
      if (j != 0)
      {
        localObject = parama.b();
        if (localObject == null) {
          localObject = parama.c();
        }
      }
      do
      {
        return localObject;
        k = 0;
        break;
        localObject = parama.c();
      } while (localObject != null);
      return parama.b();
      label130:
      j = k;
    }
  }
  
  private static void a(Context paramContext, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", "no_ads_fallback");
    localBundle.putString("flow", paramString);
    aos.a().a(paramContext, null, "gmob-apps", localBundle, true);
  }
  
  private final apv b()
  {
    synchronized (this.b)
    {
      if (this.a == null) {
        this.a = a();
      }
      apv localapv = this.a;
      return localapv;
    }
  }
  
  public final ape a(Context paramContext, String paramString, bck parambck)
  {
    return (ape)a(paramContext, false, new aol(this, paramContext, paramString, parambck));
  }
  
  public final aus a(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    return (aus)a(paramContext, false, new aon(this, paramFrameLayout1, paramFrameLayout2, paramContext));
  }
  
  public final aux a(View paramView, HashMap<String, View> paramHashMap1, HashMap<String, View> paramHashMap2)
  {
    return (aux)a(paramView.getContext(), false, new aoo(this, paramView, paramHashMap1, paramHashMap2));
  }
  
  public final r a(Activity paramActivity)
  {
    boolean bool = false;
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
      mk.c("useClientJar flag not found in activity intent extras.");
    }
    for (;;)
    {
      return (r)a(paramActivity, bool, new aor(this, paramActivity));
      bool = localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    }
  }
  
  abstract class a<T>
  {
    a() {}
    
    protected abstract T a();
    
    protected abstract T a(apv paramapv);
    
    protected final T b()
    {
      apv localapv = aoh.a(aoh.this);
      if (localapv == null)
      {
        mk.e("ClientApi class cannot be loaded.");
        return null;
      }
      try
      {
        Object localObject = a(localapv);
        return localObject;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Cannot invoke local loader using ClientApi class", localRemoteException);
      }
      return null;
    }
    
    protected final T c()
    {
      try
      {
        Object localObject = a();
        return localObject;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Cannot invoke remote loader", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoh
 * JD-Core Version:    0.7.0.1
 */