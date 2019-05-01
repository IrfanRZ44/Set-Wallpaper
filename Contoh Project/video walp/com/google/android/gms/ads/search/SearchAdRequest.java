package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.aqn;
import com.google.android.gms.internal.ads.aqo;

@Deprecated
public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  private final aqn a;
  private final String b;
  
  private SearchAdRequest(Builder paramBuilder)
  {
    this.b = Builder.a(paramBuilder);
    this.a = new aqn(Builder.b(paramBuilder), this);
  }
  
  final aqn a()
  {
    return this.a;
  }
  
  @Deprecated
  public final int getAnchorTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBackgroundColor()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBackgroundGradientBottom()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBackgroundGradientTop()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBorderColor()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBorderThickness()
  {
    return 0;
  }
  
  @Deprecated
  public final int getBorderType()
  {
    return 0;
  }
  
  @Deprecated
  public final int getCallButtonColor()
  {
    return 0;
  }
  
  @Deprecated
  public final String getCustomChannels()
  {
    return null;
  }
  
  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.a.c(paramClass);
  }
  
  @Deprecated
  public final int getDescriptionTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public final String getFontFace()
  {
    return null;
  }
  
  @Deprecated
  public final int getHeaderTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public final int getHeaderTextSize()
  {
    return 0;
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
  
  public final String getQuery()
  {
    return this.b;
  }
  
  public final boolean isTestDevice(Context paramContext)
  {
    return this.a.a(paramContext);
  }
  
  public static final class Builder
  {
    private final aqo a = new aqo();
    private String b;
    
    public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
    {
      this.a.b(paramClass, paramBundle);
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
      return this;
    }
    
    public final Builder addTestDevice(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public final SearchAdRequest build()
    {
      return new SearchAdRequest(this, null);
    }
    
    @Deprecated
    public final Builder setAnchorTextColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setBackgroundColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setBackgroundGradient(int paramInt1, int paramInt2)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setBorderColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setBorderThickness(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setBorderType(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setCallButtonColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setCustomChannels(String paramString)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setDescriptionTextColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setFontFace(String paramString)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setHeaderTextColor(int paramInt)
    {
      return this;
    }
    
    @Deprecated
    public final Builder setHeaderTextSize(int paramInt)
    {
      return this;
    }
    
    public final Builder setLocation(Location paramLocation)
    {
      this.a.a(paramLocation);
      return this;
    }
    
    public final Builder setQuery(String paramString)
    {
      this.b = paramString;
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
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest
 * JD-Core Version:    0.7.0.1
 */