package com.google.android.gms.internal.ads;

final class acc
  implements ack
{
  private ack[] a;
  
  acc(ack... paramVarArgs)
  {
    this.a = paramVarArgs;
  }
  
  public final boolean a(Class<?> paramClass)
  {
    ack[] arrayOfack = this.a;
    int i = arrayOfack.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfack[j].a(paramClass)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public final acj b(Class<?> paramClass)
  {
    for (ack localack : this.a) {
      if (localack.a(paramClass)) {
        return localack.b(paramClass);
      }
    }
    String str1 = String.valueOf(paramClass.getName());
    if (str1.length() != 0) {}
    for (String str2 = "No factory is available for message type: ".concat(str1);; str2 = new String("No factory is available for message type: ")) {
      throw new UnsupportedOperationException(str2);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acc
 * JD-Core Version:    0.7.0.1
 */