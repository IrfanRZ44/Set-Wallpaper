package com.a.a.i;

import android.text.TextUtils;
import java.util.Collection;

public final class h
{
  public static <T> T a(T paramT)
  {
    return a(paramT, "Argument must not be null");
  }
  
  public static <T> T a(T paramT, String paramString)
  {
    if (paramT == null) {
      throw new NullPointerException(paramString);
    }
    return paramT;
  }
  
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Must not be null or empty");
    }
    return paramString;
  }
  
  public static <T extends Collection<Y>, Y> T a(T paramT)
  {
    if (paramT.isEmpty()) {
      throw new IllegalArgumentException("Must not be empty.");
    }
    return paramT;
  }
  
  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(paramString);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.h
 * JD-Core Version:    0.7.0.1
 */