package android.support.v4.e;

import java.util.Locale;

public final class d
{
  public static final c a = new e(null, false);
  public static final c b = new e(null, true);
  public static final c c = new e(b.a, false);
  public static final c d = new e(b.a, true);
  public static final c e = new e(a.a, false);
  public static final c f = f.a;
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 2;
    case 0: 
      return 1;
    }
    return 0;
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 2;
    case 0: 
    case 14: 
    case 15: 
      return 1;
    }
    return 0;
  }
  
  private static class a
    implements d.c
  {
    static final a a = new a(true);
    static final a b = new a(false);
    private final boolean c;
    
    private a(boolean paramBoolean)
    {
      this.c = paramBoolean;
    }
    
    public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = 1;
      int j = paramInt1 + paramInt2;
      int k = 0;
      for (;;)
      {
        if (paramInt1 < j) {
          switch (d.a(Character.getDirectionality(paramCharSequence.charAt(paramInt1))))
          {
          default: 
            paramInt1++;
            break;
          case 0: 
            if (this.c) {
              i = 0;
            }
            break;
          }
        }
      }
      do
      {
        do
        {
          return i;
          k = i;
          break;
        } while (!this.c);
        k = i;
        break;
        if (k == 0) {
          break label106;
        }
      } while (this.c);
      return 0;
      label106:
      return 2;
    }
  }
  
  private static class b
    implements d.c
  {
    static final b a = new b();
    
    public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = paramInt1 + paramInt2;
      int j = 2;
      while ((paramInt1 < i) && (j == 2))
      {
        j = d.b(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
        paramInt1++;
      }
      return j;
    }
  }
  
  private static abstract interface c
  {
    public abstract int a(CharSequence paramCharSequence, int paramInt1, int paramInt2);
  }
  
  private static abstract class d
    implements c
  {
    private final d.c a;
    
    d(d.c paramc)
    {
      this.a = paramc;
    }
    
    private boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      switch (this.a.a(paramCharSequence, paramInt1, paramInt2))
      {
      default: 
        return a();
      case 0: 
        return true;
      }
      return false;
    }
    
    protected abstract boolean a();
    
    public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      if ((paramCharSequence == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramCharSequence.length() - paramInt2 < paramInt1)) {
        throw new IllegalArgumentException();
      }
      if (this.a == null) {
        return a();
      }
      return b(paramCharSequence, paramInt1, paramInt2);
    }
  }
  
  private static class e
    extends d.d
  {
    private final boolean a;
    
    e(d.c paramc, boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    protected boolean a()
    {
      return this.a;
    }
  }
  
  private static class f
    extends d.d
  {
    static final f a = new f();
    
    f()
    {
      super();
    }
    
    protected boolean a()
    {
      return e.a(Locale.getDefault()) == 1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.e.d
 * JD-Core Version:    0.7.0.1
 */