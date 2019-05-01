package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class ajl
  implements akv
{
  private WeakReference<atq> a;
  
  public ajl(atq paramatq)
  {
    this.a = new WeakReference(paramatq);
  }
  
  public final View a()
  {
    atq localatq = (atq)this.a.get();
    if (localatq != null) {
      return localatq.l();
    }
    return null;
  }
  
  public final boolean b()
  {
    return this.a.get() == null;
  }
  
  public final akv c()
  {
    return new ajn((atq)this.a.get());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajl
 * JD-Core Version:    0.7.0.1
 */