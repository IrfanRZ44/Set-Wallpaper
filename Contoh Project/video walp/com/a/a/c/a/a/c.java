package com.a.a.c.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;
import android.util.Log;
import com.a.a.c.a;
import com.a.a.c.a.d.a;
import com.a.a.c.b.a.b;
import com.a.a.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c
  implements com.a.a.c.a.d<InputStream>
{
  private final Uri a;
  private final e b;
  private InputStream c;
  
  c(Uri paramUri, e parame)
  {
    this.a = paramUri;
    this.b = parame;
  }
  
  public static c a(Context paramContext, Uri paramUri)
  {
    return a(paramContext, paramUri, new a(paramContext.getContentResolver()));
  }
  
  private static c a(Context paramContext, Uri paramUri, d paramd)
  {
    b localb = com.a.a.c.a(paramContext).b();
    return new c(paramUri, new e(com.a.a.c.a(paramContext).h().a(), paramd, localb, paramContext.getContentResolver()));
  }
  
  public static c b(Context paramContext, Uri paramUri)
  {
    return a(paramContext, paramUri, new b(paramContext.getContentResolver()));
  }
  
  private InputStream e()
  {
    InputStream localInputStream = this.b.b(this.a);
    if (localInputStream != null) {}
    for (int i = this.b.a(this.a);; i = -1)
    {
      if (i != -1) {
        return new com.a.a.c.a.g(localInputStream, i);
      }
      return localInputStream;
    }
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  public void a(com.a.a.g paramg, d.a<? super InputStream> parama)
  {
    try
    {
      this.c = e();
      parama.a(this.c);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", localFileNotFoundException);
      }
      parama.a(localFileNotFoundException);
    }
  }
  
  public void b()
  {
    if (this.c != null) {}
    try
    {
      this.c.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public void c() {}
  
  public a d()
  {
    return a.a;
  }
  
  static class a
    implements d
  {
    private static final String[] b = { "_data" };
    private final ContentResolver a;
    
    a(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public Cursor a(Uri paramUri)
    {
      String str = paramUri.getLastPathSegment();
      return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[] { str }, null);
    }
  }
  
  static class b
    implements d
  {
    private static final String[] b = { "_data" };
    private final ContentResolver a;
    
    b(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public Cursor a(Uri paramUri)
    {
      String str = paramUri.getLastPathSegment();
      return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[] { str }, null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.a.c
 * JD-Core Version:    0.7.0.1
 */