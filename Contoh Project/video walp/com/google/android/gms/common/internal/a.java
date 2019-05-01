package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.i;

public class a
  extends h.a
{
  private Account a;
  private Context b;
  private int c;
  
  public static Account a(h paramh)
  {
    Object localObject1 = null;
    long l;
    if (paramh != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      Account localAccount = paramh.a();
      localObject1 = localAccount;
      return localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("AccountAccessor", "Remote account accessor probably died");
      return null;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.c) {
      return this.a;
    }
    if (i.b(this.b, i))
    {
      this.c = i;
      return this.a;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    return this.a.equals(((a)paramObject).a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.a
 * JD-Core Version:    0.7.0.1
 */