package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@cm
public final class ata
  extends auk
{
  private static final int a = Color.rgb(12, 174, 206);
  private static final int b;
  private static final int c;
  private static final int d = a;
  private final String e;
  private final List<ate> f = new ArrayList();
  private final List<aun> g = new ArrayList();
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  private final boolean m;
  
  static
  {
    int n = Color.rgb(204, 204, 204);
    b = n;
    c = n;
  }
  
  public ata(String paramString, List<ate> paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.e = paramString;
    if (paramList != null) {
      for (int i3 = 0; i3 < paramList.size(); i3++)
      {
        ate localate = (ate)paramList.get(i3);
        this.f.add(localate);
        this.g.add(localate);
      }
    }
    int n;
    int i1;
    if (paramInteger1 != null)
    {
      n = paramInteger1.intValue();
      this.h = n;
      if (paramInteger2 == null) {
        break label171;
      }
      i1 = paramInteger2.intValue();
      label120:
      this.i = i1;
      if (paramInteger3 == null) {
        break label179;
      }
    }
    label171:
    label179:
    for (int i2 = paramInteger3.intValue();; i2 = 12)
    {
      this.j = i2;
      this.k = paramInt1;
      this.l = paramInt2;
      this.m = paramBoolean;
      return;
      n = c;
      break;
      i1 = d;
      break label120;
    }
  }
  
  public final String a()
  {
    return this.e;
  }
  
  public final List<aun> b()
  {
    return this.g;
  }
  
  public final List<ate> c()
  {
    return this.f;
  }
  
  public final int d()
  {
    return this.h;
  }
  
  public final int e()
  {
    return this.i;
  }
  
  public final int f()
  {
    return this.j;
  }
  
  public final int g()
  {
    return this.k;
  }
  
  public final int h()
  {
    return this.l;
  }
  
  public final boolean i()
  {
    return this.m;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ata
 * JD-Core Version:    0.7.0.1
 */