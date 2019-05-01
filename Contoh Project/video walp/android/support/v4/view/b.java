package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b
{
  private static final String TAG = "ActionProvider(support)";
  private final Context mContext;
  private a mSubUiVisibilityListener;
  private b mVisibilityListener;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isVisible()
  {
    return true;
  }
  
  public abstract View onCreateActionView();
  
  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return false;
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu) {}
  
  public boolean overridesItemVisibility()
  {
    return false;
  }
  
  public void refreshVisibility()
  {
    if ((this.mVisibilityListener != null) && (overridesItemVisibility())) {
      this.mVisibilityListener.a(isVisible());
    }
  }
  
  public void reset()
  {
    this.mVisibilityListener = null;
    this.mSubUiVisibilityListener = null;
  }
  
  public void setSubUiVisibilityListener(a parama)
  {
    this.mSubUiVisibilityListener = parama;
  }
  
  public void setVisibilityListener(b paramb)
  {
    if ((this.mVisibilityListener != null) && (paramb != null)) {
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    }
    this.mVisibilityListener = paramb;
  }
  
  public void subUiVisibilityChanged(boolean paramBoolean)
  {
    if (this.mSubUiVisibilityListener != null) {
      this.mSubUiVisibilityListener.b(paramBoolean);
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.b
 * JD-Core Version:    0.7.0.1
 */