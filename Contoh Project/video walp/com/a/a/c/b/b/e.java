package com.a.a.c.b.b;

import android.util.Log;
import com.a.a.a.a.d;
import com.a.a.c.h;
import java.io.File;
import java.io.IOException;

public class e
  implements a
{
  private final j a;
  private final File b;
  private final long c;
  private final c d = new c();
  private com.a.a.a.a e;
  
  @Deprecated
  protected e(File paramFile, long paramLong)
  {
    this.b = paramFile;
    this.c = paramLong;
    this.a = new j();
  }
  
  private com.a.a.a.a a()
  {
    try
    {
      if (this.e == null) {
        this.e = com.a.a.a.a.a(this.b, 1, 1, this.c);
      }
      com.a.a.a.a locala = this.e;
      return locala;
    }
    finally {}
  }
  
  public static a a(File paramFile, long paramLong)
  {
    return new e(paramFile, paramLong);
  }
  
  public File a(h paramh)
  {
    String str = this.a.a(paramh);
    if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
      Log.v("DiskLruCacheWrapper", "Get: Obtained: " + str + " for for Key: " + paramh);
    }
    try
    {
      a.d locald = a().a(str);
      localObject = null;
      if (locald != null)
      {
        File localFile = locald.a(0);
        localObject = localFile;
      }
    }
    catch (IOException localIOException)
    {
      boolean bool;
      do
      {
        bool = Log.isLoggable("DiskLruCacheWrapper", 5);
        Object localObject = null;
      } while (!bool);
      Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", localIOException);
    }
    return localObject;
    return null;
  }
  
  public void a(h paramh, a.b paramb)
  {
    str = this.a.a(paramh);
    this.d.a(str);
    for (;;)
    {
      try
      {
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
          Log.v("DiskLruCacheWrapper", "Put: Obtained: " + str + " for for Key: " + paramh);
        }
      }
      finally
      {
        try
        {
          com.a.a.a.a locala;
          a.d locald;
          if (paramb.a(localb.a(0))) {
            localb.a();
          }
          localb.c();
          continue;
        }
        finally
        {
          com.a.a.a.a.b localb;
          localb.c();
        }
        localObject1 = finally;
        this.d.b(str);
      }
      try
      {
        locala = a();
        locald = locala.a(str);
        if (locald != null)
        {
          this.d.b(str);
          return;
        }
        localb = locala.b(str);
        if (localb == null) {
          throw new IllegalStateException("Had two simultaneous puts for: " + str);
        }
      }
      catch (IOException localIOException)
      {
        if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
          Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", localIOException);
        }
        this.d.b(str);
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.e
 * JD-Core Version:    0.7.0.1
 */