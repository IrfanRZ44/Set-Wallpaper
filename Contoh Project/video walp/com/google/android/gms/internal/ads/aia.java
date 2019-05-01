package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

public final class aia
  extends aiy
{
  private final Activity d;
  private final View e;
  
  public aia(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2, View paramView, Activity paramActivity)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 62);
    this.e = paramView;
    this.d = paramActivity;
  }
  
  protected final void a()
  {
    if (this.e == null) {
      return;
    }
    arq localarq = asa.bF;
    boolean bool = ((Boolean)aos.f().a(localarq)).booleanValue();
    Method localMethod = this.c;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = this.e;
    arrayOfObject1[1] = this.d;
    arrayOfObject1[2] = Boolean.valueOf(bool);
    Object[] arrayOfObject2 = (Object[])localMethod.invoke(null, arrayOfObject1);
    synchronized (this.b)
    {
      this.b.Q = Long.valueOf(((Long)arrayOfObject2[0]).longValue());
      this.b.R = Long.valueOf(((Long)arrayOfObject2[1]).longValue());
      if (bool) {
        this.b.S = ((String)arrayOfObject2[2]);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aia
 * JD-Core Version:    0.7.0.1
 */