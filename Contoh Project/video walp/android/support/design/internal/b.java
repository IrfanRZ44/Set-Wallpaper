package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.SubMenu;

public class b
  extends h
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    j localj = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    d locald = new d(e(), this, localj);
    localj.a(locald);
    return locald;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.b
 * JD-Core Version:    0.7.0.1
 */