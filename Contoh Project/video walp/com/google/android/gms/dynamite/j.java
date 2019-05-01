package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class j
  extends PathClassLoader
{
  j(String paramString, ClassLoader paramClassLoader)
  {
    super(paramString, paramClassLoader);
  }
  
  protected final Class<?> loadClass(String paramString, boolean paramBoolean)
  {
    if ((!paramString.startsWith("java.")) && (!paramString.startsWith("android."))) {
      try
      {
        Class localClass = findClass(paramString);
        return localClass;
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
    return super.loadClass(paramString, paramBoolean);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.j
 * JD-Core Version:    0.7.0.1
 */