package com.google.android.gms.internal.ads;

@cm
public final class aos
{
  private static final Object a = new Object();
  private static aos b;
  private final lz c = new lz();
  private final aoh d = new aoh(new aoa(), new anz(), new aqw(), new awo(), new gl(), new q(), new awp());
  private final String e = lz.c();
  private final arw f = new arw();
  private final arx g = new arx();
  private final ary h = new ary();
  
  static
  {
    aos localaos = new aos();
    synchronized (a)
    {
      b = localaos;
      return;
    }
  }
  
  public static lz a()
  {
    return g().c;
  }
  
  public static aoh b()
  {
    return g().d;
  }
  
  public static String c()
  {
    return g().e;
  }
  
  public static arx d()
  {
    return g().g;
  }
  
  public static arw e()
  {
    return g().f;
  }
  
  public static ary f()
  {
    return g().h;
  }
  
  private static aos g()
  {
    synchronized (a)
    {
      aos localaos = b;
      return localaos;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aos
 * JD-Core Version:    0.7.0.1
 */