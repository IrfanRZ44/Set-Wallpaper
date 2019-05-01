package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public abstract long a();
  
  public abstract int b();
  
  public abstract String h();
  
  public abstract long i();
  
  public abstract long k();
  
  public abstract long l();
  
  public abstract String m();
  
  public String toString()
  {
    long l1 = a();
    int i = b();
    long l2 = i();
    String str = m();
    return 53 + String.valueOf(str).length() + l1 + "\t" + i + "\t" + l2 + str;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.StatsEvent
 * JD-Core Version:    0.7.0.1
 */