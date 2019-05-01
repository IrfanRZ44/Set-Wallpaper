package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class zg
{
  private final ConcurrentHashMap<zh, List<Throwable>> a = new ConcurrentHashMap(16, 0.75F, 10);
  private final ReferenceQueue<Throwable> b = new ReferenceQueue();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean)
  {
    for (Reference localReference = this.b.poll(); localReference != null; localReference = this.b.poll()) {
      this.a.remove(localReference);
    }
    zh localzh = new zh(paramThrowable, null);
    return (List)this.a.get(localzh);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zg
 * JD-Core Version:    0.7.0.1
 */