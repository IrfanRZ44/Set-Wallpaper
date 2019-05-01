package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.cm;
import java.util.Map;

@cm
public class NativeAdMapper
{
  protected View mAdChoicesContent;
  protected Bundle mExtras = new Bundle();
  protected boolean mOverrideClickHandling;
  protected boolean mOverrideImpressionRecording;
  private VideoController zzasv;
  private View zzdfm;
  private boolean zzdfn;
  
  public View getAdChoicesContent()
  {
    return this.mAdChoicesContent;
  }
  
  public final Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public final boolean getOverrideClickHandling()
  {
    return this.mOverrideClickHandling;
  }
  
  public final boolean getOverrideImpressionRecording()
  {
    return this.mOverrideImpressionRecording;
  }
  
  public final VideoController getVideoController()
  {
    return this.zzasv;
  }
  
  public void handleClick(View paramView) {}
  
  public boolean hasVideoContent()
  {
    return this.zzdfn;
  }
  
  public void recordImpression() {}
  
  public void setAdChoicesContent(View paramView)
  {
    this.mAdChoicesContent = paramView;
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    this.mExtras = paramBundle;
  }
  
  public void setHasVideoContent(boolean paramBoolean)
  {
    this.zzdfn = paramBoolean;
  }
  
  public void setMediaView(View paramView)
  {
    this.zzdfm = paramView;
  }
  
  public final void setOverrideClickHandling(boolean paramBoolean)
  {
    this.mOverrideClickHandling = paramBoolean;
  }
  
  public final void setOverrideImpressionRecording(boolean paramBoolean)
  {
    this.mOverrideImpressionRecording = paramBoolean;
  }
  
  @Deprecated
  public void trackView(View paramView) {}
  
  public void trackViews(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2) {}
  
  public void untrackView(View paramView) {}
  
  public final void zza(VideoController paramVideoController)
  {
    this.zzasv = paramVideoController;
  }
  
  public final View zzvy()
  {
    return this.zzdfm;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeAdMapper
 * JD-Core Version:    0.7.0.1
 */