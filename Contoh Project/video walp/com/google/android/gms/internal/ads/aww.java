package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

final class aww
  implements Runnable
{
  aww(awv paramawv, PublisherAdView paramPublisherAdView, apj paramapj) {}
  
  public final void run()
  {
    if (this.a.zza(this.b))
    {
      awv.a(this.c).onPublisherAdViewLoaded(this.a);
      return;
    }
    mk.e("Could not bind.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aww
 * JD-Core Version:    0.7.0.1
 */