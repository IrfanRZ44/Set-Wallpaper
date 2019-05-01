package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cm
public final class aum
  extends NativeAd.AdChoicesInfo
{
  private final auj a;
  private final List<NativeAd.Image> b = new ArrayList();
  private String c;
  
  public aum(auj paramauj)
  {
    this.a = paramauj;
    try
    {
      this.c = this.a.a();
      try
      {
        Iterator localIterator = paramauj.b().iterator();
        while (localIterator.hasNext())
        {
          Object localObject1 = localIterator.next();
          if (!(localObject1 instanceof IBinder)) {
            break label180;
          }
          localIBinder = (IBinder)localObject1;
          if (localIBinder == null) {
            break label180;
          }
          IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
          if (!(localIInterface instanceof aun)) {
            break label162;
          }
          localObject2 = (aun)localIInterface;
          if (localObject2 != null) {
            this.b.add(new auq((aun)localObject2));
          }
        }
        return;
      }
      catch (RemoteException localRemoteException2)
      {
        mk.b("", localRemoteException2);
      }
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        IBinder localIBinder;
        mk.b("", localRemoteException1);
        this.c = "";
        continue;
        label162:
        aup localaup = new aup(localIBinder);
        Object localObject2 = localaup;
        continue;
        label180:
        localObject2 = null;
      }
    }
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.b;
  }
  
  public final CharSequence getText()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aum
 * JD-Core Version:    0.7.0.1
 */