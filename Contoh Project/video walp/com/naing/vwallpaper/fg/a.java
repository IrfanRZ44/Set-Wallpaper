package com.naing.vwallpaper.fg;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.List;

public class a
  extends RecyclerView.Adapter<b>
{
  Context a;
  List<com.naing.model.a> b;
  a c;
  
  public a(Context paramContext, List<com.naing.model.a> paramList)
  {
    this.b = paramList;
    this.a = paramContext;
  }
  
  public b a(ViewGroup paramViewGroup, int paramInt)
  {
    return new b(LayoutInflater.from(this.a).inflate(2131361843, paramViewGroup, false));
  }
  
  public void a(a parama)
  {
    this.c = parama;
  }
  
  public void a(b paramb, final int paramInt)
  {
    if (this.b == null) {
      return;
    }
    final com.naing.model.a locala = (com.naing.model.a)this.b.get(paramInt);
    paramb.a.setBackgroundColor(Color.parseColor("#" + locala.b()));
    paramb.b.setText(locala.c());
    paramb.c.setText("#" + locala.b());
    paramb.d.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (a.this.c != null) {
          a.this.c.a(locala, paramInt);
        }
      }
    });
  }
  
  public void a(List<com.naing.model.a> paramList)
  {
    this.b = paramList;
    notifyDataSetChanged();
  }
  
  public int getItemCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
  
  static abstract interface a
  {
    public abstract void a(com.naing.model.a parama, int paramInt);
  }
  
  static class b
    extends RecyclerView.ViewHolder
  {
    View a;
    AppCompatTextView b;
    AppCompatTextView c;
    CardView d;
    
    public b(View paramView)
    {
      super();
      this.a = paramView.findViewById(2131230868);
      this.b = ((AppCompatTextView)paramView.findViewById(2131230946));
      this.c = ((AppCompatTextView)paramView.findViewById(2131230945));
      this.d = ((CardView)paramView.findViewById(2131230779));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.fg.a
 * JD-Core Version:    0.7.0.1
 */