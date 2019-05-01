package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

@cm
final class ayq
{
  private final Object[] a;
  
  ayq(zzjj paramzzjj, String paramString, int paramInt)
  {
    arq localarq = asa.aV;
    this.a = zzp.zza((String)aos.f().a(localarq), paramzzjj, paramString, paramInt, null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ayq)) {
      return false;
    }
    ayq localayq = (ayq)paramObject;
    return Arrays.equals(this.a, localayq.a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.a);
  }
  
  public final String toString()
  {
    String str = Arrays.toString(this.a);
    return 24 + String.valueOf(str).length() + "[InterstitialAdPoolKey " + str + "]";
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayq
 * JD-Core Version:    0.7.0.1
 */