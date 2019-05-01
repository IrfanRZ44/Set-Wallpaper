package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator()
  {
    public MediaDescriptionCompat a(Parcel paramAnonymousParcel)
    {
      if (Build.VERSION.SDK_INT < 21) {
        return new MediaDescriptionCompat(paramAnonymousParcel);
      }
      return MediaDescriptionCompat.a(d.a(paramAnonymousParcel));
    }
    
    public MediaDescriptionCompat[] a(int paramAnonymousInt)
    {
      return new MediaDescriptionCompat[paramAnonymousInt];
    }
  };
  private final String a;
  private final CharSequence b;
  private final CharSequence c;
  private final CharSequence d;
  private final Bitmap e;
  private final Uri f;
  private final Bundle g;
  private final Uri h;
  private Object i;
  
  MediaDescriptionCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.d = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.e = ((Bitmap)paramParcel.readParcelable(null));
    this.f = ((Uri)paramParcel.readParcelable(null));
    this.g = paramParcel.readBundle();
    this.h = ((Uri)paramParcel.readParcelable(null));
  }
  
  MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.a = paramString;
    this.b = paramCharSequence1;
    this.c = paramCharSequence2;
    this.d = paramCharSequence3;
    this.e = paramBitmap;
    this.f = paramUri1;
    this.g = paramBundle;
    this.h = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    MediaDescriptionCompat localMediaDescriptionCompat = null;
    a locala;
    Bundle localBundle1;
    Uri localUri;
    Bundle localBundle2;
    if (paramObject != null)
    {
      int j = Build.VERSION.SDK_INT;
      localMediaDescriptionCompat = null;
      if (j >= 21)
      {
        locala = new a();
        locala.a(d.a(paramObject));
        locala.a(d.b(paramObject));
        locala.b(d.c(paramObject));
        locala.c(d.d(paramObject));
        locala.a(d.e(paramObject));
        locala.a(d.f(paramObject));
        localBundle1 = d.g(paramObject);
        if (localBundle1 != null) {
          break label152;
        }
        localUri = null;
        if (localUri == null) {
          break label181;
        }
        if ((!localBundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle1.size() != 2)) {
          break label167;
        }
        localBundle2 = null;
        label121:
        locala.a(localBundle2);
        if (localUri == null) {
          break label188;
        }
        locala.b(localUri);
      }
    }
    for (;;)
    {
      localMediaDescriptionCompat = locala.a();
      localMediaDescriptionCompat.i = paramObject;
      return localMediaDescriptionCompat;
      label152:
      localUri = (Uri)localBundle1.getParcelable("android.support.v4.media.description.MEDIA_URI");
      break;
      label167:
      localBundle1.remove("android.support.v4.media.description.MEDIA_URI");
      localBundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
      label181:
      localBundle2 = localBundle1;
      break label121;
      label188:
      if (Build.VERSION.SDK_INT >= 23) {
        locala.b(e.h(paramObject));
      }
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public Object b()
  {
    if ((this.i != null) || (Build.VERSION.SDK_INT < 21)) {
      return this.i;
    }
    Object localObject = d.a.a();
    d.a.a(localObject, this.a);
    d.a.a(localObject, this.b);
    d.a.b(localObject, this.c);
    d.a.c(localObject, this.d);
    d.a.a(localObject, this.e);
    d.a.a(localObject, this.f);
    Bundle localBundle = this.g;
    if ((Build.VERSION.SDK_INT < 23) && (this.h != null))
    {
      if (localBundle == null)
      {
        localBundle = new Bundle();
        localBundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
      }
      localBundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
    }
    d.a.a(localObject, localBundle);
    if (Build.VERSION.SDK_INT >= 23) {
      e.a.b(localObject, this.h);
    }
    this.i = d.a.a(localObject);
    return this.i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.b + ", " + this.c + ", " + this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.a);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      paramParcel.writeParcelable(this.e, paramInt);
      paramParcel.writeParcelable(this.f, paramInt);
      paramParcel.writeBundle(this.g);
      paramParcel.writeParcelable(this.h, paramInt);
      return;
    }
    d.a(b(), paramParcel, paramInt);
  }
  
  public static final class a
  {
    private String a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private Bitmap e;
    private Uri f;
    private Bundle g;
    private Uri h;
    
    public a a(Bitmap paramBitmap)
    {
      this.e = paramBitmap;
      return this;
    }
    
    public a a(Uri paramUri)
    {
      this.f = paramUri;
      return this;
    }
    
    public a a(Bundle paramBundle)
    {
      this.g = paramBundle;
      return this;
    }
    
    public a a(CharSequence paramCharSequence)
    {
      this.b = paramCharSequence;
      return this;
    }
    
    public a a(String paramString)
    {
      this.a = paramString;
      return this;
    }
    
    public MediaDescriptionCompat a()
    {
      return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public a b(Uri paramUri)
    {
      this.h = paramUri;
      return this;
    }
    
    public a b(CharSequence paramCharSequence)
    {
      this.c = paramCharSequence;
      return this;
    }
    
    public a c(CharSequence paramCharSequence)
    {
      this.d = paramCharSequence;
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * JD-Core Version:    0.7.0.1
 */