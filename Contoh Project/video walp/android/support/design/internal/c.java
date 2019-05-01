package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.d;
import android.support.design.a.h;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.u;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class c
  implements o
{
  LinearLayout a;
  h b;
  b c;
  LayoutInflater d;
  int e;
  boolean f;
  ColorStateList g;
  ColorStateList h;
  Drawable i;
  int j;
  final View.OnClickListener k = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      NavigationMenuItemView localNavigationMenuItemView = (NavigationMenuItemView)paramAnonymousView;
      c.this.b(true);
      j localj = localNavigationMenuItemView.getItemData();
      boolean bool = c.this.b.a(localj, c.this, 0);
      if ((localj != null) && (localj.isCheckable()) && (bool)) {
        c.this.c.a(localj);
      }
      c.this.b(false);
      c.this.a(false);
    }
  };
  private NavigationMenuView l;
  private o.a m;
  private int n;
  private int o;
  
  public p a(ViewGroup paramViewGroup)
  {
    if (this.l == null)
    {
      this.l = ((NavigationMenuView)this.d.inflate(a.h.design_navigation_menu, paramViewGroup, false));
      if (this.c == null) {
        this.c = new b();
      }
      this.a = ((LinearLayout)this.d.inflate(a.h.design_navigation_item_header, this.l, false));
      this.l.setAdapter(this.c);
    }
    return this.l;
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void a(Context paramContext, h paramh)
  {
    this.d = LayoutInflater.from(paramContext);
    this.b = paramh;
    this.j = paramContext.getResources().getDimensionPixelOffset(a.d.design_navigation_separator_vertical_padding);
  }
  
  public void a(ColorStateList paramColorStateList)
  {
    this.h = paramColorStateList;
    a(false);
  }
  
  public void a(Drawable paramDrawable)
  {
    this.i = paramDrawable;
    a(false);
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle1 = (Bundle)paramParcelable;
      SparseArray localSparseArray1 = localBundle1.getSparseParcelableArray("android:menu:list");
      if (localSparseArray1 != null) {
        this.l.restoreHierarchyState(localSparseArray1);
      }
      Bundle localBundle2 = localBundle1.getBundle("android:menu:adapter");
      if (localBundle2 != null) {
        this.c.a(localBundle2);
      }
      SparseArray localSparseArray2 = localBundle1.getSparseParcelableArray("android:menu:header");
      if (localSparseArray2 != null) {
        this.a.restoreHierarchyState(localSparseArray2);
      }
    }
  }
  
  public void a(aa paramaa)
  {
    int i1 = paramaa.b();
    if (this.o != i1)
    {
      this.o = i1;
      if (this.a.getChildCount() == 0) {
        this.l.setPadding(0, this.o, 0, this.l.getPaddingBottom());
      }
    }
    s.b(this.a, paramaa);
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    if (this.m != null) {
      this.m.a(paramh, paramBoolean);
    }
  }
  
  public void a(j paramj)
  {
    this.c.a(paramj);
  }
  
  public void a(o.a parama)
  {
    this.m = parama;
  }
  
  public void a(View paramView)
  {
    this.a.addView(paramView);
    this.l.setPadding(0, 0, 0, this.l.getPaddingBottom());
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(h paramh, j paramj)
  {
    return false;
  }
  
  public boolean a(u paramu)
  {
    return false;
  }
  
  public int b()
  {
    return this.n;
  }
  
  public View b(int paramInt)
  {
    View localView = this.d.inflate(paramInt, this.a, false);
    a(localView);
    return localView;
  }
  
  public void b(ColorStateList paramColorStateList)
  {
    this.g = paramColorStateList;
    a(false);
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.c != null) {
      this.c.a(paramBoolean);
    }
  }
  
  public boolean b(h paramh, j paramj)
  {
    return false;
  }
  
  public Parcelable c()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      Bundle localBundle = new Bundle();
      if (this.l != null)
      {
        SparseArray localSparseArray1 = new SparseArray();
        this.l.saveHierarchyState(localSparseArray1);
        localBundle.putSparseParcelableArray("android:menu:list", localSparseArray1);
      }
      if (this.c != null) {
        localBundle.putBundle("android:menu:adapter", this.c.b());
      }
      if (this.a != null)
      {
        SparseArray localSparseArray2 = new SparseArray();
        this.a.saveHierarchyState(localSparseArray2);
        localBundle.putSparseParcelableArray("android:menu:header", localSparseArray2);
      }
      return localBundle;
    }
    return null;
  }
  
  public void c(int paramInt)
  {
    this.e = paramInt;
    this.f = true;
    a(false);
  }
  
  public int d()
  {
    return this.a.getChildCount();
  }
  
  public ColorStateList e()
  {
    return this.h;
  }
  
  public ColorStateList f()
  {
    return this.g;
  }
  
  public Drawable g()
  {
    return this.i;
  }
  
  private static class a
    extends c.j
  {
    public a(View paramView)
    {
      super();
    }
  }
  
  private class b
    extends RecyclerView.Adapter<c.j>
  {
    private final ArrayList<c.d> b = new ArrayList();
    private j c;
    private boolean d;
    
    b()
    {
      c();
    }
    
    private void a(int paramInt1, int paramInt2)
    {
      while (paramInt1 < paramInt2)
      {
        ((c.f)this.b.get(paramInt1)).a = true;
        paramInt1++;
      }
    }
    
    private void c()
    {
      if (this.d) {
        return;
      }
      this.d = true;
      this.b.clear();
      this.b.add(new c.c());
      int i = -1;
      int j = 0;
      boolean bool1 = false;
      int k = c.this.b.i().size();
      int m = 0;
      j localj1;
      int i2;
      int n;
      int i1;
      boolean bool2;
      for (;;)
      {
        if (m < k)
        {
          localj1 = (j)c.this.b.i().get(m);
          if (localj1.isChecked()) {
            a(localj1);
          }
          if (localj1.isCheckable()) {
            localj1.a(false);
          }
          if (localj1.hasSubMenu())
          {
            SubMenu localSubMenu = localj1.getSubMenu();
            if (localSubMenu.hasVisibleItems())
            {
              if (m != 0) {
                this.b.add(new c.e(c.this.j, 0));
              }
              this.b.add(new c.f(localj1));
              int i3 = 0;
              int i4 = this.b.size();
              int i5 = localSubMenu.size();
              for (int i6 = 0; i6 < i5; i6++)
              {
                j localj2 = (j)localSubMenu.getItem(i6);
                if (localj2.isVisible())
                {
                  if ((i3 == 0) && (localj2.getIcon() != null)) {
                    i3 = 1;
                  }
                  if (localj2.isCheckable()) {
                    localj2.a(false);
                  }
                  if (localj1.isChecked()) {
                    a(localj1);
                  }
                  this.b.add(new c.f(localj2));
                }
              }
              if (i3 != 0) {
                a(i4, this.b.size());
              }
            }
            i2 = i;
            m++;
            i = i2;
          }
          else
          {
            n = localj1.getGroupId();
            if (n != i)
            {
              i1 = this.b.size();
              if (localj1.getIcon() != null)
              {
                bool2 = true;
                label368:
                if (m != 0)
                {
                  i1++;
                  this.b.add(new c.e(c.this.j, c.this.j));
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        c.f localf = new c.f(localj1);
        localf.a = bool2;
        this.b.add(localf);
        bool1 = bool2;
        j = i1;
        i2 = n;
        break;
        bool2 = false;
        break label368;
        if ((!bool1) && (localj1.getIcon() != null))
        {
          bool2 = true;
          a(j, this.b.size());
          i1 = j;
          continue;
          this.d = false;
        }
        else
        {
          bool2 = bool1;
          i1 = j;
        }
      }
    }
    
    public c.j a(ViewGroup paramViewGroup, int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 0: 
        return new c.g(c.this.d, paramViewGroup, c.this.k);
      case 1: 
        return new c.i(c.this.d, paramViewGroup);
      case 2: 
        return new c.h(c.this.d, paramViewGroup);
      }
      return new c.a(c.this.a);
    }
    
    public void a()
    {
      c();
      notifyDataSetChanged();
    }
    
    public void a(Bundle paramBundle)
    {
      int i = 0;
      int j = paramBundle.getInt("android:menu:checked", 0);
      int n;
      SparseArray localSparseArray;
      label121:
      c.d locald1;
      if (j != 0)
      {
        this.d = true;
        int m = this.b.size();
        n = 0;
        if (n < m)
        {
          c.d locald2 = (c.d)this.b.get(n);
          if ((locald2 instanceof c.f))
          {
            j localj2 = ((c.f)locald2).a();
            if ((localj2 != null) && (localj2.getItemId() == j)) {
              a(localj2);
            }
          }
        }
        else
        {
          this.d = false;
          c();
        }
      }
      else
      {
        localSparseArray = paramBundle.getSparseParcelableArray("android:menu:action_views");
        if (localSparseArray == null) {
          return;
        }
        int k = this.b.size();
        if (i >= k) {
          return;
        }
        locald1 = (c.d)this.b.get(i);
        if ((locald1 instanceof c.f)) {
          break label160;
        }
      }
      for (;;)
      {
        i++;
        break label121;
        n++;
        break;
        label160:
        j localj1 = ((c.f)locald1).a();
        if (localj1 != null)
        {
          View localView = localj1.getActionView();
          if (localView != null)
          {
            ParcelableSparseArray localParcelableSparseArray = (ParcelableSparseArray)localSparseArray.get(localj1.getItemId());
            if (localParcelableSparseArray != null) {
              localView.restoreHierarchyState(localParcelableSparseArray);
            }
          }
        }
      }
    }
    
    public void a(c.j paramj)
    {
      if ((paramj instanceof c.g)) {
        ((NavigationMenuItemView)paramj.itemView).b();
      }
    }
    
    public void a(c.j paramj, int paramInt)
    {
      switch (getItemViewType(paramInt))
      {
      default: 
        return;
      case 0: 
        NavigationMenuItemView localNavigationMenuItemView = (NavigationMenuItemView)paramj.itemView;
        localNavigationMenuItemView.setIconTintList(c.this.h);
        if (c.this.f) {
          localNavigationMenuItemView.setTextAppearance(c.this.e);
        }
        if (c.this.g != null) {
          localNavigationMenuItemView.setTextColor(c.this.g);
        }
        if (c.this.i != null) {}
        for (Drawable localDrawable = c.this.i.getConstantState().newDrawable();; localDrawable = null)
        {
          s.a(localNavigationMenuItemView, localDrawable);
          c.f localf = (c.f)this.b.get(paramInt);
          localNavigationMenuItemView.setNeedsEmptyIcon(localf.a);
          localNavigationMenuItemView.a(localf.a(), 0);
          return;
        }
      case 1: 
        ((TextView)paramj.itemView).setText(((c.f)this.b.get(paramInt)).a().getTitle());
        return;
      }
      c.e locale = (c.e)this.b.get(paramInt);
      paramj.itemView.setPadding(0, locale.a(), 0, locale.b());
    }
    
    public void a(j paramj)
    {
      if ((this.c == paramj) || (!paramj.isCheckable())) {
        return;
      }
      if (this.c != null) {
        this.c.setChecked(false);
      }
      this.c = paramj;
      paramj.setChecked(true);
    }
    
    public void a(boolean paramBoolean)
    {
      this.d = paramBoolean;
    }
    
    public Bundle b()
    {
      Bundle localBundle = new Bundle();
      if (this.c != null) {
        localBundle.putInt("android:menu:checked", this.c.getItemId());
      }
      SparseArray localSparseArray = new SparseArray();
      int i = this.b.size();
      int j = 0;
      if (j < i)
      {
        c.d locald = (c.d)this.b.get(j);
        j localj;
        if ((locald instanceof c.f))
        {
          localj = ((c.f)locald).a();
          if (localj == null) {
            break label135;
          }
        }
        label135:
        for (View localView = localj.getActionView();; localView = null)
        {
          if (localView != null)
          {
            ParcelableSparseArray localParcelableSparseArray = new ParcelableSparseArray();
            localView.saveHierarchyState(localParcelableSparseArray);
            localSparseArray.put(localj.getItemId(), localParcelableSparseArray);
          }
          j++;
          break;
        }
      }
      localBundle.putSparseParcelableArray("android:menu:action_views", localSparseArray);
      return localBundle;
    }
    
    public int getItemCount()
    {
      return this.b.size();
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public int getItemViewType(int paramInt)
    {
      c.d locald = (c.d)this.b.get(paramInt);
      if ((locald instanceof c.e)) {
        return 2;
      }
      if ((locald instanceof c.c)) {
        return 3;
      }
      if ((locald instanceof c.f))
      {
        if (((c.f)locald).a().hasSubMenu()) {
          return 1;
        }
        return 0;
      }
      throw new RuntimeException("Unknown item type.");
    }
  }
  
  private static class c
    implements c.d
  {}
  
  private static abstract interface d {}
  
  private static class e
    implements c.d
  {
    private final int a;
    private final int b;
    
    public e(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    public int a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.b;
    }
  }
  
  private static class f
    implements c.d
  {
    boolean a;
    private final j b;
    
    f(j paramj)
    {
      this.b = paramj;
    }
    
    public j a()
    {
      return this.b;
    }
  }
  
  private static class g
    extends c.j
  {
    public g(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, View.OnClickListener paramOnClickListener)
    {
      super();
      this.itemView.setOnClickListener(paramOnClickListener);
    }
  }
  
  private static class h
    extends c.j
  {
    public h(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static class i
    extends c.j
  {
    public i(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static abstract class j
    extends RecyclerView.ViewHolder
  {
    public j(View paramView)
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.c
 * JD-Core Version:    0.7.0.1
 */