package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface k
  extends IInterface
{
  public abstract void a(j paramj, GetServiceRequest paramGetServiceRequest);
  
  public static abstract class a
    extends Binder
    implements k
  {
    public static k a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((localIInterface != null) && ((localIInterface instanceof k))) {
        return (k)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    protected void a(int paramInt1, j paramj, int paramInt2, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle, IBinder paramIBinder, String paramString3, String paramString4)
    {
      throw new UnsupportedOperationException();
    }
    
    protected void a(j paramj, ValidateAccountRequest paramValidateAccountRequest)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 > 16777215) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      j localj = j.a.a(paramParcel1.readStrongBinder());
      if (paramInt1 == 46) {
        if (paramParcel1.readInt() == 0) {
          break label702;
        }
      }
      label316:
      label702:
      for (GetServiceRequest localGetServiceRequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(paramParcel1);; localGetServiceRequest = null)
      {
        a(localj, localGetServiceRequest);
        paramParcel2.writeNoException();
        return true;
        if (paramInt1 == 47) {
          if (paramParcel1.readInt() == 0) {
            break label696;
          }
        }
        for (ValidateAccountRequest localValidateAccountRequest = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.createFromParcel(paramParcel1);; localValidateAccountRequest = null)
        {
          a(localj, localValidateAccountRequest);
          break;
          int i = paramParcel1.readInt();
          if (paramInt1 != 4) {}
          for (String str1 = paramParcel1.readString();; str1 = null)
          {
            String str4;
            String str3;
            IBinder localIBinder;
            Bundle localBundle;
            String[] arrayOfString;
            String str2;
            switch (paramInt1)
            {
            case 3: 
            case 4: 
            case 21: 
            case 22: 
            case 24: 
            case 26: 
            case 28: 
            case 29: 
            case 31: 
            case 32: 
            case 33: 
            case 35: 
            case 36: 
            case 39: 
            case 40: 
            case 42: 
            default: 
              str4 = null;
              str3 = null;
              localIBinder = null;
              localBundle = null;
              arrayOfString = null;
              str2 = null;
            }
            for (;;)
            {
              a(paramInt1, localj, i, str1, str2, arrayOfString, localBundle, localIBinder, str3, str4);
              break;
              localIBinder = paramParcel1.readStrongBinder();
              if (paramParcel1.readInt() != 0)
              {
                localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                str2 = null;
                arrayOfString = null;
                str3 = null;
                str4 = null;
                continue;
                str3 = paramParcel1.readString();
                arrayOfString = paramParcel1.createStringArray();
                str2 = paramParcel1.readString();
                if (paramParcel1.readInt() != 0)
                {
                  localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                  localIBinder = null;
                  str4 = null;
                  continue;
                  str2 = paramParcel1.readString();
                  arrayOfString = paramParcel1.createStringArray();
                  str3 = paramParcel1.readString();
                  localIBinder = paramParcel1.readStrongBinder();
                  str4 = paramParcel1.readString();
                  if (paramParcel1.readInt() != 0)
                  {
                    localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                    continue;
                    arrayOfString = paramParcel1.createStringArray();
                    str2 = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0)
                    {
                      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                      localIBinder = null;
                      str3 = null;
                      str4 = null;
                      continue;
                      str2 = paramParcel1.readString();
                      arrayOfString = paramParcel1.createStringArray();
                      localBundle = null;
                      localIBinder = null;
                      str3 = null;
                      str4 = null;
                      continue;
                      str2 = paramParcel1.readString();
                      arrayOfString = null;
                      localBundle = null;
                      localIBinder = null;
                      str3 = null;
                      str4 = null;
                      continue;
                      if (paramParcel1.readInt() == 0) {
                        break label316;
                      }
                      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                      str2 = null;
                      arrayOfString = null;
                      localIBinder = null;
                      str3 = null;
                      str4 = null;
                      continue;
                    }
                    localBundle = null;
                    localIBinder = null;
                    str3 = null;
                    str4 = null;
                    continue;
                  }
                  localBundle = null;
                  continue;
                }
                localBundle = null;
                localIBinder = null;
                str4 = null;
                continue;
              }
              str2 = null;
              arrayOfString = null;
              localBundle = null;
              str3 = null;
              str4 = null;
            }
          }
        }
      }
    }
    
    private static final class a
      implements k
    {
      private final IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public final void a(j paramj, GetServiceRequest paramGetServiceRequest)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +63 -> 79
        //   19: aload_1
        //   20: invokeinterface 34 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_2
        //   34: ifnull +51 -> 85
        //   37: aload_3
        //   38: iconst_1
        //   39: invokevirtual 41	android/os/Parcel:writeInt	(I)V
        //   42: aload_2
        //   43: aload_3
        //   44: iconst_0
        //   45: invokevirtual 47	com/google/android/gms/common/internal/GetServiceRequest:writeToParcel	(Landroid/os/Parcel;I)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/common/internal/k$a$a:a	Landroid/os/IBinder;
        //   52: bipush 46
        //   54: aload_3
        //   55: aload 4
        //   57: iconst_0
        //   58: invokeinterface 53 5 0
        //   63: pop
        //   64: aload 4
        //   66: invokevirtual 56	android/os/Parcel:readException	()V
        //   69: aload 4
        //   71: invokevirtual 59	android/os/Parcel:recycle	()V
        //   74: aload_3
        //   75: invokevirtual 59	android/os/Parcel:recycle	()V
        //   78: return
        //   79: aconst_null
        //   80: astore 6
        //   82: goto -55 -> 27
        //   85: aload_3
        //   86: iconst_0
        //   87: invokevirtual 41	android/os/Parcel:writeInt	(I)V
        //   90: goto -42 -> 48
        //   93: astore 5
        //   95: aload 4
        //   97: invokevirtual 59	android/os/Parcel:recycle	()V
        //   100: aload_3
        //   101: invokevirtual 59	android/os/Parcel:recycle	()V
        //   104: aload 5
        //   106: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	107	0	this	a
        //   0	107	1	paramj	j
        //   0	107	2	paramGetServiceRequest	GetServiceRequest
        //   3	98	3	localParcel1	Parcel
        //   7	89	4	localParcel2	Parcel
        //   93	12	5	localObject	Object
        //   25	56	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	93	finally
        //   19	27	93	finally
        //   27	33	93	finally
        //   37	48	93	finally
        //   48	69	93	finally
        //   85	90	93	finally
      }
      
      public final IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.k
 * JD-Core Version:    0.7.0.1
 */