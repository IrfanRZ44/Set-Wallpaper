package com.ccpcreations.android.VLW;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.service.wallpaper.WallpaperService;
import android.service.wallpaper.WallpaperService.Engine;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.File;
import java.io.FileFilter;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class VideoLiveWallpaper
  extends WallpaperService
{
  public static boolean readPreferences = true;
  
  public WallpaperService.Engine onCreateEngine()
  {
    return new VLWEngine();
  }
  
  class VLWEngine
    extends WallpaperService.Engine
  {
    Object bufferLockingObject = new Object();
    ByteBuffer byteBuffer;
    long curDTS = -1L;
    double debugCurrentFPS = -1.0D;
    DecimalFormat debugDecimalFormat = new DecimalFormat("#.###");
    boolean debugOn = false;
    Paint debugPaint = new Paint();
    Path debugPath = new Path();
    boolean delayedRunnableMode = false;
    boolean doNotSkip = false;
    Bitmap drawingBitmap = null;
    Matrix drawingMatrix;
    String fileName = null;
    int fileNo = -1;
    String fileToOpen = null;
    float finalXOffset = 0.5F;
    long fpsStart = SystemClock.uptimeMillis();
    int frameCount = 0;
    int h = -1;
    boolean keepCentered = false;
    int lastFPS = 0;
    private final Runnable mDrawFrame = new Runnable()
    {
      public void run()
      {
        if ((VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode) && (!VideoLiveWallpaper.VLWEngine.this.wantedDelayedRunnableMode))
        {
          VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode = false;
          if (!VideoLiveWallpaper.VLWEngine.this.wt.paused) {
            VideoLiveWallpaper.VLWEngine.this.wt.pause(false);
          }
          return;
        }
        if (VideoLiveWallpaper.VLWEngine.this.debugOn) {
          Log.v("Video Live Wallpaper", "Updating from delayed runnable...");
        }
        int i = VideoLiveWallpaper.VLWEngine.this.drawFrame();
        VideoLiveWallpaper.VLWEngine.WorkingThread localWorkingThread1 = VideoLiveWallpaper.VLWEngine.this.wt;
        localWorkingThread1.curTime += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
        double d = VideoLiveWallpaper.VLWEngine.this.wt.curTime - SystemClock.uptimeMillis();
        if (d < i * -5 * VideoLiveWallpaper.VLWEngine.this.videoFR)
        {
          VideoLiveWallpaper.VLWEngine.this.wt.curTime = (SystemClock.uptimeMillis() + VideoLiveWallpaper.VLWEngine.this.videoFR);
          d = 0.0D;
        }
        for (;;)
        {
          if (d < 0.0D) {
            d = 0.0D;
          }
          if ((!VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode) || (VideoLiveWallpaper.VLWEngine.this.wt.paused)) {
            break;
          }
          VideoLiveWallpaper.VLWEngine.this.mHandler.postDelayed(VideoLiveWallpaper.VLWEngine.this.mDrawFrame, (int)(0.5D * d));
          return;
          do
          {
            i = VideoLiveWallpaper.VLWEngine.this.skipFrame();
            VideoLiveWallpaper.VLWEngine.WorkingThread localWorkingThread2 = VideoLiveWallpaper.VLWEngine.this.wt;
            localWorkingThread2.curTime += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
            d += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
          } while (d < -i * VideoLiveWallpaper.VLWEngine.this.videoFR);
        }
      }
    };
    final Handler mHandler = new Handler();
    int newBufferCreated = 0;
    float r = 1.0F;
    boolean randomFile = true;
    boolean recursiveDir = true;
    int renderingMode = 0;
    Random rnd = new Random();
    int srcH = 100;
    int srcW = 100;
    int srcX = 0;
    int srcY = 0;
    float swipingLag = 5.0F;
    double videoFR;
    int videoH;
    double videoR;
    int videoW;
    boolean visible;
    int w = -1;
    boolean wantedDelayedRunnableMode = false;
    WorkingThread wt;
    float xOffset = 0.5F;
    
    public VLWEngine()
    {
      super();
      this.debugPath.setLastPoint(0.0F, this.h >> 1);
      this.debugPath.lineTo(this.w, this.h >> 1);
      this.debugPaint.setColor(-1);
      this.debugPaint.setTextSize(20.0F);
      this.debugPaint.setTextAlign(Paint.Align.CENTER);
      tryToOpen();
      this.wt = new WorkingThread();
      this.wt.pause(true);
      this.wt.start();
      VideoLiveWallpaper.readPreferences = true;
    }
    
    private void createNewBuffer()
    {
      for (;;)
      {
        synchronized (this.bufferLockingObject)
        {
          if (this.videoW <= 0) {
            return;
          }
          this.debugPath = new Path();
          this.debugPath.setLastPoint(0.0F, this.h >> 1);
          this.debugPath.lineTo(this.w, this.h >> 1);
          if (this.w < 0)
          {
            if ((this.drawingBitmap == null) || (this.drawingBitmap.getWidth() != this.videoW) || (this.drawingBitmap.getHeight() != this.videoH))
            {
              if (this.drawingBitmap != null) {
                this.drawingBitmap.recycle();
              }
              this.drawingBitmap = Bitmap.createBitmap(this.videoW, this.videoH, Bitmap.Config.RGB_565);
              this.byteBuffer = ByteBuffer.allocateDirect(2 * (this.videoW * this.videoH));
            }
            this.srcW = this.videoW;
            this.srcH = this.videoH;
            this.srcY = 0;
            this.srcX = 0;
            this.drawingMatrix = new Matrix();
            if (this.renderingMode != 1) {
              break label488;
            }
            this.drawingMatrix.setRectToRect(new RectF(0.0F, 0.0F, this.srcW, this.srcH), new RectF(0.0F, 0.0F, this.w, this.h), Matrix.ScaleToFit.CENTER);
            this.newBufferCreated = (4 + this.newBufferCreated);
            return;
          }
        }
        if (this.renderingMode == 0) {
          if (this.r < this.videoR)
          {
            this.srcH = this.videoH;
            this.srcW = ((int)(this.videoH * this.r));
          }
        }
        for (;;)
        {
          fixViewingWindow();
          if ((this.drawingBitmap != null) && (this.drawingBitmap.getWidth() == this.srcW) && (this.drawingBitmap.getHeight() == this.srcH)) {
            break;
          }
          if (this.drawingBitmap != null) {
            this.drawingBitmap.recycle();
          }
          this.drawingBitmap = Bitmap.createBitmap(this.srcW, this.srcH, Bitmap.Config.RGB_565);
          this.byteBuffer = ByteBuffer.allocateDirect(2 * (this.srcW * this.srcH));
          break;
          if (this.r == this.videoR)
          {
            this.srcW = this.videoW;
            this.srcH = this.videoH;
          }
          else
          {
            this.srcW = this.videoW;
            this.srcH = ((int)(this.videoW / this.r));
            continue;
            this.srcW = this.videoW;
            this.srcH = this.videoH;
            this.srcY = 0;
            this.srcX = 0;
          }
        }
        label488:
        this.drawingMatrix.setRectToRect(new RectF(0.0F, 0.0F, this.srcW, this.srcH), new RectF(0.0F, 0.0F, this.w, this.h), Matrix.ScaleToFit.FILL);
      }
    }
    
    private void fixViewingWindow()
    {
      if (this.renderingMode == 0)
      {
        if (this.r < this.videoR)
        {
          this.srcY = 0;
          this.srcX = ((int)((this.videoW - this.srcW) * this.finalXOffset));
        }
      }
      else {
        return;
      }
      if (this.r == this.videoR)
      {
        this.srcY = 0;
        this.srcX = 0;
        return;
      }
      this.srcX = 0;
      this.srcY = ((this.videoH - this.srcH) / 2);
    }
    
    public int countFiles(int paramInt, File paramFile)
    {
      File[] arrayOfFile = paramFile.listFiles(new FileFilter()
      {
        public boolean accept(File paramAnonymousFile)
        {
          if (paramAnonymousFile.isDirectory()) {
            return true;
          }
          if (FilePicker.filter == null) {
            return true;
          }
          for (int i = 0;; i++)
          {
            if (i >= FilePicker.filter.length) {
              return false;
            }
            if (paramAnonymousFile.getName().toLowerCase().endsWith(FilePicker.filter[i])) {
              return true;
            }
          }
        }
      });
      if (arrayOfFile == null) {
        return paramInt;
      }
      int i = 0;
      if (i >= arrayOfFile.length) {
        return paramInt;
      }
      if (arrayOfFile[i].isFile()) {
        paramInt++;
      }
      for (;;)
      {
        i++;
        break;
        if ((this.recursiveDir) && (arrayOfFile[i].isDirectory())) {
          paramInt = countFiles(paramInt, arrayOfFile[i]);
        }
      }
    }
    
    /* Error */
    public int drawFrame()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 90	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:xOffset	F
      //   4: aload_0
      //   5: getfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   8: fsub
      //   9: fstore_1
      //   10: fload_1
      //   11: f2d
      //   12: ldc2_w 318
      //   15: dcmpl
      //   16: ifgt +12 -> 28
      //   19: fload_1
      //   20: f2d
      //   21: ldc2_w 320
      //   24: dcmpg
      //   25: ifge +292 -> 317
      //   28: aload_0
      //   29: aload_0
      //   30: getfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   33: fload_1
      //   34: aload_0
      //   35: getfield 140	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:swipingLag	F
      //   38: fdiv
      //   39: fadd
      //   40: putfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   43: aload_0
      //   44: invokespecial 293	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:fixViewingWindow	()V
      //   47: aload_0
      //   48: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   51: ifeq +43 -> 94
      //   54: ldc_w 323
      //   57: new 325	java/lang/StringBuilder
      //   60: dup
      //   61: ldc_w 327
      //   64: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   67: aload_0
      //   68: getfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   71: invokevirtual 332	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
      //   74: ldc_w 334
      //   77: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   80: aload_0
      //   81: getfield 90	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:xOffset	F
      //   84: invokevirtual 332	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
      //   87: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   90: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   93: pop
      //   94: aload_0
      //   95: getfield 349	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:videoFR	D
      //   98: dconst_0
      //   99: dcmpl
      //   100: ifne +291 -> 391
      //   103: iconst_0
      //   104: istore_2
      //   105: aload_0
      //   106: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   109: ifeq +97 -> 206
      //   112: aload_0
      //   113: iconst_1
      //   114: aload_0
      //   115: getfield 115	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:frameCount	I
      //   118: iadd
      //   119: putfield 115	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:frameCount	I
      //   122: invokestatic 107	android/os/SystemClock:uptimeMillis	()J
      //   125: aload_0
      //   126: getfield 109	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:fpsStart	J
      //   129: lsub
      //   130: ldc2_w 350
      //   133: lcmp
      //   134: iflt +72 -> 206
      //   137: aload_0
      //   138: ldc2_w 350
      //   141: aload_0
      //   142: getfield 109	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:fpsStart	J
      //   145: ladd
      //   146: putfield 109	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:fpsStart	J
      //   149: ldc_w 323
      //   152: new 325	java/lang/StringBuilder
      //   155: dup
      //   156: ldc_w 353
      //   159: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   162: aload_0
      //   163: getfield 115	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:frameCount	I
      //   166: invokevirtual 356	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   169: ldc_w 358
      //   172: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   175: ldc2_w 359
      //   178: aload_0
      //   179: getfield 349	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:videoFR	D
      //   182: ddiv
      //   183: invokevirtual 363	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
      //   186: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   189: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   192: pop
      //   193: aload_0
      //   194: aload_0
      //   195: getfield 115	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:frameCount	I
      //   198: putfield 117	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:lastFPS	I
      //   201: aload_0
      //   202: iconst_0
      //   203: putfield 115	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:frameCount	I
      //   206: aload_0
      //   207: invokevirtual 367	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:getSurfaceHolder	()Landroid/view/SurfaceHolder;
      //   210: astore_3
      //   211: aconst_null
      //   212: astore 4
      //   214: getstatic 372	com/ccpcreations/android/VLW/SimpleDecoder:opened	Z
      //   217: istore 6
      //   219: aconst_null
      //   220: astore 4
      //   222: iload 6
      //   224: ifeq +67 -> 291
      //   227: invokestatic 375	com/ccpcreations/android/VLW/SimpleDecoder:_getNextFrame	()I
      //   230: istore 7
      //   232: aconst_null
      //   233: astore 4
      //   235: iload 7
      //   237: ifne +167 -> 404
      //   240: aload_0
      //   241: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   244: ifeq +13 -> 257
      //   247: ldc_w 323
      //   250: ldc_w 377
      //   253: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   256: pop
      //   257: getstatic 372	com/ccpcreations/android/VLW/SimpleDecoder:opened	Z
      //   260: istore 8
      //   262: aconst_null
      //   263: astore 4
      //   265: iload 8
      //   267: ifeq +10 -> 277
      //   270: invokestatic 380	com/ccpcreations/android/VLW/SimpleDecoder:_close	()V
      //   273: iconst_0
      //   274: putstatic 372	com/ccpcreations/android/VLW/SimpleDecoder:opened	Z
      //   277: aload_0
      //   278: invokevirtual 213	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:tryToOpen	()V
      //   281: aload_0
      //   282: iconst_4
      //   283: aload_0
      //   284: getfield 129	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:newBufferCreated	I
      //   287: iadd
      //   288: putfield 129	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:newBufferCreated	I
      //   291: aload 4
      //   293: ifnull +11 -> 304
      //   296: aload_3
      //   297: aload 4
      //   299: invokeinterface 386 2 0
      //   304: aload_0
      //   305: getfield 153	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:mHandler	Landroid/os/Handler;
      //   308: aload_0
      //   309: getfield 160	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:mDrawFrame	Ljava/lang/Runnable;
      //   312: invokevirtual 390	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
      //   315: iload_2
      //   316: ireturn
      //   317: aload_0
      //   318: getfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   321: aload_0
      //   322: getfield 90	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:xOffset	F
      //   325: fcmpl
      //   326: ifeq -232 -> 94
      //   329: aload_0
      //   330: aload_0
      //   331: getfield 90	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:xOffset	F
      //   334: putfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   337: aload_0
      //   338: invokespecial 293	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:fixViewingWindow	()V
      //   341: aload_0
      //   342: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   345: ifeq -251 -> 94
      //   348: ldc_w 323
      //   351: new 325	java/lang/StringBuilder
      //   354: dup
      //   355: ldc_w 327
      //   358: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   361: aload_0
      //   362: getfield 92	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:finalXOffset	F
      //   365: invokevirtual 332	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
      //   368: ldc_w 334
      //   371: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   374: aload_0
      //   375: getfield 90	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:xOffset	F
      //   378: invokevirtual 332	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
      //   381: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   384: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   387: pop
      //   388: goto -294 -> 94
      //   391: ldc2_w 391
      //   394: aload_0
      //   395: getfield 349	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:videoFR	D
      //   398: ddiv
      //   399: d2i
      //   400: istore_2
      //   401: goto -296 -> 105
      //   404: invokestatic 395	com/ccpcreations/android/VLW/SimpleDecoder:_getDTS	()J
      //   407: lstore 10
      //   409: invokestatic 398	com/ccpcreations/android/VLW/SimpleDecoder:_getDuration	()I
      //   412: istore 12
      //   414: aload_0
      //   415: getfield 123	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:curDTS	J
      //   418: lconst_0
      //   419: lcmp
      //   420: istore 13
      //   422: aconst_null
      //   423: astore 4
      //   425: iload 13
      //   427: ifge +9 -> 436
      //   430: aload_0
      //   431: lload 10
      //   433: putfield 123	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:curDTS	J
      //   436: iload 12
      //   438: lload 10
      //   440: aload_0
      //   441: getfield 123	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:curDTS	J
      //   444: lsub
      //   445: l2i
      //   446: iadd
      //   447: istore_2
      //   448: aload_0
      //   449: lload 10
      //   451: iload 12
      //   453: i2l
      //   454: ladd
      //   455: putfield 123	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:curDTS	J
      //   458: aload_0
      //   459: getfield 113	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugCurrentFPS	D
      //   462: dconst_0
      //   463: dcmpg
      //   464: ifge +9 -> 473
      //   467: aload_0
      //   468: iload_2
      //   469: i2d
      //   470: putfield 113	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugCurrentFPS	D
      //   473: aload_0
      //   474: ldc2_w 399
      //   477: aload_0
      //   478: getfield 113	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugCurrentFPS	D
      //   481: dmul
      //   482: ldc2_w 401
      //   485: ddiv
      //   486: dconst_1
      //   487: iload_2
      //   488: i2d
      //   489: dmul
      //   490: ldc2_w 401
      //   493: ddiv
      //   494: dadd
      //   495: putfield 113	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugCurrentFPS	D
      //   498: aload_0
      //   499: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   502: ifeq +49 -> 551
      //   505: ldc_w 323
      //   508: new 325	java/lang/StringBuilder
      //   511: dup
      //   512: ldc_w 404
      //   515: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   518: lload 10
      //   520: invokevirtual 407	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   523: ldc_w 409
      //   526: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   529: iload 12
      //   531: invokevirtual 356	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   534: ldc_w 411
      //   537: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   540: iload_2
      //   541: invokevirtual 356	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   544: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   547: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   550: pop
      //   551: invokestatic 414	com/ccpcreations/android/VLW/SimpleDecoder:_convertFrameData	()I
      //   554: pop
      //   555: aload_0
      //   556: getfield 101	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:bufferLockingObject	Ljava/lang/Object;
      //   559: astore 15
      //   561: aload 15
      //   563: monitorenter
      //   564: aload_3
      //   565: invokeinterface 418 1 0
      //   570: astore 4
      //   572: aload 4
      //   574: ifnull +188 -> 762
      //   577: aload_0
      //   578: getfield 269	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:byteBuffer	Ljava/nio/ByteBuffer;
      //   581: aload_0
      //   582: getfield 81	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcX	I
      //   585: aload_0
      //   586: getfield 83	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcY	I
      //   589: aload_0
      //   590: getfield 81	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcX	I
      //   593: aload_0
      //   594: getfield 85	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcW	I
      //   597: iadd
      //   598: aload_0
      //   599: getfield 83	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcY	I
      //   602: aload_0
      //   603: getfield 87	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:srcH	I
      //   606: iadd
      //   607: invokestatic 422	com/ccpcreations/android/VLW/SimpleDecoder:_getDirectFrameData	(Ljava/lang/Object;IIII)V
      //   610: aload_0
      //   611: getfield 269	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:byteBuffer	Ljava/nio/ByteBuffer;
      //   614: iconst_0
      //   615: invokevirtual 426	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
      //   618: pop
      //   619: aload_0
      //   620: getfield 94	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:drawingBitmap	Landroid/graphics/Bitmap;
      //   623: aload_0
      //   624: getfield 269	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:byteBuffer	Ljava/nio/ByteBuffer;
      //   627: invokevirtual 430	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
      //   630: aload_0
      //   631: getfield 129	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:newBufferCreated	I
      //   634: ifle +21 -> 655
      //   637: aload 4
      //   639: ldc_w 431
      //   642: invokevirtual 436	android/graphics/Canvas:drawColor	(I)V
      //   645: aload_0
      //   646: aload_0
      //   647: getfield 129	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:newBufferCreated	I
      //   650: iconst_1
      //   651: isub
      //   652: putfield 129	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:newBufferCreated	I
      //   655: aload 4
      //   657: aload_0
      //   658: getfield 94	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:drawingBitmap	Landroid/graphics/Bitmap;
      //   661: aload_0
      //   662: getfield 274	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:drawingMatrix	Landroid/graphics/Matrix;
      //   665: aconst_null
      //   666: invokevirtual 440	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
      //   669: aload_0
      //   670: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   673: ifeq +89 -> 762
      //   676: aload 4
      //   678: ldc_w 442
      //   681: aload_0
      //   682: getfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   685: fconst_0
      //   686: fconst_0
      //   687: aload_0
      //   688: getfield 175	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPaint	Landroid/graphics/Paint;
      //   691: invokevirtual 446	android/graphics/Canvas:drawTextOnPath	(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
      //   694: aload 4
      //   696: new 325	java/lang/StringBuilder
      //   699: dup
      //   700: aload_0
      //   701: getfield 117	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:lastFPS	I
      //   704: invokestatic 452	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   707: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   710: ldc_w 454
      //   713: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   716: aload_0
      //   717: getfield 184	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugDecimalFormat	Ljava/text/DecimalFormat;
      //   720: ldc2_w 359
      //   723: aload_0
      //   724: getfield 113	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugCurrentFPS	D
      //   727: ddiv
      //   728: aload_0
      //   729: getfield 349	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:videoFR	D
      //   732: ddiv
      //   733: invokevirtual 458	java/text/DecimalFormat:format	(D)Ljava/lang/String;
      //   736: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   739: ldc_w 460
      //   742: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   745: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   748: aload_0
      //   749: getfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   752: fconst_0
      //   753: ldc 196
      //   755: aload_0
      //   756: getfield 175	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPaint	Landroid/graphics/Paint;
      //   759: invokevirtual 446	android/graphics/Canvas:drawTextOnPath	(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
      //   762: aload 15
      //   764: monitorexit
      //   765: goto -474 -> 291
      //   768: astore 16
      //   770: aload 15
      //   772: monitorexit
      //   773: aload 16
      //   775: athrow
      //   776: astore 5
      //   778: aload 4
      //   780: ifnull +11 -> 791
      //   783: aload_3
      //   784: aload 4
      //   786: invokeinterface 386 2 0
      //   791: aload 5
      //   793: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	794	0	this	VLWEngine
      //   9	25	1	f	float
      //   104	437	2	i	int
      //   210	574	3	localSurfaceHolder	SurfaceHolder
      //   212	573	4	localCanvas	android.graphics.Canvas
      //   776	16	5	localObject1	Object
      //   217	6	6	bool1	boolean
      //   230	6	7	j	int
      //   260	6	8	bool2	boolean
      //   407	112	10	l	long
      //   412	118	12	k	int
      //   420	6	13	bool3	boolean
      //   768	6	16	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   564	572	768	finally
      //   577	655	768	finally
      //   655	762	768	finally
      //   762	765	768	finally
      //   770	773	768	finally
      //   214	219	776	finally
      //   227	232	776	finally
      //   240	257	776	finally
      //   257	262	776	finally
      //   270	277	776	finally
      //   277	291	776	finally
      //   404	422	776	finally
      //   430	436	776	finally
      //   436	473	776	finally
      //   473	551	776	finally
      //   551	564	776	finally
      //   773	776	776	finally
    }
    
    /* Error */
    public void drawMessage(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 367	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:getSurfaceHolder	()Landroid/view/SurfaceHolder;
      //   4: astore_2
      //   5: aload_2
      //   6: invokeinterface 418 1 0
      //   11: astore_3
      //   12: aload_3
      //   13: ifnull +90 -> 103
      //   16: aload_0
      //   17: new 167	android/graphics/Path
      //   20: dup
      //   21: invokespecial 168	android/graphics/Path:<init>	()V
      //   24: putfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   27: aload_0
      //   28: getfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   31: fconst_0
      //   32: aload_0
      //   33: getfield 77	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:h	I
      //   36: iconst_1
      //   37: ishr
      //   38: i2f
      //   39: invokevirtual 188	android/graphics/Path:setLastPoint	(FF)V
      //   42: aload_0
      //   43: getfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   46: aload_0
      //   47: getfield 75	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:w	I
      //   50: i2f
      //   51: aload_0
      //   52: getfield 77	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:h	I
      //   55: iconst_1
      //   56: ishr
      //   57: i2f
      //   58: invokevirtual 191	android/graphics/Path:lineTo	(FF)V
      //   61: aload_3
      //   62: ldc_w 431
      //   65: invokevirtual 436	android/graphics/Canvas:drawColor	(I)V
      //   68: aload_1
      //   69: ldc_w 463
      //   72: invokevirtual 467	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
      //   75: astore 5
      //   77: iconst_0
      //   78: istore 6
      //   80: iload 6
      //   82: aload 5
      //   84: arraylength
      //   85: if_icmplt +41 -> 126
      //   88: aload_0
      //   89: getfield 133	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugOn	Z
      //   92: ifeq +11 -> 103
      //   95: ldc_w 323
      //   98: aload_1
      //   99: invokestatic 347	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
      //   102: pop
      //   103: aload_3
      //   104: ifnull +10 -> 114
      //   107: aload_2
      //   108: aload_3
      //   109: invokeinterface 386 2 0
      //   114: aload_0
      //   115: getfield 153	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:mHandler	Landroid/os/Handler;
      //   118: aload_0
      //   119: getfield 160	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:mDrawFrame	Ljava/lang/Runnable;
      //   122: invokevirtual 390	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
      //   125: return
      //   126: aload_3
      //   127: aload 5
      //   129: iload 6
      //   131: aaload
      //   132: aload_0
      //   133: getfield 170	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPath	Landroid/graphics/Path;
      //   136: fconst_0
      //   137: bipush 20
      //   139: iload 6
      //   141: aload 5
      //   143: arraylength
      //   144: iconst_2
      //   145: idiv
      //   146: isub
      //   147: imul
      //   148: i2f
      //   149: aload_0
      //   150: getfield 175	com/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine:debugPaint	Landroid/graphics/Paint;
      //   153: invokevirtual 446	android/graphics/Canvas:drawTextOnPath	(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
      //   156: iinc 6 1
      //   159: goto -79 -> 80
      //   162: astore 4
      //   164: aload_3
      //   165: ifnull +10 -> 175
      //   168: aload_2
      //   169: aload_3
      //   170: invokeinterface 386 2 0
      //   175: aload 4
      //   177: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	178	0	this	VLWEngine
      //   0	178	1	paramString	String
      //   4	165	2	localSurfaceHolder	SurfaceHolder
      //   11	159	3	localCanvas	android.graphics.Canvas
      //   162	14	4	localObject	Object
      //   75	67	5	arrayOfString	String[]
      //   78	79	6	i	int
      // Exception table:
      //   from	to	target	type
      //   16	77	162	finally
      //   80	103	162	finally
      //   126	156	162	finally
    }
    
    public Object nthFile(int paramInt, File paramFile)
    {
      File[] arrayOfFile1 = paramFile.listFiles(new FileFilter()
      {
        public boolean accept(File paramAnonymousFile)
        {
          if (!paramAnonymousFile.isFile()) {
            return false;
          }
          if (FilePicker.filter == null) {
            return true;
          }
          for (int i = 0;; i++)
          {
            if (i >= FilePicker.filter.length) {
              return false;
            }
            if (paramAnonymousFile.getName().toLowerCase().endsWith(FilePicker.filter[i])) {
              return true;
            }
          }
        }
      });
      if (arrayOfFile1 == null) {
        return new Integer(paramInt);
      }
      Arrays.sort(arrayOfFile1, new Comparator()
      {
        public int compare(File paramAnonymousFile1, File paramAnonymousFile2)
        {
          return paramAnonymousFile1.getName().compareTo(paramAnonymousFile2.getName());
        }
      });
      if (paramInt < arrayOfFile1.length)
      {
        if (this.debugOn) {
          Log.v("Video Live Wallpaper", "Next video: " + arrayOfFile1[paramInt].getAbsolutePath());
        }
        return arrayOfFile1[paramInt].getAbsolutePath();
      }
      int i = paramInt - arrayOfFile1.length;
      if (!this.recursiveDir) {
        return new Integer(i);
      }
      File[] arrayOfFile2 = paramFile.listFiles(new FileFilter()
      {
        public boolean accept(File paramAnonymousFile)
        {
          return paramAnonymousFile.isDirectory();
        }
      });
      Arrays.sort(arrayOfFile2, new Comparator()
      {
        public int compare(File paramAnonymousFile1, File paramAnonymousFile2)
        {
          return paramAnonymousFile1.getName().compareTo(paramAnonymousFile2.getName());
        }
      });
      for (int j = 0;; j++)
      {
        if (j >= arrayOfFile2.length) {
          return new Integer(i);
        }
        Object localObject = nthFile(i, arrayOfFile2[j]);
        if ((localObject instanceof String)) {
          return localObject;
        }
        i = ((Integer)localObject).intValue();
      }
    }
    
    public void onDestroy()
    {
      super.onDestroy();
      this.wt.pause(true);
      this.wt.stopRunning();
      try
      {
        this.wt.join();
        label26:
        this.mHandler.removeCallbacks(this.mDrawFrame);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label26;
      }
    }
    
    public void onOffsetsChanged(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
    {
      super.onOffsetsChanged(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt1, paramInt2);
      if ((isPreview()) || (this.keepCentered)) {}
      for (this.xOffset = 0.5F;; this.xOffset = paramFloat1)
      {
        if (this.xOffset < 0.0F) {
          this.xOffset = 0.0F;
        }
        if (this.xOffset > 1.0F) {
          this.xOffset = 1.0F;
        }
        return;
      }
    }
    
    public void onSurfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      super.onSurfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
      this.w = paramInt2;
      this.h = paramInt3;
      this.r = (this.w / paramInt3);
      createNewBuffer();
    }
    
    public void onSurfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      super.onSurfaceCreated(paramSurfaceHolder);
      createNewBuffer();
    }
    
    public void onSurfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      super.onSurfaceDestroyed(paramSurfaceHolder);
      this.wt.pause(true);
    }
    
    public void onVisibilityChanged(boolean paramBoolean)
    {
      this.visible = paramBoolean;
      WorkingThread localWorkingThread = this.wt;
      if (paramBoolean) {}
      for (boolean bool = false;; bool = true)
      {
        localWorkingThread.pause(bool);
        return;
      }
    }
    
    public int skipFrame()
    {
      if (!this.doNotSkip)
      {
        if (SimpleDecoder._getNextFrame() == 0)
        {
          if (SimpleDecoder.opened)
          {
            SimpleDecoder._close();
            SimpleDecoder.opened = false;
          }
          tryToOpen();
          SimpleDecoder._getNextFrame();
        }
        long l = SimpleDecoder._getDTS();
        int i = SimpleDecoder._getDuration();
        if (this.curDTS < 0L) {
          this.curDTS = l;
        }
        int j = i + (int)(l - this.curDTS);
        this.curDTS = (l + i);
        return j;
      }
      return 1;
    }
    
    public void tryToOpen()
    {
      int i = 0;
      if (!SimpleDecoder.opened)
      {
        if (SimpleDecoder.opened)
        {
          SimpleDecoder._close();
          SimpleDecoder.opened = false;
        }
        SimpleDecoder.forceShutdown = false;
        if (this.fileName != null) {
          break label72;
        }
        return;
        break label109;
      }
      label32:
      label72:
      File localFile;
      label109:
      int k;
      label172:
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              int j = i + 1;
              if (i >= 50) {
                break;
              }
              if (j == 2) {
                SimpleDecoder.forceShutdown = true;
              }
              try
              {
                Thread.sleep(100L);
                i = j;
              }
              catch (InterruptedException localInterruptedException)
              {
                i = j;
              }
            }
            break;
            localFile = new File(this.fileName);
            if ((!localFile.isFile()) || (!localFile.exists())) {
              break label172;
            }
            this.fileToOpen = this.fileName;
          } while (SimpleDecoder._open(this.fileToOpen) != 0);
          SimpleDecoder.opened = true;
          this.videoW = SimpleDecoder._getVideoWidth();
          this.videoH = SimpleDecoder._getVideoHeight();
          this.videoFR = SimpleDecoder._getVideoFrameRate();
          this.curDTS = -1L;
          this.videoR = (this.videoW / this.videoH);
          createNewBuffer();
          return;
        } while (!localFile.isDirectory());
        k = -1;
        if (this.fileNo >= 0) {
          break label290;
        }
        if (!this.randomFile) {
          break label529;
        }
        k = countFiles(0, localFile);
        if (this.debugOn) {
          Log.v("Video Live Wallpaper", "Video File count: " + k);
        }
      } while (k == 0);
      this.fileNo = this.rnd.nextInt(k);
      label256:
      if (this.debugOn) {
        Log.v("***********1", "New fileNo" + this.fileNo);
      }
      label290:
      label323:
      int n;
      for (int m = 10;; m = n)
      {
        Object localObject = nthFile(this.fileNo, localFile);
        if ((localObject instanceof String))
        {
          this.fileToOpen = ((String)localObject);
          if (this.fileToOpen == null)
          {
            if (this.debugOn) {
              Log.v("***********1", "File wasn't opened");
            }
            if (k < 0)
            {
              k = countFiles(0, localFile);
              if (this.debugOn) {
                Log.v("Video Live Wallpaper", "Video File count: " + k);
              }
            }
            if (k == 0) {
              break label32;
            }
          }
          if (!this.randomFile) {
            break label545;
          }
          if (k < 0)
          {
            k = countFiles(0, localFile);
            if (this.debugOn) {
              Log.v("Video Live Wallpaper", "Video File count: " + k);
            }
          }
          if (k == 0) {
            break label32;
          }
          this.fileNo = this.rnd.nextInt(k);
          if (this.debugOn) {
            Log.v("***********2", "New fileNo" + this.fileNo);
          }
        }
        label529:
        label545:
        label605:
        for (;;)
        {
          if (this.fileToOpen == null)
          {
            n = m - 1;
            if (m > 0) {}
          }
          else
          {
            if (this.fileToOpen != null) {
              break;
            }
            return;
            this.fileNo = 0;
            break label256;
            this.fileToOpen = null;
            break label323;
            if (this.fileToOpen == null) {}
            for (this.fileNo = 0;; this.fileNo = (1 + this.fileNo))
            {
              if (!this.debugOn) {
                break label605;
              }
              Log.v("***********3", "New fileNo" + this.fileNo);
              break;
            }
          }
        }
      }
    }
    
    class EndOfVideoException
      extends Exception
    {
      private static final long serialVersionUID = 1L;
      
      EndOfVideoException() {}
    }
    
    class WorkingThread
      extends Thread
    {
      public double curTime;
      boolean finished = false;
      Object lockingObject = new Object();
      public boolean paused = true;
      
      WorkingThread() {}
      
      public void pause(boolean paramBoolean)
      {
        if (VideoLiveWallpaper.VLWEngine.this.debugOn)
        {
          StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
          Log.v("Video Live Wallpaper", "Pause set to " + paramBoolean + " by " + arrayOfStackTraceElement[3].getMethodName() + "() [" + arrayOfStackTraceElement[3].getFileName() + ":" + arrayOfStackTraceElement[3].getLineNumber() + "]");
        }
        label231:
        do
        {
          synchronized (this.lockingObject)
          {
            this.paused = paramBoolean;
            if (paramBoolean) {
              break label231;
            }
            this.curTime = SystemClock.uptimeMillis();
            VideoLiveWallpaper.VLWEngine.this.fpsStart = SystemClock.uptimeMillis();
            VideoLiveWallpaper.VLWEngine.this.curDTS = -1L;
            if (!isAlive())
            {
              VideoLiveWallpaper.readPreferences = true;
              VideoLiveWallpaper.VLWEngine.this.wt = new WorkingThread(VideoLiveWallpaper.VLWEngine.this);
              VideoLiveWallpaper.VLWEngine.this.wt.pause(true);
              VideoLiveWallpaper.VLWEngine.this.wt.start();
              VideoLiveWallpaper.VLWEngine.this.wt.pause(false);
              return;
            }
          }
          if (VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode)
          {
            VideoLiveWallpaper.VLWEngine.this.mDrawFrame.run();
            return;
          }
          interrupt();
          return;
          if (VideoLiveWallpaper.VLWEngine.this.debugOn) {
            Log.v("Video Live Wallpaper", "Going to sleep...");
          }
        } while (!VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode);
        VideoLiveWallpaper.VLWEngine.this.mHandler.removeCallbacks(VideoLiveWallpaper.VLWEngine.this.mDrawFrame);
      }
      
      public void run()
      {
        for (;;)
        {
          boolean bool1;
          boolean bool2;
          String str1;
          int j;
          String str2;
          boolean bool3;
          synchronized (this.lockingObject)
          {
            if ((this.finished) || (SimpleDecoder.forceShutdown))
            {
              if (SimpleDecoder.opened)
              {
                SimpleDecoder._close();
                SimpleDecoder.opened = false;
              }
              return;
            }
            bool1 = this.paused;
            if (VideoLiveWallpaper.readPreferences)
            {
              VideoLiveWallpaper.readPreferences = false;
              SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(VideoLiveWallpaper.this.getApplicationContext());
              VideoLiveWallpaper.VLWEngine.this.wantedDelayedRunnableMode = localSharedPreferences.getString("playing_mode", "dr").equals("dr");
              VideoLiveWallpaper.VLWEngine.this.debugOn = localSharedPreferences.getBoolean("debug_mode", false);
              VideoLiveWallpaper.VLWEngine.this.doNotSkip = localSharedPreferences.getBoolean("do_not_skip", false);
              VideoLiveWallpaper.VLWEngine localVLWEngine = VideoLiveWallpaper.VLWEngine.this;
              if (!localSharedPreferences.getBoolean("shift_video", true)) {
                break label574;
              }
              bool2 = false;
              localVLWEngine.keepCentered = bool2;
              VideoLiveWallpaper.VLWEngine.this.swipingLag = Integer.parseInt(localSharedPreferences.getString("swiping_lag", "v4").substring(1));
              VideoLiveWallpaper.VLWEngine.this.recursiveDir = localSharedPreferences.getBoolean("recursive_dir", true);
              VideoLiveWallpaper.VLWEngine.this.randomFile = localSharedPreferences.getBoolean("random_file_mode", true);
              str1 = localSharedPreferences.getString("zooming_mode", "cl");
              if (!str1.equals("lb")) {
                break label580;
              }
              j = 1;
              str2 = localSharedPreferences.getString("video", null);
              if ((j != VideoLiveWallpaper.VLWEngine.this.renderingMode) || ((str2 != null) && (!str2.equals(VideoLiveWallpaper.VLWEngine.this.fileName))))
              {
                VideoLiveWallpaper.VLWEngine.this.renderingMode = j;
                VideoLiveWallpaper.VLWEngine.this.fileName = str2;
                bool3 = this.paused;
                if (!bool3) {
                  pause(true);
                }
                if (SimpleDecoder.opened)
                {
                  SimpleDecoder.opened = false;
                  VideoLiveWallpaper.VLWEngine.this.drawMessage("Loading a new video...");
                }
              }
            }
          }
          try
          {
            Thread.sleep(500L);
            label344:
            SimpleDecoder._close();
            VideoLiveWallpaper.VLWEngine.this.tryToOpen();
            if (!bool3) {
              pause(false);
            }
            if (VideoLiveWallpaper.VLWEngine.this.debugOn) {
              Log.v("Video Live Wallpaper", "Read settings: " + VideoLiveWallpaper.VLWEngine.this.wantedDelayedRunnableMode + " " + VideoLiveWallpaper.VLWEngine.this.debugOn + " " + VideoLiveWallpaper.VLWEngine.this.doNotSkip + " " + VideoLiveWallpaper.VLWEngine.this.keepCentered + " " + VideoLiveWallpaper.VLWEngine.this.swipingLag + " " + VideoLiveWallpaper.VLWEngine.this.recursiveDir + " " + VideoLiveWallpaper.VLWEngine.this.randomFile + " " + VideoLiveWallpaper.VLWEngine.this.renderingMode + " " + str2);
            }
            if (!SimpleDecoder.opened)
            {
              VideoLiveWallpaper.VLWEngine.this.tryToOpen();
              if (SimpleDecoder.opened) {
                continue;
              }
              try
              {
                VideoLiveWallpaper.VLWEngine.this.drawMessage("No video found or available.\nYou might want to provide some settings\nor unmount the SD card /\nturn off USB storage.");
                Thread.sleep(1000L);
              }
              catch (InterruptedException localInterruptedException3) {}
              continue;
              localObject2 = finally;
              throw localObject2;
              label574:
              bool2 = true;
              continue;
              label580:
              if (str1.equals("st"))
              {
                j = 2;
                continue;
              }
              j = 0;
              continue;
            }
            if ((bool1) || (VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode))
            {
              try
              {
                if (VideoLiveWallpaper.VLWEngine.this.debugOn) {
                  Log.v("Video Live Wallpaper", "Sleeping...");
                }
                Thread.sleep(1000L);
              }
              catch (InterruptedException localInterruptedException1) {}
              continue;
            }
            if ((VideoLiveWallpaper.VLWEngine.this.wantedDelayedRunnableMode) && (!VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode))
            {
              VideoLiveWallpaper.VLWEngine.this.delayedRunnableMode = true;
              if (VideoLiveWallpaper.VLWEngine.this.wt.paused) {
                continue;
              }
              VideoLiveWallpaper.VLWEngine.this.wt.pause(false);
              continue;
            }
            if (VideoLiveWallpaper.VLWEngine.this.debugOn) {
              Log.v("Video Live Wallpaper", "Updating from thread...");
            }
            int i = VideoLiveWallpaper.VLWEngine.this.drawFrame();
            this.curTime += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
            double d = this.curTime - SystemClock.uptimeMillis();
            if (d < i * -5 * VideoLiveWallpaper.VLWEngine.this.videoFR)
            {
              this.curTime = (SystemClock.uptimeMillis() + VideoLiveWallpaper.VLWEngine.this.videoFR);
              d = 0.0D;
            }
            for (;;)
            {
              if (d > 0.0D) {
                break label882;
              }
              Thread.yield();
              break;
              do
              {
                i = VideoLiveWallpaper.VLWEngine.this.skipFrame();
                this.curTime += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
                d += i * VideoLiveWallpaper.VLWEngine.this.videoFR;
              } while (d < -i * VideoLiveWallpaper.VLWEngine.this.videoFR);
            }
            label882:
            long l = (int)(0.5D * d);
            try
            {
              Thread.sleep(l);
            }
            catch (InterruptedException localInterruptedException2) {}
          }
          catch (InterruptedException localInterruptedException4)
          {
            break label344;
          }
        }
      }
      
      public void stopRunning()
      {
        synchronized (this.lockingObject)
        {
          this.finished = true;
          return;
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.ccpcreations.android.VLW.VideoLiveWallpaper
 * JD-Core Version:    0.7.0.1
 */