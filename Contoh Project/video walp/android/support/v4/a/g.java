package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import android.support.v4.d.b.b;
import java.io.File;
import java.io.InputStream;

class g
  implements c.a
{
  private a.c a(a.b paramb, int paramInt)
  {
    (a.c)a(paramb.a(), paramInt, new a()
    {
      public int a(a.c paramAnonymousc)
      {
        return paramAnonymousc.b();
      }
      
      public boolean b(a.c paramAnonymousc)
      {
        return paramAnonymousc.c();
      }
    });
  }
  
  private static <T> T a(T[] paramArrayOfT, int paramInt, a<T> parama)
  {
    int i;
    int j;
    label19:
    Object localObject1;
    int n;
    label33:
    T ?;
    int i2;
    if ((paramInt & 0x1) == 0)
    {
      i = 400;
      if ((paramInt & 0x2) == 0) {
        break label123;
      }
      j = 1;
      localObject1 = null;
      int k = 2147483647;
      int m = paramArrayOfT.length;
      n = 0;
      if (n >= m) {
        break label135;
      }
      ? = paramArrayOfT[n];
      int i1 = 2 * Math.abs(parama.b(?) - i);
      if (parama.a(?) != j) {
        break label129;
      }
      i2 = 0;
      label79:
      int i3 = i2 + i1;
      if ((localObject1 != null) && (k <= i3)) {
        break label138;
      }
      k = i3;
    }
    label129:
    label135:
    label138:
    for (Object localObject2 = ?;; localObject2 = localObject1)
    {
      n++;
      localObject1 = localObject2;
      break label33;
      i = 700;
      break;
      label123:
      j = 0;
      break label19;
      i2 = 1;
      break label79;
      return localObject1;
    }
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    File localFile = h.a(paramContext);
    if (localFile == null) {
      return null;
    }
    try
    {
      boolean bool = h.a(localFile, paramResources, paramInt1);
      if (!bool) {
        return null;
      }
      Typeface localTypeface = Typeface.createFromFile(localFile.getPath());
      return localTypeface;
    }
    catch (RuntimeException localRuntimeException)
    {
      return null;
    }
    finally
    {
      localFile.delete();
    }
  }
  
  /* Error */
  public Typeface a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload 4
    //   12: invokevirtual 76	android/support/v4/a/g:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   15: astore 5
    //   17: aload_1
    //   18: invokevirtual 82	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: aload 5
    //   23: invokevirtual 87	android/support/v4/d/b$b:a	()Landroid/net/Uri;
    //   26: invokevirtual 93	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   29: astore 10
    //   31: aload 10
    //   33: astore 7
    //   35: aload_0
    //   36: aload_1
    //   37: aload 7
    //   39: invokevirtual 96	android/support/v4/a/g:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   42: astore 12
    //   44: aload 7
    //   46: invokestatic 99	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   49: aload 12
    //   51: areturn
    //   52: astore 9
    //   54: aconst_null
    //   55: astore 7
    //   57: aload 7
    //   59: invokestatic 99	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   62: aconst_null
    //   63: areturn
    //   64: astore 6
    //   66: aconst_null
    //   67: astore 7
    //   69: aload 6
    //   71: astore 8
    //   73: aload 7
    //   75: invokestatic 99	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   78: aload 8
    //   80: athrow
    //   81: astore 8
    //   83: goto -10 -> 73
    //   86: astore 11
    //   88: goto -31 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	g
    //   0	91	1	paramContext	Context
    //   0	91	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	91	3	paramArrayOfb	b.b[]
    //   0	91	4	paramInt	int
    //   15	7	5	localb	b.b
    //   64	6	6	localObject1	Object
    //   33	41	7	localInputStream1	InputStream
    //   71	8	8	localObject2	Object
    //   81	1	8	localObject3	Object
    //   52	1	9	localIOException1	java.io.IOException
    //   29	3	10	localInputStream2	InputStream
    //   86	1	11	localIOException2	java.io.IOException
    //   42	8	12	localTypeface	Typeface
    // Exception table:
    //   from	to	target	type
    //   17	31	52	java/io/IOException
    //   17	31	64	finally
    //   35	44	81	finally
    //   35	44	86	java/io/IOException
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    a.c localc = a(paramb, paramInt);
    if (localc == null) {
      return null;
    }
    return c.a(paramContext, paramResources, localc.d(), localc.a(), paramInt);
  }
  
  protected Typeface a(Context paramContext, InputStream paramInputStream)
  {
    File localFile = h.a(paramContext);
    if (localFile == null) {
      return null;
    }
    try
    {
      boolean bool = h.a(localFile, paramInputStream);
      if (!bool) {
        return null;
      }
      Typeface localTypeface = Typeface.createFromFile(localFile.getPath());
      return localTypeface;
    }
    catch (RuntimeException localRuntimeException)
    {
      return null;
    }
    finally
    {
      localFile.delete();
    }
  }
  
  protected b.b a(b.b[] paramArrayOfb, int paramInt)
  {
    (b.b)a(paramArrayOfb, paramInt, new a()
    {
      public int a(b.b paramAnonymousb)
      {
        return paramAnonymousb.c();
      }
      
      public boolean b(b.b paramAnonymousb)
      {
        return paramAnonymousb.d();
      }
    });
  }
  
  private static abstract interface a<T>
  {
    public abstract boolean a(T paramT);
    
    public abstract int b(T paramT);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.g
 * JD-Core Version:    0.7.0.1
 */