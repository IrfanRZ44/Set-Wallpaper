package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import java.io.IOException;

final class jd
  extends iz
{
  private Context a;
  
  jd(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a()
  {
    try
    {
      boolean bool2 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.a);
      bool1 = bool2;
    }
    catch (g localg)
    {
      for (;;)
      {
        je.b("Fail to get isAdIdFakeForDebugLogging", localg);
        boolean bool1 = false;
      }
    }
    catch (h localh)
    {
      break label40;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label40;
    }
    catch (IOException localIOException)
    {
      label40:
      break label40;
    }
    md.a(bool1);
    je.e(43 + "Update ad debug logging enablement as " + bool1);
  }
  
  public final void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jd
 * JD-Core Version:    0.7.0.1
 */