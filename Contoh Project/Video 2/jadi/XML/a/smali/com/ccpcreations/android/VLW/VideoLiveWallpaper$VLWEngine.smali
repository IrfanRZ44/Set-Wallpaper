.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;
.super Landroid/service/wallpaper/WallpaperService$Engine;
.source "VideoLiveWallpaper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "VLWEngine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$EndOfVideoException;,
        Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;
    }
.end annotation


# instance fields
.field bufferLockingObject:Ljava/lang/Object;

.field byteBuffer:Ljava/nio/ByteBuffer;

.field curDTS:J

.field debugCurrentFPS:D

.field debugDecimalFormat:Ljava/text/DecimalFormat;

.field debugOn:Z

.field debugPaint:Landroid/graphics/Paint;

.field debugPath:Landroid/graphics/Path;

.field delayedRunnableMode:Z

.field doNotSkip:Z

.field drawingBitmap:Landroid/graphics/Bitmap;

.field drawingMatrix:Landroid/graphics/Matrix;

.field fileName:Ljava/lang/String;

.field fileNo:I

.field fileToOpen:Ljava/lang/String;

.field finalXOffset:F

.field fpsStart:J

.field frameCount:I

.field h:I

.field keepCentered:Z

.field lastFPS:I

.field private final mDrawFrame:Ljava/lang/Runnable;

.field final mHandler:Landroid/os/Handler;

.field newBufferCreated:I

.field r:F

.field randomFile:Z

.field recursiveDir:Z

.field renderingMode:I

.field rnd:Ljava/util/Random;

.field srcH:I

.field srcW:I

.field srcX:I

.field srcY:I

.field swipingLag:F

.field final synthetic this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;

.field videoFR:D

.field videoH:I

.field videoR:D

.field videoW:I

.field visible:Z

.field w:I

.field wantedDelayedRunnableMode:Z

.field wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

.field xOffset:F


# direct methods
.method public constructor <init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;)V
    .locals 6
    .parameter

    .prologue
    const/high16 v1, 0x3f00

    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 155
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;

    .line 139
    invoke-direct {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;-><init>(Landroid/service/wallpaper/WallpaperService;)V

    .line 67
    iput v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    iput v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    .line 68
    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    .line 69
    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    .line 72
    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    .line 73
    iput-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 75
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->bufferLockingObject:Ljava/lang/Object;

    .line 78
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fpsStart:J

    .line 82
    const-wide/high16 v0, -0x4010

    iput-wide v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    .line 83
    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->lastFPS:I

    .line 84
    iput-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    .line 85
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 86
    iput v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    .line 87
    iput-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    .line 89
    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    .line 91
    iput-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wantedDelayedRunnableMode:Z

    .line 92
    iput-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    .line 93
    iput-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->doNotSkip:Z

    .line 94
    iput-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->keepCentered:Z

    .line 95
    const/high16 v0, 0x40a0

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->swipingLag:F

    .line 96
    iput-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    .line 97
    iput-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->recursiveDir:Z

    .line 98
    iput-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->randomFile:Z

    .line 99
    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    .line 101
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    .line 102
    new-instance v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;

    invoke-direct {v0, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mDrawFrame:Ljava/lang/Runnable;

    .line 140
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->rnd:Ljava/util/Random;

    .line 141
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    .line 142
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    .line 143
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#.###"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugDecimalFormat:Ljava/text/DecimalFormat;

    .line 144
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v1, 0x0

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->setLastPoint(FF)V

    .line 145
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v1, v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 146
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 147
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x41a0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 148
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 149
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->tryToOpen()V

    .line 150
    new-instance v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-direct {v0, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    .line 151
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v0, v4}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 152
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->start()V

    .line 153
    sput-boolean v4, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    return-void
.end method

.method static synthetic access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Ljava/lang/Runnable;
    .locals 1
    .parameter

    .prologue
    .line 102
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mDrawFrame:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$1(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;
    .locals 1
    .parameter

    .prologue
    .line 64
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;

    return-object v0
.end method

.method private createNewBuffer()V
    .locals 8

    .prologue
    .line 338
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->bufferLockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 339
    :try_start_0
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    if-gtz v1, :cond_0

    monitor-exit v0

    .line 397
    :goto_0
    return-void

    .line 340
    :cond_0
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    .line 341
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v2, 0x0

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->setLastPoint(FF)V

    .line 342
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v2, v2

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 343
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    if-gez v1, :cond_5

    .line 344
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    if-eq v1, v2, :cond_3

    .line 345
    :cond_1
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    .line 346
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 347
    :cond_2
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 348
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    mul-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 351
    :cond_3
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    .line 352
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    .line 353
    const/4 v1, 0x0

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    .line 387
    :cond_4
    :goto_1
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingMatrix:Landroid/graphics/Matrix;

    .line 388
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_b

    .line 390
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingMatrix:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    int-to-float v5, v5

    iget v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    int-to-float v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v3, Landroid/graphics/RectF;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v6, v6

    iget v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    int-to-float v7, v7

    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v4, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 395
    :goto_2
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    .line 338
    monitor-exit v0

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 355
    :cond_5
    :try_start_1
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    if-nez v1, :cond_a

    .line 357
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoR:D

    cmpg-double v1, v1, v3

    if-gez v1, :cond_8

    .line 359
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    .line 360
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    int-to-float v1, v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    .line 376
    :goto_3
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fixViewingWindow()V

    .line 377
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    if-eq v1, v2, :cond_4

    .line 378
    :cond_6
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_7

    .line 379
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 380
    :cond_7
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 381
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    mul-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->byteBuffer:Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    .line 361
    :cond_8
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoR:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_9

    .line 363
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    .line 364
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    goto :goto_3

    .line 367
    :cond_9
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    .line 368
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    int-to-float v1, v1

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    div-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    goto :goto_3

    .line 372
    :cond_a
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    .line 373
    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    .line 374
    const/4 v1, 0x0

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    goto :goto_3

    .line 393
    :cond_b
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingMatrix:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    int-to-float v5, v5

    iget v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    int-to-float v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v3, Landroid/graphics/RectF;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v6, v6

    iget v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    int-to-float v7, v7

    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v4, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2
.end method

.method private fixViewingWindow()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 400
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    if-nez v0, :cond_0

    .line 401
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    float-to-double v0, v0

    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoR:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 403
    iput v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    .line 404
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    .line 415
    :cond_0
    :goto_0
    return-void

    .line 405
    :cond_1
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    float-to-double v0, v0

    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoR:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    .line 407
    iput v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    iput v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    goto :goto_0

    .line 410
    :cond_2
    iput v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    .line 411
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    iget v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    goto :goto_0
.end method


# virtual methods
.method public countFiles(ILjava/io/File;)I
    .locals 4
    .parameter "n"
    .parameter "curDir"

    .prologue
    .line 158
    new-instance v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$2;

    invoke-direct {v3, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$2;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    invoke-virtual {p2, v3}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    .line 172
    .local v0, files:[Ljava/io/File;
    if-nez v0, :cond_0

    move v2, p1

    .line 181
    .end local p1
    .local v2, n:I
    :goto_0
    return v2

    .line 174
    .end local v2           #n:I
    .restart local p1
    :cond_0
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    array-length v3, v0

    if-lt v1, v3, :cond_1

    move v2, p1

    .line 181
    .end local p1
    .restart local v2       #n:I
    goto :goto_0

    .line 175
    .end local v2           #n:I
    .restart local p1
    :cond_1
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 176
    add-int/lit8 p1, p1, 0x1

    .line 174
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 177
    :cond_3
    iget-boolean v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->recursiveDir:Z

    if-eqz v3, :cond_2

    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 178
    aget-object v3, v0, v1

    invoke-virtual {p0, p1, v3}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->countFiles(ILjava/io/File;)I

    move-result p1

    goto :goto_2
.end method

.method public drawFrame()I
    .locals 13

    .prologue
    .line 523
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    sub-float v11, v2, v3

    .line 524
    .local v11, xOffsetDelta:F
    float-to-double v2, v11

    const-wide v4, 0x3f50624dd2f1a9fcL

    cmpl-double v2, v2, v4

    if-gtz v2, :cond_0

    float-to-double v2, v11

    const-wide v4, -0x40af9db22d0e5604L

    cmpg-double v2, v2, v4

    if-gez v2, :cond_7

    .line 525
    :cond_0
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->swipingLag:F

    div-float v3, v11, v3

    add-float/2addr v2, v3

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    .line 526
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fixViewingWindow()V

    .line 527
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_1

    .line 528
    const-string v2, "Video Live Wallpaper"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "New xOffset: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "->"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 535
    :cond_1
    :goto_0
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-nez v2, :cond_8

    const/4 v2, 0x0

    move v10, v2

    .line 537
    .local v10, result:I
    :goto_1
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_2

    .line 538
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    .line 539
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fpsStart:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    .line 540
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fpsStart:J

    const-wide/16 v4, 0x3e8

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fpsStart:J

    .line 541
    const-string v2, "Video Live Wallpaper"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FPS: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", required FPS: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-wide v4, 0x408f400000000000L

    iget-wide v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    div-double/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->lastFPS:I

    .line 543
    const/4 v2, 0x0

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->frameCount:I

    .line 547
    :cond_2
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v9

    .line 548
    .local v9, holder:Landroid/view/SurfaceHolder;
    const/4 v0, 0x0

    .line 551
    .local v0, c:Landroid/graphics/Canvas;
    :try_start_0
    sget-boolean v2, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v2, :cond_5

    .line 553
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getNextFrame()I

    move-result v2

    if-nez v2, :cond_9

    .line 555
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_3

    .line 556
    const-string v2, "Video Live Wallpaper"

    const-string v3, "Reopenning a video file..."

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 558
    :cond_3
    sget-boolean v2, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v2, :cond_4

    .line 559
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_close()V

    .line 560
    const/4 v2, 0x0

    sput-boolean v2, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 562
    :cond_4
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->tryToOpen()V

    .line 563
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    add-int/lit8 v2, v2, 0x4

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 616
    .end local v11           #xOffsetDelta:F
    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 617
    invoke-interface {v9, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 620
    :cond_6
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mDrawFrame:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 621
    return v10

    .line 529
    .end local v0           #c:Landroid/graphics/Canvas;
    .end local v9           #holder:Landroid/view/SurfaceHolder;
    .end local v10           #result:I
    .restart local v11       #xOffsetDelta:F
    :cond_7
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1

    .line 530
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    .line 531
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fixViewingWindow()V

    .line 532
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_1

    .line 533
    const-string v2, "Video Live Wallpaper"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "New xOffset: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->finalXOffset:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "->"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 535
    :cond_8
    const-wide/high16 v2, 0x4044

    iget-wide v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    div-double/2addr v2, v4

    double-to-int v2, v2

    move v10, v2

    goto/16 :goto_1

    .line 571
    .restart local v0       #c:Landroid/graphics/Canvas;
    .restart local v9       #holder:Landroid/view/SurfaceHolder;
    .restart local v10       #result:I
    :cond_9
    :try_start_1
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getDTS()J

    move-result-wide v6

    .line 572
    .local v6, dts:J
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getDuration()I

    move-result v8

    .line 573
    .local v8, dur:I
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_a

    iput-wide v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 574
    :cond_a
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    sub-long v2, v6, v2

    long-to-int v2, v2

    add-int v10, v2, v8

    .line 575
    int-to-long v2, v8

    add-long/2addr v2, v6

    iput-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 576
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    const-wide/16 v4, 0x0

    cmpg-double v2, v2, v4

    if-gez v2, :cond_b

    int-to-double v2, v10

    iput-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    .line 577
    :cond_b
    iget-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    const-wide/high16 v4, 0x4000

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4008

    div-double/2addr v2, v4

    int-to-double v4, v10

    const-wide/high16 v11, 0x3ff0

    mul-double/2addr v4, v11

    const-wide/high16 v11, 0x4008

    div-double/2addr v4, v11

    add-double/2addr v2, v4

    iput-wide v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    .line 579
    .end local v11           #xOffsetDelta:F
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_c

    .line 580
    const-string v2, "Video Live Wallpaper"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DTS: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", duration: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", required slice count: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 582
    :cond_c
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_convertFrameData()I

    .line 584
    iget-object v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->bufferLockingObject:Ljava/lang/Object;

    .end local v6           #dts:J
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 585
    :try_start_2
    invoke-interface {v9}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    .line 586
    if-eqz v0, :cond_e

    .line 587
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->byteBuffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    iget v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    iget v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcX:I

    iget v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcW:I

    add-int/2addr v5, v7

    iget v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcY:I

    iget v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->srcH:I

    .end local v8           #dur:I
    add-int/2addr v7, v8

    invoke-static {v2, v3, v4, v5, v7}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getDirectFrameData(Ljava/lang/Object;IIII)V

    .line 588
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->byteBuffer:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 589
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 590
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    if-lez v2, :cond_d

    .line 591
    const/high16 v2, -0x100

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 592
    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->newBufferCreated:I

    .line 594
    :cond_d
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingBitmap:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawingMatrix:Landroid/graphics/Matrix;

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 599
    iget-boolean v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v2, :cond_e

    .line 600
    const-string v1, "Debug mode active"

    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 601
    new-instance v2, Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->lastFPS:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugDecimalFormat:Ljava/text/DecimalFormat;

    const-wide v4, 0x408f400000000000L

    iget-wide v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugCurrentFPS:D

    div-double/2addr v4, v7

    iget-wide v7, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    div-double/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " FPS"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 602
    .local v1, s:Ljava/lang/String;
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v3, 0x0

    const/high16 v4, 0x41a0

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 584
    .end local v1           #s:Ljava/lang/String;
    :cond_e
    monitor-exit v6

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 615
    :catchall_1
    move-exception v2

    .line 616
    if-eqz v0, :cond_f

    .line 617
    invoke-interface {v9, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 618
    :cond_f
    throw v2
.end method

.method public drawMessage(Ljava/lang/String;)V
    .locals 9
    .parameter "message"

    .prologue
    .line 494
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v6

    .line 495
    .local v6, holder:Landroid/view/SurfaceHolder;
    const/4 v0, 0x0

    .line 496
    .local v0, c:Landroid/graphics/Canvas;
    invoke-interface {v6}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    .line 498
    if-eqz v0, :cond_0

    .line 499
    :try_start_0
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    .line 500
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v2, 0x0

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->setLastPoint(FF)V

    .line 501
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v2, v2

    iget v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 502
    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 503
    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 504
    .local v8, split:[Ljava/lang/String;
    const/4 v7, 0x0

    .local v7, i:I
    :goto_0
    array-length v1, v8

    if-lt v7, v1, :cond_2

    .line 506
    iget-boolean v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v1, :cond_0

    .line 507
    const-string v1, "Video Live Wallpaper"

    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 511
    .end local v7           #i:I
    .end local v8           #split:[Ljava/lang/String;
    :cond_0
    if-eqz v0, :cond_1

    .line 512
    invoke-interface {v6, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 515
    :cond_1
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mDrawFrame:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 516
    return-void

    .line 505
    .restart local v7       #i:I
    .restart local v8       #split:[Ljava/lang/String;
    :cond_2
    :try_start_1
    aget-object v1, v8, v7

    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPath:Landroid/graphics/Path;

    const/4 v3, 0x0

    array-length v4, v8

    div-int/lit8 v4, v4, 0x2

    sub-int v4, v7, v4

    mul-int/lit8 v4, v4, 0x14

    int-to-float v4, v4

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugPaint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 504
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 510
    .end local v7           #i:I
    .end local v8           #split:[Ljava/lang/String;
    :catchall_0
    move-exception v1

    .line 511
    if-eqz v0, :cond_3

    .line 512
    invoke-interface {v6, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 513
    :cond_3
    throw v1
.end method

.method public nthFile(ILjava/io/File;)Ljava/lang/Object;
    .locals 7
    .parameter "n"
    .parameter "curDir"

    .prologue
    .line 185
    new-instance v4, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$3;

    invoke-direct {v4, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$3;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    invoke-virtual {p2, v4}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    .line 199
    .local v0, files:[Ljava/io/File;
    if-nez v0, :cond_0

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 239
    :goto_0
    return-object v4

    .line 201
    :cond_0
    new-instance v4, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$4;

    invoke-direct {v4, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$4;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    invoke-static {v0, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 208
    array-length v4, v0

    if-ge p1, v4, :cond_2

    .line 209
    iget-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v4, :cond_1

    .line 210
    const-string v4, "Video Live Wallpaper"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Next video: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v0, p1

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    :cond_1
    aget-object v4, v0, p1

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 214
    :cond_2
    array-length v2, v0

    .line 215
    .local v2, noFiles:I
    sub-int/2addr p1, v2

    .line 216
    iget-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->recursiveDir:Z

    if-nez v4, :cond_3

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_0

    .line 218
    :cond_3
    new-instance v4, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$5;

    invoke-direct {v4, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$5;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    invoke-virtual {p2, v4}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    .line 224
    new-instance v4, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$6;

    invoke-direct {v4, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$6;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    invoke-static {v0, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 231
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    array-length v4, v0

    if-lt v1, v4, :cond_4

    .line 239
    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_0

    .line 232
    :cond_4
    aget-object v4, v0, v1

    invoke-virtual {p0, p1, v4}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->nthFile(ILjava/io/File;)Ljava/lang/Object;

    move-result-object v3

    .line 233
    .local v3, recursive:Ljava/lang/Object;
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_5

    move-object v4, v3

    .line 234
    goto :goto_0

    .line 236
    :cond_5
    check-cast v3, Ljava/lang/Integer;

    .end local v3           #recursive:Ljava/lang/Object;
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 231
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 419
    invoke-super {p0}, Landroid/service/wallpaper/WallpaperService$Engine;->onDestroy()V

    .line 420
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 421
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->stopRunning()V

    .line 423
    :try_start_0
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 426
    :goto_0
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mDrawFrame:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 427
    return-void

    .line 424
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onOffsetsChanged(FFFFII)V
    .locals 3
    .parameter "xOffset"
    .parameter "yOffset"
    .parameter "xOffsetStep"
    .parameter "yOffsetStep"
    .parameter "xPixelOffset"
    .parameter "yPixelOffset"

    .prologue
    const/high16 v2, 0x3f80

    const/4 v1, 0x0

    .line 459
    invoke-super/range {p0 .. p6}, Landroid/service/wallpaper/WallpaperService$Engine;->onOffsetsChanged(FFFFII)V

    .line 462
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->isPreview()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->keepCentered:Z

    if-eqz v0, :cond_3

    .line 463
    :cond_0
    const/high16 v0, 0x3f00

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    .line 467
    :goto_0
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iput v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    .line 468
    :cond_1
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    iput v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    .line 469
    :cond_2
    return-void

    .line 465
    :cond_3
    iput p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->xOffset:F

    goto :goto_0
.end method

.method public onSurfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 2
    .parameter "holder"
    .parameter "format"
    .parameter "width"
    .parameter "height"

    .prologue
    .line 437
    invoke-super {p0, p1, p2, p3, p4}, Landroid/service/wallpaper/WallpaperService$Engine;->onSurfaceChanged(Landroid/view/SurfaceHolder;III)V

    .line 438
    iput p3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    .line 439
    iput p4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->h:I

    .line 440
    iget v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->w:I

    int-to-float v0, v0

    int-to-float v1, p4

    div-float/2addr v0, v1

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->r:F

    .line 442
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->createNewBuffer()V

    .line 443
    return-void
.end method

.method public onSurfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0
    .parameter "holder"

    .prologue
    .line 453
    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onSurfaceCreated(Landroid/view/SurfaceHolder;)V

    .line 454
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->createNewBuffer()V

    .line 455
    return-void
.end method

.method public onSurfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2
    .parameter "holder"

    .prologue
    .line 447
    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onSurfaceDestroyed(Landroid/view/SurfaceHolder;)V

    .line 448
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 449
    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 2
    .parameter "visible"

    .prologue
    .line 431
    iput-boolean p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->visible:Z

    .line 432
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 433
    return-void

    .line 432
    :cond_0
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public skipFrame()I
    .locals 8

    .prologue
    .line 472
    iget-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->doNotSkip:Z

    if-nez v4, :cond_3

    .line 473
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getNextFrame()I

    move-result v4

    if-nez v4, :cond_1

    .line 474
    sget-boolean v4, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v4, :cond_0

    .line 475
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_close()V

    .line 476
    const/4 v4, 0x0

    sput-boolean v4, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 478
    :cond_0
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->tryToOpen()V

    .line 479
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getNextFrame()I

    .line 482
    :cond_1
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getDTS()J

    move-result-wide v0

    .line 483
    .local v0, dts:J
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getDuration()I

    move-result v2

    .line 484
    .local v2, dur:I
    iget-wide v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-gez v4, :cond_2

    iput-wide v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 485
    :cond_2
    iget-wide v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    sub-long v4, v0, v4

    long-to-int v4, v4

    add-int v3, v4, v2

    .line 486
    .local v3, result:I
    int-to-long v4, v2

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    move v4, v3

    .line 489
    .end local v0           #dts:J
    .end local v2           #dur:I
    .end local v3           #result:I
    :goto_0
    return v4

    :cond_3
    const/4 v4, 0x1

    goto :goto_0
.end method

.method public tryToOpen()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 243
    const/4 v6, 0x0

    .line 244
    .local v6, tries:I
    :goto_0
    sget-boolean v8, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-nez v8, :cond_2

    .line 253
    :goto_1
    sget-boolean v8, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v8, :cond_0

    .line 254
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_close()V

    .line 255
    sput-boolean v11, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 257
    :cond_0
    sput-boolean v11, Lcom/ccpcreations/android/VLW/SimpleDecoder;->forceShutdown:Z

    .line 258
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    if-nez v8, :cond_5

    .line 335
    :cond_1
    :goto_2
    return-void

    .line 245
    :cond_2
    add-int/lit8 v7, v6, 0x1

    .end local v6           #tries:I
    .local v7, tries:I
    const/16 v8, 0x32

    if-lt v6, v8, :cond_3

    move v6, v7

    .end local v7           #tries:I
    .restart local v6       #tries:I
    goto :goto_1

    .line 246
    .end local v6           #tries:I
    .restart local v7       #tries:I
    :cond_3
    const/4 v8, 0x2

    if-ne v7, v8, :cond_4

    .line 247
    sput-boolean v12, Lcom/ccpcreations/android/VLW/SimpleDecoder;->forceShutdown:Z

    .line 249
    :cond_4
    const-wide/16 v8, 0x64

    :try_start_0
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move v6, v7

    .end local v7           #tries:I
    .restart local v6       #tries:I
    goto :goto_0

    .line 250
    .end local v6           #tries:I
    .restart local v7       #tries:I
    :catch_0
    move-exception v8

    move v6, v7

    .end local v7           #tries:I
    .restart local v6       #tries:I
    goto :goto_0

    .line 259
    :cond_5
    new-instance v0, Ljava/io/File;

    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 260
    .local v0, f:Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 261
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    iput-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    .line 319
    :cond_6
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    invoke-static {v8}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_open(Ljava/lang/String;)I

    move-result v2

    .line 325
    .local v2, r:I
    if-nez v2, :cond_1

    .line 327
    sput-boolean v12, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 328
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getVideoWidth()I

    move-result v8

    iput v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    .line 329
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getVideoHeight()I

    move-result v8

    iput v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    .line 330
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_getVideoFrameRate()D

    move-result-wide v8

    iput-wide v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    .line 331
    const-wide/16 v8, -0x1

    iput-wide v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 333
    iget v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoW:I

    int-to-float v8, v8

    iget v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoH:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    float-to-double v8, v8

    iput-wide v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoR:D

    .line 334
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->createNewBuffer()V

    goto :goto_2

    .line 262
    .end local v2           #r:I
    :cond_7
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 263
    const/4 v1, -0x1

    .line 264
    .local v1, no:I
    iget v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    if-gez v8, :cond_9

    .line 265
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->randomFile:Z

    if-eqz v8, :cond_10

    .line 266
    invoke-virtual {p0, v11, v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->countFiles(ILjava/io/File;)I

    move-result v1

    .line 267
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_8

    .line 268
    const-string v8, "Video Live Wallpaper"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Video File count: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    :cond_8
    if-eqz v1, :cond_1

    .line 270
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->rnd:Ljava/util/Random;

    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    iput v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    .line 274
    :goto_3
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_9

    .line 275
    const-string v8, "***********1"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "New fileNo"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v10, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 277
    :cond_9
    const/16 v4, 0xa

    .line 279
    .local v4, t:I
    :goto_4
    iget v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    invoke-virtual {p0, v8, v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->nthFile(ILjava/io/File;)Ljava/lang/Object;

    move-result-object v3

    .line 280
    .local v3, ret:Ljava/lang/Object;
    instance-of v8, v3, Ljava/lang/String;

    if-eqz v8, :cond_11

    .line 281
    check-cast v3, Ljava/lang/String;

    .end local v3           #ret:Ljava/lang/Object;
    iput-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    .line 284
    :goto_5
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    if-nez v8, :cond_c

    .line 285
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_a

    .line 286
    const-string v8, "***********1"

    const-string v9, "File wasn\'t opened"

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    :cond_a
    if-gez v1, :cond_b

    .line 288
    invoke-virtual {p0, v11, v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->countFiles(ILjava/io/File;)I

    move-result v1

    .line 289
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_b

    .line 290
    const-string v8, "Video Live Wallpaper"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Video File count: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    :cond_b
    if-eqz v1, :cond_1

    .line 294
    :cond_c
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->randomFile:Z

    if-eqz v8, :cond_12

    .line 295
    if-gez v1, :cond_d

    .line 296
    invoke-virtual {p0, v11, v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->countFiles(ILjava/io/File;)I

    move-result v1

    .line 297
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_d

    .line 298
    const-string v8, "Video Live Wallpaper"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Video File count: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    :cond_d
    if-eqz v1, :cond_1

    .line 301
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->rnd:Ljava/util/Random;

    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    iput v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    .line 302
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_e

    .line 303
    const-string v8, "***********2"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "New fileNo"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v10, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    :cond_e
    :goto_6
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    if-nez v8, :cond_f

    add-int/lit8 v5, v4, -0x1

    .end local v4           #t:I
    .local v5, t:I
    if-gtz v4, :cond_14

    move v4, v5

    .line 313
    .end local v5           #t:I
    .restart local v4       #t:I
    :cond_f
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    if-nez v8, :cond_6

    goto/16 :goto_2

    .line 272
    .end local v4           #t:I
    :cond_10
    iput v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    goto/16 :goto_3

    .line 283
    .restart local v3       #ret:Ljava/lang/Object;
    .restart local v4       #t:I
    :cond_11
    const/4 v8, 0x0

    iput-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    goto/16 :goto_5

    .line 305
    .end local v3           #ret:Ljava/lang/Object;
    :cond_12
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileToOpen:Ljava/lang/String;

    if-nez v8, :cond_13

    .line 306
    iput v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    .line 309
    :goto_7
    iget-boolean v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v8, :cond_e

    .line 310
    const-string v8, "***********3"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "New fileNo"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v10, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 308
    :cond_13
    iget v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    add-int/lit8 v8, v8, 0x1

    iput v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileNo:I

    goto :goto_7

    .end local v4           #t:I
    .restart local v5       #t:I
    :cond_14
    move v4, v5

    .end local v5           #t:I
    .restart local v4       #t:I
    goto/16 :goto_4
.end method
