package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.internal.ads.agw;

final class ab
  implements View.OnTouchListener
{
  ab(zzbp paramzzbp) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (zzbp.b(this.a) != null) {
      zzbp.b(this.a).a(paramMotionEvent);
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ab
 * JD-Core Version:    0.7.0.1
 */