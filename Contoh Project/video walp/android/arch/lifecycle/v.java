package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class v
{
  private final HashMap<String, s> a = new HashMap();
  
  final s a(String paramString)
  {
    return (s)this.a.get(paramString);
  }
  
  public final void a()
  {
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).onCleared();
    }
    this.a.clear();
  }
  
  final void a(String paramString, s params)
  {
    s locals = (s)this.a.put(paramString, params);
    if (locals != null) {
      locals.onCleared();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.v
 * JD-Core Version:    0.7.0.1
 */