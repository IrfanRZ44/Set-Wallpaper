package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aib
  extends aiy
{
  public aib(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 49);
  }
  
  protected final void a()
  {
    this.b.F = Integer.valueOf(2);
    for (;;)
    {
      try
      {
        Method localMethod = this.c;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a.a();
        boolean bool = ((Boolean)localMethod.invoke(null, arrayOfObject)).booleanValue();
        zo localzo = this.b;
        if (bool)
        {
          i = 1;
          localzo.F = Integer.valueOf(i);
          return;
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        int i;
        if ((localInvocationTargetException.getTargetException() instanceof Settings.SettingNotFoundException)) {
          continue;
        }
        throw localInvocationTargetException;
      }
      i = 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aib
 * JD-Core Version:    0.7.0.1
 */