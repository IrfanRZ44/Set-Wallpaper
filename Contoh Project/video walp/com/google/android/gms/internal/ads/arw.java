package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cm
public final class arw
{
  private final Collection<arq<?>> a = new ArrayList();
  private final Collection<arq<String>> b = new ArrayList();
  private final Collection<arq<String>> c = new ArrayList();
  
  public final List<String> a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      arq localarq = (arq)localIterator.next();
      String str = (String)aos.f().a(localarq);
      if (str != null) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public final void a(SharedPreferences.Editor paramEditor, int paramInt, JSONObject paramJSONObject)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      arq localarq = (arq)localIterator.next();
      if (localarq.c() == 1) {
        localarq.a(paramEditor, localarq.a(paramJSONObject));
      }
    }
  }
  
  public final void a(arq paramarq)
  {
    this.a.add(paramarq);
  }
  
  public final List<String> b()
  {
    List localList = a();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      arq localarq = (arq)localIterator.next();
      String str = (String)aos.f().a(localarq);
      if (str != null) {
        localList.add(str);
      }
    }
    return localList;
  }
  
  public final void b(arq<String> paramarq)
  {
    this.b.add(paramarq);
  }
  
  public final void c(arq<String> paramarq)
  {
    this.c.add(paramarq);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arw
 * JD-Core Version:    0.7.0.1
 */