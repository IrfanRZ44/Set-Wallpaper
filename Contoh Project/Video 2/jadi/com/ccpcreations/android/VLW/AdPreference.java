package com.ccpcreations.android.VLW;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.admob.android.ads.AdView;

public class AdPreference
  extends Preference
{
  LinearLayout lla;
  
  public AdPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.lla = new LinearLayout(paramContext);
    AdView localAdView = new AdView(paramContext, paramAttributeSet);
    this.lla.addView(localAdView);
    float f = TypedValue.applyDimension(1, 48.0F, Resources.getSystem().getDisplayMetrics());
    this.lla.setMinimumHeight(Math.round(f));
  }
  
  protected View onCreateView(ViewGroup paramViewGroup)
  {
    super.onCreateView(paramViewGroup);
    return this.lla;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.ccpcreations.android.VLW.AdPreference
 * JD-Core Version:    0.7.0.1
 */