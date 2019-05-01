package android.support.v7.widget;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import java.util.ArrayList;
import java.util.List;

class c
  implements v.a
{
  final ArrayList<b> a = new ArrayList();
  final ArrayList<b> b = new ArrayList();
  final a c;
  Runnable d;
  final boolean e;
  final v f;
  private k.a<b> g = new k.b(30);
  private int h = 0;
  
  c(a parama)
  {
    this(parama, false);
  }
  
  c(a parama, boolean paramBoolean)
  {
    this.c = parama;
    this.e = paramBoolean;
    this.f = new v(this);
  }
  
  private void b(b paramb)
  {
    g(paramb);
  }
  
  private void c(b paramb)
  {
    int i = paramb.b;
    int j = paramb.b + paramb.d;
    int k = -1;
    int m = paramb.b;
    int n = 0;
    if (m < j) {
      if ((this.c.a(m) != null) || (d(m)))
      {
        if (k != 0) {
          break label220;
        }
        e(a(2, i, n, null));
      }
    }
    label214:
    label220:
    for (int i1 = 1;; i1 = 0)
    {
      k = 1;
      int i6;
      int i4;
      int i5;
      if (i1 != 0)
      {
        i6 = m - n;
        i4 = j - n;
        i5 = 1;
        label101:
        int i7 = i6 + 1;
        n = i5;
        j = i4;
        m = i7;
        break;
        if (k != 1) {
          break label214;
        }
        g(a(2, i, n, null));
      }
      for (i1 = 1;; i1 = 0)
      {
        k = 0;
        break;
        int i2 = n + 1;
        int i3 = m;
        i4 = j;
        i5 = i2;
        i6 = i3;
        break label101;
        if (n != paramb.d)
        {
          a(paramb);
          paramb = a(2, i, n, null);
        }
        if (k == 0)
        {
          e(paramb);
          return;
        }
        g(paramb);
        return;
      }
    }
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    int i = -1 + this.b.size();
    int j = paramInt1;
    if (i >= 0)
    {
      b localb2 = (b)this.b.get(i);
      int m;
      int n;
      label67:
      label108:
      int i1;
      if (localb2.a == 8) {
        if (localb2.b < localb2.d)
        {
          m = localb2.b;
          n = localb2.d;
          if ((j < m) || (j > n)) {
            break label207;
          }
          if (m != localb2.b) {
            break label161;
          }
          if (paramInt2 != 1) {
            break label141;
          }
          localb2.d = (1 + localb2.d);
          i1 = j + 1;
          label114:
          j = i1;
        }
      }
      for (;;)
      {
        i--;
        break;
        m = localb2.d;
        n = localb2.b;
        break label67;
        label141:
        if (paramInt2 != 2) {
          break label108;
        }
        localb2.d = (-1 + localb2.d);
        break label108;
        label161:
        if (paramInt2 == 1) {
          localb2.b = (1 + localb2.b);
        }
        for (;;)
        {
          i1 = j - 1;
          break;
          if (paramInt2 == 2) {
            localb2.b = (-1 + localb2.b);
          }
        }
        label207:
        if (j < localb2.b)
        {
          if (paramInt2 == 1)
          {
            localb2.b = (1 + localb2.b);
            localb2.d = (1 + localb2.d);
            i1 = j;
            break label114;
          }
          if (paramInt2 == 2)
          {
            localb2.b = (-1 + localb2.b);
            localb2.d = (-1 + localb2.d);
          }
        }
        i1 = j;
        break label114;
        if (localb2.b <= j)
        {
          if (localb2.a == 1) {
            j -= localb2.d;
          } else if (localb2.a == 2) {
            j += localb2.d;
          }
        }
        else if (paramInt2 == 1) {
          localb2.b = (1 + localb2.b);
        } else if (paramInt2 == 2) {
          localb2.b = (-1 + localb2.b);
        }
      }
    }
    int k = -1 + this.b.size();
    if (k >= 0)
    {
      b localb1 = (b)this.b.get(k);
      if (localb1.a == 8) {
        if ((localb1.d == localb1.b) || (localb1.d < 0))
        {
          this.b.remove(k);
          a(localb1);
        }
      }
      for (;;)
      {
        k--;
        break;
        if (localb1.d <= 0)
        {
          this.b.remove(k);
          a(localb1);
        }
      }
    }
    return j;
  }
  
  private void d(b paramb)
  {
    int i = paramb.b;
    int j = paramb.b + paramb.d;
    int k = paramb.b;
    int m = -1;
    int n = 0;
    if (k < j)
    {
      int i1;
      int i2;
      if ((this.c.a(k) != null) || (d(k)))
      {
        if (m == 0)
        {
          e(a(4, i, n, paramb.c));
          n = 0;
          i = k;
        }
        i1 = i;
        i2 = n;
      }
      for (int i3 = 1;; i3 = 0)
      {
        int i4 = i2 + 1;
        k++;
        int i5 = i3;
        n = i4;
        i = i1;
        m = i5;
        break;
        if (m == 1)
        {
          g(a(4, i, n, paramb.c));
          n = 0;
          i = k;
        }
        i1 = i;
        i2 = n;
      }
    }
    if (n != paramb.d)
    {
      Object localObject = paramb.c;
      a(paramb);
      paramb = a(4, i, n, localObject);
    }
    if (m == 0)
    {
      e(paramb);
      return;
    }
    g(paramb);
  }
  
  private boolean d(int paramInt)
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      b localb = (b)this.b.get(j);
      if (localb.a == 8)
      {
        if (a(localb.d, j + 1) == paramInt) {
          return true;
        }
      }
      else if (localb.a == 1)
      {
        int k = localb.b + localb.d;
        for (int m = localb.b; m < k; m++) {
          if (a(m, j + 1) == paramInt) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void e(b paramb)
  {
    if ((paramb.a == 1) || (paramb.a == 8)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i = d(paramb.b, paramb.a);
    int j = paramb.b;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    label118:
    int i3;
    int i4;
    switch (paramb.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramb);
    case 4: 
      k = 1;
      m = 1;
      n = i;
      i1 = j;
      i2 = 1;
      if (i2 >= paramb.d) {
        break label296;
      }
      i3 = d(paramb.b + k * i2, paramb.a);
      switch (paramb.a)
      {
      case 3: 
      default: 
        i4 = 0;
        label179:
        if (i4 != 0) {
          m++;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      i2++;
      break label118;
      k = 0;
      break;
      if (i3 == n + 1)
      {
        i4 = 1;
        break label179;
      }
      i4 = 0;
      break label179;
      if (i3 == n)
      {
        i4 = 1;
        break label179;
      }
      i4 = 0;
      break label179;
      b localb2 = a(paramb.a, n, m, paramb.c);
      a(localb2, i1);
      a(localb2);
      if (paramb.a == 4) {
        i1 += m;
      }
      m = 1;
      n = i3;
    }
    label296:
    Object localObject = paramb.c;
    a(paramb);
    if (m > 0)
    {
      b localb1 = a(paramb.a, n, m, localObject);
      a(localb1, i1);
      a(localb1);
    }
  }
  
  private void f(b paramb)
  {
    g(paramb);
  }
  
  private void g(b paramb)
  {
    this.b.add(paramb);
    switch (paramb.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramb);
    case 1: 
      this.c.c(paramb.b, paramb.d);
      return;
    case 8: 
      this.c.d(paramb.b, paramb.d);
      return;
    case 2: 
      this.c.b(paramb.b, paramb.d);
      return;
    }
    this.c.a(paramb.b, paramb.d, paramb.c);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int i = this.b.size();
    int j = paramInt1;
    b localb;
    if (paramInt2 < i)
    {
      localb = (b)this.b.get(paramInt2);
      if (localb.a == 8) {
        if (localb.b == j) {
          j = localb.d;
        }
      }
    }
    for (;;)
    {
      paramInt2++;
      break;
      if (localb.b < j) {
        j--;
      }
      if (localb.d <= j)
      {
        j++;
        continue;
        if (localb.b <= j) {
          if (localb.a == 2)
          {
            if (j < localb.b + localb.d)
            {
              j = -1;
              return j;
            }
            j -= localb.d;
          }
          else if (localb.a == 1)
          {
            j += localb.d;
          }
        }
      }
    }
  }
  
  public b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    b localb = (b)this.g.a();
    if (localb == null) {
      return new b(paramInt1, paramInt2, paramInt3, paramObject);
    }
    localb.a = paramInt1;
    localb.b = paramInt2;
    localb.d = paramInt3;
    localb.c = paramObject;
    return localb;
  }
  
  void a()
  {
    a(this.a);
    a(this.b);
    this.h = 0;
  }
  
  public void a(b paramb)
  {
    if (!this.e)
    {
      paramb.c = null;
      this.g.a(paramb);
    }
  }
  
  void a(b paramb, int paramInt)
  {
    this.c.a(paramb);
    switch (paramb.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 2: 
      this.c.a(paramInt, paramb.d);
      return;
    }
    this.c.a(paramInt, paramb.d, paramb.c);
  }
  
  void a(List<b> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      a((b)paramList.get(j));
    }
    paramList.clear();
  }
  
  boolean a(int paramInt)
  {
    return (paramInt & this.h) != 0;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    if (paramInt1 == paramInt2) {
      return false;
    }
    if (paramInt3 != i) {
      throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }
    this.a.add(a(8, paramInt1, paramInt2, null));
    this.h = (0x8 | this.h);
    if (this.a.size() == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  boolean a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = 1;
    if (paramInt2 < i) {
      return false;
    }
    this.a.add(a(4, paramInt1, paramInt2, paramObject));
    this.h = (0x4 | this.h);
    if (this.a.size() == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  int b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  void b()
  {
    this.f.a(this.a);
    int i = this.a.size();
    int j = 0;
    if (j < i)
    {
      b localb = (b)this.a.get(j);
      switch (localb.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        j++;
        break;
        f(localb);
        continue;
        c(localb);
        continue;
        d(localb);
        continue;
        b(localb);
      }
    }
    this.a.clear();
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt2 < i) {
      return false;
    }
    this.a.add(a(i, paramInt1, paramInt2, null));
    this.h = (0x1 | this.h);
    if (this.a.size() == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public int c(int paramInt)
  {
    int i = this.a.size();
    int j = 0;
    int k = paramInt;
    b localb;
    if (j < i)
    {
      localb = (b)this.a.get(j);
      switch (localb.a)
      {
      }
    }
    for (;;)
    {
      j++;
      break;
      if (localb.b <= k)
      {
        k += localb.d;
        continue;
        if (localb.b <= k)
        {
          if (localb.b + localb.d > k)
          {
            k = -1;
            return k;
          }
          k -= localb.d;
          continue;
          if (localb.b == k)
          {
            k = localb.d;
          }
          else
          {
            if (localb.b < k) {
              k--;
            }
            if (localb.d <= k) {
              k++;
            }
          }
        }
      }
    }
  }
  
  void c()
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++) {
      this.c.b((b)this.b.get(j));
    }
    a(this.b);
    this.h = 0;
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt2 < i) {
      return false;
    }
    this.a.add(a(2, paramInt1, paramInt2, null));
    this.h = (0x2 | this.h);
    if (this.a.size() == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  boolean d()
  {
    return this.a.size() > 0;
  }
  
  void e()
  {
    c();
    int i = this.a.size();
    int j = 0;
    if (j < i)
    {
      b localb = (b)this.a.get(j);
      switch (localb.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        j++;
        break;
        this.c.b(localb);
        this.c.c(localb.b, localb.d);
        continue;
        this.c.b(localb);
        this.c.a(localb.b, localb.d);
        continue;
        this.c.b(localb);
        this.c.a(localb.b, localb.d, localb.c);
        continue;
        this.c.b(localb);
        this.c.d(localb.b, localb.d);
      }
    }
    a(this.a);
    this.h = 0;
  }
  
  boolean f()
  {
    return (!this.b.isEmpty()) && (!this.a.isEmpty());
  }
  
  static abstract interface a
  {
    public abstract RecyclerView.ViewHolder a(int paramInt);
    
    public abstract void a(int paramInt1, int paramInt2);
    
    public abstract void a(int paramInt1, int paramInt2, Object paramObject);
    
    public abstract void a(c.b paramb);
    
    public abstract void b(int paramInt1, int paramInt2);
    
    public abstract void b(c.b paramb);
    
    public abstract void c(int paramInt1, int paramInt2);
    
    public abstract void d(int paramInt1, int paramInt2);
  }
  
  static class b
  {
    int a;
    int b;
    Object c;
    int d;
    
    b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.d = paramInt3;
      this.c = paramObject;
    }
    
    String a()
    {
      switch (this.a)
      {
      case 3: 
      case 5: 
      case 6: 
      case 7: 
      default: 
        return "??";
      case 1: 
        return "add";
      case 2: 
        return "rm";
      case 4: 
        return "up";
      }
      return "mv";
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      b localb;
      do
      {
        do
        {
          do
          {
            return true;
            if ((paramObject == null) || (getClass() != paramObject.getClass())) {
              return false;
            }
            localb = (b)paramObject;
            if (this.a != localb.a) {
              return false;
            }
          } while ((this.a == 8) && (Math.abs(this.d - this.b) == 1) && (this.d == localb.b) && (this.b == localb.d));
          if (this.d != localb.d) {
            return false;
          }
          if (this.b != localb.b) {
            return false;
          }
          if (this.c == null) {
            break;
          }
        } while (this.c.equals(localb.c));
        return false;
      } while (localb.c == null);
      return false;
    }
    
    public int hashCode()
    {
      return 31 * (31 * this.a + this.b) + this.d;
    }
    
    public String toString()
    {
      return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.c
 * JD-Core Version:    0.7.0.1
 */