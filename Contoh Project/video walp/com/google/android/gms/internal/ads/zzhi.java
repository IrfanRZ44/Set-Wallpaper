package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class zzhi
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhi> CREATOR = new amb();
  @GuardedBy("this")
  private ParcelFileDescriptor a;
  
  public zzhi()
  {
    this(null);
  }
  
  public zzhi(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramParcelFileDescriptor;
  }
  
  private final ParcelFileDescriptor c()
  {
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = this.a;
      return localParcelFileDescriptor;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 28	com/google/android/gms/internal/ads/zzhi:a	Landroid/os/ParcelFileDescriptor;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzhi
    //   22	4	1	localObject	Object
    //   6	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  public final java.io.InputStream b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 28	com/google/android/gms/internal/ads/zzhi:a	Landroid/os/ParcelFileDescriptor;
    //   6: astore_2
    //   7: aconst_null
    //   8: astore_3
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_3
    //   16: areturn
    //   17: new 35	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_0
    //   22: getfield 28	com/google/android/gms/internal/ads/zzhi:a	Landroid/os/ParcelFileDescriptor;
    //   25: invokespecial 36	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   28: astore_3
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 28	com/google/android/gms/internal/ads/zzhi:a	Landroid/os/ParcelFileDescriptor;
    //   34: goto -21 -> 13
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	zzhi
    //   37	4	1	localObject1	Object
    //   6	4	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   8	21	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   17	34	37	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, c(), paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzhi
 * JD-Core Version:    0.7.0.1
 */