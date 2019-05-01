package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
final class sn
{
  private static final String[] a = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] b = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  
  private static void a(String paramString1, String paramString2, String paramString3)
  {
    arq localarq = asa.bs;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("err", paramString1);
    localBundle.putString("code", paramString2);
    Uri localUri;
    if (!TextUtils.isEmpty(paramString3))
    {
      localUri = Uri.parse(paramString3);
      if (localUri.getHost() == null) {}
    }
    for (String str = localUri.getHost();; str = "")
    {
      localBundle.putString("host", str);
      return;
    }
  }
  
  final void a(int paramInt, String paramString)
  {
    if ((paramInt < 0) && (-1 + -paramInt < a.length)) {}
    for (String str = a[(-1 + -paramInt)];; str = String.valueOf(paramInt))
    {
      a("http_err", str, paramString);
      return;
    }
  }
  
  final void a(@Nullable SslError paramSslError)
  {
    if (paramSslError == null) {
      return;
    }
    int i = paramSslError.getPrimaryError();
    if ((i >= 0) && (i < b.length)) {}
    for (String str = b[i];; str = String.valueOf(i))
    {
      a("ssl_err", str, paramSslError.getUrl());
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.sn
 * JD-Core Version:    0.7.0.1
 */