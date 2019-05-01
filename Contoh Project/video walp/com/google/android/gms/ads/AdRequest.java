package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aqn;
import com.google.android.gms.internal.ads.aqo;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
  public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN = 0;
  public static final int MAX_CONTENT_URL_LENGTH = 512;
  private final aqn a;
  
  private AdRequest(Builder paramBuilder)
  {
    this.a = new aqn(Builder.a(paramBuilder));
  }
  
  public final Date getBirthday()
  {
    return this.a.a();
  }
  
  public final String getContentUrl()
  {
    return this.a.b();
  }
  
  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.a.c(paramClass);
  }
  
  public final int getGender()
  {
    return this.a.c();
  }
  
  public final Set<String> getKeywords()
  {
    return this.a.d();
  }
  
  public final Location getLocation()
  {
    return this.a.e();
  }
  
  @Deprecated
  public final <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return this.a.a(paramClass);
  }
  
  public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.a.b(paramClass);
  }
  
  public final boolean isTestDevice(Context paramContext)
  {
    return this.a.a(paramContext);
  }
  
  public final aqn zzay()
  {
    return this.a;
  }
  
  public static final class Builder
  {
    private final aqo a = new aqo();
    
    public Builder()
    {
      this.a.b("B3EEABB8EE11C2BE770B684D95219ECB");
    }
    
    public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
    {
      this.a.b(paramClass, paramBundle);
      return this;
    }
    
    public final Builder addKeyword(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    public final Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
    {
      this.a.a(paramNetworkExtras);
      return this;
    }
    
    public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
    {
      this.a.a(paramClass, paramBundle);
      if ((paramClass.equals(AdMobAdapter.class)) && (paramBundle.getBoolean("_emulatorLiveAds"))) {
        this.a.c("B3EEABB8EE11C2BE770B684D95219ECB");
      }
      return this;
    }
    
    public final Builder addTestDevice(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public final AdRequest build()
    {
      return new AdRequest(this, null);
    }
    
    public final Builder setBirthday(Date paramDate)
    {
      this.a.a(paramDate);
      return this;
    }
    
    public final Builder setContentUrl(String paramString)
    {
      n.a(paramString, "Content URL must be non-null.");
      n.a(paramString, "Content URL must be non-empty.");
      if (paramString.length() <= 512) {}
      for (boolean bool = true;; bool = false)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(512);
        arrayOfObject[1] = Integer.valueOf(paramString.length());
        n.a(bool, "Content URL must not exceed %d in length.  Provided length was %d.", arrayOfObject);
        this.a.d(paramString);
        return this;
      }
    }
    
    public final Builder setGender(int paramInt)
    {
      this.a.a(paramInt);
      return this;
    }
    
    public final Builder setIsDesignedForFamilies(boolean paramBoolean)
    {
      this.a.c(paramBoolean);
      return this;
    }
    
    public final Builder setLocation(Location paramLocation)
    {
      this.a.a(paramLocation);
      return this;
    }
    
    public final Builder setRequestAgent(String paramString)
    {
      this.a.f(paramString);
      return this;
    }
    
    public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
    {
      this.a.b(paramBoolean);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdRequest
 * JD-Core Version:    0.7.0.1
 */