package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;
import com.google.android.gms.internal.b.c;

public abstract interface b
  extends IInterface
{
  public abstract com.google.android.gms.a.a a(com.google.android.gms.a.a parama1, String paramString, int paramInt, com.google.android.gms.a.a parama2);
  
  public abstract com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends com.google.android.gms.internal.b.b
    implements b
  {
    public static b a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
      if ((localIInterface instanceof b)) {
        return (b)localIInterface;
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
        com.google.android.gms.a.a locala2 = a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        c.a(paramParcel2, locala2);
      }
      for (;;)
      {
        return true;
        com.google.android.gms.a.a locala1 = a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        c.a(paramParcel2, locala1);
      }
    }
    
    public static class a
      extends com.google.android.gms.internal.b.a
      implements b
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
      }
      
      public com.google.android.gms.a.a a(com.google.android.gms.a.a parama1, String paramString, int paramInt, com.google.android.gms.a.a parama2)
      {
        Parcel localParcel1 = d();
        c.a(localParcel1, parama1);
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt);
        c.a(localParcel1, parama2);
        Parcel localParcel2 = a(2, localParcel1);
        com.google.android.gms.a.a locala = a.a.a(localParcel2.readStrongBinder());
        localParcel2.recycle();
        return locala;
      }
      
      public com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, byte[] paramArrayOfByte)
      {
        Parcel localParcel1 = d();
        c.a(localParcel1, parama);
        localParcel1.writeString(paramString);
        localParcel1.writeByteArray(paramArrayOfByte);
        Parcel localParcel2 = a(1, localParcel1);
        com.google.android.gms.a.a locala = a.a.a(localParcel2.readStrongBinder());
        localParcel2.recycle();
        return locala;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.b
 * JD-Core Version:    0.7.0.1
 */