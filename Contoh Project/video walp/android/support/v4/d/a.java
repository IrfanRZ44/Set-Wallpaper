package android.support.v4.d;

import android.support.v4.f.l;
import android.util.Base64;
import java.util.List;

public final class a
{
  private final String a;
  private final String b;
  private final String c;
  private final List<List<byte[]>> d;
  private final int e;
  private final String f;
  
  public a(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList)
  {
    this.a = ((String)l.a(paramString1));
    this.b = ((String)l.a(paramString2));
    this.c = ((String)l.a(paramString3));
    this.d = ((List)l.a(paramList));
    this.e = 0;
    this.f = (this.a + "-" + this.b + "-" + this.c);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public List<List<byte[]>> d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
    for (int i = 0; i < this.d.size(); i++)
    {
      localStringBuilder.append(" [");
      List localList = (List)this.d.get(i);
      for (int j = 0; j < localList.size(); j++)
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])localList.get(j), 0));
        localStringBuilder.append("\"");
      }
      localStringBuilder.append(" ]");
    }
    localStringBuilder.append("}");
    localStringBuilder.append("mCertificatesArray: " + this.e);
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.a
 * JD-Core Version:    0.7.0.1
 */