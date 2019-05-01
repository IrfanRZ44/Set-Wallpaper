package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.i;

public final class zzb
{
  private SharedPreferences a;
  
  public zzb(Context paramContext)
  {
    try
    {
      Context localContext = i.c(paramContext);
      if (localContext == null) {}
      SharedPreferences localSharedPreferences;
      for (Object localObject = null;; localObject = localSharedPreferences)
      {
        this.a = localObject;
        return;
        localSharedPreferences = localContext.getSharedPreferences("google_ads_flags", 0);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      Log.w("GmscoreFlag", "Error while getting SharedPreferences ", localThrowable);
      this.a = null;
    }
  }
  
  final float a(String paramString, float paramFloat)
  {
    try
    {
      if (this.a == null) {
        return 0.0F;
      }
      float f = this.a.getFloat(paramString, 0.0F);
      return f;
    }
    catch (Throwable localThrowable)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", localThrowable);
    }
    return 0.0F;
  }
  
  final String a(String paramString1, String paramString2)
  {
    try
    {
      if (this.a == null) {
        return paramString2;
      }
      String str = this.a.getString(paramString1, paramString2);
      return str;
    }
    catch (Throwable localThrowable)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", localThrowable);
    }
    return paramString2;
  }
  
  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    try
    {
      if (this.a == null) {
        return false;
      }
      boolean bool = this.a.getBoolean(paramString, false);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", localThrowable);
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.zzb
 * JD-Core Version:    0.7.0.1
 */