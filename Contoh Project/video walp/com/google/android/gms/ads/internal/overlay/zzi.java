package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.qe;

@cm
public final class zzi
{
  public final int index;
  public final ViewGroup parent;
  public final ViewGroup.LayoutParams zzbyi;
  public final Context zzrt;
  
  public zzi(qe paramqe)
  {
    this.zzbyi = paramqe.getLayoutParams();
    ViewParent localViewParent = paramqe.getParent();
    this.zzrt = paramqe.o();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
    {
      this.parent = ((ViewGroup)localViewParent);
      this.index = this.parent.indexOfChild(paramqe.getView());
      this.parent.removeView(paramqe.getView());
      paramqe.b(true);
      return;
    }
    throw new c("Could not get the parent of the WebView for an overlay.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzi
 * JD-Core Version:    0.7.0.1
 */