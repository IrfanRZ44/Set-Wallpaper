package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

@cm
final class ayw
{
  final zzjj a;
  final String b;
  final int c;
  
  ayw(ayr paramayr)
  {
    this(paramayr.a(), paramayr.c(), paramayr.b());
  }
  
  private ayw(zzjj paramzzjj, String paramString, int paramInt)
  {
    this.a = paramzzjj;
    this.b = paramString;
    this.c = paramInt;
  }
  
  /* Error */
  static ayw a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 45
    //   3: invokevirtual 51	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   6: astore_1
    //   7: aload_1
    //   8: arraylength
    //   9: iconst_3
    //   10: if_icmpeq +13 -> 23
    //   13: new 53	java/io/IOException
    //   16: dup
    //   17: ldc 55
    //   19: invokespecial 58	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   22: athrow
    //   23: invokestatic 64	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   26: astore_2
    //   27: new 47	java/lang/String
    //   30: dup
    //   31: aload_1
    //   32: iconst_0
    //   33: aaload
    //   34: iconst_0
    //   35: invokestatic 70	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   38: ldc 72
    //   40: invokespecial 75	java/lang/String:<init>	([BLjava/lang/String;)V
    //   43: astore_3
    //   44: aload_1
    //   45: iconst_1
    //   46: aaload
    //   47: invokestatic 81	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   50: istore 6
    //   52: aload_1
    //   53: iconst_2
    //   54: aaload
    //   55: iconst_0
    //   56: invokestatic 70	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   59: astore 7
    //   61: aload_2
    //   62: aload 7
    //   64: iconst_0
    //   65: aload 7
    //   67: arraylength
    //   68: invokevirtual 85	android/os/Parcel:unmarshall	([BII)V
    //   71: aload_2
    //   72: iconst_0
    //   73: invokevirtual 89	android/os/Parcel:setDataPosition	(I)V
    //   76: new 2	com/google/android/gms/internal/ads/ayw
    //   79: dup
    //   80: getstatic 95	com/google/android/gms/internal/ads/zzjj:CREATOR	Landroid/os/Parcelable$Creator;
    //   83: aload_2
    //   84: invokeinterface 101 2 0
    //   89: checkcast 91	com/google/android/gms/internal/ads/zzjj
    //   92: aload_3
    //   93: iload 6
    //   95: invokespecial 27	com/google/android/gms/internal/ads/ayw:<init>	(Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;I)V
    //   98: astore 8
    //   100: aload_2
    //   101: invokevirtual 104	android/os/Parcel:recycle	()V
    //   104: aload 8
    //   106: areturn
    //   107: astore 4
    //   109: invokestatic 110	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   112: aload 4
    //   114: ldc 112
    //   116: invokevirtual 117	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   119: new 53	java/io/IOException
    //   122: dup
    //   123: ldc 119
    //   125: aload 4
    //   127: invokespecial 122	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: athrow
    //   131: astore 5
    //   133: aload_2
    //   134: invokevirtual 104	android/os/Parcel:recycle	()V
    //   137: aload 5
    //   139: athrow
    //   140: astore 4
    //   142: goto -33 -> 109
    //   145: astore 4
    //   147: goto -38 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramString	String
    //   6	47	1	arrayOfString	String[]
    //   26	108	2	localParcel	Parcel
    //   43	50	3	str	String
    //   107	19	4	locala	com.google.android.gms.common.internal.safeparcel.a.a
    //   140	1	4	localIllegalStateException	java.lang.IllegalStateException
    //   145	1	4	localIllegalArgumentException	java.lang.IllegalArgumentException
    //   131	7	5	localObject	Object
    //   50	44	6	i	int
    //   59	7	7	arrayOfByte	byte[]
    //   98	7	8	localayw	ayw
    // Exception table:
    //   from	to	target	type
    //   27	100	107	com/google/android/gms/common/internal/safeparcel/a$a
    //   27	100	131	finally
    //   109	131	131	finally
    //   27	100	140	java/lang/IllegalStateException
    //   27	100	145	java/lang/IllegalArgumentException
  }
  
  final String a()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      String str1 = Base64.encodeToString(this.b.getBytes("UTF-8"), 0);
      String str2 = Integer.toString(this.c);
      this.a.writeToParcel(localParcel, 0);
      String str3 = Base64.encodeToString(localParcel.marshall(), 0);
      String str4 = 2 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + "" + str2 + "" + str3;
      return str4;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      je.c("QueueSeed encode failed because UTF-8 is not available.");
      return "";
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayw
 * JD-Core Version:    0.7.0.1
 */