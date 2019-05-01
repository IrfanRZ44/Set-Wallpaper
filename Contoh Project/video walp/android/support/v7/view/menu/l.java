package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.view.b.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

class l
  extends k
{
  l(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  k.a a(ActionProvider paramActionProvider)
  {
    return new a(this.a, paramActionProvider);
  }
  
  class a
    extends k.a
    implements ActionProvider.VisibilityListener
  {
    b.b c;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
    }
    
    public boolean isVisible()
    {
      return this.a.isVisible();
    }
    
    public void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      if (this.c != null) {
        this.c.a(paramBoolean);
      }
    }
    
    public View onCreateActionView(MenuItem paramMenuItem)
    {
      return this.a.onCreateActionView(paramMenuItem);
    }
    
    public boolean overridesItemVisibility()
    {
      return this.a.overridesItemVisibility();
    }
    
    public void refreshVisibility()
    {
      this.a.refreshVisibility();
    }
    
    public void setVisibilityListener(b.b paramb)
    {
      this.c = paramb;
      ActionProvider localActionProvider = this.a;
      if (paramb != null) {}
      for (;;)
      {
        localActionProvider.setVisibilityListener(this);
        return;
        this = null;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.l
 * JD-Core Version:    0.7.0.1
 */