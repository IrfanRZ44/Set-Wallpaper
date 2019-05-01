package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class PostMessageService
  extends Service
{
  private i.a a = new i.a()
  {
    public void a(g paramAnonymousg, Bundle paramAnonymousBundle)
    {
      paramAnonymousg.a(paramAnonymousBundle);
    }
    
    public void a(g paramAnonymousg, String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      paramAnonymousg.b(paramAnonymousString, paramAnonymousBundle);
    }
  };
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.PostMessageService
 * JD-Core Version:    0.7.0.1
 */