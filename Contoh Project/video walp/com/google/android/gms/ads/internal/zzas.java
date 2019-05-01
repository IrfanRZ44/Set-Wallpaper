package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.internal.ads.atf;
import com.google.android.gms.internal.ads.ath;
import com.google.android.gms.internal.ads.aun;
import com.google.android.gms.internal.ads.auo;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bcb;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.bcw;
import com.google.android.gms.internal.ads.bda;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rm;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzas
{
  static zzv<qe> a(bcw parambcw, bda parambda, zzac paramzzac)
  {
    return new n(parambcw, paramzzac, parambda);
  }
  
  private static aun a(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return auo.a((IBinder)paramObject);
    }
    return null;
  }
  
  private static String a(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      je.e("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    String str1 = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
    String str2 = String.valueOf("data:image/png;base64,");
    String str3 = String.valueOf(str1);
    if (str3.length() != 0) {
      return str2.concat(str3);
    }
    return new String(str2);
  }
  
  private static String a(aun paramaun)
  {
    if (paramaun == null)
    {
      je.e("Image is null. Returning empty string");
      return "";
    }
    try
    {
      Uri localUri = paramaun.b();
      if (localUri != null)
      {
        String str = localUri.toString();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Unable to get image uri. Trying data uri next");
    }
    return b(paramaun);
  }
  
  private static JSONObject a(Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramBundle == null) || (TextUtils.isEmpty(paramString))) {
      return localJSONObject1;
    }
    JSONObject localJSONObject2 = new JSONObject(paramString);
    Iterator localIterator = localJSONObject2.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramBundle.containsKey(str)) {
        if ("image".equals(localJSONObject2.getString(str)))
        {
          Object localObject = paramBundle.get(str);
          if ((localObject instanceof Bitmap)) {
            localJSONObject1.put(str, a((Bitmap)localObject));
          } else {
            je.e("Invalid type. An image type extra should return a bitmap");
          }
        }
        else if ((paramBundle.get(str) instanceof Bitmap))
        {
          je.e("Invalid asset type. Bitmap should be returned only for image type");
        }
        else
        {
          localJSONObject1.put(str, String.valueOf(paramBundle.get(str)));
        }
      }
    }
    return localJSONObject1;
  }
  
  private static String b(aun paramaun)
  {
    Drawable localDrawable;
    try
    {
      a locala = paramaun.a();
      if (locala == null)
      {
        je.e("Drawable is null. Returning empty string");
        return "";
      }
      localDrawable = (Drawable)b.a(locala);
      if (!(localDrawable instanceof BitmapDrawable))
      {
        je.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
        return "";
      }
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Unable to get drawable. Returning empty string");
      return "";
    }
    return a(((BitmapDrawable)localDrawable).getBitmap());
  }
  
  private static void b(qe paramqe)
  {
    View.OnClickListener localOnClickListener = paramqe.getOnClickListener();
    if (localOnClickListener != null) {
      localOnClickListener.onClick(paramqe.getView());
    }
  }
  
  public static boolean zza(qe paramqe, bcb parambcb, CountDownLatch paramCountDownLatch)
  {
    boolean bool;
    for (;;)
    {
      try
      {
        localView1 = paramqe.getView();
        if (localView1 != null) {
          continue;
        }
        je.e("AdWebView is null");
        bool = false;
      }
      catch (RemoteException localRemoteException)
      {
        View localView1;
        List localList1;
        bcw localbcw;
        bda localbda;
        String str1;
        List localList2;
        String str2;
        aun localaun1;
        String str3;
        double d;
        String str4;
        String str5;
        Bundle localBundle1;
        je.c("Unable to invoke load assets", localRemoteException);
        bool = false;
        continue;
        localView3 = null;
        continue;
        je.e("No matching template id and mapper");
        bool = false;
        continue;
        paramqe.loadData(str7, "text/html", "UTF-8");
      }
      catch (RuntimeException localRuntimeException)
      {
        paramCountDownLatch.countDown();
        throw localRuntimeException;
      }
      if (!bool) {
        paramCountDownLatch.countDown();
      }
      return bool;
      localView1.setVisibility(4);
      localList1 = parambcb.b.r;
      if ((localList1 == null) || (localList1.isEmpty()))
      {
        je.e("No template ids present in mediation response");
        bool = false;
      }
      else
      {
        paramqe.a("/nativeExpressAssetsLoaded", new l(paramCountDownLatch));
        paramqe.a("/nativeExpressAssetsLoadingFailed", new m(paramCountDownLatch));
        localbcw = parambcb.c.h();
        localbda = parambcb.c.i();
        if ((localList1.contains("2")) && (localbcw != null))
        {
          str1 = localbcw.a();
          localList2 = localbcw.b();
          str2 = localbcw.c();
          localaun1 = localbcw.d();
          str3 = localbcw.e();
          d = localbcw.f();
          str4 = localbcw.g();
          str5 = localbcw.h();
          localBundle1 = localbcw.l();
          if (localbcw.p() == null) {
            break label609;
          }
        }
      }
    }
    label567:
    label579:
    label603:
    label609:
    for (View localView2 = (View)b.a(localbcw.p());; localView2 = null)
    {
      atf localatf = new atf(str1, localList2, str2, localaun1, str3, d, str4, str5, null, localBundle1, null, localView2, localbcw.q(), null);
      String str6 = parambcb.b.q;
      paramqe.t().a(new j(localatf, str6, paramqe));
      String str7;
      View localView3;
      for (;;)
      {
        str7 = parambcb.b.o;
        String str8 = parambcb.b.p;
        if (str8 == null) {
          break label579;
        }
        paramqe.loadDataWithBaseURL(str8, str7, "text/html", "UTF-8", null);
        break label603;
        if ((!localList1.contains("1")) || (localbda == null)) {
          break label567;
        }
        String str9 = localbda.a();
        List localList3 = localbda.b();
        String str10 = localbda.c();
        aun localaun2 = localbda.d();
        String str11 = localbda.e();
        String str12 = localbda.f();
        Bundle localBundle2 = localbda.j();
        if (localbda.n() == null) {
          break;
        }
        localView3 = (View)b.a(localbda.n());
        ath localath = new ath(str9, localList3, str10, localaun2, str11, str12, null, localBundle2, null, localView3, localbda.o(), null);
        String str13 = parambcb.b.q;
        paramqe.t().a(new k(localath, str13, paramqe));
      }
      bool = true;
      break;
    }
  }
  
  public static View zze(ij paramij)
  {
    if (paramij == null)
    {
      je.c("AdState is null");
      return null;
    }
    if ((zzf(paramij)) && (paramij.b != null)) {
      return paramij.b.getView();
    }
    for (;;)
    {
      try
      {
        if (paramij.p != null)
        {
          locala = paramij.p.a();
          if (locala == null)
          {
            je.e("View in mediation adapter is null.");
            return null;
          }
          View localView = (View)b.a(locala);
          return localView;
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.c("Could not get View from mediation adapter.", localRemoteException);
        return null;
      }
      a locala = null;
    }
  }
  
  public static boolean zzf(ij paramij)
  {
    return (paramij != null) && (paramij.n) && (paramij.o != null) && (paramij.o.o != null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzas
 * JD-Core Version:    0.7.0.1
 */