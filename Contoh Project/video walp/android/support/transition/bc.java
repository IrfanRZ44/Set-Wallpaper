package android.support.transition;

import android.os.IBinder;

class bc
  implements be
{
  private final IBinder a;
  
  bc(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof bc)) && (((bc)paramObject).a.equals(this.a));
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.bc
 * JD-Core Version:    0.7.0.1
 */