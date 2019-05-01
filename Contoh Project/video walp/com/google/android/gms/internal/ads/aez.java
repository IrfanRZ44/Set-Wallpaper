package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class aez
  implements Cloneable
{
  private aex<?, ?> a;
  private Object b;
  private List<afe> c = new ArrayList();
  
  private final byte[] b()
  {
    byte[] arrayOfByte = new byte[a()];
    a(aeu.a(arrayOfByte));
    return arrayOfByte;
  }
  
  private final aez c()
  {
    aez localaez = new aez();
    try
    {
      localaez.a = this.a;
      if (this.c == null) {
        localaez.c = null;
      }
      for (;;)
      {
        if (this.b == null) {
          return localaez;
        }
        if (!(this.b instanceof afc)) {
          break;
        }
        localaez.b = ((afc)((afc)this.b).clone());
        return localaez;
        localaez.c.addAll(this.c);
      }
      if (!(this.b instanceof byte[])) {
        break label117;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localaez.b = ((byte[])this.b).clone();
    return localaez;
    label117:
    if ((this.b instanceof byte[][]))
    {
      byte[][] arrayOfByte = (byte[][])this.b;
      byte[][] arrayOfByte1 = new byte[arrayOfByte.length][];
      localaez.b = arrayOfByte1;
      for (int j = 0; j < arrayOfByte.length; j++) {
        arrayOfByte1[j] = ((byte[])arrayOfByte[j].clone());
      }
    }
    if ((this.b instanceof boolean[]))
    {
      localaez.b = ((boolean[])this.b).clone();
      return localaez;
    }
    if ((this.b instanceof int[]))
    {
      localaez.b = ((int[])this.b).clone();
      return localaez;
    }
    if ((this.b instanceof long[]))
    {
      localaez.b = ((long[])this.b).clone();
      return localaez;
    }
    if ((this.b instanceof float[]))
    {
      localaez.b = ((float[])this.b).clone();
      return localaez;
    }
    if ((this.b instanceof double[]))
    {
      localaez.b = ((double[])this.b).clone();
      return localaez;
    }
    if ((this.b instanceof afc[]))
    {
      afc[] arrayOfafc1 = (afc[])this.b;
      afc[] arrayOfafc2 = new afc[arrayOfafc1.length];
      localaez.b = arrayOfafc2;
      for (int i = 0; i < arrayOfafc1.length; i++) {
        arrayOfafc2[i] = ((afc)arrayOfafc1[i].clone());
      }
    }
    return localaez;
  }
  
  final int a()
  {
    if (this.b != null) {
      throw new NoSuchMethodError();
    }
    Iterator localIterator = this.c.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      afe localafe = (afe)localIterator.next();
      i += 0 + aeu.d(localafe.a) + localafe.b.length;
    }
    return i;
  }
  
  final void a(aeu paramaeu)
  {
    if (this.b != null) {
      throw new NoSuchMethodError();
    }
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      afe localafe = (afe)localIterator.next();
      paramaeu.c(localafe.a);
      paramaeu.c(localafe.b);
    }
  }
  
  final void a(afe paramafe)
  {
    if (this.c != null)
    {
      this.c.add(paramafe);
      return;
    }
    if ((this.b instanceof afc))
    {
      byte[] arrayOfByte = paramafe.b;
      aes localaes = aes.a(arrayOfByte, 0, arrayOfByte.length);
      int i = localaes.g();
      if (i != arrayOfByte.length - aeu.a(i)) {
        throw afb.a();
      }
      afc localafc = ((afc)this.b).a(localaes);
      this.a = this.a;
      this.b = localafc;
      this.c = null;
      return;
    }
    if ((this.b instanceof afc[]))
    {
      Collections.singletonList(paramafe);
      throw new NoSuchMethodError();
    }
    Collections.singletonList(paramafe);
    throw new NoSuchMethodError();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    aez localaez;
    aex localaex1;
    aex localaex2;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof aez;
        bool2 = false;
      } while (!bool1);
      localaez = (aez)paramObject;
      if ((this.b == null) || (localaez.b == null)) {
        break;
      }
      localaex1 = this.a;
      localaex2 = localaez.a;
      bool2 = false;
    } while (localaex1 != localaex2);
    if (!this.a.a.isArray()) {
      return this.b.equals(localaez.b);
    }
    if ((this.b instanceof byte[])) {
      return Arrays.equals((byte[])this.b, (byte[])localaez.b);
    }
    if ((this.b instanceof int[])) {
      return Arrays.equals((int[])this.b, (int[])localaez.b);
    }
    if ((this.b instanceof long[])) {
      return Arrays.equals((long[])this.b, (long[])localaez.b);
    }
    if ((this.b instanceof float[])) {
      return Arrays.equals((float[])this.b, (float[])localaez.b);
    }
    if ((this.b instanceof double[])) {
      return Arrays.equals((double[])this.b, (double[])localaez.b);
    }
    if ((this.b instanceof boolean[])) {
      return Arrays.equals((boolean[])this.b, (boolean[])localaez.b);
    }
    return Arrays.deepEquals((Object[])this.b, (Object[])localaez.b);
    if ((this.c != null) && (localaez.c != null)) {
      return this.c.equals(localaez.c);
    }
    try
    {
      boolean bool3 = Arrays.equals(b(), localaez.b());
      return bool3;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(b());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aez
 * JD-Core Version:    0.7.0.1
 */