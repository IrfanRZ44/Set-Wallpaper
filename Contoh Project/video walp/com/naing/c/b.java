package com.naing.c;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.naing.vwallpaper.VideoWallPaperService;
import java.io.File;

public class b
{
  public static final String a = Environment.getExternalStorageDirectory().getAbsolutePath();
  public static int b = 100;
  public static String c = "$0#b6@da2*";
  
  public static SharedPreferences a(Context paramContext)
  {
    return paramContext.getSharedPreferences("vwallpaper_naing_pref", 0);
  }
  
  public static Bitmap a(int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    localBitmap.eraseColor(paramInt3);
    return localBitmap;
  }
  
  public static String a()
  {
    return "aXlqIH8qJS9wQ1tSCl0pI1hFFHJiM3MGJSB9Z3FyWncNLShwZ1doIXcRISBDcFJgC3sRFgdITXxKBlAXFSZVcFpEVWIFElAEcnsTGEcnFQdAZ1pON1UKHBNDFml7LVIvJwBedVpXSXMCFxlYUkRyNmMnEQZeXHNnVlE1BSgAckdgFwQwNCtgFFZUW1dxSyBqVVVkC3EkNTAKSWJbM0UnJlRaEABgSQAyVVlQZnxnIQIlHhdlC2JXKlc2MxgCFxtgFhkVBgNCSRsVKHkQA051EAdlKkFyMFRTEFd7U35xLQBiaVcSBWYYIwMBU1gUI18tKTdTa3ZuGm4oAVYGcwUSVnMGVg5Yd0dZEH0OISlbXHpbJ3pwCyZVYmRHK1kCLxJbRnpRC1oGLRh3UBthKlN0UwZZC1cMFEwwIA1ccXRzEW8IJVNxER9GBAMnBhlzTgR1UlV3HiBoEnRqUQMKACZCRxtrGFw3VhtcQXRtGnQXJRtnUlZXVWM6IjYZTAF2Ax0kLBZ7YHFyI3Q=";
  }
  
  public static String a(Context paramContext, Uri paramUri)
  {
    String str = null;
    if (paramUri != null)
    {
      if ("content".equals(paramUri.getScheme()))
      {
        Cursor localCursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
        boolean bool = localCursor.moveToFirst();
        str = null;
        if (bool) {
          str = localCursor.getString(0);
        }
        localCursor.close();
      }
    }
    else {
      return str;
    }
    return paramUri.getPath();
  }
  
  public static String a(Integer paramInteger)
  {
    double d1 = paramInteger.intValue() / 1024L;
    if (d1 > 1024.0D)
    {
      double d2 = d1 / 1024.0D;
      if (d2 > 1024.0D)
      {
        String[] arrayOfString3 = String.valueOf(d2 / 1024.0D).split("\\.");
        return arrayOfString3[0] + " GB";
      }
      String[] arrayOfString2 = String.valueOf(d2).split("\\.");
      return arrayOfString2[0] + " MB";
    }
    String[] arrayOfString1 = String.valueOf(d1).split("\\.");
    return arrayOfString1[0] + " KB";
  }
  
  public static String a(String paramString1, String paramString2)
  {
    int i = 0;
    byte[] arrayOfByte1 = Base64.decode(paramString1, 0);
    int j = arrayOfByte1.length;
    byte[] arrayOfByte2 = paramString2.getBytes();
    int k = -1 + arrayOfByte2.length;
    byte[] arrayOfByte3 = new byte[j];
    while (i < j)
    {
      arrayOfByte3[i] = ((byte)(arrayOfByte1[i] ^ arrayOfByte2[(i % k)]));
      i++;
    }
    return new String(arrayOfByte3);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i = Math.max(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
    Bitmap localBitmap = a(i, i, paramInt);
    WallpaperManager localWallpaperManager = WallpaperManager.getInstance(paramContext);
    localWallpaperManager.setBitmap(localBitmap);
    localWallpaperManager.suggestDesiredDimensions(localBitmap.getWidth(), localBitmap.getHeight());
  }
  
  public static void a(Context paramContext, String paramString)
  {
    Toast.makeText(paramContext, paramString, 0).show();
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    a(paramContext).edit().putBoolean("isRated", paramBoolean).commit();
  }
  
  public static boolean b(Context paramContext)
  {
    return a(paramContext).getBoolean("isRated", false);
  }
  
  public static String c(Context paramContext)
  {
    return "";
  }
  
  public static void d(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.addFlags(32768);
    localIntent.addFlags(268435456);
    localIntent.setAction("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
    localIntent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", new ComponentName(paramContext, VideoWallPaperService.class));
    paramContext.startActivity(localIntent);
  }
  
  public static Typeface e(Context paramContext)
  {
    return Typeface.createFromAsset(paramContext.getAssets(), "OpenSans-Regular_0.ttf");
  }
  
  public static void f(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    String str = paramContext.getString(2131558464);
    try
    {
      localIntent.setData(Uri.parse("market://search?q=pub:" + str));
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      localIntent.setData(Uri.parse("http://play.google.com/store/search?q=pub:" + str));
      paramContext.startActivity(localIntent);
    }
  }
  
  public static void g(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    try
    {
      localIntent.setData(Uri.parse("market://details?id=" + paramContext.getPackageName()));
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      localIntent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + paramContext.getPackageName()));
      paramContext.startActivity(localIntent);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.c.b
 * JD-Core Version:    0.7.0.1
 */