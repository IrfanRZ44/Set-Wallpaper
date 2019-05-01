package com.naing.vwallpaper.fg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.naing.c.b;
import com.naing.view.RangeBar;
import com.naing.vwallpaper.AdjusterActivity;
import com.naing.vwallpaper.MainActivity;
import com.naing.vwallpaper.VideoChooser;
import java.io.File;

public class c
  extends Fragment
  implements View.OnClickListener
{
  private RelativeLayout a;
  private RelativeLayout b;
  private RelativeLayout c;
  private RelativeLayout d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private ImageView i;
  private ImageView j;
  private SharedPreferences k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private String p;
  private Typeface q;
  private MainActivity r;
  
  public static c a()
  {
    return new c();
  }
  
  private boolean c()
  {
    if (this.p.equals(getResources().getString(2131558491)))
    {
      b.a(getContext(), getResources().getString(2131558491));
      d();
      return false;
    }
    File localFile = new File(this.p);
    if ((!localFile.exists()) || (!localFile.isFile()))
    {
      b.a(getContext(), getString(2131558493));
      d();
      return false;
    }
    return true;
  }
  
  private void d()
  {
    startActivityForResult(new Intent(getContext(), VideoChooser.class), b.b);
  }
  
  private void e()
  {
    TextView localTextView = this.g;
    Resources localResources1 = getResources();
    int i1;
    ImageView localImageView;
    Resources localResources2;
    if (this.l)
    {
      i1 = 2131558483;
      localTextView.setText(localResources1.getString(i1));
      localImageView = this.i;
      localResources2 = getResources();
      if (!this.l) {
        break label71;
      }
    }
    label71:
    for (int i2 = 2131165299;; i2 = 2131165298)
    {
      localImageView.setImageDrawable(localResources2.getDrawable(i2));
      return;
      i1 = 2131558482;
      break;
    }
  }
  
  private void f()
  {
    TextView localTextView = this.h;
    Resources localResources1 = getResources();
    int i1;
    ImageView localImageView;
    Resources localResources2;
    if (this.m)
    {
      i1 = 2131558487;
      localTextView.setText(localResources1.getString(i1));
      localImageView = this.j;
      localResources2 = getResources();
      if (!this.m) {
        break label71;
      }
    }
    label71:
    for (int i2 = 2131165289;; i2 = 2131165288)
    {
      localImageView.setImageDrawable(localResources2.getDrawable(i2));
      return;
      i1 = 2131558488;
      break;
    }
  }
  
  void b()
  {
    if (!com.naing.c.c.a(getContext())) {
      com.naing.c.c.a(getActivity(), 1001, getString(2131558467));
    }
    while (!c()) {
      return;
    }
    startActivityForResult(new Intent(getContext(), AdjusterActivity.class), b.b);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == b.b) && (paramInt2 == -1)) {
      getActivity().finish();
    }
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    if ((paramContext instanceof MainActivity)) {
      this.r = ((MainActivity)paramContext);
    }
  }
  
  public void onClick(View paramView)
  {
    boolean bool = true;
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131230766: 
      if (!this.l) {}
      for (;;)
      {
        this.l = bool;
        this.k.edit().putBoolean("sound", this.l).commit();
        e();
        return;
        bool = false;
      }
    case 2131230959: 
      d();
      return;
    case 2131230885: 
      if (!this.m) {}
      for (;;)
      {
        this.m = bool;
        this.k.edit().putBoolean("scale", this.m).commit();
        f();
        return;
        bool = false;
      }
    case 2131230875: 
      b();
      return;
    case 2131230876: 
      b.g(getContext());
      return;
    }
    b.f(getContext());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131427328, paramMenu);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2131361842, paramViewGroup, false);
  }
  
  public void onDetach()
  {
    super.onDetach();
    this.r = null;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    switch (paramMenuItem.getItemId())
    {
    default: 
      bool = super.onOptionsItemSelected(paramMenuItem);
    }
    do
    {
      do
      {
        return bool;
      } while (!c());
      b.d(getContext());
      getActivity().finish();
      return bool;
    } while (this.r == null);
    this.r.e();
    return bool;
  }
  
  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    if ((this.r != null) && (this.r.f())) {
      paramMenu.findItem(2131230756).setVisible(false);
    }
    super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if ((paramInt == 1001) && (com.naing.c.c.a(paramArrayOfInt))) {
      b();
    }
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.q = b.e(getContext());
    this.a = ((RelativeLayout)paramView.findViewById(2131230875));
    this.b = ((RelativeLayout)paramView.findViewById(2131230959));
    this.c = ((RelativeLayout)paramView.findViewById(2131230766));
    this.d = ((RelativeLayout)paramView.findViewById(2131230885));
    this.i = ((ImageView)paramView.findViewById(2131230826));
    this.j = ((ImageView)paramView.findViewById(2131230832));
    this.e = ((TextView)paramView.findViewById(2131230952));
    this.f = ((TextView)paramView.findViewById(2131230955));
    this.g = ((TextView)paramView.findViewById(2131230949));
    this.h = ((TextView)paramView.findViewById(2131230954));
    this.e.setTypeface(this.q);
    this.f.setTypeface(this.q);
    this.g.setTypeface(this.q);
    this.h.setTypeface(this.q);
    ((TextView)paramView.findViewById(2131230953)).setTypeface(this.q);
    ((TextView)paramView.findViewById(2131230950)).setTypeface(this.q);
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    paramView.findViewById(2131230851).setOnClickListener(this);
    paramView.findViewById(2131230876).setOnClickListener(this);
    this.k = b.a(getContext());
    this.n = this.k.getInt("start", 0);
    this.o = this.k.getInt("end", 0);
    this.l = this.k.getBoolean("sound", false);
    this.m = this.k.getBoolean("scale", false);
    this.p = this.k.getString("location", getResources().getString(2131558491));
    this.f.setText(this.p);
    e();
    f();
    TextView localTextView = this.e;
    String str = getResources().getString(2131558485);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = RangeBar.a(this.n);
    arrayOfObject[1] = RangeBar.a(this.o);
    localTextView.setText(String.format(str, arrayOfObject));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.fg.c
 * JD-Core Version:    0.7.0.1
 */