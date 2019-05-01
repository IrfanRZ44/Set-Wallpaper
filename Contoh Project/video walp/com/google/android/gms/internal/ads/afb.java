package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afb
  extends IOException
{
  public afb(String paramString)
  {
    super(paramString);
  }
  
  static afb a()
  {
    return new afb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static afb b()
  {
    return new afb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static afb c()
  {
    return new afb("CodedInputStream encountered a malformed varint.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afb
 * JD-Core Version:    0.7.0.1
 */