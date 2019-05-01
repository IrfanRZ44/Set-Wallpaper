package com.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.a.a.c.b.a.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class t
{
  private static final Paint a = new Paint(6);
  private static final Paint b = new Paint(7);
  private static final Paint c;
  private static final Set<String> d = new HashSet(Arrays.asList(new String[] { "XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079" }));
  private static final Lock e;
  
  static
  {
    if (d.contains(Build.MODEL)) {}
    for (Object localObject = new ReentrantLock();; localObject = new a())
    {
      e = (Lock)localObject;
      c = new Paint(7);
      c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      return;
    }
  }
  
  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 5: 
    case 6: 
      return 90;
    case 3: 
    case 4: 
      return 180;
    }
    return 270;
  }
  
  private static Bitmap.Config a(Bitmap paramBitmap)
  {
    if (paramBitmap.getConfig() != null) {
      return paramBitmap.getConfig();
    }
    return Bitmap.Config.ARGB_8888;
  }
  
  public static Bitmap a(e parame, Bitmap paramBitmap, int paramInt)
  {
    if (!b(paramInt)) {
      return paramBitmap;
    }
    Matrix localMatrix = new Matrix();
    a(paramInt, localMatrix);
    RectF localRectF = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
    localMatrix.mapRect(localRectF);
    Bitmap localBitmap = parame.a(Math.round(localRectF.width()), Math.round(localRectF.height()), a(paramBitmap));
    localMatrix.postTranslate(-localRectF.left, -localRectF.top);
    a(paramBitmap, localBitmap, localMatrix);
    return localBitmap;
  }
  
  public static Bitmap a(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    if ((paramBitmap.getWidth() == paramInt1) && (paramBitmap.getHeight() == paramInt2)) {
      return paramBitmap;
    }
    Matrix localMatrix = new Matrix();
    float f2;
    if (paramInt2 * paramBitmap.getWidth() > paramInt1 * paramBitmap.getHeight()) {
      f2 = paramInt2 / paramBitmap.getHeight();
    }
    for (float f3 = 0.5F * (paramInt1 - f2 * paramBitmap.getWidth());; f3 = 0.0F)
    {
      localMatrix.setScale(f2, f2);
      localMatrix.postTranslate((int)(f3 + 0.5F), (int)(f1 + 0.5F));
      Bitmap localBitmap = parame.a(paramInt1, paramInt2, a(paramBitmap));
      a(paramBitmap, localBitmap);
      a(paramBitmap, localBitmap, localMatrix);
      return localBitmap;
      f2 = paramInt1 / paramBitmap.getWidth();
      f1 = 0.5F * (paramInt2 - f2 * paramBitmap.getHeight());
    }
  }
  
  public static Lock a()
  {
    return e;
  }
  
  static void a(int paramInt, Matrix paramMatrix)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2: 
      paramMatrix.setScale(-1.0F, 1.0F);
      return;
    case 3: 
      paramMatrix.setRotate(180.0F);
      return;
    case 4: 
      paramMatrix.setRotate(180.0F);
      paramMatrix.postScale(-1.0F, 1.0F);
      return;
    case 5: 
      paramMatrix.setRotate(90.0F);
      paramMatrix.postScale(-1.0F, 1.0F);
      return;
    case 6: 
      paramMatrix.setRotate(90.0F);
      return;
    case 7: 
      paramMatrix.setRotate(-90.0F);
      paramMatrix.postScale(-1.0F, 1.0F);
      return;
    }
    paramMatrix.setRotate(-90.0F);
  }
  
  public static void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    paramBitmap2.setHasAlpha(paramBitmap1.hasAlpha());
  }
  
  private static void a(Bitmap paramBitmap1, Bitmap paramBitmap2, Matrix paramMatrix)
  {
    e.lock();
    try
    {
      Canvas localCanvas = new Canvas(paramBitmap2);
      localCanvas.drawBitmap(paramBitmap1, paramMatrix, a);
      a(localCanvas);
      return;
    }
    finally
    {
      e.unlock();
    }
  }
  
  private static void a(Canvas paramCanvas)
  {
    paramCanvas.setBitmap(null);
  }
  
  public static Bitmap b(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap.getWidth() == paramInt1) && (paramBitmap.getHeight() == paramInt2)) {
      if (Log.isLoggable("TransformationUtils", 2)) {
        Log.v("TransformationUtils", "requested target size matches input, returning input");
      }
    }
    float f;
    do
    {
      return paramBitmap;
      f = Math.min(paramInt1 / paramBitmap.getWidth(), paramInt2 / paramBitmap.getHeight());
      int i = Math.round(f * paramBitmap.getWidth());
      int j = Math.round(f * paramBitmap.getHeight());
      if ((paramBitmap.getWidth() != i) || (paramBitmap.getHeight() != j)) {
        break;
      }
    } while (!Log.isLoggable("TransformationUtils", 2));
    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
    return paramBitmap;
    Bitmap localBitmap = parame.a((int)(f * paramBitmap.getWidth()), (int)(f * paramBitmap.getHeight()), a(paramBitmap));
    a(paramBitmap, localBitmap);
    if (Log.isLoggable("TransformationUtils", 2))
    {
      Log.v("TransformationUtils", "request: " + paramInt1 + "x" + paramInt2);
      Log.v("TransformationUtils", "toFit:   " + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
      Log.v("TransformationUtils", "toReuse: " + localBitmap.getWidth() + "x" + localBitmap.getHeight());
      Log.v("TransformationUtils", "minPct:   " + f);
    }
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(f, f);
    a(paramBitmap, localBitmap, localMatrix);
    return localBitmap;
  }
  
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static Bitmap c(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap.getWidth() <= paramInt1) && (paramBitmap.getHeight() <= paramInt2))
    {
      if (Log.isLoggable("TransformationUtils", 2)) {
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
      }
      return paramBitmap;
    }
    if (Log.isLoggable("TransformationUtils", 2)) {
      Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
    }
    return b(parame, paramBitmap, paramInt1, paramInt2);
  }
  
  private static final class a
    implements Lock
  {
    public void lock() {}
    
    public void lockInterruptibly() {}
    
    public Condition newCondition()
    {
      throw new UnsupportedOperationException("Should not be called");
    }
    
    public boolean tryLock()
    {
      return true;
    }
    
    public boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
    {
      return true;
    }
    
    public void unlock() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.t
 * JD-Core Version:    0.7.0.1
 */