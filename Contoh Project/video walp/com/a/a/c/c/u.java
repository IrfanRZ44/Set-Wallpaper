package com.a.a.c.c;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.a.a.c.j;
import java.io.File;
import java.io.InputStream;

public class u<Data>
  implements n<String, Data>
{
  private final n<Uri, Data> a;
  
  public u(n<Uri, Data> paramn)
  {
    this.a = paramn;
  }
  
  private static Uri b(String paramString)
  {
    Uri localUri;
    if (TextUtils.isEmpty(paramString)) {
      localUri = null;
    }
    do
    {
      return localUri;
      if (paramString.charAt(0) == '/') {
        return c(paramString);
      }
      localUri = Uri.parse(paramString);
    } while (localUri.getScheme() != null);
    return c(paramString);
  }
  
  private static Uri c(String paramString)
  {
    return Uri.fromFile(new File(paramString));
  }
  
  public n.a<Data> a(String paramString, int paramInt1, int paramInt2, j paramj)
  {
    Uri localUri = b(paramString);
    if (localUri == null) {
      return null;
    }
    return this.a.a(localUri, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(String paramString)
  {
    return true;
  }
  
  public static final class a
    implements o<String, AssetFileDescriptor>
  {
    public n<String, AssetFileDescriptor> a(r paramr)
    {
      return new u(paramr.a(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b
    implements o<String, ParcelFileDescriptor>
  {
    public n<String, ParcelFileDescriptor> a(r paramr)
    {
      return new u(paramr.a(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c
    implements o<String, InputStream>
  {
    public n<String, InputStream> a(r paramr)
    {
      return new u(paramr.a(Uri.class, InputStream.class));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.u
 * JD-Core Version:    0.7.0.1
 */