package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest
{
  private final Date a;
  private final AdRequest.Gender b;
  private final Set<String> c;
  private final boolean d;
  private final Location e;
  
  public MediationAdRequest(Date paramDate, AdRequest.Gender paramGender, Set<String> paramSet, boolean paramBoolean, Location paramLocation)
  {
    this.a = paramDate;
    this.b = paramGender;
    this.c = paramSet;
    this.d = paramBoolean;
    this.e = paramLocation;
  }
  
  public Integer getAgeInYears()
  {
    if (this.a != null)
    {
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar1.setTime(this.a);
      Integer localInteger = Integer.valueOf(localCalendar2.get(1) - localCalendar1.get(1));
      if ((localCalendar2.get(2) < localCalendar1.get(2)) || ((localCalendar2.get(2) == localCalendar1.get(2)) && (localCalendar2.get(5) < localCalendar1.get(5)))) {
        localInteger = Integer.valueOf(-1 + localInteger.intValue());
      }
      return localInteger;
    }
    return null;
  }
  
  public Date getBirthday()
  {
    return this.a;
  }
  
  public AdRequest.Gender getGender()
  {
    return this.b;
  }
  
  public Set<String> getKeywords()
  {
    return this.c;
  }
  
  public Location getLocation()
  {
    return this.e;
  }
  
  public boolean isTesting()
  {
    return this.d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.MediationAdRequest
 * JD-Core Version:    0.7.0.1
 */