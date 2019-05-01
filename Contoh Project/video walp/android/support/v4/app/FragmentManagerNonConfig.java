package android.support.v4.app;

import android.arch.lifecycle.v;
import java.util.List;

public class FragmentManagerNonConfig
{
  private final List<FragmentManagerNonConfig> mChildNonConfigs;
  private final List<Fragment> mFragments;
  private final List<v> mViewModelStores;
  
  FragmentManagerNonConfig(List<Fragment> paramList, List<FragmentManagerNonConfig> paramList1, List<v> paramList2)
  {
    this.mFragments = paramList;
    this.mChildNonConfigs = paramList1;
    this.mViewModelStores = paramList2;
  }
  
  List<FragmentManagerNonConfig> getChildNonConfigs()
  {
    return this.mChildNonConfigs;
  }
  
  List<Fragment> getFragments()
  {
    return this.mFragments;
  }
  
  List<v> getViewModelStores()
  {
    return this.mViewModelStores;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerNonConfig
 * JD-Core Version:    0.7.0.1
 */