package android.support.v7.widget;

import java.util.List;

class v
{
  final a a;
  
  v(a parama)
  {
    this.a = parama;
  }
  
  private void a(List<c.b> paramList, int paramInt1, int paramInt2)
  {
    c.b localb1 = (c.b)paramList.get(paramInt1);
    c.b localb2 = (c.b)paramList.get(paramInt2);
    switch (localb2.a)
    {
    case 3: 
    default: 
      return;
    case 2: 
      a(paramList, paramInt1, localb1, paramInt2, localb2);
      return;
    case 1: 
      c(paramList, paramInt1, localb1, paramInt2, localb2);
      return;
    }
    b(paramList, paramInt1, localb1, paramInt2, localb2);
  }
  
  private int b(List<c.b> paramList)
  {
    int i = 0;
    int j = -1 + paramList.size();
    if (j >= 0) {
      if (((c.b)paramList.get(j)).a == 8)
      {
        if (i == 0) {
          break label53;
        }
        return j;
      }
    }
    label53:
    for (int k = 1;; k = i)
    {
      j--;
      i = k;
      break;
      return -1;
    }
  }
  
  private void c(List<c.b> paramList, int paramInt1, c.b paramb1, int paramInt2, c.b paramb2)
  {
    int i = paramb1.d;
    int j = paramb2.b;
    int k = 0;
    if (i < j) {
      k = -1;
    }
    if (paramb1.b < paramb2.b) {
      k++;
    }
    if (paramb2.b <= paramb1.b) {
      paramb1.b += paramb2.d;
    }
    if (paramb2.b <= paramb1.d) {
      paramb1.d += paramb2.d;
    }
    paramb2.b = (k + paramb2.b);
    paramList.set(paramInt1, paramb2);
    paramList.set(paramInt2, paramb1);
  }
  
  void a(List<c.b> paramList)
  {
    for (;;)
    {
      int i = b(paramList);
      if (i == -1) {
        break;
      }
      a(paramList, i, i + 1);
    }
  }
  
  void a(List<c.b> paramList, int paramInt1, c.b paramb1, int paramInt2, c.b paramb2)
  {
    int i = 0;
    int j;
    if (paramb1.b < paramb1.d)
    {
      if ((paramb2.b != paramb1.b) || (paramb2.d != paramb1.d - paramb1.b)) {
        break label615;
      }
      j = 1;
    }
    for (;;)
    {
      label70:
      c.b localb;
      if (paramb1.d < paramb2.b)
      {
        paramb2.b = (-1 + paramb2.b);
        if (paramb1.b > paramb2.b) {
          break label241;
        }
        paramb2.b = (1 + paramb2.b);
        localb = null;
      }
      for (;;)
      {
        label97:
        if (j != 0)
        {
          paramList.set(paramInt1, paramb2);
          paramList.remove(paramInt2);
          this.a.a(paramb1);
        }
        label588:
        label598:
        for (;;)
        {
          return;
          if ((paramb2.b != 1 + paramb1.d) || (paramb2.d != paramb1.b - paramb1.d)) {
            break label606;
          }
          i = 1;
          j = 1;
          break;
          if (paramb1.d >= paramb2.b + paramb2.d) {
            break label70;
          }
          paramb2.d = (-1 + paramb2.d);
          paramb1.a = 2;
          paramb1.d = 1;
          if (paramb2.d == 0)
          {
            paramList.remove(paramInt2);
            this.a.a(paramb2);
            return;
            label241:
            if (paramb1.b >= paramb2.b + paramb2.d) {
              break label600;
            }
            int k = paramb2.b + paramb2.d - paramb1.b;
            localb = this.a.a(2, 1 + paramb1.b, k, null);
            paramb2.d = (paramb1.b - paramb2.b);
            break label97;
            if (i != 0)
            {
              if (localb != null)
              {
                if (paramb1.b > localb.b) {
                  paramb1.b -= localb.d;
                }
                if (paramb1.d > localb.b) {
                  paramb1.d -= localb.d;
                }
              }
              if (paramb1.b > paramb2.b) {
                paramb1.b -= paramb2.d;
              }
              if (paramb1.d > paramb2.b) {
                paramb1.d -= paramb2.d;
              }
              paramList.set(paramInt1, paramb2);
              if (paramb1.b == paramb1.d) {
                break label588;
              }
              paramList.set(paramInt2, paramb1);
            }
            for (;;)
            {
              if (localb == null) {
                break label598;
              }
              paramList.add(paramInt1, localb);
              return;
              if (localb != null)
              {
                if (paramb1.b >= localb.b) {
                  paramb1.b -= localb.d;
                }
                if (paramb1.d >= localb.b) {
                  paramb1.d -= localb.d;
                }
              }
              if (paramb1.b >= paramb2.b) {
                paramb1.b -= paramb2.d;
              }
              if (paramb1.d < paramb2.b) {
                break;
              }
              paramb1.d -= paramb2.d;
              break;
              paramList.remove(paramInt2);
            }
          }
        }
        label600:
        localb = null;
      }
      label606:
      i = 1;
      j = 0;
      continue;
      label615:
      i = 0;
      j = 0;
    }
  }
  
  void b(List<c.b> paramList, int paramInt1, c.b paramb1, int paramInt2, c.b paramb2)
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramb1.d < paramb2.b)
    {
      paramb2.b = (-1 + paramb2.b);
      localObject2 = null;
    }
    for (;;)
    {
      if (paramb1.b <= paramb2.b)
      {
        paramb2.b = (1 + paramb2.b);
        label54:
        paramList.set(paramInt2, paramb1);
        if (paramb2.d <= 0) {
          break label254;
        }
        paramList.set(paramInt1, paramb2);
      }
      for (;;)
      {
        if (localObject2 != null) {
          paramList.add(paramInt1, localObject2);
        }
        if (localObject1 != null) {
          paramList.add(paramInt1, localObject1);
        }
        return;
        if (paramb1.d >= paramb2.b + paramb2.d) {
          break label276;
        }
        paramb2.d = (-1 + paramb2.d);
        localObject2 = this.a.a(4, paramb1.b, 1, paramb2.c);
        break;
        int i = paramb1.b;
        int j = paramb2.b + paramb2.d;
        localObject1 = null;
        if (i >= j) {
          break label54;
        }
        int k = paramb2.b + paramb2.d - paramb1.b;
        localObject1 = this.a.a(4, 1 + paramb1.b, k, paramb2.c);
        paramb2.d -= k;
        break label54;
        label254:
        paramList.remove(paramInt1);
        this.a.a(paramb2);
      }
      label276:
      localObject2 = null;
    }
  }
  
  static abstract interface a
  {
    public abstract c.b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject);
    
    public abstract void a(c.b paramb);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.v
 * JD-Core Version:    0.7.0.1
 */