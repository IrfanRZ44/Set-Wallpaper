package com.a.a.c.c;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.a.a.c.j;
import java.io.InputStream;

public class s<Data>
  implements n<Integer, Data>
{
  private final n<Uri, Data> a;
  private final Resources b;
  
  public s(Resources paramResources, n<Uri, Data> paramn)
  {
    this.b = paramResources;
    this.a = paramn;
  }
  
  private Uri b(Integer paramInteger)
  {
    try
    {
      Uri localUri = Uri.parse("android.resource://" + this.b.getResourcePackageName(paramInteger.intValue()) + '/' + this.b.getResourceTypeName(paramInteger.intValue()) + '/' + this.b.getResourceEntryName(paramInteger.intValue()));
      return localUri;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      if (Log.isLoggable("ResourceLoader", 5)) {
        Log.w("ResourceLoader", "Received invalid resource id: " + paramInteger, localNotFoundException);
      }
    }
    return null;
  }
  
  public n.a<Data> a(Integer paramInteger, int paramInt1, int paramInt2, j paramj)
  {
    Uri localUri = b(paramInteger);
    if (localUri == null) {
      return null;
    }
    return this.a.a(localUri, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(Integer paramInteger)
  {
    return true;
  }
  
  public static final class a
    implements o<Integer, AssetFileDescriptor>
  {
    private final Resources a;
    
    public a(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public n<Integer, AssetFileDescriptor> a(r paramr)
    {
      return new s(this.a, paramr.a(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b
    implements o<Integer, ParcelFileDescriptor>
  {
    private final Resources a;
    
    public b(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public n<Integer, ParcelFileDescriptor> a(r paramr)
    {
      return new s(this.a, paramr.a(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c
    implements o<Integer, InputStream>
  {
    private final Resources a;
    
    public c(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public n<Integer, InputStream> a(r paramr)
    {
      return new s(this.a, paramr.a(Uri.class, InputStream.class));
    }
  }
  
  public static class d
    implements o<Integer, Uri>
  {
    private final Resources a;
    
    public d(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public n<Integer, Uri> a(r paramr)
    {
      return new s(this.a, v.a());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.s
 * JD-Core Version:    0.7.0.1
 */