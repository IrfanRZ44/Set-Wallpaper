package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzael
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzael> CREATOR = new dp();
  public final boolean a;
  public final List<String> b;
  
  public zzael()
  {
    this(false, Collections.emptyList());
  }
  
  public zzael(boolean paramBoolean, List<String> paramList)
  {
    this.a = paramBoolean;
    this.b = paramList;
  }
  
  public static zzael a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return new zzael();
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("reporting_urls");
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < localJSONArray.length()) {
          try
          {
            localArrayList.add(localJSONArray.getString(i));
            i++;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              je.c("Error grabbing url from json.", localJSONException);
            }
          }
        }
      }
    }
    return new zzael(paramJSONObject.optBoolean("enable_protection"), localArrayList);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a);
    b.b(paramParcel, 3, this.b, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzael
 * JD-Core Version:    0.7.0.1
 */