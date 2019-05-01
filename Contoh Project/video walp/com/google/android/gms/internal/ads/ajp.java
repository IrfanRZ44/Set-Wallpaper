package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class ajp
  implements akv
{
  private final WeakReference<View> a;
  private final WeakReference<ij> b;
  
  public ajp(View paramView, ij paramij)
  {
    this.a = new WeakReference(paramView);
    this.b = new WeakReference(paramij);
  }
  
  public final View a()
  {
    return (View)this.a.get();
  }
  
  public final boolean b()
  {
    return (this.a.get() == null) || (this.b.get() == null);
  }
  
  public final akv c()
  {
    return new ajo((View)this.a.get(), (ij)this.b.get());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajp
 * JD-Core Version:    0.7.0.1
 */