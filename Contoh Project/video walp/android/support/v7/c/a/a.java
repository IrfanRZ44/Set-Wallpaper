package android.support.v7.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.a.a.a;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class a
{
  private static int a(int paramInt, float paramFloat)
  {
    return android.support.v4.a.a.b(paramInt, Math.round(paramFloat * Color.alpha(paramInt)));
  }
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i != 2) {
      throw new XmlPullParserException("No start tag found");
    }
    return a(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
  }
  
  private static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    String str = paramXmlPullParser.getName();
    if (!str.equals("selector")) {
      throw new XmlPullParserException(paramXmlPullParser.getPositionDescription() + ": invalid color state list tag " + str);
    }
    return b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  private static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  private static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = 1 + paramXmlPullParser.getDepth();
    int[][] arrayOfInt1 = new int[20][];
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    Object localObject1 = arrayOfInt1;
    int j = 0;
    Object localObject2 = arrayOfInt2;
    int k;
    int m;
    do
    {
      k = paramXmlPullParser.next();
      if (k == 1) {
        break;
      }
      m = paramXmlPullParser.getDepth();
      if ((m < i) && (k == 3)) {
        break;
      }
    } while ((k != 2) || (m > i) || (!paramXmlPullParser.getName().equals("item")));
    TypedArray localTypedArray = a(paramResources, paramTheme, paramAttributeSet, a.j.ColorStateListItem);
    int n = localTypedArray.getColor(a.j.ColorStateListItem_android_color, -65281);
    float f = 1.0F;
    label146:
    int i1;
    int[] arrayOfInt5;
    int i3;
    label171:
    int i5;
    int i7;
    if (localTypedArray.hasValue(a.j.ColorStateListItem_android_alpha))
    {
      f = localTypedArray.getFloat(a.j.ColorStateListItem_android_alpha, f);
      localTypedArray.recycle();
      i1 = 0;
      int i2 = paramAttributeSet.getAttributeCount();
      arrayOfInt5 = new int[i2];
      i3 = 0;
      if (i3 >= i2) {
        break label283;
      }
      i5 = paramAttributeSet.getAttributeNameResource(i3);
      if ((i5 == 16843173) || (i5 == 16843551) || (i5 == a.a.alpha)) {
        break label398;
      }
      i7 = i1 + 1;
      if (!paramAttributeSet.getAttributeBooleanValue(i3, false)) {
        break label275;
      }
      label228:
      arrayOfInt5[i1] = i5;
    }
    label398:
    for (int i6 = i7;; i6 = i1)
    {
      i3++;
      i1 = i6;
      break label171;
      if (!localTypedArray.hasValue(a.j.ColorStateListItem_alpha)) {
        break label146;
      }
      f = localTypedArray.getFloat(a.j.ColorStateListItem_alpha, f);
      break label146;
      label275:
      i5 = -i5;
      break label228;
      label283:
      int[] arrayOfInt6 = StateSet.trimStateSet(arrayOfInt5, i1);
      int i4 = a(n, f);
      if ((j != 0) && (arrayOfInt6.length == 0)) {}
      int[] arrayOfInt7 = c.a((int[])localObject2, j, i4);
      int[][] arrayOfInt = (int[][])c.a((Object[])localObject1, j, arrayOfInt6);
      j++;
      localObject1 = arrayOfInt;
      localObject2 = arrayOfInt7;
      break;
      int[] arrayOfInt3 = new int[j];
      int[][] arrayOfInt4 = new int[j][];
      System.arraycopy(localObject2, 0, arrayOfInt3, 0, j);
      System.arraycopy(localObject1, 0, arrayOfInt4, 0, j);
      return new ColorStateList(arrayOfInt4, arrayOfInt3);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.c.a.a
 * JD-Core Version:    0.7.0.1
 */