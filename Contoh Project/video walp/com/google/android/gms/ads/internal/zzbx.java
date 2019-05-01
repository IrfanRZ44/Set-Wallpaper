package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.qe;
import java.util.ArrayList;
import java.util.List;

public final class zzbx
  extends ViewSwitcher
{
  private final kh a;
  private final ly b;
  private boolean c;
  
  public zzbx(Context paramContext, String paramString1, String paramString2, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramContext);
    this.a = new kh(paramContext);
    this.a.a(paramString1);
    this.a.b(paramString2);
    this.c = true;
    if ((paramContext instanceof Activity)) {}
    for (this.b = new ly((Activity)paramContext, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener);; this.b = new ly(null, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener))
    {
      this.b.a();
      return;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.b != null) {
      this.b.c();
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b != null) {
      this.b.d();
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.c) {
      this.a.a(paramMotionEvent);
    }
    return false;
  }
  
  public final void removeAllViews()
  {
    int i = 0;
    ArrayList localArrayList1 = new ArrayList();
    for (int j = 0; j < getChildCount(); j++)
    {
      View localView = getChildAt(j);
      if ((localView != null) && ((localView instanceof qe))) {
        localArrayList1.add((qe)localView);
      }
    }
    super.removeAllViews();
    ArrayList localArrayList2 = (ArrayList)localArrayList1;
    int k = localArrayList2.size();
    while (i < k)
    {
      Object localObject = localArrayList2.get(i);
      i++;
      ((qe)localObject).destroy();
    }
  }
  
  public final kh zzfr()
  {
    return this.a;
  }
  
  public final void zzfs()
  {
    je.a("Disable position monitoring on adFrame.");
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public final void zzft()
  {
    je.a("Enable debug gesture detector on adFrame.");
    this.c = true;
  }
  
  public final void zzfu()
  {
    je.a("Disable debug gesture detector on adFrame.");
    this.c = false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbx
 * JD-Core Version:    0.7.0.1
 */