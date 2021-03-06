package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.a.a.g;
import android.support.v7.app.a;
import android.support.v7.app.a.a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;

class i
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, o.a
{
  f a;
  private h b;
  private a c;
  private o.a d;
  
  public i(h paramh)
  {
    this.b = paramh;
  }
  
  public void a()
  {
    if (this.c != null) {
      this.c.dismiss();
    }
  }
  
  public void a(IBinder paramIBinder)
  {
    h localh = this.b;
    a.a locala = new a.a(localh.e());
    this.a = new f(locala.a(), a.g.abc_list_menu_item_layout);
    this.a.a(this);
    this.b.a(this.a);
    locala.a(this.a.d(), this);
    View localView = localh.o();
    if (localView != null) {
      locala.a(localView);
    }
    for (;;)
    {
      locala.a(this);
      this.c = locala.b();
      this.c.setOnDismissListener(this);
      WindowManager.LayoutParams localLayoutParams = this.c.getWindow().getAttributes();
      localLayoutParams.type = 1003;
      if (paramIBinder != null) {
        localLayoutParams.token = paramIBinder;
      }
      localLayoutParams.flags = (0x20000 | localLayoutParams.flags);
      this.c.show();
      return;
      locala.a(localh.n()).a(localh.m());
    }
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramh == this.b)) {
      a();
    }
    if (this.d != null) {
      this.d.a(paramh, paramBoolean);
    }
  }
  
  public boolean a(h paramh)
  {
    if (this.d != null) {
      return this.d.a(paramh);
    }
    return false;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.a((j)this.a.d().getItem(paramInt), 0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.a(this.b, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4)) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        Window localWindow2 = this.c.getWindow();
        if (localWindow2 != null)
        {
          View localView2 = localWindow2.getDecorView();
          if (localView2 != null)
          {
            KeyEvent.DispatcherState localDispatcherState2 = localView2.getKeyDispatcherState();
            if (localDispatcherState2 != null)
            {
              localDispatcherState2.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Window localWindow1 = this.c.getWindow();
        if (localWindow1 != null)
        {
          View localView1 = localWindow1.getDecorView();
          if (localView1 != null)
          {
            KeyEvent.DispatcherState localDispatcherState1 = localView1.getKeyDispatcherState();
            if ((localDispatcherState1 != null) && (localDispatcherState1.isTracking(paramKeyEvent)))
            {
              this.b.b(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    }
    return this.b.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.i
 * JD-Core Version:    0.7.0.1
 */