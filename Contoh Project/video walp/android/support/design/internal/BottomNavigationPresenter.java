package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;

public class BottomNavigationPresenter
  implements o
{
  private h a;
  private BottomNavigationMenuView b;
  private boolean c = false;
  private int d;
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(Context paramContext, h paramh)
  {
    this.b.initialize(this.a);
    this.a = paramh;
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState)) {
      this.b.a(((SavedState)paramParcelable).a);
    }
  }
  
  public void a(BottomNavigationMenuView paramBottomNavigationMenuView)
  {
    this.b = paramBottomNavigationMenuView;
  }
  
  public void a(h paramh, boolean paramBoolean) {}
  
  public void a(o.a parama) {}
  
  public void a(boolean paramBoolean)
  {
    if (this.c) {
      return;
    }
    if (paramBoolean)
    {
      this.b.a();
      return;
    }
    this.b.b();
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
    return this.d;
  }
  
  public void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean b(h paramh, j paramj)
  {
    return false;
  }
  
  public Parcelable c()
  {
    SavedState localSavedState = new SavedState();
    localSavedState.a = this.b.getSelectedItemId();
    return localSavedState;
  }
  
  static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public BottomNavigationPresenter.SavedState a(Parcel paramAnonymousParcel)
      {
        return new BottomNavigationPresenter.SavedState(paramAnonymousParcel);
      }
      
      public BottomNavigationPresenter.SavedState[] a(int paramAnonymousInt)
      {
        return new BottomNavigationPresenter.SavedState[paramAnonymousInt];
      }
    };
    int a;
    
    SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationPresenter
 * JD-Core Version:    0.7.0.1
 */