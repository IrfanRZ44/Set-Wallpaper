package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface i
  extends IInterface
{
  public abstract void a(g paramg, Bundle paramBundle);
  
  public abstract void a(g paramg, String paramString, Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements i
  {
    public a()
    {
      attachInterface(this, "android.support.customtabs.IPostMessageService");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("android.support.customtabs.IPostMessageService");
        return true;
      case 2: 
        paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
        g localg2 = g.a.a(paramParcel1.readStrongBinder());
        int j = paramParcel1.readInt();
        Bundle localBundle2 = null;
        if (j != 0) {
          localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(localg2, localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      g localg1 = g.a.a(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      int i = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (i != 0) {
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localg1, str, localBundle1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.i
 * JD-Core Version:    0.7.0.1
 */