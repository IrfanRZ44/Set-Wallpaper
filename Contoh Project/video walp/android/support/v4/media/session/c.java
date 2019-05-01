package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

class c
{
  public static Object a(Context paramContext, Object paramObject)
  {
    return new MediaController(paramContext, (MediaSession.Token)paramObject);
  }
  
  public static Object a(a parama)
  {
    return new b(parama);
  }
  
  public static void a(Object paramObject, String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    ((MediaController)paramObject).sendCommand(paramString, paramBundle, paramResultReceiver);
  }
  
  public static boolean a(Object paramObject, KeyEvent paramKeyEvent)
  {
    return ((MediaController)paramObject).dispatchMediaButtonEvent(paramKeyEvent);
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract void a(Bundle paramBundle);
    
    public abstract void a(CharSequence paramCharSequence);
    
    public abstract void a(Object paramObject);
    
    public abstract void a(String paramString, Bundle paramBundle);
    
    public abstract void a(List<?> paramList);
    
    public abstract void b(Object paramObject);
  }
  
  static class b<T extends c.a>
    extends MediaController.Callback
  {
    protected final T a;
    
    public b(T paramT)
    {
      this.a = paramT;
    }
    
    public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
    {
      this.a.a(paramPlaybackInfo.getPlaybackType(), c.c.b(paramPlaybackInfo), paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume());
    }
    
    public void onExtrasChanged(Bundle paramBundle)
    {
      this.a.a(paramBundle);
    }
    
    public void onMetadataChanged(MediaMetadata paramMediaMetadata)
    {
      this.a.b(paramMediaMetadata);
    }
    
    public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
    {
      this.a.a(paramPlaybackState);
    }
    
    public void onQueueChanged(List<MediaSession.QueueItem> paramList)
    {
      this.a.a(paramList);
    }
    
    public void onQueueTitleChanged(CharSequence paramCharSequence)
    {
      this.a.a(paramCharSequence);
    }
    
    public void onSessionDestroyed()
    {
      this.a.a();
    }
    
    public void onSessionEvent(String paramString, Bundle paramBundle)
    {
      this.a.a(paramString, paramBundle);
    }
  }
  
  public static class c
  {
    private static int a(AudioAttributes paramAudioAttributes)
    {
      int i = 3;
      if ((0x1 & paramAudioAttributes.getFlags()) == 1)
      {
        i = 7;
        return i;
      }
      if ((0x4 & paramAudioAttributes.getFlags()) == 4) {
        return 6;
      }
      switch (paramAudioAttributes.getUsage())
      {
      case 1: 
      case 11: 
      case 12: 
      case 14: 
      default: 
        return i;
      case 2: 
        return 0;
      case 13: 
        return 1;
      case 3: 
        return 8;
      case 4: 
        return 4;
      case 6: 
        return 2;
      }
      return 5;
    }
    
    public static AudioAttributes a(Object paramObject)
    {
      return ((MediaController.PlaybackInfo)paramObject).getAudioAttributes();
    }
    
    public static int b(Object paramObject)
    {
      return a(a(paramObject));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.c
 * JD-Core Version:    0.7.0.1
 */