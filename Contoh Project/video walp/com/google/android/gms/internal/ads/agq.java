package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

public class agq
{
  protected static volatile amo a = null;
  private static final ConditionVariable d = new ConditionVariable();
  private static volatile Random e = null;
  protected volatile Boolean b;
  private ahn c;
  
  public agq(ahn paramahn)
  {
    this.c = paramahn;
    paramahn.c().execute(new agr(this));
  }
  
  public static int a()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ThreadLocalRandom.current().nextInt();
      }
      int i = c().nextInt();
      return i;
    }
    catch (RuntimeException localRuntimeException) {}
    return c().nextInt();
  }
  
  private static Random c()
  {
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new Random();
      }
      return e;
    }
    finally {}
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      d.block();
      if ((this.b.booleanValue()) && (a != null))
      {
        vj localvj = new vj();
        localvj.a = this.c.a.getPackageName();
        localvj.b = Long.valueOf(paramLong);
        amq localamq = a.a(afc.a(localvj));
        localamq.a(paramInt2);
        localamq.b(paramInt1);
        localamq.a();
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agq
 * JD-Core Version:    0.7.0.1
 */