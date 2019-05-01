package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@cm
public final class lr
{
  public static boolean a(zzjj paramzzjj)
  {
    Bundle localBundle1;
    if (paramzzjj.m != null)
    {
      localBundle1 = paramzzjj.m;
      if (localBundle1.getBundle(AdMobAdapter.class.getName()) == null) {
        break label53;
      }
    }
    label53:
    for (Bundle localBundle2 = localBundle1.getBundle(AdMobAdapter.class.getName());; localBundle2 = new Bundle())
    {
      return localBundle2.getBoolean("render_test_label", false);
      localBundle1 = new Bundle();
      break;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lr
 * JD-Core Version:    0.7.0.1
 */