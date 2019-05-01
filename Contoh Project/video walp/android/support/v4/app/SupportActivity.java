package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.e;
import android.arch.lifecycle.e.b;
import android.arch.lifecycle.h;
import android.arch.lifecycle.i;
import android.arch.lifecycle.q;
import android.os.Bundle;
import android.support.v4.f.m;

public class SupportActivity
  extends Activity
  implements h
{
  private m<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new m();
  private i mLifecycleRegistry = new i(this);
  
  public <T extends ExtraData> T getExtraData(Class<T> paramClass)
  {
    return (ExtraData)this.mExtraDataMap.get(paramClass);
  }
  
  public e getLifecycle()
  {
    return this.mLifecycleRegistry;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    q.a(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    this.mLifecycleRegistry.a(e.b.c);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void putExtraData(ExtraData paramExtraData)
  {
    this.mExtraDataMap.put(paramExtraData.getClass(), paramExtraData);
  }
  
  public static class ExtraData {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.SupportActivity
 * JD-Core Version:    0.7.0.1
 */