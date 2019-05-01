package com.a.a;

import com.a.a.g.b.a;
import com.a.a.g.b.c;

public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType>
  implements Cloneable
{
  private c<? super TranscodeType> a = a.a();
  
  public final CHILD a()
  {
    try
    {
      k localk = (k)super.clone();
      return localk;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  final c<? super TranscodeType> b()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.k
 * JD-Core Version:    0.7.0.1
 */