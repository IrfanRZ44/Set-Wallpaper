package com.a.a.c.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.a.a.c.a;
import com.a.a.g;
import java.io.IOException;

public abstract class b<T>
  implements d<T>
{
  private final String a;
  private final AssetManager b;
  private T c;
  
  public b(AssetManager paramAssetManager, String paramString)
  {
    this.b = paramAssetManager;
    this.a = paramString;
  }
  
  protected abstract T a(AssetManager paramAssetManager, String paramString);
  
  public void a(g paramg, d.a<? super T> parama)
  {
    try
    {
      this.c = a(this.b, this.a);
      parama.a(this.c);
      return;
    }
    catch (IOException localIOException)
    {
      if (Log.isLoggable("AssetPathFetcher", 3)) {
        Log.d("AssetPathFetcher", "Failed to load data from asset manager", localIOException);
      }
      parama.a(localIOException);
    }
  }
  
  protected abstract void a(T paramT);
  
  public void b()
  {
    if (this.c == null) {
      return;
    }
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
 * Qualified Name:     com.a.a.c.a.b
 * JD-Core Version:    0.7.0.1
 */