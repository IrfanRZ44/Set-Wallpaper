package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

final class h
  implements DialogInterface.OnClickListener
{
  h(g paramg, String paramString1, String paramString2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DownloadManager localDownloadManager = (DownloadManager)g.a(this.c).getSystemService("download");
    try
    {
      String str1 = this.a;
      String str2 = this.b;
      DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(str1));
      localRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
      zzbv.zzem().a(localRequest);
      localDownloadManager.enqueue(localRequest);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      this.c.a("Could not store picture.");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.h
 * JD-Core Version:    0.7.0.1
 */