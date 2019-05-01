package com.google.android.gms.dynamite;

import android.content.Context;

final class d
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    localb.b = parama.a(paramContext, paramString, true);
    if (localb.b != 0) {
      localb.c = 1;
    }
    do
    {
      return localb;
      localb.a = parama.a(paramContext, paramString);
    } while (localb.a == 0);
    localb.c = -1;
    return localb;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.d
 * JD-Core Version:    0.7.0.1
 */