package android.support.v4.content.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.a.a.h;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a
{
  public static a a(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i != 2) {
      throw new XmlPullParserException("No start tag found");
    }
    return b(paramXmlPullParser, paramResources);
  }
  
  public static List<List<byte[]>> a(Resources paramResources, int paramInt)
  {
    Object localObject = null;
    TypedArray localTypedArray;
    ArrayList localArrayList;
    if (paramInt != 0)
    {
      localTypedArray = paramResources.obtainTypedArray(paramInt);
      int i = localTypedArray.length();
      localObject = null;
      if (i > 0)
      {
        localArrayList = new ArrayList();
        if (localTypedArray.getResourceId(0, 0) != 0) {}
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label110;
          }
          for (int k = 0; k < localTypedArray.length(); k++) {
            localArrayList.add(a(paramResources.getStringArray(localTypedArray.getResourceId(k, 0))));
          }
        }
      }
    }
    for (localObject = localArrayList;; localObject = localArrayList)
    {
      localTypedArray.recycle();
      if (localObject == null) {
        break;
      }
      return localObject;
      label110:
      localArrayList.add(a(paramResources.getStringArray(paramInt)));
    }
    return Collections.emptyList();
  }
  
  private static List<byte[]> a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Base64.decode(paramArrayOfString[j], 0));
    }
    return localArrayList;
  }
  
  private static void a(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    while (i > 0) {
      switch (paramXmlPullParser.next())
      {
      default: 
        break;
      case 2: 
        i++;
        break;
      case 3: 
        i--;
      }
    }
  }
  
  private static a b(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family")) {
      return c(paramXmlPullParser, paramResources);
    }
    a(paramXmlPullParser);
    return null;
  }
  
  private static a c(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), a.h.FontFamily);
    String str1 = localTypedArray.getString(a.h.FontFamily_fontProviderAuthority);
    String str2 = localTypedArray.getString(a.h.FontFamily_fontProviderPackage);
    String str3 = localTypedArray.getString(a.h.FontFamily_fontProviderQuery);
    int i = localTypedArray.getResourceId(a.h.FontFamily_fontProviderCerts, 0);
    int j = localTypedArray.getInteger(a.h.FontFamily_fontProviderFetchStrategy, 1);
    int k = localTypedArray.getInteger(a.h.FontFamily_fontProviderFetchTimeout, 500);
    localTypedArray.recycle();
    if ((str1 != null) && (str2 != null) && (str3 != null))
    {
      while (paramXmlPullParser.next() != 3) {
        a(paramXmlPullParser);
      }
      return new d(new android.support.v4.d.a(str1, str2, str3, a(paramResources, i)), j, k);
    }
    ArrayList localArrayList = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("font")) {
          localArrayList.add(d(paramXmlPullParser, paramResources));
        } else {
          a(paramXmlPullParser);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    return new b((c[])localArrayList.toArray(new c[localArrayList.size()]));
  }
  
  private static c d(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), a.h.FontFamilyFont);
    int i;
    int j;
    int k;
    label51:
    boolean bool;
    if (localTypedArray.hasValue(a.h.FontFamilyFont_fontWeight))
    {
      i = a.h.FontFamilyFont_fontWeight;
      j = localTypedArray.getInt(i, 400);
      if (!localTypedArray.hasValue(a.h.FontFamilyFont_fontStyle)) {
        break label125;
      }
      k = a.h.FontFamilyFont_fontStyle;
      if (1 != localTypedArray.getInt(k, 0)) {
        break label133;
      }
      bool = true;
      label65:
      if (!localTypedArray.hasValue(a.h.FontFamilyFont_font)) {
        break label139;
      }
    }
    int n;
    String str;
    label133:
    label139:
    for (int m = a.h.FontFamilyFont_font;; m = a.h.FontFamilyFont_android_font)
    {
      n = localTypedArray.getResourceId(m, 0);
      str = localTypedArray.getString(m);
      localTypedArray.recycle();
      while (paramXmlPullParser.next() != 3) {
        a(paramXmlPullParser);
      }
      i = a.h.FontFamilyFont_android_fontWeight;
      break;
      label125:
      k = a.h.FontFamilyFont_android_fontStyle;
      break label51;
      bool = false;
      break label65;
    }
    return new c(str, j, bool, n);
  }
  
  public static abstract interface a {}
  
  public static final class b
    implements a.a
  {
    private final a.c[] a;
    
    public b(a.c[] paramArrayOfc)
    {
      this.a = paramArrayOfc;
    }
    
    public a.c[] a()
    {
      return this.a;
    }
  }
  
  public static final class c
  {
    private final String a;
    private int b;
    private boolean c;
    private int d;
    
    public c(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
    {
      this.a = paramString;
      this.b = paramInt1;
      this.c = paramBoolean;
      this.d = paramInt2;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.b;
    }
    
    public boolean c()
    {
      return this.c;
    }
    
    public int d()
    {
      return this.d;
    }
  }
  
  public static final class d
    implements a.a
  {
    private final android.support.v4.d.a a;
    private final int b;
    private final int c;
    
    public d(android.support.v4.d.a parama, int paramInt1, int paramInt2)
    {
      this.a = parama;
      this.c = paramInt1;
      this.b = paramInt2;
    }
    
    public android.support.v4.d.a a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.c;
    }
    
    public int c()
    {
      return this.b;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.a
 * JD-Core Version:    0.7.0.1
 */