package com.a.a.c.a;

import android.content.res.AssetManager;
import java.io.InputStream;

public class m
  extends b<InputStream>
{
  public m(AssetManager paramAssetManager, String paramString)
  {
    super(paramAssetManager, paramString);
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  protected void a(InputStream paramInputStream)
  {
    paramInputStream.close();
  }
  
  protected InputStream b(AssetManager paramAssetManager, String paramString)
  {
    return paramAssetManager.open(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.m
 * JD-Core Version:    0.7.0.1
 */