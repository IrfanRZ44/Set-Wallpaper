package android.support.c.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.v4.a.b;
import android.support.v4.a.b.b;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class e
{
  private static int a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.j);
    TypedValue localTypedValue = c.b(localTypedArray, paramXmlPullParser, "value", 0);
    if (localTypedValue != null) {}
    for (int i = 1;; i = 0)
    {
      int j = 0;
      if (i != 0)
      {
        boolean bool = a(localTypedValue.type);
        j = 0;
        if (bool) {
          j = 3;
        }
      }
      localTypedArray.recycle();
      return j;
    }
  }
  
  private static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue1 = paramTypedArray.peekValue(paramInt1);
    int i;
    int j;
    label24:
    TypedValue localTypedValue2;
    int k;
    if (localTypedValue1 != null)
    {
      i = 1;
      if (i == 0) {
        break label99;
      }
      j = localTypedValue1.type;
      localTypedValue2 = paramTypedArray.peekValue(paramInt2);
      if (localTypedValue2 == null) {
        break label105;
      }
      k = 1;
      label39:
      if (k == 0) {
        break label111;
      }
    }
    label99:
    label105:
    label111:
    for (int m = localTypedValue2.type;; m = 0)
    {
      int n;
      if ((i == 0) || (!a(j)))
      {
        n = 0;
        if (k != 0)
        {
          boolean bool = a(m);
          n = 0;
          if (!bool) {}
        }
      }
      else
      {
        n = 3;
      }
      return n;
      i = 0;
      break;
      j = 0;
      break label24;
      k = 0;
      break label39;
    }
  }
  
  public static Animator a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return AnimatorInflater.loadAnimator(paramContext, paramInt);
    }
    return a(paramContext, paramContext.getResources(), paramContext.getTheme(), paramInt);
  }
  
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt)
  {
    return a(paramContext, paramResources, paramTheme, paramInt, 1.0F);
  }
  
  /* Error */
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: iload_3
    //   5: invokevirtual 80	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   8: astore 5
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload 5
    //   15: fload 4
    //   17: invokestatic 83	android/support/c/a/e:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;F)Landroid/animation/Animator;
    //   20: astore 13
    //   22: aload 5
    //   24: ifnull +10 -> 34
    //   27: aload 5
    //   29: invokeinterface 88 1 0
    //   34: aload 13
    //   36: areturn
    //   37: astore 10
    //   39: new 90	android/content/res/Resources$NotFoundException
    //   42: dup
    //   43: new 92	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   50: ldc 97
    //   52: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: iload_3
    //   56: invokestatic 107	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   59: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 114	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   68: astore 11
    //   70: aload 11
    //   72: aload 10
    //   74: invokevirtual 118	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   77: pop
    //   78: aload 11
    //   80: athrow
    //   81: astore 9
    //   83: aload 5
    //   85: ifnull +10 -> 95
    //   88: aload 5
    //   90: invokeinterface 88 1 0
    //   95: aload 9
    //   97: athrow
    //   98: astore 6
    //   100: new 90	android/content/res/Resources$NotFoundException
    //   103: dup
    //   104: new 92	java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   111: ldc 97
    //   113: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: iload_3
    //   117: invokestatic 107	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   120: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: invokespecial 114	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   129: astore 7
    //   131: aload 7
    //   133: aload 6
    //   135: invokevirtual 118	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: pop
    //   139: aload 7
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramContext	Context
    //   0	142	1	paramResources	Resources
    //   0	142	2	paramTheme	Resources.Theme
    //   0	142	3	paramInt	int
    //   0	142	4	paramFloat	float
    //   1	88	5	localXmlResourceParser	android.content.res.XmlResourceParser
    //   98	36	6	localIOException	java.io.IOException
    //   129	11	7	localNotFoundException1	android.content.res.Resources.NotFoundException
    //   81	15	9	localObject	Object
    //   37	36	10	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   68	11	11	localNotFoundException2	android.content.res.Resources.NotFoundException
    //   20	15	13	localAnimator	Animator
    // Exception table:
    //   from	to	target	type
    //   3	22	37	org/xmlpull/v1/XmlPullParserException
    //   3	22	81	finally
    //   39	81	81	finally
    //   100	142	81	finally
    //   3	22	98	java/io/IOException
  }
  
  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, float paramFloat)
  {
    return a(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser), null, 0, paramFloat);
  }
  
  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = paramXmlPullParser.getDepth();
    int j;
    do
    {
      j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        break;
      }
    } while (j != 2);
    String str = paramXmlPullParser.getName();
    int i1;
    if (str.equals("objectAnimator"))
    {
      localObject1 = a(paramContext, paramResources, paramTheme, paramAttributeSet, paramFloat, paramXmlPullParser);
      i1 = 0;
      label85:
      if ((paramAnimatorSet == null) || (i1 != 0)) {
        break label286;
      }
      if (localObject2 != null) {
        break label417;
      }
    }
    label286:
    label417:
    for (Object localObject3 = new ArrayList();; localObject3 = localObject2)
    {
      ((ArrayList)localObject3).add(localObject1);
      localObject2 = localObject3;
      break;
      if (str.equals("animator"))
      {
        localObject1 = a(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
        i1 = 0;
        break label85;
      }
      if (str.equals("set"))
      {
        AnimatorSet localAnimatorSet = new AnimatorSet();
        TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.h);
        int n = c.a(localTypedArray, paramXmlPullParser, "ordering", 0, 0);
        a(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, (AnimatorSet)localAnimatorSet, n, paramFloat);
        localTypedArray.recycle();
        localObject1 = localAnimatorSet;
        i1 = 0;
        break label85;
      }
      if (str.equals("propertyValuesHolder"))
      {
        PropertyValuesHolder[] arrayOfPropertyValuesHolder = a(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser));
        if ((arrayOfPropertyValuesHolder != null) && (localObject1 != null) && ((localObject1 instanceof ValueAnimator))) {
          ((ValueAnimator)localObject1).setValues(arrayOfPropertyValuesHolder);
        }
        i1 = 1;
        break label85;
        break;
      }
      throw new RuntimeException("Unknown animator name: " + paramXmlPullParser.getName());
      Animator[] arrayOfAnimator;
      if ((paramAnimatorSet != null) && (localObject2 != null))
      {
        arrayOfAnimator = new Animator[localObject2.size()];
        Iterator localIterator = localObject2.iterator();
        int m;
        for (int k = 0; localIterator.hasNext(); k = m)
        {
          Animator localAnimator = (Animator)localIterator.next();
          m = k + 1;
          arrayOfAnimator[k] = localAnimator;
        }
        if (paramInt == 0) {
          paramAnimatorSet.playTogether(arrayOfAnimator);
        }
      }
      else
      {
        return localObject1;
      }
      paramAnimatorSet.playSequentially(arrayOfAnimator);
      return localObject1;
    }
  }
  
  private static Keyframe a(Keyframe paramKeyframe, float paramFloat)
  {
    if (paramKeyframe.getType() == Float.TYPE) {
      return Keyframe.ofFloat(paramFloat);
    }
    if (paramKeyframe.getType() == Integer.TYPE) {
      return Keyframe.ofInt(paramFloat);
    }
    return Keyframe.ofObject(paramFloat);
  }
  
  private static Keyframe a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt, XmlPullParser paramXmlPullParser)
  {
    TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.j);
    float f = c.a(localTypedArray, paramXmlPullParser, "fraction", 3, -1.0F);
    TypedValue localTypedValue = c.b(localTypedArray, paramXmlPullParser, "value", 0);
    int i;
    label70:
    Keyframe localKeyframe;
    if (localTypedValue != null)
    {
      i = 1;
      if (paramInt == 4)
      {
        if ((i == 0) || (!a(localTypedValue.type))) {
          break label155;
        }
        paramInt = 3;
      }
      if (i == 0) {
        break label203;
      }
      localKeyframe = null;
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      int j = c.c(localTypedArray, paramXmlPullParser, "interpolator", 1, 0);
      if (j > 0) {
        localKeyframe.setInterpolator(d.a(paramContext, j));
      }
      localTypedArray.recycle();
      return localKeyframe;
      i = 0;
      break;
      label155:
      paramInt = 0;
      break label70;
      localKeyframe = Keyframe.ofFloat(f, c.a(localTypedArray, paramXmlPullParser, "value", 0, 0.0F));
      continue;
      localKeyframe = Keyframe.ofInt(f, c.a(localTypedArray, paramXmlPullParser, "value", 0, 0));
      continue;
      label203:
      if (paramInt == 0) {
        localKeyframe = Keyframe.ofFloat(f);
      } else {
        localKeyframe = Keyframe.ofInt(f);
      }
    }
  }
  
  private static ObjectAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    a(paramContext, paramResources, paramTheme, paramAttributeSet, localObjectAnimator, paramFloat, paramXmlPullParser);
    return localObjectAnimator;
  }
  
  private static PropertyValuesHolder a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    Object localObject1 = null;
    int i = paramInt;
    int j = paramXmlPullParser.next();
    Object localObject2;
    if ((j != 3) && (j != 1))
    {
      if (!paramXmlPullParser.getName().equals("keyframe")) {
        break label467;
      }
      if (i == 4) {
        i = a(paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), paramXmlPullParser);
      }
      Keyframe localKeyframe4 = a(paramContext, paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), i, paramXmlPullParser);
      if (localKeyframe4 == null) {
        break label460;
      }
      if (localObject1 != null) {
        break label453;
      }
      localObject2 = new ArrayList();
      label94:
      ((ArrayList)localObject2).add(localKeyframe4);
      label102:
      paramXmlPullParser.next();
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      if (localObject1 != null)
      {
        int k = localObject1.size();
        if (k > 0)
        {
          Keyframe localKeyframe1 = (Keyframe)localObject1.get(0);
          Keyframe localKeyframe2 = (Keyframe)localObject1.get(k - 1);
          float f1 = localKeyframe2.getFraction();
          int m;
          if (f1 < 1.0F) {
            if (f1 < 0.0F)
            {
              localKeyframe2.setFraction(1.0F);
              m = k;
            }
          }
          for (;;)
          {
            float f2 = localKeyframe1.getFraction();
            label216:
            Keyframe[] arrayOfKeyframe;
            int n;
            label234:
            Keyframe localKeyframe3;
            if (f2 != 0.0F)
            {
              if (f2 < 0.0F) {
                localKeyframe1.setFraction(0.0F);
              }
            }
            else
            {
              arrayOfKeyframe = new Keyframe[m];
              localObject1.toArray(arrayOfKeyframe);
              n = 0;
              if (n >= m) {
                break label418;
              }
              localKeyframe3 = arrayOfKeyframe[n];
              if (localKeyframe3.getFraction() < 0.0F)
              {
                if (n != 0) {
                  break label318;
                }
                localKeyframe3.setFraction(0.0F);
              }
            }
            for (;;)
            {
              n++;
              break label234;
              localObject1.add(localObject1.size(), a(localKeyframe2, 1.0F));
              m = k + 1;
              break;
              localObject1.add(0, a(localKeyframe1, 0.0F));
              m++;
              break label216;
              label318:
              if (n != m - 1) {
                break label336;
              }
              localKeyframe3.setFraction(1.0F);
            }
            label336:
            int i1 = n + 1;
            int i2 = n;
            for (;;)
            {
              if ((i1 >= m - 1) || (arrayOfKeyframe[i1].getFraction() >= 0.0F))
              {
                a(arrayOfKeyframe, arrayOfKeyframe[(i2 + 1)].getFraction() - arrayOfKeyframe[(n - 1)].getFraction(), n, i2);
                break;
              }
              int i3 = i1 + 1;
              i2 = i1;
              i1 = i3;
            }
            label418:
            PropertyValuesHolder localPropertyValuesHolder = PropertyValuesHolder.ofKeyframe(paramString, arrayOfKeyframe);
            if (i == 3) {
              localPropertyValuesHolder.setEvaluator(f.a());
            }
            return localPropertyValuesHolder;
            m = k;
          }
        }
      }
      return null;
      label453:
      localObject2 = localObject1;
      break label94;
      label460:
      localObject2 = localObject1;
      break label102;
      label467:
      localObject2 = localObject1;
    }
  }
  
  private static PropertyValuesHolder a(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    TypedValue localTypedValue1 = paramTypedArray.peekValue(paramInt2);
    int i;
    int j;
    label27:
    int k;
    label42:
    int m;
    label54:
    label87:
    int n;
    if (localTypedValue1 != null)
    {
      i = 1;
      if (i == 0) {
        break label213;
      }
      j = localTypedValue1.type;
      TypedValue localTypedValue2 = paramTypedArray.peekValue(paramInt3);
      if (localTypedValue2 == null) {
        break label219;
      }
      k = 1;
      if (k == 0) {
        break label225;
      }
      m = localTypedValue2.type;
      if (paramInt1 == 4)
      {
        if (((i == 0) || (!a(j))) && ((k == 0) || (!a(m)))) {
          break label231;
        }
        paramInt1 = 3;
      }
      if (paramInt1 != 0) {
        break label236;
      }
      n = 1;
    }
    b.b[] arrayOfb1;
    b.b[] arrayOfb2;
    a locala;
    label213:
    label219:
    label225:
    label231:
    label236:
    PropertyValuesHolder localPropertyValuesHolder;
    for (;;)
    {
      if (paramInt1 == 2)
      {
        String str1 = paramTypedArray.getString(paramInt2);
        String str2 = paramTypedArray.getString(paramInt3);
        arrayOfb1 = b.b(str1);
        arrayOfb2 = b.b(str2);
        if ((arrayOfb1 == null) && (arrayOfb2 == null)) {
          break label707;
        }
        if (arrayOfb1 != null)
        {
          locala = new a(null);
          if (arrayOfb2 != null)
          {
            if (!b.a(arrayOfb1, arrayOfb2))
            {
              throw new InflateException(" Can't morph from " + str1 + " to " + str2);
              i = 0;
              break;
              j = 0;
              break label27;
              k = 0;
              break label42;
              m = 0;
              break label54;
              paramInt1 = 0;
              break label87;
              n = 0;
              continue;
            }
            localPropertyValuesHolder = PropertyValuesHolder.ofObject(paramString, locala, new Object[] { arrayOfb1, arrayOfb2 });
          }
        }
      }
    }
    label420:
    label431:
    label705:
    for (;;)
    {
      return localPropertyValuesHolder;
      return PropertyValuesHolder.ofObject(paramString, locala, new Object[] { arrayOfb1 });
      if (arrayOfb2 == null) {
        break;
      }
      return PropertyValuesHolder.ofObject(paramString, new a(null), new Object[] { arrayOfb2 });
      f localf = null;
      if (paramInt1 == 3) {
        localf = f.a();
      }
      float f2;
      float f3;
      if (n != 0) {
        if (i != 0) {
          if (j == 5)
          {
            f2 = paramTypedArray.getDimension(paramInt2, 0.0F);
            if (k == 0) {
              break label431;
            }
            if (m != 5) {
              break label420;
            }
            f3 = paramTypedArray.getDimension(paramInt3, 0.0F);
            label369:
            localPropertyValuesHolder = PropertyValuesHolder.ofFloat(paramString, new float[] { f2, f3 });
          }
        }
      }
      for (;;)
      {
        if ((localPropertyValuesHolder == null) || (localf == null)) {
          break label705;
        }
        localPropertyValuesHolder.setEvaluator(localf);
        return localPropertyValuesHolder;
        f2 = paramTypedArray.getFloat(paramInt2, 0.0F);
        break;
        f3 = paramTypedArray.getFloat(paramInt3, 0.0F);
        break label369;
        localPropertyValuesHolder = PropertyValuesHolder.ofFloat(paramString, new float[] { f2 });
        continue;
        if (m == 5) {}
        for (float f1 = paramTypedArray.getDimension(paramInt3, 0.0F);; f1 = paramTypedArray.getFloat(paramInt3, 0.0F))
        {
          localPropertyValuesHolder = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
          break;
        }
        if (i != 0)
        {
          int i2;
          int i3;
          if (j == 5)
          {
            i2 = (int)paramTypedArray.getDimension(paramInt2, 0.0F);
            if (k == 0) {
              break label615;
            }
            if (m != 5) {
              break label585;
            }
            i3 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
          }
          for (;;)
          {
            localPropertyValuesHolder = PropertyValuesHolder.ofInt(paramString, new int[] { i2, i3 });
            break;
            if (a(j))
            {
              i2 = paramTypedArray.getColor(paramInt2, 0);
              break label512;
            }
            i2 = paramTypedArray.getInt(paramInt2, 0);
            break label512;
            label585:
            if (a(m)) {
              i3 = paramTypedArray.getColor(paramInt3, 0);
            } else {
              i3 = paramTypedArray.getInt(paramInt3, 0);
            }
          }
          label615:
          localPropertyValuesHolder = PropertyValuesHolder.ofInt(paramString, new int[] { i2 });
        }
        else
        {
          if (k != 0)
          {
            int i1;
            if (m == 5) {
              i1 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
            }
            for (;;)
            {
              localPropertyValuesHolder = PropertyValuesHolder.ofInt(paramString, new int[] { i1 });
              break;
              if (a(m)) {
                i1 = paramTypedArray.getColor(paramInt3, 0);
              } else {
                i1 = paramTypedArray.getInt(paramInt3, 0);
              }
            }
          }
          localPropertyValuesHolder = null;
        }
      }
    }
    label512:
    label707:
    return null;
  }
  
  private static ValueAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    TypedArray localTypedArray1 = c.a(paramResources, paramTheme, paramAttributeSet, a.g);
    TypedArray localTypedArray2 = c.a(paramResources, paramTheme, paramAttributeSet, a.k);
    if (paramValueAnimator == null) {
      paramValueAnimator = new ValueAnimator();
    }
    a(paramValueAnimator, localTypedArray1, localTypedArray2, paramFloat, paramXmlPullParser);
    int i = c.c(localTypedArray1, paramXmlPullParser, "interpolator", 0, 0);
    if (i > 0) {
      paramValueAnimator.setInterpolator(d.a(paramContext, i));
    }
    localTypedArray1.recycle();
    if (localTypedArray2 != null) {
      localTypedArray2.recycle();
    }
    return paramValueAnimator;
  }
  
  private static void a(ValueAnimator paramValueAnimator, TypedArray paramTypedArray, int paramInt, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    ObjectAnimator localObjectAnimator = (ObjectAnimator)paramValueAnimator;
    String str1 = c.a(paramTypedArray, paramXmlPullParser, "pathData", 1);
    if (str1 != null)
    {
      String str2 = c.a(paramTypedArray, paramXmlPullParser, "propertyXName", 2);
      String str3 = c.a(paramTypedArray, paramXmlPullParser, "propertyYName", 3);
      if (((paramInt == 2) || (paramInt != 4)) || ((str2 == null) && (str3 == null))) {
        throw new InflateException(paramTypedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
      }
      a(b.a(str1), localObjectAnimator, 0.5F * paramFloat, str2, str3);
      return;
    }
    localObjectAnimator.setPropertyName(c.a(paramTypedArray, paramXmlPullParser, "propertyName", 0));
  }
  
  private static void a(ValueAnimator paramValueAnimator, TypedArray paramTypedArray1, TypedArray paramTypedArray2, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    long l1 = c.a(paramTypedArray1, paramXmlPullParser, "duration", 1, 300);
    long l2 = c.a(paramTypedArray1, paramXmlPullParser, "startOffset", 2, 0);
    int i = c.a(paramTypedArray1, paramXmlPullParser, "valueType", 7, 4);
    if ((c.a(paramXmlPullParser, "valueFrom")) && (c.a(paramXmlPullParser, "valueTo")))
    {
      if (i == 4) {
        i = a(paramTypedArray1, 5, 6);
      }
      PropertyValuesHolder localPropertyValuesHolder = a(paramTypedArray1, i, 5, 6, "");
      if (localPropertyValuesHolder != null) {
        paramValueAnimator.setValues(new PropertyValuesHolder[] { localPropertyValuesHolder });
      }
    }
    paramValueAnimator.setDuration(l1);
    paramValueAnimator.setStartDelay(l2);
    paramValueAnimator.setRepeatCount(c.a(paramTypedArray1, paramXmlPullParser, "repeatCount", 3, 0));
    paramValueAnimator.setRepeatMode(c.a(paramTypedArray1, paramXmlPullParser, "repeatMode", 4, 1));
    if (paramTypedArray2 != null) {
      a(paramValueAnimator, paramTypedArray2, i, paramFloat, paramXmlPullParser);
    }
  }
  
  private static void a(Path paramPath, ObjectAnimator paramObjectAnimator, float paramFloat, String paramString1, String paramString2)
  {
    PathMeasure localPathMeasure1 = new PathMeasure(paramPath, false);
    float f1 = 0.0F;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Float.valueOf(0.0F));
    do
    {
      f1 += localPathMeasure1.getLength();
      localArrayList.add(Float.valueOf(f1));
    } while (localPathMeasure1.nextContour());
    PathMeasure localPathMeasure2 = new PathMeasure(paramPath, false);
    int i = Math.min(100, 1 + (int)(f1 / paramFloat));
    float[] arrayOfFloat1 = new float[i];
    float[] arrayOfFloat2 = new float[i];
    float[] arrayOfFloat3 = new float[2];
    int j = 0;
    float f2 = f1 / (i - 1);
    int k = 0;
    float f3 = 0.0F;
    float f4;
    int m;
    if (k < i)
    {
      localPathMeasure2.getPosTan(f3, arrayOfFloat3, null);
      arrayOfFloat1[k] = arrayOfFloat3[0];
      arrayOfFloat2[k] = arrayOfFloat3[1];
      f4 = f3 + f2;
      if ((j + 1 >= localArrayList.size()) || (f4 <= ((Float)localArrayList.get(j + 1)).floatValue())) {
        break label330;
      }
      f3 = f4 - ((Float)localArrayList.get(j + 1)).floatValue();
      m = j + 1;
      localPathMeasure2.nextContour();
    }
    for (;;)
    {
      k++;
      j = m;
      break;
      PropertyValuesHolder localPropertyValuesHolder1 = null;
      if (paramString1 != null) {
        localPropertyValuesHolder1 = PropertyValuesHolder.ofFloat(paramString1, arrayOfFloat1);
      }
      PropertyValuesHolder localPropertyValuesHolder2 = null;
      if (paramString2 != null) {
        localPropertyValuesHolder2 = PropertyValuesHolder.ofFloat(paramString2, arrayOfFloat2);
      }
      if (localPropertyValuesHolder1 == null)
      {
        paramObjectAnimator.setValues(new PropertyValuesHolder[] { localPropertyValuesHolder2 });
        return;
      }
      if (localPropertyValuesHolder2 == null)
      {
        paramObjectAnimator.setValues(new PropertyValuesHolder[] { localPropertyValuesHolder1 });
        return;
      }
      paramObjectAnimator.setValues(new PropertyValuesHolder[] { localPropertyValuesHolder1, localPropertyValuesHolder2 });
      return;
      label330:
      f3 = f4;
      m = j;
    }
  }
  
  private static void a(Keyframe[] paramArrayOfKeyframe, float paramFloat, int paramInt1, int paramInt2)
  {
    float f = paramFloat / (2 + (paramInt2 - paramInt1));
    while (paramInt1 <= paramInt2)
    {
      paramArrayOfKeyframe[paramInt1].setFraction(f + paramArrayOfKeyframe[(paramInt1 - 1)].getFraction());
      paramInt1++;
    }
  }
  
  private static boolean a(int paramInt)
  {
    return (paramInt >= 28) && (paramInt <= 31);
  }
  
  private static PropertyValuesHolder[] a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Object localObject1 = null;
    for (;;)
    {
      int i = paramXmlPullParser.getEventType();
      if ((i == 3) || (i == 1)) {
        break label167;
      }
      if (i == 2) {
        break;
      }
      paramXmlPullParser.next();
    }
    PropertyValuesHolder localPropertyValuesHolder1;
    PropertyValuesHolder localPropertyValuesHolder2;
    label121:
    Object localObject3;
    if (paramXmlPullParser.getName().equals("propertyValuesHolder"))
    {
      TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, a.i);
      String str = c.a(localTypedArray, paramXmlPullParser, "propertyName", 3);
      int m = c.a(localTypedArray, paramXmlPullParser, "valueType", 2, 4);
      localPropertyValuesHolder1 = a(paramContext, paramResources, paramTheme, paramXmlPullParser, str, m);
      if (localPropertyValuesHolder1 == null)
      {
        localPropertyValuesHolder2 = a(localTypedArray, m, 0, 1, str);
        if (localPropertyValuesHolder2 != null) {
          if (localObject1 == null)
          {
            localObject3 = new ArrayList();
            label140:
            ((ArrayList)localObject3).add(localPropertyValuesHolder2);
            label148:
            localTypedArray.recycle();
          }
        }
      }
    }
    for (;;)
    {
      paramXmlPullParser.next();
      localObject1 = localObject3;
      break;
      label167:
      Object localObject2 = null;
      if (localObject1 != null)
      {
        int j = localObject1.size();
        PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[j];
        for (int k = 0; k < j; k++) {
          arrayOfPropertyValuesHolder[k] = ((PropertyValuesHolder)localObject1.get(k));
        }
        localObject2 = arrayOfPropertyValuesHolder;
      }
      return localObject2;
      localObject3 = localObject1;
      break label140;
      localObject3 = localObject1;
      break label148;
      localPropertyValuesHolder2 = localPropertyValuesHolder1;
      break label121;
      localObject3 = localObject1;
    }
  }
  
  private static class a
    implements TypeEvaluator<b.b[]>
  {
    private b.b[] a;
    
    public b.b[] a(float paramFloat, b.b[] paramArrayOfb1, b.b[] paramArrayOfb2)
    {
      if (!b.a(paramArrayOfb1, paramArrayOfb2)) {
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
      }
      if ((this.a == null) || (!b.a(this.a, paramArrayOfb1))) {
        this.a = b.a(paramArrayOfb1);
      }
      for (int i = 0; i < paramArrayOfb1.length; i++) {
        this.a[i].a(paramArrayOfb1[i], paramArrayOfb2[i], paramFloat);
      }
      return this.a;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.c.a.e
 * JD-Core Version:    0.7.0.1
 */