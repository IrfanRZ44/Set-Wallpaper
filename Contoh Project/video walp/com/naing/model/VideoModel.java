package com.naing.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoModel
  implements Parcelable
{
  public static final Parcelable.Creator<VideoModel> CREATOR = new Parcelable.Creator()
  {
    public VideoModel a(Parcel paramAnonymousParcel)
    {
      return new VideoModel(paramAnonymousParcel);
    }
    
    public VideoModel[] a(int paramAnonymousInt)
    {
      return new VideoModel[paramAnonymousInt];
    }
  };
  private Integer a;
  private String b;
  private String c;
  private Integer d;
  
  protected VideoModel(Parcel paramParcel)
  {
    if (paramParcel.readByte() == 0) {}
    for (this.a = null;; this.a = Integer.valueOf(paramParcel.readInt()))
    {
      this.b = paramParcel.readString();
      this.c = paramParcel.readString();
      if (paramParcel.readByte() != 0) {
        break;
      }
      this.d = null;
      return;
    }
    this.d = Integer.valueOf(paramParcel.readInt());
  }
  
  public VideoModel(Integer paramInteger1, String paramString1, String paramString2, Integer paramInteger2)
  {
    this.a = paramInteger1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInteger2;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public Integer c()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a == null) {
      paramParcel.writeByte((byte)0);
    }
    for (;;)
    {
      paramParcel.writeString(this.b);
      paramParcel.writeString(this.c);
      if (this.d != null) {
        break;
      }
      paramParcel.writeByte((byte)0);
      return;
      paramParcel.writeByte((byte)1);
      paramParcel.writeInt(this.a.intValue());
    }
    paramParcel.writeByte((byte)1);
    paramParcel.writeInt(this.d.intValue());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.model.VideoModel
 * JD-Core Version:    0.7.0.1
 */