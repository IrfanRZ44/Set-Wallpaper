package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;

public class f
  extends Handler
  implements l
{
  private final k a;
  private final int b;
  private final c c;
  private boolean d;
  
  protected f(c paramc, Looper paramLooper, int paramInt)
  {
    super(paramLooper);
    this.c = paramc;
    this.b = paramInt;
    this.a = new k();
  }
  
  public void a(q paramq, Object paramObject)
  {
    j localj = j.a(paramq, paramObject);
    try
    {
      this.a.a(localj);
      if (!this.d)
      {
        this.d = true;
        if (!sendMessage(obtainMessage())) {
          throw new e("Could not send handler message");
        }
      }
    }
    finally {}
  }
  
  /* Error */
  public void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: invokestatic 64	android/os/SystemClock:uptimeMillis	()J
    //   3: lstore_3
    //   4: aload_0
    //   5: getfield 30	org/greenrobot/eventbus/f:a	Lorg/greenrobot/eventbus/k;
    //   8: invokevirtual 67	org/greenrobot/eventbus/k:a	()Lorg/greenrobot/eventbus/j;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnonnull +34 -> 49
    //   18: aload_0
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 30	org/greenrobot/eventbus/f:a	Lorg/greenrobot/eventbus/k;
    //   24: invokevirtual 67	org/greenrobot/eventbus/k:a	()Lorg/greenrobot/eventbus/j;
    //   27: astore 5
    //   29: aload 5
    //   31: ifnonnull +16 -> 47
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 41	org/greenrobot/eventbus/f:d	Z
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 41	org/greenrobot/eventbus/f:d	Z
    //   46: return
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_0
    //   50: getfield 21	org/greenrobot/eventbus/f:c	Lorg/greenrobot/eventbus/c;
    //   53: aload 5
    //   55: invokevirtual 70	org/greenrobot/eventbus/c:a	(Lorg/greenrobot/eventbus/j;)V
    //   58: invokestatic 64	android/os/SystemClock:uptimeMillis	()J
    //   61: lload_3
    //   62: lsub
    //   63: aload_0
    //   64: getfield 23	org/greenrobot/eventbus/f:b	I
    //   67: i2l
    //   68: lcmp
    //   69: iflt -65 -> 4
    //   72: aload_0
    //   73: aload_0
    //   74: invokevirtual 45	org/greenrobot/eventbus/f:obtainMessage	()Landroid/os/Message;
    //   77: invokevirtual 49	org/greenrobot/eventbus/f:sendMessage	(Landroid/os/Message;)Z
    //   80: ifne +28 -> 108
    //   83: new 51	org/greenrobot/eventbus/e
    //   86: dup
    //   87: ldc 53
    //   89: invokespecial 56	org/greenrobot/eventbus/e:<init>	(Ljava/lang/String;)V
    //   92: athrow
    //   93: astore_2
    //   94: aload_0
    //   95: iconst_0
    //   96: putfield 41	org/greenrobot/eventbus/f:d	Z
    //   99: aload_2
    //   100: athrow
    //   101: astore 6
    //   103: aload_0
    //   104: monitorexit
    //   105: aload 6
    //   107: athrow
    //   108: aload_0
    //   109: iconst_1
    //   110: putfield 41	org/greenrobot/eventbus/f:d	Z
    //   113: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	f
    //   0	114	1	paramMessage	android.os.Message
    //   93	7	2	localObject1	Object
    //   3	59	3	l	long
    //   11	43	5	localj	j
    //   101	5	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	93	finally
    //   4	13	93	finally
    //   18	20	93	finally
    //   49	93	93	finally
    //   105	108	93	finally
    //   20	29	101	finally
    //   34	41	101	finally
    //   47	49	101	finally
    //   103	105	101	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.f
 * JD-Core Version:    0.7.0.1
 */