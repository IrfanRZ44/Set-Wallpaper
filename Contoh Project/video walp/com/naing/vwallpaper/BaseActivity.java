package com.naing.vwallpaper;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.naing.b.f;
import com.naing.b.f.a;

public abstract class BaseActivity
  extends AppCompatActivity
{
  private f a;
  private AdView b;
  
  private ViewGroup g()
  {
    super.setContentView(2131361866);
    return (ViewGroup)findViewById(2131230768);
  }
  
  private void h()
  {
    final FrameLayout localFrameLayout = (FrameLayout)findViewById(2131230760);
    this.b = new AdView(this);
    this.b.setAdSize(AdSize.SMART_BANNER);
    this.b.setAdUnitId("ca-app-pub-4813660642432048/1976765923");
    this.b.loadAd(new AdRequest.Builder().addTestDevice("C27AC49661B726C1B32C3A7D6415FC4D").build());
    this.b.setAdListener(new AdListener()
    {
      public void onAdLoaded()
      {
        super.onAdLoaded();
        localFrameLayout.setVisibility(0);
      }
    });
    localFrameLayout.addView(this.b);
  }
  
  protected void a(String paramString)
  {
    a().a(paramString);
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    a((Toolbar)findViewById(2131230845));
    ActionBar localActionBar = a();
    localActionBar.a(paramBoolean);
    if (paramString != null) {
      localActionBar.a(paramString);
    }
  }
  
  public void e()
  {
    if (this.a != null) {
      this.a.c();
    }
  }
  
  public boolean f()
  {
    if (this.a != null) {
      return this.a.a();
    }
    return false;
  }
  
  protected void onDestroy()
  {
    if (this.b != null) {
      this.b.destroy();
    }
    super.onDestroy();
    if (this.a != null) {
      this.a.b();
    }
  }
  
  protected void onPause()
  {
    if (this.b != null) {
      this.b.pause();
    }
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.b != null) {
      this.b.resume();
    }
  }
  
  public void setContentView(int paramInt)
  {
    getLayoutInflater().inflate(paramInt, g(), true);
    this.a = new f(this);
    this.a.a(new f.a()
    {
      public void a()
      {
        View localView = BaseActivity.this.findViewById(2131230760);
        if (localView != null) {
          localView.setVisibility(8);
        }
        BaseActivity.this.supportInvalidateOptionsMenu();
      }
      
      public void b()
      {
        BaseActivity.a(BaseActivity.this);
        BaseActivity.this.supportInvalidateOptionsMenu();
      }
    });
    this.a.d();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.BaseActivity
 * JD-Core Version:    0.7.0.1
 */