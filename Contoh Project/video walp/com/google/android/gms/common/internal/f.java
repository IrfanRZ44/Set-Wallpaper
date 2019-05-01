package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public abstract class f
{
  private static final Object a = new Object();
  private static f b;
  
  public static f a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new q(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  protected abstract boolean a(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  public boolean a(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new a(paramString1, paramString2, paramInt), paramServiceConnection, paramString3);
  }
  
  protected abstract void b(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  public void b(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3)
  {
    b(new a(paramString1, paramString2, paramInt), paramServiceConnection, paramString3);
  }
  
  protected static final class a
  {
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    
    public a(String paramString1, String paramString2, int paramInt)
    {
      this.a = n.a(paramString1);
      this.b = n.a(paramString2);
      this.c = null;
      this.d = paramInt;
    }
    
    public final Intent a(Context paramContext)
    {
      if (this.a != null) {
        return new Intent(this.a).setPackage(this.b);
      }
      return new Intent().setComponent(this.c);
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final ComponentName b()
    {
      return this.c;
    }
    
    public final int c()
    {
      return this.d;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      a locala;
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        locala = (a)paramObject;
      } while ((m.a(this.a, locala.a)) && (m.a(this.b, locala.b)) && (m.a(this.c, locala.c)) && (this.d == locala.d));
      return false;
    }
    
    public final int hashCode()
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = this.a;
      arrayOfObject[1] = this.b;
      arrayOfObject[2] = this.c;
      arrayOfObject[3] = Integer.valueOf(this.d);
      return m.a(arrayOfObject);
    }
    
    public final String toString()
    {
      if (this.a == null) {
        return this.c.flattenToString();
      }
      return this.a;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.f
 * JD-Core Version:    0.7.0.1
 */