package com.a.a.c.a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class n
  extends l<InputStream>
{
  private static final UriMatcher a = new UriMatcher(-1);
  
  static
  {
    a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    a.addURI("com.android.contacts", "contacts/lookup/*", 1);
    a.addURI("com.android.contacts", "contacts/#/photo", 2);
    a.addURI("com.android.contacts", "contacts/#", 3);
    a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    a.addURI("com.android.contacts", "phone_lookup/*", 5);
  }
  
  public n(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  private InputStream a(ContentResolver paramContentResolver, Uri paramUri)
  {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
  
  private InputStream c(Uri paramUri, ContentResolver paramContentResolver)
  {
    switch (a.match(paramUri))
    {
    case 2: 
    case 4: 
    default: 
      return paramContentResolver.openInputStream(paramUri);
    case 3: 
      return a(paramContentResolver, paramUri);
    }
    Uri localUri = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
    if (localUri == null) {
      throw new FileNotFoundException("Contact cannot be found");
    }
    return a(paramContentResolver, localUri);
  }
  
  protected InputStream a(Uri paramUri, ContentResolver paramContentResolver)
  {
    InputStream localInputStream = c(paramUri, paramContentResolver);
    if (localInputStream == null) {
      throw new FileNotFoundException("InputStream is null for " + paramUri);
    }
    return localInputStream;
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  protected void a(InputStream paramInputStream)
  {
    paramInputStream.close();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.n
 * JD-Core Version:    0.7.0.1
 */