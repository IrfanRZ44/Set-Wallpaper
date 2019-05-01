package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;

@cm
public final class amo
{
  ajd a;
  boolean b;
  
  public amo() {}
  
  public amo(Context paramContext)
  {
    asa.a(paramContext);
    arq localarq = asa.db;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {}
    try
    {
      this.a = aje.a(DynamiteModule.a(paramContext, DynamiteModule.a, "com.google.android.gms.ads.dynamite").a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
      b.a(paramContext);
      this.a.a(b.a(paramContext), "GMA_SDK");
      this.b = true;
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      mk.b("Cannot dynamite load clearcut");
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label77;
    }
    catch (DynamiteModule.a locala)
    {
      label77:
      break label77;
    }
  }
  
  public amo(Context paramContext, String paramString1, String paramString2)
  {
    asa.a(paramContext);
    try
    {
      this.a = aje.a(DynamiteModule.a(paramContext, DynamiteModule.a, "com.google.android.gms.ads.dynamite").a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
      b.a(paramContext);
      this.a.a(b.a(paramContext), paramString1, null);
      this.b = true;
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      mk.b("Cannot dynamite load clearcut");
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label57;
    }
    catch (DynamiteModule.a locala)
    {
      label57:
      break label57;
    }
  }
  
  public final amq a(byte[] paramArrayOfByte)
  {
    return new amq(this, paramArrayOfByte, null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amo
 * JD-Core Version:    0.7.0.1
 */