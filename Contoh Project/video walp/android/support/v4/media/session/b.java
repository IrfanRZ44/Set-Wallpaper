package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public abstract interface b
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2, String paramString);
  
  public abstract void a(long paramLong);
  
  public abstract void a(Uri paramUri, Bundle paramBundle);
  
  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat);
  
  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt);
  
  public abstract void a(RatingCompat paramRatingCompat);
  
  public abstract void a(RatingCompat paramRatingCompat, Bundle paramBundle);
  
  public abstract void a(a parama);
  
  public abstract void a(String paramString, Bundle paramBundle);
  
  public abstract void a(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract boolean a();
  
  public abstract boolean a(KeyEvent paramKeyEvent);
  
  public abstract String b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2, String paramString);
  
  public abstract void b(long paramLong);
  
  public abstract void b(Uri paramUri, Bundle paramBundle);
  
  public abstract void b(MediaDescriptionCompat paramMediaDescriptionCompat);
  
  public abstract void b(a parama);
  
  public abstract void b(String paramString, Bundle paramBundle);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract String c();
  
  public abstract void c(int paramInt);
  
  public abstract void c(String paramString, Bundle paramBundle);
  
  public abstract PendingIntent d();
  
  public abstract void d(String paramString, Bundle paramBundle);
  
  public abstract long e();
  
  public abstract void e(String paramString, Bundle paramBundle);
  
  public abstract ParcelableVolumeInfo f();
  
  public abstract MediaMetadataCompat g();
  
  public abstract PlaybackStateCompat h();
  
  public abstract List<MediaSessionCompat.QueueItem> i();
  
  public abstract CharSequence j();
  
  public abstract Bundle k();
  
  public abstract int l();
  
  public abstract boolean m();
  
  public abstract int n();
  
  public abstract boolean o();
  
  public abstract int p();
  
  public abstract void q();
  
  public abstract void r();
  
  public abstract void s();
  
  public abstract void t();
  
  public abstract void u();
  
  public abstract void v();
  
  public abstract void w();
  
  public abstract void x();
  
  public static abstract class a
    extends Binder
    implements b
  {
    public static b a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      if ((localIInterface != null) && ((localIInterface instanceof b))) {
        return (b)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
      case 1: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str8 = paramParcel1.readString();
        Bundle localBundle10;
        if (paramParcel1.readInt() != 0)
        {
          localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label506;
          }
        }
        for (MediaSessionCompat.ResultReceiverWrapper localResultReceiverWrapper = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(paramParcel1);; localResultReceiverWrapper = null)
        {
          a(str8, localBundle10, localResultReceiverWrapper);
          paramParcel2.writeNoException();
          return true;
          localBundle10 = null;
          break;
        }
      case 2: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        KeyEvent localKeyEvent;
        if (paramParcel1.readInt() != 0)
        {
          localKeyEvent = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
          boolean bool6 = a(localKeyEvent);
          paramParcel2.writeNoException();
          if (!bool6) {
            break label573;
          }
        }
        for (int i4 = 1;; i4 = 0)
        {
          paramParcel2.writeInt(i4);
          return true;
          localKeyEvent = null;
          break;
        }
      case 3: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        boolean bool5 = a();
        paramParcel2.writeNoException();
        int i3 = 0;
        if (bool5) {
          i3 = 1;
        }
        paramParcel2.writeInt(i3);
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str7 = b();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str7);
        return true;
      case 7: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str6 = c();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str6);
        return true;
      case 8: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        PendingIntent localPendingIntent = d();
        paramParcel2.writeNoException();
        if (localPendingIntent != null)
        {
          paramParcel2.writeInt(1);
          localPendingIntent.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 9: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        long l = e();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        return true;
      case 10: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        ParcelableVolumeInfo localParcelableVolumeInfo = f();
        paramParcel2.writeNoException();
        if (localParcelableVolumeInfo != null)
        {
          paramParcel2.writeInt(1);
          localParcelableVolumeInfo.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 11: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 12: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 27: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        MediaMetadataCompat localMediaMetadataCompat = g();
        paramParcel2.writeNoException();
        if (localMediaMetadataCompat != null)
        {
          paramParcel2.writeInt(1);
          localMediaMetadataCompat.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 28: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        PlaybackStateCompat localPlaybackStateCompat = h();
        paramParcel2.writeNoException();
        if (localPlaybackStateCompat != null)
        {
          paramParcel2.writeInt(1);
          localPlaybackStateCompat.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 29: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        List localList = i();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(localList);
        return true;
      case 30: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        CharSequence localCharSequence = j();
        paramParcel2.writeNoException();
        if (localCharSequence != null)
        {
          paramParcel2.writeInt(1);
          TextUtils.writeToParcel(localCharSequence, paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 31: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        Bundle localBundle9 = k();
        paramParcel2.writeNoException();
        if (localBundle9 != null)
        {
          paramParcel2.writeInt(1);
          localBundle9.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 32: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        int i2 = l();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i2);
        return true;
      case 45: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        boolean bool4 = m();
        paramParcel2.writeNoException();
        int i1 = 0;
        if (bool4) {
          i1 = 1;
        }
        paramParcel2.writeInt(i1);
        return true;
      case 37: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        int n = n();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(n);
        return true;
      case 38: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        boolean bool3 = o();
        paramParcel2.writeNoException();
        int m = 0;
        if (bool3) {
          m = 1;
        }
        paramParcel2.writeInt(m);
        return true;
      case 47: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        int k = p();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(k);
        return true;
      case 41: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {}
        for (MediaDescriptionCompat localMediaDescriptionCompat3 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localMediaDescriptionCompat3 = null)
        {
          a(localMediaDescriptionCompat3);
          paramParcel2.writeNoException();
          return true;
        }
      case 42: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {}
        for (MediaDescriptionCompat localMediaDescriptionCompat2 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localMediaDescriptionCompat2 = null)
        {
          a(localMediaDescriptionCompat2, paramParcel1.readInt());
          paramParcel2.writeNoException();
          return true;
        }
      case 43: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {}
        for (MediaDescriptionCompat localMediaDescriptionCompat1 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localMediaDescriptionCompat1 = null)
        {
          b(localMediaDescriptionCompat1);
          paramParcel2.writeNoException();
          return true;
        }
      case 44: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 33: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        q();
        paramParcel2.writeNoException();
        return true;
      case 34: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str5 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle8 = null)
        {
          a(str5, localBundle8);
          paramParcel2.writeNoException();
          return true;
        }
      case 35: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str4 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle7 = null)
        {
          b(str4, localBundle7);
          paramParcel2.writeNoException();
          return true;
        }
      case 36: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        Uri localUri2;
        if (paramParcel1.readInt() != 0)
        {
          localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label1555;
          }
        }
        for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle6 = null)
        {
          a(localUri2, localBundle6);
          paramParcel2.writeNoException();
          return true;
          localUri2 = null;
          break;
        }
      case 13: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        r();
        paramParcel2.writeNoException();
        return true;
      case 14: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
        {
          c(str3, localBundle5);
          paramParcel2.writeNoException();
          return true;
        }
      case 15: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
        {
          d(str2, localBundle4);
          paramParcel2.writeNoException();
          return true;
        }
      case 16: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        Uri localUri1;
        if (paramParcel1.readInt() != 0)
        {
          localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label1751;
          }
        }
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
        {
          b(localUri1, localBundle3);
          paramParcel2.writeNoException();
          return true;
          localUri1 = null;
          break;
        }
      case 17: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 18: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        s();
        paramParcel2.writeNoException();
        return true;
      case 19: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        t();
        paramParcel2.writeNoException();
        return true;
      case 20: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        u();
        paramParcel2.writeNoException();
        return true;
      case 21: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        v();
        paramParcel2.writeNoException();
        return true;
      case 22: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        w();
        paramParcel2.writeNoException();
        return true;
      case 23: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        x();
        paramParcel2.writeNoException();
        return true;
      case 24: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 25: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {}
        for (RatingCompat localRatingCompat2 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);; localRatingCompat2 = null)
        {
          a(localRatingCompat2);
          paramParcel2.writeNoException();
          return true;
        }
      case 51: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        RatingCompat localRatingCompat1;
        if (paramParcel1.readInt() != 0)
        {
          localRatingCompat1 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label2006;
          }
        }
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
        {
          a(localRatingCompat1, localBundle2);
          paramParcel2.writeNoException();
          return true;
          localRatingCompat1 = null;
          break;
        }
      case 46: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        int j = paramParcel1.readInt();
        boolean bool2 = false;
        if (j != 0) {
          bool2 = true;
        }
        a(bool2);
        paramParcel2.writeNoException();
        return true;
      case 39: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 40: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        int i = paramParcel1.readInt();
        boolean bool1 = false;
        if (i != 0) {
          bool1 = true;
        }
        b(bool1);
        paramParcel2.writeNoException();
        return true;
      case 48: 
        label506:
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        label573:
        label1751:
        c(paramParcel1.readInt());
        label1555:
        label2006:
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        e(str1, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    
    private static class a
      implements b
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public void a(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeInt(paramInt);
          this.a.transact(44, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void a(int paramInt1, int paramInt2, String paramString)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString);
          this.a.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void a(long paramLong)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeLong(paramLong);
          this.a.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void a(Uri paramUri, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (paramUri != null)
            {
              localParcel1.writeInt(1);
              paramUri.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(36, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void a(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 65	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   33: bipush 41
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 43	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aload_2
        //   58: iconst_0
        //   59: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore 4
        //   67: aload_3
        //   68: invokevirtual 43	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 43	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	78	0	this	a
        //   0	78	1	paramMediaDescriptionCompat	MediaDescriptionCompat
        //   3	69	2	localParcel1	Parcel
        //   7	61	3	localParcel2	Parcel
        //   65	11	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	29	65	finally
        //   29	48	65	finally
        //   57	62	65	finally
      }
      
      /* Error */
      public void a(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +50 -> 66
        //   19: aload_3
        //   20: iconst_1
        //   21: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   24: aload_1
        //   25: aload_3
        //   26: iconst_0
        //   27: invokevirtual 65	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   30: aload_3
        //   31: iload_2
        //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 42
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -41 -> 30
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramMediaDescriptionCompat	MediaDescriptionCompat
        //   0	88	2	paramInt	int
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	15	74	finally
        //   19	30	74	finally
        //   30	56	74	finally
        //   66	71	74	finally
      }
      
      /* Error */
      public void a(RatingCompat paramRatingCompat)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 70	android/support/v4/media/RatingCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   33: bipush 25
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 43	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aload_2
        //   58: iconst_0
        //   59: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore 4
        //   67: aload_3
        //   68: invokevirtual 43	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 43	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	78	0	this	a
        //   0	78	1	paramRatingCompat	RatingCompat
        //   3	69	2	localParcel1	Parcel
        //   7	61	3	localParcel2	Parcel
        //   65	11	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	29	65	finally
        //   29	48	65	finally
        //   57	62	65	finally
      }
      
      public void a(RatingCompat paramRatingCompat, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (paramRatingCompat != null)
            {
              localParcel1.writeInt(1);
              paramRatingCompat.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(51, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void a(a parama)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 78 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 81	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   36: iconst_3
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 37 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 40	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 43	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore 5
        //   62: goto -36 -> 26
        //   65: astore 4
        //   67: aload_3
        //   68: invokevirtual 43	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 43	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	78	0	this	a
        //   0	78	1	parama	a
        //   3	69	2	localParcel1	Parcel
        //   7	61	3	localParcel2	Parcel
        //   65	11	4	localObject	Object
        //   24	37	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	26	65	finally
        //   26	50	65	finally
      }
      
      /* Error */
      public void a(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 47	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 34
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramString	String
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
      
      public void a(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            localParcel1.writeString(paramString);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              if (paramResultReceiverWrapper != null)
              {
                localParcel1.writeInt(1);
                paramResultReceiverWrapper.writeToParcel(localParcel1, 0);
                this.a.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public void a(boolean paramBoolean)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          int i = 0;
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.a.transact(46, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean a()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          boolean bool = false;
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean a(KeyEvent paramKeyEvent)
      {
        boolean bool = true;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (paramKeyEvent != null)
            {
              localParcel1.writeInt(1);
              paramKeyEvent.writeToParcel(localParcel1, 0);
              this.a.transact(2, localParcel1, localParcel2, 0);
              localParcel2.readException();
              int i = localParcel2.readInt();
              if (i != 0) {
                return bool;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            bool = false;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public String b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void b(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeInt(paramInt);
          this.a.transact(39, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void b(int paramInt1, int paramInt2, String paramString)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString);
          this.a.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void b(long paramLong)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeLong(paramLong);
          this.a.transact(24, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void b(Uri paramUri, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (paramUri != null)
            {
              localParcel1.writeInt(1);
              paramUri.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(16, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void b(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 65	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   33: bipush 43
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 43	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aload_2
        //   58: iconst_0
        //   59: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore 4
        //   67: aload_3
        //   68: invokevirtual 43	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 43	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	78	0	this	a
        //   0	78	1	paramMediaDescriptionCompat	MediaDescriptionCompat
        //   3	69	2	localParcel1	Parcel
        //   7	61	3	localParcel2	Parcel
        //   65	11	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	29	65	finally
        //   29	48	65	finally
        //   57	62	65	finally
      }
      
      /* Error */
      public void b(a parama)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 78 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 81	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   36: iconst_4
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 37 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 40	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 43	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore 5
        //   62: goto -36 -> 26
        //   65: astore 4
        //   67: aload_3
        //   68: invokevirtual 43	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 43	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	78	0	this	a
        //   0	78	1	parama	a
        //   3	69	2	localParcel1	Parcel
        //   7	61	3	localParcel2	Parcel
        //   65	11	4	localObject	Object
        //   24	37	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	26	65	finally
        //   26	50	65	finally
      }
      
      /* Error */
      public void b(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 47	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 35
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramString	String
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
      
      public void b(boolean paramBoolean)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          int i = 0;
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.a.transact(40, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public String c()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void c(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          localParcel1.writeInt(paramInt);
          this.a.transact(48, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void c(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 47	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 14
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramString	String
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
      
      /* Error */
      public PendingIntent d()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 8
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 110	android/app/PendingIntent:CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 106	android/app/PendingIntent
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localPendingIntent	PendingIntent
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      /* Error */
      public void d(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 47	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 15
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramString	String
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
      
      public long e()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void e(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 24
        //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 47	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 61	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   39: bipush 26
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 37 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 40	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 43	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 43	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 31	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 43	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 43	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramString	String
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
      
      /* Error */
      public ParcelableVolumeInfo f()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 10
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 126	android/support/v4/media/session/ParcelableVolumeInfo:CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 125	android/support/v4/media/session/ParcelableVolumeInfo
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localParcelableVolumeInfo	ParcelableVolumeInfo
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      /* Error */
      public MediaMetadataCompat g()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 27
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 131	android/support/v4/media/MediaMetadataCompat:CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 130	android/support/v4/media/MediaMetadataCompat
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localMediaMetadataCompat	MediaMetadataCompat
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      /* Error */
      public PlaybackStateCompat h()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 28
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 136	android/support/v4/media/session/PlaybackStateCompat:CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 135	android/support/v4/media/session/PlaybackStateCompat
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localPlaybackStateCompat	PlaybackStateCompat
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      public List<MediaSessionCompat.QueueItem> i()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(29, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ArrayList localArrayList = localParcel2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
          return localArrayList;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public CharSequence j()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 30
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 152	android/text/TextUtils:CHAR_SEQUENCE_CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 154	java/lang/CharSequence
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localCharSequence	CharSequence
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      /* Error */
      public Bundle k()
      {
        // Byte code:
        //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 24
        //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
        //   18: bipush 31
        //   20: aload_1
        //   21: aload_2
        //   22: iconst_0
        //   23: invokeinterface 37 5 0
        //   28: pop
        //   29: aload_2
        //   30: invokevirtual 40	android/os/Parcel:readException	()V
        //   33: aload_2
        //   34: invokevirtual 92	android/os/Parcel:readInt	()I
        //   37: ifeq +28 -> 65
        //   40: getstatic 157	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
        //   43: aload_2
        //   44: invokeinterface 116 2 0
        //   49: checkcast 60	android/os/Bundle
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 43	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 43	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 43	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 43	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	localBundle	Bundle
        // Exception table:
        //   from	to	target	type
        //   8	54	71	finally
      }
      
      public int l()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(32, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean m()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(45, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          boolean bool = false;
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int n()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(37, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean o()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(38, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          boolean bool = false;
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int p()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(47, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void q()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(33, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void r()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void s()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void t()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void u()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void v()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void w()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void x()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          this.a.transact(23, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.b
 * JD-Core Version:    0.7.0.1
 */