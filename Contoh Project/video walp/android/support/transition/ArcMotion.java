package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion
  extends PathMotion
{
  private static final float a = (float)Math.tan(Math.toRadians(35.0D));
  private float b = 0.0F;
  private float c = 0.0F;
  private float d = 70.0F;
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = a;
  
  public ArcMotion() {}
  
  public ArcMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.j);
    XmlPullParser localXmlPullParser = (XmlPullParser)paramAttributeSet;
    b(c.a(localTypedArray, localXmlPullParser, "minimumVerticalAngle", 1, 0.0F));
    a(c.a(localTypedArray, localXmlPullParser, "minimumHorizontalAngle", 0, 0.0F));
    c(c.a(localTypedArray, localXmlPullParser, "maximumAngle", 2, 70.0F));
    localTypedArray.recycle();
  }
  
  private static float d(float paramFloat)
  {
    if ((paramFloat < 0.0F) || (paramFloat > 90.0F)) {
      throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }
    return (float)Math.tan(Math.toRadians(paramFloat / 2.0F));
  }
  
  public Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(paramFloat1, paramFloat2);
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = f1 * f1 + f2 * f2;
    float f4 = (paramFloat1 + paramFloat3) / 2.0F;
    float f5 = (paramFloat2 + paramFloat4) / 2.0F;
    float f6 = f3 * 0.25F;
    int i;
    float f20;
    float f21;
    float f22;
    label113:
    float f11;
    float f12;
    float f13;
    float f16;
    float f17;
    if (paramFloat2 > paramFloat4)
    {
      i = 1;
      if (Math.abs(f1) >= Math.abs(f2)) {
        break label287;
      }
      f20 = Math.abs(f3 / (2.0F * f2));
      if (i == 0) {
        break label275;
      }
      f21 = paramFloat4 + f20;
      f22 = paramFloat3;
      float f23 = f6 * this.f * this.f;
      f11 = f22;
      f12 = f21;
      f13 = f23;
      float f14 = f4 - f11;
      float f15 = f5 - f12;
      f16 = f14 * f14 + f15 * f15;
      f17 = f6 * this.g * this.g;
      if (f16 >= f13) {
        break label352;
      }
    }
    for (;;)
    {
      label188:
      float f19;
      if (f13 != 0.0F)
      {
        f19 = (float)Math.sqrt(f13 / f16);
        f11 = f4 + f19 * (f11 - f4);
      }
      for (float f18 = f5 + f19 * (f12 - f5);; f18 = f12)
      {
        localPath.cubicTo((paramFloat1 + f11) / 2.0F, (paramFloat2 + f18) / 2.0F, (f11 + paramFloat3) / 2.0F, (f18 + paramFloat4) / 2.0F, paramFloat3, paramFloat4);
        return localPath;
        i = 0;
        break;
        label275:
        f21 = paramFloat2 + f20;
        f22 = paramFloat1;
        break label113;
        label287:
        float f7 = f3 / (f1 * 2.0F);
        float f8;
        if (i != 0) {
          f8 = paramFloat1 + f7;
        }
        for (float f9 = paramFloat2;; f9 = paramFloat4)
        {
          float f10 = f6 * this.e * this.e;
          f11 = f8;
          f12 = f9;
          f13 = f10;
          break;
          f8 = paramFloat3 - f7;
        }
        label352:
        if (f16 <= f17) {
          break label374;
        }
        f13 = f17;
        break label188;
      }
      label374:
      f13 = 0.0F;
    }
  }
  
  public void a(float paramFloat)
  {
    this.b = paramFloat;
    this.e = d(paramFloat);
  }
  
  public void b(float paramFloat)
  {
    this.c = paramFloat;
    this.f = d(paramFloat);
  }
  
  public void c(float paramFloat)
  {
    this.d = paramFloat;
    this.g = d(paramFloat);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ArcMotion
 * JD-Core Version:    0.7.0.1
 */