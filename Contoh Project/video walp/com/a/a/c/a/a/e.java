package com.a.a.c.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.a.a.c.b.a.b;
import com.a.a.c.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

class e
{
  private static final a a = new a();
  private final a b;
  private final d c;
  private final b d;
  private final ContentResolver e;
  private final List<f> f;
  
  e(List<f> paramList, a parama, d paramd, b paramb, ContentResolver paramContentResolver)
  {
    this.b = parama;
    this.c = paramd;
    this.d = paramb;
    this.e = paramContentResolver;
    this.f = paramList;
  }
  
  e(List<f> paramList, d paramd, b paramb, ContentResolver paramContentResolver)
  {
    this(paramList, a, paramd, paramb, paramContentResolver);
  }
  
  private boolean a(File paramFile)
  {
    return (this.b.a(paramFile)) && (0L < this.b.b(paramFile));
  }
  
  private String c(Uri paramUri)
  {
    Cursor localCursor = this.c.a(paramUri);
    if (localCursor != null) {}
    try
    {
      if (localCursor.moveToFirst())
      {
        String str2 = localCursor.getString(0);
        str1 = str2;
        return str1;
      }
      String str1 = null;
      return null;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  /* Error */
  int a(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 35	com/a/a/c/a/a/e:e	Landroid/content/ContentResolver;
    //   6: aload_1
    //   7: invokevirtual 76	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 37	com/a/a/c/a/a/e:f	Ljava/util/List;
    //   15: aload_2
    //   16: aload_0
    //   17: getfield 33	com/a/a/c/a/a/e:d	Lcom/a/a/c/b/a/b;
    //   20: invokestatic 81	com/a/a/c/g:b	(Ljava/util/List;Ljava/io/InputStream;Lcom/a/a/c/b/a/b;)I
    //   23: istore 8
    //   25: aload_2
    //   26: ifnull +7 -> 33
    //   29: aload_2
    //   30: invokevirtual 84	java/io/InputStream:close	()V
    //   33: iload 8
    //   35: ireturn
    //   36: astore_3
    //   37: ldc 86
    //   39: iconst_3
    //   40: invokestatic 92	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   43: ifeq +29 -> 72
    //   46: ldc 86
    //   48: new 94	java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   55: ldc 97
    //   57: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_1
    //   61: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: aload_3
    //   68: invokestatic 111	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   71: pop
    //   72: aload_2
    //   73: ifnull +7 -> 80
    //   76: aload_2
    //   77: invokevirtual 84	java/io/InputStream:close	()V
    //   80: iconst_m1
    //   81: ireturn
    //   82: astore 4
    //   84: aload_2
    //   85: ifnull +7 -> 92
    //   88: aload_2
    //   89: invokevirtual 84	java/io/InputStream:close	()V
    //   92: aload 4
    //   94: athrow
    //   95: astore 9
    //   97: iload 8
    //   99: ireturn
    //   100: astore 6
    //   102: goto -22 -> 80
    //   105: astore 5
    //   107: goto -15 -> 92
    //   110: astore_3
    //   111: goto -74 -> 37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	e
    //   0	114	1	paramUri	Uri
    //   1	88	2	localInputStream	InputStream
    //   36	32	3	localNullPointerException	NullPointerException
    //   110	1	3	localIOException1	java.io.IOException
    //   82	11	4	localObject	Object
    //   105	1	5	localIOException2	java.io.IOException
    //   100	1	6	localIOException3	java.io.IOException
    //   23	75	8	i	int
    //   95	1	9	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	25	36	java/lang/NullPointerException
    //   2	25	82	finally
    //   37	72	82	finally
    //   29	33	95	java/io/IOException
    //   76	80	100	java/io/IOException
    //   88	92	105	java/io/IOException
    //   2	25	110	java/io/IOException
  }
  
  public InputStream b(Uri paramUri)
  {
    String str = c(paramUri);
    if (TextUtils.isEmpty(str)) {}
    File localFile;
    do
    {
      return null;
      localFile = this.b.a(str);
    } while (!a(localFile));
    Uri localUri = Uri.fromFile(localFile);
    try
    {
      InputStream localInputStream = this.e.openInputStream(localUri);
      return localInputStream;
    }
    catch (NullPointerException localNullPointerException)
    {
      throw ((FileNotFoundException)new FileNotFoundException("NPE opening uri: " + paramUri + " -> " + localUri).initCause(localNullPointerException));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.a.e
 * JD-Core Version:    0.7.0.1
 */