package com.naing;

import android.app.Application;
import com.google.android.gms.ads.MobileAds;

public class VideoWPApp
  extends Application
{
  public void onCreate()
  {
    super.onCreate();
    MobileAds.initialize(this, "ca-app-pub-4813660642432048-6710217853");
    try
    {
      Class.forName("android.os.AsyncTask");
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.VideoWPApp
 * JD-Core Version:    0.7.0.1
 */