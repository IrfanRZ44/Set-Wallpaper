package com.naing.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class RangeBar
  extends LinearLayout
{
  private ImageView a;
  private ImageView b;
  private ImageView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private RelativeLayout g;
  private RelativeLayout h;
  private FrameLayout.LayoutParams i;
  private RelativeLayout.LayoutParams j;
  private RelativeLayout.LayoutParams k;
  private RelativeLayout.LayoutParams l;
  private a m;
  private long n;
  private long o;
  private long p;
  private long q;
  private long r;
  private long s;
  private long t;
  private long u;
  private long v;
  private boolean w = false;
  
  public RangeBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public RangeBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  @SuppressLint({"DefaultLocale"})
  public static String a(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(2);
    String str1 = String.format("%%0%dd", arrayOfObject1);
    long l1 = paramLong / 1000L;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(l1 % 60L);
    String str2 = String.format(str1, arrayOfObject2);
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Long.valueOf(l1 % 3600L / 60L);
    String str3 = String.format(str1, arrayOfObject3);
    Object[] arrayOfObject4 = new Object[1];
    arrayOfObject4[0] = Long.valueOf(l1 / 3600L);
    String str4 = String.format(str1, arrayOfObject4);
    if (str4.equals("00")) {
      return str3 + ":" + str2;
    }
    return str4 + ":" + str3 + ":" + str2;
  }
  
  private void a(Context paramContext)
  {
    this.r = 0L;
    this.s = 0L;
    this.t = 0L;
    this.u = 0L;
    this.v = 0L;
    this.n = 0L;
    this.o = 0L;
    this.p = 0L;
    this.q = 0L;
    View localView = LayoutInflater.from(paramContext).inflate(2131361869, this);
    this.g = ((RelativeLayout)localView.findViewById(2131230931));
    this.h = ((RelativeLayout)localView.findViewById(2131230870));
    this.j = ((RelativeLayout.LayoutParams)this.h.getLayoutParams());
    this.d = ((TextView)localView.findViewById(2131230793));
    this.e = ((TextView)localView.findViewById(2131230918));
    this.f = ((TextView)localView.findViewById(2131230806));
    this.c = ((ImageView)localView.findViewById(2131230871));
    this.i = ((FrameLayout.LayoutParams)this.c.getLayoutParams());
    this.a = ((ImageView)localView.findViewById(2131230840));
    this.k = ((RelativeLayout.LayoutParams)this.a.getLayoutParams());
    this.b = ((ImageView)localView.findViewById(2131230878));
    this.l = ((RelativeLayout.LayoutParams)this.b.getLayoutParams());
  }
  
  private void a(View paramView)
  {
    if (paramView.getParent() != null) {
      paramView.getParent().requestDisallowInterceptTouchEvent(true);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.n == 1L)
    {
      long l2 = this.p * this.r / (getWidth() - 2L * this.o);
      this.s = l2;
      a(l2, paramBoolean);
      return;
    }
    if (this.n == 2L)
    {
      long l1 = this.q * this.r / (getWidth() - 2L * this.o);
      this.t = l1;
      b(l1, paramBoolean);
      return;
    }
    if (this.u < this.s) {
      this.u = this.s;
    }
    for (;;)
    {
      c(this.u, paramBoolean);
      setCurrentPosition(this.u);
      return;
      if (this.u > this.t) {
        this.u = this.t;
      }
    }
  }
  
  private void setThumbPosition(long paramLong)
  {
    if (this.n == 1L) {
      if (paramLong < this.o)
      {
        this.p = 0L;
        this.k.leftMargin = ((int)this.p);
        this.a.setLayoutParams(this.k);
      }
    }
    for (;;)
    {
      this.j.leftMargin = ((int)(this.p + this.o + this.o / 2L));
      this.j.rightMargin = ((int)(getWidth() - (this.q + this.o / 2L)));
      this.h.setLayoutParams(this.j);
      return;
      if (paramLong + this.o >= this.q)
      {
        this.p = (this.q - 2L * this.o);
        break;
      }
      this.p = (paramLong - this.o);
      break;
      if (this.n == 2L)
      {
        if (paramLong > getWidth() - this.o) {
          this.q = (getWidth() - 2L * this.o);
        }
        for (;;)
        {
          this.l.leftMargin = ((int)this.q);
          this.b.setLayoutParams(this.l);
          break;
          if (paramLong - 2L * this.o <= this.p + this.o) {
            this.q = (this.p + 2L * this.o);
          } else {
            this.q = (paramLong - this.o);
          }
        }
      }
      this.u = ((paramLong - this.o) * this.r / (getWidth() - 2L * this.o));
    }
  }
  
  public void a(long paramLong1, long paramLong2, long paramLong3)
  {
    this.r = paramLong3;
    this.s = paramLong1;
    this.u = paramLong1;
    this.t = paramLong2;
    this.d.setText(a(this.u));
    this.e.setText(a(this.s));
    this.f.setText(a(this.t));
    this.o = (this.a.getDrawable().getIntrinsicWidth() / 2);
    this.p = (paramLong1 * getWidth() / paramLong3);
    this.q = (paramLong2 * getWidth() / paramLong3 - 2L * this.o);
    this.v = this.o;
    this.k.leftMargin = ((int)this.p);
    this.l.leftMargin = ((int)this.q);
    this.j.leftMargin = ((int)(this.p + this.o + this.o / 2L));
    this.j.rightMargin = ((int)(getWidth() - (this.q + this.o / 2L)));
    setCurrentPosition(this.u * getWidth() / paramLong3);
    this.a.setLayoutParams(this.k);
    this.b.setLayoutParams(this.l);
    this.h.setLayoutParams(this.j);
    this.g.setVisibility(0);
    this.h.setVisibility(0);
    this.c.setVisibility(0);
    this.w = true;
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    if (this.m != null)
    {
      this.e.setText(a(this.s));
      this.m.b(paramLong, paramBoolean);
    }
  }
  
  public void b(long paramLong, boolean paramBoolean)
  {
    if (this.m != null)
    {
      this.f.setText(a(this.t));
      this.m.a(paramLong, paramBoolean);
    }
  }
  
  public void c(long paramLong, boolean paramBoolean)
  {
    if (this.m != null) {
      this.m.c(paramLong, paramBoolean);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1;
    if (this.w) {
      i1 = (int)paramMotionEvent.getX();
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return true;
    case 0: 
      this.n = 0L;
      if ((this.p <= i1) && (this.p + 2L * this.o >= i1)) {}
      for (this.n = 1L;; this.n = 2L) {
        do
        {
          setThumbPosition(i1);
          a(false);
          return true;
        } while ((this.q > i1) || (this.q + 2L * this.o < i1));
      }
    case 2: 
      setThumbPosition(i1);
      a(false);
      a(this);
      invalidate();
      return true;
    case 1: 
      setThumbPosition(i1);
      a(true);
      this.n = 0L;
      invalidate();
      return true;
    }
    this.n = 0L;
    invalidate();
    return true;
  }
  
  public void setCurrentPosition(long paramLong)
  {
    this.v = (this.o + paramLong * (getWidth() - 2L * this.o) / this.r);
    if (this.v < this.p + this.o) {
      this.v = (this.p + this.o);
    }
    for (;;)
    {
      this.i.leftMargin = ((int)this.v - this.c.getWidth() / 2);
      this.c.setLayoutParams(this.i);
      this.d.setText(a(paramLong));
      return;
      if (this.v > this.q + this.o) {
        this.v = (this.q + this.o);
      }
    }
  }
  
  public void setOnRangeBarListener(a parama)
  {
    this.m = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(long paramLong, boolean paramBoolean);
    
    public abstract void b(long paramLong, boolean paramBoolean);
    
    public abstract void c(long paramLong, boolean paramBoolean);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.view.RangeBar
 * JD-Core Version:    0.7.0.1
 */