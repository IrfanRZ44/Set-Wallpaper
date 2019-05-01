package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@cm
public final class ik
{
  public final zzaef a;
  public final zzaej b;
  public final bbu c;
  public final zzjn d;
  public final int e;
  public final long f;
  public final long g;
  public final JSONObject h;
  public final amj i;
  public final boolean j;
  
  public ik(zzaef paramzzaef, zzaej paramzzaej, bbu parambbu, zzjn paramzzjn, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject, amj paramamj, Boolean paramBoolean)
  {
    this.a = paramzzaef;
    this.b = paramzzaej;
    this.c = parambbu;
    this.d = paramzzjn;
    this.e = paramInt;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramJSONObject;
    this.i = paramamj;
    if (paramBoolean != null)
    {
      this.j = paramBoolean.booleanValue();
      return;
    }
    if (lr.a(paramzzaef.c))
    {
      this.j = true;
      return;
    }
    this.j = false;
  }
  
  public ik(zzaef paramzzaef, zzaej paramzzaej, bbu parambbu, zzjn paramzzjn, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject, amo paramamo)
  {
    this.a = paramzzaef;
    this.b = paramzzaej;
    this.c = null;
    this.d = null;
    this.e = paramInt;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = null;
    this.i = new amj(paramamo);
    this.j = false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ik
 * JD-Core Version:    0.7.0.1
 */