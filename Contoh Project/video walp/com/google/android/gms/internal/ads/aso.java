package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzaf;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class aso
  extends ass
{
  private final zzaf a;
  private final String b;
  private final String c;
  
  public aso(zzaf paramzzaf, String paramString1, String paramString2)
  {
    this.a = paramzzaf;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final void a(a parama)
  {
    if (parama == null) {
      return;
    }
    this.a.zzh((View)b.a(parama));
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final void c()
  {
    this.a.zzcn();
  }
  
  public final void d()
  {
    this.a.zzco();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aso
 * JD-Core Version:    0.7.0.1
 */