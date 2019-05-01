package android.support.v4.widget;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class h<T>
{
  private final k.a<ArrayList<T>> a = new k.b(10);
  private final m<T, ArrayList<T>> b = new m();
  private final ArrayList<T> c = new ArrayList();
  private final HashSet<T> d = new HashSet();
  
  private void a(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet)
  {
    if (paramArrayList.contains(paramT)) {
      return;
    }
    if (paramHashSet.contains(paramT)) {
      throw new RuntimeException("This graph contains cyclic dependencies");
    }
    paramHashSet.add(paramT);
    ArrayList localArrayList = (ArrayList)this.b.get(paramT);
    if (localArrayList != null)
    {
      int i = 0;
      int j = localArrayList.size();
      while (i < j)
      {
        a(localArrayList.get(i), paramArrayList, paramHashSet);
        i++;
      }
    }
    paramHashSet.remove(paramT);
    paramArrayList.add(paramT);
  }
  
  private void a(ArrayList<T> paramArrayList)
  {
    paramArrayList.clear();
    this.a.a(paramArrayList);
  }
  
  private ArrayList<T> c()
  {
    ArrayList localArrayList = (ArrayList)this.a.a();
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    return localArrayList;
  }
  
  public void a()
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = (ArrayList)this.b.c(j);
      if (localArrayList != null) {
        a(localArrayList);
      }
    }
    this.b.clear();
  }
  
  public void a(T paramT)
  {
    if (!this.b.containsKey(paramT)) {
      this.b.put(paramT, null);
    }
  }
  
  public void a(T paramT1, T paramT2)
  {
    if ((!this.b.containsKey(paramT1)) || (!this.b.containsKey(paramT2))) {
      throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }
    ArrayList localArrayList = (ArrayList)this.b.get(paramT1);
    if (localArrayList == null)
    {
      localArrayList = c();
      this.b.put(paramT1, localArrayList);
    }
    localArrayList.add(paramT2);
  }
  
  public ArrayList<T> b()
  {
    this.c.clear();
    this.d.clear();
    int i = 0;
    int j = this.b.size();
    while (i < j)
    {
      a(this.b.b(i), this.c, this.d);
      i++;
    }
    return this.c;
  }
  
  public boolean b(T paramT)
  {
    return this.b.containsKey(paramT);
  }
  
  public List c(T paramT)
  {
    return (List)this.b.get(paramT);
  }
  
  public List<T> d(T paramT)
  {
    Object localObject1 = null;
    int i = this.b.size();
    int j = 0;
    if (j < i)
    {
      ArrayList localArrayList = (ArrayList)this.b.c(j);
      if ((localArrayList != null) && (localArrayList.contains(paramT))) {
        if (localObject1 != null) {
          break label86;
        }
      }
    }
    label86:
    for (Object localObject2 = new ArrayList();; localObject2 = localObject1)
    {
      ((ArrayList)localObject2).add(this.b.b(j));
      localObject1 = localObject2;
      j++;
      break;
      return localObject1;
    }
  }
  
  public boolean e(T paramT)
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = (ArrayList)this.b.c(j);
      if ((localArrayList != null) && (localArrayList.contains(paramT))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.7.0.1
 */