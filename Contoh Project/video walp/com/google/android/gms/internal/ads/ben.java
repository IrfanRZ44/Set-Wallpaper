package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.lang.reflect.Constructor;

@cm
public class ben
{
  public static bei a(String paramString)
  {
    try
    {
      beo localbeo = new beo((sr)Class.forName(paramString, false, ben.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      return localbeo;
    }
    catch (Throwable localThrowable)
    {
      throw new RemoteException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ben
 * JD-Core Version:    0.7.0.1
 */