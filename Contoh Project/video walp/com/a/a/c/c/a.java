package com.a.a.c.c;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.a.a.c.a.d;
import com.a.a.c.a.h;
import com.a.a.c.a.m;
import com.a.a.c.j;
import com.a.a.h.b;
import java.io.InputStream;
import java.util.List;

public class a<Data>
  implements n<Uri, Data>
{
  private static final int a = "file:///android_asset/".length();
  private final AssetManager b;
  private final a<Data> c;
  
  public a(AssetManager paramAssetManager, a<Data> parama)
  {
    this.b = paramAssetManager;
    this.c = parama;
  }
  
  public n.a<Data> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    String str = paramUri.toString().substring(a);
    return new n.a(new b(paramUri), this.c.a(this.b, str));
  }
  
  public boolean a(Uri paramUri)
  {
    boolean bool1 = "file".equals(paramUri.getScheme());
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = paramUri.getPathSegments().isEmpty();
      bool2 = false;
      if (!bool3)
      {
        boolean bool4 = "android_asset".equals(paramUri.getPathSegments().get(0));
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static abstract interface a<Data>
  {
    public abstract d<Data> a(AssetManager paramAssetManager, String paramString);
  }
  
  public static class b
    implements a.a<ParcelFileDescriptor>, o<Uri, ParcelFileDescriptor>
  {
    private final AssetManager a;
    
    public b(AssetManager paramAssetManager)
    {
      this.a = paramAssetManager;
    }
    
    public d<ParcelFileDescriptor> a(AssetManager paramAssetManager, String paramString)
    {
      return new h(paramAssetManager, paramString);
    }
    
    public n<Uri, ParcelFileDescriptor> a(r paramr)
    {
      return new a(this.a, this);
    }
  }
  
  public static class c
    implements a.a<InputStream>, o<Uri, InputStream>
  {
    private final AssetManager a;
    
    public c(AssetManager paramAssetManager)
    {
      this.a = paramAssetManager;
    }
    
    public d<InputStream> a(AssetManager paramAssetManager, String paramString)
    {
      return new m(paramAssetManager, paramString);
    }
    
    public n<Uri, InputStream> a(r paramr)
    {
      return new a(this.a, this);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.a
 * JD-Core Version:    0.7.0.1
 */