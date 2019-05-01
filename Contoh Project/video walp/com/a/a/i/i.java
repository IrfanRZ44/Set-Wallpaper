package com.a.a.i;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.a.a.c.c.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class i
{
  private static final char[] a = "0123456789abcdef".toCharArray();
  private static final char[] b = new char[64];
  
  public static int a(float paramFloat)
  {
    return a(paramFloat, 17);
  }
  
  public static int a(float paramFloat, int paramInt)
  {
    return b(Float.floatToIntBits(paramFloat), paramInt);
  }
  
  public static int a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return paramInt1 * paramInt2 * a(paramConfig);
  }
  
  private static int a(Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      paramConfig = Bitmap.Config.ARGB_8888;
    }
    switch (1.a[paramConfig.ordinal()])
    {
    default: 
      return 4;
    case 1: 
      return 1;
    case 2: 
    case 3: 
      return 2;
    }
    return 8;
  }
  
  @TargetApi(19)
  public static int a(Bitmap paramBitmap)
  {
    if (paramBitmap.isRecycled()) {
      throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + paramBitmap + "[" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight() + "] " + paramBitmap.getConfig());
    }
    if (Build.VERSION.SDK_INT >= 19) {
      try
      {
        int i = paramBitmap.getAllocationByteCount();
        return i;
      }
      catch (NullPointerException localNullPointerException) {}
    }
    return paramBitmap.getHeight() * paramBitmap.getRowBytes();
  }
  
  public static int a(Object paramObject, int paramInt)
  {
    if (paramObject == null) {}
    for (int i = 0;; i = paramObject.hashCode()) {
      return b(i, paramInt);
    }
  }
  
  public static int a(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return b(i, paramInt);
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    synchronized (b)
    {
      String str = a(paramArrayOfByte, b);
      return str;
    }
  }
  
  private static String a(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = 0xFF & paramArrayOfByte[i];
      paramArrayOfChar[(i * 2)] = a[(j >>> 4)];
      paramArrayOfChar[(1 + i * 2)] = a[(j & 0xF)];
    }
    return new String(paramArrayOfChar);
  }
  
  public static <T> List<T> a(Collection<T> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static <T> Queue<T> a(int paramInt)
  {
    return new ArrayDeque(paramInt);
  }
  
  public static void a()
  {
    if (!b()) {
      throw new IllegalArgumentException("You must call this method on the main thread");
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return (b(paramInt1)) && (b(paramInt2));
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 + paramInt2 * 31;
  }
  
  public static boolean b()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  private static boolean b(int paramInt)
  {
    return (paramInt > 0) || (paramInt == -2147483648);
  }
  
  public static boolean b(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    if ((paramObject1 instanceof l)) {
      return ((l)paramObject1).a(paramObject2);
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean c()
  {
    return !b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.i
 * JD-Core Version:    0.7.0.1
 */