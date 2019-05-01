package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel
  extends DataSetObservable
{
  static final String a = ActivityChooserModel.class.getSimpleName();
  private static final Object e = new Object();
  private static final Map<String, ActivityChooserModel> f = new HashMap();
  final Context b;
  final String c;
  boolean d = true;
  private final Object g = new Object();
  private final List<ActivityResolveInfo> h = new ArrayList();
  private final List<HistoricalRecord> i = new ArrayList();
  private Intent j;
  private ActivitySorter k = new a();
  private int l = 50;
  private boolean m = false;
  private boolean n = true;
  private boolean o = false;
  private OnChooseActivityListener p;
  
  private ActivityChooserModel(Context paramContext, String paramString)
  {
    this.b = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml")))
    {
      this.c = (paramString + ".xml");
      return;
    }
    this.c = paramString;
  }
  
  public static ActivityChooserModel a(Context paramContext, String paramString)
  {
    synchronized (e)
    {
      ActivityChooserModel localActivityChooserModel = (ActivityChooserModel)f.get(paramString);
      if (localActivityChooserModel == null)
      {
        localActivityChooserModel = new ActivityChooserModel(paramContext, paramString);
        f.put(paramString, localActivityChooserModel);
      }
      return localActivityChooserModel;
    }
  }
  
  private boolean a(HistoricalRecord paramHistoricalRecord)
  {
    boolean bool = this.i.add(paramHistoricalRecord);
    if (bool)
    {
      this.n = true;
      i();
      d();
      f();
      notifyChanged();
    }
    return bool;
  }
  
  private void d()
  {
    if (!this.m) {
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    }
    if (!this.n) {}
    do
    {
      return;
      this.n = false;
    } while (TextUtils.isEmpty(this.c));
    b localb = new b();
    Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = new ArrayList(this.i);
    arrayOfObject[1] = this.c;
    localb.executeOnExecutor(localExecutor, arrayOfObject);
  }
  
  private void e()
  {
    boolean bool = g() | h();
    i();
    if (bool)
    {
      f();
      notifyChanged();
    }
  }
  
  private boolean f()
  {
    if ((this.k != null) && (this.j != null) && (!this.h.isEmpty()) && (!this.i.isEmpty()))
    {
      this.k.sort(this.j, this.h, Collections.unmodifiableList(this.i));
      return true;
    }
    return false;
  }
  
  private boolean g()
  {
    boolean bool1 = this.o;
    boolean bool2 = false;
    if (bool1)
    {
      Intent localIntent = this.j;
      bool2 = false;
      if (localIntent != null)
      {
        this.o = false;
        this.h.clear();
        List localList = this.b.getPackageManager().queryIntentActivities(this.j, 0);
        int i1 = localList.size();
        for (int i2 = 0; i2 < i1; i2++)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i2);
          this.h.add(new ActivityResolveInfo(localResolveInfo));
        }
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private boolean h()
  {
    if ((this.d) && (this.n) && (!TextUtils.isEmpty(this.c)))
    {
      this.d = false;
      this.m = true;
      j();
      return true;
    }
    return false;
  }
  
  private void i()
  {
    int i1 = this.i.size() - this.l;
    if (i1 <= 0) {}
    for (;;)
    {
      return;
      this.n = true;
      for (int i2 = 0; i2 < i1; i2++) {
        ((HistoricalRecord)this.i.remove(0));
      }
    }
  }
  
  /* Error */
  private void j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 89	android/support/v7/widget/ActivityChooserModel:b	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 115	android/support/v7/widget/ActivityChooserModel:c	Ljava/lang/String;
    //   8: invokevirtual 234	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 240	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 11
    //   17: aload 11
    //   19: aload_2
    //   20: ldc 242
    //   22: invokeinterface 248 3 0
    //   27: iconst_0
    //   28: istore 12
    //   30: iload 12
    //   32: iconst_1
    //   33: if_icmpeq +21 -> 54
    //   36: iload 12
    //   38: iconst_2
    //   39: if_icmpeq +15 -> 54
    //   42: aload 11
    //   44: invokeinterface 251 1 0
    //   49: istore 12
    //   51: goto -21 -> 30
    //   54: ldc 253
    //   56: aload 11
    //   58: invokeinterface 256 1 0
    //   63: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   66: ifne +57 -> 123
    //   69: new 228	org/xmlpull/v1/XmlPullParserException
    //   72: dup
    //   73: ldc_w 261
    //   76: invokespecial 262	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   79: athrow
    //   80: astore 8
    //   82: getstatic 43	android/support/v7/widget/ActivityChooserModel:a	Ljava/lang/String;
    //   85: new 105	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   92: ldc_w 264
    //   95: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: aload_0
    //   99: getfield 115	android/support/v7/widget/ActivityChooserModel:c	Ljava/lang/String;
    //   102: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: aload 8
    //   110: invokestatic 269	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   113: pop
    //   114: aload_2
    //   115: ifnull +7 -> 122
    //   118: aload_2
    //   119: invokevirtual 274	java/io/FileInputStream:close	()V
    //   122: return
    //   123: aload_0
    //   124: getfield 66	android/support/v7/widget/ActivityChooserModel:i	Ljava/util/List;
    //   127: astore 13
    //   129: aload 13
    //   131: invokeinterface 193 1 0
    //   136: aload 11
    //   138: invokeinterface 251 1 0
    //   143: istore 14
    //   145: iload 14
    //   147: iconst_1
    //   148: if_icmpne +15 -> 163
    //   151: aload_2
    //   152: ifnull -30 -> 122
    //   155: aload_2
    //   156: invokevirtual 274	java/io/FileInputStream:close	()V
    //   159: return
    //   160: astore 16
    //   162: return
    //   163: iload 14
    //   165: iconst_3
    //   166: if_icmpeq -30 -> 136
    //   169: iload 14
    //   171: iconst_4
    //   172: if_icmpeq -36 -> 136
    //   175: ldc_w 276
    //   178: aload 11
    //   180: invokeinterface 256 1 0
    //   185: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   188: ifne +60 -> 248
    //   191: new 228	org/xmlpull/v1/XmlPullParserException
    //   194: dup
    //   195: ldc_w 278
    //   198: invokespecial 262	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   201: athrow
    //   202: astore 5
    //   204: getstatic 43	android/support/v7/widget/ActivityChooserModel:a	Ljava/lang/String;
    //   207: new 105	java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   214: ldc_w 264
    //   217: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload_0
    //   221: getfield 115	android/support/v7/widget/ActivityChooserModel:c	Ljava/lang/String;
    //   224: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: aload 5
    //   232: invokestatic 269	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   235: pop
    //   236: aload_2
    //   237: ifnull -115 -> 122
    //   240: aload_2
    //   241: invokevirtual 274	java/io/FileInputStream:close	()V
    //   244: return
    //   245: astore 7
    //   247: return
    //   248: aload 13
    //   250: new 224	android/support/v7/widget/ActivityChooserModel$HistoricalRecord
    //   253: dup
    //   254: aload 11
    //   256: aconst_null
    //   257: ldc_w 280
    //   260: invokeinterface 284 3 0
    //   265: aload 11
    //   267: aconst_null
    //   268: ldc_w 286
    //   271: invokeinterface 284 3 0
    //   276: invokestatic 292	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   279: aload 11
    //   281: aconst_null
    //   282: ldc_w 294
    //   285: invokeinterface 284 3 0
    //   290: invokestatic 300	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   293: invokespecial 303	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   296: invokeinterface 135 2 0
    //   301: pop
    //   302: goto -166 -> 136
    //   305: astore_3
    //   306: aload_2
    //   307: ifnull +7 -> 314
    //   310: aload_2
    //   311: invokevirtual 274	java/io/FileInputStream:close	()V
    //   314: aload_3
    //   315: athrow
    //   316: astore 10
    //   318: return
    //   319: astore 4
    //   321: goto -7 -> 314
    //   324: astore_1
    //   325: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	326	0	this	ActivityChooserModel
    //   324	1	1	localFileNotFoundException	FileNotFoundException
    //   11	300	2	localFileInputStream	java.io.FileInputStream
    //   305	10	3	localObject	Object
    //   319	1	4	localIOException1	IOException
    //   202	29	5	localIOException2	IOException
    //   245	1	7	localIOException3	IOException
    //   80	29	8	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   316	1	10	localIOException4	IOException
    //   15	265	11	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   28	22	12	i1	int
    //   127	122	13	localList	List
    //   143	30	14	i2	int
    //   160	1	16	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   12	27	80	org/xmlpull/v1/XmlPullParserException
    //   42	51	80	org/xmlpull/v1/XmlPullParserException
    //   54	80	80	org/xmlpull/v1/XmlPullParserException
    //   123	136	80	org/xmlpull/v1/XmlPullParserException
    //   136	145	80	org/xmlpull/v1/XmlPullParserException
    //   175	202	80	org/xmlpull/v1/XmlPullParserException
    //   248	302	80	org/xmlpull/v1/XmlPullParserException
    //   155	159	160	java/io/IOException
    //   12	27	202	java/io/IOException
    //   42	51	202	java/io/IOException
    //   54	80	202	java/io/IOException
    //   123	136	202	java/io/IOException
    //   136	145	202	java/io/IOException
    //   175	202	202	java/io/IOException
    //   248	302	202	java/io/IOException
    //   240	244	245	java/io/IOException
    //   12	27	305	finally
    //   42	51	305	finally
    //   54	80	305	finally
    //   82	114	305	finally
    //   123	136	305	finally
    //   136	145	305	finally
    //   175	202	305	finally
    //   204	236	305	finally
    //   248	302	305	finally
    //   118	122	316	java/io/IOException
    //   310	314	319	java/io/IOException
    //   0	12	324	java/io/FileNotFoundException
  }
  
  public int a()
  {
    synchronized (this.g)
    {
      e();
      int i1 = this.h.size();
      return i1;
    }
  }
  
  public int a(ResolveInfo paramResolveInfo)
  {
    for (;;)
    {
      int i2;
      synchronized (this.g)
      {
        e();
        List localList = this.h;
        int i1 = localList.size();
        i2 = 0;
        if (i2 < i1)
        {
          if (((ActivityResolveInfo)localList.get(i2)).resolveInfo == paramResolveInfo) {
            return i2;
          }
        }
        else {
          return -1;
        }
      }
      i2++;
    }
  }
  
  public ResolveInfo a(int paramInt)
  {
    synchronized (this.g)
    {
      e();
      ResolveInfo localResolveInfo = ((ActivityResolveInfo)this.h.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }
  
  public void a(Intent paramIntent)
  {
    synchronized (this.g)
    {
      if (this.j == paramIntent) {
        return;
      }
      this.j = paramIntent;
      this.o = true;
      e();
      return;
    }
  }
  
  public void a(OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (this.g)
    {
      this.p = paramOnChooseActivityListener;
      return;
    }
  }
  
  public Intent b(int paramInt)
  {
    synchronized (this.g)
    {
      if (this.j == null) {
        return null;
      }
      e();
      ActivityResolveInfo localActivityResolveInfo = (ActivityResolveInfo)this.h.get(paramInt);
      ComponentName localComponentName = new ComponentName(localActivityResolveInfo.resolveInfo.activityInfo.packageName, localActivityResolveInfo.resolveInfo.activityInfo.name);
      Intent localIntent1 = new Intent(this.j);
      localIntent1.setComponent(localComponentName);
      if (this.p != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (this.p.onChooseActivity(this, localIntent2)) {
          return null;
        }
      }
      a(new HistoricalRecord(localComponentName, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }
  
  public ResolveInfo b()
  {
    synchronized (this.g)
    {
      e();
      if (!this.h.isEmpty())
      {
        ResolveInfo localResolveInfo = ((ActivityResolveInfo)this.h.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  public int c()
  {
    synchronized (this.g)
    {
      e();
      int i1 = this.i.size();
      return i1;
    }
  }
  
  public void c(int paramInt)
  {
    for (;;)
    {
      synchronized (this.g)
      {
        e();
        ActivityResolveInfo localActivityResolveInfo1 = (ActivityResolveInfo)this.h.get(paramInt);
        ActivityResolveInfo localActivityResolveInfo2 = (ActivityResolveInfo)this.h.get(0);
        if (localActivityResolveInfo2 != null)
        {
          f1 = 5.0F + (localActivityResolveInfo2.weight - localActivityResolveInfo1.weight);
          a(new HistoricalRecord(new ComponentName(localActivityResolveInfo1.resolveInfo.activityInfo.packageName, localActivityResolveInfo1.resolveInfo.activityInfo.name), System.currentTimeMillis(), f1));
          return;
        }
      }
      float f1 = 1.0F;
    }
  }
  
  public static abstract interface ActivityChooserModelClient
  {
    public abstract void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel);
  }
  
  public static final class ActivityResolveInfo
    implements Comparable<ActivityResolveInfo>
  {
    public final ResolveInfo resolveInfo;
    public float weight;
    
    public ActivityResolveInfo(ResolveInfo paramResolveInfo)
    {
      this.resolveInfo = paramResolveInfo;
    }
    
    public int compareTo(ActivityResolveInfo paramActivityResolveInfo)
    {
      return Float.floatToIntBits(paramActivityResolveInfo.weight) - Float.floatToIntBits(this.weight);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      ActivityResolveInfo localActivityResolveInfo;
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        localActivityResolveInfo = (ActivityResolveInfo)paramObject;
      } while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(localActivityResolveInfo.weight));
      return false;
    }
    
    public int hashCode()
    {
      return 31 + Float.floatToIntBits(this.weight);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("resolveInfo:").append(this.resolveInfo.toString());
      localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface ActivitySorter
  {
    public abstract void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1);
  }
  
  public static final class HistoricalRecord
  {
    public final ComponentName activity;
    public final long time;
    public final float weight;
    
    public HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
    {
      this.activity = paramComponentName;
      this.time = paramLong;
      this.weight = paramFloat;
    }
    
    public HistoricalRecord(String paramString, long paramLong, float paramFloat)
    {
      this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      HistoricalRecord localHistoricalRecord;
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        localHistoricalRecord = (HistoricalRecord)paramObject;
        if (this.activity == null)
        {
          if (localHistoricalRecord.activity != null) {
            return false;
          }
        }
        else if (!this.activity.equals(localHistoricalRecord.activity)) {
          return false;
        }
        if (this.time != localHistoricalRecord.time) {
          return false;
        }
      } while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(localHistoricalRecord.weight));
      return false;
    }
    
    public int hashCode()
    {
      if (this.activity == null) {}
      for (int i = 0;; i = this.activity.hashCode()) {
        return 31 * (31 * (i + 31) + (int)(this.time ^ this.time >>> 32)) + Float.floatToIntBits(this.weight);
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("; activity:").append(this.activity);
      localStringBuilder.append("; time:").append(this.time);
      localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface OnChooseActivityListener
  {
    public abstract boolean onChooseActivity(ActivityChooserModel paramActivityChooserModel, Intent paramIntent);
  }
  
  private static final class a
    implements ActivityChooserModel.ActivitySorter
  {
    private final Map<ComponentName, ActivityChooserModel.ActivityResolveInfo> a = new HashMap();
    
    public void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1)
    {
      Map localMap = this.a;
      localMap.clear();
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo2 = (ActivityChooserModel.ActivityResolveInfo)paramList.get(j);
        localActivityResolveInfo2.weight = 0.0F;
        localMap.put(new ComponentName(localActivityResolveInfo2.resolveInfo.activityInfo.packageName, localActivityResolveInfo2.resolveInfo.activityInfo.name), localActivityResolveInfo2);
      }
      int k = -1 + paramList1.size();
      float f1 = 1.0F;
      int m = k;
      if (m >= 0)
      {
        ActivityChooserModel.HistoricalRecord localHistoricalRecord = (ActivityChooserModel.HistoricalRecord)paramList1.get(m);
        ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo1 = (ActivityChooserModel.ActivityResolveInfo)localMap.get(localHistoricalRecord.activity);
        if (localActivityResolveInfo1 == null) {
          break label193;
        }
        localActivityResolveInfo1.weight += f1 * localHistoricalRecord.weight;
      }
      label193:
      for (float f2 = 0.95F * f1;; f2 = f1)
      {
        m--;
        f1 = f2;
        break;
        Collections.sort(paramList);
        return;
      }
    }
  }
  
  private final class b
    extends AsyncTask<Object, Void, Void>
  {
    b() {}
    
    public Void a(Object... paramVarArgs)
    {
      int i = 0;
      List localList = (List)paramVarArgs[0];
      String str = (String)paramVarArgs[1];
      FileOutputStream localFileOutputStream;
      for (;;)
      {
        try
        {
          localFileOutputStream = ActivityChooserModel.this.b.openFileOutput(str, 0);
          localXmlSerializer = Xml.newSerializer();
          int j;
          ActivityChooserModel.HistoricalRecord localHistoricalRecord;
          localXmlSerializer.endTag(null, "historical-records");
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          try
          {
            localXmlSerializer.setOutput(localFileOutputStream, null);
            localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
            localXmlSerializer.startTag(null, "historical-records");
            j = localList.size();
            if (i >= j) {
              break label215;
            }
            localHistoricalRecord = (ActivityChooserModel.HistoricalRecord)localList.remove(0);
            localXmlSerializer.startTag(null, "historical-record");
            localXmlSerializer.attribute(null, "activity", localHistoricalRecord.activity.flattenToString());
            localXmlSerializer.attribute(null, "time", String.valueOf(localHistoricalRecord.time));
            localXmlSerializer.attribute(null, "weight", String.valueOf(localHistoricalRecord.weight));
            localXmlSerializer.endTag(null, "historical-record");
            i++;
            continue;
            localFileNotFoundException = localFileNotFoundException;
            Log.e(ActivityChooserModel.a, "Error writing historical record file: " + str, localFileNotFoundException);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            XmlSerializer localXmlSerializer;
            Log.e(ActivityChooserModel.a, "Error writing historical record file: " + ActivityChooserModel.this.c, localIllegalArgumentException);
            ActivityChooserModel.this.d = true;
            if (localFileOutputStream == null) {
              continue;
            }
            try
            {
              localFileOutputStream.close();
              return null;
            }
            catch (IOException localIOException5)
            {
              return null;
            }
          }
          catch (IllegalStateException localIllegalStateException)
          {
            Log.e(ActivityChooserModel.a, "Error writing historical record file: " + ActivityChooserModel.this.c, localIllegalStateException);
            ActivityChooserModel.this.d = true;
            if (localFileOutputStream == null) {
              continue;
            }
            try
            {
              localFileOutputStream.close();
              return null;
            }
            catch (IOException localIOException4)
            {
              return null;
            }
          }
          catch (IOException localIOException2)
          {
            Log.e(ActivityChooserModel.a, "Error writing historical record file: " + ActivityChooserModel.this.c, localIOException2);
            ActivityChooserModel.this.d = true;
            if (localFileOutputStream == null) {
              continue;
            }
            try
            {
              localFileOutputStream.close();
              return null;
            }
            catch (IOException localIOException3)
            {
              return null;
            }
          }
          finally
          {
            ActivityChooserModel.this.d = true;
            if (localFileOutputStream == null) {
              break label457;
            }
          }
          return null;
        }
        label215:
        localXmlSerializer.endDocument();
        ActivityChooserModel.this.d = true;
        if (localFileOutputStream != null) {
          try
          {
            localFileOutputStream.close();
            return null;
          }
          catch (IOException localIOException6)
          {
            return null;
          }
        }
      }
      try
      {
        localFileOutputStream.close();
        label457:
        throw localObject;
      }
      catch (IOException localIOException1)
      {
        break label457;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserModel
 * JD-Core Version:    0.7.0.1
 */