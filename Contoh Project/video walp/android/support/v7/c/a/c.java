package android.support.v7.c.a;

import java.lang.reflect.Array;

final class c
{
  static
  {
    if (!c.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static int a(int paramInt)
  {
    if (paramInt <= 4) {
      return 8;
    }
    return paramInt * 2;
  }
  
  public static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if ((!a) && (paramInt1 > paramArrayOfInt.length)) {
      throw new AssertionError();
    }
    if (paramInt1 + 1 > paramArrayOfInt.length)
    {
      int[] arrayOfInt = new int[a(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
      paramArrayOfInt = arrayOfInt;
    }
    paramArrayOfInt[paramInt1] = paramInt2;
    return paramArrayOfInt;
  }
  
  public static <T> T[] a(T[] paramArrayOfT, int paramInt, T paramT)
  {
    if ((!a) && (paramInt > paramArrayOfT.length)) {
      throw new AssertionError();
    }
    Object localObject;
    if (paramInt + 1 > paramArrayOfT.length)
    {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), a(paramInt));
      System.arraycopy(paramArrayOfT, 0, localObject, 0, paramInt);
    }
    for (;;)
    {
      localObject[paramInt] = paramT;
      return localObject;
      localObject = paramArrayOfT;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.c.a.c
 * JD-Core Version:    0.7.0.1
 */