package com.a.a.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.a.a.c;
import com.a.a.j;
import java.util.HashSet;
import java.util.Set;

public class o
  extends Fragment
{
  private final a a;
  private final m b = new a();
  private final Set<o> c = new HashSet();
  private o d;
  private j e;
  private Fragment f;
  
  public o()
  {
    this(new a());
  }
  
  @SuppressLint({"ValidFragment"})
  public o(a parama)
  {
    this.a = parama;
  }
  
  private void a(FragmentActivity paramFragmentActivity)
  {
    e();
    this.d = c.a(paramFragmentActivity).g().a(paramFragmentActivity.getSupportFragmentManager(), null);
    if (!equals(this.d)) {
      this.d.a(this);
    }
  }
  
  private void a(o paramo)
  {
    this.c.add(paramo);
  }
  
  private void b(o paramo)
  {
    this.c.remove(paramo);
  }
  
  private Fragment d()
  {
    Fragment localFragment = getParentFragment();
    if (localFragment != null) {
      return localFragment;
    }
    return this.f;
  }
  
  private void e()
  {
    if (this.d != null)
    {
      this.d.b(this);
      this.d = null;
    }
  }
  
  a a()
  {
    return this.a;
  }
  
  void a(Fragment paramFragment)
  {
    this.f = paramFragment;
    if ((paramFragment != null) && (paramFragment.getActivity() != null)) {
      a(paramFragment.getActivity());
    }
  }
  
  public void a(j paramj)
  {
    this.e = paramj;
  }
  
  public j b()
  {
    return this.e;
  }
  
  public m c()
  {
    return this.b;
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    try
    {
      a(getActivity());
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (!Log.isLoggable("SupportRMFragment", 5)) {}
      Log.w("SupportRMFragment", "Unable to register fragment with root", localIllegalStateException);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.a.c();
    e();
  }
  
  public void onDetach()
  {
    super.onDetach();
    this.f = null;
    e();
  }
  
  public void onStart()
  {
    super.onStart();
    this.a.a();
  }
  
  public void onStop()
  {
    super.onStop();
    this.a.b();
  }
  
  public String toString()
  {
    return super.toString() + "{parent=" + d() + "}";
  }
  
  private class a
    implements m
  {
    a() {}
    
    public String toString()
    {
      return super.toString() + "{fragment=" + o.this + "}";
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.o
 * JD-Core Version:    0.7.0.1
 */