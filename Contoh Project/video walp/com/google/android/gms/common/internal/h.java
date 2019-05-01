package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.b.a;
import com.google.android.gms.internal.b.b;
import com.google.android.gms.internal.b.c;

public abstract interface h
  extends IInterface
{
  public abstract Account a();
  
  public static abstract class a
    extends b
    implements h
  {
    public static h a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      if ((localIInterface instanceof h)) {
        return (h)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 == 2)
      {
        Account localAccount = a();
        paramParcel2.writeNoException();
        c.b(paramParcel2, localAccount);
        return true;
      }
      return false;
    }
    
    public static class a
      extends a
      implements h
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IAccountAccessor");
      }
      
      public Account a()
      {
        Parcel localParcel = a(2, d());
        Account localAccount = (Account)c.a(localParcel, Account.CREATOR);
        localParcel.recycle();
        return localAccount;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.h
 * JD-Core Version:    0.7.0.1
 */