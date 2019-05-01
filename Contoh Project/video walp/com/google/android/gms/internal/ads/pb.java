package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzbv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@cm
@TargetApi(14)
public final class pb
  extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, pa
{
  private static final float[] a = { -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F };
  private volatile boolean A;
  private volatile boolean B;
  private final oy b;
  private final float[] c;
  private final float[] d;
  private final float[] e;
  private final float[] f;
  private final float[] g;
  private final float[] h;
  private final float[] i;
  private float j;
  private float k;
  private float l;
  private int m;
  private int n;
  private SurfaceTexture o;
  private SurfaceTexture p;
  private int q;
  private int r;
  private int s;
  private FloatBuffer t = ByteBuffer.allocateDirect(a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
  private final CountDownLatch u;
  private final Object v;
  private EGL10 w;
  private EGLDisplay x;
  private EGLContext y;
  private EGLSurface z;
  
  public pb(Context paramContext)
  {
    super("SphericalVideoProcessor");
    this.t.put(a).position(0);
    this.c = new float[9];
    this.d = new float[9];
    this.e = new float[9];
    this.f = new float[9];
    this.g = new float[9];
    this.h = new float[9];
    this.i = new float[9];
    this.j = (0.0F / 0.0F);
    this.b = new oy(paramContext);
    this.b.a(this);
    this.u = new CountDownLatch(1);
    this.v = new Object();
  }
  
  private static int a(int paramInt, String paramString)
  {
    int i1 = GLES20.glCreateShader(paramInt);
    a("createShader");
    if (i1 != 0)
    {
      GLES20.glShaderSource(i1, paramString);
      a("shaderSource");
      GLES20.glCompileShader(i1);
      a("compileShader");
      int[] arrayOfInt = new int[1];
      GLES20.glGetShaderiv(i1, 35713, arrayOfInt, 0);
      a("getShaderiv");
      if (arrayOfInt[0] == 0)
      {
        Log.e("SphericalVideoRenderer", 37 + "Could not compile shader " + paramInt + ":");
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i1));
        GLES20.glDeleteShader(i1);
        a("deleteShader");
        return 0;
      }
    }
    return i1;
  }
  
  private static void a(String paramString)
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0) {
      Log.e("SphericalVideoRenderer", 21 + String.valueOf(paramString).length() + paramString + ": glError " + i1);
    }
  }
  
  private static void a(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[8] = ((float)Math.cos(paramFloat));
  }
  
  private static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[1] * paramArrayOfFloat3[3] + paramArrayOfFloat2[2] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[1] + paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[2] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[2] + paramArrayOfFloat2[1] * paramArrayOfFloat3[5] + paramArrayOfFloat2[2] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[3] + paramArrayOfFloat2[5] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[1] + paramArrayOfFloat2[4] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[2] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[5] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[3] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[7] * paramArrayOfFloat3[4] + paramArrayOfFloat2[8] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[2] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[8]);
  }
  
  private static void b(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[1] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }
  
  private final boolean d()
  {
    EGLSurface localEGLSurface1 = this.z;
    boolean bool = false;
    if (localEGLSurface1 != null)
    {
      EGLSurface localEGLSurface2 = this.z;
      EGLSurface localEGLSurface3 = EGL10.EGL_NO_SURFACE;
      bool = false;
      if (localEGLSurface2 != localEGLSurface3)
      {
        bool = false | this.w.eglMakeCurrent(this.x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | this.w.eglDestroySurface(this.x, this.z);
        this.z = null;
      }
    }
    if (this.y != null)
    {
      bool |= this.w.eglDestroyContext(this.x, this.y);
      this.y = null;
    }
    if (this.x != null)
    {
      bool |= this.w.eglTerminate(this.x);
      this.x = null;
    }
    return bool;
  }
  
  public final void a()
  {
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    float f1;
    if (this.n > this.m) {
      f1 = 1.745329F * paramFloat1 / this.n;
    }
    for (float f2 = 1.745329F * paramFloat2 / this.n;; f2 = 1.745329F * paramFloat2 / this.m)
    {
      this.k -= f1;
      this.l -= f2;
      if (this.l < -1.570796F) {
        this.l = -1.570796F;
      }
      if (this.l > 1.570796F) {
        this.l = 1.570796F;
      }
      return;
      f1 = 1.745329F * paramFloat1 / this.m;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    synchronized (this.v)
    {
      this.n = paramInt1;
      this.m = paramInt2;
      this.A = true;
      this.v.notifyAll();
      return;
    }
  }
  
  public final void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.n = paramInt1;
    this.m = paramInt2;
    this.p = paramSurfaceTexture;
  }
  
  public final void b()
  {
    synchronized (this.v)
    {
      this.B = true;
      this.p = null;
      this.v.notifyAll();
      return;
    }
  }
  
  public final SurfaceTexture c()
  {
    if (this.p == null) {
      return null;
    }
    try
    {
      this.u.await();
      label16:
      return this.o;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label16;
    }
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    this.s = (1 + this.s);
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }
  
  public final void run()
  {
    int i1 = 1;
    if (this.p == null)
    {
      je.c("SphericalVideoProcessor started with no output texture.");
      this.u.countDown();
      return;
    }
    this.w = ((EGL10)EGLContext.getEGL());
    this.x = this.w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    int i2;
    String str1;
    label101:
    int i3;
    int i5;
    label119:
    int i7;
    label371:
    String str3;
    if (this.x == EGL10.EGL_NO_DISPLAY)
    {
      i2 = 0;
      arq localarq1 = asa.bj;
      if (((String)aos.f().a(localarq1)).equals(localarq1.b())) {
        break label761;
      }
      str1 = (String)aos.f().a(localarq1);
      i3 = a(35633, str1);
      if (i3 != 0) {
        break label769;
      }
      i5 = 0;
      this.q = i5;
      GLES20.glUseProgram(this.q);
      a("useProgram");
      int i6 = GLES20.glGetAttribLocation(this.q, "aPosition");
      GLES20.glVertexAttribPointer(i6, 3, 5126, false, 12, this.t);
      a("vertexAttribPointer");
      GLES20.glEnableVertexAttribArray(i6);
      a("enableVertexAttribArray");
      int[] arrayOfInt2 = new int[i1];
      GLES20.glGenTextures(i1, arrayOfInt2, 0);
      a("genTextures");
      i7 = arrayOfInt2[0];
      GLES20.glBindTexture(36197, i7);
      a("bindTextures");
      GLES20.glTexParameteri(36197, 10240, 9729);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10241, 9729);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10242, 33071);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10243, 33071);
      a("texParameteri");
      this.r = GLES20.glGetUniformLocation(this.q, "uVMat");
      float[] arrayOfFloat1 = { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
      GLES20.glUniformMatrix3fv(this.r, i1, false, arrayOfFloat1, 0);
      if (this.q == 0) {
        break label972;
      }
      if ((i2 != 0) && (i1 != 0)) {
        break label992;
      }
      str3 = String.valueOf(GLUtils.getEGLErrorString(this.w.eglGetError()));
      if (str3.length() == 0) {
        break label977;
      }
    }
    label769:
    label838:
    label972:
    label977:
    for (String str4 = "EGL initialization failed: ".concat(str3);; str4 = new String("EGL initialization failed: "))
    {
      je.c(str4);
      zzbv.zzeo().a(new Throwable(str4), "SphericalVideoProcessor.run.1");
      d();
      this.u.countDown();
      return;
      int[] arrayOfInt1 = new int[2];
      if (!this.w.eglInitialize(this.x, arrayOfInt1))
      {
        i2 = 0;
        break;
      }
      int[] arrayOfInt4 = new int[i1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[i1];
      int[] arrayOfInt5 = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344 };
      if ((this.w.eglChooseConfig(this.x, arrayOfInt5, arrayOfEGLConfig, i1, arrayOfInt4)) && (arrayOfInt4[0] > 0)) {}
      for (EGLConfig localEGLConfig = arrayOfEGLConfig[0];; localEGLConfig = null)
      {
        if (localEGLConfig != null) {
          break label610;
        }
        i2 = 0;
        break;
      }
      label610:
      int[] arrayOfInt6 = { 12440, 2, 12344 };
      this.y = this.w.eglCreateContext(this.x, localEGLConfig, EGL10.EGL_NO_CONTEXT, arrayOfInt6);
      if ((this.y == null) || (this.y == EGL10.EGL_NO_CONTEXT))
      {
        i2 = 0;
        break;
      }
      this.z = this.w.eglCreateWindowSurface(this.x, localEGLConfig, this.p, null);
      if ((this.z == null) || (this.z == EGL10.EGL_NO_SURFACE))
      {
        i2 = 0;
        break;
      }
      if (!this.w.eglMakeCurrent(this.x, this.z, this.z, this.y))
      {
        i2 = 0;
        break;
      }
      i2 = i1;
      break;
      label761:
      str1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
      break label101;
      arq localarq2 = asa.bk;
      if (!((String)aos.f().a(localarq2)).equals(localarq2.b())) {}
      int i4;
      for (String str2 = (String)aos.f().a(localarq2);; str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}")
      {
        i4 = a(35632, str2);
        if (i4 != 0) {
          break label838;
        }
        i5 = 0;
        break;
      }
      i5 = GLES20.glCreateProgram();
      a("createProgram");
      if (i5 == 0) {
        break label119;
      }
      GLES20.glAttachShader(i5, i3);
      a("attachShader");
      GLES20.glAttachShader(i5, i4);
      a("attachShader");
      GLES20.glLinkProgram(i5);
      a("linkProgram");
      int[] arrayOfInt3 = new int[i1];
      GLES20.glGetProgramiv(i5, 35714, arrayOfInt3, 0);
      a("getProgramiv");
      if (arrayOfInt3[0] != i1)
      {
        Log.e("SphericalVideoRenderer", "Could not link program: ");
        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(i5));
        GLES20.glDeleteProgram(i5);
        a("deleteProgram");
        i5 = 0;
        break label119;
      }
      GLES20.glValidateProgram(i5);
      a("validateProgram");
      break label119;
      i1 = 0;
      break label371;
    }
    label992:
    this.o = new SurfaceTexture(i7);
    this.o.setOnFrameAvailableListener(this);
    this.u.countDown();
    this.b.a();
    try
    {
      this.A = true;
      if (!this.B) {
        while (this.s > 0)
        {
          this.o.updateTexImage();
          this.s = (-1 + this.s);
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      je.e("SphericalVideoProcessor halted unexpectedly.");
      return;
      if (this.b.a(this.c))
      {
        if (Float.isNaN(this.j))
        {
          float[] arrayOfFloat2 = this.c;
          float[] arrayOfFloat3 = { 0.0F, 1.0F, 0.0F };
          float[] arrayOfFloat4 = new float[3];
          arrayOfFloat4[0] = (arrayOfFloat2[0] * arrayOfFloat3[0] + arrayOfFloat2[1] * arrayOfFloat3[1] + arrayOfFloat2[2] * arrayOfFloat3[2]);
          arrayOfFloat4[1] = (arrayOfFloat2[3] * arrayOfFloat3[0] + arrayOfFloat2[4] * arrayOfFloat3[1] + arrayOfFloat2[5] * arrayOfFloat3[2]);
          arrayOfFloat4[2] = (arrayOfFloat2[6] * arrayOfFloat3[0] + arrayOfFloat2[7] * arrayOfFloat3[1] + arrayOfFloat2[8] * arrayOfFloat3[2]);
          this.j = (-((float)Math.atan2(arrayOfFloat4[1], arrayOfFloat4[0]) - 1.570796F));
        }
        b(this.h, this.j + this.k);
      }
      for (;;)
      {
        for (;;)
        {
          a(this.d, 1.570796F);
          a(this.e, this.h, this.d);
          a(this.f, this.c, this.e);
          a(this.g, this.l);
          a(this.i, this.g, this.f);
          GLES20.glUniformMatrix3fv(this.r, 1, false, this.i, 0);
          GLES20.glDrawArrays(5, 0, 4);
          a("drawArrays");
          GLES20.glFinish();
          this.w.eglSwapBuffers(this.x, this.z);
          if (this.A)
          {
            GLES20.glViewport(0, 0, this.n, this.m);
            a("viewport");
            i8 = GLES20.glGetUniformLocation(this.q, "uFOVx");
            i9 = GLES20.glGetUniformLocation(this.q, "uFOVy");
            if (this.n <= this.m) {
              break label1627;
            }
            GLES20.glUniform1f(i8, 0.8726646F);
            GLES20.glUniform1f(i9, 0.8726646F * this.m / this.n);
            this.A = false;
          }
          try
          {
            synchronized (this.v)
            {
              if ((!this.B) && (!this.A) && (this.s == 0)) {
                this.v.wait();
              }
            }
          }
          catch (InterruptedException localInterruptedException) {}
        }
        a(this.c, -1.570796F);
        b(this.h, this.k);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int i8;
        int i9;
        je.b("SphericalVideoProcessor died.", localThrowable);
        zzbv.zzeo().a(localThrowable, "SphericalVideoProcessor.run.2");
        return;
        label1627:
        GLES20.glUniform1f(i8, 0.8726646F * this.n / this.m);
        GLES20.glUniform1f(i9, 0.8726646F);
      }
    }
    finally
    {
      this.b.b();
      this.o.setOnFrameAvailableListener(null);
      this.o = null;
      d();
    }
    this.b.b();
    this.o.setOnFrameAvailableListener(null);
    this.o = null;
    d();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pb
 * JD-Core Version:    0.7.0.1
 */