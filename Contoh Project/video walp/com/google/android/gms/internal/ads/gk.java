package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@cm
public final class gk
  implements RewardItem
{
  private final fw a;
  
  public gk(fw paramfw)
  {
    this.a = paramfw;
  }
  
  public final int getAmount()
  {
    if (this.a == null) {
      return 0;
    }
    try
    {
      int i = this.a.b();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
  
  public final String getType()
  {
    if (this.a == null) {
      return null;
    }
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gk
 * JD-Core Version:    0.7.0.1
 */