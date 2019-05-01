package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzw;

@cm
public final class axk
{
  private final Context a;
  private final bck b;
  private final zzang c;
  private final zzw d;
  
  axk(Context paramContext, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    this.a = paramContext;
    this.b = parambck;
    this.c = paramzzang;
    this.d = paramzzw;
  }
  
  public final Context a()
  {
    return this.a.getApplicationContext();
  }
  
  public final zzal a(String paramString)
  {
    return new zzal(this.a, new zzjn(), paramString, this.b, this.c, this.d);
  }
  
  public final zzal b(String paramString)
  {
    return new zzal(this.a.getApplicationContext(), new zzjn(), paramString, this.b, this.c, this.d);
  }
  
  public final axk b()
  {
    return new axk(this.a.getApplicationContext(), this.b, this.c, this.d);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axk
 * JD-Core Version:    0.7.0.1
 */