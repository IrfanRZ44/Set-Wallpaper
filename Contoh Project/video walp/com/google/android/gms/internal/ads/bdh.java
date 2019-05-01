package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@cm
public final class bdh
  implements MediationAdRequest
{
  private final Date a;
  private final int b;
  private final Set<String> c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final boolean g;
  
  public bdh(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramBoolean2;
  }
  
  public final Date getBirthday()
  {
    return this.a;
  }
  
  public final int getGender()
  {
    return this.b;
  }
  
  public final Set<String> getKeywords()
  {
    return this.c;
  }
  
  public final Location getLocation()
  {
    return this.e;
  }
  
  public final boolean isDesignedForFamilies()
  {
    return this.g;
  }
  
  public final boolean isTesting()
  {
    return this.d;
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return this.f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdh
 * JD-Core Version:    0.7.0.1
 */