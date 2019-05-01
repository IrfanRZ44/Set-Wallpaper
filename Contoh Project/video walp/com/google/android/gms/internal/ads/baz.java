package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@cm
public final class baz
  implements azi, bay
{
  private final bax a;
  private final HashSet<AbstractMap.SimpleEntry<String, zzv<? super bax>>> b;
  
  public baz(bax parambax)
  {
    this.a = parambax;
    this.b = new HashSet();
  }
  
  public final void a()
  {
    Iterator localIterator = this.b.iterator();
    if (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      String str1 = String.valueOf(((zzv)localSimpleEntry.getValue()).toString());
      if (str1.length() != 0) {}
      for (String str2 = "Unregistering eventhandler: ".concat(str1);; str2 = new String("Unregistering eventhandler: "))
      {
        je.a(str2);
        this.a.b((String)localSimpleEntry.getKey(), (zzv)localSimpleEntry.getValue());
        break;
      }
    }
    this.b.clear();
  }
  
  public final void a(String paramString, zzv<? super bax> paramzzv)
  {
    this.a.a(paramString, paramzzv);
    this.b.add(new AbstractMap.SimpleEntry(paramString, paramzzv));
  }
  
  public final void a(String paramString1, String paramString2)
  {
    azj.a(this, paramString1, paramString2);
  }
  
  public final void a(String paramString, Map paramMap)
  {
    azj.a(this, paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    azj.b(this, paramString, paramJSONObject);
  }
  
  public final void b(String paramString)
  {
    this.a.b(paramString);
  }
  
  public final void b(String paramString, zzv<? super bax> paramzzv)
  {
    this.a.b(paramString, paramzzv);
    this.b.remove(new AbstractMap.SimpleEntry(paramString, paramzzv));
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    azj.a(this, paramString, paramJSONObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.baz
 * JD-Core Version:    0.7.0.1
 */