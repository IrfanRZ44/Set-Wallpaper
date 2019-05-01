package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public abstract class afu<K, V>
{
  private static final String a = afu.class.getSimpleName();
  
  protected static <K, V> HashMap<K, V> b(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        HashMap localHashMap = (HashMap)new ObjectInputStream(new ByteArrayInputStream(Base64.decode(paramString.getBytes(), 0))).readObject();
        return localHashMap;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.d(a, "decode object failure");
      return null;
    }
    catch (IOException localIOException)
    {
      label41:
      break label41;
    }
  }
  
  protected abstract HashMap<K, V> a();
  
  protected abstract void a(String paramString);
  
  public String toString()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(a());
      localObjectOutputStream.close();
      String str = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afu
 * JD-Core Version:    0.7.0.1
 */