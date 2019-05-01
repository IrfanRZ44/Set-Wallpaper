package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class adi
  extends adh<FieldDescriptorType, Object>
{
  adi(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void a()
  {
    if (!b())
    {
      for (int i = 0; i < c(); i++)
      {
        Map.Entry localEntry2 = b(i);
        if (((aay)localEntry2.getKey()).d()) {
          localEntry2.setValue(Collections.unmodifiableList((List)localEntry2.getValue()));
        }
      }
      Iterator localIterator = d().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator.next();
        if (((aay)localEntry1.getKey()).d()) {
          localEntry1.setValue(Collections.unmodifiableList((List)localEntry1.getValue()));
        }
      }
    }
    super.a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adi
 * JD-Core Version:    0.7.0.1
 */