package android.support.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.b.b;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i
  extends h
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private f c;
  private PorterDuffColorFilter d;
  private ColorFilter e;
  private boolean f;
  private boolean g = true;
  private Drawable.ConstantState h;
  private final float[] i = new float[9];
  private final Matrix j = new Matrix();
  private final Rect k = new Rect();
  
  i()
  {
    this.c = new f();
  }
  
  i(f paramf)
  {
    this.c = paramf;
    this.d = a(this.d, paramf.c, paramf.d);
  }
  
  static int a(int paramInt, float paramFloat)
  {
    int m = Color.alpha(paramInt);
    return 0xFFFFFF & paramInt | (int)(paramFloat * m) << 24;
  }
  
  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return paramMode;
    case 3: 
      return PorterDuff.Mode.SRC_OVER;
    case 5: 
      return PorterDuff.Mode.SRC_IN;
    case 9: 
      return PorterDuff.Mode.SRC_ATOP;
    case 14: 
      return PorterDuff.Mode.MULTIPLY;
    case 15: 
      return PorterDuff.Mode.SCREEN;
    }
    return PorterDuff.Mode.ADD;
  }
  
  public static i a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      i locali1 = new i();
      locali1.b = android.support.v4.content.a.b.a(paramResources, paramInt, paramTheme);
      locali1.h = new g(locali1.b.getConstantState());
      return locali1;
    }
    try
    {
      localXmlResourceParser = paramResources.getXml(paramInt);
      localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
      int m;
      do
      {
        m = localXmlResourceParser.next();
      } while ((m != 2) && (m != 1));
      if (m != 2) {
        throw new XmlPullParserException("No start tag found");
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      XmlResourceParser localXmlResourceParser;
      AttributeSet localAttributeSet;
      Log.e("VectorDrawableCompat", "parser error", localXmlPullParserException);
      return null;
      i locali2 = a(paramResources, localXmlResourceParser, localAttributeSet, paramTheme);
      return locali2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("VectorDrawableCompat", "parser error", localIOException);
      }
    }
  }
  
  public static i a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    i locali = new i();
    locali.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return locali;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    f localf = this.c;
    e locale = localf.b;
    localf.d = a(c.a(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList localColorStateList = paramTypedArray.getColorStateList(1);
    if (localColorStateList != null) {
      localf.c = localColorStateList;
    }
    localf.e = c.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, localf.e);
    locale.d = c.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, locale.d);
    locale.e = c.a(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, locale.e);
    if (locale.d <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }
    if (locale.e <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }
    locale.b = paramTypedArray.getDimension(3, locale.b);
    locale.c = paramTypedArray.getDimension(2, locale.c);
    if (locale.b <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    }
    if (locale.c <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    }
    locale.setAlpha(c.a(paramTypedArray, paramXmlPullParser, "alpha", 4, locale.getAlpha()));
    String str = paramTypedArray.getString(0);
    if (str != null)
    {
      locale.g = str;
      locale.h.put(str, locale);
    }
  }
  
  private boolean a()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return (isAutoMirrored()) && (android.support.v4.a.a.a.i(this) == 1);
    }
    return false;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = this.c;
    e locale = localf.b;
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.push(locale.a);
    int m = paramXmlPullParser.getEventType();
    int n = 1 + paramXmlPullParser.getDepth();
    int i1 = 1;
    if ((m != 1) && ((paramXmlPullParser.getDepth() >= n) || (m != 3)))
    {
      String str;
      c localc1;
      int i2;
      if (m == 2)
      {
        str = paramXmlPullParser.getName();
        localc1 = (c)localArrayDeque.peek();
        if ("path".equals(str))
        {
          b localb = new b();
          localb.a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localc1.a.add(localb);
          if (localb.getPathName() != null) {
            locale.h.put(localb.getPathName(), localb);
          }
          i2 = 0;
          localf.a |= localb.o;
          label184:
          i1 = i2;
        }
      }
      for (;;)
      {
        m = paramXmlPullParser.next();
        break;
        if ("clip-path".equals(str))
        {
          a locala = new a();
          locala.a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localc1.a.add(locala);
          if (locala.getPathName() != null) {
            locale.h.put(locala.getPathName(), locala);
          }
          localf.a |= locala.o;
          i2 = i1;
          break label184;
        }
        if ("group".equals(str))
        {
          c localc2 = new c();
          localc2.a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localc1.a.add(localc2);
          localArrayDeque.push(localc2);
          if (localc2.getGroupName() != null) {
            locale.h.put(localc2.getGroupName(), localc2);
          }
          localf.a |= localc2.c;
        }
        i2 = i1;
        break label184;
        if ((m == 3) && ("group".equals(paramXmlPullParser.getName()))) {
          localArrayDeque.pop();
        }
      }
    }
    if (i1 != 0) {
      throw new XmlPullParserException("no path defined");
    }
  }
  
  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  Object a(String paramString)
  {
    return this.c.b.h.get(paramString);
  }
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean canApplyTheme()
  {
    if (this.b != null) {
      android.support.v4.a.a.a.d(this.b);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.b != null) {
      this.b.draw(paramCanvas);
    }
    Object localObject;
    int i1;
    int i2;
    do
    {
      do
      {
        return;
        copyBounds(this.k);
      } while ((this.k.width() <= 0) || (this.k.height() <= 0));
      if (this.e != null) {
        break;
      }
      localObject = this.d;
      paramCanvas.getMatrix(this.j);
      this.j.getValues(this.i);
      float f1 = Math.abs(this.i[0]);
      float f2 = Math.abs(this.i[4]);
      float f3 = Math.abs(this.i[1]);
      float f4 = Math.abs(this.i[3]);
      if ((f3 != 0.0F) || (f4 != 0.0F))
      {
        f2 = 1.0F;
        f1 = 1.0F;
      }
      int m = (int)(f1 * this.k.width());
      int n = (int)(f2 * this.k.height());
      i1 = Math.min(2048, m);
      i2 = Math.min(2048, n);
    } while ((i1 <= 0) || (i2 <= 0));
    int i3 = paramCanvas.save();
    paramCanvas.translate(this.k.left, this.k.top);
    if (a())
    {
      paramCanvas.translate(this.k.width(), 0.0F);
      paramCanvas.scale(-1.0F, 1.0F);
    }
    this.k.offsetTo(0, 0);
    this.c.b(i1, i2);
    if (!this.g) {
      this.c.a(i1, i2);
    }
    for (;;)
    {
      this.c.a(paramCanvas, (ColorFilter)localObject, this.k);
      paramCanvas.restoreToCount(i3);
      return;
      localObject = this.e;
      break;
      if (!this.c.b())
      {
        this.c.a(i1, i2);
        this.c.c();
      }
    }
  }
  
  public int getAlpha()
  {
    if (this.b != null) {
      return android.support.v4.a.a.a.c(this.b);
    }
    return this.c.b.getRootAlpha();
  }
  
  public int getChangingConfigurations()
  {
    if (this.b != null) {
      return this.b.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.c.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((this.b != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new g(this.b.getConstantState());
    }
    this.c.a = getChangingConfigurations();
    return this.c;
  }
  
  public int getIntrinsicHeight()
  {
    if (this.b != null) {
      return this.b.getIntrinsicHeight();
    }
    return (int)this.c.b.c;
  }
  
  public int getIntrinsicWidth()
  {
    if (this.b != null) {
      return this.b.getIntrinsicWidth();
    }
    return (int)this.c.b.b;
  }
  
  public int getOpacity()
  {
    if (this.b != null) {
      return this.b.getOpacity();
    }
    return -3;
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.b != null)
    {
      this.b.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    f localf = this.c;
    localf.b = new e();
    TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.a);
    a(localTypedArray, paramXmlPullParser);
    localTypedArray.recycle();
    localf.a = getChangingConfigurations();
    localf.k = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.d = a(this.d, localf.c, localf.d);
  }
  
  public void invalidateSelf()
  {
    if (this.b != null)
    {
      this.b.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.b != null) {
      return android.support.v4.a.a.a.b(this.b);
    }
    return this.c.e;
  }
  
  public boolean isStateful()
  {
    if (this.b != null) {
      return this.b.isStateful();
    }
    return (super.isStateful()) || ((this.c != null) && (this.c.c != null) && (this.c.c.isStateful()));
  }
  
  public Drawable mutate()
  {
    if (this.b != null) {
      this.b.mutate();
    }
    while ((this.f) || (super.mutate() != this)) {
      return this;
    }
    this.c = new f(this.c);
    this.f = true;
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.b != null) {
      this.b.setBounds(paramRect);
    }
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.b != null) {
      return this.b.setState(paramArrayOfInt);
    }
    f localf = this.c;
    if ((localf.c != null) && (localf.d != null))
    {
      this.d = a(this.d, localf.c, localf.d);
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.b != null)
    {
      this.b.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.b != null) {
      this.b.setAlpha(paramInt);
    }
    while (this.c.b.getRootAlpha() == paramInt) {
      return;
    }
    this.c.b.setRootAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramBoolean);
      return;
    }
    this.c.e = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.b != null)
    {
      this.b.setColorFilter(paramColorFilter);
      return;
    }
    this.e = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.b != null) {
      android.support.v4.a.a.a.a(this.b, paramColorStateList);
    }
    f localf;
    do
    {
      return;
      localf = this.c;
    } while (localf.c == paramColorStateList);
    localf.c = paramColorStateList;
    this.d = a(this.d, paramColorStateList, localf.d);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.b != null) {
      android.support.v4.a.a.a.a(this.b, paramMode);
    }
    f localf;
    do
    {
      return;
      localf = this.c;
    } while (localf.d == paramMode);
    localf.d = paramMode;
    this.d = a(this.d, localf.c, paramMode);
    invalidateSelf();
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.b != null) {
      return this.b.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.b != null)
    {
      this.b.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  private static class a
    extends i.d
  {
    public a() {}
    
    public a(a parama)
    {
      super();
    }
    
    private void a(TypedArray paramTypedArray)
    {
      String str1 = paramTypedArray.getString(0);
      if (str1 != null) {
        this.n = str1;
      }
      String str2 = paramTypedArray.getString(1);
      if (str2 != null) {
        this.m = android.support.v4.a.b.b(str2);
      }
    }
    
    public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      if (!c.a(paramXmlPullParser, "pathData")) {
        return;
      }
      TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.d);
      a(localTypedArray);
      localTypedArray.recycle();
    }
    
    public boolean a()
    {
      return true;
    }
  }
  
  private static class b
    extends i.d
  {
    int a = 0;
    float b = 0.0F;
    int c = 0;
    float d = 1.0F;
    int e = 0;
    float f = 1.0F;
    float g = 0.0F;
    float h = 1.0F;
    float i = 0.0F;
    Paint.Cap j = Paint.Cap.BUTT;
    Paint.Join k = Paint.Join.MITER;
    float l = 4.0F;
    private int[] p;
    
    public b() {}
    
    public b(b paramb)
    {
      super();
      this.p = paramb.p;
      this.a = paramb.a;
      this.b = paramb.b;
      this.d = paramb.d;
      this.c = paramb.c;
      this.e = paramb.e;
      this.f = paramb.f;
      this.g = paramb.g;
      this.h = paramb.h;
      this.i = paramb.i;
      this.j = paramb.j;
      this.k = paramb.k;
      this.l = paramb.l;
    }
    
    private Paint.Cap a(int paramInt, Paint.Cap paramCap)
    {
      switch (paramInt)
      {
      default: 
        return paramCap;
      case 0: 
        return Paint.Cap.BUTT;
      case 1: 
        return Paint.Cap.ROUND;
      }
      return Paint.Cap.SQUARE;
    }
    
    private Paint.Join a(int paramInt, Paint.Join paramJoin)
    {
      switch (paramInt)
      {
      default: 
        return paramJoin;
      case 0: 
        return Paint.Join.MITER;
      case 1: 
        return Paint.Join.ROUND;
      }
      return Paint.Join.BEVEL;
    }
    
    private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      this.p = null;
      if (!c.a(paramXmlPullParser, "pathData")) {
        return;
      }
      String str1 = paramTypedArray.getString(0);
      if (str1 != null) {
        this.n = str1;
      }
      String str2 = paramTypedArray.getString(2);
      if (str2 != null) {
        this.m = android.support.v4.a.b.b(str2);
      }
      this.c = c.b(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.c);
      this.f = c.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.f);
      this.j = a(c.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), this.j);
      this.k = a(c.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), this.k);
      this.l = c.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.l);
      this.a = c.b(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.a);
      this.d = c.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.d);
      this.b = c.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.b);
      this.h = c.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.h);
      this.i = c.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.i);
      this.g = c.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.g);
      this.e = c.a(paramTypedArray, paramXmlPullParser, "fillType", 13, this.e);
    }
    
    public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.c);
      a(localTypedArray, paramXmlPullParser);
      localTypedArray.recycle();
    }
    
    float getFillAlpha()
    {
      return this.f;
    }
    
    int getFillColor()
    {
      return this.c;
    }
    
    float getStrokeAlpha()
    {
      return this.d;
    }
    
    int getStrokeColor()
    {
      return this.a;
    }
    
    float getStrokeWidth()
    {
      return this.b;
    }
    
    float getTrimPathEnd()
    {
      return this.h;
    }
    
    float getTrimPathOffset()
    {
      return this.i;
    }
    
    float getTrimPathStart()
    {
      return this.g;
    }
    
    void setFillAlpha(float paramFloat)
    {
      this.f = paramFloat;
    }
    
    void setFillColor(int paramInt)
    {
      this.c = paramInt;
    }
    
    void setStrokeAlpha(float paramFloat)
    {
      this.d = paramFloat;
    }
    
    void setStrokeColor(int paramInt)
    {
      this.a = paramInt;
    }
    
    void setStrokeWidth(float paramFloat)
    {
      this.b = paramFloat;
    }
    
    void setTrimPathEnd(float paramFloat)
    {
      this.h = paramFloat;
    }
    
    void setTrimPathOffset(float paramFloat)
    {
      this.i = paramFloat;
    }
    
    void setTrimPathStart(float paramFloat)
    {
      this.g = paramFloat;
    }
  }
  
  private static class c
  {
    final ArrayList<Object> a = new ArrayList();
    float b = 0.0F;
    int c;
    private final Matrix d = new Matrix();
    private float e = 0.0F;
    private float f = 0.0F;
    private float g = 1.0F;
    private float h = 1.0F;
    private float i = 0.0F;
    private float j = 0.0F;
    private final Matrix k = new Matrix();
    private int[] l;
    private String m = null;
    
    public c() {}
    
    public c(c paramc, android.support.v4.f.a<String, Object> parama)
    {
      this.b = paramc.b;
      this.e = paramc.e;
      this.f = paramc.f;
      this.g = paramc.g;
      this.h = paramc.h;
      this.i = paramc.i;
      this.j = paramc.j;
      this.l = paramc.l;
      this.m = paramc.m;
      this.c = paramc.c;
      if (this.m != null) {
        parama.put(this.m, this);
      }
      this.k.set(paramc.k);
      ArrayList localArrayList = paramc.a;
      int n = 0;
      while (n < localArrayList.size())
      {
        Object localObject1 = localArrayList.get(n);
        if ((localObject1 instanceof c))
        {
          c localc = (c)localObject1;
          this.a.add(new c(localc, parama));
          n++;
        }
        else
        {
          if ((localObject1 instanceof i.b)) {}
          for (Object localObject2 = new i.b((i.b)localObject1);; localObject2 = new i.a((i.a)localObject1))
          {
            this.a.add(localObject2);
            if (((i.d)localObject2).n == null) {
              break;
            }
            parama.put(((i.d)localObject2).n, localObject2);
            break;
            if (!(localObject1 instanceof i.a)) {
              break label329;
            }
          }
          label329:
          throw new IllegalStateException("Unknown object in the tree!");
        }
      }
    }
    
    private void a()
    {
      this.k.reset();
      this.k.postTranslate(-this.e, -this.f);
      this.k.postScale(this.g, this.h);
      this.k.postRotate(this.b, 0.0F, 0.0F);
      this.k.postTranslate(this.i + this.e, this.j + this.f);
    }
    
    private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      this.l = null;
      this.b = c.a(paramTypedArray, paramXmlPullParser, "rotation", 5, this.b);
      this.e = paramTypedArray.getFloat(1, this.e);
      this.f = paramTypedArray.getFloat(2, this.f);
      this.g = c.a(paramTypedArray, paramXmlPullParser, "scaleX", 3, this.g);
      this.h = c.a(paramTypedArray, paramXmlPullParser, "scaleY", 4, this.h);
      this.i = c.a(paramTypedArray, paramXmlPullParser, "translateX", 6, this.i);
      this.j = c.a(paramTypedArray, paramXmlPullParser, "translateY", 7, this.j);
      String str = paramTypedArray.getString(0);
      if (str != null) {
        this.m = str;
      }
      a();
    }
    
    public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.b);
      a(localTypedArray, paramXmlPullParser);
      localTypedArray.recycle();
    }
    
    public String getGroupName()
    {
      return this.m;
    }
    
    public Matrix getLocalMatrix()
    {
      return this.k;
    }
    
    public float getPivotX()
    {
      return this.e;
    }
    
    public float getPivotY()
    {
      return this.f;
    }
    
    public float getRotation()
    {
      return this.b;
    }
    
    public float getScaleX()
    {
      return this.g;
    }
    
    public float getScaleY()
    {
      return this.h;
    }
    
    public float getTranslateX()
    {
      return this.i;
    }
    
    public float getTranslateY()
    {
      return this.j;
    }
    
    public void setPivotX(float paramFloat)
    {
      if (paramFloat != this.e)
      {
        this.e = paramFloat;
        a();
      }
    }
    
    public void setPivotY(float paramFloat)
    {
      if (paramFloat != this.f)
      {
        this.f = paramFloat;
        a();
      }
    }
    
    public void setRotation(float paramFloat)
    {
      if (paramFloat != this.b)
      {
        this.b = paramFloat;
        a();
      }
    }
    
    public void setScaleX(float paramFloat)
    {
      if (paramFloat != this.g)
      {
        this.g = paramFloat;
        a();
      }
    }
    
    public void setScaleY(float paramFloat)
    {
      if (paramFloat != this.h)
      {
        this.h = paramFloat;
        a();
      }
    }
    
    public void setTranslateX(float paramFloat)
    {
      if (paramFloat != this.i)
      {
        this.i = paramFloat;
        a();
      }
    }
    
    public void setTranslateY(float paramFloat)
    {
      if (paramFloat != this.j)
      {
        this.j = paramFloat;
        a();
      }
    }
  }
  
  private static class d
  {
    protected b.b[] m = null;
    String n;
    int o;
    
    public d() {}
    
    public d(d paramd)
    {
      this.n = paramd.n;
      this.o = paramd.o;
      this.m = android.support.v4.a.b.a(paramd.m);
    }
    
    public void a(Path paramPath)
    {
      paramPath.reset();
      if (this.m != null) {
        b.b.a(this.m, paramPath);
      }
    }
    
    public boolean a()
    {
      return false;
    }
    
    public b.b[] getPathData()
    {
      return this.m;
    }
    
    public String getPathName()
    {
      return this.n;
    }
    
    public void setPathData(b.b[] paramArrayOfb)
    {
      if (!android.support.v4.a.b.a(this.m, paramArrayOfb))
      {
        this.m = android.support.v4.a.b.a(paramArrayOfb);
        return;
      }
      android.support.v4.a.b.b(this.m, paramArrayOfb);
    }
  }
  
  private static class e
  {
    private static final Matrix k = new Matrix();
    final i.c a;
    float b = 0.0F;
    float c = 0.0F;
    float d = 0.0F;
    float e = 0.0F;
    int f = 255;
    String g = null;
    final android.support.v4.f.a<String, Object> h = new android.support.v4.f.a();
    private final Path i;
    private final Path j;
    private final Matrix l = new Matrix();
    private Paint m;
    private Paint n;
    private PathMeasure o;
    private int p;
    
    public e()
    {
      this.a = new i.c();
      this.i = new Path();
      this.j = new Path();
    }
    
    public e(e parame)
    {
      this.a = new i.c(parame.a, this.h);
      this.i = new Path(parame.i);
      this.j = new Path(parame.j);
      this.b = parame.b;
      this.c = parame.c;
      this.d = parame.d;
      this.e = parame.e;
      this.p = parame.p;
      this.f = parame.f;
      this.g = parame.g;
      if (parame.g != null) {
        this.h.put(parame.g, this);
      }
    }
    
    private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
    }
    
    private float a(Matrix paramMatrix)
    {
      float[] arrayOfFloat = { 0.0F, 1.0F, 1.0F, 0.0F };
      paramMatrix.mapVectors(arrayOfFloat);
      float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
      float f2 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
      float f3 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
      float f4 = Math.max(f1, f2);
      boolean bool = f4 < 0.0F;
      float f5 = 0.0F;
      if (bool) {
        f5 = Math.abs(f3) / f4;
      }
      return f5;
    }
    
    private void a(i.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      i.c.a(paramc).set(paramMatrix);
      i.c.a(paramc).preConcat(i.c.b(paramc));
      paramCanvas.save();
      int i1 = 0;
      if (i1 < paramc.a.size())
      {
        Object localObject = paramc.a.get(i1);
        if ((localObject instanceof i.c)) {
          a((i.c)localObject, i.c.a(paramc), paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
        for (;;)
        {
          i1++;
          break;
          if ((localObject instanceof i.d)) {
            a(paramc, (i.d)localObject, paramCanvas, paramInt1, paramInt2, paramColorFilter);
          }
        }
      }
      paramCanvas.restore();
    }
    
    private void a(i.c paramc, i.d paramd, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      float f1 = paramInt1 / this.d;
      float f2 = paramInt2 / this.e;
      float f3 = Math.min(f1, f2);
      Matrix localMatrix = i.c.a(paramc);
      this.l.set(localMatrix);
      this.l.postScale(f1, f2);
      float f4 = a(localMatrix);
      if (f4 == 0.0F) {
        return;
      }
      paramd.a(this.i);
      Path localPath1 = this.i;
      this.j.reset();
      if (paramd.a())
      {
        this.j.addPath(localPath1, this.l);
        paramCanvas.clipPath(this.j);
        return;
      }
      i.b localb = (i.b)paramd;
      float f8;
      float f9;
      label274:
      Paint localPaint2;
      Path localPath2;
      if ((localb.g != 0.0F) || (localb.h != 1.0F))
      {
        float f5 = (localb.g + localb.i) % 1.0F;
        float f6 = (localb.h + localb.i) % 1.0F;
        if (this.o == null) {
          this.o = new PathMeasure();
        }
        this.o.setPath(this.i, false);
        float f7 = this.o.getLength();
        f8 = f5 * f7;
        f9 = f6 * f7;
        localPath1.reset();
        if (f8 > f9)
        {
          this.o.getSegment(f8, f7, localPath1, true);
          this.o.getSegment(0.0F, f9, localPath1, true);
          localPath1.rLineTo(0.0F, 0.0F);
        }
      }
      else
      {
        this.j.addPath(localPath1, this.l);
        if (localb.c != 0)
        {
          if (this.n == null)
          {
            this.n = new Paint();
            this.n.setStyle(Paint.Style.FILL);
            this.n.setAntiAlias(true);
          }
          localPaint2 = this.n;
          localPaint2.setColor(i.a(localb.c, localb.f));
          localPaint2.setColorFilter(paramColorFilter);
          localPath2 = this.j;
          if (localb.e != 0) {
            break label573;
          }
        }
      }
      label573:
      for (Path.FillType localFillType = Path.FillType.WINDING;; localFillType = Path.FillType.EVEN_ODD)
      {
        localPath2.setFillType(localFillType);
        paramCanvas.drawPath(this.j, localPaint2);
        if (localb.a == 0) {
          break;
        }
        if (this.m == null)
        {
          this.m = new Paint();
          this.m.setStyle(Paint.Style.STROKE);
          this.m.setAntiAlias(true);
        }
        Paint localPaint1 = this.m;
        if (localb.k != null) {
          localPaint1.setStrokeJoin(localb.k);
        }
        if (localb.j != null) {
          localPaint1.setStrokeCap(localb.j);
        }
        localPaint1.setStrokeMiter(localb.l);
        localPaint1.setColor(i.a(localb.a, localb.d));
        localPaint1.setColorFilter(paramColorFilter);
        localPaint1.setStrokeWidth(f4 * f3 * localb.b);
        paramCanvas.drawPath(this.j, localPaint1);
        return;
        this.o.getSegment(f8, f9, localPath1, true);
        break label274;
      }
    }
    
    public void a(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      a(this.a, k, paramCanvas, paramInt1, paramInt2, paramColorFilter);
    }
    
    public float getAlpha()
    {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha()
    {
      return this.f;
    }
    
    public void setAlpha(float paramFloat)
    {
      setRootAlpha((int)(255.0F * paramFloat));
    }
    
    public void setRootAlpha(int paramInt)
    {
      this.f = paramInt;
    }
  }
  
  private static class f
    extends Drawable.ConstantState
  {
    int a;
    i.e b;
    ColorStateList c = null;
    PorterDuff.Mode d = i.a;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;
    
    public f()
    {
      this.b = new i.e();
    }
    
    public f(f paramf)
    {
      if (paramf != null)
      {
        this.a = paramf.a;
        this.b = new i.e(paramf.b);
        if (i.e.a(paramf.b) != null) {
          i.e.a(this.b, new Paint(i.e.a(paramf.b)));
        }
        if (i.e.b(paramf.b) != null) {
          i.e.b(this.b, new Paint(i.e.b(paramf.b)));
        }
        this.c = paramf.c;
        this.d = paramf.d;
        this.e = paramf.e;
      }
    }
    
    public Paint a(ColorFilter paramColorFilter)
    {
      if ((!a()) && (paramColorFilter == null)) {
        return null;
      }
      if (this.l == null)
      {
        this.l = new Paint();
        this.l.setFilterBitmap(true);
      }
      this.l.setAlpha(this.b.getRootAlpha());
      this.l.setColorFilter(paramColorFilter);
      return this.l;
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      this.f.eraseColor(0);
      Canvas localCanvas = new Canvas(this.f);
      this.b.a(localCanvas, paramInt1, paramInt2, null);
    }
    
    public void a(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
    {
      Paint localPaint = a(paramColorFilter);
      paramCanvas.drawBitmap(this.f, null, paramRect, localPaint);
    }
    
    public boolean a()
    {
      return this.b.getRootAlpha() < 255;
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      if ((this.f == null) || (!c(paramInt1, paramInt2)))
      {
        this.f = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        this.k = true;
      }
    }
    
    public boolean b()
    {
      return (!this.k) && (this.g == this.c) && (this.h == this.d) && (this.j == this.e) && (this.i == this.b.getRootAlpha());
    }
    
    public void c()
    {
      this.g = this.c;
      this.h = this.d;
      this.i = this.b.getRootAlpha();
      this.j = this.e;
      this.k = false;
    }
    
    public boolean c(int paramInt1, int paramInt2)
    {
      return (paramInt1 == this.f.getWidth()) && (paramInt2 == this.f.getHeight());
    }
    
    public int getChangingConfigurations()
    {
      return this.a;
    }
    
    public Drawable newDrawable()
    {
      return new i(this);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new i(this);
    }
  }
  
  private static class g
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState a;
    
    public g(Drawable.ConstantState paramConstantState)
    {
      this.a = paramConstantState;
    }
    
    public boolean canApplyTheme()
    {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable()
    {
      i locali = new i();
      locali.b = ((VectorDrawable)this.a.newDrawable());
      return locali;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      i locali = new i();
      locali.b = ((VectorDrawable)this.a.newDrawable(paramResources));
      return locali;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      i locali = new i();
      locali.b = ((VectorDrawable)this.a.newDrawable(paramResources, paramTheme));
      return locali;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.c.a.i
 * JD-Core Version:    0.7.0.1
 */