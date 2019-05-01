package com.a.a.c.b;

import android.util.Log;
import com.a.a.c.a;
import com.a.a.c.h;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class p
  extends Exception
{
  private static final StackTraceElement[] a = new StackTraceElement[0];
  private final List<Throwable> b;
  private h c;
  private a d;
  private Class<?> e;
  private String f;
  
  public p(String paramString)
  {
    this(paramString, Collections.emptyList());
  }
  
  public p(String paramString, Throwable paramThrowable)
  {
    this(paramString, Collections.singletonList(paramThrowable));
  }
  
  public p(String paramString, List<Throwable> paramList)
  {
    this.f = paramString;
    setStackTrace(a);
    this.b = paramList;
  }
  
  private void a(Appendable paramAppendable)
  {
    a(this, paramAppendable);
    a(a(), new a(paramAppendable));
  }
  
  private static void a(Throwable paramThrowable, Appendable paramAppendable)
  {
    try
    {
      paramAppendable.append(paramThrowable.getClass().toString()).append(": ").append(paramThrowable.getMessage()).append('\n');
      return;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(paramThrowable);
    }
  }
  
  private void a(Throwable paramThrowable, List<Throwable> paramList)
  {
    if ((paramThrowable instanceof p))
    {
      Iterator localIterator = ((p)paramThrowable).a().iterator();
      while (localIterator.hasNext()) {
        a((Throwable)localIterator.next(), paramList);
      }
    }
    paramList.add(paramThrowable);
  }
  
  private static void a(List<Throwable> paramList, Appendable paramAppendable)
  {
    try
    {
      b(paramList, paramAppendable);
      return;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }
  
  private static void b(List<Throwable> paramList, Appendable paramAppendable)
  {
    int i = paramList.size();
    int j = 0;
    if (j < i)
    {
      paramAppendable.append("Cause (").append(String.valueOf(j + 1)).append(" of ").append(String.valueOf(i)).append("): ");
      Throwable localThrowable = (Throwable)paramList.get(j);
      if ((localThrowable instanceof p)) {
        ((p)localThrowable).a(paramAppendable);
      }
      for (;;)
      {
        j++;
        break;
        a(localThrowable, paramAppendable);
      }
    }
  }
  
  public List<Throwable> a()
  {
    return this.b;
  }
  
  void a(h paramh, a parama)
  {
    a(paramh, parama, null);
  }
  
  void a(h paramh, a parama, Class<?> paramClass)
  {
    this.c = paramh;
    this.d = parama;
    this.e = paramClass;
  }
  
  public void a(String paramString)
  {
    List localList = b();
    int i = localList.size();
    for (int j = 0; j < i; j++) {
      Log.i(paramString, "Root cause (" + (j + 1) + " of " + i + ")", (Throwable)localList.get(j));
    }
  }
  
  public List<Throwable> b()
  {
    ArrayList localArrayList = new ArrayList();
    a(this, localArrayList);
    return localArrayList;
  }
  
  public Throwable fillInStackTrace()
  {
    return this;
  }
  
  public String getMessage()
  {
    StringBuilder localStringBuilder1 = new StringBuilder(71).append(this.f);
    String str1;
    String str2;
    label84:
    StringBuilder localStringBuilder3;
    if (this.e != null)
    {
      str1 = ", " + this.e;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(str1);
      if (this.d == null) {
        break label160;
      }
      str2 = ", " + this.d;
      localStringBuilder3 = localStringBuilder2.append(str2);
      if (this.c == null) {
        break label167;
      }
    }
    StringBuilder localStringBuilder4;
    List localList;
    label160:
    label167:
    for (String str3 = ", " + this.c;; str3 = "")
    {
      localStringBuilder4 = localStringBuilder3.append(str3);
      localList = b();
      if (!localList.isEmpty()) {
        break label174;
      }
      return localStringBuilder4.toString();
      str1 = "";
      break;
      str2 = "";
      break label84;
    }
    label174:
    if (localList.size() == 1) {
      localStringBuilder4.append("\nThere was 1 cause:");
    }
    for (;;)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Throwable localThrowable = (Throwable)localIterator.next();
        localStringBuilder4.append('\n').append(localThrowable.getClass().getName()).append('(').append(localThrowable.getMessage()).append(')');
      }
      localStringBuilder4.append("\nThere were ").append(localList.size()).append(" causes:");
    }
    localStringBuilder4.append("\n call GlideException#logRootCauses(String) for more detail");
    return localStringBuilder4.toString();
  }
  
  public void printStackTrace()
  {
    printStackTrace(System.err);
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    a(paramPrintStream);
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    a(paramPrintWriter);
  }
  
  private static final class a
    implements Appendable
  {
    private final Appendable a;
    private boolean b = true;
    
    a(Appendable paramAppendable)
    {
      this.a = paramAppendable;
    }
    
    private CharSequence a(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        paramCharSequence = "";
      }
      return paramCharSequence;
    }
    
    public Appendable append(char paramChar)
    {
      if (this.b)
      {
        this.b = false;
        this.a.append("  ");
      }
      boolean bool = false;
      if (paramChar == '\n') {
        bool = true;
      }
      this.b = bool;
      this.a.append(paramChar);
      return this;
    }
    
    public Appendable append(CharSequence paramCharSequence)
    {
      CharSequence localCharSequence = a(paramCharSequence);
      return append(localCharSequence, 0, localCharSequence.length());
    }
    
    public Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      CharSequence localCharSequence = a(paramCharSequence);
      if (this.b)
      {
        this.b = false;
        this.a.append("  ");
      }
      int i = localCharSequence.length();
      boolean bool = false;
      if (i > 0)
      {
        int j = localCharSequence.charAt(paramInt2 - 1);
        bool = false;
        if (j == 10) {
          bool = true;
        }
      }
      this.b = bool;
      this.a.append(localCharSequence, paramInt1, paramInt2);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.p
 * JD-Core Version:    0.7.0.1
 */