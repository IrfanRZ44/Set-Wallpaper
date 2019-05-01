package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class j
{
  private static j a;
  private final Context b;
  
  private j(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  private static e.a a(PackageInfo paramPackageInfo, e.a... paramVarArgs)
  {
    int i = 0;
    if (paramPackageInfo.signatures == null) {
      return null;
    }
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    m localm = new m(paramPackageInfo.signatures[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(localm)) {
        return paramVarArgs[i];
      }
      i++;
    }
    return null;
  }
  
  public static j a(Context paramContext)
  {
    n.a(paramContext);
    try
    {
      if (a == null)
      {
        e.a(paramContext);
        a = new j(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  public boolean a(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {}
    do
    {
      return false;
      if (a(paramPackageInfo, false)) {
        return true;
      }
    } while (!a(paramPackageInfo, true));
    if (i.b(this.b)) {
      return true;
    }
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return false;
  }
  
  public boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean) {}
      e.a[] arrayOfa;
      for (e.a locala = a(paramPackageInfo, o.a); locala != null; locala = a(paramPackageInfo, arrayOfa))
      {
        return true;
        arrayOfa = new e.a[1];
        arrayOfa[0] = o.a[0];
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.j
 * JD-Core Version:    0.7.0.1
 */