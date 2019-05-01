package android.support.v4.media;

import android.app.Service;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.f.a;
import android.support.v4.f.j;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat
  extends Service
{
  static final boolean a = Log.isLoggable("MBServiceCompat", 3);
  final a<IBinder, b> b = new a();
  b c;
  final g d = new g();
  MediaSessionCompat.Token e;
  
  public abstract a a(String paramString, int paramInt, Bundle paramBundle);
  
  List<MediaBrowserCompat.MediaItem> a(List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
  {
    if (paramList == null) {
      paramList = null;
    }
    int i;
    int j;
    do
    {
      return paramList;
      i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
      j = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    } while ((i == -1) && (j == -1));
    int k = j * i;
    int m = k + j;
    if ((i < 0) || (j < 1) || (k >= paramList.size())) {
      return Collections.EMPTY_LIST;
    }
    if (m > paramList.size()) {
      m = paramList.size();
    }
    return paramList.subList(k, m);
  }
  
  void a(String paramString, Bundle paramBundle, b paramb, final ResultReceiver paramResultReceiver)
  {
    c local3 = new c(paramString)
    {
      void a(List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (((0x4 & b()) != 0) || (paramAnonymousList == null))
        {
          paramResultReceiver.b(-1, null);
          return;
        }
        Bundle localBundle = new Bundle();
        localBundle.putParcelableArray("search_results", (Parcelable[])paramAnonymousList.toArray(new MediaBrowserCompat.MediaItem[0]));
        paramResultReceiver.b(0, localBundle);
      }
    };
    this.c = paramb;
    a(paramString, paramBundle, local3);
    this.c = null;
    if (!local3.a()) {
      throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + paramString);
    }
  }
  
  public void a(String paramString, Bundle paramBundle, c<List<MediaBrowserCompat.MediaItem>> paramc)
  {
    paramc.a(4);
    paramc.b(null);
  }
  
  void a(final String paramString, final b paramb, final Bundle paramBundle)
  {
    c local1 = new c(paramString)
    {
      void a(List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (MediaBrowserServiceCompat.this.b.get(paramb.c.a()) != paramb)
        {
          if (MediaBrowserServiceCompat.a) {
            Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + paramb.a + " id=" + paramString);
          }
          return;
        }
        if ((0x1 & b()) != 0) {
          paramAnonymousList = MediaBrowserServiceCompat.this.a(paramAnonymousList, paramBundle);
        }
        try
        {
          paramb.c.a(paramString, paramAnonymousList, paramBundle);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + paramString + " package=" + paramb.a);
        }
      }
    };
    this.c = paramb;
    if (paramBundle == null) {
      a(paramString, local1);
    }
    for (;;)
    {
      this.c = null;
      if (local1.a()) {
        break;
      }
      throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + paramb.a + " id=" + paramString);
      a(paramString, local1, paramBundle);
    }
  }
  
  void a(String paramString, b paramb, IBinder paramIBinder, Bundle paramBundle)
  {
    List localList = (List)paramb.e.get(paramString);
    if (localList == null) {}
    for (Object localObject = new ArrayList();; localObject = localList)
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        j localj = (j)localIterator.next();
        if ((paramIBinder == localj.a) && (c.a(paramBundle, (Bundle)localj.b))) {
          return;
        }
      }
      ((List)localObject).add(new j(paramIBinder, paramBundle));
      paramb.e.put(paramString, localObject);
      a(paramString, paramb, paramBundle);
      return;
    }
  }
  
  void a(String paramString, b paramb, final ResultReceiver paramResultReceiver)
  {
    c local2 = new c(paramString)
    {
      void a(MediaBrowserCompat.MediaItem paramAnonymousMediaItem)
      {
        if ((0x2 & b()) != 0)
        {
          paramResultReceiver.b(-1, null);
          return;
        }
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("media_item", paramAnonymousMediaItem);
        paramResultReceiver.b(0, localBundle);
      }
    };
    this.c = paramb;
    b(paramString, local2);
    this.c = null;
    if (!local2.a()) {
      throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + paramString);
    }
  }
  
  public abstract void a(String paramString, c<List<MediaBrowserCompat.MediaItem>> paramc);
  
  public void a(String paramString, c<List<MediaBrowserCompat.MediaItem>> paramc, Bundle paramBundle)
  {
    paramc.a(1);
    a(paramString, paramc);
  }
  
  boolean a(String paramString, int paramInt)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfString[j].equals(paramString)) {
          return true;
        }
      }
    }
  }
  
  boolean a(String paramString, b paramb, IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return paramb.e.remove(paramString) != null;
    }
    List localList = (List)paramb.e.get(paramString);
    boolean bool;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      bool = false;
      while (localIterator.hasNext()) {
        if (paramIBinder == ((j)localIterator.next()).a)
        {
          localIterator.remove();
          bool = true;
        }
      }
      if (localList.size() == 0) {
        paramb.e.remove(paramString);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  void b(String paramString, Bundle paramBundle, b paramb, final ResultReceiver paramResultReceiver)
  {
    c local4 = new c(paramString)
    {
      void a(Bundle paramAnonymousBundle)
      {
        paramResultReceiver.b(0, paramAnonymousBundle);
      }
      
      void b(Bundle paramAnonymousBundle)
      {
        paramResultReceiver.b(-1, paramAnonymousBundle);
      }
    };
    this.c = paramb;
    b(paramString, paramBundle, local4);
    this.c = null;
    if (!local4.a()) {
      throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + paramString + " extras=" + paramBundle);
    }
  }
  
  public void b(String paramString, Bundle paramBundle, c<Bundle> paramc)
  {
    paramc.c(null);
  }
  
  public void b(String paramString, c<MediaBrowserCompat.MediaItem> paramc)
  {
    paramc.a(2);
    paramc.b(null);
  }
  
  public static final class a
  {
    private final String a;
    private final Bundle b;
    
    public String a()
    {
      return this.a;
    }
    
    public Bundle b()
    {
      return this.b;
    }
  }
  
  private class b
    implements IBinder.DeathRecipient
  {
    String a;
    Bundle b;
    MediaBrowserServiceCompat.e c;
    MediaBrowserServiceCompat.a d;
    HashMap<String, List<j<IBinder, Bundle>>> e = new HashMap();
    
    b() {}
    
    public void binderDied()
    {
      MediaBrowserServiceCompat.this.d.post(new Runnable()
      {
        public void run()
        {
          MediaBrowserServiceCompat.this.b.remove(MediaBrowserServiceCompat.b.this.c.a());
        }
      });
    }
  }
  
  public static class c<T>
  {
    private final Object a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    
    c(Object paramObject)
    {
      this.a = paramObject;
    }
    
    void a(int paramInt)
    {
      this.e = paramInt;
    }
    
    void a(T paramT) {}
    
    boolean a()
    {
      return (this.b) || (this.c) || (this.d);
    }
    
    int b()
    {
      return this.e;
    }
    
    void b(Bundle paramBundle)
    {
      throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
    }
    
    public void b(T paramT)
    {
      if ((this.c) || (this.d)) {
        throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
      }
      this.c = true;
      a(paramT);
    }
    
    public void c(Bundle paramBundle)
    {
      if ((this.c) || (this.d)) {
        throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
      }
      this.d = true;
      b(paramBundle);
    }
  }
  
  private class d
  {
    d() {}
    
    public void a(final MediaBrowserServiceCompat.e parame)
    {
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.remove(localIBinder);
          if (localb != null) {
            localb.c.a().unlinkToDeath(localb, 0);
          }
        }
      });
    }
    
    public void a(final MediaBrowserServiceCompat.e parame, final Bundle paramBundle)
    {
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.this.b.remove(localIBinder);
          MediaBrowserServiceCompat.b localb = new MediaBrowserServiceCompat.b(MediaBrowserServiceCompat.this);
          localb.c = parame;
          localb.b = paramBundle;
          MediaBrowserServiceCompat.this.b.put(localIBinder, localb);
          try
          {
            localIBinder.linkToDeath(localb, 0);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            Log.w("MBServiceCompat", "IBinder is already dead.");
          }
        }
      });
    }
    
    public void a(final String paramString, final int paramInt, final Bundle paramBundle, final MediaBrowserServiceCompat.e parame)
    {
      if (!MediaBrowserServiceCompat.this.a(paramString, paramInt)) {
        throw new IllegalArgumentException("Package/uid mismatch: uid=" + paramInt + " package=" + paramString);
      }
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.this.b.remove(localIBinder);
          MediaBrowserServiceCompat.b localb = new MediaBrowserServiceCompat.b(MediaBrowserServiceCompat.this);
          localb.a = paramString;
          localb.b = paramBundle;
          localb.c = parame;
          localb.d = MediaBrowserServiceCompat.this.a(paramString, paramInt, paramBundle);
          if (localb.d == null) {
            Log.i("MBServiceCompat", "No root for client " + paramString + " from service " + getClass().getName());
          }
          for (;;)
          {
            try
            {
              parame.b();
              return;
            }
            catch (RemoteException localRemoteException2)
            {
              Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + paramString);
              return;
            }
            try
            {
              MediaBrowserServiceCompat.this.b.put(localIBinder, localb);
              localIBinder.linkToDeath(localb, 0);
              if (MediaBrowserServiceCompat.this.e != null)
              {
                parame.a(localb.d.a(), MediaBrowserServiceCompat.this.e, localb.d.b());
                return;
              }
            }
            catch (RemoteException localRemoteException1)
            {
              Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + paramString);
              MediaBrowserServiceCompat.this.b.remove(localIBinder);
            }
          }
        }
      });
    }
    
    public void a(final String paramString, final Bundle paramBundle, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.e parame)
    {
      if ((TextUtils.isEmpty(paramString)) || (paramResultReceiver == null)) {
        return;
      }
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.get(localIBinder);
          if (localb == null)
          {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + paramString);
            return;
          }
          MediaBrowserServiceCompat.this.a(paramString, paramBundle, localb, paramResultReceiver);
        }
      });
    }
    
    public void a(final String paramString, final IBinder paramIBinder, final Bundle paramBundle, final MediaBrowserServiceCompat.e parame)
    {
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.get(localIBinder);
          if (localb == null)
          {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + paramString);
            return;
          }
          MediaBrowserServiceCompat.this.a(paramString, localb, paramIBinder, paramBundle);
        }
      });
    }
    
    public void a(final String paramString, final IBinder paramIBinder, final MediaBrowserServiceCompat.e parame)
    {
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.get(localIBinder);
          if (localb == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + paramString);
          }
          while (MediaBrowserServiceCompat.this.a(paramString, localb, paramIBinder)) {
            return;
          }
          Log.w("MBServiceCompat", "removeSubscription called for " + paramString + " which is not subscribed");
        }
      });
    }
    
    public void a(final String paramString, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.e parame)
    {
      if ((TextUtils.isEmpty(paramString)) || (paramResultReceiver == null)) {
        return;
      }
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.get(localIBinder);
          if (localb == null)
          {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + paramString);
            return;
          }
          MediaBrowserServiceCompat.this.a(paramString, localb, paramResultReceiver);
        }
      });
    }
    
    public void b(final MediaBrowserServiceCompat.e parame)
    {
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.remove(localIBinder);
          if (localb != null) {
            localIBinder.unlinkToDeath(localb, 0);
          }
        }
      });
    }
    
    public void b(final String paramString, final Bundle paramBundle, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.e parame)
    {
      if ((TextUtils.isEmpty(paramString)) || (paramResultReceiver == null)) {
        return;
      }
      MediaBrowserServiceCompat.this.d.a(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = parame.a();
          MediaBrowserServiceCompat.b localb = (MediaBrowserServiceCompat.b)MediaBrowserServiceCompat.this.b.get(localIBinder);
          if (localb == null)
          {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + paramString + ", extras=" + paramBundle);
            return;
          }
          MediaBrowserServiceCompat.this.b(paramString, paramBundle, localb, paramResultReceiver);
        }
      });
    }
  }
  
  private static abstract interface e
  {
    public abstract IBinder a();
    
    public abstract void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
    
    public abstract void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle);
    
    public abstract void b();
  }
  
  private static class f
    implements MediaBrowserServiceCompat.e
  {
    final Messenger a;
    
    f(Messenger paramMessenger)
    {
      this.a = paramMessenger;
    }
    
    private void a(int paramInt, Bundle paramBundle)
    {
      Message localMessage = Message.obtain();
      localMessage.what = paramInt;
      localMessage.arg1 = 2;
      localMessage.setData(paramBundle);
      this.a.send(localMessage);
    }
    
    public IBinder a()
    {
      return this.a.getBinder();
    }
    
    public void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      paramBundle.putInt("extra_service_version", 2);
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putParcelable("data_media_session_token", paramToken);
      localBundle.putBundle("data_root_hints", paramBundle);
      a(1, localBundle);
    }
    
    public void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putBundle("data_options", paramBundle);
      if (paramList != null) {
        if (!(paramList instanceof ArrayList)) {
          break label59;
        }
      }
      label59:
      for (ArrayList localArrayList = (ArrayList)paramList;; localArrayList = new ArrayList(paramList))
      {
        localBundle.putParcelableArrayList("data_media_item_list", localArrayList);
        a(3, localBundle);
        return;
      }
    }
    
    public void b()
    {
      a(2, null);
    }
  }
  
  private final class g
    extends Handler
  {
    private final MediaBrowserServiceCompat.d b = new MediaBrowserServiceCompat.d(MediaBrowserServiceCompat.this);
    
    g() {}
    
    public void a(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread())
      {
        paramRunnable.run();
        return;
      }
      post(paramRunnable);
    }
    
    public void handleMessage(Message paramMessage)
    {
      Bundle localBundle = paramMessage.getData();
      switch (paramMessage.what)
      {
      default: 
        Log.w("MBServiceCompat", "Unhandled message: " + paramMessage + "\n  Service version: " + 2 + "\n  Client version: " + paramMessage.arg1);
        return;
      case 1: 
        this.b.a(localBundle.getString("data_package_name"), localBundle.getInt("data_calling_uid"), localBundle.getBundle("data_root_hints"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 2: 
        this.b.a(new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 3: 
        this.b.a(localBundle.getString("data_media_item_id"), BundleCompat.getBinder(localBundle, "data_callback_token"), localBundle.getBundle("data_options"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 4: 
        this.b.a(localBundle.getString("data_media_item_id"), BundleCompat.getBinder(localBundle, "data_callback_token"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 5: 
        this.b.a(localBundle.getString("data_media_item_id"), (ResultReceiver)localBundle.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 6: 
        this.b.a(new MediaBrowserServiceCompat.f(paramMessage.replyTo), localBundle.getBundle("data_root_hints"));
        return;
      case 7: 
        this.b.b(new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      case 8: 
        this.b.a(localBundle.getString("data_search_query"), localBundle.getBundle("data_search_extras"), (ResultReceiver)localBundle.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
        return;
      }
      this.b.b(localBundle.getString("data_custom_action"), localBundle.getBundle("data_custom_action_extras"), (ResultReceiver)localBundle.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.f(paramMessage.replyTo));
    }
    
    public boolean sendMessageAtTime(Message paramMessage, long paramLong)
    {
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      localBundle.putInt("data_calling_uid", Binder.getCallingUid());
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat
 * JD-Core Version:    0.7.0.1
 */