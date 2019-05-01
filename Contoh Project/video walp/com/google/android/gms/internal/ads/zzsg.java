package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@cm
public final class zzsg
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzsg> CREATOR = new axa();
  private final String a;
  private final String[] b;
  private final String[] c;
  
  zzsg(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.a = paramString;
    this.b = paramArrayOfString1;
    this.c = paramArrayOfString2;
  }
  
  public static zzsg a(avs paramavs)
  {
    Map localMap = paramavs.b();
    int i = localMap.size();
    String[] arrayOfString1 = new String[i];
    String[] arrayOfString2 = new String[i];
    Iterator localIterator = localMap.entrySet().iterator();
    for (int j = 0; localIterator.hasNext(); j++)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      arrayOfString1[j] = ((String)localEntry.getKey());
      arrayOfString2[j] = ((String)localEntry.getValue());
    }
    return new zzsg(paramavs.e(), arrayOfString1, arrayOfString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a, false);
    b.a(paramParcel, 2, this.b, false);
    b.a(paramParcel, 3, this.c, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzsg
 * JD-Core Version:    0.7.0.1
 */