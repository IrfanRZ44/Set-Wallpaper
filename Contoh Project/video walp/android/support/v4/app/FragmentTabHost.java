package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private boolean mAttached;
  private int mContainerId;
  private Context mContext;
  private FragmentManager mFragmentManager;
  private TabInfo mLastTab;
  private TabHost.OnTabChangeListener mOnTabChangeListener;
  private FrameLayout mRealTabContent;
  private final ArrayList<TabInfo> mTabs = new ArrayList();
  
  public FragmentTabHost(Context paramContext)
  {
    super(paramContext, null);
    initFragmentTabHost(paramContext, null);
  }
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initFragmentTabHost(paramContext, paramAttributeSet);
  }
  
  private FragmentTransaction doTabChanged(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    TabInfo localTabInfo = getTabInfoForTag(paramString);
    if (this.mLastTab != localTabInfo)
    {
      if (paramFragmentTransaction == null) {
        paramFragmentTransaction = this.mFragmentManager.beginTransaction();
      }
      if ((this.mLastTab != null) && (this.mLastTab.fragment != null)) {
        paramFragmentTransaction.detach(this.mLastTab.fragment);
      }
      if (localTabInfo != null)
      {
        if (localTabInfo.fragment != null) {
          break label112;
        }
        localTabInfo.fragment = Fragment.instantiate(this.mContext, localTabInfo.clss.getName(), localTabInfo.args);
        paramFragmentTransaction.add(this.mContainerId, localTabInfo.fragment, localTabInfo.tag);
      }
    }
    for (;;)
    {
      this.mLastTab = localTabInfo;
      return paramFragmentTransaction;
      label112:
      paramFragmentTransaction.attach(localTabInfo.fragment);
    }
  }
  
  private void ensureContent()
  {
    if (this.mRealTabContent == null)
    {
      this.mRealTabContent = ((FrameLayout)findViewById(this.mContainerId));
      if (this.mRealTabContent == null) {
        throw new IllegalStateException("No tab content FrameLayout found for id " + this.mContainerId);
      }
    }
  }
  
  private void ensureHierarchy(Context paramContext)
  {
    if (findViewById(16908307) == null)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -1));
      TabWidget localTabWidget = new TabWidget(paramContext);
      localTabWidget.setId(16908307);
      localTabWidget.setOrientation(0);
      localLinearLayout.addView(localTabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0F));
      FrameLayout localFrameLayout1 = new FrameLayout(paramContext);
      localFrameLayout1.setId(16908305);
      localLinearLayout.addView(localFrameLayout1, new LinearLayout.LayoutParams(0, 0, 0.0F));
      FrameLayout localFrameLayout2 = new FrameLayout(paramContext);
      this.mRealTabContent = localFrameLayout2;
      this.mRealTabContent.setId(this.mContainerId);
      localLinearLayout.addView(localFrameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0F));
    }
  }
  
  private TabInfo getTabInfoForTag(String paramString)
  {
    int i = this.mTabs.size();
    for (int j = 0; j < i; j++)
    {
      TabInfo localTabInfo = (TabInfo)this.mTabs.get(j);
      if (localTabInfo.tag.equals(paramString)) {
        return localTabInfo;
      }
    }
    return null;
  }
  
  private void initFragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.mContainerId = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }
  
  public void addTab(TabHost.TabSpec paramTabSpec, Class<?> paramClass, Bundle paramBundle)
  {
    paramTabSpec.setContent(new DummyTabFactory(this.mContext));
    String str = paramTabSpec.getTag();
    TabInfo localTabInfo = new TabInfo(str, paramClass, paramBundle);
    if (this.mAttached)
    {
      localTabInfo.fragment = this.mFragmentManager.findFragmentByTag(str);
      if ((localTabInfo.fragment != null) && (!localTabInfo.fragment.isDetached()))
      {
        FragmentTransaction localFragmentTransaction = this.mFragmentManager.beginTransaction();
        localFragmentTransaction.detach(localTabInfo.fragment);
        localFragmentTransaction.commit();
      }
    }
    this.mTabs.add(localTabInfo);
    addTab(paramTabSpec);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    FragmentTransaction localFragmentTransaction1 = null;
    int i = this.mTabs.size();
    int j = 0;
    if (j < i)
    {
      TabInfo localTabInfo = (TabInfo)this.mTabs.get(j);
      localTabInfo.fragment = this.mFragmentManager.findFragmentByTag(localTabInfo.tag);
      if ((localTabInfo.fragment != null) && (!localTabInfo.fragment.isDetached()))
      {
        if (!localTabInfo.tag.equals(str)) {
          break label102;
        }
        this.mLastTab = localTabInfo;
      }
      for (;;)
      {
        j++;
        break;
        label102:
        if (localFragmentTransaction1 == null) {
          localFragmentTransaction1 = this.mFragmentManager.beginTransaction();
        }
        localFragmentTransaction1.detach(localTabInfo.fragment);
      }
    }
    this.mAttached = true;
    FragmentTransaction localFragmentTransaction2 = doTabChanged(str, localFragmentTransaction1);
    if (localFragmentTransaction2 != null)
    {
      localFragmentTransaction2.commit();
      this.mFragmentManager.executePendingTransactions();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mAttached = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.curTab);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.curTab = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (this.mAttached)
    {
      FragmentTransaction localFragmentTransaction = doTabChanged(paramString, null);
      if (localFragmentTransaction != null) {
        localFragmentTransaction.commit();
      }
    }
    if (this.mOnTabChangeListener != null) {
      this.mOnTabChangeListener.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.mOnTabChangeListener = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager)
  {
    ensureHierarchy(paramContext);
    super.setup();
    this.mContext = paramContext;
    this.mFragmentManager = paramFragmentManager;
    ensureContent();
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager, int paramInt)
  {
    ensureHierarchy(paramContext);
    super.setup();
    this.mContext = paramContext;
    this.mFragmentManager = paramFragmentManager;
    this.mContainerId = paramInt;
    ensureContent();
    this.mRealTabContent.setId(paramInt);
    if (getId() == -1) {
      setId(16908306);
    }
  }
  
  static class DummyTabFactory
    implements TabHost.TabContentFactory
  {
    private final Context mContext;
    
    public DummyTabFactory(Context paramContext)
    {
      this.mContext = paramContext;
    }
    
    public View createTabContent(String paramString)
    {
      View localView = new View(this.mContext);
      localView.setMinimumWidth(0);
      localView.setMinimumHeight(0);
      return localView;
    }
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public FragmentTabHost.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new FragmentTabHost.SavedState(paramAnonymousParcel);
      }
      
      public FragmentTabHost.SavedState[] newArray(int paramAnonymousInt)
      {
        return new FragmentTabHost.SavedState[paramAnonymousInt];
      }
    };
    String curTab;
    
    SavedState(Parcel paramParcel)
    {
      super();
      this.curTab = paramParcel.readString();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.curTab);
    }
  }
  
  static final class TabInfo
  {
    final Bundle args;
    final Class<?> clss;
    Fragment fragment;
    final String tag;
    
    TabInfo(String paramString, Class<?> paramClass, Bundle paramBundle)
    {
      this.tag = paramString;
      this.clss = paramClass;
      this.args = paramBundle;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.7.0.1
 */