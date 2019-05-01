package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.i.a;
import com.google.android.gms.common.internal.n;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
final class e
{
  private static final Object a = new Object();
  private static Context b;
  
  /* Error */
  static void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 19	com/google/android/gms/common/e:b	Landroid/content/Context;
    //   6: ifnonnull +18 -> 24
    //   9: aload_0
    //   10: ifnull +10 -> 20
    //   13: aload_0
    //   14: invokevirtual 25	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: putstatic 19	com/google/android/gms/common/e:b	Landroid/content/Context;
    //   20: ldc 2
    //   22: monitorexit
    //   23: return
    //   24: ldc 27
    //   26: ldc 29
    //   28: invokestatic 35	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: goto -12 -> 20
    //   35: astore_1
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramContext	Context
    //   35	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	9	35	finally
    //   13	20	35	finally
    //   24	32	35	finally
  }
  
  static abstract class a
    extends i.a
  {
    private int a;
    
    protected a(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length == 25) {}
      for (boolean bool = true;; bool = false)
      {
        n.b(bool);
        this.a = Arrays.hashCode(paramArrayOfByte);
        return;
      }
    }
    
    protected static byte[] a(String paramString)
    {
      try
      {
        byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
        return arrayOfByte;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new AssertionError(localUnsupportedEncodingException);
      }
    }
    
    abstract byte[] a();
    
    public a b()
    {
      return b.a(a());
    }
    
    public int c()
    {
      return hashCode();
    }
    
    public boolean equals(Object paramObject)
    {
      if ((paramObject == null) || (!(paramObject instanceof i))) {
        return false;
      }
      try
      {
        i locali = (i)paramObject;
        if (locali.c() != hashCode()) {
          return false;
        }
        a locala = locali.b();
        if (locala == null) {
          return false;
        }
        byte[] arrayOfByte = (byte[])b.a(locala);
        boolean bool = Arrays.equals(a(), arrayOfByte);
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", localRemoteException);
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.a;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.e
 * JD-Core Version:    0.7.0.1
 */