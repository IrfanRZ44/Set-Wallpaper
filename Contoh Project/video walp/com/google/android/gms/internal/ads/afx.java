package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class afx
{
  static CountDownLatch a = new CountDownLatch(1);
  private static boolean b = false;
  private static MessageDigest c = null;
  private static final Object d = new Object();
  private static final Object e = new Object();
  
  private static zo a(long paramLong)
  {
    zo localzo = new zo();
    localzo.k = Long.valueOf(4096L);
    return localzo;
  }
  
  static String a(zo paramzo, String paramString)
  {
    byte[] arrayOfByte1 = afc.a(paramzo);
    arq localarq = asa.bL;
    byte[] arrayOfByte4;
    byte[] arrayOfByte2;
    if (!((Boolean)aos.f().a(localarq)).booleanValue())
    {
      if (aht.a == null) {
        throw new GeneralSecurityException();
      }
      if (paramString != null)
      {
        arrayOfByte4 = paramString.getBytes();
        byte[] arrayOfByte5 = aht.a.a(arrayOfByte1, arrayOfByte4);
        aft localaft2 = new aft();
        localaft2.a = new byte[][] { arrayOfByte5 };
        localaft2.c = Integer.valueOf(2);
        arrayOfByte2 = afc.a(localaft2);
      }
    }
    for (;;)
    {
      return afv.a(arrayOfByte2, true);
      arrayOfByte4 = new byte[0];
      break;
      Vector localVector = a(arrayOfByte1, 255);
      if ((localVector == null) || (localVector.size() == 0))
      {
        arrayOfByte2 = a(afc.a(a(4096L)), paramString, true);
      }
      else
      {
        aft localaft1 = new aft();
        localaft1.a = new byte[localVector.size()][];
        Iterator localIterator = localVector.iterator();
        int j;
        for (int i = 0; localIterator.hasNext(); i = j)
        {
          byte[] arrayOfByte3 = a((byte[])localIterator.next(), paramString, false);
          byte[][] arrayOfByte = localaft1.a;
          j = i + 1;
          arrayOfByte[i] = arrayOfByte3;
        }
        localaft1.b = a(arrayOfByte1);
        arrayOfByte2 = afc.a(localaft1);
      }
    }
  }
  
  private static Vector<byte[]> a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return null;
    }
    int i = (-1 + (255 + paramArrayOfByte.length)) / 255;
    Vector localVector = new Vector();
    int j = 0;
    for (;;)
    {
      int k;
      if (j < i) {
        k = j * 255;
      }
      try
      {
        if (paramArrayOfByte.length - k > 255) {}
        for (int m = k + 255;; m = paramArrayOfByte.length)
        {
          localVector.add(Arrays.copyOfRange(paramArrayOfByte, k, m));
          j++;
          break;
        }
        return localVector;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
    }
    return null;
  }
  
  static void a()
  {
    synchronized (e)
    {
      if (!b)
      {
        b = true;
        new Thread(new afz(null)).start();
      }
      return;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest;
    synchronized (d)
    {
      localMessageDigest = b();
      if (localMessageDigest == null) {
        throw new NoSuchAlgorithmException("Cannot compute hash");
      }
    }
    localMessageDigest.reset();
    localMessageDigest.update(paramArrayOfByte);
    byte[] arrayOfByte = c.digest();
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    int i;
    byte[] arrayOfByte4;
    if (paramBoolean)
    {
      i = 239;
      if (paramArrayOfByte.length > i) {
        paramArrayOfByte = afc.a(a(4096L));
      }
      if (paramArrayOfByte.length >= i) {
        break label169;
      }
      arrayOfByte4 = new byte[i - paramArrayOfByte.length];
      new SecureRandom().nextBytes(arrayOfByte4);
    }
    byte[] arrayOfByte2;
    label169:
    for (byte[] arrayOfByte1 = ByteBuffer.allocate(i + 1).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).put(arrayOfByte4).array();; arrayOfByte1 = ByteBuffer.allocate(i + 1).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).array())
    {
      if (paramBoolean)
      {
        byte[] arrayOfByte3 = a(arrayOfByte1);
        arrayOfByte1 = ByteBuffer.allocate(256).put(arrayOfByte3).put(arrayOfByte1).array();
      }
      arrayOfByte2 = new byte[256];
      agc[] arrayOfagc = new aga().cN;
      int j = arrayOfagc.length;
      for (int k = 0; k < j; k++) {
        arrayOfagc[k].a(arrayOfByte1, arrayOfByte2);
      }
      i = 255;
      break;
    }
    if ((paramString != null) && (paramString.length() > 0))
    {
      if (paramString.length() > 32) {
        paramString = paramString.substring(0, 32);
      }
      new zk(paramString.getBytes("UTF-8")).a(arrayOfByte2);
    }
    return arrayOfByte2;
  }
  
  private static MessageDigest b()
  {
    
    try
    {
      boolean bool2 = a.await(2L, TimeUnit.SECONDS);
      bool1 = bool2;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        boolean bool1 = false;
      }
    }
    if (!bool1) {}
    while (c == null) {
      return null;
    }
    return c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afx
 * JD-Core Version:    0.7.0.1
 */