package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Collection;

public class GetServiceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new e();
  private final int a;
  private final int b;
  private int c;
  private String d;
  private IBinder e;
  private Scope[] f;
  private Bundle g;
  private Account h;
  private Feature[] i;
  private Feature[] j;
  private boolean k;
  
  public GetServiceRequest(int paramInt)
  {
    this.a = 4;
    this.c = d.a;
    this.b = paramInt;
    this.k = true;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, Feature[] paramArrayOfFeature1, Feature[] paramArrayOfFeature2, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    if ("com.google.android.gms".equals(paramString))
    {
      this.d = "com.google.android.gms";
      if (paramInt1 >= 2) {
        break label89;
      }
    }
    for (this.h = a(paramIBinder);; this.h = paramAccount)
    {
      this.f = paramArrayOfScope;
      this.g = paramBundle;
      this.i = paramArrayOfFeature1;
      this.j = paramArrayOfFeature2;
      this.k = paramBoolean;
      return;
      this.d = paramString;
      break;
      label89:
      this.e = paramIBinder;
    }
  }
  
  private static Account a(IBinder paramIBinder)
  {
    Account localAccount = null;
    if (paramIBinder != null) {
      localAccount = a.a(h.a.a(paramIBinder));
    }
    return localAccount;
  }
  
  public GetServiceRequest a(Account paramAccount)
  {
    this.h = paramAccount;
    return this;
  }
  
  public GetServiceRequest a(Bundle paramBundle)
  {
    this.g = paramBundle;
    return this;
  }
  
  public GetServiceRequest a(h paramh)
  {
    if (paramh != null) {
      this.e = paramh.asBinder();
    }
    return this;
  }
  
  public GetServiceRequest a(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public GetServiceRequest a(Collection<Scope> paramCollection)
  {
    this.f = ((Scope[])paramCollection.toArray(new Scope[paramCollection.size()]));
    return this;
  }
  
  public GetServiceRequest a(Feature[] paramArrayOfFeature)
  {
    this.i = paramArrayOfFeature;
    return this;
  }
  
  public GetServiceRequest b(Feature[] paramArrayOfFeature)
  {
    this.j = paramArrayOfFeature;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b);
    b.a(paramParcel, 3, this.c);
    b.a(paramParcel, 4, this.d, false);
    b.a(paramParcel, 5, this.e, false);
    b.a(paramParcel, 6, this.f, paramInt, false);
    b.a(paramParcel, 7, this.g, false);
    b.a(paramParcel, 8, this.h, paramInt, false);
    b.a(paramParcel, 10, this.i, paramInt, false);
    b.a(paramParcel, 11, this.j, paramInt, false);
    b.a(paramParcel, 12, this.k);
    b.a(paramParcel, m);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GetServiceRequest
 * JD-Core Version:    0.7.0.1
 */