package com.google.android.gms.internal.ads;

final class ot
  implements Runnable
{
  ot(op paramop, boolean paramBoolean) {}
  
  public final void run()
  {
    op localop = this.b;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "isVisible";
    arrayOfString[1] = String.valueOf(this.a);
    op.a(localop, "windowVisibilityChanged", arrayOfString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ot
 * JD-Core Version:    0.7.0.1
 */