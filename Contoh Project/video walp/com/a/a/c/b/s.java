package com.a.a.c.b;

import android.support.v4.f.k.a;
import com.a.a.c.a.e;
import com.a.a.c.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s<Data, ResourceType, Transcode>
{
  private final Class<Data> a;
  private final k.a<List<Throwable>> b;
  private final List<? extends h<Data, ResourceType, Transcode>> c;
  private final String d;
  
  public s(Class<Data> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<h<Data, ResourceType, Transcode>> paramList, k.a<List<Throwable>> parama)
  {
    this.a = paramClass;
    this.b = parama;
    this.c = ((List)com.a.a.i.h.a(paramList));
    this.d = ("Failed LoadPath{" + paramClass.getSimpleName() + "->" + paramClass1.getSimpleName() + "->" + paramClass2.getSimpleName() + "}");
  }
  
  private u<Transcode> a(e<Data> parame, j paramj, int paramInt1, int paramInt2, h.a<ResourceType> parama, List<Throwable> paramList)
  {
    Object localObject1 = null;
    int i = this.c.size();
    int j = 0;
    Object localObject2;
    if (j < i)
    {
      h localh = (h)this.c.get(j);
      try
      {
        u localu = localh.a(parame, paramInt1, paramInt2, paramj, parama);
        localObject2 = localu;
      }
      catch (p localp)
      {
        for (;;)
        {
          paramList.add(localp);
          localObject2 = localObject1;
        }
        j++;
        localObject1 = localObject2;
      }
      if (localObject2 == null) {}
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        throw new p(this.d, new ArrayList(paramList));
        break;
      }
      return localObject2;
      localObject2 = localObject1;
    }
  }
  
  public u<Transcode> a(e<Data> parame, j paramj, int paramInt1, int paramInt2, h.a<ResourceType> parama)
  {
    List localList = (List)com.a.a.i.h.a(this.b.a());
    try
    {
      u localu = a(parame, paramj, paramInt1, paramInt2, parama, localList);
      return localu;
    }
    finally
    {
      this.b.a(localList);
    }
  }
  
  public String toString()
  {
    return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.s
 * JD-Core Version:    0.7.0.1
 */