package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

@cm
public final class hy
  implements akk
{
  private final Context a;
  private final Object b;
  private String c;
  private boolean d;
  
  public hy(Context paramContext, String paramString)
  {
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    this.a = paramContext;
    this.c = paramString;
    this.d = false;
    this.b = new Object();
  }
  
  public final void a(akj paramakj)
  {
    a(paramakj.a);
  }
  
  public final void a(String paramString)
  {
    this.c = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!zzbv.zzfh().a(this.a)) {
      return;
    }
    synchronized (this.b)
    {
      if (this.d == paramBoolean) {
        return;
      }
    }
    this.d = paramBoolean;
    if (TextUtils.isEmpty(this.c)) {
      return;
    }
    if (this.d) {
      zzbv.zzfh().a(this.a, this.c);
    }
    for (;;)
    {
      return;
      zzbv.zzfh().b(this.a, this.c);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hy
 * JD-Core Version:    0.7.0.1
 */