package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class p
{
  private static final Object a = new Object();
  @GuardedBy("sLock")
  private static boolean b = false;
  @GuardedBy("sLock")
  private static boolean c = false;
  private sw d;
  
  private final void c(Context paramContext)
  {
    synchronized (a)
    {
      arq localarq = asa.dg;
      if (((Boolean)aos.f().a(localarq)).booleanValue())
      {
        boolean bool = c;
        if (bool) {}
      }
      try
      {
        c = true;
        this.d = sx.a(DynamiteModule.a(paramContext, DynamiteModule.a, "com.google.android.gms.ads.dynamite").a("com.google.android.gms.ads.omid.DynamiteOmid"));
        return;
      }
      catch (DynamiteModule.a locala)
      {
        for (;;)
        {
          mk.d("#007 Could not call remote method.", locala);
        }
      }
    }
  }
  
  public final a a(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4)
  {
    a locala;
    synchronized (a)
    {
      arq localarq = asa.dg;
      if ((!((Boolean)aos.f().a(localarq)).booleanValue()) || (!b)) {
        return null;
      }
    }
  }
  
  public final void a(a parama)
  {
    synchronized (a)
    {
      arq localarq = asa.dg;
      if ((!((Boolean)aos.f().a(localarq)).booleanValue()) || (!b)) {
        return;
      }
    }
    try
    {
      this.d.b(parama);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (NullPointerException localNullPointerException)
    {
      label52:
      break label52;
    }
  }
  
  public final void a(a parama, View paramView)
  {
    synchronized (a)
    {
      arq localarq = asa.dg;
      if ((!((Boolean)aos.f().a(localarq)).booleanValue()) || (!b)) {
        return;
      }
    }
    try
    {
      this.d.a(parama, b.a(paramView));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (NullPointerException localNullPointerException)
    {
      label56:
      break label56;
    }
  }
  
  public final boolean a(Context paramContext)
  {
    synchronized (a)
    {
      arq localarq = asa.dg;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
        return false;
      }
      if (b) {
        return true;
      }
    }
    try
    {
      c(paramContext);
      boolean bool = this.d.a(b.a(paramContext));
      b = bool;
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Throwable localThrowable;
      break label77;
    }
    catch (NullPointerException localNullPointerException)
    {
      label77:
      break label77;
    }
    mk.d("#007 Could not call remote method.", localThrowable);
    return false;
  }
  
  public final String b(Context paramContext)
  {
    arq localarq = asa.dg;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return null;
    }
    try
    {
      c(paramContext);
      String str1 = String.valueOf(this.d.a());
      if (str1.length() != 0) {
        return "a.".concat(str1);
      }
      String str2 = new String("a.");
      return str2;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      label72:
      break label72;
    }
  }
  
  public final void b(a parama)
  {
    synchronized (a)
    {
      arq localarq = asa.dg;
      if ((!((Boolean)aos.f().a(localarq)).booleanValue()) || (!b)) {
        return;
      }
    }
    try
    {
      this.d.c(parama);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (NullPointerException localNullPointerException)
    {
      label52:
      break label52;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.p
 * JD-Core Version:    0.7.0.1
 */