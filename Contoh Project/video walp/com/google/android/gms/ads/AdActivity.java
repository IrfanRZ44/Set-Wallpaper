package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.ads.aoh;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.r;

public class AdActivity
  extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  public static final String SIMPLE_CLASS_NAME = "AdActivity";
  private r a;
  
  private final void a()
  {
    if (this.a != null) {}
    try
    {
      this.a.zzax();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      this.a.onActivityResult(paramInt1, paramInt2, paramIntent);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localException);
      }
    }
  }
  
  public void onBackPressed()
  {
    int i = 1;
    try
    {
      if (this.a != null)
      {
        boolean bool = this.a.zznj();
        i = bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
    if (i != 0) {
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      this.a.zzo(b.a(paramConfiguration));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = aos.b().a(this);
    if (this.a == null)
    {
      mk.d("#007 Could not call remote method.", null);
      finish();
      return;
    }
    try
    {
      this.a.onCreate(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (this.a != null) {
        this.a.onDestroy();
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  protected void onPause()
  {
    try
    {
      if (this.a != null) {
        this.a.onPause();
      }
      super.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.a != null) {
        this.a.onRestart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      if (this.a != null) {
        this.a.onResume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (this.a != null) {
        this.a.onSaveInstanceState(paramBundle);
      }
      super.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      if (this.a != null) {
        this.a.onStart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onStop()
  {
    try
    {
      if (this.a != null) {
        this.a.onStop();
      }
      super.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
        finish();
      }
    }
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    a();
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(paramView);
    a();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdActivity
 * JD-Core Version:    0.7.0.1
 */