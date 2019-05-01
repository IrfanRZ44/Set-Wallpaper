package com.a.a.c.b.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k
  implements e
{
  private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
  private final l b;
  private final Set<Bitmap.Config> c;
  private final long d;
  private final a e;
  private long f;
  private long g;
  private int h;
  private int i;
  private int j;
  private int k;
  
  public k(long paramLong)
  {
    this(paramLong, e(), f());
  }
  
  k(long paramLong, l paraml, Set<Bitmap.Config> paramSet)
  {
    this.d = paramLong;
    this.f = paramLong;
    this.b = paraml;
    this.c = paramSet;
    this.e = new b();
  }
  
  /* Error */
  private void a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	com/a/a/c/b/a/k:g	J
    //   6: lload_1
    //   7: lcmp
    //   8: ifle +45 -> 53
    //   11: aload_0
    //   12: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   15: invokeinterface 66 1 0
    //   20: astore 4
    //   22: aload 4
    //   24: ifnonnull +32 -> 56
    //   27: ldc 68
    //   29: iconst_5
    //   30: invokestatic 74	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   33: ifeq +15 -> 48
    //   36: ldc 68
    //   38: ldc 76
    //   40: invokestatic 80	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   43: pop
    //   44: aload_0
    //   45: invokespecial 82	com/a/a/c/b/a/k:d	()V
    //   48: aload_0
    //   49: lconst_0
    //   50: putfield 61	com/a/a/c/b/a/k:g	J
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: aload_0
    //   57: getfield 59	com/a/a/c/b/a/k:e	Lcom/a/a/c/b/a/k$a;
    //   60: aload 4
    //   62: invokeinterface 87 2 0
    //   67: aload_0
    //   68: aload_0
    //   69: getfield 61	com/a/a/c/b/a/k:g	J
    //   72: aload_0
    //   73: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   76: aload 4
    //   78: invokeinterface 90 2 0
    //   83: i2l
    //   84: lsub
    //   85: putfield 61	com/a/a/c/b/a/k:g	J
    //   88: aload_0
    //   89: iconst_1
    //   90: aload_0
    //   91: getfield 92	com/a/a/c/b/a/k:k	I
    //   94: iadd
    //   95: putfield 92	com/a/a/c/b/a/k:k	I
    //   98: ldc 68
    //   100: iconst_3
    //   101: invokestatic 74	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   104: ifeq +38 -> 142
    //   107: ldc 68
    //   109: new 94	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   116: ldc 97
    //   118: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload_0
    //   122: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   125: aload 4
    //   127: invokeinterface 104 2 0
    //   132: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 110	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: aload_0
    //   143: invokespecial 112	com/a/a/c/b/a/k:c	()V
    //   146: aload 4
    //   148: invokevirtual 117	android/graphics/Bitmap:recycle	()V
    //   151: goto -149 -> 2
    //   154: astore_3
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_3
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	k
    //   0	159	1	paramLong	long
    //   154	4	3	localObject	Object
    //   20	127	4	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   2	22	154	finally
    //   27	48	154	finally
    //   48	53	154	finally
    //   56	142	154	finally
    //   142	151	154	finally
  }
  
  @TargetApi(26)
  private static void a(Bitmap.Config paramConfig)
  {
    if (Build.VERSION.SDK_INT < 26) {}
    while (paramConfig != Bitmap.Config.HARDWARE) {
      return;
    }
    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + paramConfig + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
  }
  
  private void b()
  {
    a(this.f);
  }
  
  private static void b(Bitmap paramBitmap)
  {
    paramBitmap.setHasAlpha(true);
    c(paramBitmap);
  }
  
  private static Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    if (paramConfig != null) {}
    for (;;)
    {
      return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      paramConfig = a;
    }
  }
  
  private void c()
  {
    if (Log.isLoggable("LruBitmapPool", 2)) {
      d();
    }
  }
  
  @TargetApi(19)
  private static void c(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramBitmap.setPremultiplied(true);
    }
  }
  
  /* Error */
  private Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: invokestatic 159	com/a/a/c/b/a/k:a	(Landroid/graphics/Bitmap$Config;)V
    //   6: aload_0
    //   7: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   10: astore 5
    //   12: aload_3
    //   13: ifnull +133 -> 146
    //   16: aload_3
    //   17: astore 6
    //   19: aload 5
    //   21: iload_1
    //   22: iload_2
    //   23: aload 6
    //   25: invokeinterface 161 4 0
    //   30: astore 7
    //   32: aload 7
    //   34: ifnonnull +120 -> 154
    //   37: ldc 68
    //   39: iconst_3
    //   40: invokestatic 74	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   43: ifeq +39 -> 82
    //   46: ldc 68
    //   48: new 94	java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   55: ldc 163
    //   57: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_0
    //   61: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   64: iload_1
    //   65: iload_2
    //   66: aload_3
    //   67: invokeinterface 166 4 0
    //   72: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 110	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   81: pop
    //   82: aload_0
    //   83: iconst_1
    //   84: aload_0
    //   85: getfield 168	com/a/a/c/b/a/k:i	I
    //   88: iadd
    //   89: putfield 168	com/a/a/c/b/a/k:i	I
    //   92: ldc 68
    //   94: iconst_2
    //   95: invokestatic 74	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   98: ifeq +39 -> 137
    //   101: ldc 68
    //   103: new 94	java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   110: ldc 170
    //   112: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload_0
    //   116: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   119: iload_1
    //   120: iload_2
    //   121: aload_3
    //   122: invokeinterface 166 4 0
    //   127: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokestatic 173	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   136: pop
    //   137: aload_0
    //   138: invokespecial 112	com/a/a/c/b/a/k:c	()V
    //   141: aload_0
    //   142: monitorexit
    //   143: aload 7
    //   145: areturn
    //   146: getstatic 33	com/a/a/c/b/a/k:a	Landroid/graphics/Bitmap$Config;
    //   149: astore 6
    //   151: goto -132 -> 19
    //   154: aload_0
    //   155: iconst_1
    //   156: aload_0
    //   157: getfield 175	com/a/a/c/b/a/k:h	I
    //   160: iadd
    //   161: putfield 175	com/a/a/c/b/a/k:h	I
    //   164: aload_0
    //   165: aload_0
    //   166: getfield 61	com/a/a/c/b/a/k:g	J
    //   169: aload_0
    //   170: getfield 52	com/a/a/c/b/a/k:b	Lcom/a/a/c/b/a/l;
    //   173: aload 7
    //   175: invokeinterface 90 2 0
    //   180: i2l
    //   181: lsub
    //   182: putfield 61	com/a/a/c/b/a/k:g	J
    //   185: aload_0
    //   186: getfield 59	com/a/a/c/b/a/k:e	Lcom/a/a/c/b/a/k$a;
    //   189: aload 7
    //   191: invokeinterface 87 2 0
    //   196: aload 7
    //   198: invokestatic 176	com/a/a/c/b/a/k:b	(Landroid/graphics/Bitmap;)V
    //   201: goto -109 -> 92
    //   204: astore 4
    //   206: aload_0
    //   207: monitorexit
    //   208: aload 4
    //   210: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	k
    //   0	211	1	paramInt1	int
    //   0	211	2	paramInt2	int
    //   0	211	3	paramConfig	Bitmap.Config
    //   204	5	4	localObject	Object
    //   10	10	5	locall	l
    //   17	133	6	localConfig	Bitmap.Config
    //   30	167	7	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   2	12	204	finally
    //   19	32	204	finally
    //   37	82	204	finally
    //   82	92	204	finally
    //   92	137	204	finally
    //   137	141	204	finally
    //   146	151	204	finally
    //   154	201	204	finally
  }
  
  private void d()
  {
    Log.v("LruBitmapPool", "Hits=" + this.h + ", misses=" + this.i + ", puts=" + this.j + ", evictions=" + this.k + ", currentSize=" + this.g + ", maxSize=" + this.f + "\nStrategy=" + this.b);
  }
  
  private static l e()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return new n();
    }
    return new c();
  }
  
  @TargetApi(26)
  private static Set<Bitmap.Config> f()
  {
    HashSet localHashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
    if (Build.VERSION.SDK_INT >= 19) {
      localHashSet.add(null);
    }
    if (Build.VERSION.SDK_INT >= 26) {
      localHashSet.remove(Bitmap.Config.HARDWARE);
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = d(paramInt1, paramInt2, paramConfig);
    if (localBitmap != null)
    {
      localBitmap.eraseColor(0);
      return localBitmap;
    }
    return c(paramInt1, paramInt2, paramConfig);
  }
  
  public void a()
  {
    if (Log.isLoggable("LruBitmapPool", 3)) {
      Log.d("LruBitmapPool", "clearMemory");
    }
    a(0L);
  }
  
  @SuppressLint({"InlinedApi"})
  public void a(int paramInt)
  {
    if (Log.isLoggable("LruBitmapPool", 3)) {
      Log.d("LruBitmapPool", "trimMemory, level=" + paramInt);
    }
    if (paramInt >= 40) {
      a();
    }
    while (paramInt < 20) {
      return;
    }
    a(this.f / 2L);
  }
  
  public void a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      try
      {
        throw new NullPointerException("Bitmap must not be null");
      }
      finally {}
    }
    if (paramBitmap.isRecycled()) {
      throw new IllegalStateException("Cannot pool recycled bitmap");
    }
    if ((!paramBitmap.isMutable()) || (this.b.c(paramBitmap) > this.f) || (!this.c.contains(paramBitmap.getConfig())))
    {
      if (Log.isLoggable("LruBitmapPool", 2)) {
        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.b(paramBitmap) + ", is mutable: " + paramBitmap.isMutable() + ", is allowed config: " + this.c.contains(paramBitmap.getConfig()));
      }
      paramBitmap.recycle();
    }
    for (;;)
    {
      return;
      int m = this.b.c(paramBitmap);
      this.b.a(paramBitmap);
      this.e.a(paramBitmap);
      this.j = (1 + this.j);
      this.g += m;
      if (Log.isLoggable("LruBitmapPool", 2)) {
        Log.v("LruBitmapPool", "Put bitmap in pool=" + this.b.b(paramBitmap));
      }
      c();
      b();
    }
  }
  
  public Bitmap b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = d(paramInt1, paramInt2, paramConfig);
    if (localBitmap == null) {
      localBitmap = c(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap;
  }
  
  private static abstract interface a
  {
    public abstract void a(Bitmap paramBitmap);
    
    public abstract void b(Bitmap paramBitmap);
  }
  
  private static final class b
    implements k.a
  {
    public void a(Bitmap paramBitmap) {}
    
    public void b(Bitmap paramBitmap) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.k
 * JD-Core Version:    0.7.0.1
 */