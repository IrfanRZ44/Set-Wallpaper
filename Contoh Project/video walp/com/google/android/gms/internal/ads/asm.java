package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class asm
{
  private final Map<String, asl> a;
  private final asn b;
  
  public asm(asn paramasn)
  {
    this.b = paramasn;
    this.a = new HashMap();
  }
  
  public final asn a()
  {
    return this.b;
  }
  
  public final void a(String paramString, asl paramasl)
  {
    this.a.put(paramString, paramasl);
  }
  
  public final void a(String paramString1, String paramString2, long paramLong)
  {
    asn localasn1 = this.b;
    asl localasl = (asl)this.a.get(paramString2);
    String[] arrayOfString = { paramString1 };
    Map localMap;
    asn localasn2;
    if ((localasn1 == null) || (localasl == null))
    {
      localMap = this.a;
      localasn2 = this.b;
      if (localasn2 != null) {
        break label87;
      }
    }
    label87:
    for (Object localObject = null;; localObject = localasn2.a(paramLong))
    {
      localMap.put(paramString1, localObject);
      return;
      localasn1.a(localasl, paramLong, arrayOfString);
      break;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asm
 * JD-Core Version:    0.7.0.1
 */