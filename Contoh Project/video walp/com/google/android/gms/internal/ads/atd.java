package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.n;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class atd
  extends RelativeLayout
{
  private static final float[] a = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private AnimationDrawable b;
  
  public atd(Context paramContext, ata paramata, RelativeLayout.LayoutParams paramLayoutParams)
  {
    super(paramContext);
    n.a(paramata);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
    localShapeDrawable.getPaint().setColor(paramata.d());
    setLayoutParams(paramLayoutParams);
    zzbv.zzem().a(this, localShapeDrawable);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(paramata.a()))
    {
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      TextView localTextView = new TextView(paramContext);
      localTextView.setLayoutParams(localLayoutParams2);
      localTextView.setId(1195835393);
      localTextView.setTypeface(Typeface.DEFAULT);
      localTextView.setText(paramata.a());
      localTextView.setTextColor(paramata.e());
      localTextView.setTextSize(paramata.f());
      aos.a();
      int i = lz.a(paramContext, 4);
      aos.a();
      localTextView.setPadding(i, 0, lz.a(paramContext, 4), 0);
      addView(localTextView);
      localLayoutParams1.addRule(1, localTextView.getId());
    }
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(localLayoutParams1);
    localImageView.setId(1195835394);
    List localList = paramata.c();
    if ((localList != null) && (localList.size() > 1))
    {
      this.b = new AnimationDrawable();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ate localate = (ate)localIterator.next();
        try
        {
          Drawable localDrawable = (Drawable)b.a(localate.a());
          this.b.addFrame(localDrawable, paramata.g());
        }
        catch (Exception localException2)
        {
          je.b("Error while getting drawable.", localException2);
        }
      }
      zzbv.zzem().a(localImageView, this.b);
    }
    for (;;)
    {
      addView(localImageView);
      return;
      if (localList.size() == 1) {
        try
        {
          localImageView.setImageDrawable((Drawable)b.a(((ate)localList.get(0)).a()));
        }
        catch (Exception localException1)
        {
          je.b("Error while getting drawable.", localException1);
        }
      }
    }
  }
  
  public final void onAttachedToWindow()
  {
    if (this.b != null) {
      this.b.start();
    }
    super.onAttachedToWindow();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atd
 * JD-Core Version:    0.7.0.1
 */