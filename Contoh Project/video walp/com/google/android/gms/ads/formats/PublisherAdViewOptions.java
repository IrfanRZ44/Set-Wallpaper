package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ads.aog;
import com.google.android.gms.internal.ads.aps;
import com.google.android.gms.internal.ads.apt;
import com.google.android.gms.internal.ads.cm;

@cm
public final class PublisherAdViewOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
  private final boolean a;
  private final aps b;
  private AppEventListener c;
  
  private PublisherAdViewOptions(Builder paramBuilder)
  {
    this.a = Builder.a(paramBuilder);
    this.c = Builder.b(paramBuilder);
    if (this.c != null) {}
    for (aog localaog = new aog(this.c);; localaog = null)
    {
      this.b = localaog;
      return;
    }
  }
  
  PublisherAdViewOptions(boolean paramBoolean, IBinder paramIBinder)
  {
    this.a = paramBoolean;
    if (paramIBinder != null) {}
    for (aps localaps = apt.a(paramIBinder);; localaps = null)
    {
      this.b = localaps;
      return;
    }
  }
  
  public final AppEventListener getAppEventListener()
  {
    return this.c;
  }
  
  public final boolean getManualImpressionsEnabled()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, getManualImpressionsEnabled());
    if (this.b == null) {}
    for (IBinder localIBinder = null;; localIBinder = this.b.asBinder())
    {
      b.a(paramParcel, 2, localIBinder, false);
      b.a(paramParcel, i);
      return;
    }
  }
  
  public final aps zzbg()
  {
    return this.b;
  }
  
  public static final class Builder
  {
    private boolean a = false;
    private AppEventListener b;
    
    public final PublisherAdViewOptions build()
    {
      return new PublisherAdViewOptions(this, null);
    }
    
    public final Builder setAppEventListener(AppEventListener paramAppEventListener)
    {
      this.b = paramAppEventListener;
      return this;
    }
    
    public final Builder setManualImpressionsEnabled(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.PublisherAdViewOptions
 * JD-Core Version:    0.7.0.1
 */