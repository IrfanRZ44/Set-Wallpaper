package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.f;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.h;
import android.support.v7.a.a.j;
import android.support.v7.view.c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView
  extends LinearLayoutCompat
  implements c
{
  static final boolean DBG = false;
  static final a HIDDEN_METHOD_INVOKER = new a();
  private static final String IME_OPTION_NO_MICROPHONE = "nm";
  static final String LOG_TAG = "SearchView";
  private Bundle mAppSearchData;
  private boolean mClearingFocus;
  final ImageView mCloseButton;
  private final ImageView mCollapsedIcon;
  private int mCollapsedImeOptions;
  private final CharSequence mDefaultQueryHint;
  private final View mDropDownAnchor;
  private boolean mExpandedInActionView;
  final ImageView mGoButton;
  private boolean mIconified;
  private boolean mIconifiedByDefault;
  private int mMaxWidth;
  private CharSequence mOldQueryText;
  private final View.OnClickListener mOnClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == SearchView.this.mSearchButton) {
        SearchView.this.onSearchClicked();
      }
      do
      {
        return;
        if (paramAnonymousView == SearchView.this.mCloseButton)
        {
          SearchView.this.onCloseClicked();
          return;
        }
        if (paramAnonymousView == SearchView.this.mGoButton)
        {
          SearchView.this.onSubmitQuery();
          return;
        }
        if (paramAnonymousView == SearchView.this.mVoiceButton)
        {
          SearchView.this.onVoiceClicked();
          return;
        }
      } while (paramAnonymousView != SearchView.this.mSearchSrcTextView);
      SearchView.this.forceSuggestionQuery();
    }
  };
  private OnCloseListener mOnCloseListener;
  private final TextView.OnEditorActionListener mOnEditorActionListener = new TextView.OnEditorActionListener()
  {
    public boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      SearchView.this.onSubmitQuery();
      return true;
    }
  };
  private final AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.this.onItemClicked(paramAnonymousInt, 0, null);
    }
  };
  private final AdapterView.OnItemSelectedListener mOnItemSelectedListener = new AdapterView.OnItemSelectedListener()
  {
    public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.this.onItemSelected(paramAnonymousInt);
    }
    
    public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
  };
  private OnQueryTextListener mOnQueryChangeListener;
  View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
  private View.OnClickListener mOnSearchClickListener;
  private OnSuggestionListener mOnSuggestionListener;
  private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache = new WeakHashMap();
  private CharSequence mQueryHint;
  private boolean mQueryRefinement;
  private Runnable mReleaseCursorRunnable = new Runnable()
  {
    public void run()
    {
      if ((SearchView.this.mSuggestionsAdapter != null) && ((SearchView.this.mSuggestionsAdapter instanceof ab))) {
        SearchView.this.mSuggestionsAdapter.a(null);
      }
    }
  };
  final ImageView mSearchButton;
  private final View mSearchEditFrame;
  private final Drawable mSearchHintIcon;
  private final View mSearchPlate;
  final SearchAutoComplete mSearchSrcTextView;
  private Rect mSearchSrcTextViewBounds = new Rect();
  private Rect mSearchSrtTextViewBoundsExpanded = new Rect();
  SearchableInfo mSearchable;
  private final View mSubmitArea;
  private boolean mSubmitButtonEnabled;
  private final int mSuggestionCommitIconResId;
  private final int mSuggestionRowLayout;
  f mSuggestionsAdapter;
  private int[] mTemp = new int[2];
  private int[] mTemp2 = new int[2];
  View.OnKeyListener mTextKeyListener = new View.OnKeyListener()
  {
    public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      if (SearchView.this.mSearchable == null) {}
      do
      {
        return false;
        if ((SearchView.this.mSearchSrcTextView.isPopupShowing()) && (SearchView.this.mSearchSrcTextView.getListSelection() != -1)) {
          return SearchView.this.onSuggestionsKey(paramAnonymousView, paramAnonymousInt, paramAnonymousKeyEvent);
        }
      } while ((SearchView.SearchAutoComplete.access$100(SearchView.this.mSearchSrcTextView)) || (!paramAnonymousKeyEvent.hasNoModifiers()) || (paramAnonymousKeyEvent.getAction() != 1) || (paramAnonymousInt != 66));
      paramAnonymousView.cancelLongPress();
      SearchView.this.launchQuerySearch(0, null, SearchView.this.mSearchSrcTextView.getText().toString());
      return true;
    }
  };
  private TextWatcher mTextWatcher = new TextWatcher()
  {
    public void afterTextChanged(Editable paramAnonymousEditable) {}
    
    public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      SearchView.this.onTextChanged(paramAnonymousCharSequence);
    }
  };
  private b mTouchDelegate;
  private final Runnable mUpdateDrawableStateRunnable = new Runnable()
  {
    public void run()
    {
      SearchView.this.updateFocusedState();
    }
  };
  private CharSequence mUserQuery;
  private final Intent mVoiceAppSearchIntent;
  final ImageView mVoiceButton;
  private boolean mVoiceButtonEnabled;
  private final Intent mVoiceWebSearchIntent;
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, a.j.SearchView, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(localTintTypedArray.getResourceId(a.j.SearchView_layout, a.g.abc_search_view), this, true);
    this.mSearchSrcTextView = ((SearchAutoComplete)findViewById(a.f.search_src_text));
    this.mSearchSrcTextView.setSearchView(this);
    this.mSearchEditFrame = findViewById(a.f.search_edit_frame);
    this.mSearchPlate = findViewById(a.f.search_plate);
    this.mSubmitArea = findViewById(a.f.submit_area);
    this.mSearchButton = ((ImageView)findViewById(a.f.search_button));
    this.mGoButton = ((ImageView)findViewById(a.f.search_go_btn));
    this.mCloseButton = ((ImageView)findViewById(a.f.search_close_btn));
    this.mVoiceButton = ((ImageView)findViewById(a.f.search_voice_btn));
    this.mCollapsedIcon = ((ImageView)findViewById(a.f.search_mag_icon));
    s.a(this.mSearchPlate, localTintTypedArray.getDrawable(a.j.SearchView_queryBackground));
    s.a(this.mSubmitArea, localTintTypedArray.getDrawable(a.j.SearchView_submitBackground));
    this.mSearchButton.setImageDrawable(localTintTypedArray.getDrawable(a.j.SearchView_searchIcon));
    this.mGoButton.setImageDrawable(localTintTypedArray.getDrawable(a.j.SearchView_goIcon));
    this.mCloseButton.setImageDrawable(localTintTypedArray.getDrawable(a.j.SearchView_closeIcon));
    this.mVoiceButton.setImageDrawable(localTintTypedArray.getDrawable(a.j.SearchView_voiceIcon));
    this.mCollapsedIcon.setImageDrawable(localTintTypedArray.getDrawable(a.j.SearchView_searchIcon));
    this.mSearchHintIcon = localTintTypedArray.getDrawable(a.j.SearchView_searchHintIcon);
    TooltipCompat.setTooltipText(this.mSearchButton, getResources().getString(a.h.abc_searchview_description_search));
    this.mSuggestionRowLayout = localTintTypedArray.getResourceId(a.j.SearchView_suggestionRowLayout, a.g.abc_search_dropdown_item_icons_2line);
    this.mSuggestionCommitIconResId = localTintTypedArray.getResourceId(a.j.SearchView_commitIcon, 0);
    this.mSearchButton.setOnClickListener(this.mOnClickListener);
    this.mCloseButton.setOnClickListener(this.mOnClickListener);
    this.mGoButton.setOnClickListener(this.mOnClickListener);
    this.mVoiceButton.setOnClickListener(this.mOnClickListener);
    this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
    this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
    this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
    this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
    this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
    this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
    this.mSearchSrcTextView.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
          SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, paramAnonymousBoolean);
        }
      }
    });
    setIconifiedByDefault(localTintTypedArray.getBoolean(a.j.SearchView_iconifiedByDefault, true));
    int i = localTintTypedArray.getDimensionPixelSize(a.j.SearchView_android_maxWidth, -1);
    if (i != -1) {
      setMaxWidth(i);
    }
    this.mDefaultQueryHint = localTintTypedArray.getText(a.j.SearchView_defaultQueryHint);
    this.mQueryHint = localTintTypedArray.getText(a.j.SearchView_queryHint);
    int j = localTintTypedArray.getInt(a.j.SearchView_android_imeOptions, -1);
    if (j != -1) {
      setImeOptions(j);
    }
    int k = localTintTypedArray.getInt(a.j.SearchView_android_inputType, -1);
    if (k != -1) {
      setInputType(k);
    }
    setFocusable(localTintTypedArray.getBoolean(a.j.SearchView_android_focusable, true));
    localTintTypedArray.recycle();
    this.mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
    this.mVoiceWebSearchIntent.addFlags(268435456);
    this.mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.mVoiceAppSearchIntent.addFlags(268435456);
    this.mDropDownAnchor = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
    if (this.mDropDownAnchor != null) {
      this.mDropDownAnchor.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          SearchView.this.adjustDropDownSizeAndPosition();
        }
      });
    }
    updateViewsVisibility(this.mIconifiedByDefault);
    updateQueryHint();
  }
  
  private Intent createIntent(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new Intent(paramString1);
    localIntent.addFlags(268435456);
    if (paramUri != null) {
      localIntent.setData(paramUri);
    }
    localIntent.putExtra("user_query", this.mUserQuery);
    if (paramString3 != null) {
      localIntent.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      localIntent.putExtra("intent_extra_data_key", paramString2);
    }
    if (this.mAppSearchData != null) {
      localIntent.putExtra("app_data", this.mAppSearchData);
    }
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localIntent.putExtra("action_msg", paramString4);
    }
    localIntent.setComponent(this.mSearchable.getSearchActivity());
    return localIntent;
  }
  
  private Intent createIntentFromSuggestion(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      str1 = ab.a(paramCursor, "suggest_intent_action");
      if (str1 != null) {
        break label204;
      }
      str1 = this.mSearchable.getSuggestIntentAction();
    }
    catch (RuntimeException localRuntimeException1)
    {
      for (;;)
      {
        String str1;
        String str2;
        Object localObject;
        try
        {
          String str3;
          int j = paramCursor.getPosition();
          i = j;
        }
        catch (RuntimeException localRuntimeException2)
        {
          int i = -1;
          continue;
        }
        Log.w("SearchView", "Search suggestions cursor at row " + i + " returned exception.", localRuntimeException1);
        return null;
        label204:
        if (str1 == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label217:
          if (str2 == null) {
            localObject = null;
          }
        }
      }
    }
    str2 = ab.a(paramCursor, "suggest_intent_data");
    if (str2 == null) {
      str2 = this.mSearchable.getSuggestIntentData();
    }
    if (str2 != null)
    {
      str3 = ab.a(paramCursor, "suggest_intent_data_id");
      if (str3 != null)
      {
        str2 = str2 + "/" + Uri.encode(str3);
        break label217;
        for (;;)
        {
          String str4 = ab.a(paramCursor, "suggest_intent_query");
          return createIntent(str1, (Uri)localObject, ab.a(paramCursor, "suggest_intent_extra_data"), str4, paramInt, paramString);
          Uri localUri = Uri.parse(str2);
          localObject = localUri;
        }
      }
    }
  }
  
  private Intent createVoiceAppSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Intent localIntent1 = new Intent("android.intent.action.SEARCH");
    localIntent1.setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(getContext(), 0, localIntent1, 1073741824);
    Bundle localBundle = new Bundle();
    if (this.mAppSearchData != null) {
      localBundle.putParcelable("app_data", this.mAppSearchData);
    }
    Intent localIntent2 = new Intent(paramIntent);
    String str1 = "free_form";
    int i = 1;
    Resources localResources = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      str1 = localResources.getString(paramSearchableInfo.getVoiceLanguageModeId());
    }
    if (paramSearchableInfo.getVoicePromptTextId() != 0) {}
    for (String str2 = localResources.getString(paramSearchableInfo.getVoicePromptTextId());; str2 = null)
    {
      if (paramSearchableInfo.getVoiceLanguageId() != 0) {}
      for (String str3 = localResources.getString(paramSearchableInfo.getVoiceLanguageId());; str3 = null)
      {
        if (paramSearchableInfo.getVoiceMaxResults() != 0) {
          i = paramSearchableInfo.getVoiceMaxResults();
        }
        localIntent2.putExtra("android.speech.extra.LANGUAGE_MODEL", str1);
        localIntent2.putExtra("android.speech.extra.PROMPT", str2);
        localIntent2.putExtra("android.speech.extra.LANGUAGE", str3);
        localIntent2.putExtra("android.speech.extra.MAX_RESULTS", i);
        String str4 = null;
        if (localComponentName == null) {}
        for (;;)
        {
          localIntent2.putExtra("calling_package", str4);
          localIntent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
          localIntent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
          return localIntent2;
          str4 = localComponentName.flattenToShortString();
        }
      }
    }
  }
  
  private Intent createVoiceWebSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    if (localComponentName == null) {}
    for (String str = null;; str = localComponentName.flattenToShortString())
    {
      localIntent.putExtra("calling_package", str);
      return localIntent;
    }
  }
  
  private void dismissSuggestions()
  {
    this.mSearchSrcTextView.dismissDropDown();
  }
  
  private void getChildBoundsWithinSearchView(View paramView, Rect paramRect)
  {
    paramView.getLocationInWindow(this.mTemp);
    getLocationInWindow(this.mTemp2);
    int i = this.mTemp[1] - this.mTemp2[1];
    int j = this.mTemp[0] - this.mTemp2[0];
    paramRect.set(j, i, j + paramView.getWidth(), i + paramView.getHeight());
  }
  
  private CharSequence getDecoratedHint(CharSequence paramCharSequence)
  {
    if ((!this.mIconifiedByDefault) || (this.mSearchHintIcon == null)) {
      return paramCharSequence;
    }
    int i = (int)(1.25D * this.mSearchSrcTextView.getTextSize());
    this.mSearchHintIcon.setBounds(0, 0, i, i);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
    localSpannableStringBuilder.append(paramCharSequence);
    return localSpannableStringBuilder;
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_width);
  }
  
  private boolean hasVoiceSearch()
  {
    SearchableInfo localSearchableInfo = this.mSearchable;
    boolean bool1 = false;
    Intent localIntent;
    if (localSearchableInfo != null)
    {
      boolean bool2 = this.mSearchable.getVoiceSearchEnabled();
      bool1 = false;
      if (bool2)
      {
        if (!this.mSearchable.getVoiceSearchLaunchWebSearch()) {
          break label76;
        }
        localIntent = this.mVoiceWebSearchIntent;
      }
    }
    for (;;)
    {
      bool1 = false;
      if (localIntent != null)
      {
        ResolveInfo localResolveInfo = getContext().getPackageManager().resolveActivity(localIntent, 65536);
        bool1 = false;
        if (localResolveInfo != null) {
          bool1 = true;
        }
      }
      return bool1;
      label76:
      boolean bool3 = this.mSearchable.getVoiceSearchLaunchRecognizer();
      localIntent = null;
      if (bool3) {
        localIntent = this.mVoiceAppSearchIntent;
      }
    }
  }
  
  static boolean isLandscapeMode(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }
  
  private boolean isSubmitAreaEnabled()
  {
    return ((this.mSubmitButtonEnabled) || (this.mVoiceButtonEnabled)) && (!isIconified());
  }
  
  private void launchIntent(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      getContext().startActivity(paramIntent);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("SearchView", "Failed launch activity: " + paramIntent, localRuntimeException);
    }
  }
  
  private boolean launchSuggestion(int paramInt1, int paramInt2, String paramString)
  {
    Cursor localCursor = this.mSuggestionsAdapter.a();
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt1)))
    {
      launchIntent(createIntentFromSuggestion(localCursor, paramInt2, paramString));
      return true;
    }
    return false;
  }
  
  private void postUpdateFocusedState()
  {
    post(this.mUpdateDrawableStateRunnable);
  }
  
  private void rewriteQueryFromSuggestion(int paramInt)
  {
    Editable localEditable = this.mSearchSrcTextView.getText();
    Cursor localCursor = this.mSuggestionsAdapter.a();
    if (localCursor == null) {
      return;
    }
    if (localCursor.moveToPosition(paramInt))
    {
      CharSequence localCharSequence = this.mSuggestionsAdapter.c(localCursor);
      if (localCharSequence != null)
      {
        setQuery(localCharSequence);
        return;
      }
      setQuery(localEditable);
      return;
    }
    setQuery(localEditable);
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    this.mSearchSrcTextView.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i = 0;; i = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i);
      return;
    }
  }
  
  private void updateCloseButton()
  {
    int i = 1;
    int j;
    label35:
    int k;
    label47:
    Drawable localDrawable;
    if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText()))
    {
      j = i;
      if ((j == 0) && ((!this.mIconifiedByDefault) || (this.mExpandedInActionView))) {
        break label90;
      }
      ImageView localImageView = this.mCloseButton;
      k = 0;
      if (i == 0) {
        break label95;
      }
      localImageView.setVisibility(k);
      localDrawable = this.mCloseButton.getDrawable();
      if (localDrawable != null) {
        if (j == 0) {
          break label102;
        }
      }
    }
    label90:
    label95:
    label102:
    for (int[] arrayOfInt = ENABLED_STATE_SET;; arrayOfInt = EMPTY_STATE_SET)
    {
      localDrawable.setState(arrayOfInt);
      return;
      j = 0;
      break;
      i = 0;
      break label35;
      k = 8;
      break label47;
    }
  }
  
  private void updateQueryHint()
  {
    Object localObject = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    if (localObject == null) {
      localObject = "";
    }
    localSearchAutoComplete.setHint(getDecoratedHint((CharSequence)localObject));
  }
  
  private void updateSearchAutoComplete()
  {
    int i = 1;
    this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
    this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
    int j = this.mSearchable.getInputType();
    if ((j & 0xF) == i)
    {
      j &= 0xFFFEFFFF;
      if (this.mSearchable.getSuggestAuthority() != null) {
        j = 0x80000 | j | 0x10000;
      }
    }
    this.mSearchSrcTextView.setInputType(j);
    if (this.mSuggestionsAdapter != null) {
      this.mSuggestionsAdapter.a(null);
    }
    if (this.mSearchable.getSuggestAuthority() != null)
    {
      this.mSuggestionsAdapter = new ab(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
      this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
      ab localab = (ab)this.mSuggestionsAdapter;
      if (this.mQueryRefinement) {
        i = 2;
      }
      localab.a(i);
    }
  }
  
  private void updateSubmitArea()
  {
    int i = 8;
    if ((isSubmitAreaEnabled()) && ((this.mGoButton.getVisibility() == 0) || (this.mVoiceButton.getVisibility() == 0))) {
      i = 0;
    }
    this.mSubmitArea.setVisibility(i);
  }
  
  private void updateSubmitButton(boolean paramBoolean)
  {
    int i = 8;
    if ((this.mSubmitButtonEnabled) && (isSubmitAreaEnabled()) && (hasFocus()) && ((paramBoolean) || (!this.mVoiceButtonEnabled))) {
      i = 0;
    }
    this.mGoButton.setVisibility(i);
  }
  
  private void updateViewsVisibility(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i = 8;
    this.mIconified = paramBoolean;
    int j;
    boolean bool2;
    label33:
    int k;
    if (paramBoolean)
    {
      j = 0;
      if (TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
        break label118;
      }
      bool2 = bool1;
      this.mSearchButton.setVisibility(j);
      updateSubmitButton(bool2);
      View localView = this.mSearchEditFrame;
      if (!paramBoolean) {
        break label124;
      }
      k = i;
      label61:
      localView.setVisibility(k);
      if ((this.mCollapsedIcon.getDrawable() != null) && (!this.mIconifiedByDefault)) {
        break label130;
      }
      label85:
      this.mCollapsedIcon.setVisibility(i);
      updateCloseButton();
      if (bool2) {
        break label135;
      }
    }
    for (;;)
    {
      updateVoiceButton(bool1);
      updateSubmitArea();
      return;
      j = i;
      break;
      label118:
      bool2 = false;
      break label33;
      label124:
      k = 0;
      break label61;
      label130:
      i = 0;
      break label85;
      label135:
      bool1 = false;
    }
  }
  
  private void updateVoiceButton(boolean paramBoolean)
  {
    int i;
    if ((this.mVoiceButtonEnabled) && (!isIconified()) && (paramBoolean))
    {
      i = 0;
      this.mGoButton.setVisibility(8);
    }
    for (;;)
    {
      this.mVoiceButton.setVisibility(i);
      return;
      i = 8;
    }
  }
  
  void adjustDropDownSizeAndPosition()
  {
    int i;
    Rect localRect;
    int j;
    if (this.mDropDownAnchor.getWidth() > 1)
    {
      Resources localResources = getContext().getResources();
      i = this.mSearchPlate.getPaddingLeft();
      localRect = new Rect();
      boolean bool = ViewUtils.isLayoutRtl(this);
      if (!this.mIconifiedByDefault) {
        break label132;
      }
      j = localResources.getDimensionPixelSize(a.d.abc_dropdownitem_icon_width) + localResources.getDimensionPixelSize(a.d.abc_dropdownitem_text_padding_left);
      this.mSearchSrcTextView.getDropDownBackground().getPadding(localRect);
      if (!bool) {
        break label138;
      }
    }
    label132:
    label138:
    for (int k = -localRect.left;; k = i - (j + localRect.left))
    {
      this.mSearchSrcTextView.setDropDownHorizontalOffset(k);
      int m = j + (this.mDropDownAnchor.getWidth() + localRect.left + localRect.right) - i;
      this.mSearchSrcTextView.setDropDownWidth(m);
      return;
      j = 0;
      break;
    }
  }
  
  public void clearFocus()
  {
    this.mClearingFocus = true;
    super.clearFocus();
    this.mSearchSrcTextView.clearFocus();
    this.mSearchSrcTextView.setImeVisibility(false);
    this.mClearingFocus = false;
  }
  
  void forceSuggestionQuery()
  {
    HIDDEN_METHOD_INVOKER.a(this.mSearchSrcTextView);
    HIDDEN_METHOD_INVOKER.b(this.mSearchSrcTextView);
  }
  
  public int getImeOptions()
  {
    return this.mSearchSrcTextView.getImeOptions();
  }
  
  public int getInputType()
  {
    return this.mSearchSrcTextView.getInputType();
  }
  
  public int getMaxWidth()
  {
    return this.mMaxWidth;
  }
  
  public CharSequence getQuery()
  {
    return this.mSearchSrcTextView.getText();
  }
  
  public CharSequence getQueryHint()
  {
    if (this.mQueryHint != null) {
      return this.mQueryHint;
    }
    if ((this.mSearchable != null) && (this.mSearchable.getHintId() != 0)) {
      return getContext().getText(this.mSearchable.getHintId());
    }
    return this.mDefaultQueryHint;
  }
  
  int getSuggestionCommitIconResId()
  {
    return this.mSuggestionCommitIconResId;
  }
  
  int getSuggestionRowLayout()
  {
    return this.mSuggestionRowLayout;
  }
  
  public f getSuggestionsAdapter()
  {
    return this.mSuggestionsAdapter;
  }
  
  public boolean isIconfiedByDefault()
  {
    return this.mIconifiedByDefault;
  }
  
  public boolean isIconified()
  {
    return this.mIconified;
  }
  
  public boolean isQueryRefinementEnabled()
  {
    return this.mQueryRefinement;
  }
  
  public boolean isSubmitButtonEnabled()
  {
    return this.mSubmitButtonEnabled;
  }
  
  void launchQuerySearch(int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = createIntent("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(localIntent);
  }
  
  public void onActionViewCollapsed()
  {
    setQuery("", false);
    clearFocus();
    updateViewsVisibility(true);
    this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
    this.mExpandedInActionView = false;
  }
  
  public void onActionViewExpanded()
  {
    if (this.mExpandedInActionView) {
      return;
    }
    this.mExpandedInActionView = true;
    this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
    this.mSearchSrcTextView.setImeOptions(0x2000000 | this.mCollapsedImeOptions);
    this.mSearchSrcTextView.setText("");
    setIconified(false);
  }
  
  void onCloseClicked()
  {
    if (TextUtils.isEmpty(this.mSearchSrcTextView.getText()))
    {
      if ((this.mIconifiedByDefault) && ((this.mOnCloseListener == null) || (!this.mOnCloseListener.onClose())))
      {
        clearFocus();
        updateViewsVisibility(true);
      }
      return;
    }
    this.mSearchSrcTextView.setText("");
    this.mSearchSrcTextView.requestFocus();
    this.mSearchSrcTextView.setImeVisibility(true);
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.mUpdateDrawableStateRunnable);
    post(this.mReleaseCursorRunnable);
    super.onDetachedFromWindow();
  }
  
  boolean onItemClicked(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool1;
    if (this.mOnSuggestionListener != null)
    {
      boolean bool2 = this.mOnSuggestionListener.onSuggestionClick(paramInt1);
      bool1 = false;
      if (bool2) {}
    }
    else
    {
      launchSuggestion(paramInt1, 0, null);
      this.mSearchSrcTextView.setImeVisibility(false);
      dismissSuggestions();
      bool1 = true;
    }
    return bool1;
  }
  
  boolean onItemSelected(int paramInt)
  {
    if ((this.mOnSuggestionListener == null) || (!this.mOnSuggestionListener.onSuggestionSelect(paramInt)))
    {
      rewriteQueryFromSuggestion(paramInt);
      return true;
    }
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
      this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, paramInt4 - paramInt2);
      if (this.mTouchDelegate == null)
      {
        this.mTouchDelegate = new b(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
        setTouchDelegate(this.mTouchDelegate);
      }
    }
    else
    {
      return;
    }
    this.mTouchDelegate.a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (isIconified())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int m;
    switch (i)
    {
    default: 
      int k = View.MeasureSpec.getMode(paramInt2);
      m = View.MeasureSpec.getSize(paramInt2);
      switch (k)
      {
      }
      break;
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(m, 1073741824));
      return;
      if (this.mMaxWidth > 0)
      {
        j = Math.min(this.mMaxWidth, j);
        break;
      }
      j = Math.min(getPreferredWidth(), j);
      break;
      if (this.mMaxWidth <= 0) {
        break;
      }
      j = Math.min(this.mMaxWidth, j);
      break;
      if (this.mMaxWidth > 0)
      {
        j = this.mMaxWidth;
        break;
      }
      j = getPreferredWidth();
      break;
      m = Math.min(getPreferredHeight(), m);
      continue;
      m = getPreferredHeight();
    }
  }
  
  void onQueryRefine(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
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
    updateViewsVisibility(localSavedState.a);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = isIconified();
    return localSavedState;
  }
  
  void onSearchClicked()
  {
    updateViewsVisibility(false);
    this.mSearchSrcTextView.requestFocus();
    this.mSearchSrcTextView.setImeVisibility(true);
    if (this.mOnSearchClickListener != null) {
      this.mOnSearchClickListener.onClick(this);
    }
  }
  
  void onSubmitQuery()
  {
    Editable localEditable = this.mSearchSrcTextView.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0) && ((this.mOnQueryChangeListener == null) || (!this.mOnQueryChangeListener.onQueryTextSubmit(localEditable.toString()))))
    {
      if (this.mSearchable != null) {
        launchQuerySearch(0, null, localEditable.toString());
      }
      this.mSearchSrcTextView.setImeVisibility(false);
      dismissSuggestions();
    }
  }
  
  boolean onSuggestionsKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mSearchable == null) {}
    do
    {
      do
      {
        return false;
      } while ((this.mSuggestionsAdapter == null) || (paramKeyEvent.getAction() != 0) || (!paramKeyEvent.hasNoModifiers()));
      if ((paramInt == 66) || (paramInt == 84) || (paramInt == 61)) {
        return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
      }
      if ((paramInt == 21) || (paramInt == 22))
      {
        if (paramInt == 21) {}
        for (int i = 0;; i = this.mSearchSrcTextView.length())
        {
          this.mSearchSrcTextView.setSelection(i);
          this.mSearchSrcTextView.setListSelection(0);
          this.mSearchSrcTextView.clearListSelection();
          HIDDEN_METHOD_INVOKER.a(this.mSearchSrcTextView, true);
          return true;
        }
      }
    } while ((paramInt != 19) || (this.mSearchSrcTextView.getListSelection() != 0));
    return false;
  }
  
  void onTextChanged(CharSequence paramCharSequence)
  {
    boolean bool1 = true;
    Editable localEditable = this.mSearchSrcTextView.getText();
    this.mUserQuery = localEditable;
    boolean bool2;
    if (!TextUtils.isEmpty(localEditable))
    {
      bool2 = bool1;
      updateSubmitButton(bool2);
      if (bool2) {
        break label100;
      }
    }
    for (;;)
    {
      updateVoiceButton(bool1);
      updateCloseButton();
      updateSubmitArea();
      if ((this.mOnQueryChangeListener != null) && (!TextUtils.equals(paramCharSequence, this.mOldQueryText))) {
        this.mOnQueryChangeListener.onQueryTextChange(paramCharSequence.toString());
      }
      this.mOldQueryText = paramCharSequence.toString();
      return;
      bool2 = false;
      break;
      label100:
      bool1 = false;
    }
  }
  
  void onTextFocusChanged()
  {
    updateViewsVisibility(isIconified());
    postUpdateFocusedState();
    if (this.mSearchSrcTextView.hasFocus()) {
      forceSuggestionQuery();
    }
  }
  
  void onVoiceClicked()
  {
    if (this.mSearchable == null) {}
    SearchableInfo localSearchableInfo;
    do
    {
      return;
      localSearchableInfo = this.mSearchable;
      try
      {
        if (localSearchableInfo.getVoiceSearchLaunchWebSearch())
        {
          Intent localIntent2 = createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, localSearchableInfo);
          getContext().startActivity(localIntent2);
          return;
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Log.w("SearchView", "Could not find voice search activity");
        return;
      }
    } while (!localSearchableInfo.getVoiceSearchLaunchRecognizer());
    Intent localIntent1 = createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, localSearchableInfo);
    getContext().startActivity(localIntent1);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    postUpdateFocusedState();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.mClearingFocus) {}
    while (!isFocusable()) {
      return false;
    }
    if (!isIconified())
    {
      boolean bool = this.mSearchSrcTextView.requestFocus(paramInt, paramRect);
      if (bool) {
        updateViewsVisibility(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    this.mAppSearchData = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      onCloseClicked();
      return;
    }
    onSearchClicked();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (this.mIconifiedByDefault == paramBoolean) {
      return;
    }
    this.mIconifiedByDefault = paramBoolean;
    updateViewsVisibility(paramBoolean);
    updateQueryHint();
  }
  
  public void setImeOptions(int paramInt)
  {
    this.mSearchSrcTextView.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    this.mSearchSrcTextView.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(OnCloseListener paramOnCloseListener)
  {
    this.mOnCloseListener = paramOnCloseListener;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.mOnQueryTextFocusChangeListener = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(OnQueryTextListener paramOnQueryTextListener)
  {
    this.mOnQueryChangeListener = paramOnQueryTextListener;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnSearchClickListener = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(OnSuggestionListener paramOnSuggestionListener)
  {
    this.mOnSuggestionListener = paramOnSuggestionListener;
  }
  
  public void setQuery(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.mSearchSrcTextView.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      this.mSearchSrcTextView.setSelection(this.mSearchSrcTextView.length());
      this.mUserQuery = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      onSubmitQuery();
    }
  }
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.mQueryHint = paramCharSequence;
    updateQueryHint();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.mQueryRefinement = paramBoolean;
    ab localab;
    if ((this.mSuggestionsAdapter instanceof ab))
    {
      localab = (ab)this.mSuggestionsAdapter;
      if (!paramBoolean) {
        break label35;
      }
    }
    label35:
    for (int i = 2;; i = 1)
    {
      localab.a(i);
      return;
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.mSearchable = paramSearchableInfo;
    if (this.mSearchable != null)
    {
      updateSearchAutoComplete();
      updateQueryHint();
    }
    this.mVoiceButtonEnabled = hasVoiceSearch();
    if (this.mVoiceButtonEnabled) {
      this.mSearchSrcTextView.setPrivateImeOptions("nm");
    }
    updateViewsVisibility(isIconified());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.mSubmitButtonEnabled = paramBoolean;
    updateViewsVisibility(isIconified());
  }
  
  public void setSuggestionsAdapter(f paramf)
  {
    this.mSuggestionsAdapter = paramf;
    this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
  }
  
  void updateFocusedState()
  {
    if (this.mSearchSrcTextView.hasFocus()) {}
    for (int[] arrayOfInt = FOCUSED_STATE_SET;; arrayOfInt = EMPTY_STATE_SET)
    {
      Drawable localDrawable1 = this.mSearchPlate.getBackground();
      if (localDrawable1 != null) {
        localDrawable1.setState(arrayOfInt);
      }
      Drawable localDrawable2 = this.mSubmitArea.getBackground();
      if (localDrawable2 != null) {
        localDrawable2.setState(arrayOfInt);
      }
      invalidate();
      return;
    }
  }
  
  public static abstract interface OnCloseListener
  {
    public abstract boolean onClose();
  }
  
  public static abstract interface OnQueryTextListener
  {
    public abstract boolean onQueryTextChange(String paramString);
    
    public abstract boolean onQueryTextSubmit(String paramString);
  }
  
  public static abstract interface OnSuggestionListener
  {
    public abstract boolean onSuggestionClick(int paramInt);
    
    public abstract boolean onSuggestionSelect(int paramInt);
  }
  
  static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public SearchView.SavedState a(Parcel paramAnonymousParcel)
      {
        return new SearchView.SavedState(paramAnonymousParcel, null);
      }
      
      public SearchView.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new SearchView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public SearchView.SavedState[] a(int paramAnonymousInt)
      {
        return new SearchView.SavedState[paramAnonymousInt];
      }
    };
    boolean a;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.a = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(this.a));
    }
  }
  
  public static class SearchAutoComplete
    extends AppCompatAutoCompleteTextView
  {
    private boolean mHasPendingShowSoftInputRequest;
    final Runnable mRunShowSoftInputIfNecessary = new Runnable()
    {
      public void run()
      {
        SearchView.SearchAutoComplete.this.showSoftInputIfNecessary();
      }
    };
    private SearchView mSearchView;
    private int mThreshold = getThreshold();
    
    public SearchAutoComplete(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    private int getSearchViewTextMinWidthDp()
    {
      Configuration localConfiguration = getResources().getConfiguration();
      int i = localConfiguration.screenWidthDp;
      int j = localConfiguration.screenHeightDp;
      if ((i >= 960) && (j >= 720) && (localConfiguration.orientation == 2)) {
        return 256;
      }
      if ((i >= 600) || ((i >= 640) && (j >= 480))) {
        return 192;
      }
      return 160;
    }
    
    private boolean isEmpty()
    {
      return TextUtils.getTrimmedLength(getText()) == 0;
    }
    
    private void setImeVisibility(boolean paramBoolean)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!paramBoolean)
      {
        this.mHasPendingShowSoftInputRequest = false;
        removeCallbacks(this.mRunShowSoftInputIfNecessary);
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      }
      if (localInputMethodManager.isActive(this))
      {
        this.mHasPendingShowSoftInputRequest = false;
        removeCallbacks(this.mRunShowSoftInputIfNecessary);
        localInputMethodManager.showSoftInput(this, 0);
        return;
      }
      this.mHasPendingShowSoftInputRequest = true;
    }
    
    private void showSoftInputIfNecessary()
    {
      if (this.mHasPendingShowSoftInputRequest)
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        this.mHasPendingShowSoftInputRequest = false;
      }
    }
    
    public boolean enoughToFilter()
    {
      return (this.mThreshold <= 0) || (super.enoughToFilter());
    }
    
    public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
    {
      InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
      if (this.mHasPendingShowSoftInputRequest)
      {
        removeCallbacks(this.mRunShowSoftInputIfNecessary);
        post(this.mRunShowSoftInputIfNecessary);
      }
      return localInputConnection;
    }
    
    protected void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      this.mSearchView.onTextFocusChanged();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          KeyEvent.DispatcherState localDispatcherState2 = getKeyDispatcherState();
          if (localDispatcherState2 != null) {
            localDispatcherState2.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          KeyEvent.DispatcherState localDispatcherState1 = getKeyDispatcherState();
          if (localDispatcherState1 != null) {
            localDispatcherState1.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            this.mSearchView.clearFocus();
            setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (this.mSearchView.hasFocus()) && (getVisibility() == 0))
      {
        this.mHasPendingShowSoftInputRequest = true;
        if (SearchView.isLandscapeMode(getContext())) {
          SearchView.HIDDEN_METHOD_INVOKER.a(this, true);
        }
      }
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence paramCharSequence) {}
    
    void setSearchView(SearchView paramSearchView)
    {
      this.mSearchView = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      this.mThreshold = paramInt;
    }
  }
  
  private static class a
  {
    private Method a;
    private Method b;
    private Method c;
    
    a()
    {
      try
      {
        this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a.setAccessible(true);
        try
        {
          label27:
          this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          this.b.setAccessible(true);
          try
          {
            label50:
            Class[] arrayOfClass = new Class[1];
            arrayOfClass[0] = Boolean.TYPE;
            this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", arrayOfClass);
            this.c.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException3) {}
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          break label50;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        break label27;
      }
    }
    
    void a(AutoCompleteTextView paramAutoCompleteTextView)
    {
      if (this.a != null) {}
      try
      {
        this.a.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception localException) {}
    }
    
    void a(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
    {
      if (this.c != null) {}
      try
      {
        Method localMethod = this.c;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
        return;
      }
      catch (Exception localException) {}
    }
    
    void b(AutoCompleteTextView paramAutoCompleteTextView)
    {
      if (this.b != null) {}
      try
      {
        this.b.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception localException) {}
    }
  }
  
  private static class b
    extends TouchDelegate
  {
    private final View a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final int e;
    private boolean f;
    
    public b(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      this.e = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      a(paramRect1, paramRect2);
      this.a = paramView;
    }
    
    public void a(Rect paramRect1, Rect paramRect2)
    {
      this.b.set(paramRect1);
      this.d.set(paramRect1);
      this.d.inset(-this.e, -this.e);
      this.c.set(paramRect2);
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool1 = true;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      boolean bool2;
      label51:
      boolean bool3;
      switch (paramMotionEvent.getAction())
      {
      default: 
        bool2 = false;
        bool3 = false;
        if (bool2)
        {
          if ((!bool1) || (this.c.contains(i, j))) {
            break label180;
          }
          paramMotionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
        }
        break;
      }
      for (;;)
      {
        bool3 = this.a.dispatchTouchEvent(paramMotionEvent);
        return bool3;
        if (!this.b.contains(i, j)) {
          break;
        }
        this.f = bool1;
        bool2 = bool1;
        break label51;
        bool2 = this.f;
        if ((!bool2) || (this.d.contains(i, j))) {
          break label51;
        }
        bool1 = false;
        break label51;
        bool2 = this.f;
        this.f = false;
        break label51;
        label180:
        paramMotionEvent.setLocation(i - this.c.left, j - this.c.top);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.7.0.1
 */