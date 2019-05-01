package com.a.a.c.b;

import android.support.v4.f.k.a;
import android.util.Log;
import com.a.a.c.j;
import com.a.a.c.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class h<DataType, ResourceType, Transcode>
{
  private final Class<DataType> a;
  private final List<? extends k<DataType, ResourceType>> b;
  private final com.a.a.c.d.f.e<ResourceType, Transcode> c;
  private final k.a<List<Throwable>> d;
  private final String e;
  
  public h(Class<DataType> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<? extends k<DataType, ResourceType>> paramList, com.a.a.c.d.f.e<ResourceType, Transcode> parame, k.a<List<Throwable>> parama)
  {
    this.a = paramClass;
    this.b = paramList;
    this.c = parame;
    this.d = parama;
    this.e = ("Failed DecodePath{" + paramClass.getSimpleName() + "->" + paramClass1.getSimpleName() + "->" + paramClass2.getSimpleName() + "}");
  }
  
  private u<ResourceType> a(com.a.a.c.a.e<DataType> parame, int paramInt1, int paramInt2, j paramj)
  {
    List localList = (List)com.a.a.i.h.a(this.d.a());
    try
    {
      u localu = a(parame, paramInt1, paramInt2, paramj, localList);
      return localu;
    }
    finally
    {
      this.d.a(localList);
    }
  }
  
  private u<ResourceType> a(com.a.a.c.a.e<DataType> parame, int paramInt1, int paramInt2, j paramj, List<Throwable> paramList)
  {
    Object localObject1 = null;
    int i = this.b.size();
    int j = 0;
    for (;;)
    {
      k localk;
      if (j < i) {
        localk = (k)this.b.get(j);
      }
      try
      {
        if (localk.a(parame.a(), paramj))
        {
          u localu = localk.a(parame.a(), paramInt1, paramInt2, paramj);
          localObject2 = localu;
          localObject1 = localObject2;
          if (localObject1 != null)
          {
            if (localObject1 != null) {
              break label174;
            }
            throw new p(this.e, new ArrayList(paramList));
          }
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          if (Log.isLoggable("DecodePath", 2)) {
            Log.v("DecodePath", "Failed to decode data for " + localk, localRuntimeException);
          }
          paramList.add(localRuntimeException);
        }
        j++;
        continue;
        return localObject1;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        break label118;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          label118:
          continue;
          label174:
          Object localObject2 = localObject1;
        }
      }
    }
  }
  
  public u<Transcode> a(com.a.a.c.a.e<DataType> parame, int paramInt1, int paramInt2, j paramj, a<ResourceType> parama)
  {
    u localu = parama.a(a(parame, paramInt1, paramInt2, paramj));
    return this.c.a(localu, paramj);
  }
  
  public String toString()
  {
    return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
  }
  
  static abstract interface a<ResourceType>
  {
    public abstract u<ResourceType> a(u<ResourceType> paramu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.h
 * JD-Core Version:    0.7.0.1
 */