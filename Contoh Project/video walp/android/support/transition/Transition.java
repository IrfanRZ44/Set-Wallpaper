package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.a.c;
import android.support.v4.f.f;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public abstract class Transition
  implements Cloneable
{
  private static final int[] g = { 2, 1, 3, 4 };
  private static final PathMotion h = new PathMotion()
  {
    public Path a(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      Path localPath = new Path();
      localPath.moveTo(paramAnonymousFloat1, paramAnonymousFloat2);
      localPath.lineTo(paramAnonymousFloat3, paramAnonymousFloat4);
      return localPath;
    }
  };
  private static ThreadLocal<android.support.v4.f.a<Animator, a>> z = new ThreadLocal();
  private ViewGroup A = null;
  private ArrayList<Animator> B = new ArrayList();
  private int C = 0;
  private boolean D = false;
  private boolean E = false;
  private ArrayList<c> F = null;
  private ArrayList<Animator> G = new ArrayList();
  private b H;
  private android.support.v4.f.a<String, String> I;
  private PathMotion J = h;
  long a = -1L;
  ArrayList<Integer> b = new ArrayList();
  ArrayList<View> c = new ArrayList();
  TransitionSet d = null;
  boolean e = false;
  af f;
  private String i = getClass().getName();
  private long j = -1L;
  private TimeInterpolator k = null;
  private ArrayList<String> l = null;
  private ArrayList<Class> m = null;
  private ArrayList<Integer> n = null;
  private ArrayList<View> o = null;
  private ArrayList<Class> p = null;
  private ArrayList<String> q = null;
  private ArrayList<Integer> r = null;
  private ArrayList<View> s = null;
  private ArrayList<Class> t = null;
  private ai u = new ai();
  private ai v = new ai();
  private int[] w = g;
  private ArrayList<ah> x;
  private ArrayList<ah> y;
  
  public Transition() {}
  
  public Transition(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.c);
    XmlResourceParser localXmlResourceParser = (XmlResourceParser)paramAttributeSet;
    long l1 = c.a(localTypedArray, localXmlResourceParser, "duration", 1, -1);
    if (l1 >= 0L) {
      a(l1);
    }
    long l2 = c.a(localTypedArray, localXmlResourceParser, "startDelay", 2, -1);
    if (l2 > 0L) {
      b(l2);
    }
    int i1 = c.c(localTypedArray, localXmlResourceParser, "interpolator", 0, 0);
    if (i1 > 0) {
      a(AnimationUtils.loadInterpolator(paramContext, i1));
    }
    String str = c.a(localTypedArray, localXmlResourceParser, "matchOrder", 3);
    if (str != null) {
      a(b(str));
    }
    localTypedArray.recycle();
  }
  
  private void a(Animator paramAnimator, final android.support.v4.f.a<Animator, a> parama)
  {
    if (paramAnimator != null)
    {
      paramAnimator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          parama.remove(paramAnonymousAnimator);
          Transition.a(Transition.this).remove(paramAnonymousAnimator);
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          Transition.a(Transition.this).add(paramAnonymousAnimator);
        }
      });
      a(paramAnimator);
    }
  }
  
  private void a(ai paramai1, ai paramai2)
  {
    android.support.v4.f.a locala1 = new android.support.v4.f.a(paramai1.a);
    android.support.v4.f.a locala2 = new android.support.v4.f.a(paramai2.a);
    int i1 = 0;
    if (i1 < this.w.length)
    {
      switch (this.w[i1])
      {
      }
      for (;;)
      {
        i1++;
        break;
        a(locala1, locala2);
        continue;
        a(locala1, locala2, paramai1.d, paramai2.d);
        continue;
        a(locala1, locala2, paramai1.b, paramai2.b);
        continue;
        a(locala1, locala2, paramai1.c, paramai2.c);
      }
    }
    b(locala1, locala2);
  }
  
  private static void a(ai paramai, View paramView, ah paramah)
  {
    paramai.a.put(paramView, paramah);
    int i1 = paramView.getId();
    String str;
    if (i1 >= 0)
    {
      if (paramai.b.indexOfKey(i1) >= 0) {
        paramai.b.put(i1, null);
      }
    }
    else
    {
      str = s.n(paramView);
      if (str != null)
      {
        if (!paramai.d.containsKey(str)) {
          break label183;
        }
        paramai.d.put(str, null);
      }
    }
    long l1;
    for (;;)
    {
      if ((paramView.getParent() instanceof ListView))
      {
        ListView localListView = (ListView)paramView.getParent();
        if (localListView.getAdapter().hasStableIds())
        {
          l1 = localListView.getItemIdAtPosition(localListView.getPositionForView(paramView));
          if (paramai.c.c(l1) < 0) {
            break label197;
          }
          View localView = (View)paramai.c.a(l1);
          if (localView != null)
          {
            s.a(localView, false);
            paramai.c.b(l1, null);
          }
        }
      }
      return;
      paramai.b.put(i1, paramView);
      break;
      label183:
      paramai.d.put(str, paramView);
    }
    label197:
    s.a(paramView, true);
    paramai.c.b(l1, paramView);
  }
  
  private void a(android.support.v4.f.a<View, ah> parama1, android.support.v4.f.a<View, ah> parama2)
  {
    for (int i1 = -1 + parama1.size(); i1 >= 0; i1--)
    {
      View localView = (View)parama1.b(i1);
      if ((localView != null) && (b(localView)))
      {
        ah localah1 = (ah)parama2.remove(localView);
        if ((localah1 != null) && (localah1.b != null) && (b(localah1.b)))
        {
          ah localah2 = (ah)parama1.d(i1);
          this.x.add(localah2);
          this.y.add(localah1);
        }
      }
    }
  }
  
  private void a(android.support.v4.f.a<View, ah> parama1, android.support.v4.f.a<View, ah> parama2, android.support.v4.f.a<String, View> parama3, android.support.v4.f.a<String, View> parama4)
  {
    int i1 = parama3.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = (View)parama3.c(i2);
      if ((localView1 != null) && (b(localView1)))
      {
        View localView2 = (View)parama4.get(parama3.b(i2));
        if ((localView2 != null) && (b(localView2)))
        {
          ah localah1 = (ah)parama1.get(localView1);
          ah localah2 = (ah)parama2.get(localView2);
          if ((localah1 != null) && (localah2 != null))
          {
            this.x.add(localah1);
            this.y.add(localah2);
            parama1.remove(localView1);
            parama2.remove(localView2);
          }
        }
      }
    }
  }
  
  private void a(android.support.v4.f.a<View, ah> parama1, android.support.v4.f.a<View, ah> parama2, f<View> paramf1, f<View> paramf2)
  {
    int i1 = paramf1.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = (View)paramf1.c(i2);
      if ((localView1 != null) && (b(localView1)))
      {
        View localView2 = (View)paramf2.a(paramf1.b(i2));
        if ((localView2 != null) && (b(localView2)))
        {
          ah localah1 = (ah)parama1.get(localView1);
          ah localah2 = (ah)parama2.get(localView2);
          if ((localah1 != null) && (localah2 != null))
          {
            this.x.add(localah1);
            this.y.add(localah2);
            parama1.remove(localView1);
            parama2.remove(localView2);
          }
        }
      }
    }
  }
  
  private void a(android.support.v4.f.a<View, ah> parama1, android.support.v4.f.a<View, ah> parama2, SparseArray<View> paramSparseArray1, SparseArray<View> paramSparseArray2)
  {
    int i1 = paramSparseArray1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = (View)paramSparseArray1.valueAt(i2);
      if ((localView1 != null) && (b(localView1)))
      {
        View localView2 = (View)paramSparseArray2.get(paramSparseArray1.keyAt(i2));
        if ((localView2 != null) && (b(localView2)))
        {
          ah localah1 = (ah)parama1.get(localView1);
          ah localah2 = (ah)parama2.get(localView2);
          if ((localah1 != null) && (localah2 != null))
          {
            this.x.add(localah1);
            this.y.add(localah2);
            parama1.remove(localView1);
            parama2.remove(localView2);
          }
        }
      }
    }
  }
  
  private static boolean a(int paramInt)
  {
    return (paramInt >= 1) && (paramInt <= 4);
  }
  
  private static boolean a(ah paramah1, ah paramah2, String paramString)
  {
    boolean bool = true;
    Object localObject1 = paramah1.a.get(paramString);
    Object localObject2 = paramah2.a.get(paramString);
    if ((localObject1 == null) && (localObject2 == null)) {
      bool = false;
    }
    while ((localObject1 == null) || (localObject2 == null) || (!localObject1.equals(localObject2))) {
      return bool;
    }
    return false;
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt[paramInt];
    for (int i2 = 0;; i2++)
    {
      boolean bool = false;
      if (i2 < paramInt)
      {
        if (paramArrayOfInt[i2] == i1) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  private void b(android.support.v4.f.a<View, ah> parama1, android.support.v4.f.a<View, ah> parama2)
  {
    int i3;
    for (int i1 = 0;; i1++)
    {
      int i2 = parama1.size();
      i3 = 0;
      if (i1 >= i2) {
        break;
      }
      ah localah2 = (ah)parama1.c(i1);
      if (b(localah2.b))
      {
        this.x.add(localah2);
        this.y.add(null);
      }
    }
    while (i3 < parama2.size())
    {
      ah localah1 = (ah)parama2.c(i3);
      if (b(localah1.b))
      {
        this.y.add(localah1);
        this.x.add(null);
      }
      i3++;
    }
  }
  
  private static int[] b(String paramString)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    Object localObject = new int[localStringTokenizer.countTokens()];
    int i1 = 0;
    if (localStringTokenizer.hasMoreTokens())
    {
      String str = localStringTokenizer.nextToken().trim();
      if ("id".equalsIgnoreCase(str)) {
        localObject[i1] = 3;
      }
      for (;;)
      {
        i1++;
        break;
        if ("instance".equalsIgnoreCase(str))
        {
          localObject[i1] = 1;
        }
        else if ("name".equalsIgnoreCase(str))
        {
          localObject[i1] = 2;
        }
        else if ("itemId".equalsIgnoreCase(str))
        {
          localObject[i1] = 4;
        }
        else
        {
          if (!str.isEmpty()) {
            break label146;
          }
          int[] arrayOfInt = new int[-1 + localObject.length];
          System.arraycopy(localObject, 0, arrayOfInt, 0, i1);
          i1--;
          localObject = arrayOfInt;
        }
      }
      label146:
      throw new InflateException("Unknown match type in matchOrder: '" + str + "'");
    }
    return localObject;
  }
  
  private void c(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      int i1 = paramView.getId();
      if (((this.n == null) || (!this.n.contains(Integer.valueOf(i1)))) && ((this.o == null) || (!this.o.contains(paramView))))
      {
        if (this.p != null)
        {
          int i5 = this.p.size();
          for (int i6 = 0;; i6++)
          {
            if (i6 >= i5) {
              break label100;
            }
            if (((Class)this.p.get(i6)).isInstance(paramView)) {
              break;
            }
          }
        }
        label100:
        ah localah;
        if ((paramView.getParent() instanceof ViewGroup))
        {
          localah = new ah();
          localah.b = paramView;
          if (!paramBoolean) {
            break label262;
          }
          a(localah);
          label135:
          localah.c.add(this);
          c(localah);
          if (!paramBoolean) {
            break label271;
          }
          a(this.u, paramView, localah);
        }
        for (;;)
        {
          if ((!(paramView instanceof ViewGroup)) || ((this.r != null) && (this.r.contains(Integer.valueOf(i1)))) || ((this.s != null) && (this.s.contains(paramView)))) {
            break label282;
          }
          if (this.t == null) {
            break label284;
          }
          int i3 = this.t.size();
          for (int i4 = 0;; i4++)
          {
            if (i4 >= i3) {
              break label284;
            }
            if (((Class)this.t.get(i4)).isInstance(paramView)) {
              break;
            }
          }
          label262:
          b(localah);
          break label135;
          label271:
          a(this.v, paramView, localah);
        }
        label282:
        continue;
        label284:
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i2 = 0; i2 < localViewGroup.getChildCount(); i2++) {
          c(localViewGroup.getChildAt(i2), paramBoolean);
        }
      }
    }
  }
  
  private static android.support.v4.f.a<Animator, a> p()
  {
    android.support.v4.f.a locala = (android.support.v4.f.a)z.get();
    if (locala == null)
    {
      locala = new android.support.v4.f.a();
      z.set(locala);
    }
    return locala;
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    return null;
  }
  
  public Transition a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }
  
  public Transition a(TimeInterpolator paramTimeInterpolator)
  {
    this.k = paramTimeInterpolator;
    return this;
  }
  
  public Transition a(c paramc)
  {
    if (this.F == null) {
      this.F = new ArrayList();
    }
    this.F.add(paramc);
    return this;
  }
  
  public ah a(View paramView, boolean paramBoolean)
  {
    if (this.d != null) {
      return this.d.a(paramView, paramBoolean);
    }
    if (paramBoolean) {}
    for (ai localai = this.u;; localai = this.v) {
      return (ah)localai.a.get(paramView);
    }
  }
  
  String a(String paramString)
  {
    String str1 = paramString + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
    if (this.a != -1L) {
      str1 = str1 + "dur(" + this.a + ") ";
    }
    if (this.j != -1L) {
      str1 = str1 + "dly(" + this.j + ") ";
    }
    if (this.k != null) {
      str1 = str1 + "interp(" + this.k + ") ";
    }
    if ((this.b.size() > 0) || (this.c.size() > 0))
    {
      String str2 = str1 + "tgts(";
      if (this.b.size() > 0)
      {
        str3 = str2;
        for (int i3 = 0; i3 < this.b.size(); i3++)
        {
          if (i3 > 0) {
            str3 = str3 + ", ";
          }
          str3 = str3 + this.b.get(i3);
        }
      }
      String str3 = str2;
      int i1 = this.c.size();
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.c.size())
        {
          if (i2 > 0) {
            str3 = str3 + ", ";
          }
          str3 = str3 + this.c.get(i2);
          i2++;
        }
      }
      str1 = str3 + ")";
    }
    return str1;
  }
  
  protected void a(Animator paramAnimator)
  {
    if (paramAnimator == null)
    {
      k();
      return;
    }
    if (b() >= 0L) {
      paramAnimator.setDuration(b());
    }
    if (c() >= 0L) {
      paramAnimator.setStartDelay(c());
    }
    if (d() != null) {
      paramAnimator.setInterpolator(d());
    }
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        Transition.this.k();
        paramAnonymousAnimator.removeListener(this);
      }
    });
    paramAnimator.start();
  }
  
  public void a(b paramb)
  {
    this.H = paramb;
  }
  
  public void a(af paramaf)
  {
    this.f = paramaf;
  }
  
  public abstract void a(ah paramah);
  
  void a(ViewGroup paramViewGroup)
  {
    this.x = new ArrayList();
    this.y = new ArrayList();
    a(this.u, this.v);
    android.support.v4.f.a locala = p();
    int i1 = locala.size();
    be localbe = au.b(paramViewGroup);
    int i2 = i1 - 1;
    if (i2 >= 0)
    {
      Animator localAnimator = (Animator)locala.b(i2);
      int i3;
      if (localAnimator != null)
      {
        a locala1 = (a)locala.get(localAnimator);
        if ((locala1 != null) && (locala1.a != null) && (localbe.equals(locala1.d)))
        {
          ah localah1 = locala1.c;
          View localView = locala1.a;
          ah localah2 = a(localView, true);
          ah localah3 = b(localView, true);
          if (((localah2 == null) && (localah3 == null)) || (!locala1.e.a(localah1, localah3))) {
            break label204;
          }
          i3 = 1;
          label172:
          if (i3 != 0)
          {
            if ((!localAnimator.isRunning()) && (!localAnimator.isStarted())) {
              break label210;
            }
            localAnimator.cancel();
          }
        }
      }
      for (;;)
      {
        i2--;
        break;
        label204:
        i3 = 0;
        break label172;
        label210:
        locala.remove(localAnimator);
      }
    }
    a(paramViewGroup, this.u, this.v, this.x, this.y);
    e();
  }
  
  protected void a(ViewGroup paramViewGroup, ai paramai1, ai paramai2, ArrayList<ah> paramArrayList1, ArrayList<ah> paramArrayList2)
  {
    android.support.v4.f.a locala = p();
    long l1 = 9223372036854775807L;
    SparseIntArray localSparseIntArray = new SparseIntArray();
    int i1 = paramArrayList1.size();
    int i2 = 0;
    ah localah1;
    ah localah2;
    if (i2 < i1)
    {
      localah1 = (ah)paramArrayList1.get(i2);
      localah2 = (ah)paramArrayList2.get(i2);
      if ((localah1 == null) || (localah1.c.contains(this))) {
        break label601;
      }
    }
    label282:
    label284:
    label294:
    label584:
    label601:
    for (ah localah3 = null;; localah3 = localah1)
    {
      if ((localah2 != null) && (!localah2.c.contains(this))) {}
      for (ah localah4 = null;; localah4 = localah2)
      {
        if ((localah3 == null) && (localah4 == null)) {}
        Animator localAnimator2;
        View localView2;
        ah localah7;
        for (;;)
        {
          i2++;
          break;
          if ((localah3 == null) || (localah4 == null) || (a(localah3, localah4))) {}
          for (int i5 = 1;; i5 = 0)
          {
            if (i5 == 0) {
              break label282;
            }
            localAnimator2 = a(paramViewGroup, localah3, localah4);
            if (localAnimator2 == null) {
              break;
            }
            if (localah4 == null) {
              break label484;
            }
            localView2 = localah4.b;
            String[] arrayOfString = a();
            if ((localView2 == null) || (arrayOfString == null) || (arrayOfString.length <= 0)) {
              break label584;
            }
            localah7 = new ah();
            localah7.b = localView2;
            ah localah8 = (ah)paramai2.a.get(localView2);
            if (localah8 == null) {
              break label284;
            }
            for (int i8 = 0; i8 < arrayOfString.length; i8++) {
              localah7.a.put(arrayOfString[i8], localah8.a.get(arrayOfString[i8]));
            }
          }
        }
        int i6 = locala.size();
        int i7 = 0;
        Animator localAnimator4;
        ah localah6;
        if (i7 < i6)
        {
          a locala1 = (a)locala.get((Animator)locala.b(i7));
          if ((locala1.c != null) && (locala1.a == localView2) && (locala1.b.equals(o())) && (locala1.c.equals(localah7)))
          {
            localAnimator4 = null;
            localah6 = localah7;
          }
        }
        for (;;)
        {
          ah localah5 = localah6;
          Animator localAnimator3 = localAnimator4;
          View localView1 = localView2;
          for (;;)
          {
            if (localAnimator3 == null) {
              break label499;
            }
            if (this.f != null)
            {
              long l2 = this.f.a(paramViewGroup, this, localah3, localah4);
              localSparseIntArray.put(this.G.size(), (int)l2);
              l1 = Math.min(l2, l1);
            }
            locala.put(localAnimator3, new a(localView1, o(), this, au.b(paramViewGroup), localah5));
            this.G.add(localAnimator3);
            break;
            i7++;
            break label294;
            label484:
            localView1 = localah3.b;
            localAnimator3 = localAnimator2;
            localah5 = null;
          }
          label499:
          break;
          if (l1 != 0L) {
            for (int i3 = 0; i3 < localSparseIntArray.size(); i3++)
            {
              int i4 = localSparseIntArray.keyAt(i3);
              Animator localAnimator1 = (Animator)this.G.get(i4);
              localAnimator1.setStartDelay(localSparseIntArray.valueAt(i3) - l1 + localAnimator1.getStartDelay());
            }
          }
          return;
          localah6 = localah7;
          localAnimator4 = localAnimator2;
          continue;
          localAnimator4 = localAnimator2;
          localah6 = null;
        }
      }
    }
  }
  
  void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    b(paramBoolean);
    if (((this.b.size() > 0) || (this.c.size() > 0)) && ((this.l == null) || (this.l.isEmpty())) && ((this.m == null) || (this.m.isEmpty())))
    {
      int i1 = 0;
      if (i1 < this.b.size())
      {
        View localView3 = paramViewGroup.findViewById(((Integer)this.b.get(i1)).intValue());
        ah localah2;
        if (localView3 != null)
        {
          localah2 = new ah();
          localah2.b = localView3;
          if (!paramBoolean) {
            break label160;
          }
          a(localah2);
          label123:
          localah2.c.add(this);
          c(localah2);
          if (!paramBoolean) {
            break label169;
          }
          a(this.u, localView3, localah2);
        }
        for (;;)
        {
          i1++;
          break;
          label160:
          b(localah2);
          break label123;
          label169:
          a(this.v, localView3, localah2);
        }
      }
      int i2 = 0;
      if (i2 < this.c.size())
      {
        View localView2 = (View)this.c.get(i2);
        ah localah1 = new ah();
        localah1.b = localView2;
        if (paramBoolean)
        {
          a(localah1);
          label238:
          localah1.c.add(this);
          c(localah1);
          if (!paramBoolean) {
            break label284;
          }
          a(this.u, localView2, localah1);
        }
        for (;;)
        {
          i2++;
          break;
          b(localah1);
          break label238;
          label284:
          a(this.v, localView2, localah1);
        }
      }
    }
    else
    {
      c(paramViewGroup, paramBoolean);
    }
    if ((!paramBoolean) && (this.I != null))
    {
      int i3 = this.I.size();
      ArrayList localArrayList = new ArrayList(i3);
      int i5;
      for (int i4 = 0;; i4++)
      {
        i5 = 0;
        if (i4 >= i3) {
          break;
        }
        String str2 = (String)this.I.b(i4);
        localArrayList.add(this.u.d.remove(str2));
      }
      while (i5 < i3)
      {
        View localView1 = (View)localArrayList.get(i5);
        if (localView1 != null)
        {
          String str1 = (String)this.I.c(i5);
          this.u.d.put(str1, localView1);
        }
        i5++;
      }
    }
  }
  
  public void a(int... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      this.w = g;
      return;
    }
    for (int i1 = 0; i1 < paramVarArgs.length; i1++)
    {
      if (!a(paramVarArgs[i1])) {
        throw new IllegalArgumentException("matches contains invalid value");
      }
      if (a(paramVarArgs, i1)) {
        throw new IllegalArgumentException("matches contains a duplicate value");
      }
    }
    this.w = ((int[])paramVarArgs.clone());
  }
  
  public boolean a(ah paramah1, ah paramah2)
  {
    boolean bool1 = false;
    int i2;
    if (paramah1 != null)
    {
      bool1 = false;
      if (paramah2 != null)
      {
        String[] arrayOfString = a();
        if (arrayOfString == null) {
          break label65;
        }
        int i1 = arrayOfString.length;
        i2 = 0;
        if (i2 >= i1) {
          break label117;
        }
        if (!a(paramah1, paramah2, arrayOfString[i2])) {
          break label59;
        }
      }
    }
    label59:
    label65:
    label117:
    for (boolean bool3 = true;; bool3 = false)
    {
      bool1 = bool3;
      return bool1;
      i2++;
      break;
      Iterator localIterator = paramah1.a.keySet().iterator();
      do
      {
        boolean bool2 = localIterator.hasNext();
        bool1 = false;
        if (!bool2) {
          break;
        }
      } while (!a(paramah1, paramah2, (String)localIterator.next()));
      return true;
    }
  }
  
  public String[] a()
  {
    return null;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public Transition b(long paramLong)
  {
    this.j = paramLong;
    return this;
  }
  
  public Transition b(c paramc)
  {
    if (this.F == null) {}
    do
    {
      return this;
      this.F.remove(paramc);
    } while (this.F.size() != 0);
    this.F = null;
    return this;
  }
  
  ah b(View paramView, boolean paramBoolean)
  {
    ah localah1;
    if (this.d != null) {
      localah1 = this.d.b(paramView, paramBoolean);
    }
    ArrayList localArrayList1;
    int i2;
    label46:
    ah localah3;
    do
    {
      do
      {
        return localah1;
        if (!paramBoolean) {
          break;
        }
        localArrayList1 = this.x;
        localah1 = null;
      } while (localArrayList1 == null);
      int i1 = localArrayList1.size();
      i2 = 0;
      if (i2 >= i1) {
        break label140;
      }
      localah3 = (ah)localArrayList1.get(i2);
      localah1 = null;
    } while (localah3 == null);
    if (localah3.b == paramView) {}
    for (;;)
    {
      ArrayList localArrayList2;
      if (i2 >= 0) {
        if (paramBoolean) {
          localArrayList2 = this.y;
        }
      }
      label96:
      for (ah localah2 = (ah)localArrayList2.get(i2);; localah2 = null)
      {
        return localah2;
        localArrayList1 = this.y;
        break;
        i2++;
        break label46;
        localArrayList2 = this.x;
        break label96;
      }
      label140:
      i2 = -1;
    }
  }
  
  public abstract void b(ah paramah);
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.u.a.clear();
      this.u.b.clear();
      this.u.c.c();
      return;
    }
    this.v.a.clear();
    this.v.b.clear();
    this.v.c.c();
  }
  
  boolean b(View paramView)
  {
    int i1 = paramView.getId();
    if ((this.n != null) && (this.n.contains(Integer.valueOf(i1)))) {}
    for (;;)
    {
      return false;
      if ((this.o == null) || (!this.o.contains(paramView)))
      {
        if (this.p != null)
        {
          int i3 = this.p.size();
          for (int i4 = 0;; i4++)
          {
            if (i4 >= i3) {
              break label97;
            }
            if (((Class)this.p.get(i4)).isInstance(paramView)) {
              break;
            }
          }
        }
        label97:
        if ((this.q == null) || (s.n(paramView) == null) || (!this.q.contains(s.n(paramView))))
        {
          if ((this.b.size() == 0) && (this.c.size() == 0) && ((this.m == null) || (this.m.isEmpty())) && ((this.l == null) || (this.l.isEmpty()))) {
            return true;
          }
          if ((this.b.contains(Integer.valueOf(i1))) || (this.c.contains(paramView))) {
            return true;
          }
          if ((this.l != null) && (this.l.contains(s.n(paramView)))) {
            return true;
          }
          if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
              if (((Class)this.m.get(i2)).isInstance(paramView)) {
                return true;
              }
            }
          }
        }
      }
    }
  }
  
  public long c()
  {
    return this.j;
  }
  
  public Transition c(View paramView)
  {
    this.c.add(paramView);
    return this;
  }
  
  void c(ah paramah)
  {
    String[] arrayOfString;
    if ((this.f != null) && (!paramah.a.isEmpty()))
    {
      arrayOfString = this.f.a();
      if (arrayOfString != null) {
        break label32;
      }
    }
    label32:
    label86:
    for (;;)
    {
      return;
      int i1 = 0;
      int i2;
      if (i1 < arrayOfString.length)
      {
        boolean bool = paramah.a.containsKey(arrayOfString[i1]);
        i2 = 0;
        if (bool) {}
      }
      for (;;)
      {
        if (i2 != 0) {
          break label86;
        }
        this.f.a(paramah);
        return;
        i1++;
        break;
        i2 = 1;
      }
    }
  }
  
  public TimeInterpolator d()
  {
    return this.k;
  }
  
  public Transition d(View paramView)
  {
    this.c.remove(paramView);
    return this;
  }
  
  protected void e()
  {
    j();
    android.support.v4.f.a locala = p();
    Iterator localIterator = this.G.iterator();
    while (localIterator.hasNext())
    {
      Animator localAnimator = (Animator)localIterator.next();
      if (locala.containsKey(localAnimator))
      {
        j();
        a(localAnimator, locala);
      }
    }
    this.G.clear();
    k();
  }
  
  public void e(View paramView)
  {
    if (!this.E)
    {
      android.support.v4.f.a locala = p();
      int i1 = locala.size();
      be localbe = au.b(paramView);
      for (int i2 = i1 - 1; i2 >= 0; i2--)
      {
        a locala1 = (a)locala.c(i2);
        if ((locala1.a != null) && (localbe.equals(locala1.d))) {
          a.a((Animator)locala.b(i2));
        }
      }
      if ((this.F != null) && (this.F.size() > 0))
      {
        ArrayList localArrayList = (ArrayList)this.F.clone();
        int i3 = localArrayList.size();
        for (int i4 = 0; i4 < i3; i4++) {
          ((c)localArrayList.get(i4)).b(this);
        }
      }
      this.D = true;
    }
  }
  
  public List<Integer> f()
  {
    return this.b;
  }
  
  public void f(View paramView)
  {
    if (this.D)
    {
      if (!this.E)
      {
        android.support.v4.f.a locala = p();
        int i1 = locala.size();
        be localbe = au.b(paramView);
        for (int i2 = i1 - 1; i2 >= 0; i2--)
        {
          a locala1 = (a)locala.c(i2);
          if ((locala1.a != null) && (localbe.equals(locala1.d))) {
            a.b((Animator)locala.b(i2));
          }
        }
        if ((this.F != null) && (this.F.size() > 0))
        {
          ArrayList localArrayList = (ArrayList)this.F.clone();
          int i3 = localArrayList.size();
          for (int i4 = 0; i4 < i3; i4++) {
            ((c)localArrayList.get(i4)).c(this);
          }
        }
      }
      this.D = false;
    }
  }
  
  public List<View> g()
  {
    return this.c;
  }
  
  public List<String> h()
  {
    return this.l;
  }
  
  public List<Class> i()
  {
    return this.m;
  }
  
  protected void j()
  {
    if (this.C == 0)
    {
      if ((this.F != null) && (this.F.size() > 0))
      {
        ArrayList localArrayList = (ArrayList)this.F.clone();
        int i1 = localArrayList.size();
        for (int i2 = 0; i2 < i1; i2++) {
          ((c)localArrayList.get(i2)).d(this);
        }
      }
      this.E = false;
    }
    this.C = (1 + this.C);
  }
  
  protected void k()
  {
    this.C = (-1 + this.C);
    if (this.C == 0)
    {
      if ((this.F != null) && (this.F.size() > 0))
      {
        ArrayList localArrayList = (ArrayList)this.F.clone();
        int i3 = localArrayList.size();
        for (int i4 = 0; i4 < i3; i4++) {
          ((c)localArrayList.get(i4)).a(this);
        }
      }
      for (int i1 = 0; i1 < this.u.c.b(); i1++)
      {
        View localView2 = (View)this.u.c.c(i1);
        if (localView2 != null) {
          s.a(localView2, false);
        }
      }
      for (int i2 = 0; i2 < this.v.c.b(); i2++)
      {
        View localView1 = (View)this.v.c.c(i2);
        if (localView1 != null) {
          s.a(localView1, false);
        }
      }
      this.E = true;
    }
  }
  
  public PathMotion l()
  {
    return this.J;
  }
  
  public Rect m()
  {
    if (this.H == null) {
      return null;
    }
    return this.H.a(this);
  }
  
  public Transition n()
  {
    try
    {
      Transition localTransition = (Transition)super.clone();
      localTransition.G = new ArrayList();
      localTransition.u = new ai();
      localTransition.v = new ai();
      localTransition.x = null;
      localTransition.y = null;
      return localTransition;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public String o()
  {
    return this.i;
  }
  
  public String toString()
  {
    return a("");
  }
  
  private static class a
  {
    View a;
    String b;
    ah c;
    be d;
    Transition e;
    
    a(View paramView, String paramString, Transition paramTransition, be parambe, ah paramah)
    {
      this.a = paramView;
      this.b = paramString;
      this.c = paramah;
      this.d = parambe;
      this.e = paramTransition;
    }
  }
  
  public static abstract class b
  {
    public abstract Rect a(Transition paramTransition);
  }
  
  public static abstract interface c
  {
    public abstract void a(Transition paramTransition);
    
    public abstract void b(Transition paramTransition);
    
    public abstract void c(Transition paramTransition);
    
    public abstract void d(Transition paramTransition);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.Transition
 * JD-Core Version:    0.7.0.1
 */