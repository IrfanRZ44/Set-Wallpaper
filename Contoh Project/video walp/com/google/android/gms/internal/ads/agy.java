package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class agy
{
  private static Cipher b = null;
  private static final Object c = new Object();
  private static final Object d = new Object();
  private final SecureRandom a = null;
  
  public agy(SecureRandom paramSecureRandom) {}
  
  private static Cipher a()
  {
    synchronized (d)
    {
      if (b == null) {
        b = Cipher.getInstance("AES/CBC/PKCS5Padding");
      }
      Cipher localCipher = b;
      return localCipher;
    }
  }
  
  /* Error */
  public final String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: bipush 16
    //   4: if_icmpeq +12 -> 16
    //   7: new 47	com/google/android/gms/internal/ads/agz
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 50	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;)V
    //   15: athrow
    //   16: new 52	javax/crypto/spec/SecretKeySpec
    //   19: dup
    //   20: aload_1
    //   21: ldc 54
    //   23: invokespecial 57	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   26: astore_3
    //   27: getstatic 20	com/google/android/gms/internal/ads/agy:c	Ljava/lang/Object;
    //   30: astore 9
    //   32: aload 9
    //   34: monitorenter
    //   35: invokestatic 59	com/google/android/gms/internal/ads/agy:a	()Ljavax/crypto/Cipher;
    //   38: iconst_1
    //   39: aload_3
    //   40: aconst_null
    //   41: invokevirtual 63	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/SecureRandom;)V
    //   44: invokestatic 59	com/google/android/gms/internal/ads/agy:a	()Ljavax/crypto/Cipher;
    //   47: aload_2
    //   48: invokevirtual 67	javax/crypto/Cipher:doFinal	([B)[B
    //   51: astore 11
    //   53: invokestatic 59	com/google/android/gms/internal/ads/agy:a	()Ljavax/crypto/Cipher;
    //   56: invokevirtual 71	javax/crypto/Cipher:getIV	()[B
    //   59: astore 12
    //   61: aload 9
    //   63: monitorexit
    //   64: aload 11
    //   66: arraylength
    //   67: aload 12
    //   69: arraylength
    //   70: iadd
    //   71: istore 13
    //   73: iload 13
    //   75: invokestatic 77	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   78: astore 14
    //   80: aload 14
    //   82: aload 12
    //   84: invokevirtual 81	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   87: aload 11
    //   89: invokevirtual 81	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   92: pop
    //   93: aload 14
    //   95: invokevirtual 85	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   98: pop
    //   99: iload 13
    //   101: newarray byte
    //   103: astore 17
    //   105: aload 14
    //   107: aload 17
    //   109: invokevirtual 88	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   112: pop
    //   113: aload 17
    //   115: iconst_0
    //   116: invokestatic 93	com/google/android/gms/internal/ads/afv:a	([BZ)Ljava/lang/String;
    //   119: astore 19
    //   121: aload 19
    //   123: areturn
    //   124: astore 10
    //   126: aload 9
    //   128: monitorexit
    //   129: aload 10
    //   131: athrow
    //   132: astore 8
    //   134: new 47	com/google/android/gms/internal/ads/agz
    //   137: dup
    //   138: aload_0
    //   139: aload 8
    //   141: invokespecial 96	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;Ljava/lang/Throwable;)V
    //   144: athrow
    //   145: astore 7
    //   147: new 47	com/google/android/gms/internal/ads/agz
    //   150: dup
    //   151: aload_0
    //   152: aload 7
    //   154: invokespecial 96	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;Ljava/lang/Throwable;)V
    //   157: athrow
    //   158: astore 6
    //   160: new 47	com/google/android/gms/internal/ads/agz
    //   163: dup
    //   164: aload_0
    //   165: aload 6
    //   167: invokespecial 96	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;Ljava/lang/Throwable;)V
    //   170: athrow
    //   171: astore 5
    //   173: new 47	com/google/android/gms/internal/ads/agz
    //   176: dup
    //   177: aload_0
    //   178: aload 5
    //   180: invokespecial 96	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;Ljava/lang/Throwable;)V
    //   183: athrow
    //   184: astore 4
    //   186: new 47	com/google/android/gms/internal/ads/agz
    //   189: dup
    //   190: aload_0
    //   191: aload 4
    //   193: invokespecial 96	com/google/android/gms/internal/ads/agz:<init>	(Lcom/google/android/gms/internal/ads/agy;Ljava/lang/Throwable;)V
    //   196: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	agy
    //   0	197	1	paramArrayOfByte1	byte[]
    //   0	197	2	paramArrayOfByte2	byte[]
    //   26	14	3	localSecretKeySpec	SecretKeySpec
    //   184	8	4	localBadPaddingException	BadPaddingException
    //   171	8	5	localNoSuchPaddingException	NoSuchPaddingException
    //   158	8	6	localIllegalBlockSizeException	IllegalBlockSizeException
    //   145	8	7	localInvalidKeyException	InvalidKeyException
    //   132	8	8	localNoSuchAlgorithmException	NoSuchAlgorithmException
    //   124	6	10	localObject2	Object
    //   51	37	11	arrayOfByte1	byte[]
    //   59	24	12	arrayOfByte2	byte[]
    //   71	29	13	i	int
    //   78	28	14	localByteBuffer	ByteBuffer
    //   103	11	17	arrayOfByte3	byte[]
    //   119	3	19	str	String
    // Exception table:
    //   from	to	target	type
    //   35	64	124	finally
    //   126	129	124	finally
    //   16	35	132	java/security/NoSuchAlgorithmException
    //   64	121	132	java/security/NoSuchAlgorithmException
    //   129	132	132	java/security/NoSuchAlgorithmException
    //   16	35	145	java/security/InvalidKeyException
    //   64	121	145	java/security/InvalidKeyException
    //   129	132	145	java/security/InvalidKeyException
    //   16	35	158	javax/crypto/IllegalBlockSizeException
    //   64	121	158	javax/crypto/IllegalBlockSizeException
    //   129	132	158	javax/crypto/IllegalBlockSizeException
    //   16	35	171	javax/crypto/NoSuchPaddingException
    //   64	121	171	javax/crypto/NoSuchPaddingException
    //   129	132	171	javax/crypto/NoSuchPaddingException
    //   16	35	184	javax/crypto/BadPaddingException
    //   64	121	184	javax/crypto/BadPaddingException
    //   129	132	184	javax/crypto/BadPaddingException
  }
  
  public final byte[] a(String paramString)
  {
    int i = 0;
    byte[] arrayOfByte1;
    try
    {
      arrayOfByte1 = afv.a(paramString, false);
      if (arrayOfByte1.length != 32) {
        throw new agz(this);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new agz(this, localIllegalArgumentException);
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte1, 4, 16);
    byte[] arrayOfByte2 = new byte[16];
    localByteBuffer.get(arrayOfByte2);
    while (i < 16)
    {
      arrayOfByte2[i] = ((byte)(0x44 ^ arrayOfByte2[i]));
      i++;
    }
    return arrayOfByte2;
  }
  
  public final byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != 16) {
      throw new agz(this);
    }
    try
    {
      arrayOfByte1 = afv.a(paramString, false);
      if (arrayOfByte1.length <= 16) {
        throw new agz(this);
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte1;
      throw new agz(this, localNoSuchAlgorithmException);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);
      localByteBuffer.flip();
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[-16 + arrayOfByte1.length];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get(arrayOfByte3);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      synchronized (c)
      {
        a().init(2, localSecretKeySpec, new IvParameterSpec(arrayOfByte2));
        byte[] arrayOfByte4 = a().doFinal(arrayOfByte3);
        return arrayOfByte4;
      }
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new agz(this, localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new agz(this, localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new agz(this, localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      throw new agz(this, localBadPaddingException);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      throw new agz(this, localInvalidAlgorithmParameterException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new agz(this, localIllegalArgumentException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agy
 * JD-Core Version:    0.7.0.1
 */