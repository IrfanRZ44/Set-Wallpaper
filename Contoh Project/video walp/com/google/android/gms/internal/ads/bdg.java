package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class bdg
  extends aqh
{
  private final Object a = new Object();
  private volatile aqj b;
  
  public final void a()
  {
    throw new RemoteException();
  }
  
  public final void a(aqj paramaqj)
  {
    synchronized (this.a)
    {
      this.b = paramaqj;
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    throw new RemoteException();
  }
  
  public final void b()
  {
    throw new RemoteException();
  }
  
  public final boolean c()
  {
    throw new RemoteException();
  }
  
  public final int d()
  {
    throw new RemoteException();
  }
  
  public final float e()
  {
    throw new RemoteException();
  }
  
  public final float f()
  {
    throw new RemoteException();
  }
  
  public final float g()
  {
    throw new RemoteException();
  }
  
  public final aqj h()
  {
    synchronized (this.a)
    {
      aqj localaqj = this.b;
      return localaqj;
    }
  }
  
  public final boolean i()
  {
    throw new RemoteException();
  }
  
  public final boolean j()
  {
    throw new RemoteException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdg
 * JD-Core Version:    0.7.0.1
 */