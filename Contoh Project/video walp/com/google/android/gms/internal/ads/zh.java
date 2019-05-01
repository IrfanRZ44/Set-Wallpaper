package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zh
  extends WeakReference<Throwable>
{
  private final int a;
  
  public zh(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, null);
    if (paramThrowable == null) {
      throw new NullPointerException("The referent cannot be null");
    }
    this.a = System.identityHashCode(paramThrowable);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      bool = false;
    }
    zh localzh;
    do
    {
      do
      {
        return bool;
      } while (this == paramObject);
      localzh = (zh)paramObject;
    } while ((this.a == localzh.a) && (get() == localzh.get()));
    return false;
  }
  
  public final int hashCode()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zh
 * JD-Core Version:    0.7.0.1
 */