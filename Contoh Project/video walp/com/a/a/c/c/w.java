package com.a.a.c.c;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.a.a.c.a.a;
import com.a.a.c.a.d;
import com.a.a.c.a.i;
import com.a.a.c.j;
import com.a.a.h.b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data>
  implements n<Uri, Data>
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "file", "android.resource", "content" })));
  private final c<Data> b;
  
  public w(c<Data> paramc)
  {
    this.b = paramc;
  }
  
  public n.a<Data> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new b(paramUri), this.b.a(paramUri));
  }
  
  public boolean a(Uri paramUri)
  {
    return a.contains(paramUri.getScheme());
  }
  
  public static final class a
    implements o<Uri, AssetFileDescriptor>, w.c<AssetFileDescriptor>
  {
    private final ContentResolver a;
    
    public a(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public d<AssetFileDescriptor> a(Uri paramUri)
    {
      return new a(this.a, paramUri);
    }
    
    public n<Uri, AssetFileDescriptor> a(r paramr)
    {
      return new w(this);
    }
  }
  
  public static class b
    implements o<Uri, ParcelFileDescriptor>, w.c<ParcelFileDescriptor>
  {
    private final ContentResolver a;
    
    public b(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public d<ParcelFileDescriptor> a(Uri paramUri)
    {
      return new i(this.a, paramUri);
    }
    
    public n<Uri, ParcelFileDescriptor> a(r paramr)
    {
      return new w(this);
    }
  }
  
  public static abstract interface c<Data>
  {
    public abstract d<Data> a(Uri paramUri);
  }
  
  public static class d
    implements o<Uri, InputStream>, w.c<InputStream>
  {
    private final ContentResolver a;
    
    public d(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public d<InputStream> a(Uri paramUri)
    {
      return new com.a.a.c.a.n(this.a, paramUri);
    }
    
    public n<Uri, InputStream> a(r paramr)
    {
      return new w(this);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.w
 * JD-Core Version:    0.7.0.1
 */