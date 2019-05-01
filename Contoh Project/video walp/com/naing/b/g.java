package com.naing.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class g
{
  Map<String, j> a = new HashMap();
  Map<String, h> b = new HashMap();
  
  public h a(String paramString)
  {
    return (h)this.b.get(paramString);
  }
  
  void a(h paramh)
  {
    this.b.put(paramh.b(), paramh);
  }
  
  void a(j paramj)
  {
    this.a.put(paramj.a(), paramj);
  }
  
  List<String> b(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.a().equals(paramString)) {
        localArrayList.add(localh.b());
      }
    }
    return localArrayList;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.g
 * JD-Core Version:    0.7.0.1
 */