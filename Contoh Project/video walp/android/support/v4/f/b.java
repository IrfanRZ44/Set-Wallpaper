package android.support.v4.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E>
  implements Collection<E>, Set<E>
{
  private static final int[] a = new int[0];
  private static final Object[] b = new Object[0];
  private static Object[] c;
  private static int d;
  private static Object[] e;
  private static int f;
  private int[] g;
  private Object[] h;
  private int i;
  private h<E, E> j;
  
  public b()
  {
    this(0);
  }
  
  public b(int paramInt)
  {
    if (paramInt == 0)
    {
      this.g = a;
      this.h = b;
    }
    for (;;)
    {
      this.i = 0;
      return;
      d(paramInt);
    }
  }
  
  private int a()
  {
    int k = this.i;
    int m;
    if (k == 0) {
      m = -1;
    }
    do
    {
      return m;
      m = c.a(this.g, k, 0);
    } while ((m < 0) || (this.h[m] == null));
    for (int n = m + 1; (n < k) && (this.g[n] == 0); n++) {
      if (this.h[n] == null) {
        return n;
      }
    }
    m--;
    for (;;)
    {
      if ((m < 0) || (this.g[m] != 0)) {
        break label102;
      }
      if (this.h[m] == null) {
        break;
      }
      m--;
    }
    label102:
    return n ^ 0xFFFFFFFF;
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int k = this.i;
    int m;
    if (k == 0) {
      m = -1;
    }
    do
    {
      return m;
      m = c.a(this.g, k, paramInt);
    } while ((m < 0) || (paramObject.equals(this.h[m])));
    for (int n = m + 1; (n < k) && (this.g[n] == paramInt); n++) {
      if (paramObject.equals(this.h[n])) {
        return n;
      }
    }
    m--;
    for (;;)
    {
      if ((m < 0) || (this.g[m] != paramInt)) {
        break label130;
      }
      if (paramObject.equals(this.h[m])) {
        break;
      }
      m--;
    }
    label130:
    return n ^ 0xFFFFFFFF;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (f < 10)
        {
          paramArrayOfObject[0] = e;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int m = paramInt - 1; m >= 2; m--) {
            paramArrayOfObject[m] = null;
          }
          e = paramArrayOfObject;
          f = 1 + f;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int k = paramInt - 1; k >= 2; k--) {
            paramArrayOfObject[k] = null;
          }
          c = paramArrayOfObject;
          d = 1 + d;
        }
        return;
      }
      finally {}
    }
  }
  
  private h<E, E> b()
  {
    if (this.j == null) {
      this.j = new h()
      {
        protected int a()
        {
          return b.a(b.this);
        }
        
        protected int a(Object paramAnonymousObject)
        {
          return b.this.a(paramAnonymousObject);
        }
        
        protected Object a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return b.b(b.this)[paramAnonymousInt1];
        }
        
        protected E a(int paramAnonymousInt, E paramAnonymousE)
        {
          throw new UnsupportedOperationException("not a map");
        }
        
        protected void a(int paramAnonymousInt)
        {
          b.this.c(paramAnonymousInt);
        }
        
        protected void a(E paramAnonymousE1, E paramAnonymousE2)
        {
          b.this.add(paramAnonymousE1);
        }
        
        protected int b(Object paramAnonymousObject)
        {
          return b.this.a(paramAnonymousObject);
        }
        
        protected Map<E, E> b()
        {
          throw new UnsupportedOperationException("not a map");
        }
        
        protected void c()
        {
          b.this.clear();
        }
      };
    }
    return this.j;
  }
  
  private void d(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (e != null)
        {
          Object[] arrayOfObject2 = e;
          this.h = arrayOfObject2;
          e = (Object[])arrayOfObject2[0];
          this.g = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          f = -1 + f;
          return;
        }
        this.g = new int[paramInt];
        this.h = new Object[paramInt];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (c != null)
          {
            Object[] arrayOfObject1 = c;
            this.h = arrayOfObject1;
            c = (Object[])arrayOfObject1[0];
            this.g = ((int[])arrayOfObject1[1]);
            arrayOfObject1[1] = null;
            arrayOfObject1[0] = null;
            d = -1 + d;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public int a(Object paramObject)
  {
    if (paramObject == null) {
      return a();
    }
    return a(paramObject, paramObject.hashCode());
  }
  
  public void a(int paramInt)
  {
    if (this.g.length < paramInt)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.h;
      d(paramInt);
      if (this.i > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, this.i);
        System.arraycopy(arrayOfObject, 0, this.h, 0, this.i);
      }
      a(arrayOfInt, arrayOfObject, this.i);
    }
  }
  
  public boolean add(E paramE)
  {
    int k = 8;
    int n;
    int m;
    if (paramE == null)
    {
      n = a();
      m = 0;
    }
    while (n >= 0)
    {
      return false;
      m = paramE.hashCode();
      n = a(paramE, m);
    }
    int i1 = n ^ 0xFFFFFFFF;
    if (this.i >= this.g.length)
    {
      if (this.i < k) {
        break label225;
      }
      k = this.i + (this.i >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.h;
      d(k);
      if (this.g.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.h, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.i);
      if (i1 < this.i)
      {
        System.arraycopy(this.g, i1, this.g, i1 + 1, this.i - i1);
        System.arraycopy(this.h, i1, this.h, i1 + 1, this.i - i1);
      }
      this.g[i1] = m;
      this.h[i1] = paramE;
      this.i = (1 + this.i);
      return true;
      label225:
      if (this.i < 4) {
        k = 4;
      }
    }
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    a(this.i + paramCollection.size());
    boolean bool = false;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      bool |= add(localIterator.next());
    }
    return bool;
  }
  
  public E b(int paramInt)
  {
    return this.h[paramInt];
  }
  
  public E c(int paramInt)
  {
    int k = 8;
    Object localObject = this.h[paramInt];
    if (this.i <= 1)
    {
      a(this.g, this.h, this.i);
      this.g = a;
      this.h = b;
      this.i = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return localObject;
      if ((this.g.length <= k) || (this.i >= this.g.length / 3)) {
        break;
      }
      if (this.i > k) {
        k = this.i + (this.i >> 1);
      }
      arrayOfInt = this.g;
      arrayOfObject = this.h;
      d(k);
      this.i = (-1 + this.i);
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.h, 0, paramInt);
      }
    } while (paramInt >= this.i);
    System.arraycopy(arrayOfInt, paramInt + 1, this.g, paramInt, this.i - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1, this.h, paramInt, this.i - paramInt);
    return localObject;
    this.i = (-1 + this.i);
    if (paramInt < this.i)
    {
      System.arraycopy(this.g, paramInt + 1, this.g, paramInt, this.i - paramInt);
      System.arraycopy(this.h, paramInt + 1, this.h, paramInt, this.i - paramInt);
    }
    this.h[this.i] = null;
    return localObject;
  }
  
  public void clear()
  {
    if (this.i != 0)
    {
      a(this.g, this.h, this.i);
      this.g = a;
      this.h = b;
      this.i = 0;
    }
  }
  
  public boolean contains(Object paramObject)
  {
    return a(paramObject) >= 0;
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      if (!contains(localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        Set localSet = (Set)paramObject;
        if (size() != localSet.size()) {
          return false;
        }
        int k = 0;
        try
        {
          while (k < this.i)
          {
            boolean bool = localSet.contains(b(k));
            if (!bool) {
              return false;
            }
            k++;
          }
          return false;
        }
        catch (NullPointerException localNullPointerException)
        {
          return false;
        }
        catch (ClassCastException localClassCastException)
        {
          return false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int k = 0;
    int[] arrayOfInt = this.g;
    int m = this.i;
    int n = 0;
    while (k < m)
    {
      n += arrayOfInt[k];
      k++;
    }
    return n;
  }
  
  public boolean isEmpty()
  {
    return this.i <= 0;
  }
  
  public Iterator<E> iterator()
  {
    return b().e().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    int k = a(paramObject);
    if (k >= 0)
    {
      c(k);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    boolean bool = false;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      bool |= remove(localIterator.next());
    }
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    int k = -1 + this.i;
    boolean bool = false;
    for (int m = k; m >= 0; m--) {
      if (!paramCollection.contains(this.h[m]))
      {
        c(m);
        bool = true;
      }
    }
    return bool;
  }
  
  public int size()
  {
    return this.i;
  }
  
  public Object[] toArray()
  {
    Object[] arrayOfObject = new Object[this.i];
    System.arraycopy(this.h, 0, arrayOfObject, 0, this.i);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < this.i) {}
    for (Object localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.i);; localObject = paramArrayOfT)
    {
      System.arraycopy(this.h, 0, localObject, 0, this.i);
      if (localObject.length > this.i) {
        localObject[this.i] = null;
      }
      return localObject;
    }
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(14 * this.i);
    localStringBuilder.append('{');
    int k = 0;
    if (k < this.i)
    {
      if (k > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = b(k);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        k++;
        break;
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.b
 * JD-Core Version:    0.7.0.1
 */