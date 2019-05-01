package com.google.android.gms.a;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class b<T>
  extends a.a
{
  private final T a;
  
  private b(T paramT)
  {
    this.a = paramT;
  }
  
  public static <T> a a(T paramT)
  {
    return new b(paramT);
  }
  
  public static <T> T a(a parama)
  {
    int i = 0;
    if ((parama instanceof b)) {
      return ((b)parama).a;
    }
    IBinder localIBinder = parama.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    Object localObject1 = null;
    int j = arrayOfField.length;
    int k = 0;
    Object localObject3;
    if (k < j)
    {
      localObject3 = arrayOfField[k];
      if (((Field)localObject3).isSynthetic()) {
        break label178;
      }
      i++;
    }
    for (;;)
    {
      k++;
      localObject1 = localObject3;
      break;
      if (i == 1)
      {
        if (!localObject1.isAccessible())
        {
          localObject1.setAccessible(true);
          try
          {
            Object localObject2 = localObject1.get(localIBinder);
            return localObject2;
          }
          catch (NullPointerException localNullPointerException)
          {
            throw new IllegalArgumentException("Binder object is null.", localNullPointerException);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", localIllegalAccessException);
          }
        }
        throw new IllegalArgumentException("IObjectWrapper declared field not private!");
      }
      int m = arrayOfField.length;
      throw new IllegalArgumentException(64 + "Unexpected number of IObjectWrapper declared fields: " + m);
      label178:
      localObject3 = localObject1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.a.b
 * JD-Core Version:    0.7.0.1
 */