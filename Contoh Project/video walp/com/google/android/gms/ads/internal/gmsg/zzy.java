package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import java.util.Map;

@cm
public final class zzy
  implements zzv<Object>
{
  private final zzz a;
  
  public zzy(zzz paramzzz)
  {
    this.a = paramzzz;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    try
    {
      if (paramMap.get("blurRadius") == null) {
        break label93;
      }
      float f2 = Float.parseFloat((String)paramMap.get("blurRadius"));
      f1 = f2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        je.b("Fail to parse float", localNumberFormatException);
        float f1 = 0.0F;
      }
    }
    this.a.zzd(bool1);
    this.a.zza(bool2, f1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzy
 * JD-Core Version:    0.7.0.1
 */