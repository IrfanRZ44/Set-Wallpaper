package android.support.v4.e;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a
{
  private static c a = d.c;
  private static final String b = Character.toString('‎');
  private static final String c = Character.toString('‏');
  private static final a d = new a(false, 2, a);
  private static final a e = new a(true, 2, a);
  private final boolean f;
  private final int g;
  private final c h;
  
  private a(boolean paramBoolean, int paramInt, c paramc)
  {
    this.f = paramBoolean;
    this.g = paramInt;
    this.h = paramc;
  }
  
  public static a a()
  {
    return new a().a();
  }
  
  private String a(CharSequence paramCharSequence, c paramc)
  {
    boolean bool = paramc.a(paramCharSequence, 0, paramCharSequence.length());
    if ((!this.f) && ((bool) || (b(paramCharSequence) == 1))) {
      return b;
    }
    if ((this.f) && ((!bool) || (b(paramCharSequence) == -1))) {
      return c;
    }
    return "";
  }
  
  private static int b(CharSequence paramCharSequence)
  {
    return new b(paramCharSequence, false).b();
  }
  
  private String b(CharSequence paramCharSequence, c paramc)
  {
    boolean bool = paramc.a(paramCharSequence, 0, paramCharSequence.length());
    if ((!this.f) && ((bool) || (c(paramCharSequence) == 1))) {
      return b;
    }
    if ((this.f) && ((!bool) || (c(paramCharSequence) == -1))) {
      return c;
    }
    return "";
  }
  
  private static boolean b(Locale paramLocale)
  {
    return e.a(paramLocale) == 1;
  }
  
  private static int c(CharSequence paramCharSequence)
  {
    return new b(paramCharSequence, false).a();
  }
  
  public CharSequence a(CharSequence paramCharSequence)
  {
    return a(paramCharSequence, this.h, true);
  }
  
  public CharSequence a(CharSequence paramCharSequence, c paramc, boolean paramBoolean)
  {
    if (paramCharSequence == null) {
      return null;
    }
    boolean bool = paramc.a(paramCharSequence, 0, paramCharSequence.length());
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    c localc2;
    if ((b()) && (paramBoolean))
    {
      if (bool)
      {
        localc2 = d.b;
        localSpannableStringBuilder.append(b(paramCharSequence, localc2));
      }
    }
    else
    {
      if (bool == this.f) {
        break label154;
      }
      if (!bool) {
        break label146;
      }
      int i = 8235;
      label84:
      localSpannableStringBuilder.append(i);
      localSpannableStringBuilder.append(paramCharSequence);
      localSpannableStringBuilder.append('‬');
      label108:
      if (paramBoolean) {
        if (!bool) {
          break label164;
        }
      }
    }
    label146:
    label154:
    label164:
    for (c localc1 = d.b;; localc1 = d.a)
    {
      localSpannableStringBuilder.append(a(paramCharSequence, localc1));
      return localSpannableStringBuilder;
      localc2 = d.a;
      break;
      int j = 8234;
      break label84;
      localSpannableStringBuilder.append(paramCharSequence);
      break label108;
    }
  }
  
  public boolean b()
  {
    return (0x2 & this.g) != 0;
  }
  
  public static final class a
  {
    private boolean a;
    private int b;
    private c c;
    
    public a()
    {
      a(a.a(Locale.getDefault()));
    }
    
    private void a(boolean paramBoolean)
    {
      this.a = paramBoolean;
      this.c = a.c();
      this.b = 2;
    }
    
    private static a b(boolean paramBoolean)
    {
      if (paramBoolean) {
        return a.d();
      }
      return a.e();
    }
    
    public a a()
    {
      if ((this.b == 2) && (this.c == a.c())) {
        return b(this.a);
      }
      return new a(this.a, this.b, this.c, null);
    }
  }
  
  private static class b
  {
    private static final byte[] a = new byte[1792];
    private final CharSequence b;
    private final boolean c;
    private final int d;
    private int e;
    private char f;
    
    static
    {
      for (int i = 0; i < 1792; i++) {
        a[i] = Character.getDirectionality(i);
      }
    }
    
    b(CharSequence paramCharSequence, boolean paramBoolean)
    {
      this.b = paramCharSequence;
      this.c = paramBoolean;
      this.d = paramCharSequence.length();
    }
    
    private static byte a(char paramChar)
    {
      if (paramChar < '܀') {
        return a[paramChar];
      }
      return Character.getDirectionality(paramChar);
    }
    
    private byte e()
    {
      int i = this.e;
      label136:
      while (this.e < this.d)
      {
        CharSequence localCharSequence1 = this.b;
        int j = this.e;
        this.e = (j + 1);
        this.f = localCharSequence1.charAt(j);
        if (this.f == '>') {
          return 12;
        }
        if ((this.f == '"') || (this.f == '\''))
        {
          int k = this.f;
          for (;;)
          {
            if (this.e >= this.d) {
              break label136;
            }
            CharSequence localCharSequence2 = this.b;
            int m = this.e;
            this.e = (m + 1);
            char c1 = localCharSequence2.charAt(m);
            this.f = c1;
            if (c1 == k) {
              break;
            }
          }
        }
      }
      this.e = i;
      this.f = '<';
      return 13;
    }
    
    private byte f()
    {
      int i = this.e;
      label151:
      for (;;)
      {
        if (this.e > 0)
        {
          CharSequence localCharSequence1 = this.b;
          int j = -1 + this.e;
          this.e = j;
          this.f = localCharSequence1.charAt(j);
          if (this.f == '<') {
            return 12;
          }
          if (this.f != '>') {}
        }
        else
        {
          this.e = i;
          this.f = '>';
          return 13;
        }
        if ((this.f == '"') || (this.f == '\''))
        {
          int k = this.f;
          for (;;)
          {
            if (this.e <= 0) {
              break label151;
            }
            CharSequence localCharSequence2 = this.b;
            int m = -1 + this.e;
            this.e = m;
            char c1 = localCharSequence2.charAt(m);
            this.f = c1;
            if (c1 == k) {
              break;
            }
          }
        }
      }
    }
    
    private byte g()
    {
      char c1;
      do
      {
        if (this.e >= this.d) {
          break;
        }
        CharSequence localCharSequence = this.b;
        int i = this.e;
        this.e = (i + 1);
        c1 = localCharSequence.charAt(i);
        this.f = c1;
      } while (c1 != ';');
      return 12;
    }
    
    private byte h()
    {
      int i = this.e;
      do
      {
        if (this.e <= 0) {
          break;
        }
        CharSequence localCharSequence = this.b;
        int j = -1 + this.e;
        this.e = j;
        this.f = localCharSequence.charAt(j);
        if (this.f == '&') {
          return 12;
        }
      } while (this.f != ';');
      this.e = i;
      this.f = ';';
      return 13;
    }
    
    int a()
    {
      this.e = 0;
      int i = 0;
      int j = 0;
      int k = 0;
      while ((this.e < this.d) && (i == 0)) {
        switch (c())
        {
        case 9: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        default: 
          i = k;
          break;
        case 14: 
        case 15: 
          k++;
          j = -1;
          break;
        case 16: 
        case 17: 
          k++;
          j = 1;
          break;
        case 18: 
          k--;
          j = 0;
          break;
        case 0: 
          if (k == 0) {
            return -1;
          }
          i = k;
          break;
        case 1: 
        case 2: 
          if (k == 0) {
            return 1;
          }
          i = k;
        }
      }
      if (i == 0) {
        return 0;
      }
      if (j != 0) {
        return j;
      }
      for (;;)
      {
        if (this.e <= 0) {
          break label261;
        }
        switch (d())
        {
        default: 
          break;
        case 14: 
        case 15: 
          if (i == k) {
            break;
          }
          k--;
          break;
        case 16: 
        case 17: 
          if (i == k) {
            return 1;
          }
          k--;
          break;
        case 18: 
          k++;
        }
      }
      label261:
      return 0;
    }
    
    int b()
    {
      this.e = this.d;
      int i = 0;
      int j = 0;
      for (;;)
      {
        int k = this.e;
        int m = 0;
        if (k > 0) {}
        switch (d())
        {
        case 9: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        default: 
          if (i == 0) {
            i = j;
          }
          break;
        case 0: 
          if (j == 0)
          {
            m = -1;
            return m;
          }
          if (i == 0) {
            i = j;
          }
          break;
        case 14: 
        case 15: 
          if (i == j) {
            return -1;
          }
          j--;
          break;
        case 1: 
        case 2: 
          if (j == 0) {
            return 1;
          }
          if (i == 0) {
            i = j;
          }
          break;
        case 16: 
        case 17: 
          if (i == j) {
            return 1;
          }
          j--;
          break;
        case 18: 
          j++;
        }
      }
    }
    
    byte c()
    {
      this.f = this.b.charAt(this.e);
      byte b1;
      if (Character.isHighSurrogate(this.f))
      {
        int i = Character.codePointAt(this.b, this.e);
        this.e += Character.charCount(i);
        b1 = Character.getDirectionality(i);
      }
      do
      {
        do
        {
          return b1;
          this.e = (1 + this.e);
          b1 = a(this.f);
        } while (!this.c);
        if (this.f == '<') {
          return e();
        }
      } while (this.f != '&');
      return g();
    }
    
    byte d()
    {
      this.f = this.b.charAt(-1 + this.e);
      byte b1;
      if (Character.isLowSurrogate(this.f))
      {
        int i = Character.codePointBefore(this.b, this.e);
        this.e -= Character.charCount(i);
        b1 = Character.getDirectionality(i);
      }
      do
      {
        do
        {
          return b1;
          this.e = (-1 + this.e);
          b1 = a(this.f);
        } while (!this.c);
        if (this.f == '>') {
          return f();
        }
      } while (this.f != ';');
      return h();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.e.a
 * JD-Core Version:    0.7.0.1
 */