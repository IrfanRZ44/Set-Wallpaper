package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

@cm
final class oy
  implements SensorEventListener
{
  private final SensorManager a;
  private final Object b;
  private final Display c;
  private final float[] d;
  private final float[] e;
  @GuardedBy("mSensorThreadLock")
  private float[] f;
  private Handler g;
  private pa h;
  
  oy(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    this.c = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.d = new float[9];
    this.e = new float[9];
    this.b = new Object();
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    float f1 = this.e[paramInt1];
    this.e[paramInt1] = this.e[paramInt2];
    this.e[paramInt2] = f1;
  }
  
  final void a()
  {
    if (this.g != null) {}
    Sensor localSensor;
    do
    {
      return;
      localSensor = this.a.getDefaultSensor(11);
      if (localSensor == null)
      {
        je.c("No Sensor of TYPE_ROTATION_VECTOR");
        return;
      }
      HandlerThread localHandlerThread = new HandlerThread("OrientationMonitor");
      localHandlerThread.start();
      this.g = new Handler(localHandlerThread.getLooper());
    } while (this.a.registerListener(this, localSensor, 0, this.g));
    je.c("SensorManager.registerListener failed.");
    b();
  }
  
  final void a(pa parampa)
  {
    this.h = parampa;
  }
  
  final boolean a(float[] paramArrayOfFloat)
  {
    synchronized (this.b)
    {
      if (this.f == null) {
        return false;
      }
      System.arraycopy(this.f, 0, paramArrayOfFloat, 0, this.f.length);
      return true;
    }
  }
  
  final void b()
  {
    if (this.g == null) {
      return;
    }
    this.a.unregisterListener(this);
    this.g.post(new oz(this));
    this.g = null;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float[] arrayOfFloat = paramSensorEvent.values;
    if ((arrayOfFloat[0] != 0.0F) || (arrayOfFloat[1] != 0.0F) || (arrayOfFloat[2] != 0.0F)) {}
    for (;;)
    {
      synchronized (this.b)
      {
        if (this.f == null) {
          this.f = new float[9];
        }
        SensorManager.getRotationMatrixFromVector(this.d, arrayOfFloat);
        switch (this.c.getRotation())
        {
        default: 
          System.arraycopy(this.d, 0, this.e, 0, 9);
          a(1, 3);
          a(2, 6);
          a(5, 7);
        }
      }
      synchronized (this.b)
      {
        System.arraycopy(this.e, 0, this.f, 0, 9);
        if (this.h != null) {
          this.h.a();
        }
        return;
        localObject2 = finally;
        throw localObject2;
        SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        continue;
        SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        continue;
        SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.oy
 * JD-Core Version:    0.7.0.1
 */