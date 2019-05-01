package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import java.util.List;

class b
{
  static Object a(a parama)
  {
    return new b(parama);
  }
  
  static abstract interface a
    extends a.d
  {
    public abstract void a(String paramString, Bundle paramBundle);
    
    public abstract void a(String paramString, List<?> paramList, Bundle paramBundle);
  }
  
  static class b<T extends b.a>
    extends a.e<T>
  {
    b(T paramT)
    {
      super();
    }
    
    public void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList, Bundle paramBundle)
    {
      ((b.a)this.a).a(paramString, paramList, paramBundle);
    }
    
    public void onError(String paramString, Bundle paramBundle)
    {
      ((b.a)this.a).a(paramString, paramBundle);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.b
 * JD-Core Version:    0.7.0.1
 */