package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class beo
  extends bej
{
  private final sr a;
  
  public beo(sr paramsr)
  {
    this.a = paramsr;
  }
  
  private static Bundle a(String paramString)
  {
    String str1 = String.valueOf(paramString);
    String str2;
    if (str1.length() != 0) {
      str2 = "Server parameters: ".concat(str1);
    }
    Bundle localBundle;
    for (;;)
    {
      mk.e(str2);
      try
      {
        localObject = new Bundle();
        if (paramString == null) {
          return localObject;
        }
        JSONObject localJSONObject = new JSONObject(paramString);
        localBundle = new Bundle();
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str3 = (String)localIterator.next();
          localBundle.putString(str3, localJSONObject.getString(str3));
        }
        str2 = new String("Server parameters: ");
      }
      catch (JSONException localJSONException)
      {
        mk.b("", localJSONException);
        throw new RemoteException();
      }
    }
    Object localObject = localBundle;
    return localObject;
  }
  
  public final zzzt a()
  {
    return zzzt.a(this.a.b());
  }
  
  public final void a(a parama, String paramString, Bundle paramBundle, bel parambel)
  {
    ber localber;
    sr localsr;
    Context localContext;
    int i;
    try
    {
      localber = new ber(this, parambel);
      localsr = this.a;
      localContext = (Context)b.a(parama);
      i = -1;
      switch (paramString.hashCode())
      {
      case -1396342996: 
        throw new IllegalArgumentException("Internal Error");
      }
    }
    catch (Throwable localThrowable)
    {
      mk.b("Error generating signals for RTB", localThrowable);
      throw new RemoteException();
    }
    if (paramString.equals("banner"))
    {
      i = 0;
      break label212;
      if (paramString.equals("interstitial"))
      {
        i = 1;
        break label212;
        if (paramString.equals("rewarded"))
        {
          i = 2;
          break label212;
          if (paramString.equals("native"))
          {
            i = 3;
            break label212;
            int j = ss.a;
            for (;;)
            {
              localsr.a(new st(localContext, j, paramBundle), localber);
              return;
              j = ss.b;
              continue;
              j = ss.c;
              continue;
              j = ss.d;
            }
          }
        }
      }
    }
    label212:
    switch (i)
    {
    }
  }
  
  public final void a(byte[] paramArrayOfByte, String paramString, Bundle paramBundle, a parama, bee parambee, bcq parambcq, zzjn paramzzjn)
  {
    try
    {
      bep localbep = new bep(this, parambee, parambcq);
      sr localsr = this.a;
      new sq((Context)b.a(parama), paramArrayOfByte, a(paramString), paramBundle);
      zzb.zza(paramzzjn.e, paramzzjn.b, paramzzjn.a);
      localbep.a(String.valueOf(localsr.getClass().getSimpleName()).concat(" does not support banner."));
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("Adapter failed to render banner ad.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(byte[] paramArrayOfByte, String paramString, Bundle paramBundle, a parama, beg parambeg, bcq parambcq)
  {
    try
    {
      beq localbeq = new beq(this, parambeg, parambcq);
      sr localsr = this.a;
      new sq((Context)b.a(parama), paramArrayOfByte, a(paramString), paramBundle);
      localbeq.a(String.valueOf(localsr.getClass().getSimpleName()).concat(" does not support interstitial."));
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("Adapter failed to render interstitial ad.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final zzzt b()
  {
    return zzzt.a(this.a.a());
  }
  
  public final aqg c()
  {
    if (!(this.a instanceof zza)) {
      return null;
    }
    try
    {
      aqg localaqg = ((zza)this.a).getVideoController();
      return localaqg;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
    }
    return null;
  }
  
  public final void d()
  {
    try
    {
      null.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.beo
 * JD-Core Version:    0.7.0.1
 */