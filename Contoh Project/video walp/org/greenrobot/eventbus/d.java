package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.a.b;

public class d
{
  private static final ExecutorService m = ;
  boolean a = true;
  boolean b = true;
  boolean c = true;
  boolean d = true;
  boolean e;
  boolean f = true;
  boolean g;
  boolean h;
  ExecutorService i = m;
  List<b> j;
  g k;
  h l;
  
  g a()
  {
    if (this.k != null) {
      return this.k;
    }
    if ((g.a.a()) && (c() != null)) {
      return new g.a("EventBus");
    }
    return new g.b();
  }
  
  h b()
  {
    if (this.l != null) {
      return this.l;
    }
    if (g.a.a())
    {
      Object localObject = c();
      if (localObject == null) {
        return null;
      }
      return new h.a((Looper)localObject);
    }
    return null;
  }
  
  Object c()
  {
    try
    {
      Looper localLooper = Looper.getMainLooper();
      return localLooper;
    }
    catch (RuntimeException localRuntimeException) {}
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.d
 * JD-Core Version:    0.7.0.1
 */