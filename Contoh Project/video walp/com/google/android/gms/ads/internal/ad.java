package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.mk;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class ad
  extends AsyncTask<Void, Void, String>
{
  private ad(zzbp paramzzbp) {}
  
  private final String a(Void... paramVarArgs)
  {
    try
    {
      zzbp localzzbp = this.a;
      Future localFuture = zzbp.e(this.a);
      arq localarq = asa.cz;
      zzbp.a(localzzbp, (agw)localFuture.get(((Long)aos.f().a(localarq)).longValue(), TimeUnit.MILLISECONDS));
      return this.a.a();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        mk.c("", localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      break label60;
    }
    catch (TimeoutException localTimeoutException)
    {
      label60:
      break label60;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ad
 * JD-Core Version:    0.7.0.1
 */