package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class bi
{
  private final Object a = new Object();
  private final Context b;
  private final agw c;
  private final ik d;
  private final asn e;
  private final zzbc f;
  private ViewTreeObserver.OnGlobalLayoutListener g;
  private ViewTreeObserver.OnScrollChangedListener h;
  private final DisplayMetrics i;
  private lo j;
  @GuardedBy("mLock")
  private int k = -1;
  @GuardedBy("mLock")
  private int l = -1;
  
  public bi(Context paramContext, agw paramagw, ik paramik, asn paramasn, zzbc paramzzbc)
  {
    this.b = paramContext;
    this.c = paramagw;
    this.d = paramik;
    this.e = paramasn;
    this.f = paramzzbc;
    this.j = new lo(200L);
    zzbv.zzek();
    this.i = jn.a((WindowManager)paramContext.getSystemService("window"));
  }
  
  private final void a(WeakReference<qe> paramWeakReference, boolean paramBoolean)
  {
    if (paramWeakReference == null) {}
    qe localqe;
    do
    {
      return;
      localqe = (qe)paramWeakReference.get();
    } while ((localqe == null) || (localqe.getView() == null) || ((paramBoolean) && (!this.j.a())));
    View localView = localqe.getView();
    int[] arrayOfInt = new int[2];
    localView.getLocationOnScreen(arrayOfInt);
    aos.a();
    int m = lz.b(this.i, arrayOfInt[0]);
    aos.a();
    int n = lz.b(this.i, arrayOfInt[1]);
    for (;;)
    {
      synchronized (this.a)
      {
        if ((this.k != m) || (this.l != n))
        {
          this.k = m;
          this.l = n;
          rm localrm = localqe.t();
          int i1 = this.k;
          int i2 = this.l;
          if (!paramBoolean)
          {
            bool = true;
            localrm.a(i1, i2, bool);
          }
        }
        else
        {
          return;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bi
 * JD-Core Version:    0.7.0.1
 */