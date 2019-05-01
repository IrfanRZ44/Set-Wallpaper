package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class atx
{
  private final WeakReference<qe> a;
  private String b;
  
  public atx(qe paramqe)
  {
    this.a = new WeakReference(paramqe);
  }
  
  public final void a(bq parambq)
  {
    parambq.a("/loadHtml", new aty(this, parambq));
    parambq.a("/showOverlay", new aua(this, parambq));
    parambq.a("/hideOverlay", new aub(this, parambq));
    qe localqe = (qe)this.a.get();
    if (localqe != null) {
      localqe.a("/sendMessageToSdk", new auc(this, parambq));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atx
 * JD-Core Version:    0.7.0.1
 */