package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.k;
import javax.annotation.concurrent.GuardedBy;

@cm
final class si
{
  @GuardedBy("InvokeJavascriptWorkaround.class")
  private static Boolean a;
  
  @TargetApi(19)
  static void a(WebView paramWebView, String paramString)
  {
    if ((k.g()) && (a(paramWebView)))
    {
      paramWebView.evaluateJavascript(paramString, null);
      return;
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "javascript:".concat(str1);; str2 = new String("javascript:"))
    {
      paramWebView.loadUrl(str2);
      return;
    }
  }
  
  /* Error */
  @TargetApi(19)
  private static boolean a(WebView paramWebView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 58	com/google/android/gms/internal/ads/si:a	Ljava/lang/Boolean;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +17 -> 25
    //   11: aload_0
    //   12: ldc 60
    //   14: aconst_null
    //   15: invokevirtual 32	android/webkit/WebView:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   18: iconst_1
    //   19: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   22: putstatic 58	com/google/android/gms/internal/ads/si:a	Ljava/lang/Boolean;
    //   25: getstatic 58	com/google/android/gms/internal/ads/si:a	Ljava/lang/Boolean;
    //   28: invokevirtual 68	java/lang/Boolean:booleanValue	()Z
    //   31: istore_3
    //   32: ldc 2
    //   34: monitorexit
    //   35: iload_3
    //   36: ireturn
    //   37: astore 4
    //   39: iconst_0
    //   40: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   43: putstatic 58	com/google/android/gms/internal/ads/si:a	Ljava/lang/Boolean;
    //   46: goto -21 -> 25
    //   49: astore_1
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramWebView	WebView
    //   49	5	1	localObject	Object
    //   6	2	2	localBoolean	Boolean
    //   31	5	3	bool	boolean
    //   37	1	4	localIllegalStateException	java.lang.IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   11	25	37	java/lang/IllegalStateException
    //   3	7	49	finally
    //   11	25	49	finally
    //   25	35	49	finally
    //   39	46	49	finally
    //   50	53	49	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.si
 * JD-Core Version:    0.7.0.1
 */