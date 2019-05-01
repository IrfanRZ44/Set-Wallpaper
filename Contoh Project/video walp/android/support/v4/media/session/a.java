package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract interface a
  extends IInterface
{
  public abstract void a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(MediaMetadataCompat paramMediaMetadataCompat);
  
  public abstract void a(ParcelableVolumeInfo paramParcelableVolumeInfo);
  
  public abstract void a(PlaybackStateCompat paramPlaybackStateCompat);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract void a(String paramString, Bundle paramBundle);
  
  public abstract void a(List<MediaSessionCompat.QueueItem> paramList);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }
    
    public static a a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
      if ((localIInterface != null) && ((localIInterface instanceof a))) {
        return (a)localIInterface;
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
        paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
      case 1: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        String str = paramParcel1.readString();
        int i2 = paramParcel1.readInt();
        Bundle localBundle2 = null;
        if (i2 != 0) {
          localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(str, localBundle2);
        return true;
      case 2: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        a();
        return true;
      case 3: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int i1 = paramParcel1.readInt();
        PlaybackStateCompat localPlaybackStateCompat = null;
        if (i1 != 0) {
          localPlaybackStateCompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
        }
        a(localPlaybackStateCompat);
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int n = paramParcel1.readInt();
        MediaMetadataCompat localMediaMetadataCompat = null;
        if (n != 0) {
          localMediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
        }
        a(localMediaMetadataCompat);
        return true;
      case 5: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        a(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int m = paramParcel1.readInt();
        CharSequence localCharSequence = null;
        if (m != 0) {
          localCharSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
        }
        a(localCharSequence);
        return true;
      case 7: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int k = paramParcel1.readInt();
        Bundle localBundle1 = null;
        if (k != 0) {
          localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(localBundle1);
        return true;
      case 8: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int j = paramParcel1.readInt();
        ParcelableVolumeInfo localParcelableVolumeInfo = null;
        if (j != 0) {
          localParcelableVolumeInfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
        }
        a(localParcelableVolumeInfo);
        return true;
      case 9: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        a(paramParcel1.readInt());
        return true;
      case 10: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool2 = true;; bool2 = false)
        {
          a(bool2);
          return true;
        }
      case 11: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        int i = paramParcel1.readInt();
        boolean bool1 = false;
        if (i != 0) {
          bool1 = true;
        }
        b(bool1);
        return true;
      case 12: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        b(paramParcel1.readInt());
        return true;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      b();
      return true;
    }
    
    private static class a
      implements a
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public void a()
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
          this.a.transact(2, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void a(int paramInt)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
          localParcel.writeInt(paramInt);
          this.a.transact(9, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +34 -> 45
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 47	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   29: bipush 7
        //   31: aload_2
        //   32: aconst_null
        //   33: iconst_1
        //   34: invokeinterface 33 5 0
        //   39: pop
        //   40: aload_2
        //   41: invokevirtual 36	android/os/Parcel:recycle	()V
        //   44: return
        //   45: aload_2
        //   46: iconst_0
        //   47: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   50: goto -25 -> 25
        //   53: astore_3
        //   54: aload_2
        //   55: invokevirtual 36	android/os/Parcel:recycle	()V
        //   58: aload_3
        //   59: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	60	0	this	a
        //   0	60	1	paramBundle	Bundle
        //   3	52	2	localParcel	Parcel
        //   53	6	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	10	53	finally
        //   14	25	53	finally
        //   25	40	53	finally
        //   45	50	53	finally
      }
      
      /* Error */
      public void a(MediaMetadataCompat paramMediaMetadataCompat)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 51	android/support/v4/media/MediaMetadataCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   29: iconst_4
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 33 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 36	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_3
        //   53: aload_2
        //   54: invokevirtual 36	android/os/Parcel:recycle	()V
        //   57: aload_3
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramMediaMetadataCompat	MediaMetadataCompat
        //   3	51	2	localParcel	Parcel
        //   52	6	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      /* Error */
      public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +34 -> 45
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 55	android/support/v4/media/session/ParcelableVolumeInfo:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   29: bipush 8
        //   31: aload_2
        //   32: aconst_null
        //   33: iconst_1
        //   34: invokeinterface 33 5 0
        //   39: pop
        //   40: aload_2
        //   41: invokevirtual 36	android/os/Parcel:recycle	()V
        //   44: return
        //   45: aload_2
        //   46: iconst_0
        //   47: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   50: goto -25 -> 25
        //   53: astore_3
        //   54: aload_2
        //   55: invokevirtual 36	android/os/Parcel:recycle	()V
        //   58: aload_3
        //   59: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	60	0	this	a
        //   0	60	1	paramParcelableVolumeInfo	ParcelableVolumeInfo
        //   3	52	2	localParcel	Parcel
        //   53	6	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	10	53	finally
        //   14	25	53	finally
        //   25	40	53	finally
        //   45	50	53	finally
      }
      
      /* Error */
      public void a(PlaybackStateCompat paramPlaybackStateCompat)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 59	android/support/v4/media/session/PlaybackStateCompat:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   29: iconst_3
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 33 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 36	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_3
        //   53: aload_2
        //   54: invokevirtual 36	android/os/Parcel:recycle	()V
        //   57: aload_3
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramPlaybackStateCompat	PlaybackStateCompat
        //   3	51	2	localParcel	Parcel
        //   52	6	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      /* Error */
      public void a(CharSequence paramCharSequence)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +34 -> 45
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokestatic 65	android/text/TextUtils:writeToParcel	(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   29: bipush 6
        //   31: aload_2
        //   32: aconst_null
        //   33: iconst_1
        //   34: invokeinterface 33 5 0
        //   39: pop
        //   40: aload_2
        //   41: invokevirtual 36	android/os/Parcel:recycle	()V
        //   44: return
        //   45: aload_2
        //   46: iconst_0
        //   47: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   50: goto -25 -> 25
        //   53: astore_3
        //   54: aload_2
        //   55: invokevirtual 36	android/os/Parcel:recycle	()V
        //   58: aload_3
        //   59: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	60	0	this	a
        //   0	60	1	paramCharSequence	CharSequence
        //   3	52	2	localParcel	Parcel
        //   53	6	3	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	10	53	finally
        //   14	25	53	finally
        //   25	40	53	finally
        //   45	50	53	finally
      }
      
      /* Error */
      public void a(String paramString, Bundle paramBundle)
      {
        // Byte code:
        //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: aload_3
        //   5: ldc 23
        //   7: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_3
        //   11: aload_1
        //   12: invokevirtual 69	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   15: aload_2
        //   16: ifnull +33 -> 49
        //   19: aload_3
        //   20: iconst_1
        //   21: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   24: aload_2
        //   25: aload_3
        //   26: iconst_0
        //   27: invokevirtual 47	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   30: aload_0
        //   31: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   34: iconst_1
        //   35: aload_3
        //   36: aconst_null
        //   37: iconst_1
        //   38: invokeinterface 33 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 36	android/os/Parcel:recycle	()V
        //   48: return
        //   49: aload_3
        //   50: iconst_0
        //   51: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   54: goto -24 -> 30
        //   57: astore 4
        //   59: aload_3
        //   60: invokevirtual 36	android/os/Parcel:recycle	()V
        //   63: aload 4
        //   65: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	66	0	this	a
        //   0	66	1	paramString	String
        //   0	66	2	paramBundle	Bundle
        //   3	57	3	localParcel	Parcel
        //   57	7	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   4	15	57	finally
        //   19	30	57	finally
        //   30	44	57	finally
        //   49	54	57	finally
      }
      
      public void a(List<MediaSessionCompat.QueueItem> paramList)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
          localParcel.writeTypedList(paramList);
          this.a.transact(5, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore_3
        //   6: aload_3
        //   7: ldc 23
        //   9: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: iload_1
        //   13: ifeq +28 -> 41
        //   16: aload_3
        //   17: iload_2
        //   18: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   21: aload_0
        //   22: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   25: bipush 10
        //   27: aload_3
        //   28: aconst_null
        //   29: iconst_1
        //   30: invokeinterface 33 5 0
        //   35: pop
        //   36: aload_3
        //   37: invokevirtual 36	android/os/Parcel:recycle	()V
        //   40: return
        //   41: iconst_0
        //   42: istore_2
        //   43: goto -27 -> 16
        //   46: astore 4
        //   48: aload_3
        //   49: invokevirtual 36	android/os/Parcel:recycle	()V
        //   52: aload 4
        //   54: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	55	0	this	a
        //   0	55	1	paramBoolean	boolean
        //   1	42	2	i	int
        //   5	44	3	localParcel	Parcel
        //   46	7	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   6	12	46	finally
        //   16	36	46	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public void b()
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
          this.a.transact(13, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void b(int paramInt)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
          localParcel.writeInt(paramInt);
          this.a.transact(12, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void b(boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore_3
        //   6: aload_3
        //   7: ldc 23
        //   9: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: iload_1
        //   13: ifeq +28 -> 41
        //   16: aload_3
        //   17: iload_2
        //   18: invokevirtual 40	android/os/Parcel:writeInt	(I)V
        //   21: aload_0
        //   22: getfield 15	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
        //   25: bipush 11
        //   27: aload_3
        //   28: aconst_null
        //   29: iconst_1
        //   30: invokeinterface 33 5 0
        //   35: pop
        //   36: aload_3
        //   37: invokevirtual 36	android/os/Parcel:recycle	()V
        //   40: return
        //   41: iconst_0
        //   42: istore_2
        //   43: goto -27 -> 16
        //   46: astore 4
        //   48: aload_3
        //   49: invokevirtual 36	android/os/Parcel:recycle	()V
        //   52: aload 4
        //   54: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	55	0	this	a
        //   0	55	1	paramBoolean	boolean
        //   1	42	2	i	int
        //   5	44	3	localParcel	Parcel
        //   46	7	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   6	12	46	finally
        //   16	36	46	finally
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.a
 * JD-Core Version:    0.7.0.1
 */