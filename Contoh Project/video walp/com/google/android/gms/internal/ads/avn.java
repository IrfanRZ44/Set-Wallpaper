package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import java.util.List;
import java.util.WeakHashMap;

@cm
public final class avn
  implements NativeCustomTemplateAd
{
  private static WeakHashMap<IBinder, avn> a = new WeakHashMap();
  private final avk b;
  private final MediaView c;
  private final VideoController d;
  
  /* Error */
  private avn(avk paramavk)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 31	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 33	com/google/android/gms/ads/VideoController
    //   8: dup
    //   9: invokespecial 34	com/google/android/gms/ads/VideoController:<init>	()V
    //   12: putfield 36	com/google/android/gms/internal/ads/avn:d	Lcom/google/android/gms/ads/VideoController;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 38	com/google/android/gms/internal/ads/avn:b	Lcom/google/android/gms/internal/ads/avk;
    //   20: aload_1
    //   21: invokeinterface 44 1 0
    //   26: invokestatic 49	com/google/android/gms/a/b:a	(Lcom/google/android/gms/a/a;)Ljava/lang/Object;
    //   29: checkcast 51	android/content/Context
    //   32: astore 8
    //   34: aload 8
    //   36: astore_3
    //   37: aconst_null
    //   38: astore 4
    //   40: aload_3
    //   41: ifnull +41 -> 82
    //   44: new 53	com/google/android/gms/ads/formats/MediaView
    //   47: dup
    //   48: aload_3
    //   49: invokespecial 56	com/google/android/gms/ads/formats/MediaView:<init>	(Landroid/content/Context;)V
    //   52: astore 5
    //   54: aload_0
    //   55: getfield 38	com/google/android/gms/internal/ads/avn:b	Lcom/google/android/gms/internal/ads/avk;
    //   58: aload 5
    //   60: invokestatic 59	com/google/android/gms/a/b:a	(Ljava/lang/Object;)Lcom/google/android/gms/a/a;
    //   63: invokeinterface 62 2 0
    //   68: istore 7
    //   70: iload 7
    //   72: ifne +6 -> 78
    //   75: aconst_null
    //   76: astore 5
    //   78: aload 5
    //   80: astore 4
    //   82: aload_0
    //   83: aload 4
    //   85: putfield 64	com/google/android/gms/internal/ads/avn:c	Lcom/google/android/gms/ads/formats/MediaView;
    //   88: return
    //   89: astore_2
    //   90: ldc 66
    //   92: aload_2
    //   93: invokestatic 71	com/google/android/gms/internal/ads/mk:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   96: aconst_null
    //   97: astore_3
    //   98: goto -61 -> 37
    //   101: astore 6
    //   103: ldc 66
    //   105: aload 6
    //   107: invokestatic 71	com/google/android/gms/internal/ads/mk:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   110: aconst_null
    //   111: astore 4
    //   113: goto -31 -> 82
    //   116: astore_2
    //   117: goto -27 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	avn
    //   0	120	1	paramavk	avk
    //   89	4	2	localRemoteException1	RemoteException
    //   116	1	2	localNullPointerException	java.lang.NullPointerException
    //   36	62	3	localContext1	android.content.Context
    //   38	74	4	localObject	Object
    //   52	27	5	localMediaView	MediaView
    //   101	5	6	localRemoteException2	RemoteException
    //   68	3	7	bool	boolean
    //   32	3	8	localContext2	android.content.Context
    // Exception table:
    //   from	to	target	type
    //   20	34	89	android/os/RemoteException
    //   54	70	101	android/os/RemoteException
    //   20	34	116	java/lang/NullPointerException
  }
  
  public static avn a(avk paramavk)
  {
    synchronized (a)
    {
      avn localavn1 = (avn)a.get(paramavk.asBinder());
      if (localavn1 != null) {
        return localavn1;
      }
      avn localavn2 = new avn(paramavk);
      a.put(paramavk.asBinder(), localavn2);
      return localavn2;
    }
  }
  
  public final avk a()
  {
    return this.b;
  }
  
  public final void destroy()
  {
    try
    {
      this.b.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
  
  public final List<String> getAvailableAssetNames()
  {
    try
    {
      List localList = this.b.a();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final String getCustomTemplateId()
  {
    try
    {
      String str = this.b.l();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final NativeAd.Image getImage(String paramString)
  {
    try
    {
      aun localaun = this.b.b(paramString);
      if (localaun != null)
      {
        auq localauq = new auq(localaun);
        return localauq;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence getText(String paramString)
  {
    try
    {
      String str = this.b.a(paramString);
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
    return null;
  }
  
  public final VideoController getVideoController()
  {
    try
    {
      aqg localaqg = this.b.c();
      if (localaqg != null) {
        this.d.zza(localaqg);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Exception occurred while getting video controller", localRemoteException);
      }
    }
    return this.d;
  }
  
  public final MediaView getVideoMediaView()
  {
    return this.c;
  }
  
  public final void performClick(String paramString)
  {
    try
    {
      this.b.c(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
  
  public final void recordImpression()
  {
    try
    {
      this.b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avn
 * JD-Core Version:    0.7.0.1
 */