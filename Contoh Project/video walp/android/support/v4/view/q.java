package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

public final class q
{
  private Object a;
  
  private q(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static q a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return new q(PointerIcon.getSystemIcon(paramContext, paramInt));
    }
    return new q(null);
  }
  
  public Object a()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.q
 * JD-Core Version:    0.7.0.1
 */