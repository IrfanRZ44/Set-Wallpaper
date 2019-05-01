package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.internal.ads.hu;

final class ao
  implements View.OnTouchListener
{
  ao(am paramam, zzx paramzzx) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.a.recordClick();
    if (this.b.b != null) {
      this.b.b.c();
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ao
 * JD-Core Version:    0.7.0.1
 */