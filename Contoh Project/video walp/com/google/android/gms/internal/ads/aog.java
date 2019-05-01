package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@cm
public final class aog
  extends apt
{
  private final AppEventListener a;
  
  public aog(AppEventListener paramAppEventListener)
  {
    this.a = paramAppEventListener;
  }
  
  public final AppEventListener a()
  {
    return this.a;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.a.onAppEvent(paramString1, paramString2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aog
 * JD-Core Version:    0.7.0.1
 */