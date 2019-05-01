package com.a.a.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.a.a.i.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class n
  implements l
{
  private static final Bitmap.Config[] a;
  private static final Bitmap.Config[] b;
  private static final Bitmap.Config[] c;
  private static final Bitmap.Config[] d;
  private static final Bitmap.Config[] e;
  private final b f = new b();
  private final h<a, Bitmap> g = new h();
  private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap();
  
  static
  {
    Bitmap.Config[] arrayOfConfig1 = new Bitmap.Config[2];
    arrayOfConfig1[0] = Bitmap.Config.ARGB_8888;
    arrayOfConfig1[1] = null;
    if (Build.VERSION.SDK_INT >= 26)
    {
      arrayOfConfig1 = (Bitmap.Config[])Arrays.copyOf(arrayOfConfig1, 1 + arrayOfConfig1.length);
      arrayOfConfig1[(-1 + arrayOfConfig1.length)] = Bitmap.Config.RGBA_F16;
    }
    a = arrayOfConfig1;
    b = a;
    Bitmap.Config[] arrayOfConfig2 = new Bitmap.Config[1];
    arrayOfConfig2[0] = Bitmap.Config.RGB_565;
    c = arrayOfConfig2;
    Bitmap.Config[] arrayOfConfig3 = new Bitmap.Config[1];
    arrayOfConfig3[0] = Bitmap.Config.ARGB_4444;
    d = arrayOfConfig3;
    Bitmap.Config[] arrayOfConfig4 = new Bitmap.Config[1];
    arrayOfConfig4[0] = Bitmap.Config.ALPHA_8;
    e = arrayOfConfig4;
  }
  
  static String a(int paramInt, Bitmap.Config paramConfig)
  {
    return "[" + paramInt + "](" + paramConfig + ")";
  }
  
  private NavigableMap<Integer, Integer> a(Bitmap.Config paramConfig)
  {
    Object localObject = (NavigableMap)this.h.get(paramConfig);
    if (localObject == null)
    {
      localObject = new TreeMap();
      this.h.put(paramConfig, localObject);
    }
    return localObject;
  }
  
  private void a(Integer paramInteger, Bitmap paramBitmap)
  {
    NavigableMap localNavigableMap = a(paramBitmap.getConfig());
    Integer localInteger = (Integer)localNavigableMap.get(paramInteger);
    if (localInteger == null) {
      throw new NullPointerException("Tried to decrement empty size, size: " + paramInteger + ", removed: " + b(paramBitmap) + ", this: " + this);
    }
    if (localInteger.intValue() == 1)
    {
      localNavigableMap.remove(paramInteger);
      return;
    }
    localNavigableMap.put(paramInteger, Integer.valueOf(-1 + localInteger.intValue()));
  }
  
  private a b(int paramInt, Bitmap.Config paramConfig)
  {
    a locala = this.f.a(paramInt, paramConfig);
    Bitmap.Config[] arrayOfConfig = b(paramConfig);
    int i = arrayOfConfig.length;
    for (int j = 0;; j++)
    {
      if (j < i)
      {
        Bitmap.Config localConfig = arrayOfConfig[j];
        Integer localInteger = (Integer)a(localConfig).ceilingKey(Integer.valueOf(paramInt));
        if ((localInteger == null) || (localInteger.intValue() > paramInt * 8)) {
          continue;
        }
        if (localInteger.intValue() == paramInt)
        {
          if (localConfig != null) {
            break label116;
          }
          if (paramConfig == null) {
            break label125;
          }
        }
        label116:
        while (!localConfig.equals(paramConfig))
        {
          this.f.a(locala);
          return this.f.a(localInteger.intValue(), localConfig);
        }
      }
      label125:
      return locala;
    }
  }
  
  private static Bitmap.Config[] b(Bitmap.Config paramConfig)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.RGBA_F16.equals(paramConfig))) {
      return b;
    }
    switch (1.a[paramConfig.ordinal()])
    {
    default: 
      return new Bitmap.Config[] { paramConfig };
    case 1: 
      return a;
    case 2: 
      return c;
    case 3: 
      return d;
    }
    return e;
  }
  
  public Bitmap a()
  {
    Bitmap localBitmap = (Bitmap)this.g.a();
    if (localBitmap != null) {
      a(Integer.valueOf(i.a(localBitmap)), localBitmap);
    }
    return localBitmap;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    a locala = b(i.a(paramInt1, paramInt2, paramConfig), paramConfig);
    Bitmap localBitmap = (Bitmap)this.g.a(locala);
    if (localBitmap != null)
    {
      a(Integer.valueOf(locala.a), localBitmap);
      if (localBitmap.getConfig() == null) {
        break label73;
      }
    }
    label73:
    for (Bitmap.Config localConfig = localBitmap.getConfig();; localConfig = Bitmap.Config.ARGB_8888)
    {
      localBitmap.reconfigure(paramInt1, paramInt2, localConfig);
      return localBitmap;
    }
  }
  
  public void a(Bitmap paramBitmap)
  {
    int i = i.a(paramBitmap);
    a locala = this.f.a(i, paramBitmap.getConfig());
    this.g.a(locala, paramBitmap);
    NavigableMap localNavigableMap = a(paramBitmap.getConfig());
    Integer localInteger1 = (Integer)localNavigableMap.get(Integer.valueOf(locala.a));
    Integer localInteger2 = Integer.valueOf(locala.a);
    if (localInteger1 == null) {}
    for (int j = 1;; j = 1 + localInteger1.intValue())
    {
      localNavigableMap.put(localInteger2, Integer.valueOf(j));
      return;
    }
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return a(i.a(paramInt1, paramInt2, paramConfig), paramConfig);
  }
  
  public String b(Bitmap paramBitmap)
  {
    return a(i.a(paramBitmap), paramBitmap.getConfig());
  }
  
  public int c(Bitmap paramBitmap)
  {
    return i.a(paramBitmap);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("SizeConfigStrategy{groupedMap=").append(this.g).append(", sortedSizes=(");
    Iterator localIterator = this.h.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(localEntry.getKey()).append('[').append(localEntry.getValue()).append("], ");
    }
    if (!this.h.isEmpty()) {
      localStringBuilder.replace(-2 + localStringBuilder.length(), localStringBuilder.length(), "");
    }
    return ")}";
  }
  
  static final class a
    implements m
  {
    int a;
    private final n.b b;
    private Bitmap.Config c;
    
    public a(n.b paramb)
    {
      this.b = paramb;
    }
    
    public void a()
    {
      this.b.a(this);
    }
    
    public void a(int paramInt, Bitmap.Config paramConfig)
    {
      this.a = paramInt;
      this.c = paramConfig;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (bool1)
      {
        a locala = (a)paramObject;
        int i = this.a;
        int j = locala.a;
        bool2 = false;
        if (i == j)
        {
          boolean bool3 = i.a(this.c, locala.c);
          bool2 = false;
          if (bool3) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      int i = 31 * this.a;
      if (this.c != null) {}
      for (int j = this.c.hashCode();; j = 0) {
        return j + i;
      }
    }
    
    public String toString()
    {
      return n.a(this.a, this.c);
    }
  }
  
  static class b
    extends d<n.a>
  {
    protected n.a a()
    {
      return new n.a(this);
    }
    
    public n.a a(int paramInt, Bitmap.Config paramConfig)
    {
      n.a locala = (n.a)c();
      locala.a(paramInt, paramConfig);
      return locala;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.n
 * JD-Core Version:    0.7.0.1
 */