package com.a.a.c.a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

public final class a
  extends l<AssetFileDescriptor>
{
  public a(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected AssetFileDescriptor a(Uri paramUri, ContentResolver paramContentResolver)
  {
    AssetFileDescriptor localAssetFileDescriptor = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (localAssetFileDescriptor == null) {
      throw new FileNotFoundException("FileDescriptor is null for: " + paramUri);
    }
    return localAssetFileDescriptor;
  }
  
  public Class<AssetFileDescriptor> a()
  {
    return AssetFileDescriptor.class;
  }
  
  protected void a(AssetFileDescriptor paramAssetFileDescriptor)
  {
    paramAssetFileDescriptor.close();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.a
 * JD-Core Version:    0.7.0.1
 */