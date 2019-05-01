package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class ajm
  extends ContentObserver
{
  public ajm(ajj paramajj, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    this.a.a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajm
 * JD-Core Version:    0.7.0.1
 */