package com.a.a.c.a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.a.a.c.a;
import com.a.a.g;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T>
  implements d<T>
{
  private final Uri a;
  private final ContentResolver b;
  private T c;
  
  public l(ContentResolver paramContentResolver, Uri paramUri)
  {
    this.b = paramContentResolver;
    this.a = paramUri;
  }
  
  public final void a(g paramg, d.a<? super T> parama)
  {
    try
    {
      this.c = b(this.a, this.b);
      parama.a(this.c);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (Log.isLoggable("LocalUriFetcher", 3)) {
        Log.d("LocalUriFetcher", "Failed to open Uri", localFileNotFoundException);
      }
      parama.a(localFileNotFoundException);
    }
  }
  
  protected abstract void a(T paramT);
  
  protected abstract T b(Uri paramUri, ContentResolver paramContentResolver);
  
  public void b()
  {
    if (this.c != null) {}
    try
    {
      a(this.c);
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


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.l
 * JD-Core Version:    0.7.0.1
 */