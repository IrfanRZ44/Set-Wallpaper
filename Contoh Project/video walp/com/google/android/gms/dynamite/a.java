package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.b.b;
import com.google.android.gms.internal.b.c;

public abstract interface a
  extends IInterface
{
  public abstract int a(com.google.android.gms.a.a parama, String paramString);
  
  public abstract int a(com.google.android.gms.a.a parama, String paramString, boolean paramBoolean);
  
  public abstract com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, int paramInt);
  
  public static abstract class a
    extends b
    implements a
  {
    public static a a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
      if ((localIInterface instanceof a)) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return false;
      case 1: 
        int j = a(com.google.android.gms.a.a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(j);
      }
      for (;;)
      {
        return true;
        com.google.android.gms.a.a locala = a(com.google.android.gms.a.a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        c.a(paramParcel2, locala);
        continue;
        int i = a(com.google.android.gms.a.a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), c.a(paramParcel1));
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
      }
    }
    
    public static class a
      extends com.google.android.gms.internal.b.a
      implements a
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.dynamite.IDynamiteLoader");
      }
      
      public int a(com.google.android.gms.a.a parama, String paramString)
      {
        Parcel localParcel1 = d();
        c.a(localParcel1, parama);
        localParcel1.writeString(paramString);
        Parcel localParcel2 = a(1, localParcel1);
        int i = localParcel2.readInt();
        localParcel2.recycle();
        return i;
      }
      
      public int a(com.google.android.gms.a.a parama, String paramString, boolean paramBoolean)
      {
        Parcel localParcel1 = d();
        c.a(localParcel1, parama);
        localParcel1.writeString(paramString);
        c.a(localParcel1, paramBoolean);
        Parcel localParcel2 = a(3, localParcel1);
        int i = localParcel2.readInt();
        localParcel2.recycle();
        return i;
      }
      
      public com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, int paramInt)
      {
        Parcel localParcel1 = d();
        c.a(localParcel1, parama);
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt);
        Parcel localParcel2 = a(2, localParcel1);
        com.google.android.gms.a.a locala = com.google.android.gms.a.a.a.a(localParcel2.readStrongBinder());
        localParcel2.recycle();
        return locala;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.a
 * JD-Core Version:    0.7.0.1
 */