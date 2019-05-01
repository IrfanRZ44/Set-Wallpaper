package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class MediaControllerCompat
{
  private final b a;
  private final MediaSessionCompat.Token b;
  private final HashSet<a> c = new HashSet();
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    if (paramToken == null) {
      throw new IllegalArgumentException("sessionToken must not be null");
    }
    this.b = paramToken;
    if (Build.VERSION.SDK_INT >= 24)
    {
      this.a = new d(paramContext, paramToken);
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      this.a = new c(paramContext, paramToken);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = new MediaControllerImplApi21(paramContext, paramToken);
      return;
    }
    this.a = new e(this.b);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent == null) {
      throw new IllegalArgumentException("KeyEvent may not be null");
    }
    return this.a.a(paramKeyEvent);
  }
  
  static class MediaControllerImplApi21
    implements MediaControllerCompat.b
  {
    protected final Object a;
    private final List<MediaControllerCompat.a> b = new ArrayList();
    private b c;
    private HashMap<MediaControllerCompat.a, a> d = new HashMap();
    
    public MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      this.a = c.a(paramContext, paramToken.a());
      if (this.a == null) {
        throw new RemoteException();
      }
      this.c = paramToken.b();
      if (this.c == null) {
        a();
      }
    }
    
    private void a()
    {
      a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this, new Handler()));
    }
    
    private void b()
    {
      if (this.c == null) {
        return;
      }
      MediaControllerCompat.a locala;
      a locala1;
      synchronized (this.b)
      {
        Iterator localIterator = this.b.iterator();
        if (localIterator.hasNext())
        {
          locala = (MediaControllerCompat.a)localIterator.next();
          locala1 = new a(locala);
          this.d.put(locala, locala1);
          locala.b = true;
        }
      }
      this.b.clear();
    }
    
    public void a(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
    {
      c.a(this.a, paramString, paramBundle, paramResultReceiver);
    }
    
    public boolean a(KeyEvent paramKeyEvent)
    {
      return c.a(this.a, paramKeyEvent);
    }
    
    private static class ExtraBinderRequestResultReceiver
      extends ResultReceiver
    {
      private WeakReference<MediaControllerCompat.MediaControllerImplApi21> a;
      
      public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21, Handler paramHandler)
      {
        super();
        this.a = new WeakReference(paramMediaControllerImplApi21);
      }
      
      protected void onReceiveResult(int paramInt, Bundle paramBundle)
      {
        MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)this.a.get();
        if ((localMediaControllerImplApi21 == null) || (paramBundle == null)) {
          return;
        }
        MediaControllerCompat.MediaControllerImplApi21.a(localMediaControllerImplApi21, b.a.a(BundleCompat.getBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
        MediaControllerCompat.MediaControllerImplApi21.a(localMediaControllerImplApi21);
      }
    }
    
    private static class a
      extends MediaControllerCompat.a.c
    {
      a(MediaControllerCompat.a parama)
      {
        super();
      }
      
      public void a()
      {
        throw new AssertionError();
      }
      
      public void a(Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public void a(MediaMetadataCompat paramMediaMetadataCompat)
      {
        throw new AssertionError();
      }
      
      public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
      {
        throw new AssertionError();
      }
      
      public void a(CharSequence paramCharSequence)
      {
        throw new AssertionError();
      }
      
      public void a(List<MediaSessionCompat.QueueItem> paramList)
      {
        throw new AssertionError();
      }
    }
  }
  
  public static abstract class a
    implements IBinder.DeathRecipient
  {
    a a;
    boolean b;
    private final Object c;
    
    public a()
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        this.c = c.a(new b(this));
        return;
      }
      this.c = new c(this);
    }
    
    public void a() {}
    
    public void a(int paramInt) {}
    
    void a(int paramInt, Object paramObject, Bundle paramBundle)
    {
      if (this.a != null)
      {
        Message localMessage = this.a.obtainMessage(paramInt, paramObject);
        localMessage.setData(paramBundle);
        localMessage.sendToTarget();
      }
    }
    
    public void a(Bundle paramBundle) {}
    
    public void a(MediaMetadataCompat paramMediaMetadataCompat) {}
    
    public void a(MediaControllerCompat.f paramf) {}
    
    public void a(PlaybackStateCompat paramPlaybackStateCompat) {}
    
    public void a(CharSequence paramCharSequence) {}
    
    public void a(String paramString, Bundle paramBundle) {}
    
    public void a(List<MediaSessionCompat.QueueItem> paramList) {}
    
    public void a(boolean paramBoolean) {}
    
    public void b() {}
    
    public void b(int paramInt) {}
    
    private class a
      extends Handler
    {
      boolean a;
      
      public void handleMessage(Message paramMessage)
      {
        if (!this.a) {
          return;
        }
        switch (paramMessage.what)
        {
        case 10: 
        default: 
          return;
        case 1: 
          this.b.a((String)paramMessage.obj, paramMessage.getData());
          return;
        case 2: 
          this.b.a((PlaybackStateCompat)paramMessage.obj);
          return;
        case 3: 
          this.b.a((MediaMetadataCompat)paramMessage.obj);
          return;
        case 5: 
          this.b.a((List)paramMessage.obj);
          return;
        case 6: 
          this.b.a((CharSequence)paramMessage.obj);
          return;
        case 11: 
          this.b.a(((Boolean)paramMessage.obj).booleanValue());
          return;
        case 9: 
          this.b.a(((Integer)paramMessage.obj).intValue());
          return;
        case 12: 
          this.b.b(((Integer)paramMessage.obj).intValue());
          return;
        case 7: 
          this.b.a((Bundle)paramMessage.obj);
          return;
        case 4: 
          this.b.a((MediaControllerCompat.f)paramMessage.obj);
          return;
        case 8: 
          this.b.b();
          return;
        }
        this.b.a();
      }
    }
    
    private static class b
      implements c.a
    {
      private final WeakReference<MediaControllerCompat.a> a;
      
      b(MediaControllerCompat.a parama)
      {
        this.a = new WeakReference(parama);
      }
      
      public void a()
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.b();
        }
      }
      
      public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(new MediaControllerCompat.f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
        }
      }
      
      public void a(Bundle paramBundle)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(paramBundle);
        }
      }
      
      public void a(CharSequence paramCharSequence)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(paramCharSequence);
        }
      }
      
      public void a(Object paramObject)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if ((locala == null) || (locala.b)) {
          return;
        }
        locala.a(PlaybackStateCompat.a(paramObject));
      }
      
      public void a(String paramString, Bundle paramBundle)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if ((locala == null) || ((locala.b) && (Build.VERSION.SDK_INT < 23))) {
          return;
        }
        locala.a(paramString, paramBundle);
      }
      
      public void a(List<?> paramList)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(MediaSessionCompat.QueueItem.a(paramList));
        }
      }
      
      public void b(Object paramObject)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(MediaMetadataCompat.a(paramObject));
        }
      }
    }
    
    private static class c
      extends a.a
    {
      private final WeakReference<MediaControllerCompat.a> a;
      
      c(MediaControllerCompat.a parama)
      {
        this.a = new WeakReference(parama);
      }
      
      public void a()
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(8, null, null);
        }
      }
      
      public void a(int paramInt)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(9, Integer.valueOf(paramInt), null);
        }
      }
      
      public void a(Bundle paramBundle)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(7, paramBundle, null);
        }
      }
      
      public void a(MediaMetadataCompat paramMediaMetadataCompat)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(3, paramMediaMetadataCompat, null);
        }
      }
      
      public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          if (paramParcelableVolumeInfo == null) {
            break label55;
          }
        }
        label55:
        for (MediaControllerCompat.f localf = new MediaControllerCompat.f(paramParcelableVolumeInfo.a, paramParcelableVolumeInfo.b, paramParcelableVolumeInfo.c, paramParcelableVolumeInfo.d, paramParcelableVolumeInfo.e);; localf = null)
        {
          locala.a(4, localf, null);
          return;
        }
      }
      
      public void a(PlaybackStateCompat paramPlaybackStateCompat)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(2, paramPlaybackStateCompat, null);
        }
      }
      
      public void a(CharSequence paramCharSequence)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(6, paramCharSequence, null);
        }
      }
      
      public void a(String paramString, Bundle paramBundle)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(1, paramString, paramBundle);
        }
      }
      
      public void a(List<MediaSessionCompat.QueueItem> paramList)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(5, paramList, null);
        }
      }
      
      public void a(boolean paramBoolean) {}
      
      public void b()
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(13, null, null);
        }
      }
      
      public void b(int paramInt)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(12, Integer.valueOf(paramInt), null);
        }
      }
      
      public void b(boolean paramBoolean)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
        if (locala != null) {
          locala.a(11, Boolean.valueOf(paramBoolean), null);
        }
      }
    }
  }
  
  static abstract interface b
  {
    public abstract boolean a(KeyEvent paramKeyEvent);
  }
  
  static class c
    extends MediaControllerCompat.MediaControllerImplApi21
  {
    public c(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
  }
  
  static class d
    extends MediaControllerCompat.c
  {
    public d(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
  }
  
  static class e
    implements MediaControllerCompat.b
  {
    private b a;
    
    public e(MediaSessionCompat.Token paramToken)
    {
      this.a = b.a.a((IBinder)paramToken.a());
    }
    
    public boolean a(KeyEvent paramKeyEvent)
    {
      if (paramKeyEvent == null) {
        throw new IllegalArgumentException("event may not be null.");
      }
      try
      {
        this.a.a(paramKeyEvent);
        return false;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", localRemoteException);
        }
      }
    }
  }
  
  public static final class f
  {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    
    f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramInt3;
      this.d = paramInt4;
      this.e = paramInt5;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat
 * JD-Core Version:    0.7.0.1
 */