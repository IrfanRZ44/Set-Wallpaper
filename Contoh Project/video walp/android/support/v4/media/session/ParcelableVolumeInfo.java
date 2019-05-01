package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator()
  {
    public ParcelableVolumeInfo a(Parcel paramAnonymousParcel)
    {
      return new ParcelableVolumeInfo(paramAnonymousParcel);
    }
    
    public ParcelableVolumeInfo[] a(int paramAnonymousInt)
    {
      return new ParcelableVolumeInfo[paramAnonymousInt];
    }
  };
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.b);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.ParcelableVolumeInfo
 * JD-Core Version:    0.7.0.1
 */