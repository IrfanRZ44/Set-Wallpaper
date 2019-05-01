package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class MediaBrowserCompat
{
  static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
  private final e b;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, b paramb, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      this.b = new h(paramContext, paramComponentName, paramb, paramBundle);
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      this.b = new g(paramContext, paramComponentName, paramb, paramBundle);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.b = new f(paramContext, paramComponentName, paramb, paramBundle);
      return;
    }
    this.b = new i(paramContext, paramComponentName, paramb, paramBundle);
  }
  
  public void a()
  {
    this.b.d();
  }
  
  public void b()
  {
    this.b.e();
  }
  
  public MediaSessionCompat.Token c()
  {
    return this.b.f();
  }
  
  private static class CustomActionResultReceiver
    extends ResultReceiver
  {
    private final String d;
    private final Bundle e;
    private final MediaBrowserCompat.c f;
    
    protected void a(int paramInt, Bundle paramBundle)
    {
      if (this.f == null) {
        return;
      }
      switch (paramInt)
      {
      default: 
        Log.w("MediaBrowserCompat", "Unknown result code: " + paramInt + " (extras=" + this.e + ", resultData=" + paramBundle + ")");
        return;
      case 1: 
        this.f.a(this.d, this.e, paramBundle);
        return;
      case 0: 
        this.f.b(this.d, this.e, paramBundle);
        return;
      }
      this.f.c(this.d, this.e, paramBundle);
    }
  }
  
  private static class ItemReceiver
    extends ResultReceiver
  {
    private final String d;
    private final MediaBrowserCompat.d e;
    
    protected void a(int paramInt, Bundle paramBundle)
    {
      if (paramBundle != null) {
        paramBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      }
      if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("media_item")))
      {
        this.e.a(this.d);
        return;
      }
      Parcelable localParcelable = paramBundle.getParcelable("media_item");
      if ((localParcelable == null) || ((localParcelable instanceof MediaBrowserCompat.MediaItem)))
      {
        this.e.a((MediaBrowserCompat.MediaItem)localParcelable);
        return;
      }
      this.e.a(this.d);
    }
  }
  
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator()
    {
      public MediaBrowserCompat.MediaItem a(Parcel paramAnonymousParcel)
      {
        return new MediaBrowserCompat.MediaItem(paramAnonymousParcel);
      }
      
      public MediaBrowserCompat.MediaItem[] a(int paramAnonymousInt)
      {
        return new MediaBrowserCompat.MediaItem[paramAnonymousInt];
      }
    };
    private final int a;
    private final MediaDescriptionCompat b;
    
    MediaItem(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
      this.b = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (paramMediaDescriptionCompat == null) {
        throw new IllegalArgumentException("description cannot be null");
      }
      if (TextUtils.isEmpty(paramMediaDescriptionCompat.a())) {
        throw new IllegalArgumentException("description must have a non-empty media id");
      }
      this.a = paramInt;
      this.b = paramMediaDescriptionCompat;
    }
    
    public static MediaItem a(Object paramObject)
    {
      if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
        return null;
      }
      int i = a.c.a(paramObject);
      return new MediaItem(MediaDescriptionCompat.a(a.c.b(paramObject)), i);
    }
    
    public static List<MediaItem> a(List<?> paramList)
    {
      Object localObject;
      if ((paramList == null) || (Build.VERSION.SDK_INT < 21)) {
        localObject = null;
      }
      for (;;)
      {
        return localObject;
        localObject = new ArrayList(paramList.size());
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext()) {
          ((List)localObject).add(a(localIterator.next()));
        }
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=").append(this.a);
      localStringBuilder.append(", mDescription=").append(this.b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
      this.b.writeToParcel(paramParcel, paramInt);
    }
  }
  
  private static class SearchResultReceiver
    extends ResultReceiver
  {
    private final String d;
    private final Bundle e;
    private final MediaBrowserCompat.k f;
    
    protected void a(int paramInt, Bundle paramBundle)
    {
      if (paramBundle != null) {
        paramBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      }
      if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("search_results")))
      {
        this.f.a(this.d, this.e);
        return;
      }
      Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
      Object localObject = null;
      if (arrayOfParcelable != null)
      {
        ArrayList localArrayList = new ArrayList();
        int i = arrayOfParcelable.length;
        for (int j = 0; j < i; j++) {
          localArrayList.add((MediaBrowserCompat.MediaItem)arrayOfParcelable[j]);
        }
        localObject = localArrayList;
      }
      this.f.a(this.d, this.e, localObject);
    }
  }
  
  private static class a
    extends Handler
  {
    private final WeakReference<MediaBrowserCompat.j> a;
    private WeakReference<Messenger> b;
    
    a(MediaBrowserCompat.j paramj)
    {
      this.a = new WeakReference(paramj);
    }
    
    void a(Messenger paramMessenger)
    {
      this.b = new WeakReference(paramMessenger);
    }
    
    public void handleMessage(Message paramMessage)
    {
      if ((this.b == null) || (this.b.get() == null) || (this.a.get() == null)) {}
      Bundle localBundle;
      MediaBrowserCompat.j localj;
      Messenger localMessenger;
      do
      {
        return;
        localBundle = paramMessage.getData();
        localBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        localj = (MediaBrowserCompat.j)this.a.get();
        localMessenger = (Messenger)this.b.get();
        try
        {
          switch (paramMessage.what)
          {
          default: 
            Log.w("MediaBrowserCompat", "Unhandled message: " + paramMessage + "\n  Client version: " + 1 + "\n  Service version: " + paramMessage.arg1);
            return;
          }
        }
        catch (BadParcelableException localBadParcelableException)
        {
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
        }
      } while (paramMessage.what != 1);
      localj.a(localMessenger);
      return;
      localj.a(localMessenger, localBundle.getString("data_media_item_id"), (MediaSessionCompat.Token)localBundle.getParcelable("data_media_session_token"), localBundle.getBundle("data_root_hints"));
      return;
      localj.a(localMessenger);
      return;
      localj.a(localMessenger, localBundle.getString("data_media_item_id"), localBundle.getParcelableArrayList("data_media_item_list"), localBundle.getBundle("data_options"));
    }
  }
  
  public static class b
  {
    final Object a;
    a b;
    
    public b()
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        this.a = a.a(new b());
        return;
      }
      this.a = null;
    }
    
    public void a() {}
    
    void a(a parama)
    {
      this.b = parama;
    }
    
    public void b() {}
    
    public void c() {}
    
    static abstract interface a
    {
      public abstract void a();
      
      public abstract void b();
      
      public abstract void c();
    }
    
    private class b
      implements a.a
    {
      b() {}
      
      public void a()
      {
        if (MediaBrowserCompat.b.this.b != null) {
          MediaBrowserCompat.b.this.b.a();
        }
        MediaBrowserCompat.b.this.a();
      }
      
      public void b()
      {
        if (MediaBrowserCompat.b.this.b != null) {
          MediaBrowserCompat.b.this.b.b();
        }
        MediaBrowserCompat.b.this.b();
      }
      
      public void c()
      {
        if (MediaBrowserCompat.b.this.b != null) {
          MediaBrowserCompat.b.this.b.c();
        }
        MediaBrowserCompat.b.this.c();
      }
    }
  }
  
  public static abstract class c
  {
    public void a(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void b(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void c(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
  }
  
  public static abstract class d
  {
    public void a(MediaBrowserCompat.MediaItem paramMediaItem) {}
    
    public void a(String paramString) {}
  }
  
  static abstract interface e
  {
    public abstract void d();
    
    public abstract void e();
    
    public abstract MediaSessionCompat.Token f();
  }
  
  static class f
    implements MediaBrowserCompat.b.a, MediaBrowserCompat.e, MediaBrowserCompat.j
  {
    final Context a;
    protected final Object b;
    protected final Bundle c;
    protected final MediaBrowserCompat.a d = new MediaBrowserCompat.a(this);
    protected int e;
    protected MediaBrowserCompat.l f;
    protected Messenger g;
    private final android.support.v4.f.a<String, MediaBrowserCompat.m> h = new android.support.v4.f.a();
    private MediaSessionCompat.Token i;
    
    f(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      this.a = paramContext;
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      paramBundle.putInt("extra_client_version", 1);
      this.c = new Bundle(paramBundle);
      paramb.a(this);
      this.b = a.a(paramContext, paramComponentName, paramb.a, this.c);
    }
    
    public void a()
    {
      Bundle localBundle = a.c(this.b);
      if (localBundle == null) {}
      for (;;)
      {
        return;
        this.e = localBundle.getInt("extra_service_version", 0);
        IBinder localIBinder = BundleCompat.getBinder(localBundle, "extra_messenger");
        if (localIBinder != null)
        {
          this.f = new MediaBrowserCompat.l(localIBinder, this.c);
          this.g = new Messenger(this.d);
          this.d.a(this.g);
        }
        try
        {
          this.f.b(this.g);
          android.support.v4.media.session.b localb = android.support.v4.media.session.b.a.a(BundleCompat.getBinder(localBundle, "extra_session_binder"));
          if (localb == null) {
            continue;
          }
          this.i = MediaSessionCompat.Token.a(a.d(this.b), localb);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
          }
        }
      }
    }
    
    public void a(Messenger paramMessenger) {}
    
    public void a(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle) {}
    
    public void a(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle)
    {
      if (this.g != paramMessenger) {}
      MediaBrowserCompat.n localn;
      do
      {
        MediaBrowserCompat.m localm;
        do
        {
          return;
          localm = (MediaBrowserCompat.m)this.h.get(paramString);
          if (localm != null) {
            break;
          }
        } while (!MediaBrowserCompat.a);
        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + paramString);
        return;
        localn = localm.a(this.a, paramBundle);
      } while (localn == null);
      if (paramBundle == null)
      {
        if (paramList == null)
        {
          localn.a(paramString);
          return;
        }
        localn.a(paramString, paramList);
        return;
      }
      if (paramList == null)
      {
        localn.a(paramString, paramBundle);
        return;
      }
      localn.a(paramString, paramList, paramBundle);
    }
    
    public void b()
    {
      this.f = null;
      this.g = null;
      this.i = null;
      this.d.a(null);
    }
    
    public void c() {}
    
    public void d()
    {
      a.a(this.b);
    }
    
    public void e()
    {
      if ((this.f != null) && (this.g != null)) {}
      try
      {
        this.f.c(this.g);
        a.b(this.b);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
        }
      }
    }
    
    public MediaSessionCompat.Token f()
    {
      if (this.i == null) {
        this.i = MediaSessionCompat.Token.a(a.d(this.b));
      }
      return this.i;
    }
  }
  
  static class g
    extends MediaBrowserCompat.f
  {
    g(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      super(paramComponentName, paramb, paramBundle);
    }
  }
  
  static class h
    extends MediaBrowserCompat.g
  {
    h(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      super(paramComponentName, paramb, paramBundle);
    }
  }
  
  static class i
    implements MediaBrowserCompat.e, MediaBrowserCompat.j
  {
    final Context a;
    final ComponentName b;
    final MediaBrowserCompat.b c;
    final Bundle d;
    final MediaBrowserCompat.a e = new MediaBrowserCompat.a(this);
    int f = 1;
    a g;
    MediaBrowserCompat.l h;
    Messenger i;
    private final android.support.v4.f.a<String, MediaBrowserCompat.m> j = new android.support.v4.f.a();
    private String k;
    private MediaSessionCompat.Token l;
    private Bundle m;
    
    public i(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      if (paramContext == null) {
        throw new IllegalArgumentException("context must not be null");
      }
      if (paramComponentName == null) {
        throw new IllegalArgumentException("service component must not be null");
      }
      if (paramb == null) {
        throw new IllegalArgumentException("connection callback must not be null");
      }
      this.a = paramContext;
      this.b = paramComponentName;
      this.c = paramb;
      if (paramBundle == null) {}
      for (Bundle localBundle = null;; localBundle = new Bundle(paramBundle))
      {
        this.d = localBundle;
        return;
      }
    }
    
    private static String a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return "UNKNOWN/" + paramInt;
      case 0: 
        return "CONNECT_STATE_DISCONNECTING";
      case 1: 
        return "CONNECT_STATE_DISCONNECTED";
      case 2: 
        return "CONNECT_STATE_CONNECTING";
      case 3: 
        return "CONNECT_STATE_CONNECTED";
      }
      return "CONNECT_STATE_SUSPENDED";
    }
    
    private boolean a(Messenger paramMessenger, String paramString)
    {
      int n = 1;
      if ((this.i != paramMessenger) || (this.f == 0) || (this.f == n))
      {
        if ((this.f != 0) && (this.f != n)) {
          Log.i("MediaBrowserCompat", paramString + " for " + this.b + " with mCallbacksMessenger=" + this.i + " this=" + this);
        }
        n = 0;
      }
      return n;
    }
    
    void a()
    {
      if (this.g != null) {
        this.a.unbindService(this.g);
      }
      this.f = 1;
      this.g = null;
      this.h = null;
      this.i = null;
      this.e.a(null);
      this.k = null;
      this.l = null;
    }
    
    public void a(Messenger paramMessenger)
    {
      Log.e("MediaBrowserCompat", "onConnectFailed for " + this.b);
      if (!a(paramMessenger, "onConnectFailed")) {
        return;
      }
      if (this.f != 2)
      {
        Log.w("MediaBrowserCompat", "onConnect from service while mState=" + a(this.f) + "... ignoring");
        return;
      }
      a();
      this.c.c();
    }
    
    public void a(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      if (!a(paramMessenger, "onConnect")) {}
      for (;;)
      {
        return;
        if (this.f != 2)
        {
          Log.w("MediaBrowserCompat", "onConnect from service while mState=" + a(this.f) + "... ignoring");
          return;
        }
        this.k = paramString;
        this.l = paramToken;
        this.m = paramBundle;
        this.f = 3;
        if (MediaBrowserCompat.a)
        {
          Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
          c();
        }
        this.c.a();
        try
        {
          Iterator localIterator = this.j.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            String str = (String)localEntry.getKey();
            MediaBrowserCompat.m localm = (MediaBrowserCompat.m)localEntry.getValue();
            List localList1 = localm.b();
            List localList2 = localm.a();
            for (int n = 0; n < localList1.size(); n++) {
              this.h.a(str, MediaBrowserCompat.n.a((MediaBrowserCompat.n)localList1.get(n)), (Bundle)localList2.get(n), this.i);
            }
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
        }
      }
    }
    
    public void a(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle)
    {
      if (!a(paramMessenger, "onLoadChildren")) {}
      MediaBrowserCompat.n localn;
      do
      {
        MediaBrowserCompat.m localm;
        do
        {
          return;
          if (MediaBrowserCompat.a) {
            Log.d("MediaBrowserCompat", "onLoadChildren for " + this.b + " id=" + paramString);
          }
          localm = (MediaBrowserCompat.m)this.j.get(paramString);
          if (localm != null) {
            break;
          }
        } while (!MediaBrowserCompat.a);
        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + paramString);
        return;
        localn = localm.a(this.a, paramBundle);
      } while (localn == null);
      if (paramBundle == null)
      {
        if (paramList == null)
        {
          localn.a(paramString);
          return;
        }
        localn.a(paramString, paramList);
        return;
      }
      if (paramList == null)
      {
        localn.a(paramString, paramBundle);
        return;
      }
      localn.a(paramString, paramList, paramBundle);
    }
    
    public boolean b()
    {
      return this.f == 3;
    }
    
    void c()
    {
      Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
      Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.b);
      Log.d("MediaBrowserCompat", "  mCallback=" + this.c);
      Log.d("MediaBrowserCompat", "  mRootHints=" + this.d);
      Log.d("MediaBrowserCompat", "  mState=" + a(this.f));
      Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.g);
      Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.h);
      Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.i);
      Log.d("MediaBrowserCompat", "  mRootId=" + this.k);
      Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.l);
    }
    
    public void d()
    {
      if ((this.f != 0) && (this.f != 1)) {
        throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + a(this.f) + ")");
      }
      this.f = 2;
      this.e.post(new Runnable()
      {
        public void run()
        {
          if (MediaBrowserCompat.i.this.f == 0) {}
          do
          {
            return;
            MediaBrowserCompat.i.this.f = 2;
            if ((MediaBrowserCompat.a) && (MediaBrowserCompat.i.this.g != null)) {
              throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserCompat.i.this.g);
            }
            if (MediaBrowserCompat.i.this.h != null) {
              throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserCompat.i.this.h);
            }
            if (MediaBrowserCompat.i.this.i != null) {
              throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserCompat.i.this.i);
            }
            Intent localIntent = new Intent("android.media.browse.MediaBrowserService");
            localIntent.setComponent(MediaBrowserCompat.i.this.b);
            MediaBrowserCompat.i.this.g = new MediaBrowserCompat.i.a(MediaBrowserCompat.i.this);
            try
            {
              boolean bool2 = MediaBrowserCompat.i.this.a.bindService(localIntent, MediaBrowserCompat.i.this.g, 1);
              bool1 = bool2;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                Log.e("MediaBrowserCompat", "Failed binding to service " + MediaBrowserCompat.i.this.b);
                boolean bool1 = false;
              }
            }
            if (!bool1)
            {
              MediaBrowserCompat.i.this.a();
              MediaBrowserCompat.i.this.c.c();
            }
          } while (!MediaBrowserCompat.a);
          Log.d("MediaBrowserCompat", "connect...");
          MediaBrowserCompat.i.this.c();
        }
      });
    }
    
    public void e()
    {
      this.f = 0;
      this.e.post(new Runnable()
      {
        public void run()
        {
          if (MediaBrowserCompat.i.this.i != null) {}
          try
          {
            MediaBrowserCompat.i.this.h.a(MediaBrowserCompat.i.this.i);
            int i = MediaBrowserCompat.i.this.f;
            MediaBrowserCompat.i.this.a();
            if (i != 0) {
              MediaBrowserCompat.i.this.f = i;
            }
            if (MediaBrowserCompat.a)
            {
              Log.d("MediaBrowserCompat", "disconnect...");
              MediaBrowserCompat.i.this.c();
            }
            return;
          }
          catch (RemoteException localRemoteException)
          {
            for (;;)
            {
              Log.w("MediaBrowserCompat", "RemoteException during connect for " + MediaBrowserCompat.i.this.b);
            }
          }
        }
      });
    }
    
    public MediaSessionCompat.Token f()
    {
      if (!b()) {
        throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f + ")");
      }
      return this.l;
    }
    
    private class a
      implements ServiceConnection
    {
      a() {}
      
      private void a(Runnable paramRunnable)
      {
        if (Thread.currentThread() == MediaBrowserCompat.i.this.e.getLooper().getThread())
        {
          paramRunnable.run();
          return;
        }
        MediaBrowserCompat.i.this.e.post(paramRunnable);
      }
      
      boolean a(String paramString)
      {
        int i = 1;
        if ((MediaBrowserCompat.i.this.g != this) || (MediaBrowserCompat.i.this.f == 0) || (MediaBrowserCompat.i.this.f == i))
        {
          if ((MediaBrowserCompat.i.this.f != 0) && (MediaBrowserCompat.i.this.f != i)) {
            Log.i("MediaBrowserCompat", paramString + " for " + MediaBrowserCompat.i.this.b + " with mServiceConnection=" + MediaBrowserCompat.i.this.g + " this=" + this);
          }
          i = 0;
        }
        return i;
      }
      
      public void onServiceConnected(final ComponentName paramComponentName, final IBinder paramIBinder)
      {
        a(new Runnable()
        {
          public void run()
          {
            if (MediaBrowserCompat.a)
            {
              Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + paramComponentName + " binder=" + paramIBinder);
              MediaBrowserCompat.i.this.c();
            }
            if (!MediaBrowserCompat.i.a.this.a("onServiceConnected")) {}
            do
            {
              return;
              MediaBrowserCompat.i.this.h = new MediaBrowserCompat.l(paramIBinder, MediaBrowserCompat.i.this.d);
              MediaBrowserCompat.i.this.i = new Messenger(MediaBrowserCompat.i.this.e);
              MediaBrowserCompat.i.this.e.a(MediaBrowserCompat.i.this.i);
              MediaBrowserCompat.i.this.f = 2;
              try
              {
                if (MediaBrowserCompat.a)
                {
                  Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                  MediaBrowserCompat.i.this.c();
                }
                MediaBrowserCompat.i.this.h.a(MediaBrowserCompat.i.this.a, MediaBrowserCompat.i.this.i);
                return;
              }
              catch (RemoteException localRemoteException)
              {
                Log.w("MediaBrowserCompat", "RemoteException during connect for " + MediaBrowserCompat.i.this.b);
              }
            } while (!MediaBrowserCompat.a);
            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
            MediaBrowserCompat.i.this.c();
          }
        });
      }
      
      public void onServiceDisconnected(final ComponentName paramComponentName)
      {
        a(new Runnable()
        {
          public void run()
          {
            if (MediaBrowserCompat.a)
            {
              Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + paramComponentName + " this=" + this + " mServiceConnection=" + MediaBrowserCompat.i.this.g);
              MediaBrowserCompat.i.this.c();
            }
            if (!MediaBrowserCompat.i.a.this.a("onServiceDisconnected")) {
              return;
            }
            MediaBrowserCompat.i.this.h = null;
            MediaBrowserCompat.i.this.i = null;
            MediaBrowserCompat.i.this.e.a(null);
            MediaBrowserCompat.i.this.f = 4;
            MediaBrowserCompat.i.this.c.b();
          }
        });
      }
    }
  }
  
  static abstract interface j
  {
    public abstract void a(Messenger paramMessenger);
    
    public abstract void a(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
    
    public abstract void a(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle);
  }
  
  public static abstract class k
  {
    public void a(String paramString, Bundle paramBundle) {}
    
    public void a(String paramString, Bundle paramBundle, List<MediaBrowserCompat.MediaItem> paramList) {}
  }
  
  private static class l
  {
    private Messenger a;
    private Bundle b;
    
    public l(IBinder paramIBinder, Bundle paramBundle)
    {
      this.a = new Messenger(paramIBinder);
      this.b = paramBundle;
    }
    
    private void a(int paramInt, Bundle paramBundle, Messenger paramMessenger)
    {
      Message localMessage = Message.obtain();
      localMessage.what = paramInt;
      localMessage.arg1 = 1;
      localMessage.setData(paramBundle);
      localMessage.replyTo = paramMessenger;
      this.a.send(localMessage);
    }
    
    void a(Context paramContext, Messenger paramMessenger)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putBundle("data_root_hints", this.b);
      a(1, localBundle, paramMessenger);
    }
    
    void a(Messenger paramMessenger)
    {
      a(2, null, paramMessenger);
    }
    
    void a(String paramString, IBinder paramIBinder, Bundle paramBundle, Messenger paramMessenger)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
      localBundle.putBundle("data_options", paramBundle);
      a(3, localBundle, paramMessenger);
    }
    
    void b(Messenger paramMessenger)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBundle("data_root_hints", this.b);
      a(6, localBundle, paramMessenger);
    }
    
    void c(Messenger paramMessenger)
    {
      a(7, null, paramMessenger);
    }
  }
  
  private static class m
  {
    private final List<MediaBrowserCompat.n> a = new ArrayList();
    private final List<Bundle> b = new ArrayList();
    
    public MediaBrowserCompat.n a(Context paramContext, Bundle paramBundle)
    {
      if (paramBundle != null) {
        paramBundle.setClassLoader(paramContext.getClassLoader());
      }
      for (int i = 0; i < this.b.size(); i++) {
        if (c.a((Bundle)this.b.get(i), paramBundle)) {
          return (MediaBrowserCompat.n)this.a.get(i);
        }
      }
      return null;
    }
    
    public List<Bundle> a()
    {
      return this.b;
    }
    
    public List<MediaBrowserCompat.n> b()
    {
      return this.a;
    }
  }
  
  public static abstract class n
  {
    WeakReference<MediaBrowserCompat.m> a;
    private final Object b;
    private final IBinder c = new Binder();
    
    public n()
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        this.b = b.a(new b());
        return;
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        this.b = a.a(new a());
        return;
      }
      this.b = null;
    }
    
    public void a(String paramString) {}
    
    public void a(String paramString, Bundle paramBundle) {}
    
    public void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList) {}
    
    public void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle) {}
    
    private class a
      implements a.d
    {
      a() {}
      
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
      
      public void a(String paramString)
      {
        MediaBrowserCompat.n.this.a(paramString);
      }
      
      public void a(String paramString, List<?> paramList)
      {
        if (MediaBrowserCompat.n.this.a == null) {}
        for (MediaBrowserCompat.m localm = null; localm == null; localm = (MediaBrowserCompat.m)MediaBrowserCompat.n.this.a.get())
        {
          MediaBrowserCompat.n.this.a(paramString, MediaBrowserCompat.MediaItem.a(paramList));
          return;
        }
        List localList1 = MediaBrowserCompat.MediaItem.a(paramList);
        List localList2 = localm.b();
        List localList3 = localm.a();
        int i = 0;
        label67:
        Bundle localBundle;
        if (i < localList2.size())
        {
          localBundle = (Bundle)localList3.get(i);
          if (localBundle != null) {
            break label114;
          }
          MediaBrowserCompat.n.this.a(paramString, localList1);
        }
        for (;;)
        {
          i++;
          break label67;
          break;
          label114:
          MediaBrowserCompat.n.this.a(paramString, a(localList1, localBundle), localBundle);
        }
      }
    }
    
    private class b
      extends MediaBrowserCompat.n.a
      implements b.a
    {
      b()
      {
        super();
      }
      
      public void a(String paramString, Bundle paramBundle)
      {
        MediaBrowserCompat.n.this.a(paramString, paramBundle);
      }
      
      public void a(String paramString, List<?> paramList, Bundle paramBundle)
      {
        MediaBrowserCompat.n.this.a(paramString, MediaBrowserCompat.MediaItem.a(paramList), paramBundle);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat
 * JD-Core Version:    0.7.0.1
 */