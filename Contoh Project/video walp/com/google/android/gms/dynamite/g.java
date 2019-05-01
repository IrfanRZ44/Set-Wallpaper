package com.google.android.gms.dynamite;

import android.content.Context;

final class g
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    localb.a = parama.a(paramContext, paramString);
    if (localb.a != 0) {}
    for (localb.b = parama.a(paramContext, paramString, false); (localb.a == 0) && (localb.b == 0); localb.b = parama.a(paramContext, paramString, true))
    {
      localb.c = 0;
      return localb;
    }
    if (localb.a >= localb.b)
    {
      localb.c = -1;
      return localb;
    }
    localb.c = 1;
    return localb;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.g
 * JD-Core Version:    0.7.0.1
 */