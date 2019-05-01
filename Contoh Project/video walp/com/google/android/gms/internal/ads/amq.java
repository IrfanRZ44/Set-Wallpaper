package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class amq
{
  private final byte[] a;
  private int b;
  private int c;
  
  private amq(amo paramamo, byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public final amq a(int paramInt)
  {
    this.b = paramInt;
    return this;
  }
  
  public final void a()
  {
    try
    {
      if (this.d.b)
      {
        this.d.a.a(this.a);
        this.d.a.a(this.b);
        this.d.a.b(this.c);
        this.d.a.a(null);
        this.d.a.a();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.a("Clearcut log failed", localRemoteException);
      }
    }
    finally {}
  }
  
  public final amq b(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amq
 * JD-Core Version:    0.7.0.1
 */