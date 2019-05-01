package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ah
{
  public final Map<String, Object> a = new HashMap();
  public View b;
  final ArrayList<Transition> c = new ArrayList();
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ah)) && (this.b == ((ah)paramObject).b) && (this.a.equals(((ah)paramObject).a));
  }
  
  public int hashCode()
  {
    return 31 * this.b.hashCode() + this.a.hashCode();
  }
  
  public String toString()
  {
    String str1 = "TransitionValues@" + Integer.toHexString(hashCode()) + ":\n";
    String str2 = str1 + "    view = " + this.b + "\n";
    String str3 = str2 + "    values:";
    Iterator localIterator = this.a.keySet().iterator();
    String str5;
    for (String str4 = str3; localIterator.hasNext(); str4 = str4 + "    " + str5 + ": " + this.a.get(str5) + "\n") {
      str5 = (String)localIterator.next();
    }
    return str4;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ah
 * JD-Core Version:    0.7.0.1
 */