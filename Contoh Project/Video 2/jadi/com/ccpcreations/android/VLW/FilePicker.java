package com.ccpcreations.android.VLW;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FilePicker
  extends Activity
  implements View.OnClickListener
{
  private static final int DIALOG_WARNING = 1001;
  public static Handler callbackHandler = null;
  public static Runnable callbackRunnable = null;
  public static String curDir = "/sdcard";
  public static String[] filter = { ".avi", ".mp4", ".3gp", ".mpg", ".flv", ".3g2", ".asf", ".dv", ".mov", ".mpeg", ".rm", ".vcd", ".vob", ".wmv" };
  public static boolean isSelDirectory;
  public static String selFile = null;
  LinearLayout ll = null;
  ScrollView sv = null;
  TextView tvCurrent = null;
  View view;
  
  static
  {
    isSelDirectory = false;
  }
  
  public void callBack()
  {
    if ((callbackHandler != null) && (callbackRunnable != null)) {
      callbackHandler.post(callbackRunnable);
    }
    callbackHandler = null;
    callbackRunnable = null;
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (localObject == null) {
      if ((("/".equals(curDir) | "/sdcard".equals(curDir))) || ("/sdcard/sd".equals(curDir))) {
        showDialog(1001);
      }
    }
    File localFile;
    do
    {
      do
      {
        return;
        selFile = curDir;
        isSelDirectory = true;
        callBack();
        finish();
        return;
      } while (!(localObject instanceof File));
      localFile = (File)localObject;
      if (localFile.isDirectory())
      {
        curDir = localFile.getAbsolutePath();
        refreshView();
        return;
      }
    } while (!localFile.isFile());
    selFile = localFile.getAbsolutePath();
    isSelDirectory = false;
    callBack();
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    selFile = null;
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.sv = new ScrollView(this);
    this.sv.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.ll = new LinearLayout(this);
    this.ll.setOrientation(1);
    this.ll.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.sv.addView(this.ll);
    this.tvCurrent = new TextView(this);
    this.tvCurrent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    this.tvCurrent.setPadding(10, 20, 10, 20);
    this.tvCurrent.setBackgroundColor(-7829368);
    this.tvCurrent.setTextColor(-1);
    localLinearLayout.addView(this.tvCurrent);
    localLinearLayout.addView(this.sv);
    setContentView(localLinearLayout);
    refreshView();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    }
    new AlertDialog.Builder(this).setTitle(2131165197).setMessage(2131165198).setPositiveButton(2131165184, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FilePicker.selFile = FilePicker.curDir;
        FilePicker.isSelDirectory = true;
        FilePicker.this.callBack();
        FilePicker.this.finish();
      }
    }).setNegativeButton(2131165185, null).create();
  }
  
  public void refreshView()
  {
    this.ll.removeAllViews();
    this.sv.scrollTo(0, 0);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
    File localFile1 = new File(curDir);
    if ((!localFile1.exists()) || (!localFile1.isDirectory()))
    {
      curDir = "/sdcard";
      localFile1 = new File(curDir);
      if ((!localFile1.exists()) || (!localFile1.isDirectory()))
      {
        curDir = "/";
        localFile1 = new File(curDir);
      }
    }
    this.tvCurrent.setText("Current directory: " + curDir);
    File localFile2 = localFile1.getParentFile();
    if (localFile2 != null)
    {
      Button localButton1 = new Button(this);
      localButton1.setText(".. <go up to " + localFile2.getAbsolutePath() + ">");
      localButton1.setTag(localFile2);
      localButton1.setLayoutParams(localLayoutParams);
      localButton1.setTextColor(-16711936);
      localButton1.setBackgroundResource(2130837504);
      localButton1.setOnClickListener(this);
      this.ll.addView(localButton1);
    }
    ((File[])null);
    File[] arrayOfFile1;
    try
    {
      File[] arrayOfFile2 = localFile1.listFiles(new FileFilter()
      {
        public boolean accept(File paramAnonymousFile)
        {
          if (paramAnonymousFile.isDirectory()) {
            return true;
          }
          if (FilePicker.filter == null) {
            return true;
          }
          for (int i = 0;; i++)
          {
            if (i >= FilePicker.filter.length) {
              return false;
            }
            if (paramAnonymousFile.getName().toLowerCase().endsWith(FilePicker.filter[i])) {
              return true;
            }
          }
        }
      });
      arrayOfFile1 = arrayOfFile2;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        TextView localTextView1;
        localSecurityException.printStackTrace();
        arrayOfFile1 = (File[])null;
      }
      Arrays.sort(arrayOfFile1, new Comparator()
      {
        public int compare(File paramAnonymousFile1, File paramAnonymousFile2)
        {
          return paramAnonymousFile1.getName().compareToIgnoreCase(paramAnonymousFile2.getName());
        }
      });
      localTextView2 = new TextView(this);
      localTextView2.setText("Subdirectories:");
      localTextView2.setLayoutParams(localLayoutParams);
      localTextView2.setPadding(10, 0, 10, 0);
      localTextView2.setTextColor(-1);
      localTextView2.setBackgroundColor(-7829368);
      this.ll.addView(localTextView2);
      i = 0;
    }
    if (arrayOfFile1 == null)
    {
      localTextView1 = new TextView(this);
      localTextView1.setText("Current directory is unreadable!");
      localTextView1.setLayoutParams(localLayoutParams);
      localTextView1.setTextColor(Color.argb(255, 255, 63, 63));
      localTextView1.setBackgroundColor(-16777216);
      localTextView1.setPadding(10, 30, 10, 10);
      this.ll.addView(localTextView1);
    }
    int i;
    for (;;)
    {
      return;
      TextView localTextView2;
      if (i < arrayOfFile1.length) {
        break;
      }
      TextView localTextView3 = new TextView(this);
      localTextView3.setText("Files:");
      localTextView3.setLayoutParams(localLayoutParams);
      localTextView3.setPadding(10, 0, 10, 0);
      localTextView3.setTextColor(-1);
      localTextView3.setBackgroundColor(-7829368);
      this.ll.addView(localTextView3);
      if (!"/".equals(curDir))
      {
        Button localButton2 = new Button(this);
        localButton2.setText("<pick the entire directory>");
        localButton2.setTag(null);
        localButton2.setLayoutParams(localLayoutParams);
        localButton2.setTextColor(-16711936);
        localButton2.setBackgroundResource(2130837504);
        localButton2.setOnClickListener(this);
        this.ll.addView(localButton2);
      }
      for (int j = 0; j < arrayOfFile1.length; j++) {
        if (arrayOfFile1[j].isFile())
        {
          Button localButton3 = new Button(this);
          localButton3.setText(arrayOfFile1[j].getName());
          localButton3.setTag(arrayOfFile1[j]);
          localButton3.setLayoutParams(localLayoutParams);
          localButton3.setTextColor(-1);
          localButton3.setBackgroundResource(2130837504);
          localButton3.setOnClickListener(this);
          this.ll.addView(localButton3);
        }
      }
    }
    Button localButton4;
    if (arrayOfFile1[i].isDirectory())
    {
      localButton4 = new Button(this);
      localButton4.setText(arrayOfFile1[i].getName() + "/");
      localButton4.setTag(arrayOfFile1[i]);
      localButton4.setLayoutParams(localLayoutParams);
      if (!arrayOfFile1[i].getAbsolutePath().equals("/sdcard")) {
        break label758;
      }
      localButton4.setTextColor(-65536);
    }
    for (;;)
    {
      localButton4.setBackgroundResource(2130837504);
      localButton4.setOnClickListener(this);
      this.ll.addView(localButton4);
      i++;
      break;
      label758:
      localButton4.setTextColor(-256);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.ccpcreations.android.VLW.FilePicker
 * JD-Core Version:    0.7.0.1
 */