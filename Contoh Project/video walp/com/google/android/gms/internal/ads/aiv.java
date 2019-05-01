package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Method;

public final class aiv
  extends aiy
{
  private final View d;
  
  public aiv(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2, View paramView)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 57);
    this.d = paramView;
  }
  
  protected final void a()
  {
    if (this.d != null)
    {
      DisplayMetrics localDisplayMetrics = this.a.a().getResources().getDisplayMetrics();
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.d;
      arrayOfObject[1] = localDisplayMetrics;
      ahw localahw = new ahw((String)localMethod.invoke(null, arrayOfObject));
      abq localabq = new abq();
      localabq.a = localahw.a;
      localabq.b = localahw.b;
      localabq.c = localahw.c;
      this.b.M = localabq;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aiv
 * JD-Core Version:    0.7.0.1
 */