package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

class e
{
  public static int a(Object paramObject)
  {
    return ((PlaybackState)paramObject).getState();
  }
  
  public static long b(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPosition();
  }
  
  public static long c(Object paramObject)
  {
    return ((PlaybackState)paramObject).getBufferedPosition();
  }
  
  public static float d(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPlaybackSpeed();
  }
  
  public static long e(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActions();
  }
  
  public static CharSequence f(Object paramObject)
  {
    return ((PlaybackState)paramObject).getErrorMessage();
  }
  
  public static long g(Object paramObject)
  {
    return ((PlaybackState)paramObject).getLastPositionUpdateTime();
  }
  
  public static List<Object> h(Object paramObject)
  {
    return ((PlaybackState)paramObject).getCustomActions();
  }
  
  public static long i(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActiveQueueItemId();
  }
  
  static final class a
  {
    public static String a(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getAction();
    }
    
    public static CharSequence b(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getName();
    }
    
    public static int c(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getIcon();
    }
    
    public static Bundle d(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getExtras();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.e
 * JD-Core Version:    0.7.0.1
 */