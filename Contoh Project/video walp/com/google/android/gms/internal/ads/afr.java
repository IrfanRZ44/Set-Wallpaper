package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.b;
import android.support.customtabs.d;
import java.lang.ref.WeakReference;

public final class afr
  extends d
{
  private WeakReference<afs> a;
  
  public afr(afs paramafs)
  {
    this.a = new WeakReference(paramafs);
  }
  
  public final void a(ComponentName paramComponentName, b paramb)
  {
    afs localafs = (afs)this.a.get();
    if (localafs != null) {
      localafs.a(paramb);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    afs localafs = (afs)this.a.get();
    if (localafs != null) {
      localafs.a();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afr
 * JD-Core Version:    0.7.0.1
 */