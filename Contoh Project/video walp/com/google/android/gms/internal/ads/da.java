package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

@cm
public final class da
{
  private static boolean b(Context paramContext, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    int i;
    do
    {
      return true;
      i = DynamiteModule.b(paramContext, "com.google.android.gms.ads.dynamite");
      if (i == 0) {
        return false;
      }
    } while (i <= DynamiteModule.a(paramContext, "com.google.android.gms.ads.dynamite"));
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.da
 * JD-Core Version:    0.7.0.1
 */