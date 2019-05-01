package android.support.v4.app;

import android.arch.lifecycle.h;
import android.arch.lifecycle.m;
import android.arch.lifecycle.s;
import android.arch.lifecycle.t;
import android.arch.lifecycle.t.b;
import android.arch.lifecycle.v;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.b;
import android.support.v4.content.b.a;
import android.support.v4.f.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl
  extends LoaderManager
{
  static boolean DEBUG = false;
  static final String TAG = "LoaderManager";
  private boolean mCreatingLoader;
  private final h mLifecycleOwner;
  private final LoaderViewModel mLoaderViewModel;
  
  LoaderManagerImpl(h paramh, v paramv)
  {
    this.mLifecycleOwner = paramh;
    this.mLoaderViewModel = LoaderViewModel.getInstance(paramv);
  }
  
  private <D> b<D> createAndInstallLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks, b<D> paramb)
  {
    b localb;
    try
    {
      this.mCreatingLoader = true;
      localb = paramLoaderCallbacks.onCreateLoader(paramInt, paramBundle);
      if ((localb.getClass().isMemberClass()) && (!Modifier.isStatic(localb.getClass().getModifiers()))) {
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + localb);
      }
    }
    finally
    {
      this.mCreatingLoader = false;
    }
    LoaderInfo localLoaderInfo = new LoaderInfo(paramInt, paramBundle, localb, paramb);
    if (DEBUG) {
      Log.v("LoaderManager", "  Created new loader " + localLoaderInfo);
    }
    this.mLoaderViewModel.putLoader(paramInt, localLoaderInfo);
    this.mCreatingLoader = false;
    return localLoaderInfo.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
  }
  
  public void destroyLoader(int paramInt)
  {
    if (this.mCreatingLoader) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (Looper.getMainLooper() != Looper.myLooper()) {
      throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    if (DEBUG) {
      Log.v("LoaderManager", "destroyLoader in " + this + " of " + paramInt);
    }
    LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
    if (localLoaderInfo != null)
    {
      localLoaderInfo.destroy(true);
      this.mLoaderViewModel.removeLoader(paramInt);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.mLoaderViewModel.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public <D> b<D> getLoader(int paramInt)
  {
    if (this.mCreatingLoader) {
      throw new IllegalStateException("Called while creating a loader");
    }
    LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
    if (localLoaderInfo != null) {
      return localLoaderInfo.getLoader();
    }
    return null;
  }
  
  public boolean hasRunningLoaders()
  {
    return this.mLoaderViewModel.hasRunningLoaders();
  }
  
  public <D> b<D> initLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (this.mCreatingLoader) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (Looper.getMainLooper() != Looper.myLooper()) {
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
    if (DEBUG) {
      Log.v("LoaderManager", "initLoader in " + this + ": args=" + paramBundle);
    }
    if (localLoaderInfo == null) {
      return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, null);
    }
    if (DEBUG) {
      Log.v("LoaderManager", "  Re-using existing loader " + localLoaderInfo);
    }
    return localLoaderInfo.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
  }
  
  void markForRedelivery()
  {
    this.mLoaderViewModel.markForRedelivery();
  }
  
  public <D> b<D> restartLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (this.mCreatingLoader) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (Looper.getMainLooper() != Looper.myLooper()) {
      throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    if (DEBUG) {
      Log.v("LoaderManager", "restartLoader in " + this + ": args=" + paramBundle);
    }
    LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
    b localb = null;
    if (localLoaderInfo != null) {
      localb = localLoaderInfo.destroy(false);
    }
    return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, localb);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    d.a(this.mLifecycleOwner, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static class LoaderInfo<D>
    extends m<D>
    implements b.a<D>
  {
    private final Bundle mArgs;
    private final int mId;
    private h mLifecycleOwner;
    private final b<D> mLoader;
    private LoaderManagerImpl.LoaderObserver<D> mObserver;
    private b<D> mPriorLoader;
    
    LoaderInfo(int paramInt, Bundle paramBundle, b<D> paramb1, b<D> paramb2)
    {
      this.mId = paramInt;
      this.mArgs = paramBundle;
      this.mLoader = paramb1;
      this.mPriorLoader = paramb2;
      this.mLoader.a(paramInt, this);
    }
    
    b<D> destroy(boolean paramBoolean)
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Destroying: " + this);
      }
      this.mLoader.c();
      this.mLoader.g();
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if (localLoaderObserver != null)
      {
        removeObserver(localLoaderObserver);
        if (paramBoolean) {
          localLoaderObserver.reset();
        }
      }
      this.mLoader.a(this);
      if (((localLoaderObserver != null) && (!localLoaderObserver.hasDeliveredData())) || (paramBoolean))
      {
        this.mLoader.i();
        return this.mPriorLoader;
      }
      return this.mLoader;
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.mArgs);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.mLoader);
      this.mLoader.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if (this.mObserver != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(this.mObserver);
        this.mObserver.dump(paramString + "  ", paramPrintWriter);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(getLoader().a(getValue()));
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.println(hasActiveObservers());
    }
    
    b<D> getLoader()
    {
      return this.mLoader;
    }
    
    boolean isCallbackWaitingForData()
    {
      if (!hasActiveObservers()) {}
      while ((this.mObserver == null) || (this.mObserver.hasDeliveredData())) {
        return false;
      }
      return true;
    }
    
    void markForRedelivery()
    {
      h localh = this.mLifecycleOwner;
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if ((localh != null) && (localLoaderObserver != null))
      {
        super.removeObserver(localLoaderObserver);
        observe(localh, localLoaderObserver);
      }
    }
    
    protected void onActive()
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Starting: " + this);
      }
      this.mLoader.a();
    }
    
    protected void onInactive()
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Stopping: " + this);
      }
      this.mLoader.e();
    }
    
    public void onLoadComplete(b<D> paramb, D paramD)
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "onLoadComplete: " + this);
      }
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        setValue(paramD);
        return;
      }
      if (LoaderManagerImpl.DEBUG) {
        Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
      }
      postValue(paramD);
    }
    
    public void removeObserver(android.arch.lifecycle.n<D> paramn)
    {
      super.removeObserver(paramn);
      this.mLifecycleOwner = null;
      this.mObserver = null;
    }
    
    b<D> setCallback(h paramh, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      LoaderManagerImpl.LoaderObserver localLoaderObserver = new LoaderManagerImpl.LoaderObserver(this.mLoader, paramLoaderCallbacks);
      observe(paramh, localLoaderObserver);
      if (this.mObserver != null) {
        removeObserver(this.mObserver);
      }
      this.mLifecycleOwner = paramh;
      this.mObserver = localLoaderObserver;
      return this.mLoader;
    }
    
    public void setValue(D paramD)
    {
      super.setValue(paramD);
      if (this.mPriorLoader != null)
      {
        this.mPriorLoader.i();
        this.mPriorLoader = null;
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      d.a(this.mLoader, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
  
  static class LoaderObserver<D>
    implements android.arch.lifecycle.n<D>
  {
    private final LoaderManager.LoaderCallbacks<D> mCallback;
    private boolean mDeliveredData = false;
    private final b<D> mLoader;
    
    LoaderObserver(b<D> paramb, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      this.mLoader = paramb;
      this.mCallback = paramLoaderCallbacks;
    }
    
    public void dump(String paramString, PrintWriter paramPrintWriter)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mDeliveredData=");
      paramPrintWriter.println(this.mDeliveredData);
    }
    
    boolean hasDeliveredData()
    {
      return this.mDeliveredData;
    }
    
    public void onChanged(D paramD)
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  onLoadFinished in " + this.mLoader + ": " + this.mLoader.a(paramD));
      }
      this.mCallback.onLoadFinished(this.mLoader, paramD);
      this.mDeliveredData = true;
    }
    
    void reset()
    {
      if (this.mDeliveredData)
      {
        if (LoaderManagerImpl.DEBUG) {
          Log.v("LoaderManager", "  Resetting: " + this.mLoader);
        }
        this.mCallback.onLoaderReset(this.mLoader);
      }
    }
    
    public String toString()
    {
      return this.mCallback.toString();
    }
  }
  
  static class LoaderViewModel
    extends s
  {
    private static final t.b FACTORY = new t.b()
    {
      public <T extends s> T create(Class<T> paramAnonymousClass)
      {
        return new LoaderManagerImpl.LoaderViewModel();
      }
    };
    private android.support.v4.f.n<LoaderManagerImpl.LoaderInfo> mLoaders = new android.support.v4.f.n();
    
    static LoaderViewModel getInstance(v paramv)
    {
      return (LoaderViewModel)new t(paramv, FACTORY).a(LoaderViewModel.class);
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (this.mLoaders.b() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        String str = paramString + "    ";
        for (int i = 0; i < this.mLoaders.b(); i++)
        {
          LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mLoaders.e(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(this.mLoaders.d(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localLoaderInfo.toString());
          localLoaderInfo.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    
    <D> LoaderManagerImpl.LoaderInfo<D> getLoader(int paramInt)
    {
      return (LoaderManagerImpl.LoaderInfo)this.mLoaders.a(paramInt);
    }
    
    boolean hasRunningLoaders()
    {
      int i = this.mLoaders.b();
      for (int j = 0; j < i; j++) {
        if (((LoaderManagerImpl.LoaderInfo)this.mLoaders.e(j)).isCallbackWaitingForData()) {
          return true;
        }
      }
      return false;
    }
    
    void markForRedelivery()
    {
      int i = this.mLoaders.b();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.e(j)).markForRedelivery();
      }
    }
    
    protected void onCleared()
    {
      super.onCleared();
      int i = this.mLoaders.b();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.e(j)).destroy(true);
      }
      this.mLoaders.c();
    }
    
    void putLoader(int paramInt, LoaderManagerImpl.LoaderInfo paramLoaderInfo)
    {
      this.mLoaders.b(paramInt, paramLoaderInfo);
    }
    
    void removeLoader(int paramInt)
    {
      this.mLoaders.c(paramInt);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.LoaderManagerImpl
 * JD-Core Version:    0.7.0.1
 */