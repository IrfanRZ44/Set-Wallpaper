package com.a.a.c.b.b;

import com.a.a.i.h;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c
{
  private final Map<String, a> a = new HashMap();
  private final b b = new b();
  
  void a(String paramString)
  {
    try
    {
      a locala = (a)this.a.get(paramString);
      if (locala == null)
      {
        locala = this.b.a();
        this.a.put(paramString, locala);
      }
      locala.b = (1 + locala.b);
      locala.a.lock();
      return;
    }
    finally {}
  }
  
  void b(String paramString)
  {
    a locala1;
    try
    {
      locala1 = (a)h.a(this.a.get(paramString));
      if (locala1.b < 1) {
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + paramString + ", interestedThreads: " + locala1.b);
      }
    }
    finally {}
    locala1.b = (-1 + locala1.b);
    if (locala1.b == 0)
    {
      a locala2 = (a)this.a.remove(paramString);
      if (!locala2.equals(locala1)) {
        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + locala1 + ", but actually removed: " + locala2 + ", safeKey: " + paramString);
      }
      this.b.a(locala2);
    }
    locala1.a.unlock();
  }
  
  private static class a
  {
    final Lock a = new ReentrantLock();
    int b;
  }
  
  private static class b
  {
    private final Queue<c.a> a = new ArrayDeque();
    
    c.a a()
    {
      synchronized (this.a)
      {
        c.a locala = (c.a)this.a.poll();
        if (locala == null) {
          locala = new c.a();
        }
        return locala;
      }
    }
    
    void a(c.a parama)
    {
      synchronized (this.a)
      {
        if (this.a.size() < 10) {
          this.a.offer(parama);
        }
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.c
 * JD-Core Version:    0.7.0.1
 */