package com.naing.vwallpaper.fg;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.m;
import android.content.res.AssetManager;
import com.naing.c.b;
import com.naing.model.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CWpViewModel
  extends AndroidViewModel
{
  private m<List<a>> a;
  private m<Boolean> b = new m();
  private Application c;
  
  public CWpViewModel(Application paramApplication)
  {
    super(paramApplication);
    this.c = paramApplication;
  }
  
  private void c()
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList = new ArrayList();
        try
        {
          BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(CWpViewModel.a(CWpViewModel.this).getAssets().open("colorlist"), "UTF-8"));
          for (;;)
          {
            String str = localBufferedReader.readLine();
            if (str == null) {
              break;
            }
            localArrayList.add(new a(str));
          }
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          CWpViewModel.b(CWpViewModel.this).postValue(localArrayList);
        }
      }
    }).start();
  }
  
  public m<List<a>> a()
  {
    if (this.a == null)
    {
      this.a = new m();
      c();
    }
    return this.a;
  }
  
  public void a(final int paramInt)
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          b.a(CWpViewModel.a(CWpViewModel.this), paramInt);
          CWpViewModel.c(CWpViewModel.this).postValue(Boolean.valueOf(true));
          return;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          CWpViewModel.c(CWpViewModel.this).postValue(Boolean.valueOf(false));
        }
      }
    }).start();
  }
  
  public m<Boolean> b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.fg.CWpViewModel
 * JD-Core Version:    0.7.0.1
 */