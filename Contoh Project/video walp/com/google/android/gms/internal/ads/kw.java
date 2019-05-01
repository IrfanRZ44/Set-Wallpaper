package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class kw
{
  private final List<String> a = new ArrayList();
  private final List<Double> b = new ArrayList();
  private final List<Double> c = new ArrayList();
  
  public final kt a()
  {
    return new kt(this, null);
  }
  
  public final kw a(String paramString, double paramDouble1, double paramDouble2)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      double d1 = ((Double)this.c.get(i)).doubleValue();
      double d2 = ((Double)this.b.get(i)).doubleValue();
      if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2))) {
        break;
      }
    }
    this.a.add(i, paramString);
    this.c.add(i, Double.valueOf(paramDouble1));
    this.b.add(i, Double.valueOf(paramDouble2));
    return this;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kw
 * JD-Core Version:    0.7.0.1
 */