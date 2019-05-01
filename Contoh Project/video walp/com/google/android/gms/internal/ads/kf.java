package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@cm
public final class kf
{
  private boolean a = false;
  private float b = 1.0F;
  
  public static float a(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager == null) {
      return 0.0F;
    }
    int i = localAudioManager.getStreamMaxVolume(3);
    int j = localAudioManager.getStreamVolume(3);
    if (i == 0) {
      return 0.0F;
    }
    return j / i;
  }
  
  /* Error */
  private final boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	com/google/android/gms/internal/ads/kf:b	F
    //   6: fstore_2
    //   7: fload_2
    //   8: fconst_0
    //   9: fcmpl
    //   10: iflt +9 -> 19
    //   13: iconst_1
    //   14: istore_3
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_3
    //   18: ireturn
    //   19: iconst_0
    //   20: istore_3
    //   21: goto -6 -> 15
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	kf
    //   24	4	1	localObject	Object
    //   6	2	2	f	float
    //   14	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
  }
  
  /* Error */
  public final float a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 40	com/google/android/gms/internal/ads/kf:c	()Z
    //   6: ifeq +12 -> 18
    //   9: aload_0
    //   10: getfield 17	com/google/android/gms/internal/ads/kf:b	F
    //   13: fstore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: fload_2
    //   17: freturn
    //   18: fconst_1
    //   19: fstore_2
    //   20: goto -6 -> 14
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	kf
    //   23	4	1	localObject	Object
    //   13	7	2	f	float
    // Exception table:
    //   from	to	target	type
    //   2	14	23	finally
  }
  
  public final void a(float paramFloat)
  {
    try
    {
      this.b = paramFloat;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.a = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kf
 * JD-Core Version:    0.7.0.1
 */