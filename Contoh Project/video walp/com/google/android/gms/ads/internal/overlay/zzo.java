package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.lz;
import javax.annotation.Nullable;

@cm
public final class zzo
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton a;
  private final zzw b;
  
  public zzo(Context paramContext, g paramg, @Nullable zzw paramzzw)
  {
    super(paramContext);
    this.b = paramzzw;
    setOnClickListener(this);
    this.a = new ImageButton(paramContext);
    this.a.setImageResource(17301527);
    this.a.setBackgroundColor(0);
    this.a.setOnClickListener(this);
    ImageButton localImageButton1 = this.a;
    aos.a();
    int i = lz.a(paramContext, paramg.a);
    aos.a();
    int j = lz.a(paramContext, 0);
    aos.a();
    int k = lz.a(paramContext, paramg.b);
    aos.a();
    localImageButton1.setPadding(i, j, k, lz.a(paramContext, paramg.d));
    this.a.setContentDescription("Interstitial close button");
    aos.a();
    lz.a(paramContext, paramg.e);
    ImageButton localImageButton2 = this.a;
    aos.a();
    int m = lz.a(paramContext, paramg.e + paramg.a + paramg.b);
    aos.a();
    addView(localImageButton2, new FrameLayout.LayoutParams(m, lz.a(paramContext, paramg.e + paramg.d), 17));
  }
  
  public final void onClick(View paramView)
  {
    if (this.b != null) {
      this.b.zzni();
    }
  }
  
  public final void zzu(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzo
 * JD-Core Version:    0.7.0.1
 */