package com.a.a.c.d.c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.a.a.c.b.u;
import com.a.a.c.j;
import com.a.a.c.k;
import java.util.List;

public class d
  implements k<Uri, Drawable>
{
  private final Context a;
  
  public d(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private int a(Uri paramUri)
  {
    List localList = paramUri.getPathSegments();
    Object localObject;
    if (localList.size() == 2)
    {
      String str1 = paramUri.getAuthority();
      String str2 = (String)localList.get(0);
      String str3 = (String)localList.get(1);
      localObject = Integer.valueOf(this.a.getResources().getIdentifier(str3, str2, str1));
    }
    for (;;)
    {
      if (localObject == null)
      {
        throw new IllegalArgumentException("Unrecognized Uri format: " + paramUri);
        if (localList.size() == 1) {
          try
          {
            Integer localInteger = Integer.valueOf((String)localList.get(0));
            localObject = localInteger;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localObject = null;
          }
        }
      }
      else
      {
        if (((Integer)localObject).intValue() == 0) {
          throw new IllegalArgumentException("Failed to obtain resource id for: " + paramUri);
        }
        return ((Integer)localObject).intValue();
      }
      localObject = null;
    }
  }
  
  private Context a(Uri paramUri, String paramString)
  {
    try
    {
      Context localContext = this.a.createPackageContext(paramString, 0);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + paramUri, localNameNotFoundException);
    }
  }
  
  public u<Drawable> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    int i = a(paramUri);
    String str = paramUri.getAuthority();
    if (str.equals(this.a.getPackageName())) {}
    for (Context localContext = this.a;; localContext = a(paramUri, str)) {
      return c.a(a.a(localContext, i));
    }
  }
  
  public boolean a(Uri paramUri, j paramj)
  {
    return paramUri.getScheme().equals("android.resource");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.c.d
 * JD-Core Version:    0.7.0.1
 */