package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class f
{
  private final g a;
  private final a b;
  
  f(g paramg)
  {
    this.a = paramg;
    this.b = new a()
    {
      public void a(int paramAnonymousInt, Uri paramAnonymousUri, boolean paramAnonymousBoolean, Bundle paramAnonymousBundle)
      {
        try
        {
          f.a(f.this).a(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void a(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        try
        {
          f.a(f.this).a(paramAnonymousInt, paramAnonymousBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void a(Bundle paramAnonymousBundle)
      {
        try
        {
          f.a(f.this).a(paramAnonymousBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void a(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        try
        {
          f.a(f.this).a(paramAnonymousString, paramAnonymousBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void b(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        try
        {
          f.a(f.this).b(paramAnonymousString, paramAnonymousBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
    };
  }
  
  IBinder a()
  {
    return this.a.asBinder();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {
      return false;
    }
    return ((f)paramObject).a().equals(this.a.asBinder());
  }
  
  public int hashCode()
  {
    return a().hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.f
 * JD-Core Version:    0.7.0.1
 */