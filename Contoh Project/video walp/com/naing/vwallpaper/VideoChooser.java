package com.naing.vwallpaper;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore.Video.Media;
import android.support.v4.view.g;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.a.a.g.e;
import com.a.a.i;
import com.a.a.j;
import com.naing.c.a;
import com.naing.c.b;
import com.naing.model.VideoModel;
import java.util.ArrayList;
import java.util.List;

public class VideoChooser
  extends BaseActivity
  implements SearchView.OnQueryTextListener, AdapterView.OnItemClickListener
{
  private TextView a;
  private ListView b;
  private SearchView c;
  private a d;
  private List<VideoModel> e;
  private ContentResolver f;
  private Typeface g;
  private a h;
  private Handler i = new Handler();
  private Runnable j = new Runnable()
  {
    public void run()
    {
      VideoChooser.this.a(VideoChooser.a(VideoChooser.this), VideoChooser.b(VideoChooser.this));
    }
  };
  private String k = "";
  private String l = "datetaken DESC";
  
  private void b(String paramString)
  {
    this.l = paramString;
    g();
  }
  
  private void c(String paramString)
  {
    Intent localIntent = new Intent(this, AdjusterActivity.class);
    localIntent.putExtra("PATH", paramString);
    startActivityForResult(localIntent, b.b);
  }
  
  /* Error */
  public void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 97	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: istore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: iload 5
    //   11: ifne +67 -> 78
    //   14: new 99	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 100	java/lang/StringBuilder:<init>	()V
    //   21: ldc 102
    //   23: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_1
    //   27: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: ldc 108
    //   32: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 110
    //   37: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc 112
    //   42: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: aload_1
    //   46: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: ldc 108
    //   51: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 114
    //   56: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: ldc 112
    //   61: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: aload_1
    //   65: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 116
    //   70: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 6
    //   78: aload_0
    //   79: getfield 122	com/naing/vwallpaper/VideoChooser:f	Landroid/content/ContentResolver;
    //   82: getstatic 128	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   85: iconst_4
    //   86: anewarray 130	java/lang/String
    //   89: dup
    //   90: iconst_0
    //   91: ldc 132
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: ldc 134
    //   98: aastore
    //   99: dup
    //   100: iconst_2
    //   101: ldc 136
    //   103: aastore
    //   104: dup
    //   105: iconst_3
    //   106: ldc 138
    //   108: aastore
    //   109: aload 6
    //   111: aconst_null
    //   112: aload_2
    //   113: invokevirtual 144	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   116: astore 7
    //   118: aload_0
    //   119: getfield 146	com/naing/vwallpaper/VideoChooser:a	Landroid/widget/TextView;
    //   122: bipush 8
    //   124: invokevirtual 152	android/widget/TextView:setVisibility	(I)V
    //   127: aload_0
    //   128: getfield 63	com/naing/vwallpaper/VideoChooser:e	Ljava/util/List;
    //   131: invokeinterface 157 1 0
    //   136: aload 7
    //   138: invokeinterface 163 1 0
    //   143: ifeq +131 -> 274
    //   146: aload 7
    //   148: aload 7
    //   150: ldc 132
    //   152: invokeinterface 167 2 0
    //   157: invokeinterface 171 2 0
    //   162: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: astore 8
    //   167: aload 7
    //   169: aload 7
    //   171: ldc 136
    //   173: invokeinterface 167 2 0
    //   178: invokeinterface 181 2 0
    //   183: astore 9
    //   185: aload 7
    //   187: aload 7
    //   189: ldc 134
    //   191: invokeinterface 167 2 0
    //   196: invokeinterface 181 2 0
    //   201: astore 10
    //   203: aload 7
    //   205: aload 7
    //   207: ldc 138
    //   209: invokeinterface 167 2 0
    //   214: invokeinterface 171 2 0
    //   219: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: astore 11
    //   224: aload_0
    //   225: getfield 63	com/naing/vwallpaper/VideoChooser:e	Ljava/util/List;
    //   228: new 183	com/naing/model/VideoModel
    //   231: dup
    //   232: aload 8
    //   234: aload 9
    //   236: aload 10
    //   238: aload 11
    //   240: invokespecial 186	com/naing/model/VideoModel:<init>	(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   243: invokeinterface 190 2 0
    //   248: pop
    //   249: aload 7
    //   251: invokeinterface 163 1 0
    //   256: ifne -110 -> 146
    //   259: aload 7
    //   261: invokeinterface 193 1 0
    //   266: aload_0
    //   267: getfield 195	com/naing/vwallpaper/VideoChooser:d	Lcom/naing/vwallpaper/VideoChooser$a;
    //   270: invokevirtual 200	com/naing/vwallpaper/VideoChooser$a:notifyDataSetChanged	()V
    //   273: return
    //   274: aload_0
    //   275: getfield 146	com/naing/vwallpaper/VideoChooser:a	Landroid/widget/TextView;
    //   278: iconst_0
    //   279: invokevirtual 152	android/widget/TextView:setVisibility	(I)V
    //   282: goto -23 -> 259
    //   285: astore 4
    //   287: aload_0
    //   288: aload_0
    //   289: invokevirtual 204	com/naing/vwallpaper/VideoChooser:getResources	()Landroid/content/res/Resources;
    //   292: ldc 205
    //   294: invokevirtual 208	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   297: invokestatic 211	com/naing/c/b:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   300: aload_0
    //   301: getfield 195	com/naing/vwallpaper/VideoChooser:d	Lcom/naing/vwallpaper/VideoChooser$a;
    //   304: invokevirtual 200	com/naing/vwallpaper/VideoChooser$a:notifyDataSetChanged	()V
    //   307: return
    //   308: astore_3
    //   309: aload_0
    //   310: getfield 195	com/naing/vwallpaper/VideoChooser:d	Lcom/naing/vwallpaper/VideoChooser$a;
    //   313: invokevirtual 200	com/naing/vwallpaper/VideoChooser$a:notifyDataSetChanged	()V
    //   316: aload_3
    //   317: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	VideoChooser
    //   0	318	1	paramString1	String
    //   0	318	2	paramString2	String
    //   308	9	3	localObject	Object
    //   285	1	4	localException	Exception
    //   4	6	5	bool	boolean
    //   7	103	6	str1	String
    //   116	144	7	localCursor	android.database.Cursor
    //   165	68	8	localInteger1	java.lang.Integer
    //   183	52	9	str2	String
    //   201	36	10	str3	String
    //   222	17	11	localInteger2	java.lang.Integer
    // Exception table:
    //   from	to	target	type
    //   0	6	285	java/lang/Exception
    //   14	78	285	java/lang/Exception
    //   78	146	285	java/lang/Exception
    //   146	259	285	java/lang/Exception
    //   259	266	285	java/lang/Exception
    //   274	282	285	java/lang/Exception
    //   0	6	308	finally
    //   14	78	308	finally
    //   78	146	308	finally
    //   146	259	308	finally
    //   259	266	308	finally
    //   274	282	308	finally
    //   287	300	308	finally
  }
  
  void g()
  {
    if (!com.naing.c.c.a(this))
    {
      com.naing.c.c.a(this, 1001, getString(2131558467));
      return;
    }
    this.i.post(this.j);
  }
  
  void h()
  {
    if (!com.naing.c.c.a(this))
    {
      com.naing.c.c.a(this, 1001, getString(2131558467));
      return;
    }
    this.i.removeCallbacks(this.j);
    this.i.postDelayed(this.j, 300L);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 102) && (paramInt2 == -1) && (paramIntent != null)) {
      try
      {
        String str = b.a(this, paramIntent.getData());
        if (str != null)
        {
          c(str);
          return;
        }
        b.a(this, getResources().getString(2131558453));
        return;
      }
      catch (Exception localException)
      {
        b.a(this, getResources().getString(2131558453));
        return;
      }
    }
    if ((paramInt1 == b.b) && (paramInt2 == -1))
    {
      setResult(-1);
      finish();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131361821);
    a(true, getString(2131558477));
    this.f = getContentResolver();
    this.e = new ArrayList();
    this.g = b.e(this);
    this.b = ((ListView)findViewById(2131230863));
    this.a = ((TextView)findViewById(2131230951));
    this.a.setTypeface(this.g);
    this.a.setText(getResources().getString(2131558454));
    this.b.setFastScrollEnabled(true);
    this.d = new a(this);
    this.b.setAdapter(this.d);
    this.b.setOnItemClickListener(this);
    this.h = new a();
    g();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131427329, paramMenu);
    this.c = ((SearchView)g.a(paramMenu.findItem(2131230747)));
    this.c.setQueryHint(getString(2131558431));
    this.c.setOnQueryTextListener(this);
    return true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c(this.d.a(paramInt).b());
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    case 16908332: 
      finish();
      return true;
    case 2131230740: 
      try
      {
        Intent localIntent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        localIntent.setType("video/*");
        localIntent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        startActivityForResult(Intent.createChooser(localIntent, getString(2131558477)), 102);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        b.a(this, getResources().getString(2131558448));
        return true;
      }
    case 2131230750: 
      b("album ASC");
      return true;
    case 2131230751: 
      b("artist ASC");
      return true;
    case 2131230752: 
      b("datetaken DESC");
      return true;
    case 2131230753: 
      b("duration ASC");
      return true;
    }
    b("title ASC");
    return true;
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    if ((!TextUtils.isEmpty(this.k)) || (!TextUtils.isEmpty(paramString)))
    {
      this.k = paramString;
      h();
    }
    return true;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return false;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if ((1001 == paramInt) && (com.naing.c.c.a(paramArrayOfInt))) {
      g();
    }
    while ((paramInt != 1001) || (!com.naing.c.c.a(paramArrayOfInt))) {
      return;
    }
    h();
  }
  
  class a
    extends BaseAdapter
  {
    private Activity b;
    
    public a(Activity paramActivity)
    {
      this.b = paramActivity;
    }
    
    public VideoModel a(int paramInt)
    {
      return (VideoModel)VideoChooser.c(VideoChooser.this).get(paramInt);
    }
    
    public int getCount()
    {
      return VideoChooser.c(VideoChooser.this).size();
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      VideoChooser.b localb2;
      if (paramView == null)
      {
        paramView = LayoutInflater.from(this.b).inflate(2131361844, paramViewGroup, false);
        localb2 = new VideoChooser.b();
        localb2.a = ((AppCompatTextView)paramView.findViewById(2131230948));
        localb2.a.setTypeface(VideoChooser.d(VideoChooser.this));
        localb2.b = ((AppCompatTextView)paramView.findViewById(2131230947));
        localb2.b.setTypeface(VideoChooser.d(VideoChooser.this));
        localb2.c = ((AppCompatImageView)paramView.findViewById(2131230837));
        paramView.setTag(localb2);
      }
      for (VideoChooser.b localb1 = localb2;; localb1 = (VideoChooser.b)paramView.getTag())
      {
        VideoModel localVideoModel = a(paramInt);
        localb1.a.setText(localVideoModel.a());
        localb1.b.setText(b.a(localVideoModel.c()));
        com.a.a.c.a(this.b).a(localVideoModel.b()).a(new e().a(2131165317).e()).a(localb1.c);
        return paramView;
      }
    }
  }
  
  static class b
  {
    AppCompatTextView a;
    AppCompatTextView b;
    AppCompatImageView c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.VideoChooser
 * JD-Core Version:    0.7.0.1
 */