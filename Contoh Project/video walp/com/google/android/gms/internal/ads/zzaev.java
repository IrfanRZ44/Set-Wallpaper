package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.i;
import java.io.IOException;

@cm
public final class zzaev
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaev> CREATOR = new dz();
  private ParcelFileDescriptor a;
  private Parcelable b;
  private boolean c;
  
  public zzaev(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramParcelFileDescriptor;
    this.b = null;
    this.c = true;
  }
  
  public zzaev(SafeParcelable paramSafeParcelable)
  {
    this.a = null;
    this.b = paramSafeParcelable;
    this.c = false;
  }
  
  private final ParcelFileDescriptor a()
  {
    Parcel localParcel;
    if (this.a == null) {
      localParcel = Parcel.obtain();
    }
    try
    {
      this.b.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      this.a = a(arrayOfByte);
      return this.a;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  private final <T> ParcelFileDescriptor a(byte[] paramArrayOfByte)
  {
    try
    {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
      localAutoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(arrayOfParcelFileDescriptor[1]);
      ParcelFileDescriptor localParcelFileDescriptor;
      je.b("Error transporting the ad response", localIOException1);
    }
    catch (IOException localIOException1)
    {
      try
      {
        new Thread(new dy(this, localAutoCloseOutputStream, paramArrayOfByte)).start();
        localParcelFileDescriptor = arrayOfParcelFileDescriptor[0];
        return localParcelFileDescriptor;
      }
      catch (IOException localIOException2)
      {
        ParcelFileDescriptor.AutoCloseOutputStream localAutoCloseOutputStream;
        break label49;
      }
      localIOException1 = localIOException1;
      localAutoCloseOutputStream = null;
    }
    label49:
    zzbv.zzeo().a(localIOException1, "LargeParcelTeleporter.pipeData.2");
    i.a(localAutoCloseOutputStream);
    return null;
  }
  
  /* Error */
  public final <T extends SafeParcelable> T a(Parcelable.Creator<T> paramCreator)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/google/android/gms/internal/ads/zzaev:c	Z
    //   4: ifeq +105 -> 109
    //   7: aload_0
    //   8: getfield 27	com/google/android/gms/internal/ads/zzaev:a	Landroid/os/ParcelFileDescriptor;
    //   11: ifnonnull +10 -> 21
    //   14: ldc 108
    //   16: invokestatic 111	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;)V
    //   19: aconst_null
    //   20: areturn
    //   21: new 113	java/io/DataInputStream
    //   24: dup
    //   25: new 115	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   28: dup
    //   29: aload_0
    //   30: getfield 27	com/google/android/gms/internal/ads/zzaev:a	Landroid/os/ParcelFileDescriptor;
    //   33: invokespecial 116	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   36: invokespecial 119	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 123	java/io/DataInputStream:readInt	()I
    //   44: newarray byte
    //   46: astore 5
    //   48: aload_2
    //   49: aload 5
    //   51: iconst_0
    //   52: aload 5
    //   54: arraylength
    //   55: invokevirtual 127	java/io/DataInputStream:readFully	([BII)V
    //   58: aload_2
    //   59: invokestatic 105	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   62: invokestatic 39	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   65: astore 6
    //   67: aload 6
    //   69: aload 5
    //   71: iconst_0
    //   72: aload 5
    //   74: arraylength
    //   75: invokevirtual 130	android/os/Parcel:unmarshall	([BII)V
    //   78: aload 6
    //   80: iconst_0
    //   81: invokevirtual 134	android/os/Parcel:setDataPosition	(I)V
    //   84: aload_0
    //   85: aload_1
    //   86: aload 6
    //   88: invokeinterface 140 2 0
    //   93: checkcast 142	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   96: putfield 29	com/google/android/gms/internal/ads/zzaev:b	Landroid/os/Parcelable;
    //   99: aload 6
    //   101: invokevirtual 52	android/os/Parcel:recycle	()V
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield 31	com/google/android/gms/internal/ads/zzaev:c	Z
    //   109: aload_0
    //   110: getfield 29	com/google/android/gms/internal/ads/zzaev:b	Landroid/os/Parcelable;
    //   113: checkcast 142	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   116: areturn
    //   117: astore 4
    //   119: ldc 144
    //   121: aload 4
    //   123: invokestatic 87	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: aload_2
    //   127: invokestatic 105	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   130: aconst_null
    //   131: areturn
    //   132: astore_3
    //   133: aload_2
    //   134: invokestatic 105	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   137: aload_3
    //   138: athrow
    //   139: astore 7
    //   141: aload 6
    //   143: invokevirtual 52	android/os/Parcel:recycle	()V
    //   146: aload 7
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	zzaev
    //   0	149	1	paramCreator	Parcelable.Creator<T>
    //   39	95	2	localDataInputStream	java.io.DataInputStream
    //   132	6	3	localObject1	Object
    //   117	5	4	localIOException	IOException
    //   46	27	5	arrayOfByte	byte[]
    //   65	77	6	localParcel	Parcel
    //   139	8	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   40	58	117	java/io/IOException
    //   40	58	132	finally
    //   119	126	132	finally
    //   67	99	139	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a();
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaev
 * JD-Core Version:    0.7.0.1
 */