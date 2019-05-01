package com.naing.vwallpaper.fg;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.arch.lifecycle.m;
import android.arch.lifecycle.n;
import android.arch.lifecycle.t;
import android.arch.lifecycle.u;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.flask.colorpicker.ColorPickerView.a;
import java.util.List;

public class b
  extends Fragment
{
  a a;
  RecyclerView b;
  ProgressBar c;
  CWpViewModel d;
  ProgressDialog e;
  
  public static b a()
  {
    return new b();
  }
  
  private void a(final int paramInt, String paramString)
  {
    View localView = LayoutInflater.from(getContext()).inflate(2131361868, null);
    localView.findViewById(2131230788).setBackgroundColor(Color.parseColor("#" + paramString));
    new AlertDialog.Builder(getContext()).setTitle(null).setView(localView).setPositiveButton(2131558489, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        b.this.e = ProgressDialog.show(b.this.getContext(), null, b.this.getString(2131558452), true, false);
        b.this.d.a(paramInt);
      }
    }).setNegativeButton(17039360, null).show();
  }
  
  private void b()
  {
    this.c.setVisibility(0);
    this.d = ((CWpViewModel)u.a(this).a(CWpViewModel.class));
    this.d.a().observe(this, new n()
    {
      public void a(List<com.naing.model.a> paramAnonymousList)
      {
        b.this.c.setVisibility(8);
        b.this.a.a(paramAnonymousList);
      }
    });
    this.d.b().observe(this, new n()
    {
      public void a(Boolean paramAnonymousBoolean)
      {
        if (b.this.e != null) {
          b.this.e.dismiss();
        }
        Context localContext = b.this.getContext();
        b localb = b.this;
        if (paramAnonymousBoolean.booleanValue()) {}
        for (int i = 2131558451;; i = 2131558450)
        {
          com.naing.c.b.a(localContext, localb.getString(i));
          return;
        }
      }
    });
  }
  
  private void c()
  {
    com.flask.colorpicker.a.b.a(getContext()).a(2131558479).a(ColorPickerView.a.a).a(null).a(2131558480, new com.flask.colorpicker.a.a()
    {
      public void a(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, Integer[] paramAnonymousArrayOfInteger)
      {
        b.a(b.this, paramAnonymousInt, Integer.toHexString(paramAnonymousInt));
      }
    }).a(17039360, null).d().show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131427330, paramMenu);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2131361841, paramViewGroup, false);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    c();
    return true;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.c = ((ProgressBar)paramView.findViewById(2131230869));
    this.b = ((RecyclerView)paramView.findViewById(2131230881));
    this.b.setHasFixedSize(true);
    this.b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
    this.a = new a(getContext(), null);
    this.a.a(new a.a()
    {
      public void a(com.naing.model.a paramAnonymousa, int paramAnonymousInt)
      {
        b.a(b.this, paramAnonymousa.a(), paramAnonymousa.b());
      }
    });
    this.b.setAdapter(this.a);
    b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.fg.b
 * JD-Core Version:    0.7.0.1
 */