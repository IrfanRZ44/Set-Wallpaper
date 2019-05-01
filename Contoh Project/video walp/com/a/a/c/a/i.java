package com.a.a.c.a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public class i
  extends l<ParcelFileDescriptor>
{
  public i(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected ParcelFileDescriptor a(Uri paramUri, ContentResolver paramContentResolver)
  {
    AssetFileDescriptor localAssetFileDescriptor = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (localAssetFileDescriptor == null) {
      throw new FileNotFoundException("FileDescriptor is null for: " + paramUri);
    }
    return localAssetFileDescriptor.getParcelFileDescriptor();
  }
  
  public Class<ParcelFileDescriptor> a()
  {
    return ParcelFileDescriptor.class;
  }
  
  protected void a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    paramParcelFileDescriptor.close();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.i
 * JD-Core Version:    0.7.0.1
 */