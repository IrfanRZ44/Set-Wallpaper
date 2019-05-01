package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class abe<MessageType extends abe<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends zl<MessageType, BuilderType>
{
  private static Map<Object, abe<?, ?>> zzdtv = new ConcurrentHashMap();
  protected ady zzdtt = ady.a();
  private int zzdtu = -1;
  
  private static <T extends abe<T, ?>> T a(T paramT, aaf paramaaf, aar paramaar)
  {
    abe localabe = (abe)paramT.a(e.d, null, null);
    try
    {
      acy.a().a(localabe).a(localabe, aai.a(paramaaf), paramaar);
      acy.a().a(localabe).c(localabe);
      return localabe;
    }
    catch (IOException localIOException)
    {
      if ((localIOException.getCause() instanceof abk)) {
        throw ((abk)localIOException.getCause());
      }
      throw new abk(localIOException.getMessage()).a(localabe);
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((localRuntimeException.getCause() instanceof abk)) {
        throw ((abk)localRuntimeException.getCause());
      }
      throw localRuntimeException;
    }
  }
  
  protected static <T extends abe<T, ?>> T a(T paramT, zw paramzw)
  {
    abe localabe1 = a(paramT, paramzw, aar.a());
    if (localabe1 != null)
    {
      boolean bool3 = Boolean.TRUE.booleanValue();
      int m = ((Byte)localabe1.a(e.a, null, null)).byteValue();
      int n;
      if (m == 1) {
        n = 1;
      }
      while (n == 0)
      {
        throw new adw(localabe1).a().a(localabe1);
        if (m == 0)
        {
          n = 0;
        }
        else
        {
          boolean bool4 = acy.a().a(localabe1).d(localabe1);
          int i1;
          if (bool3)
          {
            i1 = e.b;
            if (!bool4) {
              break label129;
            }
          }
          label129:
          for (abe localabe3 = localabe1;; localabe3 = null)
          {
            localabe1.a(i1, localabe3, null);
            n = bool4;
            break;
          }
        }
      }
    }
    if (localabe1 != null)
    {
      boolean bool1 = Boolean.TRUE.booleanValue();
      int i = ((Byte)localabe1.a(e.a, null, null)).byteValue();
      int j;
      if (i == 1) {
        j = 1;
      }
      while (j == 0)
      {
        throw new adw(localabe1).a().a(localabe1);
        if (i == 0)
        {
          j = 0;
        }
        else
        {
          boolean bool2 = acy.a().a(localabe1).d(localabe1);
          int k;
          if (bool1)
          {
            k = e.b;
            if (!bool2) {
              break label253;
            }
          }
          label253:
          for (abe localabe2 = localabe1;; localabe2 = null)
          {
            localabe1.a(k, localabe2, null);
            j = bool2;
            break;
          }
        }
      }
    }
    return localabe1;
  }
  
  /* Error */
  private static <T extends abe<T, ?>> T a(T paramT, zw paramzw, aar paramaar)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 131	com/google/android/gms/internal/ads/zw:e	()Lcom/google/android/gms/internal/ads/aaf;
    //   4: astore 4
    //   6: aload_0
    //   7: aload 4
    //   9: aload_2
    //   10: invokestatic 133	com/google/android/gms/internal/ads/abe:a	(Lcom/google/android/gms/internal/ads/abe;Lcom/google/android/gms/internal/ads/aaf;Lcom/google/android/gms/internal/ads/aar;)Lcom/google/android/gms/internal/ads/abe;
    //   13: astore 5
    //   15: aload 4
    //   17: iconst_0
    //   18: invokevirtual 138	com/google/android/gms/internal/ads/aaf:a	(I)V
    //   21: aload 5
    //   23: areturn
    //   24: astore 6
    //   26: aload 6
    //   28: aload 5
    //   30: invokevirtual 83	com/google/android/gms/internal/ads/abk:a	(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/abk;
    //   33: athrow
    //   34: astore_3
    //   35: aload_3
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramT	T
    //   0	37	1	paramzw	zw
    //   0	37	2	paramaar	aar
    //   34	2	3	localabk1	abk
    //   4	12	4	localaaf	aaf
    //   13	16	5	localabe	abe
    //   24	3	6	localabk2	abk
    // Exception table:
    //   from	to	target	type
    //   15	21	24	com/google/android/gms/internal/ads/abk
    //   0	15	34	com/google/android/gms/internal/ads/abk
    //   26	34	34	com/google/android/gms/internal/ads/abk
  }
  
  protected static <T extends abe<T, ?>> T a(T paramT, byte[] paramArrayOfByte)
  {
    abe localabe1 = b(paramT, paramArrayOfByte);
    if (localabe1 != null)
    {
      boolean bool1 = Boolean.TRUE.booleanValue();
      int i = ((Byte)localabe1.a(e.a, null, null)).byteValue();
      int j;
      if (i == 1) {
        j = 1;
      }
      while (j == 0)
      {
        throw new adw(localabe1).a().a(localabe1);
        if (i == 0)
        {
          j = 0;
        }
        else
        {
          boolean bool2 = acy.a().a(localabe1).d(localabe1);
          int k;
          if (bool1)
          {
            k = e.b;
            if (!bool2) {
              break label124;
            }
          }
          label124:
          for (abe localabe2 = localabe1;; localabe2 = null)
          {
            localabe1.a(k, localabe2, null);
            j = bool2;
            break;
          }
        }
      }
    }
    return localabe1;
  }
  
  static <T extends abe<?, ?>> T a(Class<T> paramClass)
  {
    abe localabe = (abe)zzdtv.get(paramClass);
    if (localabe == null) {}
    for (;;)
    {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localabe = (abe)zzdtv.get(paramClass);
        if (localabe != null) {
          break;
        }
        String str1 = String.valueOf(paramClass.getName());
        if (str1.length() != 0)
        {
          str2 = "Unable to get default instance for: ".concat(str1);
          throw new IllegalStateException(str2);
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        throw new IllegalStateException("Class initialization cannot fail.", localClassNotFoundException);
      }
      String str2 = new String("Unable to get default instance for: ");
    }
    return localabe;
  }
  
  protected static Object a(acl paramacl, String paramString, Object[] paramArrayOfObject)
  {
    return new ada(paramacl, paramString, paramArrayOfObject);
  }
  
  static Object a(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      Object localObject = paramMethod.invoke(paramObject, paramVarArgs);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable = localInvocationTargetException.getCause();
      if ((localThrowable instanceof RuntimeException)) {
        throw ((RuntimeException)localThrowable);
      }
      if ((localThrowable instanceof Error)) {
        throw ((Error)localThrowable);
      }
      throw new RuntimeException("Unexpected exception thrown by generated accessor method.", localThrowable);
    }
  }
  
  protected static <T extends abe<?, ?>> void a(Class<T> paramClass, T paramT)
  {
    zzdtv.put(paramClass, paramT);
  }
  
  protected static final <T extends abe<T, ?>> boolean a(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.a(e.a, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    return acy.a().a(paramT).d(paramT);
  }
  
  private static <T extends abe<T, ?>> T b(T paramT, byte[] paramArrayOfByte)
  {
    abe localabe = (abe)paramT.a(e.d, null, null);
    try
    {
      acy.a().a(localabe).a(localabe, paramArrayOfByte, 0, paramArrayOfByte.length, new zt());
      acy.a().a(localabe).c(localabe);
      if (localabe.zzdpf != 0) {
        throw new RuntimeException();
      }
    }
    catch (IOException localIOException)
    {
      if ((localIOException.getCause() instanceof abk)) {
        throw ((abk)localIOException.getCause());
      }
      throw new abk(localIOException.getMessage()).a(localabe);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw abk.a().a(localabe);
    }
    return localabe;
  }
  
  protected static <E> abj<E> m()
  {
    return acz.d();
  }
  
  protected abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  final void a(int paramInt)
  {
    this.zzdtu = paramInt;
  }
  
  public final void a(aak paramaak)
  {
    acy.a().a(getClass()).a(this, aam.a(paramaak));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!((abe)a(e.f, null, null)).getClass().isInstance(paramObject)) {
      return false;
    }
    return acy.a().a(this).a(this, (abe)paramObject);
  }
  
  public int hashCode()
  {
    if (this.zzdpf != 0) {
      return this.zzdpf;
    }
    this.zzdpf = acy.a().a(this).a(this);
    return this.zzdpf;
  }
  
  final int j()
  {
    return this.zzdtu;
  }
  
  public final boolean k()
  {
    boolean bool1 = Boolean.TRUE.booleanValue();
    int i = ((Byte)a(e.a, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool2 = acy.a().a(this).d(this);
    int j;
    if (bool1)
    {
      j = e.b;
      if (!bool2) {
        break label78;
      }
    }
    label78:
    for (abe localabe = this;; localabe = null)
    {
      a(j, localabe, null);
      return bool2;
    }
  }
  
  public final int l()
  {
    if (this.zzdtu == -1) {
      this.zzdtu = acy.a().a(this).b(this);
    }
    return this.zzdtu;
  }
  
  public String toString()
  {
    return aco.a(this, super.toString());
  }
  
  public static class a<MessageType extends abe<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends zm<MessageType, BuilderType>
  {
    protected MessageType a;
    private final MessageType b;
    private boolean c;
    
    protected a(MessageType paramMessageType)
    {
      this.b = paramMessageType;
      this.a = ((abe)paramMessageType.a(abe.e.d, null, null));
      this.c = false;
    }
    
    private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
    {
      acy.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
    }
    
    public final BuilderType a(MessageType paramMessageType)
    {
      b();
      a(this.a, paramMessageType);
      return this;
    }
    
    protected final void b()
    {
      if (this.c)
      {
        abe localabe = (abe)this.a.a(abe.e.d, null, null);
        a(localabe, this.a);
        this.a = localabe;
        this.c = false;
      }
    }
    
    public final MessageType c()
    {
      abe localabe2;
      abe localabe3;
      boolean bool1;
      int i;
      int j;
      if (this.c)
      {
        localabe2 = this.a;
        localabe3 = (abe)localabe2;
        bool1 = Boolean.TRUE.booleanValue();
        i = ((Byte)localabe3.a(abe.e.a, null, null)).byteValue();
        if (i != 1) {
          break label96;
        }
        j = 1;
      }
      for (;;)
      {
        label157:
        if (j == 0)
        {
          throw new adw(localabe3);
          abe localabe1 = this.a;
          acy.a().a(localabe1).c(localabe1);
          this.c = true;
          localabe2 = this.a;
          break;
          label96:
          if (i == 0)
          {
            j = 0;
          }
          else
          {
            boolean bool2 = acy.a().a(localabe3).d(localabe3);
            int k;
            if (bool1)
            {
              k = abe.e.b;
              if (!bool2) {
                break label157;
              }
            }
            for (abe localabe4 = localabe3;; localabe4 = null)
            {
              localabe3.a(k, localabe4, null);
              j = bool2;
              break;
            }
          }
        }
      }
      return localabe3;
    }
    
    public final boolean k()
    {
      return abe.a(this.a, false);
    }
  }
  
  public static final class b<T extends abe<T, ?>>
    extends zp<T>
  {
    private T a;
    
    public b(T paramT)
    {
      this.a = paramT;
    }
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType>
    extends abe<MessageType, BuilderType>
    implements acn
  {
    protected aaw<Object> zzdtz = aaw.a();
  }
  
  public static final class d<ContainingType extends acl, Type>
    extends aao<ContainingType, Type>
  {}
  
  public static enum e
  {
    static
    {
      int[] arrayOfInt1 = new int[7];
      arrayOfInt1[0] = a;
      arrayOfInt1[1] = b;
      arrayOfInt1[2] = c;
      arrayOfInt1[3] = d;
      arrayOfInt1[4] = e;
      arrayOfInt1[5] = f;
      arrayOfInt1[6] = g;
      l = arrayOfInt1;
      h = 1;
      i = 2;
      int[] arrayOfInt2 = new int[2];
      arrayOfInt2[0] = h;
      arrayOfInt2[1] = i;
      m = arrayOfInt2;
      j = 1;
      k = 2;
      int[] arrayOfInt3 = new int[2];
      arrayOfInt3[0] = j;
      arrayOfInt3[1] = k;
      n = arrayOfInt3;
    }
    
    public static int[] a()
    {
      return (int[])l.clone();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abe
 * JD-Core Version:    0.7.0.1
 */