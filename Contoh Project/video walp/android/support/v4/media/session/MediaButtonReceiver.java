package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver
  extends BroadcastReceiver
{
  private static ComponentName a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString);
    localIntent.setPackage(paramContext.getPackageName());
    List localList = localPackageManager.queryIntentServices(localIntent, 0);
    if (localList.size() == 1)
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localList.get(0);
      return new ComponentName(localResolveInfo.serviceInfo.packageName, localResolveInfo.serviceInfo.name);
    }
    if (localList.isEmpty()) {
      return null;
    }
    throw new IllegalStateException("Expected 1 service that handles " + paramString + ", found " + localList.size());
  }
  
  private static void a(Context paramContext, Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramContext.startForegroundService(paramIntent);
      return;
    }
    paramContext.startService(paramIntent);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (!"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) || (!paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + paramIntent);
      return;
    }
    ComponentName localComponentName1 = a(paramContext, "android.intent.action.MEDIA_BUTTON");
    if (localComponentName1 != null)
    {
      paramIntent.setComponent(localComponentName1);
      a(paramContext, paramIntent);
      return;
    }
    ComponentName localComponentName2 = a(paramContext, "android.media.browse.MediaBrowserService");
    if (localComponentName2 != null)
    {
      BroadcastReceiver.PendingResult localPendingResult = goAsync();
      Context localContext = paramContext.getApplicationContext();
      a locala = new a(localContext, paramIntent, localPendingResult);
      MediaBrowserCompat localMediaBrowserCompat = new MediaBrowserCompat(localContext, localComponentName2, locala, null);
      locala.a(localMediaBrowserCompat);
      localMediaBrowserCompat.a();
      return;
    }
    throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
  }
  
  private static class a
    extends MediaBrowserCompat.b
  {
    private final Context c;
    private final Intent d;
    private final BroadcastReceiver.PendingResult e;
    private MediaBrowserCompat f;
    
    a(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
    {
      this.c = paramContext;
      this.d = paramIntent;
      this.e = paramPendingResult;
    }
    
    private void d()
    {
      this.f.b();
      this.e.finish();
    }
    
    public void a()
    {
      try
      {
        new MediaControllerCompat(this.c, this.f.c()).a((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        d();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Log.e("MediaButtonReceiver", "Failed to create a media controller", localRemoteException);
        }
      }
    }
    
    void a(MediaBrowserCompat paramMediaBrowserCompat)
    {
      this.f = paramMediaBrowserCompat;
    }
    
    public void b()
    {
      d();
    }
    
    public void c()
    {
      d();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaButtonReceiver
 * JD-Core Version:    0.7.0.1
 */