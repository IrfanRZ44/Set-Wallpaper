package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@cm
public final class rr
  extends MutableContextWrapper
{
  private Activity a;
  private Context b;
  private Context c;
  
  public rr(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public final Activity a()
  {
    return this.a;
  }
  
  public final Context b()
  {
    return this.c;
  }
  
  public final Object getSystemService(String paramString)
  {
    return this.c.getSystemService(paramString);
  }
  
  public final void setBaseContext(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    if ((paramContext instanceof Activity)) {}
    for (Activity localActivity = (Activity)paramContext;; localActivity = null)
    {
      this.a = localActivity;
      this.c = paramContext;
      super.setBaseContext(this.b);
      return;
    }
  }
  
  public final void startActivity(Intent paramIntent)
  {
    if (this.a != null)
    {
      this.a.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    this.b.startActivity(paramIntent);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rr
 * JD-Core Version:    0.7.0.1
 */