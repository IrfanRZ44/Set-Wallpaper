package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.a;
import android.support.v7.app.ActionBar.b;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;

public class ScrollingTabContainerView
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final int FADE_DURATION = 200;
  private static final String TAG = "ScrollingTabContainerView";
  private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
  private boolean mAllowCollapse;
  private int mContentHeight;
  int mMaxTabWidth;
  private int mSelectedTabIndex;
  int mStackedTabMaxWidth;
  private b mTabClickListener;
  LinearLayoutCompat mTabLayout;
  Runnable mTabSelector;
  private Spinner mTabSpinner;
  protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
  protected ViewPropertyAnimator mVisibilityAnim;
  
  public ScrollingTabContainerView(Context paramContext)
  {
    super(paramContext);
    setHorizontalScrollBarEnabled(false);
    a locala = a.a(paramContext);
    setContentHeight(locala.e());
    this.mStackedTabMaxWidth = locala.g();
    this.mTabLayout = createTabLayout();
    addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
  }
  
  private Spinner createSpinner()
  {
    AppCompatSpinner localAppCompatSpinner = new AppCompatSpinner(getContext(), null, a.a.actionDropDownStyle);
    localAppCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
    localAppCompatSpinner.setOnItemSelectedListener(this);
    return localAppCompatSpinner;
  }
  
  private LinearLayoutCompat createTabLayout()
  {
    LinearLayoutCompat localLinearLayoutCompat = new LinearLayoutCompat(getContext(), null, a.a.actionBarTabBarStyle);
    localLinearLayoutCompat.setMeasureWithLargestChildEnabled(true);
    localLinearLayoutCompat.setGravity(17);
    localLinearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
    return localLinearLayoutCompat;
  }
  
  private boolean isCollapsed()
  {
    return (this.mTabSpinner != null) && (this.mTabSpinner.getParent() == this);
  }
  
  private void performCollapse()
  {
    if (isCollapsed()) {
      return;
    }
    if (this.mTabSpinner == null) {
      this.mTabSpinner = createSpinner();
    }
    removeView(this.mTabLayout);
    addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
    if (this.mTabSpinner.getAdapter() == null) {
      this.mTabSpinner.setAdapter(new a());
    }
    if (this.mTabSelector != null)
    {
      removeCallbacks(this.mTabSelector);
      this.mTabSelector = null;
    }
    this.mTabSpinner.setSelection(this.mSelectedTabIndex);
  }
  
  private boolean performExpand()
  {
    if (!isCollapsed()) {
      return false;
    }
    removeView(this.mTabSpinner);
    addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.mTabSpinner.getSelectedItemPosition());
    return false;
  }
  
  public void addTab(ActionBar.b paramb, int paramInt, boolean paramBoolean)
  {
    c localc = createTabView(paramb, false);
    this.mTabLayout.addView(localc, paramInt, new LinearLayoutCompat.LayoutParams(0, -1, 1.0F));
    if (this.mTabSpinner != null) {
      ((a)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (paramBoolean) {
      localc.setSelected(true);
    }
    if (this.mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void addTab(ActionBar.b paramb, boolean paramBoolean)
  {
    c localc = createTabView(paramb, false);
    this.mTabLayout.addView(localc, new LinearLayoutCompat.LayoutParams(0, -1, 1.0F));
    if (this.mTabSpinner != null) {
      ((a)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (paramBoolean) {
      localc.setSelected(true);
    }
    if (this.mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void animateToTab(int paramInt)
  {
    final View localView = this.mTabLayout.getChildAt(paramInt);
    if (this.mTabSelector != null) {
      removeCallbacks(this.mTabSelector);
    }
    this.mTabSelector = new Runnable()
    {
      public void run()
      {
        int i = localView.getLeft() - (ScrollingTabContainerView.this.getWidth() - localView.getWidth()) / 2;
        ScrollingTabContainerView.this.smoothScrollTo(i, 0);
        ScrollingTabContainerView.this.mTabSelector = null;
      }
    };
    post(this.mTabSelector);
  }
  
  public void animateToVisibility(int paramInt)
  {
    if (this.mVisibilityAnim != null) {
      this.mVisibilityAnim.cancel();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        setAlpha(0.0F);
      }
      ViewPropertyAnimator localViewPropertyAnimator2 = animate().alpha(1.0F);
      localViewPropertyAnimator2.setDuration(200L);
      localViewPropertyAnimator2.setInterpolator(sAlphaInterpolator);
      localViewPropertyAnimator2.setListener(this.mVisAnimListener.withFinalVisibility(localViewPropertyAnimator2, paramInt));
      localViewPropertyAnimator2.start();
      return;
    }
    ViewPropertyAnimator localViewPropertyAnimator1 = animate().alpha(0.0F);
    localViewPropertyAnimator1.setDuration(200L);
    localViewPropertyAnimator1.setInterpolator(sAlphaInterpolator);
    localViewPropertyAnimator1.setListener(this.mVisAnimListener.withFinalVisibility(localViewPropertyAnimator1, paramInt));
    localViewPropertyAnimator1.start();
  }
  
  c createTabView(ActionBar.b paramb, boolean paramBoolean)
  {
    c localc = new c(getContext(), paramb, paramBoolean);
    if (paramBoolean)
    {
      localc.setBackgroundDrawable(null);
      localc.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
      return localc;
    }
    localc.setFocusable(true);
    if (this.mTabClickListener == null) {
      this.mTabClickListener = new b();
    }
    localc.setOnClickListener(this.mTabClickListener);
    return localc;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mTabSelector != null) {
      post(this.mTabSelector);
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a locala = a.a(getContext());
    setContentHeight(locala.e());
    this.mStackedTabMaxWidth = locala.g();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mTabSelector != null) {
      removeCallbacks(this.mTabSelector);
    }
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((c)paramView).b().d();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label76:
    label91:
    int m;
    if (j == 1073741824)
    {
      bool = i;
      setFillViewport(bool);
      int k = this.mTabLayout.getChildCount();
      if ((k <= i) || ((j != 1073741824) && (j != -2147483648))) {
        break label206;
      }
      if (k <= 2) {
        break label193;
      }
      this.mMaxTabWidth = ((int)(0.4F * View.MeasureSpec.getSize(paramInt1)));
      this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
      m = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
      if ((bool) || (!this.mAllowCollapse)) {
        break label214;
      }
      label115:
      if (i == 0) {
        break label227;
      }
      this.mTabLayout.measure(0, m);
      if (this.mTabLayout.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1)) {
        break label219;
      }
      performCollapse();
    }
    for (;;)
    {
      int n = getMeasuredWidth();
      super.onMeasure(paramInt1, m);
      int i1 = getMeasuredWidth();
      if ((bool) && (n != i1)) {
        setTabSelected(this.mSelectedTabIndex);
      }
      return;
      bool = false;
      break;
      label193:
      this.mMaxTabWidth = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label76;
      label206:
      this.mMaxTabWidth = -1;
      break label91;
      label214:
      i = 0;
      break label115;
      label219:
      performExpand();
      continue;
      label227:
      performExpand();
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void removeAllTabs()
  {
    this.mTabLayout.removeAllViews();
    if (this.mTabSpinner != null) {
      ((a)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (this.mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void removeTabAt(int paramInt)
  {
    this.mTabLayout.removeViewAt(paramInt);
    if (this.mTabSpinner != null) {
      ((a)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (this.mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void setAllowCollapse(boolean paramBoolean)
  {
    this.mAllowCollapse = paramBoolean;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.mContentHeight = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    this.mSelectedTabIndex = paramInt;
    int i = this.mTabLayout.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = this.mTabLayout.getChildAt(j);
      if (j == paramInt) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        if (bool) {
          animateToTab(paramInt);
        }
        j++;
        break;
      }
    }
    if ((this.mTabSpinner != null) && (paramInt >= 0)) {
      this.mTabSpinner.setSelection(paramInt);
    }
  }
  
  public void updateTab(int paramInt)
  {
    ((c)this.mTabLayout.getChildAt(paramInt)).a();
    if (this.mTabSpinner != null) {
      ((a)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (this.mAllowCollapse) {
      requestLayout();
    }
  }
  
  protected class VisibilityAnimListener
    extends AnimatorListenerAdapter
  {
    private boolean mCanceled = false;
    private int mFinalVisibility;
    
    protected VisibilityAnimListener() {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      this.mCanceled = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (this.mCanceled) {
        return;
      }
      ScrollingTabContainerView.this.mVisibilityAnim = null;
      ScrollingTabContainerView.this.setVisibility(this.mFinalVisibility);
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      ScrollingTabContainerView.this.setVisibility(0);
      this.mCanceled = false;
    }
    
    public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator paramViewPropertyAnimator, int paramInt)
    {
      this.mFinalVisibility = paramInt;
      ScrollingTabContainerView.this.mVisibilityAnim = paramViewPropertyAnimator;
      return this;
    }
  }
  
  private class a
    extends BaseAdapter
  {
    a() {}
    
    public int getCount()
    {
      return ScrollingTabContainerView.this.mTabLayout.getChildCount();
    }
    
    public Object getItem(int paramInt)
    {
      return ((ScrollingTabContainerView.c)ScrollingTabContainerView.this.mTabLayout.getChildAt(paramInt)).b();
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        return ScrollingTabContainerView.this.createTabView((ActionBar.b)getItem(paramInt), true);
      }
      ((ScrollingTabContainerView.c)paramView).a((ActionBar.b)getItem(paramInt));
      return paramView;
    }
  }
  
  private class b
    implements View.OnClickListener
  {
    b() {}
    
    public void onClick(View paramView)
    {
      ((ScrollingTabContainerView.c)paramView).b().d();
      int i = ScrollingTabContainerView.this.mTabLayout.getChildCount();
      int j = 0;
      if (j < i)
      {
        View localView = ScrollingTabContainerView.this.mTabLayout.getChildAt(j);
        if (localView == paramView) {}
        for (boolean bool = true;; bool = false)
        {
          localView.setSelected(bool);
          j++;
          break;
        }
      }
    }
  }
  
  private class c
    extends LinearLayout
  {
    private final int[] b = { 16842964 };
    private ActionBar.b c;
    private TextView d;
    private ImageView e;
    private View f;
    
    public c(Context paramContext, ActionBar.b paramb, boolean paramBoolean)
    {
      super(null, a.a.actionBarTabStyle);
      this.c = paramb;
      TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, null, this.b, a.a.actionBarTabStyle, 0);
      if (localTintTypedArray.hasValue(0)) {
        setBackgroundDrawable(localTintTypedArray.getDrawable(0));
      }
      localTintTypedArray.recycle();
      if (paramBoolean) {
        setGravity(8388627);
      }
      a();
    }
    
    public void a()
    {
      ActionBar.b localb = this.c;
      View localView = localb.c();
      if (localView != null)
      {
        ViewParent localViewParent = localView.getParent();
        if (localViewParent != this)
        {
          if (localViewParent != null) {
            ((ViewGroup)localViewParent).removeView(localView);
          }
          addView(localView);
        }
        this.f = localView;
        if (this.d != null) {
          this.d.setVisibility(8);
        }
        if (this.e != null)
        {
          this.e.setVisibility(8);
          this.e.setImageDrawable(null);
        }
        return;
      }
      if (this.f != null)
      {
        removeView(this.f);
        this.f = null;
      }
      Drawable localDrawable = localb.a();
      CharSequence localCharSequence1 = localb.b();
      int i;
      if (localDrawable != null)
      {
        if (this.e == null)
        {
          AppCompatImageView localAppCompatImageView = new AppCompatImageView(getContext());
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams2.gravity = 16;
          localAppCompatImageView.setLayoutParams(localLayoutParams2);
          addView(localAppCompatImageView, 0);
          this.e = localAppCompatImageView;
        }
        this.e.setImageDrawable(localDrawable);
        this.e.setVisibility(0);
        if (TextUtils.isEmpty(localCharSequence1)) {
          break label366;
        }
        i = 1;
        label213:
        if (i == 0) {
          break label372;
        }
        if (this.d == null)
        {
          AppCompatTextView localAppCompatTextView = new AppCompatTextView(getContext(), null, a.a.actionBarTabTextStyle);
          localAppCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams1.gravity = 16;
          localAppCompatTextView.setLayoutParams(localLayoutParams1);
          addView(localAppCompatTextView);
          this.d = localAppCompatTextView;
        }
        this.d.setText(localCharSequence1);
        this.d.setVisibility(0);
        label306:
        if (this.e != null) {
          this.e.setContentDescription(localb.e());
        }
        if (i == 0) {
          break label399;
        }
      }
      label399:
      for (CharSequence localCharSequence2 = null;; localCharSequence2 = localb.e())
      {
        TooltipCompat.setTooltipText(this, localCharSequence2);
        return;
        if (this.e == null) {
          break;
        }
        this.e.setVisibility(8);
        this.e.setImageDrawable(null);
        break;
        label366:
        i = 0;
        break label213;
        label372:
        if (this.d == null) {
          break label306;
        }
        this.d.setVisibility(8);
        this.d.setText(null);
        break label306;
      }
    }
    
    public void a(ActionBar.b paramb)
    {
      this.c = paramb;
      a();
    }
    
    public ActionBar.b b()
    {
      return this.c;
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.b.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
    }
    
    public void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if ((ScrollingTabContainerView.this.mMaxTabWidth > 0) && (getMeasuredWidth() > ScrollingTabContainerView.this.mMaxTabWidth)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.mMaxTabWidth, 1073741824), paramInt2);
      }
    }
    
    public void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean)) {
          sendAccessibilityEvent(4);
        }
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ScrollingTabContainerView
 * JD-Core Version:    0.7.0.1
 */