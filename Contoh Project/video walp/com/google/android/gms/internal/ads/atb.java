package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class atb
  implements View.OnClickListener
{
  String a;
  Long b;
  WeakReference<View> c;
  private final bq d;
  private awh e;
  private zzv f;
  
  public atb(bq parambq)
  {
    this.d = parambq;
  }
  
  private final void c()
  {
    this.a = null;
    this.b = null;
    if (this.c == null) {}
    View localView;
    do
    {
      return;
      localView = (View)this.c.get();
      this.c = null;
    } while (localView == null);
    localView.setClickable(false);
    localView.setOnClickListener(null);
  }
  
  public final awh a()
  {
    return this.e;
  }
  
  public final void a(awh paramawh)
  {
    this.e = paramawh;
    if (this.f != null) {
      this.d.b("/unconfirmedClick", this.f);
    }
    this.f = new atc(this);
    this.d.a("/unconfirmedClick", this.f);
  }
  
  public final void b()
  {
    if (this.e == null) {}
    while (this.b == null) {
      return;
    }
    c();
    try
    {
      this.e.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((this.c == null) || (this.c.get() != paramView)) {
      return;
    }
    if ((this.a == null) || (this.b == null)) {}
    for (;;)
    {
      c();
      return;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("id", this.a);
        localJSONObject.put("time_interval", zzbv.zzer().a() - this.b.longValue());
        localJSONObject.put("messageType", "onePointFiveClick");
        this.d.a("sendMessageToNativeJs", localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        je.b("Unable to dispatch sendMessageToNativeJs event", localJSONException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atb
 * JD-Core Version:    0.7.0.1
 */