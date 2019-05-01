package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzv;

@cm
public final class m
  extends n
  implements zzv<qe>
{
  private final qe a;
  private final Context b;
  private final WindowManager c;
  private final arl d;
  private DisplayMetrics e;
  private float f;
  private int g = -1;
  private int h = -1;
  private int i;
  private int j = -1;
  private int k = -1;
  private int l = -1;
  private int m = -1;
  
  public m(qe paramqe, Context paramContext, arl paramarl)
  {
    super(paramqe);
    this.a = paramqe;
    this.b = paramContext;
    this.d = paramarl;
    this.c = ((WindowManager)paramContext.getSystemService("window"));
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((this.b instanceof Activity)) {}
    for (int n = com.google.android.gms.ads.internal.zzbv.zzek().c((Activity)this.b)[0];; n = 0)
    {
      if ((this.a.r() == null) || (!this.a.r().d()))
      {
        aos.a();
        this.l = lz.b(this.b, this.a.getWidth());
        aos.a();
        this.m = lz.b(this.b, this.a.getHeight());
      }
      b(paramInt1, paramInt2 - n, this.l, this.m);
      this.a.t().a(paramInt1, paramInt2);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.m
 * JD-Core Version:    0.7.0.1
 */