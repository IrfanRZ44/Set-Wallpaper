package com.a.a.c.c;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.j;
import com.a.a.g;
import java.io.File;
import java.io.FileNotFoundException;

public final class k
  implements n<Uri, File>
{
  private final Context a;
  
  public k(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public n.a<File> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new com.a.a.h.b(paramUri), new b(this.a, paramUri));
  }
  
  public boolean a(Uri paramUri)
  {
    return com.a.a.c.a.a.b.a(paramUri);
  }
  
  public static final class a
    implements o<Uri, File>
  {
    private final Context a;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public n<Uri, File> a(r paramr)
    {
      return new k(this.a);
    }
  }
  
  private static class b
    implements d<File>
  {
    private static final String[] a = { "_data" };
    private final Context b;
    private final Uri c;
    
    b(Context paramContext, Uri paramUri)
    {
      this.b = paramContext;
      this.c = paramUri;
    }
    
    public Class<File> a()
    {
      return File.class;
    }
    
    public void a(g paramg, d.a<? super File> parama)
    {
      Cursor localCursor = this.b.getContentResolver().query(this.c, a, null, null, null);
      Object localObject1 = null;
      if (localCursor != null) {}
      try
      {
        boolean bool = localCursor.moveToFirst();
        localObject1 = null;
        if (bool)
        {
          String str = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
          localObject1 = str;
        }
        localCursor.close();
        if (TextUtils.isEmpty(localObject1))
        {
          parama.a(new FileNotFoundException("Failed to find file path for: " + this.c));
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      parama.a(new File(localObject1));
    }
    
    public void b() {}
    
    public void c() {}
    
    public a d()
    {
      return a.a;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.k
 * JD-Core Version:    0.7.0.1
 */