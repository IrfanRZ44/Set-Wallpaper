package com.a.a.c.c;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.j;
import com.a.a.g;
import com.a.a.h.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data>
  implements n<File, Data>
{
  private final d<Data> a;
  
  public f(d<Data> paramd)
  {
    this.a = paramd;
  }
  
  public n.a<Data> a(File paramFile, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new b(paramFile), new c(paramFile, this.a));
  }
  
  public boolean a(File paramFile)
  {
    return true;
  }
  
  public static class a<Data>
    implements o<File, Data>
  {
    private final f.d<Data> a;
    
    public a(f.d<Data> paramd)
    {
      this.a = paramd;
    }
    
    public final n<File, Data> a(r paramr)
    {
      return new f(this.a);
    }
  }
  
  public static class b
    extends f.a<ParcelFileDescriptor>
  {
    public b()
    {
      super()
      {
        public ParcelFileDescriptor a(File paramAnonymousFile)
        {
          return ParcelFileDescriptor.open(paramAnonymousFile, 268435456);
        }
        
        public Class<ParcelFileDescriptor> a()
        {
          return ParcelFileDescriptor.class;
        }
        
        public void a(ParcelFileDescriptor paramAnonymousParcelFileDescriptor)
        {
          paramAnonymousParcelFileDescriptor.close();
        }
      };
    }
  }
  
  private static final class c<Data>
    implements d<Data>
  {
    private final File a;
    private final f.d<Data> b;
    private Data c;
    
    c(File paramFile, f.d<Data> paramd)
    {
      this.a = paramFile;
      this.b = paramd;
    }
    
    public Class<Data> a()
    {
      return this.b.a();
    }
    
    public void a(g paramg, d.a<? super Data> parama)
    {
      try
      {
        this.c = this.b.b(this.a);
        parama.a(this.c);
        return;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        if (Log.isLoggable("FileLoader", 3)) {
          Log.d("FileLoader", "Failed to open file", localFileNotFoundException);
        }
        parama.a(localFileNotFoundException);
      }
    }
    
    public void b()
    {
      if (this.c != null) {}
      try
      {
        this.b.a(this.c);
        return;
      }
      catch (IOException localIOException) {}
    }
    
    public void c() {}
    
    public a d()
    {
      return a.a;
    }
  }
  
  public static abstract interface d<Data>
  {
    public abstract Class<Data> a();
    
    public abstract void a(Data paramData);
    
    public abstract Data b(File paramFile);
  }
  
  public static class e
    extends f.a<InputStream>
  {
    public e()
    {
      super()
      {
        public InputStream a(File paramAnonymousFile)
        {
          return new FileInputStream(paramAnonymousFile);
        }
        
        public Class<InputStream> a()
        {
          return InputStream.class;
        }
        
        public void a(InputStream paramAnonymousInputStream)
        {
          paramAnonymousInputStream.close();
        }
      };
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.f
 * JD-Core Version:    0.7.0.1
 */