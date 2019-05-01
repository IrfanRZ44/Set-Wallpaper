package com.naing.b;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public class d
{
  boolean a = false;
  String b = "IabHelper";
  volatile boolean c = false;
  volatile boolean d = false;
  volatile boolean e = false;
  volatile boolean f = false;
  String g = "";
  Context h;
  IInAppBillingService i;
  ServiceConnection j;
  int k;
  String l;
  String m = null;
  a n;
  
  public d(Context paramContext, String paramString)
  {
    this.h = paramContext.getApplicationContext();
    this.m = paramString;
    c("IAB helper created.");
  }
  
  public static String a(int paramInt)
  {
    String[] arrayOfString1 = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
    String[] arrayOfString2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
    if (paramInt <= -1000)
    {
      int i1 = -1000 - paramInt;
      if ((i1 >= 0) && (i1 < arrayOfString2.length)) {
        return arrayOfString2[i1];
      }
      return String.valueOf(paramInt) + ":Unknown IAB Helper Error";
    }
    if ((paramInt < 0) || (paramInt >= arrayOfString1.length)) {
      return String.valueOf(paramInt) + ":Unknown";
    }
    return arrayOfString1[paramInt];
  }
  
  private void c()
  {
    if (this.d) {
      throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
    }
  }
  
  int a(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      c("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer)) {
      return ((Integer)localObject).intValue();
    }
    if ((localObject instanceof Long)) {
      return (int)((Long)localObject).longValue();
    }
    d("Unexpected type for bundle response code.");
    d(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for bundle response code: " + localObject.getClass().getName());
  }
  
  int a(g paramg, String paramString)
  {
    c("Querying owned items, item type: " + paramString);
    c("Package name: " + this.h.getPackageName());
    String str1 = null;
    int i4;
    for (int i1 = 0;; i1 = i4)
    {
      c("Calling getPurchases with continuation token: " + str1);
      Bundle localBundle = this.i.a(3, this.h.getPackageName(), paramString, str1);
      int i2 = a(localBundle);
      c("Owned items response: " + String.valueOf(i2));
      int i5;
      if (i2 != 0)
      {
        c("getPurchases() failed: " + a(i2));
        i5 = i2;
      }
      do
      {
        return i5;
        if ((!localBundle.containsKey("INAPP_PURCHASE_ITEM_LIST")) || (!localBundle.containsKey("INAPP_PURCHASE_DATA_LIST")) || (!localBundle.containsKey("INAPP_DATA_SIGNATURE_LIST")))
        {
          d("Bundle returned from getPurchases() doesn't contain required fields.");
          return -1002;
        }
        ArrayList localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList2 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList3 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        int i3 = 0;
        i4 = i1;
        if (i3 < localArrayList2.size())
        {
          String str2 = (String)localArrayList2.get(i3);
          String str3 = (String)localArrayList3.get(i3);
          String str4 = (String)localArrayList1.get(i3);
          if (i.a(this.m, str2, str3))
          {
            c("Sku is owned: " + str4);
            h localh = new h(paramString, str2, str3);
            if (TextUtils.isEmpty(localh.d()))
            {
              e("BUG: empty/null token!");
              c("Purchase data: " + str2);
            }
            paramg.a(localh);
          }
          for (;;)
          {
            i3++;
            break;
            e("Purchase signature verification **FAILED**. Not adding item.");
            c("   Purchase data: " + str2);
            c("   Signature: " + str3);
            i4 = 1;
          }
        }
        str1 = localBundle.getString("INAPP_CONTINUATION_TOKEN");
        c("Continuation token: " + str1);
        if (!TextUtils.isEmpty(str1)) {
          break;
        }
        i5 = 0;
      } while (i4 == 0);
      return -1003;
    }
  }
  
  int a(String paramString, g paramg, List<String> paramList)
  {
    c("Querying SKU details.");
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(paramg.b(paramString));
    if (paramList != null)
    {
      Iterator localIterator2 = paramList.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        if (!localArrayList.contains(str)) {
          localArrayList.add(str);
        }
      }
    }
    if (localArrayList.size() == 0)
    {
      c("queryPrices: nothing to do because there are no SKUs.");
      return 0;
    }
    Bundle localBundle1 = new Bundle();
    localBundle1.putStringArrayList("ITEM_ID_LIST", localArrayList);
    Bundle localBundle2 = this.i.a(3, this.h.getPackageName(), paramString, localBundle1);
    if (!localBundle2.containsKey("DETAILS_LIST"))
    {
      int i1 = a(localBundle2);
      if (i1 != 0)
      {
        c("getSkuDetails() failed: " + a(i1));
        return i1;
      }
      d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
      return -1002;
    }
    Iterator localIterator1 = localBundle2.getStringArrayList("DETAILS_LIST").iterator();
    while (localIterator1.hasNext())
    {
      j localj = new j(paramString, (String)localIterator1.next());
      c("Got sku details: " + localj);
      paramg.a(localj);
    }
    return 0;
  }
  
  public g a(boolean paramBoolean, List<String> paramList)
  {
    return a(paramBoolean, paramList, null);
  }
  
  public g a(boolean paramBoolean, List<String> paramList1, List<String> paramList2)
  {
    c();
    a("queryInventory");
    g localg;
    try
    {
      localg = new g();
      int i1 = a(localg, "inapp");
      if (i1 != 0) {
        throw new c(i1, "Error refreshing inventory (querying owned items).");
      }
    }
    catch (RemoteException localRemoteException)
    {
      throw new c(-1001, "Remote exception while refreshing inventory.", localRemoteException);
      if (paramBoolean)
      {
        int i4 = a("inapp", localg, paramList1);
        if (i4 != 0) {
          throw new c(i4, "Error refreshing inventory (querying prices of items).");
        }
      }
    }
    catch (JSONException localJSONException)
    {
      throw new c(-1002, "Error parsing JSON response while refreshing inventory.", localJSONException);
    }
    if (this.e)
    {
      int i2 = a(localg, "subs");
      if (i2 != 0) {
        throw new c(i2, "Error refreshing inventory (querying owned subscriptions).");
      }
      if (paramBoolean)
      {
        int i3 = a("subs", localg, paramList1);
        if (i3 != 0) {
          throw new c(i3, "Error refreshing inventory (querying prices of subscriptions).");
        }
      }
    }
    return localg;
  }
  
  public void a()
  {
    c("Disposing.");
    this.c = false;
    if (this.j != null) {
      c("Unbinding from service.");
    }
    try
    {
      if (this.h != null) {
        this.h.unbindService(this.j);
      }
      label44:
      this.d = true;
      this.h = null;
      this.j = null;
      this.i = null;
      this.n = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label44;
    }
  }
  
  public void a(Activity paramActivity, String paramString1, int paramInt, a parama, String paramString2)
  {
    a(paramActivity, paramString1, "inapp", paramInt, parama, paramString2);
  }
  
  public void a(Activity paramActivity, String paramString1, String paramString2, int paramInt, a parama, String paramString3)
  {
    c();
    a("launchPurchaseFlow");
    b("launchPurchaseFlow");
    if ((paramString2.equals("subs")) && (!this.e))
    {
      e locale4 = new e(-1009, "Subscriptions are not available.");
      b();
      if (parama != null) {
        parama.a(locale4, null);
      }
    }
    e locale1;
    do
    {
      for (;;)
      {
        return;
        try
        {
          c("Constructing buy intent for " + paramString1 + ", item type: " + paramString2);
          localBundle = this.i.a(3, this.h.getPackageName(), paramString1, paramString2, paramString3);
          int i1 = a(localBundle);
          if (i1 != 0)
          {
            d("Unable to buy item, Error response: " + a(i1));
            b();
            e locale3 = new e(i1, "Unable to buy item");
            if (parama == null) {
              continue;
            }
            parama.a(locale3, null);
          }
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          Bundle localBundle;
          d("SendIntentException while launching purchase flow for sku " + paramString1);
          localSendIntentException.printStackTrace();
          b();
          e locale2 = new e(-1004, "Failed to send intent.");
          if (parama != null)
          {
            parama.a(locale2, null);
            return;
            PendingIntent localPendingIntent = (PendingIntent)localBundle.getParcelable("BUY_INTENT");
            c("Launching buy intent for " + paramString1 + ". Request code: " + paramInt);
            this.k = paramInt;
            this.n = parama;
            this.l = paramString2;
            paramActivity.startIntentSenderForResult(localPendingIntent.getIntentSender(), paramInt, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          d("RemoteException while launching purchase flow for sku " + paramString1);
          localRemoteException.printStackTrace();
          b();
          locale1 = new e(-1001, "Remote exception while starting purchase flow");
        }
      }
    } while (parama == null);
    parama.a(locale1, null);
  }
  
  public void a(final b paramb)
  {
    c();
    if (this.c) {
      throw new IllegalStateException("IAB helper is already set up.");
    }
    c("Starting in-app billing setup.");
    this.j = new ServiceConnection()
    {
      public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        if (d.this.d) {
          return;
        }
        d.this.c("Billing service connected.");
        d.this.i = IInAppBillingService.Stub.a(paramAnonymousIBinder);
        String str = d.this.h.getPackageName();
        try
        {
          d.this.c("Checking for in-app billing 3 support.");
          int i = d.this.i.a(3, str, "inapp");
          if (i != 0)
          {
            if (paramb != null) {
              paramb.a(new e(i, "Error checking for billing v3 support."));
            }
            d.this.e = false;
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          if (paramb != null) {
            paramb.a(new e(-1001, "RemoteException while setting up in-app billing."));
          }
          localRemoteException.printStackTrace();
          return;
        }
        d.this.c("In-app billing version 3 supported for " + str);
        int j = d.this.i.a(3, str, "subs");
        if (j == 0)
        {
          d.this.c("Subscriptions AVAILABLE.");
          d.this.e = true;
        }
        for (;;)
        {
          d.this.c = true;
          if (paramb == null) {
            break;
          }
          paramb.a(new e(0, "Setup successful."));
          return;
          d.this.c("Subscriptions NOT AVAILABLE. Response: " + j);
        }
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        d.this.c("Billing service disconnected.");
        d.this.i = null;
      }
    };
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    if (!this.h.getPackageManager().queryIntentServices(localIntent, 0).isEmpty()) {
      this.h.bindService(localIntent, this.j, 1);
    }
    while (paramb == null) {
      return;
    }
    paramb.a(new e(3, "Billing service unavailable on device."));
  }
  
  public void a(c paramc)
  {
    a(true, null, paramc);
  }
  
  void a(String paramString)
  {
    if (!this.c)
    {
      d("Illegal state for operation (" + paramString + "): IAB helper is not set up.");
      throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + paramString);
    }
  }
  
  public void a(final boolean paramBoolean, final List<String> paramList, final c paramc)
  {
    final Handler localHandler = new Handler();
    c();
    a("queryInventory");
    b("refresh inventory");
    new Thread(new Runnable()
    {
      public void run()
      {
        locale = new e(0, "Inventory refresh successful.");
        try
        {
          g localg2 = d.this.a(paramBoolean, paramList);
          localg1 = localg2;
        }
        catch (c localc)
        {
          for (;;)
          {
            locale = localc.a();
            localg1 = null;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            locale = new e(6, localException.getMessage());
            final g localg1 = null;
          }
        }
        d.this.b();
        if ((!d.this.d) && (paramc != null)) {
          localHandler.post(new Runnable()
          {
            public void run()
            {
              d.2.this.c.a(locale, localg1);
            }
          });
        }
      }
    }).start();
  }
  
  void b()
  {
    c("Ending async operation: " + this.g);
    this.g = "";
    this.f = false;
  }
  
  void b(String paramString)
  {
    if (this.f) {
      throw new IllegalStateException("Can't start async operation (" + paramString + ") because another async operation(" + this.g + ") is in progress.");
    }
    this.g = paramString;
    this.f = true;
    c("Starting async operation: " + paramString);
  }
  
  void c(String paramString)
  {
    if (this.a) {
      Log.d(this.b, paramString);
    }
  }
  
  void d(String paramString)
  {
    Log.e(this.b, "In-app billing error: " + paramString);
  }
  
  void e(String paramString)
  {
    Log.w(this.b, "In-app billing warning: " + paramString);
  }
  
  public static abstract interface a
  {
    public abstract void a(e parame, h paramh);
  }
  
  public static abstract interface b
  {
    public abstract void a(e parame);
  }
  
  public static abstract interface c
  {
    public abstract void a(e parame, g paramg);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.d
 * JD-Core Version:    0.7.0.1
 */