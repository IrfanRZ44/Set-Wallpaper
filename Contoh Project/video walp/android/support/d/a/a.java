package android.support.d.a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public final class a
{
  private Object a;
  
  private a(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static a a(Activity paramActivity, DragEvent paramDragEvent)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      DragAndDropPermissions localDragAndDropPermissions = paramActivity.requestDragAndDropPermissions(paramDragEvent);
      if (localDragAndDropPermissions != null) {
        return new a(localDragAndDropPermissions);
      }
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.d.a.a
 * JD-Core Version:    0.7.0.1
 */