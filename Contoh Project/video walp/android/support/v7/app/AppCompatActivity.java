package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.app.TaskStackBuilder.SupportParentable;
import android.support.v7.view.b.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public class AppCompatActivity
  extends FragmentActivity
  implements TaskStackBuilder.SupportParentable, b
{
  private c a;
  private int b = 0;
  private Resources c;
  
  private boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 26) && (!paramKeyEvent.isCtrlPressed()) && (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) && (paramKeyEvent.getRepeatCount() == 0) && (!KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())))
    {
      Window localWindow = getWindow();
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))) {
        return true;
      }
    }
    return false;
  }
  
  public ActionBar a()
  {
    return d().a();
  }
  
  public android.support.v7.view.b a(b.a parama)
  {
    return null;
  }
  
  public void a(TaskStackBuilder paramTaskStackBuilder)
  {
    paramTaskStackBuilder.addParentStack(this);
  }
  
  public void a(android.support.v7.view.b paramb) {}
  
  public void a(Toolbar paramToolbar)
  {
    d().a(paramToolbar);
  }
  
  public boolean a(Intent paramIntent)
  {
    return NavUtils.shouldUpRecreateTask(this, paramIntent);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().b(paramView, paramLayoutParams);
  }
  
  public void b(Intent paramIntent)
  {
    NavUtils.navigateUpTo(this, paramIntent);
  }
  
  public void b(TaskStackBuilder paramTaskStackBuilder) {}
  
  public void b(android.support.v7.view.b paramb) {}
  
  public boolean b()
  {
    Intent localIntent = getSupportParentActivityIntent();
    if (localIntent != null)
    {
      if (a(localIntent))
      {
        TaskStackBuilder localTaskStackBuilder = TaskStackBuilder.create(this);
        a(localTaskStackBuilder);
        b(localTaskStackBuilder);
        localTaskStackBuilder.startActivities();
      }
      for (;;)
      {
        try
        {
          ActivityCompat.finishAffinity(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        b(localIntent);
      }
    }
    return false;
  }
  
  @Deprecated
  public void c() {}
  
  public void closeOptionsMenu()
  {
    ActionBar localActionBar = a();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.d()))) {
      super.closeOptionsMenu();
    }
  }
  
  public c d()
  {
    if (this.a == null) {
      this.a = c.a(this, this);
    }
    return this.a;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    ActionBar localActionBar = a();
    if ((i == 82) && (localActionBar != null) && (localActionBar.a(paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt)
  {
    return d().a(paramInt);
  }
  
  public MenuInflater getMenuInflater()
  {
    return d().b();
  }
  
  public Resources getResources()
  {
    if ((this.c == null) && (VectorEnabledTintResources.shouldBeUsed())) {
      this.c = new VectorEnabledTintResources(this, super.getResources());
    }
    if (this.c == null) {
      return super.getResources();
    }
    return this.c;
  }
  
  public Intent getSupportParentActivityIntent()
  {
    return NavUtils.getParentActivityIntent(this);
  }
  
  public void invalidateOptionsMenu()
  {
    d().f();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d().a(paramConfiguration);
    if (this.c != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.c.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged()
  {
    c();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    c localc = d();
    localc.h();
    localc.a(paramBundle);
    if ((localc.i()) && (this.b != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), this.b, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(this.b);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    d().g();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    ActionBar localActionBar = a();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.a()) != 0)) {
      return b();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    d().b(paramBundle);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    d().e();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    d().c(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    d().c();
  }
  
  protected void onStop()
  {
    super.onStop();
    d().d();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    d().a(paramCharSequence);
  }
  
  public void openOptionsMenu()
  {
    ActionBar localActionBar = a();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.c()))) {
      super.openOptionsMenu();
    }
  }
  
  public void setContentView(int paramInt)
  {
    d().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    d().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().a(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.b = paramInt;
  }
  
  public void supportInvalidateOptionsMenu()
  {
    d().f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatActivity
 * JD-Core Version:    0.7.0.1
 */