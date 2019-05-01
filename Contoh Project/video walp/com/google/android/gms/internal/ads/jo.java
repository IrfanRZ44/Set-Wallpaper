package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

final class jo
  implements asz
{
  jo(jn paramjn, List paramList, asy paramasy, Context paramContext) {}
  
  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {}
      for (String str3 = "Pinging url: ".concat(str2);; str3 = new String("Pinging url: "))
      {
        je.d(str3);
        Uri localUri = Uri.parse(str1);
        this.b.a(localUri, null, null);
        break;
      }
    }
    this.b.a((Activity)this.c);
  }
  
  public final void b() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jo
 * JD-Core Version:    0.7.0.1
 */