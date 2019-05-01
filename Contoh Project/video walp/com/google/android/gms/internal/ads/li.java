package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

@cm
public final class li
{
  private static final lk<Map<String, ?>> a = new lj();
  
  public static List<String> a(JSONArray paramJSONArray, List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramJSONArray == null) {
      return localArrayList;
    }
    for (int i = 0; i < paramJSONArray.length(); i++) {
      localArrayList.add(paramJSONArray.getString(i));
    }
    return localArrayList;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.li
 * JD-Core Version:    0.7.0.1
 */