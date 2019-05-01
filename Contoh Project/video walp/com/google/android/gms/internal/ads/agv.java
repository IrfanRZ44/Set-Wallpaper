package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class agv
  extends agu
{
  private agv(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext, paramString, paramBoolean);
  }
  
  public static agv a(String paramString, Context paramContext, boolean paramBoolean)
  {
    a(paramContext, paramBoolean);
    return new agv(paramContext, paramString, paramBoolean);
  }
  
  protected final List<Callable<Void>> a(ahn paramahn, zo paramzo, wk paramwk)
  {
    if ((paramahn.c() == null) || (!this.r)) {
      return super.a(paramahn, paramzo, paramwk);
    }
    int i = paramahn.n();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(super.a(paramahn, paramzo, paramwk));
    localArrayList.add(new aih(paramahn, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", paramzo, i, 24));
    return localArrayList;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agv
 * JD-Core Version:    0.7.0.1
 */