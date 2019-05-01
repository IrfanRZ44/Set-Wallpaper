package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class asf
{
  public static void a(asd paramasd, asc paramasc)
  {
    if (paramasc.b() == null) {
      throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
    if (TextUtils.isEmpty(paramasc.c())) {
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    }
    paramasd.a(paramasc.b(), paramasc.c(), paramasc.a(), paramasc.d());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asf
 * JD-Core Version:    0.7.0.1
 */