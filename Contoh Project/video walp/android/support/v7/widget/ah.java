package android.support.v7.widget;

import android.support.v4.f.a;
import android.support.v4.f.f;
import android.support.v4.f.k.a;
import android.support.v4.f.k.b;

class ah
{
  final a<RecyclerView.ViewHolder, a> a = new a();
  final f<RecyclerView.ViewHolder> b = new f();
  
  private RecyclerView.ItemAnimator.ItemHolderInfo a(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = this.a.a(paramViewHolder);
    RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = null;
    if (i < 0) {}
    for (;;)
    {
      return localItemHolderInfo;
      a locala = (a)this.a.c(i);
      localItemHolderInfo = null;
      if (locala != null)
      {
        int j = paramInt & locala.a;
        localItemHolderInfo = null;
        if (j != 0)
        {
          locala.a &= (paramInt ^ 0xFFFFFFFF);
          if (paramInt == 4) {}
          for (localItemHolderInfo = locala.b; (0xC & locala.a) == 0; localItemHolderInfo = locala.c)
          {
            this.a.d(i);
            a.a(locala);
            return localItemHolderInfo;
            if (paramInt != 8) {
              break label127;
            }
          }
        }
      }
    }
    label127:
    throw new IllegalArgumentException("Must provide flag PRE or POST");
  }
  
  RecyclerView.ViewHolder a(long paramLong)
  {
    return (RecyclerView.ViewHolder)this.b.a(paramLong);
  }
  
  void a()
  {
    this.a.clear();
    this.b.c();
  }
  
  void a(long paramLong, RecyclerView.ViewHolder paramViewHolder)
  {
    this.b.b(paramLong, paramViewHolder);
  }
  
  void a(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    a locala = (a)this.a.get(paramViewHolder);
    if (locala == null)
    {
      locala = a.a();
      this.a.put(paramViewHolder, locala);
    }
    locala.b = paramItemHolderInfo;
    locala.a = (0x4 | locala.a);
  }
  
  void a(b paramb)
  {
    int i = -1 + this.a.size();
    if (i >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.a.b(i);
      a locala = (a)this.a.d(i);
      if ((0x3 & locala.a) == 3) {
        paramb.a(localViewHolder);
      }
      for (;;)
      {
        a.a(locala);
        i--;
        break;
        if ((0x1 & locala.a) != 0)
        {
          if (locala.b == null) {
            paramb.a(localViewHolder);
          } else {
            paramb.a(localViewHolder, locala.b, locala.c);
          }
        }
        else if ((0xE & locala.a) == 14) {
          paramb.b(localViewHolder, locala.b, locala.c);
        } else if ((0xC & locala.a) == 12) {
          paramb.c(localViewHolder, locala.b, locala.c);
        } else if ((0x4 & locala.a) != 0) {
          paramb.a(localViewHolder, locala.b, null);
        } else if ((0x8 & locala.a) != 0) {
          paramb.b(localViewHolder, locala.b, locala.c);
        } else if ((0x2 & locala.a) == 0) {}
      }
    }
  }
  
  boolean a(RecyclerView.ViewHolder paramViewHolder)
  {
    a locala = (a)this.a.get(paramViewHolder);
    return (locala != null) && ((0x1 & locala.a) != 0);
  }
  
  RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder paramViewHolder)
  {
    return a(paramViewHolder, 4);
  }
  
  void b() {}
  
  void b(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    a locala = (a)this.a.get(paramViewHolder);
    if (locala == null)
    {
      locala = a.a();
      this.a.put(paramViewHolder, locala);
    }
    locala.a = (0x2 | locala.a);
    locala.b = paramItemHolderInfo;
  }
  
  RecyclerView.ItemAnimator.ItemHolderInfo c(RecyclerView.ViewHolder paramViewHolder)
  {
    return a(paramViewHolder, 8);
  }
  
  void c(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    a locala = (a)this.a.get(paramViewHolder);
    if (locala == null)
    {
      locala = a.a();
      this.a.put(paramViewHolder, locala);
    }
    locala.c = paramItemHolderInfo;
    locala.a = (0x8 | locala.a);
  }
  
  boolean d(RecyclerView.ViewHolder paramViewHolder)
  {
    a locala = (a)this.a.get(paramViewHolder);
    return (locala != null) && ((0x4 & locala.a) != 0);
  }
  
  void e(RecyclerView.ViewHolder paramViewHolder)
  {
    a locala = (a)this.a.get(paramViewHolder);
    if (locala == null)
    {
      locala = a.a();
      this.a.put(paramViewHolder, locala);
    }
    locala.a = (0x1 | locala.a);
  }
  
  void f(RecyclerView.ViewHolder paramViewHolder)
  {
    a locala = (a)this.a.get(paramViewHolder);
    if (locala == null) {
      return;
    }
    locala.a = (0xFFFFFFFE & locala.a);
  }
  
  void g(RecyclerView.ViewHolder paramViewHolder)
  {
    for (int i = -1 + this.b.b();; i--) {
      if (i >= 0)
      {
        if (paramViewHolder == this.b.c(i)) {
          this.b.a(i);
        }
      }
      else
      {
        a locala = (a)this.a.remove(paramViewHolder);
        if (locala != null) {
          a.a(locala);
        }
        return;
      }
    }
  }
  
  public void h(RecyclerView.ViewHolder paramViewHolder)
  {
    f(paramViewHolder);
  }
  
  static class a
  {
    static k.a<a> d = new k.b(20);
    int a;
    RecyclerView.ItemAnimator.ItemHolderInfo b;
    RecyclerView.ItemAnimator.ItemHolderInfo c;
    
    static a a()
    {
      a locala = (a)d.a();
      if (locala == null) {
        locala = new a();
      }
      return locala;
    }
    
    static void a(a parama)
    {
      parama.a = 0;
      parama.b = null;
      parama.c = null;
      d.a(parama);
    }
    
    static void b()
    {
      while (d.a() != null) {}
    }
  }
  
  static abstract interface b
  {
    public abstract void a(RecyclerView.ViewHolder paramViewHolder);
    
    public abstract void a(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
    
    public abstract void b(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
    
    public abstract void c(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ah
 * JD-Core Version:    0.7.0.1
 */