package com.google.android.gms.internal.ads;

final class abd
  implements ack
{
  private static final abd a = new abd();
  
  public static abd a()
  {
    return a;
  }
  
  public final boolean a(Class<?> paramClass)
  {
    return abe.class.isAssignableFrom(paramClass);
  }
  
  public final acj b(Class<?> paramClass)
  {
    if (!abe.class.isAssignableFrom(paramClass))
    {
      String str3 = String.valueOf(paramClass.getName());
      if (str3.length() != 0) {}
      for (String str4 = "Unsupported message type: ".concat(str3);; str4 = new String("Unsupported message type: ")) {
        throw new IllegalArgumentException(str4);
      }
    }
    String str1;
    try
    {
      acj localacj = (acj)abe.a(paramClass.asSubclass(abe.class)).a(abe.e.c, null, null);
      return localacj;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(paramClass.getName());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Unable to get message info for ".concat(str1);; str2 = new String("Unable to get message info for ")) {
      throw new RuntimeException(str2, localException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abd
 * JD-Core Version:    0.7.0.1
 */