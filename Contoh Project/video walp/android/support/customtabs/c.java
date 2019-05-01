package android.support.customtabs;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.BundleCompat;
import java.util.ArrayList;

public final class c
{
  public final Intent a;
  public final Bundle b;
  
  private c(Intent paramIntent, Bundle paramBundle)
  {
    this.a = paramIntent;
    this.b = paramBundle;
  }
  
  public static final class a
  {
    private final Intent a = new Intent("android.intent.action.VIEW");
    private ArrayList<Bundle> b = null;
    private Bundle c = null;
    private ArrayList<Bundle> d = null;
    private boolean e = true;
    
    public a()
    {
      this(null);
    }
    
    public a(e parame)
    {
      if (parame != null) {
        this.a.setPackage(parame.b().getPackageName());
      }
      Bundle localBundle = new Bundle();
      IBinder localIBinder = null;
      if (parame == null) {}
      for (;;)
      {
        BundleCompat.putBinder(localBundle, "android.support.customtabs.extra.SESSION", localIBinder);
        this.a.putExtras(localBundle);
        return;
        localIBinder = parame.a();
      }
    }
    
    public c a()
    {
      if (this.b != null) {
        this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.b);
      }
      if (this.d != null) {
        this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.d);
      }
      this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
      return new c(this.a, this.c, null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.c
 * JD-Core Version:    0.7.0.1
 */