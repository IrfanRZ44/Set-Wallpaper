package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.c.a.c;
import android.support.c.a.i;
import android.support.v4.f.f;
import android.support.v4.f.g;
import android.support.v4.f.n;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.e;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class AppCompatDrawableManager
{
  private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
  private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED;
  private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
  private static final b COLOR_FILTER_CACHE;
  private static final boolean DEBUG = false;
  private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
  private static AppCompatDrawableManager INSTANCE;
  private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
  private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
  private static final String TAG = "AppCompatDrawableManag";
  private static final int[] TINT_CHECKABLE_BUTTON_LIST;
  private static final int[] TINT_COLOR_CONTROL_NORMAL;
  private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
  private android.support.v4.f.a<String, c> mDelegates;
  private final Object mDrawableCacheLock = new Object();
  private final WeakHashMap<Context, f<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap(0);
  private boolean mHasCheckedVectorDrawableSetup;
  private n<String> mKnownDrawableIdTags;
  private WeakHashMap<Context, n<ColorStateList>> mTintLists;
  private TypedValue mTypedValue;
  
  static
  {
    COLOR_FILTER_CACHE = new b(6);
    int[] arrayOfInt1 = new int[3];
    arrayOfInt1[0] = a.e.abc_textfield_search_default_mtrl_alpha;
    arrayOfInt1[1] = a.e.abc_textfield_default_mtrl_alpha;
    arrayOfInt1[2] = a.e.abc_ab_share_pack_mtrl_alpha;
    COLORFILTER_TINT_COLOR_CONTROL_NORMAL = arrayOfInt1;
    int[] arrayOfInt2 = new int[7];
    arrayOfInt2[0] = a.e.abc_ic_commit_search_api_mtrl_alpha;
    arrayOfInt2[1] = a.e.abc_seekbar_tick_mark_material;
    arrayOfInt2[2] = a.e.abc_ic_menu_share_mtrl_alpha;
    arrayOfInt2[3] = a.e.abc_ic_menu_copy_mtrl_am_alpha;
    arrayOfInt2[4] = a.e.abc_ic_menu_cut_mtrl_alpha;
    arrayOfInt2[5] = a.e.abc_ic_menu_selectall_mtrl_alpha;
    arrayOfInt2[6] = a.e.abc_ic_menu_paste_mtrl_am_alpha;
    TINT_COLOR_CONTROL_NORMAL = arrayOfInt2;
    int[] arrayOfInt3 = new int[10];
    arrayOfInt3[0] = a.e.abc_textfield_activated_mtrl_alpha;
    arrayOfInt3[1] = a.e.abc_textfield_search_activated_mtrl_alpha;
    arrayOfInt3[2] = a.e.abc_cab_background_top_mtrl_alpha;
    arrayOfInt3[3] = a.e.abc_text_cursor_material;
    arrayOfInt3[4] = a.e.abc_text_select_handle_left_mtrl_dark;
    arrayOfInt3[5] = a.e.abc_text_select_handle_middle_mtrl_dark;
    arrayOfInt3[6] = a.e.abc_text_select_handle_right_mtrl_dark;
    arrayOfInt3[7] = a.e.abc_text_select_handle_left_mtrl_light;
    arrayOfInt3[8] = a.e.abc_text_select_handle_middle_mtrl_light;
    arrayOfInt3[9] = a.e.abc_text_select_handle_right_mtrl_light;
    COLORFILTER_COLOR_CONTROL_ACTIVATED = arrayOfInt3;
    int[] arrayOfInt4 = new int[3];
    arrayOfInt4[0] = a.e.abc_popup_background_mtrl_mult;
    arrayOfInt4[1] = a.e.abc_cab_background_internal_bg;
    arrayOfInt4[2] = a.e.abc_menu_hardkey_panel_mtrl_mult;
    COLORFILTER_COLOR_BACKGROUND_MULTIPLY = arrayOfInt4;
    int[] arrayOfInt5 = new int[2];
    arrayOfInt5[0] = a.e.abc_tab_indicator_material;
    arrayOfInt5[1] = a.e.abc_textfield_search_material;
    TINT_COLOR_CONTROL_STATE_LIST = arrayOfInt5;
    int[] arrayOfInt6 = new int[2];
    arrayOfInt6[0] = a.e.abc_btn_check_material;
    arrayOfInt6[1] = a.e.abc_btn_radio_material;
    TINT_CHECKABLE_BUTTON_LIST = arrayOfInt6;
  }
  
  private void addDelegate(String paramString, c paramc)
  {
    if (this.mDelegates == null) {
      this.mDelegates = new android.support.v4.f.a();
    }
    this.mDelegates.put(paramString, paramc);
  }
  
  private boolean addDrawableToCache(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null) {
      synchronized (this.mDrawableCacheLock)
      {
        f localf = (f)this.mDrawableCaches.get(paramContext);
        if (localf == null)
        {
          localf = new f();
          this.mDrawableCaches.put(paramContext, localf);
        }
        localf.b(paramLong, new WeakReference(localConstantState));
        return true;
      }
    }
    return false;
  }
  
  private void addTintListToCache(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (this.mTintLists == null) {
      this.mTintLists = new WeakHashMap();
    }
    n localn = (n)this.mTintLists.get(paramContext);
    if (localn == null)
    {
      localn = new n();
      this.mTintLists.put(paramContext, localn);
    }
    localn.c(paramInt, paramColorStateList);
  }
  
  private static boolean arrayContains(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  private void checkVectorDrawableSetup(Context paramContext)
  {
    if (this.mHasCheckedVectorDrawableSetup) {}
    Drawable localDrawable;
    do
    {
      return;
      this.mHasCheckedVectorDrawableSetup = true;
      localDrawable = getDrawable(paramContext, a.e.abc_vector_test);
    } while ((localDrawable != null) && (isVectorDrawable(localDrawable)));
    this.mHasCheckedVectorDrawableSetup = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  private ColorStateList createBorderlessButtonColorStateList(Context paramContext)
  {
    return createButtonColorStateList(paramContext, 0);
  }
  
  private ColorStateList createButtonColorStateList(Context paramContext, int paramInt)
  {
    int[][] arrayOfInt = new int[4][];
    int[] arrayOfInt1 = new int[4];
    int i = ac.a(paramContext, a.a.colorControlHighlight);
    int j = ac.c(paramContext, a.a.colorButtonNormal);
    arrayOfInt[0] = ac.a;
    arrayOfInt1[0] = j;
    arrayOfInt[1] = ac.d;
    arrayOfInt1[1] = android.support.v4.a.a.a(i, paramInt);
    arrayOfInt[2] = ac.b;
    arrayOfInt1[2] = android.support.v4.a.a.a(i, paramInt);
    arrayOfInt[3] = ac.h;
    arrayOfInt1[3] = paramInt;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private static long createCacheKey(TypedValue paramTypedValue)
  {
    return paramTypedValue.assetCookie << 32 | paramTypedValue.data;
  }
  
  private ColorStateList createColoredButtonColorStateList(Context paramContext)
  {
    return createButtonColorStateList(paramContext, ac.a(paramContext, a.a.colorAccent));
  }
  
  private ColorStateList createDefaultButtonColorStateList(Context paramContext)
  {
    return createButtonColorStateList(paramContext, ac.a(paramContext, a.a.colorButtonNormal));
  }
  
  private Drawable createDrawableIfNeeded(Context paramContext, int paramInt)
  {
    if (this.mTypedValue == null) {
      this.mTypedValue = new TypedValue();
    }
    TypedValue localTypedValue = this.mTypedValue;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l = createCacheKey(localTypedValue);
    Object localObject = getCachedDrawable(paramContext, l);
    if (localObject != null) {}
    do
    {
      return localObject;
      if (paramInt == a.e.abc_cab_background_top_material)
      {
        Drawable[] arrayOfDrawable = new Drawable[2];
        arrayOfDrawable[0] = getDrawable(paramContext, a.e.abc_cab_background_internal_bg);
        arrayOfDrawable[1] = getDrawable(paramContext, a.e.abc_cab_background_top_mtrl_alpha);
        localObject = new LayerDrawable(arrayOfDrawable);
      }
    } while (localObject == null);
    ((Drawable)localObject).setChangingConfigurations(localTypedValue.changingConfigurations);
    addDrawableToCache(paramContext, l, (Drawable)localObject);
    return localObject;
  }
  
  private ColorStateList createSwitchThumbColorStateList(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = ac.b(paramContext, a.a.colorSwitchThumbNormal);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      arrayOfInt[0] = ac.a;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = ac.e;
      arrayOfInt1[1] = ac.a(paramContext, a.a.colorControlActivated);
      arrayOfInt[2] = ac.h;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    for (;;)
    {
      return new ColorStateList(arrayOfInt, arrayOfInt1);
      arrayOfInt[0] = ac.a;
      arrayOfInt1[0] = ac.c(paramContext, a.a.colorSwitchThumbNormal);
      arrayOfInt[1] = ac.e;
      arrayOfInt1[1] = ac.a(paramContext, a.a.colorControlActivated);
      arrayOfInt[2] = ac.h;
      arrayOfInt1[2] = ac.a(paramContext, a.a.colorSwitchThumbNormal);
    }
  }
  
  private static PorterDuffColorFilter createTintFilter(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return getPorterDuffColorFilter(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
  }
  
  public static AppCompatDrawableManager get()
  {
    if (INSTANCE == null)
    {
      INSTANCE = new AppCompatDrawableManager();
      installDefaultInflateDelegates(INSTANCE);
    }
    return INSTANCE;
  }
  
  private Drawable getCachedDrawable(Context paramContext, long paramLong)
  {
    f localf;
    synchronized (this.mDrawableCacheLock)
    {
      localf = (f)this.mDrawableCaches.get(paramContext);
      if (localf == null) {
        return null;
      }
      WeakReference localWeakReference = (WeakReference)localf.a(paramLong);
      if (localWeakReference == null) {
        break label94;
      }
      Drawable.ConstantState localConstantState = (Drawable.ConstantState)localWeakReference.get();
      if (localConstantState != null)
      {
        Drawable localDrawable = localConstantState.newDrawable(paramContext.getResources());
        return localDrawable;
      }
    }
    localf.b(paramLong);
    label94:
    return null;
  }
  
  public static PorterDuffColorFilter getPorterDuffColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter = COLOR_FILTER_CACHE.a(paramInt, paramMode);
    if (localPorterDuffColorFilter == null)
    {
      localPorterDuffColorFilter = new PorterDuffColorFilter(paramInt, paramMode);
      COLOR_FILTER_CACHE.a(paramInt, paramMode, localPorterDuffColorFilter);
    }
    return localPorterDuffColorFilter;
  }
  
  private ColorStateList getTintListFromCache(Context paramContext, int paramInt)
  {
    if (this.mTintLists != null)
    {
      n localn = (n)this.mTintLists.get(paramContext);
      if (localn != null) {
        return (ColorStateList)localn.a(paramInt);
      }
      return null;
    }
    return null;
  }
  
  static PorterDuff.Mode getTintMode(int paramInt)
  {
    int i = a.e.abc_switch_thumb_material;
    PorterDuff.Mode localMode = null;
    if (paramInt == i) {
      localMode = PorterDuff.Mode.MULTIPLY;
    }
    return localMode;
  }
  
  private static void installDefaultInflateDelegates(AppCompatDrawableManager paramAppCompatDrawableManager)
  {
    if (Build.VERSION.SDK_INT < 24)
    {
      paramAppCompatDrawableManager.addDelegate("vector", new d());
      paramAppCompatDrawableManager.addDelegate("animated-vector", new a());
    }
  }
  
  private static boolean isVectorDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable instanceof i)) || ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()));
  }
  
  private Drawable loadDrawableFromDelegates(Context paramContext, int paramInt)
  {
    if ((this.mDelegates != null) && (!this.mDelegates.isEmpty()))
    {
      Object localObject;
      if (this.mKnownDrawableIdTags != null)
      {
        String str2 = (String)this.mKnownDrawableIdTags.a(paramInt);
        if ((!"appcompat_skip_skip".equals(str2)) && ((str2 == null) || (this.mDelegates.get(str2) != null))) {
          break label81;
        }
        localObject = null;
      }
      for (;;)
      {
        return localObject;
        this.mKnownDrawableIdTags = new n();
        label81:
        if (this.mTypedValue == null) {
          this.mTypedValue = new TypedValue();
        }
        TypedValue localTypedValue = this.mTypedValue;
        Resources localResources = paramContext.getResources();
        localResources.getValue(paramInt, localTypedValue, true);
        long l = createCacheKey(localTypedValue);
        Drawable localDrawable = getCachedDrawable(paramContext, l);
        if (localDrawable != null) {
          return localDrawable;
        }
        XmlResourceParser localXmlResourceParser;
        AttributeSet localAttributeSet;
        if ((localTypedValue.string != null) && (localTypedValue.string.toString().endsWith(".xml"))) {
          try
          {
            localXmlResourceParser = localResources.getXml(paramInt);
            localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
            int i;
            do
            {
              i = localXmlResourceParser.next();
            } while ((i != 2) && (i != 1));
            if (i != 2) {
              throw new XmlPullParserException("No start tag found");
            }
          }
          catch (Exception localException)
          {
            Log.e("AppCompatDrawableManag", "Exception while inflating drawable", localException);
          }
        }
        for (localObject = localDrawable; localObject == null; localObject = localDrawable)
        {
          this.mKnownDrawableIdTags.c(paramInt, "appcompat_skip_skip");
          return localObject;
          String str1 = localXmlResourceParser.getName();
          this.mKnownDrawableIdTags.c(paramInt, str1);
          c localc = (c)this.mDelegates.get(str1);
          if (localc != null) {
            localDrawable = localc.a(paramContext, localXmlResourceParser, localAttributeSet, paramContext.getTheme());
          }
          if (localDrawable != null)
          {
            localDrawable.setChangingConfigurations(localTypedValue.changingConfigurations);
            boolean bool = addDrawableToCache(paramContext, l, localDrawable);
            if (!bool) {}
          }
        }
      }
    }
    return null;
  }
  
  private void removeDelegate(String paramString, c paramc)
  {
    if ((this.mDelegates != null) && (this.mDelegates.get(paramString) == paramc)) {
      this.mDelegates.remove(paramString);
    }
  }
  
  private static void setPorterDuffColorFilter(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
      paramDrawable = paramDrawable.mutate();
    }
    if (paramMode == null) {
      paramMode = DEFAULT_MODE;
    }
    paramDrawable.setColorFilter(getPorterDuffColorFilter(paramInt, paramMode));
  }
  
  private Drawable tintDrawable(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    ColorStateList localColorStateList = getTintList(paramContext, paramInt);
    if (localColorStateList != null)
    {
      if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
        paramDrawable = paramDrawable.mutate();
      }
      paramDrawable = android.support.v4.a.a.a.g(paramDrawable);
      android.support.v4.a.a.a.a(paramDrawable, localColorStateList);
      PorterDuff.Mode localMode = getTintMode(paramInt);
      if (localMode != null) {
        android.support.v4.a.a.a.a(paramDrawable, localMode);
      }
    }
    do
    {
      return paramDrawable;
      if (paramInt == a.e.abc_seekbar_track_material)
      {
        LayerDrawable localLayerDrawable2 = (LayerDrawable)paramDrawable;
        setPorterDuffColorFilter(localLayerDrawable2.findDrawableByLayerId(16908288), ac.a(paramContext, a.a.colorControlNormal), DEFAULT_MODE);
        setPorterDuffColorFilter(localLayerDrawable2.findDrawableByLayerId(16908303), ac.a(paramContext, a.a.colorControlNormal), DEFAULT_MODE);
        setPorterDuffColorFilter(localLayerDrawable2.findDrawableByLayerId(16908301), ac.a(paramContext, a.a.colorControlActivated), DEFAULT_MODE);
        return paramDrawable;
      }
      if ((paramInt == a.e.abc_ratingbar_material) || (paramInt == a.e.abc_ratingbar_indicator_material) || (paramInt == a.e.abc_ratingbar_small_material))
      {
        LayerDrawable localLayerDrawable1 = (LayerDrawable)paramDrawable;
        setPorterDuffColorFilter(localLayerDrawable1.findDrawableByLayerId(16908288), ac.c(paramContext, a.a.colorControlNormal), DEFAULT_MODE);
        setPorterDuffColorFilter(localLayerDrawable1.findDrawableByLayerId(16908303), ac.a(paramContext, a.a.colorControlActivated), DEFAULT_MODE);
        setPorterDuffColorFilter(localLayerDrawable1.findDrawableByLayerId(16908301), ac.a(paramContext, a.a.colorControlActivated), DEFAULT_MODE);
        return paramDrawable;
      }
    } while ((tintDrawableUsingColorFilter(paramContext, paramInt, paramDrawable)) || (!paramBoolean));
    return null;
  }
  
  static void tintDrawable(Drawable paramDrawable, ad paramad, int[] paramArrayOfInt)
  {
    if ((DrawableUtils.canSafelyMutateDrawable(paramDrawable)) && (paramDrawable.mutate() != paramDrawable)) {
      Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }
    label64:
    label93:
    label106:
    for (;;)
    {
      return;
      ColorStateList localColorStateList;
      PorterDuff.Mode localMode;
      if ((paramad.d) || (paramad.c)) {
        if (paramad.d)
        {
          localColorStateList = paramad.a;
          if (!paramad.c) {
            break label93;
          }
          localMode = paramad.b;
          paramDrawable.setColorFilter(createTintFilter(localColorStateList, localMode, paramArrayOfInt));
        }
      }
      for (;;)
      {
        if (Build.VERSION.SDK_INT > 23) {
          break label106;
        }
        paramDrawable.invalidateSelf();
        return;
        localColorStateList = null;
        break;
        localMode = DEFAULT_MODE;
        break label64;
        paramDrawable.clearColorFilter();
      }
    }
  }
  
  static boolean tintDrawableUsingColorFilter(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode1 = DEFAULT_MODE;
    int j;
    Object localObject;
    int k;
    int i;
    if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, paramInt))
    {
      j = a.a.colorControlNormal;
      localObject = localMode1;
      k = 1;
      i = -1;
    }
    for (;;)
    {
      if (k != 0)
      {
        if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
          paramDrawable = paramDrawable.mutate();
        }
        paramDrawable.setColorFilter(getPorterDuffColorFilter(ac.a(paramContext, j), (PorterDuff.Mode)localObject));
        if (i != -1) {
          paramDrawable.setAlpha(i);
        }
        return true;
        if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, paramInt))
        {
          j = a.a.colorControlActivated;
          localObject = localMode1;
          k = 1;
          i = -1;
          continue;
        }
        if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, paramInt))
        {
          PorterDuff.Mode localMode2 = PorterDuff.Mode.MULTIPLY;
          k = 1;
          localObject = localMode2;
          j = 16842801;
          i = -1;
          continue;
        }
        if (paramInt == a.e.abc_list_divider_mtrl_alpha)
        {
          j = 16842800;
          i = Math.round(40.799999F);
          localObject = localMode1;
          k = 1;
          continue;
        }
        if (paramInt == a.e.abc_dialog_material_background)
        {
          j = 16842801;
          localObject = localMode1;
          k = 1;
          i = -1;
        }
      }
      else
      {
        return false;
      }
      i = -1;
      localObject = localMode1;
      j = 0;
      k = 0;
    }
  }
  
  public Drawable getDrawable(Context paramContext, int paramInt)
  {
    return getDrawable(paramContext, paramInt, false);
  }
  
  Drawable getDrawable(Context paramContext, int paramInt, boolean paramBoolean)
  {
    checkVectorDrawableSetup(paramContext);
    Drawable localDrawable = loadDrawableFromDelegates(paramContext, paramInt);
    if (localDrawable == null) {
      localDrawable = createDrawableIfNeeded(paramContext, paramInt);
    }
    if (localDrawable == null) {
      localDrawable = android.support.v4.content.a.getDrawable(paramContext, paramInt);
    }
    if (localDrawable != null) {
      localDrawable = tintDrawable(paramContext, paramInt, paramBoolean, localDrawable);
    }
    if (localDrawable != null) {
      DrawableUtils.fixDrawable(localDrawable);
    }
    return localDrawable;
  }
  
  ColorStateList getTintList(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList = getTintListFromCache(paramContext, paramInt);
    if (localColorStateList == null)
    {
      if (paramInt != a.e.abc_edit_text_material) {
        break label39;
      }
      localColorStateList = b.a(paramContext, a.c.abc_tint_edittext);
    }
    for (;;)
    {
      if (localColorStateList != null) {
        addTintListToCache(paramContext, paramInt, localColorStateList);
      }
      return localColorStateList;
      label39:
      if (paramInt == a.e.abc_switch_track_mtrl_alpha) {
        localColorStateList = b.a(paramContext, a.c.abc_tint_switch_track);
      } else if (paramInt == a.e.abc_switch_thumb_material) {
        localColorStateList = createSwitchThumbColorStateList(paramContext);
      } else if (paramInt == a.e.abc_btn_default_mtrl_shape) {
        localColorStateList = createDefaultButtonColorStateList(paramContext);
      } else if (paramInt == a.e.abc_btn_borderless_material) {
        localColorStateList = createBorderlessButtonColorStateList(paramContext);
      } else if (paramInt == a.e.abc_btn_colored_material) {
        localColorStateList = createColoredButtonColorStateList(paramContext);
      } else if ((paramInt == a.e.abc_spinner_mtrl_am_alpha) || (paramInt == a.e.abc_spinner_textfield_background_material)) {
        localColorStateList = b.a(paramContext, a.c.abc_tint_spinner);
      } else if (arrayContains(TINT_COLOR_CONTROL_NORMAL, paramInt)) {
        localColorStateList = ac.b(paramContext, a.a.colorControlNormal);
      } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, paramInt)) {
        localColorStateList = b.a(paramContext, a.c.abc_tint_default);
      } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, paramInt)) {
        localColorStateList = b.a(paramContext, a.c.abc_tint_btn_checkable);
      } else if (paramInt == a.e.abc_seekbar_thumb_material) {
        localColorStateList = b.a(paramContext, a.c.abc_tint_seek_thumb);
      }
    }
  }
  
  public void onConfigurationChanged(Context paramContext)
  {
    synchronized (this.mDrawableCacheLock)
    {
      f localf = (f)this.mDrawableCaches.get(paramContext);
      if (localf != null) {
        localf.c();
      }
      return;
    }
  }
  
  Drawable onDrawableLoadedFromResources(Context paramContext, VectorEnabledTintResources paramVectorEnabledTintResources, int paramInt)
  {
    Drawable localDrawable = loadDrawableFromDelegates(paramContext, paramInt);
    if (localDrawable == null) {
      localDrawable = paramVectorEnabledTintResources.superGetDrawable(paramInt);
    }
    if (localDrawable != null) {
      return tintDrawable(paramContext, paramInt, false, localDrawable);
    }
    return null;
  }
  
  private static class a
    implements AppCompatDrawableManager.c
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        c localc = c.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return localc;
      }
      catch (Exception localException)
      {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", localException);
      }
      return null;
    }
  }
  
  private static class b
    extends g<Integer, PorterDuffColorFilter>
  {
    public b(int paramInt)
    {
      super();
    }
    
    private static int b(int paramInt, PorterDuff.Mode paramMode)
    {
      return 31 * (paramInt + 31) + paramMode.hashCode();
    }
    
    PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
    {
      return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)));
    }
    
    PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
    {
      return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
    }
  }
  
  private static abstract interface c
  {
    public abstract Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }
  
  private static class d
    implements AppCompatDrawableManager.c
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        i locali = i.a(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return locali;
      }
      catch (Exception localException)
      {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", localException);
      }
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatDrawableManager
 * JD-Core Version:    0.7.0.1
 */