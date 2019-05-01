package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@cm
@TargetApi(14)
public final class pg
  implements AudioManager.OnAudioFocusChangeListener
{
  private final AudioManager a;
  private final pi b;
  private boolean c;
  private boolean d;
  private boolean e;
  private float f = 1.0F;
  
  public pg(Context paramContext, pi parampi)
  {
    this.a = ((AudioManager)paramContext.getSystemService("audio"));
    this.b = parampi;
  }
  
  private final void d()
  {
    int i = 1;
    int j;
    if ((this.d) && (!this.e) && (this.f > 0.0F))
    {
      j = i;
      if ((j == 0) || (this.c)) {
        break label94;
      }
      if ((this.a != null) && (!this.c)) {
        break label67;
      }
      this.b.e();
    }
    label67:
    label94:
    while ((j != 0) || (!this.c))
    {
      return;
      j = 0;
      break;
      if (this.a.requestAudioFocus(this, 3, 2) == i) {}
      for (;;)
      {
        this.c = i;
        break;
        i = 0;
      }
    }
    if ((this.a == null) || (!this.c))
    {
      this.b.e();
      return;
    }
    if (this.a.abandonAudioFocus(this) == 0) {}
    for (;;)
    {
      this.c = i;
      break;
      i = 0;
    }
  }
  
  public final float a()
  {
    if (this.e) {}
    for (float f1 = 0.0F; this.c; f1 = this.f) {
      return f1;
    }
    return 0.0F;
  }
  
  public final void a(float paramFloat)
  {
    this.f = paramFloat;
    d();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    d();
  }
  
  public final void b()
  {
    this.d = true;
    d();
  }
  
  public final void c()
  {
    this.d = false;
    d();
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      this.b.e();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pg
 * JD-Core Version:    0.7.0.1
 */