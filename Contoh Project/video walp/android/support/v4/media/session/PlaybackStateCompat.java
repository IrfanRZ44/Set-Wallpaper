package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator()
  {
    public PlaybackStateCompat a(Parcel paramAnonymousParcel)
    {
      return new PlaybackStateCompat(paramAnonymousParcel);
    }
    
    public PlaybackStateCompat[] a(int paramAnonymousInt)
    {
      return new PlaybackStateCompat[paramAnonymousInt];
    }
  };
  final int a;
  final long b;
  final long c;
  final float d;
  final long e;
  final int f;
  final CharSequence g;
  final long h;
  List<CustomAction> i;
  final long j;
  final Bundle k;
  private Object l;
  
  PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List<CustomAction> paramList, long paramLong5, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramFloat;
    this.e = paramLong3;
    this.f = paramInt2;
    this.g = paramCharSequence;
    this.h = paramLong4;
    this.i = new ArrayList(paramList);
    this.j = paramLong5;
    this.k = paramBundle;
  }
  
  PlaybackStateCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readLong();
    this.d = paramParcel.readFloat();
    this.h = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readLong();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.i = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.j = paramParcel.readLong();
    this.k = paramParcel.readBundle();
    this.f = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat a(Object paramObject)
  {
    if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21))
    {
      List localList = e.h(paramObject);
      ArrayList localArrayList = null;
      if (localList != null)
      {
        localArrayList = new ArrayList(localList.size());
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          localArrayList.add(CustomAction.a(localIterator.next()));
        }
      }
      if (Build.VERSION.SDK_INT >= 22) {}
      for (Bundle localBundle = f.a(paramObject);; localBundle = null)
      {
        PlaybackStateCompat localPlaybackStateCompat = new PlaybackStateCompat(e.a(paramObject), e.b(paramObject), e.c(paramObject), e.d(paramObject), e.e(paramObject), 0, e.f(paramObject), e.g(paramObject), localArrayList, e.i(paramObject), localBundle);
        localPlaybackStateCompat.l = paramObject;
        return localPlaybackStateCompat;
      }
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.a);
    localStringBuilder.append(", position=").append(this.b);
    localStringBuilder.append(", buffered position=").append(this.c);
    localStringBuilder.append(", speed=").append(this.d);
    localStringBuilder.append(", updated=").append(this.h);
    localStringBuilder.append(", actions=").append(this.e);
    localStringBuilder.append(", error code=").append(this.f);
    localStringBuilder.append(", error message=").append(this.g);
    localStringBuilder.append(", custom actions=").append(this.i);
    localStringBuilder.append(", active item id=").append(this.j);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeFloat(this.d);
    paramParcel.writeLong(this.h);
    paramParcel.writeLong(this.c);
    paramParcel.writeLong(this.e);
    TextUtils.writeToParcel(this.g, paramParcel, paramInt);
    paramParcel.writeTypedList(this.i);
    paramParcel.writeLong(this.j);
    paramParcel.writeBundle(this.k);
    paramParcel.writeInt(this.f);
  }
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator()
    {
      public PlaybackStateCompat.CustomAction a(Parcel paramAnonymousParcel)
      {
        return new PlaybackStateCompat.CustomAction(paramAnonymousParcel);
      }
      
      public PlaybackStateCompat.CustomAction[] a(int paramAnonymousInt)
      {
        return new PlaybackStateCompat.CustomAction[paramAnonymousInt];
      }
    };
    private final String a;
    private final CharSequence b;
    private final int c;
    private final Bundle d;
    private Object e;
    
    CustomAction(Parcel paramParcel)
    {
      this.a = paramParcel.readString();
      this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      this.c = paramParcel.readInt();
      this.d = paramParcel.readBundle();
    }
    
    CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
    {
      this.a = paramString;
      this.b = paramCharSequence;
      this.c = paramInt;
      this.d = paramBundle;
    }
    
    public static CustomAction a(Object paramObject)
    {
      if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
        return null;
      }
      CustomAction localCustomAction = new CustomAction(e.a.a(paramObject), e.a.b(paramObject), e.a.c(paramObject), e.a.d(paramObject));
      localCustomAction.e = paramObject;
      return localCustomAction;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      return "Action:mName='" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      paramParcel.writeInt(this.c);
      paramParcel.writeBundle(this.d);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * JD-Core Version:    0.7.0.1
 */