package android.support.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class d
{
  /* Error */
  public static Interpolator a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: getstatic 16	android/os/Build$VERSION:SDK_INT	I
    //   3: bipush 21
    //   5: if_icmplt +13 -> 18
    //   8: aload_0
    //   9: iload_1
    //   10: invokestatic 21	android/view/animation/AnimationUtils:loadInterpolator	(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    //   13: astore 11
    //   15: aload 11
    //   17: areturn
    //   18: aconst_null
    //   19: astore_2
    //   20: iload_1
    //   21: ldc 22
    //   23: if_icmpne +25 -> 48
    //   26: new 24	android/support/v4/view/b/a
    //   29: dup
    //   30: invokespecial 28	android/support/v4/view/b/a:<init>	()V
    //   33: astore 11
    //   35: iconst_0
    //   36: ifeq -21 -> 15
    //   39: aconst_null
    //   40: invokeinterface 33 1 0
    //   45: aload 11
    //   47: areturn
    //   48: iload_1
    //   49: ldc 34
    //   51: if_icmpne +25 -> 76
    //   54: new 36	android/support/v4/view/b/b
    //   57: dup
    //   58: invokespecial 37	android/support/v4/view/b/b:<init>	()V
    //   61: astore 11
    //   63: iconst_0
    //   64: ifeq -49 -> 15
    //   67: aconst_null
    //   68: invokeinterface 33 1 0
    //   73: aload 11
    //   75: areturn
    //   76: iload_1
    //   77: ldc 38
    //   79: if_icmpne +25 -> 104
    //   82: new 40	android/support/v4/view/b/c
    //   85: dup
    //   86: invokespecial 41	android/support/v4/view/b/c:<init>	()V
    //   89: astore 11
    //   91: iconst_0
    //   92: ifeq -77 -> 15
    //   95: aconst_null
    //   96: invokeinterface 33 1 0
    //   101: aload 11
    //   103: areturn
    //   104: aload_0
    //   105: invokevirtual 47	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   108: iload_1
    //   109: invokevirtual 53	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   112: astore_2
    //   113: aload_0
    //   114: aload_0
    //   115: invokevirtual 47	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   118: aload_0
    //   119: invokevirtual 57	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   122: aload_2
    //   123: invokestatic 60	android/support/c/a/d:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;
    //   126: astore 10
    //   128: aload 10
    //   130: astore 11
    //   132: aload_2
    //   133: ifnull -118 -> 15
    //   136: aload_2
    //   137: invokeinterface 33 1 0
    //   142: aload 11
    //   144: areturn
    //   145: astore 7
    //   147: new 62	android/content/res/Resources$NotFoundException
    //   150: dup
    //   151: new 64	java/lang/StringBuilder
    //   154: dup
    //   155: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   158: ldc 67
    //   160: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: iload_1
    //   164: invokestatic 77	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   167: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokespecial 84	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   176: astore 8
    //   178: aload 8
    //   180: aload 7
    //   182: invokevirtual 88	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   185: pop
    //   186: aload 8
    //   188: athrow
    //   189: astore 6
    //   191: aload_2
    //   192: ifnull +9 -> 201
    //   195: aload_2
    //   196: invokeinterface 33 1 0
    //   201: aload 6
    //   203: athrow
    //   204: astore_3
    //   205: new 62	android/content/res/Resources$NotFoundException
    //   208: dup
    //   209: new 64	java/lang/StringBuilder
    //   212: dup
    //   213: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   216: ldc 67
    //   218: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: iload_1
    //   222: invokestatic 77	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   225: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: invokespecial 84	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   234: astore 4
    //   236: aload 4
    //   238: aload_3
    //   239: invokevirtual 88	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: pop
    //   243: aload 4
    //   245: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	paramContext	Context
    //   0	246	1	paramInt	int
    //   19	177	2	localXmlResourceParser	android.content.res.XmlResourceParser
    //   204	35	3	localIOException	java.io.IOException
    //   234	10	4	localNotFoundException1	android.content.res.Resources.NotFoundException
    //   189	13	6	localObject1	Object
    //   145	36	7	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   176	11	8	localNotFoundException2	android.content.res.Resources.NotFoundException
    //   126	3	10	localInterpolator	Interpolator
    //   13	130	11	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   26	35	145	org/xmlpull/v1/XmlPullParserException
    //   54	63	145	org/xmlpull/v1/XmlPullParserException
    //   82	91	145	org/xmlpull/v1/XmlPullParserException
    //   104	128	145	org/xmlpull/v1/XmlPullParserException
    //   26	35	189	finally
    //   54	63	189	finally
    //   82	91	189	finally
    //   104	128	189	finally
    //   147	189	189	finally
    //   205	246	189	finally
    //   26	35	204	java/io/IOException
    //   54	63	204	java/io/IOException
    //   82	91	204	java/io/IOException
    //   104	128	204	java/io/IOException
  }
  
  private static Interpolator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = null;
    int i = paramXmlPullParser.getDepth();
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        break label336;
      }
      if (j == 2)
      {
        AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
        String str = paramXmlPullParser.getName();
        if (str.equals("linearInterpolator"))
        {
          localObject = new LinearInterpolator();
        }
        else if (str.equals("accelerateInterpolator"))
        {
          localObject = new AccelerateInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("decelerateInterpolator"))
        {
          localObject = new DecelerateInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("accelerateDecelerateInterpolator"))
        {
          localObject = new AccelerateDecelerateInterpolator();
        }
        else if (str.equals("cycleInterpolator"))
        {
          localObject = new CycleInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("anticipateInterpolator"))
        {
          localObject = new AnticipateInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("overshootInterpolator"))
        {
          localObject = new OvershootInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("anticipateOvershootInterpolator"))
        {
          localObject = new AnticipateOvershootInterpolator(paramContext, localAttributeSet);
        }
        else if (str.equals("bounceInterpolator"))
        {
          localObject = new BounceInterpolator();
        }
        else
        {
          if (!str.equals("pathInterpolator")) {
            break;
          }
          localObject = new g(paramContext, localAttributeSet, paramXmlPullParser);
        }
      }
    }
    throw new RuntimeException("Unknown interpolator name: " + paramXmlPullParser.getName());
    label336:
    return localObject;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.c.a.d
 * JD-Core Version:    0.7.0.1
 */