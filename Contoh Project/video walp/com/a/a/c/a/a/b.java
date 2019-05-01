package com.a.a.c.a.a;

import android.net.Uri;
import java.util.List;

public final class b
{
  public static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 != -2147483648) && (paramInt2 != -2147483648) && (paramInt1 <= 512) && (paramInt2 <= 384);
  }
  
  public static boolean a(Uri paramUri)
  {
    return (paramUri != null) && ("content".equals(paramUri.getScheme())) && ("media".equals(paramUri.getAuthority()));
  }
  
  public static boolean b(Uri paramUri)
  {
    return (a(paramUri)) && (d(paramUri));
  }
  
  public static boolean c(Uri paramUri)
  {
    return (a(paramUri)) && (!d(paramUri));
  }
  
  private static boolean d(Uri paramUri)
  {
    return paramUri.getPathSegments().contains("video");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.a.b
 * JD-Core Version:    0.7.0.1
 */