package com.a.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.a.a.c.b.j;
import com.a.a.g.a.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class e
  extends ContextWrapper
{
  static final k<?, ?> a = new b();
  private final Handler b;
  private final com.a.a.c.b.a.b c;
  private final h d;
  private final com.a.a.g.a.e e;
  private final com.a.a.g.e f;
  private final Map<Class<?>, k<?, ?>> g;
  private final j h;
  private final int i;
  
  public e(Context paramContext, com.a.a.c.b.a.b paramb, h paramh, com.a.a.g.a.e parame, com.a.a.g.e parame1, Map<Class<?>, k<?, ?>> paramMap, j paramj, int paramInt)
  {
    super(paramContext.getApplicationContext());
    this.c = paramb;
    this.d = paramh;
    this.e = parame;
    this.f = parame1;
    this.g = paramMap;
    this.h = paramj;
    this.i = paramInt;
    this.b = new Handler(Looper.getMainLooper());
  }
  
  public <X> i<ImageView, X> a(ImageView paramImageView, Class<X> paramClass)
  {
    return this.e.a(paramImageView, paramClass);
  }
  
  public com.a.a.g.e a()
  {
    return this.f;
  }
  
  public <T> k<?, T> a(Class<T> paramClass)
  {
    Object localObject1 = (k)this.g.get(paramClass);
    Object localObject2;
    Map.Entry localEntry;
    if (localObject1 == null)
    {
      Iterator localIterator = this.g.entrySet().iterator();
      localObject2 = localObject1;
      if (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        if (!((Class)localEntry.getKey()).isAssignableFrom(paramClass)) {
          break label105;
        }
      }
    }
    label105:
    for (Object localObject3 = (k)localEntry.getValue();; localObject3 = localObject2)
    {
      localObject2 = localObject3;
      break;
      localObject1 = localObject2;
      if (localObject1 == null) {
        localObject1 = a;
      }
      return localObject1;
    }
  }
  
  public j b()
  {
    return this.h;
  }
  
  public h c()
  {
    return this.d;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public com.a.a.c.b.a.b e()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.e
 * JD-Core Version:    0.7.0.1
 */