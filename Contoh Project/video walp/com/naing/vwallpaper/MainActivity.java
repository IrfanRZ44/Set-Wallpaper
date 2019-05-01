package com.naing.vwallpaper;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.b;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.naing.view.a;
import com.naing.vwallpaper.fg.c;

public class MainActivity
  extends BaseActivity
{
  private BottomNavigationView.b a = new BottomNavigationView.b()
  {
    public boolean a(MenuItem paramAnonymousMenuItem)
    {
      String str1 = "";
      String str2 = paramAnonymousMenuItem.getTitle().toString();
      Object localObject = MainActivity.a(MainActivity.this, str2);
      switch (paramAnonymousMenuItem.getItemId())
      {
      }
      while (localObject != null)
      {
        MainActivity.a(MainActivity.this, (Fragment)localObject, str2, str1);
        return true;
        str1 = MainActivity.this.getString(2131558442);
        if (localObject == null)
        {
          localObject = c.a();
          continue;
          str1 = MainActivity.this.getString(2131558481);
          if (localObject == null) {
            localObject = com.naing.vwallpaper.fg.b.a();
          }
        }
      }
      return false;
    }
  };
  
  private void a(Fragment paramFragment, String paramString1, String paramString2)
  {
    a(paramString2);
    getSupportFragmentManager().beginTransaction().replace(2131230790, paramFragment, paramString1).commitAllowingStateLoss();
  }
  
  private Fragment b(String paramString)
  {
    return getSupportFragmentManager().findFragmentByTag(paramString);
  }
  
  private void g()
  {
    if (!com.naing.c.b.b(this))
    {
      new a(this).a();
      return;
    }
    finish();
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    g();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131361820);
    a((Toolbar)findViewById(2131230845));
    BottomNavigationView localBottomNavigationView = (BottomNavigationView)findViewById(2131230855);
    localBottomNavigationView.setOnNavigationItemSelectedListener(this.a);
    localBottomNavigationView.setSelectedItemId(2131230854);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      g();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.MainActivity
 * JD-Core Version:    0.7.0.1
 */