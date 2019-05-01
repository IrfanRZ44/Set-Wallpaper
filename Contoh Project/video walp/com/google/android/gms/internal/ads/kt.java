package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@cm
public final class kt
{
  private final String[] a;
  private final double[] b;
  private final double[] c;
  private final int[] d;
  private int e;
  
  private kt(kw paramkw)
  {
    int i = kw.a(paramkw).size();
    this.a = ((String[])kw.b(paramkw).toArray(new String[i]));
    this.b = a(kw.a(paramkw));
    this.c = a(kw.c(paramkw));
    this.d = new int[i];
    this.e = 0;
  }
  
  private static double[] a(List<Double> paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    for (int i = 0; i < arrayOfDouble.length; i++) {
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
    }
    return arrayOfDouble;
  }
  
  public final List<kv> a()
  {
    ArrayList localArrayList = new ArrayList(this.a.length);
    for (int i = 0; i < this.a.length; i++) {
      localArrayList.add(new kv(this.a[i], this.c[i], this.b[i], this.d[i] / this.e, this.d[i]));
    }
    return localArrayList;
  }
  
  public final void a(double paramDouble)
  {
    this.e = (1 + this.e);
    for (int i = 0; i < this.c.length; i++)
    {
      if ((this.c[i] <= paramDouble) && (paramDouble < this.b[i]))
      {
        int[] arrayOfInt = this.d;
        arrayOfInt[i] = (1 + arrayOfInt[i]);
      }
      if (paramDouble < this.c[i]) {
        break;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kt
 * JD-Core Version:    0.7.0.1
 */