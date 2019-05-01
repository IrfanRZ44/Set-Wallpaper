package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

@cm
public final class beb
{
  public static int a(AdRequest.ErrorCode paramErrorCode)
  {
    switch (bec.a[paramErrorCode.ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static MediationAdRequest a(zzjj paramzzjj, boolean paramBoolean)
  {
    HashSet localHashSet;
    Date localDate;
    AdRequest.Gender localGender;
    if (paramzzjj.e != null)
    {
      localHashSet = new HashSet(paramzzjj.e);
      localDate = new Date(paramzzjj.b);
      switch (paramzzjj.d)
      {
      default: 
        localGender = AdRequest.Gender.UNKNOWN;
      }
    }
    for (;;)
    {
      return new MediationAdRequest(localDate, localGender, localHashSet, paramBoolean, paramzzjj.k);
      localHashSet = null;
      break;
      localGender = AdRequest.Gender.FEMALE;
      continue;
      localGender = AdRequest.Gender.MALE;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.beb
 * JD-Core Version:    0.7.0.1
 */