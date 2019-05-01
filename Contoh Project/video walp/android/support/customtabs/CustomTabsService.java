package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.v4.f.a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService
  extends Service
{
  private final Map<IBinder, IBinder.DeathRecipient> a = new a();
  private h.a b = new h.a()
  {
    public int a(g paramAnonymousg, String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.a(new f(paramAnonymousg), paramAnonymousString, paramAnonymousBundle);
    }
    
    public Bundle a(String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.a(paramAnonymousString, paramAnonymousBundle);
    }
    
    public boolean a(long paramAnonymousLong)
    {
      return CustomTabsService.this.a(paramAnonymousLong);
    }
    
    public boolean a(g paramAnonymousg)
    {
      final f localf = new f(paramAnonymousg);
      try
      {
        IBinder.DeathRecipient local1 = new IBinder.DeathRecipient()
        {
          public void binderDied()
          {
            CustomTabsService.this.a(localf);
          }
        };
        synchronized (CustomTabsService.a(CustomTabsService.this))
        {
          paramAnonymousg.asBinder().linkToDeath(local1, 0);
          CustomTabsService.a(CustomTabsService.this).put(paramAnonymousg.asBinder(), local1);
          boolean bool = CustomTabsService.this.b(localf);
          return bool;
        }
        return false;
      }
      catch (RemoteException localRemoteException) {}
    }
    
    public boolean a(g paramAnonymousg, int paramAnonymousInt, Uri paramAnonymousUri, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.a(new f(paramAnonymousg), paramAnonymousInt, paramAnonymousUri, paramAnonymousBundle);
    }
    
    public boolean a(g paramAnonymousg, Uri paramAnonymousUri)
    {
      return CustomTabsService.this.a(new f(paramAnonymousg), paramAnonymousUri);
    }
    
    public boolean a(g paramAnonymousg, Uri paramAnonymousUri, Bundle paramAnonymousBundle, List<Bundle> paramAnonymousList)
    {
      return CustomTabsService.this.a(new f(paramAnonymousg), paramAnonymousUri, paramAnonymousBundle, paramAnonymousList);
    }
    
    public boolean a(g paramAnonymousg, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.a(new f(paramAnonymousg), paramAnonymousBundle);
    }
  };
  
  protected abstract int a(f paramf, String paramString, Bundle paramBundle);
  
  protected abstract Bundle a(String paramString, Bundle paramBundle);
  
  protected abstract boolean a(long paramLong);
  
  protected boolean a(f paramf)
  {
    try
    {
      synchronized (this.a)
      {
        IBinder localIBinder = paramf.a();
        localIBinder.unlinkToDeath((IBinder.DeathRecipient)this.a.get(localIBinder), 0);
        this.a.remove(localIBinder);
        return true;
      }
      return false;
    }
    catch (NoSuchElementException localNoSuchElementException) {}
  }
  
  protected abstract boolean a(f paramf, int paramInt, Uri paramUri, Bundle paramBundle);
  
  protected abstract boolean a(f paramf, Uri paramUri);
  
  protected abstract boolean a(f paramf, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  protected abstract boolean a(f paramf, Bundle paramBundle);
  
  protected abstract boolean b(f paramf);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.CustomTabsService
 * JD-Core Version:    0.7.0.1
 */