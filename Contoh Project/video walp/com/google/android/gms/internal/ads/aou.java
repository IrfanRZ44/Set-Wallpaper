package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@cm
public class aou
  extends AdListener
{
  private final Object a = new Object();
  private AdListener b;
  
  public final void a(AdListener paramAdListener)
  {
    synchronized (this.a)
    {
      this.b = paramAdListener;
      return;
    }
  }
  
  public void onAdClosed()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.onAdClosed();
      }
      return;
    }
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.onAdFailedToLoad(paramInt);
      }
      return;
    }
  }
  
  public void onAdLeftApplication()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.onAdLeftApplication();
      }
      return;
    }
  }
  
  public void onAdLoaded()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.onAdLoaded();
      }
      return;
    }
  }
  
  public void onAdOpened()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.onAdOpened();
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aou
 * JD-Core Version:    0.7.0.1
 */