package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator()
  {
    public ResultReceiver a(Parcel paramAnonymousParcel)
    {
      return new ResultReceiver(paramAnonymousParcel);
    }
    
    public ResultReceiver[] a(int paramAnonymousInt)
    {
      return new ResultReceiver[paramAnonymousInt];
    }
  };
  final boolean a = false;
  final Handler b = null;
  b c;
  
  ResultReceiver(Parcel paramParcel)
  {
    this.c = b.a.a(paramParcel.readStrongBinder());
  }
  
  protected void a(int paramInt, Bundle paramBundle) {}
  
  public void b(int paramInt, Bundle paramBundle)
  {
    if (this.a) {
      if (this.b != null) {
        this.b.post(new b(paramInt, paramBundle));
      }
    }
    while (this.c == null)
    {
      return;
      a(paramInt, paramBundle);
      return;
    }
    try
    {
      this.c.a(paramInt, paramBundle);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (this.c == null) {
        this.c = new a();
      }
      paramParcel.writeStrongBinder(this.c.asBinder());
      return;
    }
    finally {}
  }
  
  class a
    extends b.a
  {
    a() {}
    
    public void a(int paramInt, Bundle paramBundle)
    {
      if (ResultReceiver.this.b != null)
      {
        ResultReceiver.this.b.post(new ResultReceiver.b(ResultReceiver.this, paramInt, paramBundle));
        return;
      }
      ResultReceiver.this.a(paramInt, paramBundle);
    }
  }
  
  class b
    implements Runnable
  {
    final int a;
    final Bundle b;
    
    b(int paramInt, Bundle paramBundle)
    {
      this.a = paramInt;
      this.b = paramBundle;
    }
    
    public void run()
    {
      ResultReceiver.this.a(this.a, this.b);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.os.ResultReceiver
 * JD-Core Version:    0.7.0.1
 */