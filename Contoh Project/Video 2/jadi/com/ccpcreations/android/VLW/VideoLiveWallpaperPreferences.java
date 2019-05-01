package com.ccpcreations.android.VLW;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.webkit.WebView;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class VideoLiveWallpaperPreferences
  extends PreferenceActivity
  implements Runnable
{
  private static int currentVersion = -1;
  private final int DIALOG_ABOUT = 1002;
  private final int DIALOG_CHANGELOG = 1003;
  private final int DIALOG_DONATE = 1001;
  private final int DIALOG_EULA = 1005;
  private final int DIALOG_HELP = 1004;
  private Handler callbackHandler = null;
  
  private String getChangelogText()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<p><b>v0.84b, published 2011-03-20</b>");
    localStringBuilder.append("<ul>");
    localStringBuilder.append("<li>fixed a bug which prevented this app from working on certain devices like Dell Streak (thanks to guyver3869 for testing)</li>");
    localStringBuilder.append("<li>fixed a minor memory usage bug, still working on the bigger one</li>");
    localStringBuilder.append("</ul></p>");
    localStringBuilder.append("<p><b>v0.83b, published 2010-12-06</b>");
    localStringBuilder.append("<ul>");
    localStringBuilder.append("<li>fixed a bug where memory consumption would slowly raise and eventually crashed the app</li>");
    localStringBuilder.append("<li>a new feature/setting called Rendering mode is introduced</li>");
    localStringBuilder.append("</ul></p>");
    localStringBuilder.append("<p><b>v0.82b, published 2010-10-13</b>");
    localStringBuilder.append("<ul>");
    localStringBuilder.append("<li>fixed a bug where changelog kept showing in settings. Sorry about this!</li>");
    localStringBuilder.append("</ul></p>");
    localStringBuilder.append("<p><b>v0.81b, published 2010-10-13</b>");
    localStringBuilder.append("<ul>");
    localStringBuilder.append("<li>fixed a bug where selecting certain directories would cause force closes</li>");
    localStringBuilder.append("<li>fixed a bug where selecting a different video file would have no effect (thanks to <i>rod</i> for discovering the bug)</li>");
    localStringBuilder.append("<li>corrected grammatical errors in help</li>");
    localStringBuilder.append("</ul></p>");
    localStringBuilder.append("<p><b>v0.80b, published 2010-10-10</b>");
    localStringBuilder.append("<ul>");
    localStringBuilder.append("<li>initial release</li>");
    localStringBuilder.append("</ul></p>");
    return localStringBuilder.toString();
  }
  
  private String getEulaText()
  {
    return "<p>By installing and using this application, you agree to the following: the application is provided &quot;as is&quot;, without warranty of any kind, express or implied, including but not limited to the warranties of merchantability, fitness for a particular purpose and noninfringement. In no event shall the author be liable for any claim, damages or other liability, whether in an action of contract, tort or otherwise, arising from, out of or in connection with the application.</p><p>Video Live Wallpaper is dinamically linked with the FFmpeg library licenced under the LGPLv2.1. <a href='http://ffmpeg.org/'>http://ffmpeg.org/</a>. The library's source was taken directly from the amazing Rock Player project by Redirect Intelligence. <a href='http://rockplayer.freecoder.org/'>http://rockplayer.freecoder.org/</a>. The source code of the FFmpeg library can be found there.</p>";
  }
  
  private void setStateBasedOnDirectory(boolean paramBoolean)
  {
    findPreference("recursive_dir").setEnabled(paramBoolean);
    findPreference("random_file_mode").setEnabled(paramBoolean);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2130968576);
    this.callbackHandler = new Handler();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    try
    {
      currentVersion = getPackageManager().getPackageInfo("com.ccpcreations.android.VLW", 128).versionCode;
      if (currentVersion <= 0) {
        throw new RuntimeException("App version is <=0!");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException(localNameNotFoundException);
    }
    Preference localPreference = findPreference("pick_a_file");
    localPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        FilePicker.callbackHandler = VideoLiveWallpaperPreferences.this.callbackHandler;
        FilePicker.callbackRunnable = VideoLiveWallpaperPreferences.this;
        Intent localIntent = new Intent(VideoLiveWallpaperPreferences.this, FilePicker.class);
        VideoLiveWallpaperPreferences.this.startActivity(localIntent);
        return true;
      }
    });
    String str = localSharedPreferences.getString("video", null);
    if (str == null)
    {
      setStateBasedOnDirectory(false);
      localPreference.setSummary(2131165196);
      findPreference("donate_btn").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          VideoLiveWallpaperPreferences.this.showDialog(1001);
          return true;
        }
      });
      findPreference("help_btn").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          VideoLiveWallpaperPreferences.this.showDialog(1004);
          return true;
        }
      });
      findPreference("about_btn").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          VideoLiveWallpaperPreferences.this.showDialog(1002);
          return true;
        }
      });
      findPreference("changelog_btn").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          VideoLiveWallpaperPreferences.this.showDialog(1003);
          return true;
        }
      });
      if (localSharedPreferences.getBoolean("EulaAgreed", false)) {
        break label241;
      }
      showDialog(1005);
    }
    label241:
    while (localSharedPreferences.getInt("ChangelogLastViewed", 0) == currentVersion)
    {
      return;
      File localFile = new File(str);
      localPreference.setSummary(str);
      setStateBasedOnDirectory(localFile.isDirectory());
      break;
    }
    showDialog(1003);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    String str1 = getString(2131165192) + "\r\nURL: http://www.ccpcreations.com/androiddonate.html";
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    case 1001: 
      new AlertDialog.Builder(this).setTitle(2131165190).setMessage(str1).setPositiveButton(2131165184, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          VideoLiveWallpaperPreferences.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.ccpcreations.com/androiddonate.html")));
        }
      }).setNegativeButton(2131165185, null).create();
    case 1004: 
      InputStream localInputStream = getResources().openRawResource(2131034112);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      StringBuilder localStringBuilder4 = new StringBuilder();
      try
      {
        for (;;)
        {
          String str2 = localBufferedReader.readLine();
          if (str2 == null)
          {
            localBufferedReader.close();
            localInputStream.close();
            WebView localWebView4 = new WebView(this);
            localWebView4.loadData(localStringBuilder4.toString(), "text/html", "UTF-8");
            return new AlertDialog.Builder(this).setTitle(2131165229).setView(localWebView4).setPositiveButton(2131165186, null).create();
          }
          localStringBuilder4.append(str2);
          localStringBuilder4.append("\n");
        }
        localWebView3 = new WebView(this);
      }
      catch (IOException localIOException)
      {
        throw new RuntimeException(localIOException);
      }
    case 1002: 
      WebView localWebView3;
      StringBuilder localStringBuilder3 = new StringBuilder();
      localStringBuilder3.append("<html><head><title></title></head><body>");
      localStringBuilder3.append("<p>Developed by C.C.P. Cre@ions especially for PBJS inc. <a href='http://android.ccpcreations.com/'>http://android.ccpcreations.com/</a>. <a href='http://www.pbjs.com/'>http://www.pbjs.com/</a>.</p>");
      localStringBuilder3.append("<p>Copyright 2010. All rights reserved. Home page: <a href='http://android.ccpcreations.com/vlw/'>http://android.ccpcreations.com/vlw/</a>. Contact and support: <a href='mailto:vlw@ccpcreations.com'>vlw@ccpcreations.com</a></p>");
      localStringBuilder3.append(getEulaText());
      localStringBuilder3.append("<p></p>");
      localStringBuilder3.append("</body></html>");
      localWebView3.loadData(localStringBuilder3.toString(), "text/html", "UTF-8");
      return new AlertDialog.Builder(this).setTitle(2131165233).setView(localWebView3).setPositiveButton(2131165186, null).create();
    case 1005: 
      WebView localWebView2 = new WebView(this);
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("<html><head><title></title></head><body>");
      localStringBuilder2.append("<p><b>IMPORTANT - PLEASE READ CAREFULLY BEFORE USING!</b> You might have to scroll down to see the entire EULA.</p>");
      localStringBuilder2.append(getEulaText());
      localStringBuilder2.append("<p></p>");
      localStringBuilder2.append("</body></html>");
      localWebView2.loadData(localStringBuilder2.toString(), "text/html", "UTF-8");
      new AlertDialog.Builder(this).setTitle(2131165226).setView(localWebView2).setPositiveButton(2131165227, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(VideoLiveWallpaperPreferences.this.getApplicationContext()).edit();
          localEditor.putBoolean("EulaAgreed", true);
          localEditor.commit();
          VideoLiveWallpaperPreferences.this.showDialog(1003);
        }
      }).setNegativeButton(2131165228, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          VideoLiveWallpaperPreferences.this.finish();
        }
      }).setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          VideoLiveWallpaperPreferences.this.finish();
        }
      }).create();
    }
    WebView localWebView1 = new WebView(this);
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("<html><head><title></title></head><body>");
    localStringBuilder1.append(getChangelogText());
    localStringBuilder1.append("</body></html>");
    localWebView1.loadData(localStringBuilder1.toString(), "text/html", "UTF-8");
    new AlertDialog.Builder(this).setTitle(2131165231).setView(localWebView1).setPositiveButton(2131165186, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(VideoLiveWallpaperPreferences.this.getApplicationContext()).edit();
        localEditor.putInt("ChangelogLastViewed", VideoLiveWallpaperPreferences.currentVersion);
        localEditor.commit();
      }
    }).setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(VideoLiveWallpaperPreferences.this.getApplicationContext()).edit();
        localEditor.putInt("ChangelogLastViewed", VideoLiveWallpaperPreferences.currentVersion);
        localEditor.commit();
      }
    }).create();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    VideoLiveWallpaper.readPreferences = true;
  }
  
  public void run()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
    localEditor.putString("video", FilePicker.selFile);
    localEditor.commit();
    findPreference("pick_a_file").setSummary(FilePicker.selFile);
    setStateBasedOnDirectory(FilePicker.isSelDirectory);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.ccpcreations.android.VLW.VideoLiveWallpaperPreferences
 * JD-Core Version:    0.7.0.1
 */