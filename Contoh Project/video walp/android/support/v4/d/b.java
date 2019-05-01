package android.support.v4.d;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.a.h;
import android.support.v4.f.g;
import android.support.v4.f.l;
import android.support.v4.f.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b
{
  private static final g<String, Typeface> a = new g(16);
  private static final c b = new c("fonts", 10, 10000);
  private static final Object c = new Object();
  private static final m<String, ArrayList<c.a<c>>> d = new m();
  private static final Comparator<byte[]> e = new Comparator()
  {
    public int a(byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2)
    {
      int k;
      if (paramAnonymousArrayOfByte1.length != paramAnonymousArrayOfByte2.length)
      {
        k = paramAnonymousArrayOfByte1.length - paramAnonymousArrayOfByte2.length;
        return k;
      }
      for (int i = 0;; i++)
      {
        int j = paramAnonymousArrayOfByte1.length;
        k = 0;
        if (i >= j) {
          break;
        }
        if (paramAnonymousArrayOfByte1[i] != paramAnonymousArrayOfByte2[i]) {
          return paramAnonymousArrayOfByte1[i] - paramAnonymousArrayOfByte2[i];
        }
      }
    }
  };
  
  public static ProviderInfo a(PackageManager paramPackageManager, a parama, Resources paramResources)
  {
    String str = parama.a();
    ProviderInfo localProviderInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (localProviderInfo == null) {
      throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
    }
    if (!localProviderInfo.packageName.equals(parama.b())) {
      throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + parama.b());
    }
    List localList1 = a(paramPackageManager.getPackageInfo(localProviderInfo.packageName, 64).signatures);
    Collections.sort(localList1, e);
    List localList2 = a(parama, paramResources);
    for (int i = 0; i < localList2.size(); i++)
    {
      ArrayList localArrayList = new ArrayList((Collection)localList2.get(i));
      Collections.sort(localArrayList, e);
      if (a(localList1, localArrayList)) {
        return localProviderInfo;
      }
    }
    return null;
  }
  
  public static Typeface a(Context paramContext, final a parama, android.support.v4.content.a.b.a parama1, final Handler paramHandler, boolean paramBoolean, int paramInt1, final int paramInt2)
  {
    final String str = parama.f() + "-" + paramInt2;
    Typeface localTypeface1 = (Typeface)a.a(str);
    if (localTypeface1 != null)
    {
      if (parama1 != null) {
        parama1.a(localTypeface1);
      }
      return localTypeface1;
    }
    if ((paramBoolean) && (paramInt1 == -1))
    {
      c localc = b(paramContext, parama, paramInt2);
      if (parama1 != null)
      {
        if (localc.b != 0) {
          break label108;
        }
        parama1.a(localc.a, paramHandler);
      }
      for (;;)
      {
        return localc.a;
        label108:
        parama1.a(localc.b, paramHandler);
      }
    }
    Callable local1 = new Callable()
    {
      public b.c a()
      {
        b.c localc = b.a(this.a, parama, paramInt2);
        if (localc.a != null) {
          b.a().a(str, localc.a);
        }
        return localc;
      }
    };
    if (paramBoolean) {}
    try
    {
      Typeface localTypeface2 = ((c)b.a(local1, paramInt1)).a;
      return localTypeface2;
    }
    catch (InterruptedException localInterruptedException) {}
    if (parama1 == null) {}
    for (Object localObject1 = null;; localObject1 = new c.a()
        {
          public void a(b.c paramAnonymousc)
          {
            if (paramAnonymousc == null)
            {
              this.a.a(1, paramHandler);
              return;
            }
            if (paramAnonymousc.b == 0)
            {
              this.a.a(paramAnonymousc.a, paramHandler);
              return;
            }
            this.a.a(paramAnonymousc.b, paramHandler);
          }
        }) {
      synchronized (c)
      {
        if (!d.containsKey(str)) {
          break;
        }
        if (localObject1 != null) {
          ((ArrayList)d.get(str)).add(localObject1);
        }
        return null;
      }
    }
    if (localObject1 != null)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject1);
      d.put(str, localArrayList);
    }
    b.a(local1, new c.a()
    {
      public void a(b.c paramAnonymousc)
      {
        synchronized ()
        {
          ArrayList localArrayList = (ArrayList)b.c().get(this.a);
          if (localArrayList == null) {
            return;
          }
          b.c().remove(this.a);
          int i = 0;
          if (i < localArrayList.size())
          {
            ((c.a)localArrayList.get(i)).a(paramAnonymousc);
            i++;
          }
        }
      }
    });
    return null;
    return null;
  }
  
  public static a a(Context paramContext, CancellationSignal paramCancellationSignal, a parama)
  {
    ProviderInfo localProviderInfo = a(paramContext.getPackageManager(), parama, paramContext.getResources());
    if (localProviderInfo == null) {
      return new a(1, null);
    }
    return new a(0, a(paramContext, parama, localProviderInfo.authority, paramCancellationSignal));
  }
  
  private static List<List<byte[]>> a(a parama, Resources paramResources)
  {
    if (parama.d() != null) {
      return parama.d();
    }
    return android.support.v4.content.a.a.a(paramResources, parama.e());
  }
  
  private static List<byte[]> a(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfSignature.length; i++) {
      localArrayList.add(paramArrayOfSignature[i].toByteArray());
    }
    return localArrayList;
  }
  
  public static Map<Uri, ByteBuffer> a(Context paramContext, b[] paramArrayOfb, CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayOfb.length;
    int j = 0;
    if (j < i)
    {
      b localb = paramArrayOfb[j];
      if (localb.e() != 0) {}
      for (;;)
      {
        j++;
        break;
        Uri localUri = localb.a();
        if (!localHashMap.containsKey(localUri)) {
          localHashMap.put(localUri, h.a(paramContext, paramCancellationSignal, localUri));
        }
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  private static boolean a(List<byte[]> paramList1, List<byte[]> paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    for (int i = 0;; i++)
    {
      if (i >= paramList1.size()) {
        break label61;
      }
      if (!Arrays.equals((byte[])paramList1.get(i), (byte[])paramList2.get(i))) {
        break;
      }
    }
    label61:
    return true;
  }
  
  static b[] a(Context paramContext, a parama, String paramString, CancellationSignal paramCancellationSignal)
  {
    ArrayList localArrayList1 = new ArrayList();
    Uri localUri1 = new Uri.Builder().scheme("content").authority(paramString).build();
    Uri localUri2 = new Uri.Builder().scheme("content").authority(paramString).appendPath("file").build();
    for (;;)
    {
      try
      {
        if (Build.VERSION.SDK_INT <= 16) {
          continue;
        }
        ContentResolver localContentResolver2 = paramContext.getContentResolver();
        String[] arrayOfString3 = { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" };
        String[] arrayOfString4 = new String[1];
        arrayOfString4[0] = parama.c();
        Cursor localCursor2 = localContentResolver2.query(localUri1, arrayOfString3, "query = ?", arrayOfString4, null, paramCancellationSignal);
        localObject4 = localCursor2;
        if (localObject4 == null) {
          continue;
        }
        try
        {
          if (((Cursor)localObject4).getCount() <= 0) {
            continue;
          }
          int i = ((Cursor)localObject4).getColumnIndex("result_code");
          localArrayList2 = new ArrayList();
          int j = ((Cursor)localObject4).getColumnIndex("_id");
          k = ((Cursor)localObject4).getColumnIndex("file_id");
          int m = ((Cursor)localObject4).getColumnIndex("font_ttc_index");
          int n = ((Cursor)localObject4).getColumnIndex("font_weight");
          int i1 = ((Cursor)localObject4).getColumnIndex("font_italic");
          if (!((Cursor)localObject4).moveToNext()) {
            continue;
          }
          if (i == -1) {
            continue;
          }
          i2 = ((Cursor)localObject4).getInt(i);
          if (m == -1) {
            continue;
          }
          i3 = ((Cursor)localObject4).getInt(m);
          if (k != -1) {
            continue;
          }
          localObject5 = ContentUris.withAppendedId(localUri1, ((Cursor)localObject4).getLong(j));
          if (n == -1) {
            continue;
          }
          i4 = ((Cursor)localObject4).getInt(n);
          if ((i1 == -1) || (((Cursor)localObject4).getInt(i1) != 1)) {
            continue;
          }
          bool = true;
          localArrayList2.add(new b((Uri)localObject5, i3, i4, bool, i2));
          continue;
          if (localObject3 == null) {
            continue;
          }
        }
        finally
        {
          localObject3 = localObject4;
        }
      }
      finally
      {
        Object localObject4;
        ArrayList localArrayList2;
        int k;
        int i2;
        int i3;
        Object localObject5;
        int i4;
        boolean bool;
        ContentResolver localContentResolver1;
        String[] arrayOfString1;
        String[] arrayOfString2;
        Cursor localCursor1;
        Uri localUri3;
        Object localObject3 = null;
        continue;
      }
      localObject3.close();
      throw localObject1;
      localContentResolver1 = paramContext.getContentResolver();
      arrayOfString1 = new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" };
      arrayOfString2 = new String[1];
      arrayOfString2[0] = parama.c();
      localCursor1 = localContentResolver1.query(localUri1, arrayOfString1, "query = ?", arrayOfString2, null);
      localObject4 = localCursor1;
      continue;
      i2 = 0;
      continue;
      i3 = 0;
      continue;
      localUri3 = ContentUris.withAppendedId(localUri2, ((Cursor)localObject4).getLong(k));
      localObject5 = localUri3;
      continue;
      i4 = 400;
      continue;
      bool = false;
    }
    localArrayList2 = localArrayList1;
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    return (b[])localArrayList2.toArray(new b[0]);
  }
  
  private static c b(Context paramContext, a parama, int paramInt)
  {
    int i = -3;
    a locala;
    try
    {
      locala = a(paramContext, null, parama);
      if (locala.a() == 0)
      {
        Typeface localTypeface = android.support.v4.a.c.a(paramContext, null, locala.b(), paramInt);
        if (localTypeface != null) {
          i = 0;
        }
        return new c(localTypeface, i);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return new c(null, -1);
    }
    if (locala.a() == 1) {
      i = -2;
    }
    return new c(null, i);
  }
  
  public static class a
  {
    private final int a;
    private final b.b[] b;
    
    public a(int paramInt, b.b[] paramArrayOfb)
    {
      this.a = paramInt;
      this.b = paramArrayOfb;
    }
    
    public int a()
    {
      return this.a;
    }
    
    public b.b[] b()
    {
      return this.b;
    }
  }
  
  public static class b
  {
    private final Uri a;
    private final int b;
    private final int c;
    private final boolean d;
    private final int e;
    
    public b(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.a = ((Uri)l.a(paramUri));
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramBoolean;
      this.e = paramInt3;
    }
    
    public Uri a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.b;
    }
    
    public int c()
    {
      return this.c;
    }
    
    public boolean d()
    {
      return this.d;
    }
    
    public int e()
    {
      return this.e;
    }
  }
  
  private static final class c
  {
    final Typeface a;
    final int b;
    
    c(Typeface paramTypeface, int paramInt)
    {
      this.a = paramTypeface;
      this.b = paramInt;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.b
 * JD-Core Version:    0.7.0.1
 */