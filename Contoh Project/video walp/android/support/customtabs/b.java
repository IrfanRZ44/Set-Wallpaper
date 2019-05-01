package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

public class b
{
  private final h a;
  private final ComponentName b;
  
  b(h paramh, ComponentName paramComponentName)
  {
    this.a = paramh;
    this.b = paramComponentName;
  }
  
  public static boolean a(Context paramContext, String paramString, d paramd)
  {
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.setPackage(paramString);
    }
    return paramContext.bindService(localIntent, paramd, 33);
  }
  
  public e a(final a parama)
  {
    g.a local1 = new g.a()
    {
      private Handler c = new Handler(Looper.getMainLooper());
      
      public void a(final int paramAnonymousInt, final Uri paramAnonymousUri, final boolean paramAnonymousBoolean, final Bundle paramAnonymousBundle)
      {
        if (parama == null) {
          return;
        }
        this.c.post(new Runnable()
        {
          public void run()
          {
            b.1.this.a.a(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
          }
        });
      }
      
      public void a(final int paramAnonymousInt, final Bundle paramAnonymousBundle)
      {
        if (parama == null) {
          return;
        }
        this.c.post(new Runnable()
        {
          public void run()
          {
            b.1.this.a.a(paramAnonymousInt, paramAnonymousBundle);
          }
        });
      }
      
      public void a(final Bundle paramAnonymousBundle)
      {
        if (parama == null) {
          return;
        }
        this.c.post(new Runnable()
        {
          public void run()
          {
            b.1.this.a.a(paramAnonymousBundle);
          }
        });
      }
      
      public void a(final String paramAnonymousString, final Bundle paramAnonymousBundle)
      {
        if (parama == null) {
          return;
        }
        this.c.post(new Runnable()
        {
          public void run()
          {
            b.1.this.a.a(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
      
      public void b(final String paramAnonymousString, final Bundle paramAnonymousBundle)
      {
        if (parama == null) {
          return;
        }
        this.c.post(new Runnable()
        {
          public void run()
          {
            b.1.this.a.b(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
    };
    try
    {
      boolean bool = this.a.a(local1);
      if (!bool) {
        return null;
      }
      return new e(this.a, local1, this.b);
    }
    catch (RemoteException localRemoteException) {}
    return null;
  }
  
  public boolean a(long paramLong)
  {
    try
    {
      boolean bool = this.a.a(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.b
 * JD-Core Version:    0.7.0.1
 */