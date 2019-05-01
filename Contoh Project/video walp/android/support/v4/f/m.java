package android.support.v4.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class m<K, V>
{
  static Object[] b;
  static int c;
  static Object[] d;
  static int e;
  int[] f;
  Object[] g;
  int h;
  
  public m()
  {
    this.f = c.a;
    this.g = c.c;
    this.h = 0;
  }
  
  public m(int paramInt)
  {
    if (paramInt == 0)
    {
      this.f = c.a;
      this.g = c.c;
    }
    for (;;)
    {
      this.h = 0;
      return;
      e(paramInt);
    }
  }
  
  public m(m<K, V> paramm)
  {
    this();
    if (paramm != null) {
      a(paramm);
    }
  }
  
  private static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      int i = c.a(paramArrayOfInt, paramInt1, paramInt2);
      return i;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int j = -1 + (paramInt << 1); j >= 2; j--) {
            paramArrayOfObject[j] = null;
          }
          d = paramArrayOfObject;
          e = 1 + e;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (c < 10)
        {
          paramArrayOfObject[0] = b;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int i = -1 + (paramInt << 1); i >= 2; i--) {
            paramArrayOfObject[i] = null;
          }
          b = paramArrayOfObject;
          c = 1 + c;
        }
        return;
      }
      finally {}
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (d != null)
        {
          Object[] arrayOfObject2 = d;
          this.g = arrayOfObject2;
          d = (Object[])arrayOfObject2[0];
          this.f = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          e = -1 + e;
          return;
        }
        this.f = new int[paramInt];
        this.g = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (b != null)
          {
            Object[] arrayOfObject1 = b;
            this.g = arrayOfObject1;
            b = (Object[])arrayOfObject1[0];
            this.f = ((int[])arrayOfObject1[1]);
            arrayOfObject1[1] = null;
            arrayOfObject1[0] = null;
            c = -1 + c;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  int a()
  {
    int i = this.h;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = a(this.f, i, 0);
    } while ((j < 0) || (this.g[(j << 1)] == null));
    for (int k = j + 1; (k < i) && (this.f[k] == 0); k++) {
      if (this.g[(k << 1)] == null) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.f[j] != 0)) {
        break label108;
      }
      if (this.g[(j << 1)] == null) {
        break;
      }
      j--;
    }
    label108:
    return k ^ 0xFFFFFFFF;
  }
  
  public int a(Object paramObject)
  {
    if (paramObject == null) {
      return a();
    }
    return a(paramObject, paramObject.hashCode());
  }
  
  int a(Object paramObject, int paramInt)
  {
    int i = this.h;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = a(this.f, i, paramInt);
    } while ((j < 0) || (paramObject.equals(this.g[(j << 1)])));
    for (int k = j + 1; (k < i) && (this.f[k] == paramInt); k++) {
      if (paramObject.equals(this.g[(k << 1)])) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.f[j] != paramInt)) {
        break label136;
      }
      if (paramObject.equals(this.g[(j << 1)])) {
        break;
      }
      j--;
    }
    label136:
    return k ^ 0xFFFFFFFF;
  }
  
  public V a(int paramInt, V paramV)
  {
    int i = 1 + (paramInt << 1);
    Object localObject = this.g[i];
    this.g[i] = paramV;
    return localObject;
  }
  
  public void a(int paramInt)
  {
    int i = this.h;
    if (this.f.length < paramInt)
    {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(paramInt);
      if (this.h > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.f, 0, i);
        System.arraycopy(arrayOfObject, 0, this.g, 0, i << 1);
      }
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.h != i) {
      throw new ConcurrentModificationException();
    }
  }
  
  public void a(m<? extends K, ? extends V> paramm)
  {
    int i = paramm.h;
    a(i + this.h);
    int j = this.h;
    int k = 0;
    if (j == 0) {
      if (i > 0)
      {
        System.arraycopy(paramm.f, 0, this.f, 0, i);
        System.arraycopy(paramm.g, 0, this.g, 0, i << 1);
        this.h = i;
      }
    }
    for (;;)
    {
      return;
      while (k < i)
      {
        put(paramm.b(k), paramm.c(k));
        k++;
      }
    }
  }
  
  int b(Object paramObject)
  {
    int i = 1;
    int j = 2 * this.h;
    Object[] arrayOfObject = this.g;
    if (paramObject == null) {
      while (i < j)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= j) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public K b(int paramInt)
  {
    return this.g[(paramInt << 1)];
  }
  
  public V c(int paramInt)
  {
    return this.g[(1 + (paramInt << 1))];
  }
  
  public void clear()
  {
    if (this.h > 0)
    {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      int i = this.h;
      this.f = c.a;
      this.g = c.c;
      this.h = 0;
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.h > 0) {
      throw new ConcurrentModificationException();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    return a(paramObject) >= 0;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return b(paramObject) >= 0;
  }
  
  public V d(int paramInt)
  {
    int i = 8;
    Object localObject = this.g[(1 + (paramInt << 1))];
    int j = this.h;
    int m;
    if (j <= 1)
    {
      a(this.f, this.g, j);
      this.f = c.a;
      this.g = c.c;
      m = 0;
    }
    while (j != this.h)
    {
      throw new ConcurrentModificationException();
      int k = j - 1;
      if ((this.f.length > i) && (this.h < this.f.length / 3))
      {
        if (j > i) {
          i = j + (j >> 1);
        }
        int[] arrayOfInt = this.f;
        Object[] arrayOfObject = this.g;
        e(i);
        if (j != this.h) {
          throw new ConcurrentModificationException();
        }
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.f, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.g, 0, paramInt << 1);
        }
        if (paramInt < k)
        {
          System.arraycopy(arrayOfInt, paramInt + 1, this.f, paramInt, k - paramInt);
          System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.g, paramInt << 1, k - paramInt << 1);
        }
        m = k;
      }
      else
      {
        if (paramInt < k)
        {
          System.arraycopy(this.f, paramInt + 1, this.f, paramInt, k - paramInt);
          System.arraycopy(this.g, paramInt + 1 << 1, this.g, paramInt << 1, k - paramInt << 1);
        }
        this.g[(k << 1)] = null;
        this.g[(1 + (k << 1))] = null;
        m = k;
      }
    }
    this.h = m;
    return localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof m))
      {
        m localm = (m)paramObject;
        if (size() != localm.size()) {
          return false;
        }
        int j = 0;
        try
        {
          while (j < this.h)
          {
            Object localObject4 = b(j);
            Object localObject5 = c(j);
            Object localObject6 = localm.get(localObject4);
            if (localObject5 == null)
            {
              if (localObject6 != null) {
                break label241;
              }
              if (!localm.containsKey(localObject4)) {
                break label241;
              }
            }
            else
            {
              boolean bool2 = localObject5.equals(localObject6);
              if (!bool2) {
                return false;
              }
            }
            j++;
          }
          if (!(paramObject instanceof Map)) {
            break;
          }
        }
        catch (NullPointerException localNullPointerException2)
        {
          return false;
        }
        catch (ClassCastException localClassCastException2)
        {
          return false;
        }
      }
      else
      {
        Map localMap = (Map)paramObject;
        if (size() != localMap.size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.h)
          {
            Object localObject1 = b(i);
            Object localObject2 = c(i);
            Object localObject3 = localMap.get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label243;
              }
              if (!localMap.containsKey(localObject1)) {
                break label243;
              }
            }
            else
            {
              boolean bool1 = localObject2.equals(localObject3);
              if (!bool1) {
                return false;
              }
            }
            i++;
          }
          return false;
        }
        catch (NullPointerException localNullPointerException1)
        {
          return false;
        }
        catch (ClassCastException localClassCastException1)
        {
          return false;
        }
      }
    }
    label241:
    return false;
    label243:
    return false;
  }
  
  public V get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return this.g[(1 + (i << 1))];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.f;
    Object[] arrayOfObject = this.g;
    int i = this.h;
    int j = 1;
    int k = 0;
    int m = 0;
    if (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      if (localObject == null) {}
      for (int i1 = 0;; i1 = localObject.hashCode())
      {
        m += (i1 ^ n);
        k++;
        j += 2;
        break;
      }
    }
    return m;
  }
  
  public boolean isEmpty()
  {
    return this.h <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int i = 8;
    int j = this.h;
    int m;
    int k;
    if (paramK == null)
    {
      m = a();
      k = 0;
    }
    while (m >= 0)
    {
      int i1 = 1 + (m << 1);
      Object localObject = this.g[i1];
      this.g[i1] = paramV;
      return localObject;
      k = paramK.hashCode();
      m = a(paramK, k);
    }
    int n = m ^ 0xFFFFFFFF;
    if (j >= this.f.length)
    {
      if (j >= i) {
        i = j + (j >> 1);
      }
      int[] arrayOfInt;
      Object[] arrayOfObject;
      for (;;)
      {
        arrayOfInt = this.f;
        arrayOfObject = this.g;
        e(i);
        if (j == this.h) {
          break;
        }
        throw new ConcurrentModificationException();
        if (j < 4) {
          i = 4;
        }
      }
      if (this.f.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.g, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, j);
    }
    if (n < j)
    {
      System.arraycopy(this.f, n, this.f, n + 1, j - n);
      System.arraycopy(this.g, n << 1, this.g, n + 1 << 1, this.h - n << 1);
    }
    if ((j != this.h) || (n >= this.f.length)) {
      throw new ConcurrentModificationException();
    }
    this.f[n] = k;
    this.g[(n << 1)] = paramK;
    this.g[(1 + (n << 1))] = paramV;
    this.h = (1 + this.h);
    return null;
  }
  
  public V remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return d(i);
    }
    return null;
  }
  
  public int size()
  {
    return this.h;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(28 * this.h);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.h)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject1 = b(i);
      if (localObject1 != this)
      {
        localStringBuilder.append(localObject1);
        label73:
        localStringBuilder.append('=');
        Object localObject2 = c(i);
        if (localObject2 == this) {
          break label116;
        }
        localStringBuilder.append(localObject2);
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
        break label73;
        label116:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.m
 * JD-Core Version:    0.7.0.1
 */