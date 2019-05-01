package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.kh;

@cm
final class d
  extends RelativeLayout
{
  boolean a;
  private kh b;
  
  public d(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.b = new kh(paramContext, paramString1);
    this.b.b(paramString2);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a) {
      this.b.a(paramMotionEvent);
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.d
 * JD-Core Version:    0.7.0.1
 */