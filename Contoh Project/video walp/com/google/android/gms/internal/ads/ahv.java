package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class ahv
{
  private static final char[] a = "0123456789abcdef".toCharArray();
  
  public static long a(double paramDouble, DisplayMetrics paramDisplayMetrics)
  {
    return Math.round(paramDouble / paramDisplayMetrics.density);
  }
  
  public static Activity a(View paramView)
  {
    int i = 0;
    View localView = paramView.getRootView();
    if (localView != null) {
      paramView = localView;
    }
    Context localContext = paramView.getContext();
    while (((localContext instanceof ContextWrapper)) && (i < 10))
    {
      if ((localContext instanceof Activity)) {
        return (Activity)localContext;
      }
      localContext = ((ContextWrapper)localContext).getBaseContext();
      i++;
    }
    return null;
  }
  
  public static String a(String paramString)
  {
    if ((paramString != null) && (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")))
    {
      UUID localUUID = UUID.fromString(paramString);
      byte[] arrayOfByte = new byte[16];
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localByteBuffer.putLong(localUUID.getMostSignificantBits());
      localByteBuffer.putLong(localUUID.getLeastSignificantBits());
      paramString = afv.a(arrayOfByte, true);
    }
    return paramString;
  }
  
  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    ze.a(paramThrowable, new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  public static boolean a()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static boolean a(DisplayMetrics paramDisplayMetrics)
  {
    return (paramDisplayMetrics != null) && (paramDisplayMetrics.density != 0.0F);
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.isEmpty());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahv
 * JD-Core Version:    0.7.0.1
 */