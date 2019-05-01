package com.a.a.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.util.Log;
import com.a.a.c;
import com.a.a.j;
import java.util.HashSet;
import java.util.Set;

public class k
  extends Fragment
{
  private final a a;
  private final m b = new a();
  private final Set<k> c = new HashSet();
  private j d;
  private k e;
  private Fragment f;
  
  public k()
  {
    this(new a());
  }
  
  @SuppressLint({"ValidFragment"})
  k(a parama)
  {
    this.a = parama;
  }
  
  private void a(Activity paramActivity)
  {
    e();
    this.e = c.a(paramActivity).g().a(paramActivity.getFragmentManager(), null);
    if (!equals(this.e)) {
      this.e.a(this);
    }
  }
  
  private void a(k paramk)
  {
    this.c.add(paramk);
  }
  
  private void b(k paramk)
  {
    this.c.remove(paramk);
  }
  
  @TargetApi(17)
  private Fragment d()
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (Fragment localFragment = getParentFragment(); localFragment != null; localFragment = null) {
      return localFragment;
    }
    return this.f;
  }
  
  private void e()
  {
    if (this.e != null)
    {
      this.e.b(this);
      this.e = null;
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
    this.d = paramj;
  }
  
  public j b()
  {
    return this.d;
  }
  
  public m c()
  {
    return this.b;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      a(paramActivity);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (!Log.isLoggable("RMFragment", 5)) {}
      Log.w("RMFragment", "Unable to register fragment with root", localIllegalStateException);
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
      return super.toString() + "{fragment=" + k.this + "}";
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.k
 * JD-Core Version:    0.7.0.1
 */