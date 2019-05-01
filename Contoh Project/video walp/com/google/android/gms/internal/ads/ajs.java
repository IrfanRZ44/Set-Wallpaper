package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import org.json.JSONObject;

@cm
public final class ajs
  implements akf
{
  private final ajj a;
  private final qe b;
  private final zzv<qe> c = new ajt(this);
  private final zzv<qe> d = new aju(this);
  private final zzv<qe> e = new ajv(this);
  
  public ajs(ajj paramajj, qe paramqe)
  {
    this.a = paramajj;
    this.b = paramqe;
    qe localqe = this.b;
    localqe.a("/updateActiveView", this.c);
    localqe.a("/untrackActiveViewUnit", this.d);
    localqe.a("/visibilityChanged", this.e);
    String str1 = String.valueOf(this.a.a.d());
    if (str1.length() != 0) {}
    for (String str2 = "Custom JS tracking ad unit: ".concat(str1);; str2 = new String("Custom JS tracking ad unit: "))
    {
      je.b(str2);
      return;
    }
  }
  
  public final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.b.b("AFMA_updateActiveView", paramJSONObject);
      return;
    }
    this.a.b(this);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void b()
  {
    qe localqe = this.b;
    localqe.b("/visibilityChanged", this.e);
    localqe.b("/untrackActiveViewUnit", this.d);
    localqe.b("/updateActiveView", this.c);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajs
 * JD-Core Version:    0.7.0.1
 */