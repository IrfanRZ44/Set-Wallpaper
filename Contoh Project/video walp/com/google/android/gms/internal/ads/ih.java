package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import java.io.IOException;

final class ih
  implements Runnable
{
  ih(ig paramig, Context paramContext, np paramnp) {}
  
  public final void run()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
      this.b.b(localInfo);
      return;
    }
    catch (g localg)
    {
      this.b.a(localg);
      mk.b("Exception while getting advertising Id info", localg);
      return;
    }
    catch (h localh)
    {
      break label18;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label18;
    }
    catch (IOException localIOException)
    {
      label18:
      break label18;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ih
 * JD-Core Version:    0.7.0.1
 */