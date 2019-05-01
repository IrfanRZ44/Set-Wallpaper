package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.a.b;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion
  extends PathMotion
{
  private Path a;
  private final Path b = new Path();
  private final Matrix c = new Matrix();
  
  public PatternPathMotion()
  {
    this.b.lineTo(1.0F, 0.0F);
    this.a = this.b;
  }
  
  public PatternPathMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.k);
    String str;
    try
    {
      str = c.a(localTypedArray, (XmlPullParser)paramAttributeSet, "patternPathData", 0);
      if (str == null) {
        throw new RuntimeException("pathData must be supplied for patternPathMotion");
      }
    }
    finally
    {
      localTypedArray.recycle();
    }
    a(b.a(str));
    localTypedArray.recycle();
  }
  
  private static float a(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }
  
  public Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = a(f1, f2);
    double d = Math.atan2(f2, f1);
    this.c.setScale(f3, f3);
    this.c.postRotate((float)Math.toDegrees(d));
    this.c.postTranslate(paramFloat1, paramFloat2);
    Path localPath = new Path();
    this.b.transform(this.c, localPath);
    return localPath;
  }
  
  public void a(Path paramPath)
  {
    PathMeasure localPathMeasure = new PathMeasure(paramPath, false);
    float f1 = localPathMeasure.getLength();
    float[] arrayOfFloat = new float[2];
    localPathMeasure.getPosTan(f1, arrayOfFloat, null);
    float f2 = arrayOfFloat[0];
    float f3 = arrayOfFloat[1];
    localPathMeasure.getPosTan(0.0F, arrayOfFloat, null);
    float f4 = arrayOfFloat[0];
    float f5 = arrayOfFloat[1];
    if ((f4 == f2) && (f5 == f3)) {
      throw new IllegalArgumentException("pattern must not end at the starting point");
    }
    this.c.setTranslate(-f4, -f5);
    float f6 = f2 - f4;
    float f7 = f3 - f5;
    float f8 = 1.0F / a(f6, f7);
    this.c.postScale(f8, f8);
    double d = Math.atan2(f7, f6);
    this.c.postRotate((float)Math.toDegrees(-d));
    paramPath.transform(this.c, this.b);
    this.a = paramPath;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.PatternPathMotion
 * JD-Core Version:    0.7.0.1
 */