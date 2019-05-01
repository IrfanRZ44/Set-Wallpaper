package com.a.a.c.b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.a.a.i.i;

class x
{
  private boolean a;
  private final Handler b = new Handler(Looper.getMainLooper(), new a());
  
  void a(u<?> paramu)
  {
    
    if (this.a)
    {
      this.b.obtainMessage(1, paramu).sendToTarget();
      return;
    }
    this.a = true;
    paramu.f();
    this.a = false;
  }
  
  private static final class a
    implements Handler.Callback
  {
    public boolean handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1)
      {
        ((u)paramMessage.obj).f();
        return true;
      }
      return false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.x
 * JD-Core Version:    0.7.0.1
 */