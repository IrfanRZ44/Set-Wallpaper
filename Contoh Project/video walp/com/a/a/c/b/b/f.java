package com.a.a.c.b.b;

import android.content.Context;
import java.io.File;

public final class f
  extends d
{
  public f(Context paramContext)
  {
    this(paramContext, "image_manager_disk_cache", 262144000L);
  }
  
  public f(Context paramContext, final String paramString, long paramLong)
  {
    super(new d.a()
    {
      public File a()
      {
        File localFile = f.this.getCacheDir();
        if (localFile == null) {
          return null;
        }
        if (paramString != null) {
          return new File(localFile, paramString);
        }
        return localFile;
      }
    }, paramLong);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.f
 * JD-Core Version:    0.7.0.1
 */