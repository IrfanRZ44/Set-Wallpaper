package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.i;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.n;

@TargetApi(17)
public class jz
  extends kb
{
  public final Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    if ((!paramBoolean) || (paramFloat <= 0.0F) || (paramFloat > 25.0F)) {
      return new BitmapDrawable(paramContext.getResources(), paramBitmap);
    }
    try
    {
      Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight(), false);
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1);
      RenderScript localRenderScript = RenderScript.create(paramContext);
      ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create(localRenderScript, Element.U8_4(localRenderScript));
      Allocation localAllocation1 = Allocation.createFromBitmap(localRenderScript, localBitmap1);
      Allocation localAllocation2 = Allocation.createFromBitmap(localRenderScript, localBitmap2);
      localScriptIntrinsicBlur.setRadius(paramFloat);
      localScriptIntrinsicBlur.setInput(localAllocation1);
      localScriptIntrinsicBlur.forEach(localAllocation2);
      localAllocation2.copyTo(localBitmap2);
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramContext.getResources(), localBitmap2);
      return localBitmapDrawable;
    }
    catch (RuntimeException localRuntimeException) {}
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }
  
  public final String a(Context paramContext)
  {
    ls localls = ls.a();
    if (TextUtils.isEmpty(localls.a)) {
      if (!b.a()) {
        break label47;
      }
    }
    label47:
    for (String str = (String)lq.a(paramContext, new lt(localls, paramContext));; str = (String)lq.a(paramContext, new lu(localls, i.c(paramContext), paramContext)))
    {
      localls.a = str;
      return localls.a;
    }
  }
  
  public final boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
    return true;
  }
  
  public final void b(Context paramContext)
  {
    ls localls = ls.a();
    je.a("Updating user agent.");
    String str1 = WebSettings.getDefaultUserAgent(paramContext);
    SharedPreferences.Editor localEditor;
    if (!str1.equals(localls.a))
    {
      Context localContext = i.c(paramContext);
      if ((b.a()) || (localContext == null))
      {
        String str2 = WebSettings.getDefaultUserAgent(paramContext);
        localEditor = paramContext.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", str2);
        if (localContext != null) {
          break label94;
        }
        localEditor.apply();
      }
    }
    for (;;)
    {
      localls.a = str1;
      je.a("User agent is updated.");
      return;
      label94:
      n.a(paramContext, localEditor, "admob_user_agent");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jz
 * JD-Core Version:    0.7.0.1
 */