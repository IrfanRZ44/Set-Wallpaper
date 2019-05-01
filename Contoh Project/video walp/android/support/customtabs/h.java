package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract interface h
  extends IInterface
{
  public abstract int a(g paramg, String paramString, Bundle paramBundle);
  
  public abstract Bundle a(String paramString, Bundle paramBundle);
  
  public abstract boolean a(long paramLong);
  
  public abstract boolean a(g paramg);
  
  public abstract boolean a(g paramg, int paramInt, Uri paramUri, Bundle paramBundle);
  
  public abstract boolean a(g paramg, Uri paramUri);
  
  public abstract boolean a(g paramg, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  public abstract boolean a(g paramg, Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements h
  {
    public a()
    {
      attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }
    
    public static h a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
      if ((localIInterface != null) && ((localIInterface instanceof h))) {
        return (h)localIInterface;
      }
      return new a(paramIBinder);
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
        paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
        return true;
      case 2: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        boolean bool6 = a(paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool6) {}
        for (int i3 = 1;; i3 = 0)
        {
          paramParcel2.writeInt(i3);
          return true;
        }
      case 3: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        boolean bool5 = a(g.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        int i2 = 0;
        if (bool5) {
          i2 = 1;
        }
        paramParcel2.writeInt(i2);
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        g localg5 = g.a.a(paramParcel1.readStrongBinder());
        Uri localUri3;
        if (paramParcel1.readInt() != 0)
        {
          localUri3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label291;
          }
        }
        for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle6 = null)
        {
          boolean bool4 = a(localg5, localUri3, localBundle6, paramParcel1.createTypedArrayList(Bundle.CREATOR));
          paramParcel2.writeNoException();
          int i1 = 0;
          if (bool4) {
            i1 = 1;
          }
          paramParcel2.writeInt(i1);
          return true;
          localUri3 = null;
          break;
        }
      case 5: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
        {
          Bundle localBundle5 = a(str2, localBundle4);
          paramParcel2.writeNoException();
          if (localBundle5 == null) {
            break;
          }
          paramParcel2.writeInt(1);
          localBundle5.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        g localg4 = g.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
        {
          boolean bool3 = a(localg4, localBundle3);
          paramParcel2.writeNoException();
          int n = 0;
          if (bool3) {
            n = 1;
          }
          paramParcel2.writeInt(n);
          return true;
        }
      case 7: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        g localg3 = g.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (Uri localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localUri2 = null)
        {
          boolean bool2 = a(localg3, localUri2);
          paramParcel2.writeNoException();
          int m = 0;
          if (bool2) {
            m = 1;
          }
          paramParcel2.writeInt(m);
          return true;
        }
      case 8: 
        label291:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        g localg2 = g.a.a(paramParcel1.readStrongBinder());
        String str1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
        {
          int k = a(localg2, str1, localBundle2);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(k);
          return true;
        }
      }
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      g localg1 = g.a.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      Uri localUri1;
      if (paramParcel1.readInt() != 0)
      {
        localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label704;
        }
      }
      label704:
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        boolean bool1 = a(localg1, i, localUri1, localBundle1);
        paramParcel2.writeNoException();
        int j = 0;
        if (bool1) {
          j = 1;
        }
        paramParcel2.writeInt(j);
        return true;
        localUri1 = null;
        break;
      }
    }
    
    private static class a
      implements h
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public int a(g paramg, String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 24
        //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +83 -> 101
        //   21: aload_1
        //   22: invokeinterface 34 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 40	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload_3
        //   43: ifnull +64 -> 107
        //   46: aload 4
        //   48: iconst_1
        //   49: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokevirtual 50	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   59: aload_0
        //   60: getfield 15	android/support/customtabs/h$a$a:a	Landroid/os/IBinder;
        //   63: bipush 8
        //   65: aload 4
        //   67: aload 5
        //   69: iconst_0
        //   70: invokeinterface 56 5 0
        //   75: pop
        //   76: aload 5
        //   78: invokevirtual 59	android/os/Parcel:readException	()V
        //   81: aload 5
        //   83: invokevirtual 63	android/os/Parcel:readInt	()I
        //   86: istore 9
        //   88: aload 5
        //   90: invokevirtual 66	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 66	android/os/Parcel:recycle	()V
        //   98: iload 9
        //   100: ireturn
        //   101: aconst_null
        //   102: astore 7
        //   104: goto -75 -> 29
        //   107: aload 4
        //   109: iconst_0
        //   110: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   113: goto -54 -> 59
        //   116: astore 6
        //   118: aload 5
        //   120: invokevirtual 66	android/os/Parcel:recycle	()V
        //   123: aload 4
        //   125: invokevirtual 66	android/os/Parcel:recycle	()V
        //   128: aload 6
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	paramg	g
        //   0	131	2	paramString	String
        //   0	131	3	paramBundle	Bundle
        //   3	121	4	localParcel1	Parcel
        //   8	111	5	localParcel2	Parcel
        //   116	13	6	localObject	Object
        //   27	76	7	localIBinder	IBinder
        //   86	13	9	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	116	finally
        //   21	29	116	finally
        //   29	42	116	finally
        //   46	59	116	finally
        //   59	88	116	finally
        //   107	113	116	finally
      }
      
      public Bundle a(String paramString, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            localParcel1.writeString(paramString);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.a.transact(5, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                return localBundle;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            Bundle localBundle = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public boolean a(long paramLong)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          localParcel1.writeLong(paramLong);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          boolean bool = false;
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public boolean a(g paramg)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +63 -> 78
        //   18: aload_1
        //   19: invokeinterface 34 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	android/support/customtabs/h$a$a:a	Landroid/os/IBinder;
        //   36: iconst_3
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 56 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 59	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 63	android/os/Parcel:readInt	()I
        //   54: istore 7
        //   56: iconst_0
        //   57: istore 8
        //   59: iload 7
        //   61: ifeq +6 -> 67
        //   64: iconst_1
        //   65: istore 8
        //   67: aload_3
        //   68: invokevirtual 66	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 66	android/os/Parcel:recycle	()V
        //   75: iload 8
        //   77: ireturn
        //   78: aconst_null
        //   79: astore 5
        //   81: goto -55 -> 26
        //   84: astore 4
        //   86: aload_3
        //   87: invokevirtual 66	android/os/Parcel:recycle	()V
        //   90: aload_2
        //   91: invokevirtual 66	android/os/Parcel:recycle	()V
        //   94: aload 4
        //   96: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	97	0	this	a
        //   0	97	1	paramg	g
        //   3	88	2	localParcel1	Parcel
        //   7	80	3	localParcel2	Parcel
        //   84	11	4	localObject	Object
        //   24	56	5	localIBinder	IBinder
        //   54	6	7	i	int
        //   57	19	8	bool	boolean
        // Exception table:
        //   from	to	target	type
        //   8	14	84	finally
        //   18	26	84	finally
        //   26	56	84	finally
      }
      
      public boolean a(g paramg, int paramInt, Uri paramUri, Bundle paramBundle)
      {
        boolean bool = true;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            IBinder localIBinder;
            if (paramg != null)
            {
              localIBinder = paramg.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              localParcel1.writeInt(paramInt);
              if (paramUri != null)
              {
                localParcel1.writeInt(1);
                paramUri.writeToParcel(localParcel1, 0);
                if (paramBundle == null) {
                  break label158;
                }
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(9, localParcel1, localParcel2, 0);
                localParcel2.readException();
                int i = localParcel2.readInt();
                if (i == 0) {
                  break label167;
                }
                return bool;
              }
            }
            else
            {
              localIBinder = null;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label158:
          continue;
          label167:
          bool = false;
        }
      }
      
      public boolean a(g paramg, Uri paramUri)
      {
        boolean bool = true;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        label131:
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            IBinder localIBinder;
            if (paramg != null)
            {
              localIBinder = paramg.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              if (paramUri != null)
              {
                localParcel1.writeInt(1);
                paramUri.writeToParcel(localParcel1, 0);
                this.a.transact(7, localParcel1, localParcel2, 0);
                localParcel2.readException();
                int i = localParcel2.readInt();
                if (i == 0) {
                  break label131;
                }
                return bool;
              }
            }
            else
            {
              localIBinder = null;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            bool = false;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public boolean a(g paramg, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
      {
        boolean bool = true;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            IBinder localIBinder;
            if (paramg != null)
            {
              localIBinder = paramg.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              if (paramUri != null)
              {
                localParcel1.writeInt(1);
                paramUri.writeToParcel(localParcel1, 0);
                if (paramBundle == null) {
                  break label156;
                }
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                localParcel1.writeTypedList(paramList);
                this.a.transact(4, localParcel1, localParcel2, 0);
                localParcel2.readException();
                int i = localParcel2.readInt();
                if (i == 0) {
                  break label165;
                }
                return bool;
              }
            }
            else
            {
              localIBinder = null;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label156:
          continue;
          label165:
          bool = false;
        }
      }
      
      public boolean a(g paramg, Bundle paramBundle)
      {
        boolean bool = true;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        label131:
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            IBinder localIBinder;
            if (paramg != null)
            {
              localIBinder = paramg.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(6, localParcel1, localParcel2, 0);
                localParcel2.readException();
                int i = localParcel2.readInt();
                if (i == 0) {
                  break label131;
                }
                return bool;
              }
            }
            else
            {
              localIBinder = null;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            bool = false;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.h
 * JD-Core Version:    0.7.0.1
 */