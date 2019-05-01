package android.support.v4.content;

import android.support.v4.f.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D>
{
  int a;
  a<D> b;
  boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  
  public String a(D paramD)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(paramD, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void a()
  {
    this.c = true;
    this.e = false;
    this.d = false;
    b();
  }
  
  public void a(int paramInt, a<D> parama)
  {
    if (this.b != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.b = parama;
    this.a = paramInt;
  }
  
  public void a(a<D> parama)
  {
    if (this.b == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.b != parama) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.b = null;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if ((this.c) || (this.f) || (this.g))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.c);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.f);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.g);
    }
    if ((this.d) || (this.e))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.e);
    }
  }
  
  protected void b() {}
  
  public boolean c()
  {
    return d();
  }
  
  protected boolean d()
  {
    return false;
  }
  
  public void e()
  {
    this.c = false;
    f();
  }
  
  protected void f() {}
  
  public void g()
  {
    this.d = true;
    h();
  }
  
  protected void h() {}
  
  public void i()
  {
    j();
    this.e = true;
    this.c = false;
    this.d = false;
    this.f = false;
    this.g = false;
  }
  
  protected void j() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract interface a<D> {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.b
 * JD-Core Version:    0.7.0.1
 */