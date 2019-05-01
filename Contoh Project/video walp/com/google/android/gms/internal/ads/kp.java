package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;

final class kp
  implements Runnable
{
  kp(ko paramko, Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setMessage(this.b);
    if (this.c)
    {
      localBuilder.setTitle("Error");
      if (!this.d) {
        break label68;
      }
      localBuilder.setNeutralButton("Dismiss", null);
    }
    for (;;)
    {
      localBuilder.create().show();
      return;
      localBuilder.setTitle("Info");
      break;
      label68:
      localBuilder.setPositiveButton("Learn More", new kq(this));
      localBuilder.setNegativeButton("Dismiss", null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kp
 * JD-Core Version:    0.7.0.1
 */