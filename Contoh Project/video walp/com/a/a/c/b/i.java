package com.a.a.c.b;

import com.a.a.c.a;
import com.a.a.c.c;

public abstract class i
{
  public static final i a = new i()
  {
    public boolean a()
    {
      return true;
    }
    
    public boolean a(a paramAnonymousa)
    {
      return paramAnonymousa == a.b;
    }
    
    public boolean a(boolean paramAnonymousBoolean, a paramAnonymousa, c paramAnonymousc)
    {
      return (paramAnonymousa != a.d) && (paramAnonymousa != a.e);
    }
    
    public boolean b()
    {
      return true;
    }
  };
  public static final i b = new i()
  {
    public boolean a()
    {
      return false;
    }
    
    public boolean a(a paramAnonymousa)
    {
      return false;
    }
    
    public boolean a(boolean paramAnonymousBoolean, a paramAnonymousa, c paramAnonymousc)
    {
      return false;
    }
    
    public boolean b()
    {
      return false;
    }
  };
  public static final i c = new i()
  {
    public boolean a()
    {
      return false;
    }
    
    public boolean a(a paramAnonymousa)
    {
      return (paramAnonymousa != a.c) && (paramAnonymousa != a.e);
    }
    
    public boolean a(boolean paramAnonymousBoolean, a paramAnonymousa, c paramAnonymousc)
    {
      return false;
    }
    
    public boolean b()
    {
      return true;
    }
  };
  public static final i d = new i()
  {
    public boolean a()
    {
      return true;
    }
    
    public boolean a(a paramAnonymousa)
    {
      return false;
    }
    
    public boolean a(boolean paramAnonymousBoolean, a paramAnonymousa, c paramAnonymousc)
    {
      return (paramAnonymousa != a.d) && (paramAnonymousa != a.e);
    }
    
    public boolean b()
    {
      return false;
    }
  };
  public static final i e = new i()
  {
    public boolean a()
    {
      return true;
    }
    
    public boolean a(a paramAnonymousa)
    {
      return paramAnonymousa == a.b;
    }
    
    public boolean a(boolean paramAnonymousBoolean, a paramAnonymousa, c paramAnonymousc)
    {
      return ((paramAnonymousBoolean) && (paramAnonymousa == a.c)) || ((paramAnonymousa == a.a) && (paramAnonymousc == c.b));
    }
    
    public boolean b()
    {
      return true;
    }
  };
  
  public abstract boolean a();
  
  public abstract boolean a(a parama);
  
  public abstract boolean a(boolean paramBoolean, a parama, c paramc);
  
  public abstract boolean b();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.i
 * JD-Core Version:    0.7.0.1
 */