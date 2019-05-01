package com.a.a.c.b.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i
{
  private final int a;
  private final int b;
  private final Context c;
  private final int d;
  
  i(a parama)
  {
    this.c = parama.b;
    int i;
    int j;
    int i1;
    label129:
    StringBuilder localStringBuilder;
    if (a(parama.c))
    {
      i = parama.i / 2;
      this.d = i;
      j = a(parama.c, parama.g, parama.h);
      int k = 4 * (parama.d.a() * parama.d.b());
      int m = Math.round(k * parama.f);
      int n = Math.round(k * parama.e);
      i1 = j - this.d;
      if (n + m > i1) {
        break label280;
      }
      this.b = n;
      this.a = m;
      if (Log.isLoggable("MemorySizeCalculator", 3))
      {
        localStringBuilder = new StringBuilder().append("Calculation complete, Calculated memory cache size: ").append(a(this.b)).append(", pool size: ").append(a(this.a)).append(", byte array size: ").append(a(this.d)).append(", memory class limited? ");
        if (n + m <= j) {
          break label326;
        }
      }
    }
    label280:
    label326:
    for (boolean bool = true;; bool = false)
    {
      Log.d("MemorySizeCalculator", bool + ", max size: " + a(j) + ", memoryClass: " + parama.c.getMemoryClass() + ", isLowMemoryDevice: " + a(parama.c));
      return;
      i = parama.i;
      break;
      float f = i1 / (parama.f + parama.e);
      this.b = Math.round(f * parama.e);
      this.a = Math.round(f * parama.f);
      break label129;
    }
  }
  
  private static int a(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2)
  {
    int i = 1024 * (1024 * paramActivityManager.getMemoryClass());
    boolean bool = a(paramActivityManager);
    float f = i;
    if (bool) {}
    for (;;)
    {
      return Math.round(f * paramFloat2);
      paramFloat2 = paramFloat1;
    }
  }
  
  private String a(int paramInt)
  {
    return Formatter.formatFileSize(this.c, paramInt);
  }
  
  @TargetApi(19)
  static boolean a(ActivityManager paramActivityManager)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramActivityManager.isLowRamDevice();
    }
    return true;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public static final class a
  {
    static final int a;
    final Context b;
    ActivityManager c;
    i.c d;
    float e = 2.0F;
    float f = a;
    float g = 0.4F;
    float h = 0.33F;
    int i = 4194304;
    
    static
    {
      if (Build.VERSION.SDK_INT < 26) {}
      for (int j = 4;; j = 1)
      {
        a = j;
        return;
      }
    }
    
    public a(Context paramContext)
    {
      this.b = paramContext;
      this.c = ((ActivityManager)paramContext.getSystemService("activity"));
      this.d = new i.b(paramContext.getResources().getDisplayMetrics());
      if ((Build.VERSION.SDK_INT >= 26) && (i.a(this.c))) {
        this.f = 0.0F;
      }
    }
    
    public i a()
    {
      return new i(this);
    }
  }
  
  private static final class b
    implements i.c
  {
    private final DisplayMetrics a;
    
    b(DisplayMetrics paramDisplayMetrics)
    {
      this.a = paramDisplayMetrics;
    }
    
    public int a()
    {
      return this.a.widthPixels;
    }
    
    public int b()
    {
      return this.a.heightPixels;
    }
  }
  
  static abstract interface c
  {
    public abstract int a();
    
    public abstract int b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.i
 * JD-Core Version:    0.7.0.1
 */