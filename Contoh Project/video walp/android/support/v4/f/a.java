package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V>
  extends m<K, V>
  implements Map<K, V>
{
  h<K, V> a;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  public a(m paramm)
  {
    super(paramm);
  }
  
  private h<K, V> b()
  {
    if (this.a == null) {
      this.a = new h()
      {
        protected int a()
        {
          return a.this.h;
        }
        
        protected int a(Object paramAnonymousObject)
        {
          return a.this.a(paramAnonymousObject);
        }
        
        protected Object a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return a.this.g[(paramAnonymousInt2 + (paramAnonymousInt1 << 1))];
        }
        
        protected V a(int paramAnonymousInt, V paramAnonymousV)
        {
          return a.this.a(paramAnonymousInt, paramAnonymousV);
        }
        
        protected void a(int paramAnonymousInt)
        {
          a.this.d(paramAnonymousInt);
        }
        
        protected void a(K paramAnonymousK, V paramAnonymousV)
        {
          a.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected int b(Object paramAnonymousObject)
        {
          return a.this.b(paramAnonymousObject);
        }
        
        protected Map<K, V> b()
        {
          return a.this;
        }
        
        protected void c()
        {
          a.this.clear();
        }
      };
    }
    return this.a;
  }
  
  public boolean a(Collection<?> paramCollection)
  {
    return h.c(this, paramCollection);
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    return b().d();
  }
  
  public Set<K> keySet()
  {
    return b().e();
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.h + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    return b().f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.a
 * JD-Core Version:    0.7.0.1
 */