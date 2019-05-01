package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class zzaig
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaig> CREATOR = new hj();
  public final String a;
  public final int b;
  
  public zzaig(RewardItem paramRewardItem)
  {
    this(paramRewardItem.getType(), paramRewardItem.getAmount());
  }
  
  public zzaig(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public static zzaig a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      zzaig localzzaig = a(new JSONArray(paramString));
      return localzzaig;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public static zzaig a(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    return new zzaig(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof zzaig))) {}
    zzaig localzzaig;
    do
    {
      return false;
      localzzaig = (zzaig)paramObject;
    } while ((!m.a(this.a, localzzaig.a)) || (!m.a(Integer.valueOf(this.b), Integer.valueOf(localzzaig.b))));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    return m.a(arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaig
 * JD-Core Version:    0.7.0.1
 */