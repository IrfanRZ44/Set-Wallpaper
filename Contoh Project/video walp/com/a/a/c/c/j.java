package com.a.a.c.c;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class j
  implements h
{
  private final Map<String, List<i>> c;
  private volatile Map<String, String> d;
  
  j(Map<String, List<i>> paramMap)
  {
    this.c = Collections.unmodifiableMap(paramMap);
  }
  
  private String a(List<i> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      String str = ((i)paramList.get(j)).a();
      if (!TextUtils.isEmpty(str))
      {
        localStringBuilder.append(str);
        if (j != -1 + paramList.size()) {
          localStringBuilder.append(',');
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  private Map<String, String> b()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = a((List)localEntry.getValue());
      if (!TextUtils.isEmpty(str)) {
        localHashMap.put(localEntry.getKey(), str);
      }
    }
    return localHashMap;
  }
  
  public Map<String, String> a()
  {
    if (this.d == null) {}
    try
    {
      if (this.d == null) {
        this.d = Collections.unmodifiableMap(b());
      }
      return this.d;
    }
    finally {}
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof j))
    {
      j localj = (j)paramObject;
      return this.c.equals(localj.c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.c.hashCode();
  }
  
  public String toString()
  {
    return "LazyHeaders{headers=" + this.c + '}';
  }
  
  public static final class a
  {
    private static final String a = ;
    private static final Map<String, List<i>> b;
    private boolean c = true;
    private Map<String, List<i>> d = b;
    private boolean e = true;
    
    static
    {
      HashMap localHashMap = new HashMap(2);
      if (!TextUtils.isEmpty(a)) {
        localHashMap.put("User-Agent", Collections.singletonList(new j.b(a)));
      }
      b = Collections.unmodifiableMap(localHashMap);
    }
    
    static String b()
    {
      String str = System.getProperty("http.agent");
      if (TextUtils.isEmpty(str)) {
        return str;
      }
      int i = str.length();
      StringBuilder localStringBuilder = new StringBuilder(str.length());
      int j = 0;
      if (j < i)
      {
        char c1 = str.charAt(j);
        if (((c1 > '\037') || (c1 == '\t')) && (c1 < '')) {
          localStringBuilder.append(c1);
        }
        for (;;)
        {
          j++;
          break;
          localStringBuilder.append('?');
        }
      }
      return localStringBuilder.toString();
    }
    
    public j a()
    {
      this.c = true;
      return new j(this.d);
    }
  }
  
  static final class b
    implements i
  {
    private final String a;
    
    b(String paramString)
    {
      this.a = paramString;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if ((paramObject instanceof b))
      {
        b localb = (b)paramObject;
        return this.a.equals(localb.a);
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.a.hashCode();
    }
    
    public String toString()
    {
      return "StringHeaderFactory{value='" + this.a + '\'' + '}';
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.j
 * JD-Core Version:    0.7.0.1
 */