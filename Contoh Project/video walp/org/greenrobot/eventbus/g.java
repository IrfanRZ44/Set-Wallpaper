package org.greenrobot.eventbus;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

public abstract interface g
{
  public abstract void a(Level paramLevel, String paramString);
  
  public abstract void a(Level paramLevel, String paramString, Throwable paramThrowable);
  
  public static class a
    implements g
  {
    static final boolean a;
    private final String b;
    
    static
    {
      try
      {
        Class localClass = Class.forName("android.util.Log");
        bool = false;
        if (localClass != null) {
          bool = true;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;)
        {
          boolean bool = false;
        }
      }
      a = bool;
    }
    
    public a(String paramString)
    {
      this.b = paramString;
    }
    
    public static boolean a()
    {
      return a;
    }
    
    protected int a(Level paramLevel)
    {
      int i = paramLevel.intValue();
      if (i < 800)
      {
        if (i < 500) {
          return 2;
        }
        return 3;
      }
      if (i < 900) {
        return 4;
      }
      if (i < 1000) {
        return 5;
      }
      return 6;
    }
    
    public void a(Level paramLevel, String paramString)
    {
      if (paramLevel != Level.OFF) {
        Log.println(a(paramLevel), this.b, paramString);
      }
    }
    
    public void a(Level paramLevel, String paramString, Throwable paramThrowable)
    {
      if (paramLevel != Level.OFF) {
        Log.println(a(paramLevel), this.b, paramString + "\n" + Log.getStackTraceString(paramThrowable));
      }
    }
  }
  
  public static class b
    implements g
  {
    public void a(Level paramLevel, String paramString)
    {
      System.out.println("[" + paramLevel + "] " + paramString);
    }
    
    public void a(Level paramLevel, String paramString, Throwable paramThrowable)
    {
      System.out.println("[" + paramLevel + "] " + paramString);
      paramThrowable.printStackTrace(System.out);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.g
 * JD-Core Version:    0.7.0.1
 */