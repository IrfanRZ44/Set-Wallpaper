package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class o
{
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static String a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.o
 * JD-Core Version:    0.7.0.1
 */