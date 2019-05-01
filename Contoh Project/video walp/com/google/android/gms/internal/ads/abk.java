package com.google.android.gms.internal.ads;

import java.io.IOException;

public class abk
  extends IOException
{
  private acl a = null;
  
  public abk(String paramString)
  {
    super(paramString);
  }
  
  static abk a()
  {
    return new abk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static abk b()
  {
    return new abk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static abk c()
  {
    return new abk("CodedInputStream encountered a malformed varint.");
  }
  
  static abk d()
  {
    return new abk("Protocol message contained an invalid tag (zero).");
  }
  
  static abk e()
  {
    return new abk("Protocol message end-group tag did not match expected tag.");
  }
  
  static abl f()
  {
    return new abl("Protocol message tag had invalid wire type.");
  }
  
  static abk g()
  {
    return new abk("Failed to parse the message.");
  }
  
  static abk h()
  {
    return new abk("Protocol message had invalid UTF-8.");
  }
  
  public final abk a(acl paramacl)
  {
    this.a = paramacl;
    return this;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abk
 * JD-Core Version:    0.7.0.1
 */