package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.aqt;
import com.google.android.gms.internal.ads.aqv;

public class MobileAds
{
  public static RewardedVideoAd getRewardedVideoAdInstance(Context paramContext)
  {
    return aqt.a().a(paramContext);
  }
  
  public static void initialize(Context paramContext)
  {
    initialize(paramContext, null, null);
  }
  
  public static void initialize(Context paramContext, String paramString)
  {
    initialize(paramContext, paramString, null);
  }
  
  @Deprecated
  public static void initialize(Context paramContext, String paramString, Settings paramSettings)
  {
    aqt localaqt = aqt.a();
    if (paramSettings == null) {}
    for (aqv localaqv = null;; localaqv = paramSettings.a())
    {
      localaqt.a(paramContext, paramString, localaqv);
      return;
    }
  }
  
  public static void openDebugMenu(Context paramContext, String paramString)
  {
    aqt.a().a(paramContext, paramString);
  }
  
  public static void setAppMuted(boolean paramBoolean)
  {
    aqt.a().a(paramBoolean);
  }
  
  public static void setAppVolume(float paramFloat)
  {
    aqt.a().a(paramFloat);
  }
  
  public static final class Settings
  {
    private final aqv a = new aqv();
    
    final aqv a()
    {
      return this.a;
    }
    
    @Deprecated
    public final String getTrackingId()
    {
      return null;
    }
    
    @Deprecated
    public final boolean isGoogleAnalyticsEnabled()
    {
      return false;
    }
    
    @Deprecated
    public final Settings setGoogleAnalyticsEnabled(boolean paramBoolean)
    {
      return this;
    }
    
    @Deprecated
    public final Settings setTrackingId(String paramString)
    {
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.MobileAds
 * JD-Core Version:    0.7.0.1
 */