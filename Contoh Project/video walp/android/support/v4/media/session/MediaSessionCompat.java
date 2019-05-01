package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat
{
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.QueueItem a(Parcel paramAnonymousParcel)
      {
        return new MediaSessionCompat.QueueItem(paramAnonymousParcel);
      }
      
      public MediaSessionCompat.QueueItem[] a(int paramAnonymousInt)
      {
        return new MediaSessionCompat.QueueItem[paramAnonymousInt];
      }
    };
    private final MediaDescriptionCompat a;
    private final long b;
    private Object c;
    
    QueueItem(Parcel paramParcel)
    {
      this.a = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      this.b = paramParcel.readLong();
    }
    
    private QueueItem(Object paramObject, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      if (paramMediaDescriptionCompat == null) {
        throw new IllegalArgumentException("Description cannot be null.");
      }
      if (paramLong == -1L) {
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      }
      this.a = paramMediaDescriptionCompat;
      this.b = paramLong;
      this.c = paramObject;
    }
    
    public static QueueItem a(Object paramObject)
    {
      if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
        return null;
      }
      return new QueueItem(paramObject, MediaDescriptionCompat.a(d.a.a(paramObject)), d.a.b(paramObject));
    }
    
    public static List<QueueItem> a(List<?> paramList)
    {
      Object localObject;
      if ((paramList == null) || (Build.VERSION.SDK_INT < 21)) {
        localObject = null;
      }
      for (;;)
      {
        return localObject;
        localObject = new ArrayList();
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
      return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.a.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(this.b);
    }
  }
  
  static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.ResultReceiverWrapper a(Parcel paramAnonymousParcel)
      {
        return new MediaSessionCompat.ResultReceiverWrapper(paramAnonymousParcel);
      }
      
      public MediaSessionCompat.ResultReceiverWrapper[] a(int paramAnonymousInt)
      {
        return new MediaSessionCompat.ResultReceiverWrapper[paramAnonymousInt];
      }
    };
    private ResultReceiver a;
    
    ResultReceiverWrapper(Parcel paramParcel)
    {
      this.a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.a.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.Token a(Parcel paramAnonymousParcel)
      {
        if (Build.VERSION.SDK_INT >= 21) {}
        for (Object localObject = paramAnonymousParcel.readParcelable(null);; localObject = paramAnonymousParcel.readStrongBinder()) {
          return new MediaSessionCompat.Token(localObject);
        }
      }
      
      public MediaSessionCompat.Token[] a(int paramAnonymousInt)
      {
        return new MediaSessionCompat.Token[paramAnonymousInt];
      }
    };
    private final Object a;
    private final b b;
    
    Token(Object paramObject)
    {
      this(paramObject, null);
    }
    
    Token(Object paramObject, b paramb)
    {
      this.a = paramObject;
      this.b = paramb;
    }
    
    public static Token a(Object paramObject)
    {
      return a(paramObject, null);
    }
    
    public static Token a(Object paramObject, b paramb)
    {
      if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21)) {
        return new Token(d.a(paramObject), paramb);
      }
      return null;
    }
    
    public Object a()
    {
      return this.a;
    }
    
    public b b()
    {
      return this.b;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      Token localToken;
      do
      {
        return true;
        if (!(paramObject instanceof Token)) {
          return false;
        }
        localToken = (Token)paramObject;
        if (this.a != null) {
          break;
        }
      } while (localToken.a == null);
      return false;
      if (localToken.a == null) {
        return false;
      }
      return this.a.equals(localToken.a);
    }
    
    public int hashCode()
    {
      if (this.a == null) {
        return 0;
      }
      return this.a.hashCode();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramParcel.writeParcelable((Parcelable)this.a, paramInt);
        return;
      }
      paramParcel.writeStrongBinder((IBinder)this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat
 * JD-Core Version:    0.7.0.1
 */